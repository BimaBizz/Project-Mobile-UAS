package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.zaj;
import com.google.android.gms.common.internal.zak;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zae;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaaz extends GoogleApiClient implements zabt {
    @VisibleForTesting
    final Queue<BaseImplementation.ApiMethodImpl<?, ?>> zaa;
    @Nullable
    @VisibleForTesting
    zabr zab;
    final Map<Api.AnyClientKey<?>, Api.Client> zac;
    Set<Scope> zad;
    final ClientSettings zae;
    final Map<Api<?>, Boolean> zaf;
    final Api.AbstractClientBuilder<? extends zae, SignInOptions> zag;
    @Nullable
    Set<zacv> zah;
    final zacx zai;
    private final Lock zaj;
    private final zak zak;
    @Nullable
    private zabu zal = null;
    private final int zam;
    /* access modifiers changed from: private */
    public final Context zan;
    private final Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final zaax zas;
    private final GoogleApiAvailability zat;
    private final ListenerHolders zau;
    private final ArrayList<zas> zav;
    private Integer zaw;
    private final zaj zax;

    public zaaz(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder<? extends zae, SignInOptions> abstractClientBuilder, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<Api.AnyClientKey<?>, Api.Client> map2, int i, int i2, ArrayList<zas> arrayList) {
        Queue<BaseImplementation.ApiMethodImpl<?, ?>> queue;
        long j;
        Set<Scope> set;
        ListenerHolders listenerHolders;
        zaj zaj2;
        zak zak2;
        zaax zaax;
        zacx zacx;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        ClientSettings clientSettings2 = clientSettings;
        GoogleApiAvailability googleApiAvailability2 = googleApiAvailability;
        Api.AbstractClientBuilder<? extends zae, SignInOptions> abstractClientBuilder2 = abstractClientBuilder;
        Map<Api<?>, Boolean> map3 = map;
        List<GoogleApiClient.ConnectionCallbacks> list3 = list;
        List<GoogleApiClient.OnConnectionFailedListener> list4 = list2;
        Map<Api.AnyClientKey<?>, Api.Client> map4 = map2;
        int i3 = i;
        int i4 = i2;
        ArrayList<zas> arrayList2 = arrayList;
        new LinkedList();
        this.zaa = queue;
        if (true != ClientLibraryUtils.isPackageSide()) {
            j = 120000;
        } else {
            j = 10000;
        }
        this.zaq = j;
        this.zar = 5000;
        new HashSet();
        this.zad = set;
        new ListenerHolders();
        this.zau = listenerHolders;
        this.zaw = null;
        this.zah = null;
        new zaat(this);
        this.zax = zaj2;
        this.zan = context2;
        this.zaj = lock2;
        new zak(looper2, this.zax);
        this.zak = zak2;
        this.zao = looper2;
        new zaax(this, looper2);
        this.zas = zaax;
        this.zat = googleApiAvailability2;
        this.zam = i3;
        if (i3 >= 0) {
            this.zaw = Integer.valueOf(i4);
        }
        this.zaf = map3;
        this.zac = map4;
        this.zav = arrayList2;
        new zacx();
        this.zai = zacx;
        for (GoogleApiClient.ConnectionCallbacks zaf2 : list3) {
            this.zak.zaf(zaf2);
        }
        for (GoogleApiClient.OnConnectionFailedListener zai2 : list4) {
            this.zak.zai(zai2);
        }
        this.zae = clientSettings2;
        this.zag = abstractClientBuilder2;
    }

    public static int zaf(Iterable<Api.Client> iterable, boolean z) {
        boolean z2;
        boolean z3 = z;
        Iterator<Api.Client> it = iterable.iterator();
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            z2 = z5;
            if (!it.hasNext()) {
                break;
            }
            Api.Client next = it.next();
            z4 = next.requiresSignIn() | z4;
            z5 = next.providesSignIn() | z2;
        }
        if (z4) {
            return (!z2 || !z3) ? 1 : 2;
        }
        return 3;
    }

    static String zag(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    static /* synthetic */ void zah(zaaz zaaz) {
        zaaz zaaz2 = zaaz;
        zaaz2.zaj.lock();
        try {
            if (zaaz2.zap) {
                zaaz2.zan();
            }
            zaaz2.zaj.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            zaaz2.zaj.unlock();
            throw th2;
        }
    }

    static /* synthetic */ void zai(zaaz zaaz) {
        zaaz zaaz2 = zaaz;
        zaaz2.zaj.lock();
        try {
            if (zaaz2.zad()) {
                zaaz2.zan();
            }
            zaaz2.zaj.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            zaaz2.zaj.unlock();
            throw th2;
        }
    }

    static /* synthetic */ void zaj(zaaz zaaz, GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        boolean z2 = z;
        zaaz.zal(googleApiClient, statusPendingResult, true);
    }

    private final void zal(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        ResultCallback resultCallback;
        GoogleApiClient googleApiClient2 = googleApiClient;
        PendingResult<Status> zaa2 = Common.zaa.zaa(googleApiClient2);
        new zaaw(this, statusPendingResult, z, googleApiClient2);
        zaa2.setResultCallback(resultCallback);
    }

    private final void zam(int i) {
        Throwable th;
        StringBuilder sb;
        boolean z;
        Throwable th2;
        Throwable th3;
        zabu zabu;
        int i2 = i;
        Integer num = this.zaw;
        if (num == null) {
            this.zaw = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            String zag2 = zag(i2);
            String zag3 = zag(this.zaw.intValue());
            new StringBuilder(zag2.length() + 51 + zag3.length());
            StringBuilder append = sb.append("Cannot use sign-in mode: ");
            StringBuilder append2 = sb.append(zag2);
            StringBuilder append3 = sb.append(". Mode was already set to ");
            StringBuilder append4 = sb.append(zag3);
            new IllegalStateException(sb.toString());
            throw th;
        }
        if (this.zal == null) {
            Iterator<Api.Client> it = this.zac.values().iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                z = z3;
                if (!it.hasNext()) {
                    break;
                }
                Api.Client next = it.next();
                z2 = next.requiresSignIn() | z2;
                z3 = next.providesSignIn() | z;
            }
            switch (this.zaw.intValue()) {
                case 1:
                    if (!z2) {
                        new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                        throw th3;
                    } else if (z) {
                        new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                        throw th2;
                    }
                    break;
                case 2:
                    if (z2) {
                        this.zal = zax.zaa(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav);
                        return;
                    }
                    break;
            }
            new zabd(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav, this);
            this.zal = zabu;
        }
    }

    @GuardedBy("mLock")
    private final void zan() {
        this.zak.zab();
        ((zabu) Preconditions.checkNotNull(this.zal)).zae();
    }

    /* JADX INFO: finally extract failed */
    public final ConnectionResult blockingConnect() {
        boolean z;
        Throwable th;
        boolean z2;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "blockingConnect must not be called on the UI thread");
        this.zaj.lock();
        try {
            if (this.zam >= 0) {
                if (this.zaw != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Preconditions.checkState(z2, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    throw th;
                }
            }
            zam(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            ConnectionResult zaf2 = ((zabu) Preconditions.checkNotNull(this.zal)).zaf();
            this.zaj.unlock();
            return zaf2;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            this.zaj.unlock();
            throw th3;
        }
    }

    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        boolean z;
        StatusPendingResult statusPendingResult;
        AtomicReference atomicReference;
        GoogleApiClient.ConnectionCallbacks connectionCallbacks;
        GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener;
        GoogleApiClient.Builder builder;
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.zaw;
        if (num != null) {
            z = num.intValue() != 2;
        } else {
            z = true;
        }
        Preconditions.checkState(z, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        new StatusPendingResult((GoogleApiClient) this);
        if (this.zac.containsKey(Common.CLIENT_KEY)) {
            zal(this, statusPendingResult, false);
        } else {
            new AtomicReference();
            new zaau(this, atomicReference, statusPendingResult);
            new zaav(this, statusPendingResult);
            new GoogleApiClient.Builder(this.zan);
            GoogleApiClient.Builder addApi = builder.addApi(Common.API);
            GoogleApiClient.Builder addConnectionCallbacks = builder.addConnectionCallbacks(connectionCallbacks);
            GoogleApiClient.Builder addOnConnectionFailedListener = builder.addOnConnectionFailedListener(onConnectionFailedListener);
            GoogleApiClient.Builder handler = builder.setHandler(this.zas);
            GoogleApiClient build = builder.build();
            atomicReference.set(build);
            build.connect();
        }
        return statusPendingResult;
    }

    /* JADX INFO: finally extract failed */
    public final void connect() {
        Throwable th;
        boolean z;
        StringBuilder sb;
        boolean z2;
        this.zaj.lock();
        try {
            if (this.zam >= 0) {
                if (this.zaw != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Preconditions.checkState(z2, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    throw th;
                }
            }
            int intValue = ((Integer) Preconditions.checkNotNull(this.zaw)).intValue();
            this.zaj.lock();
            if (intValue == 3) {
                z = true;
            } else if (intValue == 1) {
                z = true;
            } else if (intValue == 2) {
                intValue = 2;
                z = true;
            } else {
                z = false;
            }
            new StringBuilder(33);
            StringBuilder append = sb.append("Illegal sign-in mode: ");
            StringBuilder append2 = sb.append(intValue);
            Preconditions.checkArgument(z, sb.toString());
            zam(intValue);
            zan();
            this.zaj.unlock();
            this.zaj.unlock();
        } catch (Throwable th2) {
            Throwable th3 = th2;
            this.zaj.unlock();
            throw th3;
        }
    }

    public final void disconnect() {
        this.zaj.lock();
        try {
            this.zai.zab();
            zabu zabu = this.zal;
            if (zabu != null) {
                zabu.zah();
            }
            this.zau.zab();
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : this.zaa) {
                apiMethodImpl.zan((zacw) null);
                apiMethodImpl.cancel();
            }
            this.zaa.clear();
            if (this.zal == null) {
                this.zaj.unlock();
                return;
            }
            boolean zad2 = zad();
            this.zak.zaa();
            this.zaj.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zaj.unlock();
            throw th2;
        }
    }

    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        String str2 = str;
        FileDescriptor fileDescriptor2 = fileDescriptor;
        PrintWriter printWriter2 = printWriter;
        String[] strArr2 = strArr;
        printWriter2.append(str2).append("mContext=").println(this.zan);
        printWriter2.append(str2).append("mResuming=").print(this.zap);
        printWriter2.append(" mWorkQueue.size()=").print(this.zaa.size());
        printWriter2.append(" mUnconsumedApiCalls.size()=").println(this.zai.zab.size());
        zabu zabu = this.zal;
        if (zabu != null) {
            zabu.zan(str2, fileDescriptor2, printWriter2, strArr2);
        }
    }

    /* JADX INFO: finally extract failed */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        String str;
        StringBuilder sb;
        T t2 = t;
        Api<?> api = t2.getApi();
        boolean containsKey = this.zac.containsKey(t2.getClientKey());
        if (api != null) {
            str = api.zad();
        } else {
            str = "the API";
        }
        new StringBuilder(String.valueOf(str).length() + 65);
        StringBuilder append = sb.append("GoogleApiClient is not configured to use ");
        StringBuilder append2 = sb.append(str);
        StringBuilder append3 = sb.append(" required for this call.");
        Preconditions.checkArgument(containsKey, sb.toString());
        this.zaj.lock();
        try {
            zabu zabu = this.zal;
            if (zabu == null) {
                boolean add = this.zaa.add(t2);
                this.zaj.unlock();
                return t2;
            }
            T zab2 = zabu.zab(t2);
            this.zaj.unlock();
            return zab2;
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zaj.unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        String str;
        StringBuilder sb;
        Throwable th;
        T t2 = t;
        Api<?> api = t2.getApi();
        boolean containsKey = this.zac.containsKey(t2.getClientKey());
        if (api != null) {
            str = api.zad();
        } else {
            str = "the API";
        }
        new StringBuilder(String.valueOf(str).length() + 65);
        StringBuilder append = sb.append("GoogleApiClient is not configured to use ");
        StringBuilder append2 = sb.append(str);
        StringBuilder append3 = sb.append(" required for this call.");
        Preconditions.checkArgument(containsKey, sb.toString());
        this.zaj.lock();
        try {
            zabu zabu = this.zal;
            if (zabu == null) {
                new IllegalStateException("GoogleApiClient is not connected yet.");
                throw th;
            } else if (this.zap) {
                boolean add = this.zaa.add(t2);
                while (!this.zaa.isEmpty()) {
                    BaseImplementation.ApiMethodImpl remove = this.zaa.remove();
                    this.zai.zaa(remove);
                    remove.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                }
                this.zaj.unlock();
                return t2;
            } else {
                T zac2 = zabu.zac(t2);
                this.zaj.unlock();
                return zac2;
            }
        } catch (Throwable th2) {
            Throwable th3 = th2;
            this.zaj.unlock();
            throw th3;
        }
    }

    @NonNull
    public final <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        C c = (Api.Client) this.zac.get(anyClientKey);
        Object checkNotNull = Preconditions.checkNotNull(c, "Appropriate Api was not requested.");
        return c;
    }

    /* JADX INFO: finally extract failed */
    @NonNull
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        Throwable th;
        Throwable th2;
        ConnectionResult connectionResult;
        Throwable th3;
        Api<?> api2 = api;
        this.zaj.lock();
        try {
            if (!isConnected() && !this.zap) {
                new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
                throw th3;
            } else if (this.zac.containsKey(api2.zac())) {
                ConnectionResult zad2 = ((zabu) Preconditions.checkNotNull(this.zal)).zad(api2);
                if (zad2 != null) {
                    this.zaj.unlock();
                    return zad2;
                } else if (this.zap) {
                    ConnectionResult connectionResult2 = ConnectionResult.RESULT_SUCCESS;
                    this.zaj.unlock();
                    return connectionResult2;
                } else {
                    int w = Log.w("GoogleApiClientImpl", zae());
                    String concat = String.valueOf(api2.zad()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map");
                    new Exception();
                    int wtf = Log.wtf("GoogleApiClientImpl", concat, th2);
                    new ConnectionResult(8, (PendingIntent) null);
                    this.zaj.unlock();
                    return connectionResult;
                }
            } else {
                new IllegalArgumentException(String.valueOf(api2.zad()).concat(" was never registered with GoogleApiClient"));
                throw th;
            }
        } catch (Throwable th4) {
            Throwable th5 = th4;
            this.zaj.unlock();
            throw th5;
        }
    }

    public final Context getContext() {
        return this.zan;
    }

    public final Looper getLooper() {
        return this.zao;
    }

    public final boolean hasApi(@NonNull Api<?> api) {
        return this.zac.containsKey(api.zac());
    }

    public final boolean hasConnectedApi(@NonNull Api<?> api) {
        Api<?> api2 = api;
        if (!isConnected()) {
            return false;
        }
        Api.Client client = this.zac.get(api2.zac());
        return client != null && client.isConnected();
    }

    public final boolean isConnected() {
        zabu zabu = this.zal;
        return zabu != null && zabu.zai();
    }

    public final boolean isConnecting() {
        zabu zabu = this.zal;
        return zabu != null && zabu.zaj();
    }

    public final boolean isConnectionCallbacksRegistered(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zak.zag(connectionCallbacks);
    }

    public final boolean isConnectionFailedListenerRegistered(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zak.zaj(onConnectionFailedListener);
    }

    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        SignInConnectionListener signInConnectionListener2 = signInConnectionListener;
        zabu zabu = this.zal;
        return zabu != null && zabu.zak(signInConnectionListener2);
    }

    public final void maybeSignOut() {
        zabu zabu = this.zal;
        if (zabu != null) {
            zabu.zam();
        }
    }

    public final void reconnect() {
        disconnect();
        connect();
    }

    public final void registerConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zaf(connectionCallbacks);
    }

    public final void registerConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zai(onConnectionFailedListener);
    }

    /* JADX INFO: finally extract failed */
    public final <L> ListenerHolder<L> registerListener(@NonNull L l) {
        L l2 = l;
        this.zaj.lock();
        try {
            ListenerHolder<L> zaa2 = this.zau.zaa(l2, this.zao, "NO_TYPE");
            this.zaj.unlock();
            return zaa2;
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zaj.unlock();
            throw th2;
        }
    }

    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity) {
        LifecycleActivity lifecycleActivity;
        Throwable th;
        new LifecycleActivity((Activity) fragmentActivity);
        if (this.zam < 0) {
            new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
            throw th;
        } else {
            zak.zaa(lifecycleActivity).zac(this.zam);
        }
    }

    public final void unregisterConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zah(connectionCallbacks);
    }

    public final void unregisterConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zak(onConnectionFailedListener);
    }

    @GuardedBy("mLock")
    public final void zaa(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        while (!this.zaa.isEmpty()) {
            BaseImplementation.ApiMethodImpl execute = execute(this.zaa.remove());
        }
        this.zak.zac(bundle2);
    }

    @GuardedBy("mLock")
    public final void zab(ConnectionResult connectionResult) {
        ConnectionResult connectionResult2 = connectionResult;
        if (!this.zat.isPlayServicesPossiblyUpdating(this.zan, connectionResult2.getErrorCode())) {
            boolean zad2 = zad();
        }
        if (!this.zap) {
            this.zak.zae(connectionResult2);
            this.zak.zaa();
        }
    }

    /* access modifiers changed from: package-private */
    public final String zae() {
        StringWriter stringWriter;
        PrintWriter printWriter;
        new StringWriter();
        new PrintWriter(stringWriter);
        dump("", (FileDescriptor) null, printWriter, (String[]) null);
        return stringWriter.toString();
    }

    public final void zao(zacv zacv) {
        Set<zacv> set;
        zacv zacv2 = zacv;
        this.zaj.lock();
        try {
            if (this.zah == null) {
                new HashSet();
                this.zah = set;
            }
            boolean add = this.zah.add(zacv2);
            this.zaj.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zaj.unlock();
            throw th2;
        }
    }

    public final void zap(zacv zacv) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        zacv zacv2 = zacv;
        this.zaj.lock();
        try {
            Set<zacv> set = this.zah;
            if (set == null) {
                new Exception();
                int wtf = Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", th4);
            } else if (!set.remove(zacv2)) {
                new Exception();
                int wtf2 = Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", th3);
            } else {
                this.zaj.lock();
                Set<zacv> set2 = this.zah;
                if (set2 == null) {
                    this.zaj.unlock();
                } else {
                    boolean z = !set2.isEmpty();
                    this.zaj.unlock();
                    if (!z) {
                    }
                }
                zabu zabu = this.zal;
                if (zabu != null) {
                    zabu.zal();
                }
            }
            this.zaj.unlock();
        } catch (Throwable th5) {
            throw th;
        } finally {
        }
    }

    /* access modifiers changed from: package-private */
    @GuardedBy("mLock")
    public final boolean zad() {
        if (!this.zap) {
            return false;
        }
        this.zap = false;
        this.zas.removeMessages(2);
        this.zas.removeMessages(1);
        zabr zabr = this.zab;
        if (zabr != null) {
            zabr.zab();
            this.zab = null;
        }
        return true;
    }

    @GuardedBy("mLock")
    public final void zac(int i, boolean z) {
        zabq zabq;
        int i2 = i;
        boolean z2 = z;
        if (i2 == 1) {
            if (z2) {
                i2 = 1;
            } else if (this.zap) {
                i2 = 1;
            } else {
                this.zap = true;
                if (this.zab == null && !ClientLibraryUtils.isPackageSide()) {
                    try {
                        GoogleApiAvailability googleApiAvailability = this.zat;
                        Context applicationContext = this.zan.getApplicationContext();
                        new zaay(this);
                        this.zab = googleApiAvailability.zae(applicationContext, zabq);
                    } catch (SecurityException e) {
                    }
                }
                zaax zaax = this.zas;
                boolean sendMessageDelayed = zaax.sendMessageDelayed(zaax.obtainMessage(1), this.zaq);
                zaax zaax2 = this.zas;
                boolean sendMessageDelayed2 = zaax2.sendMessageDelayed(zaax2.obtainMessage(2), this.zar);
                i2 = 1;
            }
        }
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.zai.zab.toArray(new BasePendingResult[0]);
        int length = basePendingResultArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            basePendingResultArr[i3].forceFailureUnlessReady(zacx.zaa);
        }
        this.zak.zad(i2);
        this.zak.zaa();
        if (i2 == 2) {
            zan();
        }
    }

    /* JADX INFO: finally extract failed */
    public final ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        boolean z;
        Throwable th;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "blockingConnect must not be called on the UI thread");
        Object checkNotNull = Preconditions.checkNotNull(timeUnit2, "TimeUnit must not be null");
        this.zaj.lock();
        try {
            Integer num = this.zaw;
            if (num == null) {
                this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
            } else if (num.intValue() == 2) {
                new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                throw th;
            }
            zam(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            ConnectionResult zag2 = ((zabu) Preconditions.checkNotNull(this.zal)).zag(j2, timeUnit2);
            this.zaj.unlock();
            return zag2;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            this.zaj.unlock();
            throw th3;
        }
    }

    public final void connect(int i) {
        boolean z;
        StringBuilder sb;
        int i2 = i;
        this.zaj.lock();
        if (i2 == 3) {
            z = true;
        } else if (i2 == 1) {
            z = true;
        } else if (i2 == 2) {
            i2 = 2;
            z = true;
        } else {
            z = false;
        }
        try {
            new StringBuilder(33);
            StringBuilder append = sb.append("Illegal sign-in mode: ");
            StringBuilder append2 = sb.append(i2);
            Preconditions.checkArgument(z, sb.toString());
            zam(i2);
            zan();
            this.zaj.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zaj.unlock();
            throw th2;
        }
    }
}
