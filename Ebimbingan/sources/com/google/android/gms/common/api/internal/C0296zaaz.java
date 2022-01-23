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
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.C0189GoogleApiAvailability;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0232ResultCallback;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0494zaj;
import com.google.android.gms.common.internal.C0495zak;
import com.google.android.gms.common.internal.service.C0465Common;
import com.google.android.gms.common.util.C0591ClientLibraryUtils;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.signin.C1134SignInOptions;
import com.google.android.gms.signin.C1152zae;
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

/* renamed from: com.google.android.gms.common.api.internal.zaaz */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0296zaaz extends C0222GoogleApiClient implements C0317zabt {
    @C0617VisibleForTesting
    final Queue<C0243BaseImplementation.ApiMethodImpl<?, ?>> zaa;
    @Nullable
    @C0617VisibleForTesting
    C0315zabr zab;
    final Map<C0211Api.AnyClientKey<?>, C0211Api.Client> zac;
    Set<C0235Scope> zad;
    final C0427ClientSettings zae;
    final Map<C0211Api<?>, Boolean> zaf;
    final C0211Api.AbstractClientBuilder<? extends C1152zae, C1134SignInOptions> zag;
    @Nullable
    Set<C0346zacv> zah;
    final C0348zacx zai;
    private final Lock zaj;
    private final C0495zak zak;
    @Nullable
    private C0318zabu zal = null;
    private final int zam;
    /* access modifiers changed from: private */
    public final Context zan;
    private final Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final C0294zaax zas;
    private final C0189GoogleApiAvailability zat;
    private final C0255ListenerHolders zau;
    private final ArrayList<C0364zas> zav;
    private Integer zaw;
    private final C0494zaj zax;

    public C0296zaaz(Context context, Lock lock, Looper looper, C0427ClientSettings clientSettings, C0189GoogleApiAvailability googleApiAvailability, C0211Api.AbstractClientBuilder<? extends C1152zae, C1134SignInOptions> abstractClientBuilder, Map<C0211Api<?>, Boolean> map, List<C0222GoogleApiClient.ConnectionCallbacks> list, List<C0222GoogleApiClient.OnConnectionFailedListener> list2, Map<C0211Api.AnyClientKey<?>, C0211Api.Client> map2, int i, int i2, ArrayList<C0364zas> arrayList) {
        Queue<C0243BaseImplementation.ApiMethodImpl<?, ?>> queue;
        long j;
        Set<C0235Scope> set;
        C0255ListenerHolders listenerHolders;
        C0494zaj zaj2;
        C0495zak zak2;
        C0294zaax zaax;
        C0348zacx zacx;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C0427ClientSettings clientSettings2 = clientSettings;
        C0189GoogleApiAvailability googleApiAvailability2 = googleApiAvailability;
        C0211Api.AbstractClientBuilder<? extends C1152zae, C1134SignInOptions> abstractClientBuilder2 = abstractClientBuilder;
        Map<C0211Api<?>, Boolean> map3 = map;
        List<C0222GoogleApiClient.ConnectionCallbacks> list3 = list;
        List<C0222GoogleApiClient.OnConnectionFailedListener> list4 = list2;
        Map<C0211Api.AnyClientKey<?>, C0211Api.Client> map4 = map2;
        int i3 = i;
        int i4 = i2;
        ArrayList<C0364zas> arrayList2 = arrayList;
        new LinkedList();
        this.zaa = queue;
        if (true != C0591ClientLibraryUtils.isPackageSide()) {
            j = 120000;
        } else {
            j = 10000;
        }
        this.zaq = j;
        this.zar = 5000;
        new HashSet();
        this.zad = set;
        new C0255ListenerHolders();
        this.zau = listenerHolders;
        this.zaw = null;
        this.zah = null;
        new C0290zaat(this);
        this.zax = zaj2;
        this.zan = context2;
        this.zaj = lock2;
        new C0495zak(looper2, this.zax);
        this.zak = zak2;
        this.zao = looper2;
        new C0294zaax(this, looper2);
        this.zas = zaax;
        this.zat = googleApiAvailability2;
        this.zam = i3;
        if (i3 >= 0) {
            this.zaw = Integer.valueOf(i4);
        }
        this.zaf = map3;
        this.zac = map4;
        this.zav = arrayList2;
        new C0348zacx();
        this.zai = zacx;
        for (C0222GoogleApiClient.ConnectionCallbacks zaf2 : list3) {
            this.zak.zaf(zaf2);
        }
        for (C0222GoogleApiClient.OnConnectionFailedListener zai2 : list4) {
            this.zak.zai(zai2);
        }
        this.zae = clientSettings2;
        this.zag = abstractClientBuilder2;
    }

    public static int zaf(Iterable<C0211Api.Client> iterable, boolean z) {
        boolean z2;
        boolean z3 = z;
        Iterator<C0211Api.Client> it = iterable.iterator();
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            z2 = z5;
            if (!it.hasNext()) {
                break;
            }
            C0211Api.Client next = it.next();
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

    static /* synthetic */ void zah(C0296zaaz zaaz) {
        C0296zaaz zaaz2 = zaaz;
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

    static /* synthetic */ void zai(C0296zaaz zaaz) {
        C0296zaaz zaaz2 = zaaz;
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

    static /* synthetic */ void zaj(C0296zaaz zaaz, C0222GoogleApiClient googleApiClient, C0266StatusPendingResult statusPendingResult, boolean z) {
        boolean z2 = z;
        zaaz.zal(googleApiClient, statusPendingResult, true);
    }

    private final void zal(C0222GoogleApiClient googleApiClient, C0266StatusPendingResult statusPendingResult, boolean z) {
        C0232ResultCallback resultCallback;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        C0225PendingResult<C0236Status> zaa2 = C0465Common.zaa.zaa(googleApiClient2);
        new C0293zaaw(this, statusPendingResult, z, googleApiClient2);
        zaa2.setResultCallback(resultCallback);
    }

    private final void zam(int i) {
        Throwable th;
        StringBuilder sb;
        boolean z;
        Throwable th2;
        Throwable th3;
        C0318zabu zabu;
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
            Iterator<C0211Api.Client> it = this.zac.values().iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                z = z3;
                if (!it.hasNext()) {
                    break;
                }
                C0211Api.Client next = it.next();
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
                        this.zal = C0369zax.zaa(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav);
                        return;
                    }
                    break;
            }
            new C0301zabd(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav, this);
            this.zal = zabu;
        }
    }

    @GuardedBy("mLock")
    private final void zan() {
        this.zak.zab();
        ((C0318zabu) C0446Preconditions.checkNotNull(this.zal)).zae();
    }

    /* JADX INFO: finally extract failed */
    public final C0184ConnectionResult blockingConnect() {
        boolean z;
        Throwable th;
        boolean z2;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C0446Preconditions.checkState(z, "blockingConnect must not be called on the UI thread");
        this.zaj.lock();
        try {
            if (this.zam >= 0) {
                if (this.zaw != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0446Preconditions.checkState(z2, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    throw th;
                }
            }
            zam(((Integer) C0446Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            C0184ConnectionResult zaf2 = ((C0318zabu) C0446Preconditions.checkNotNull(this.zal)).zaf();
            this.zaj.unlock();
            return zaf2;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            this.zaj.unlock();
            throw th3;
        }
    }

    public final C0225PendingResult<C0236Status> clearDefaultAccountAndReconnect() {
        boolean z;
        C0266StatusPendingResult statusPendingResult;
        AtomicReference atomicReference;
        C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks;
        C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener;
        C0222GoogleApiClient.Builder builder;
        C0446Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.zaw;
        if (num != null) {
            z = num.intValue() != 2;
        } else {
            z = true;
        }
        C0446Preconditions.checkState(z, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        new C0266StatusPendingResult((C0222GoogleApiClient) this);
        if (this.zac.containsKey(C0465Common.CLIENT_KEY)) {
            zal(this, statusPendingResult, false);
        } else {
            new AtomicReference();
            new C0291zaau(this, atomicReference, statusPendingResult);
            new C0292zaav(this, statusPendingResult);
            new C0222GoogleApiClient.Builder(this.zan);
            C0222GoogleApiClient.Builder addApi = builder.addApi(C0465Common.API);
            C0222GoogleApiClient.Builder addConnectionCallbacks = builder.addConnectionCallbacks(connectionCallbacks);
            C0222GoogleApiClient.Builder addOnConnectionFailedListener = builder.addOnConnectionFailedListener(onConnectionFailedListener);
            C0222GoogleApiClient.Builder handler = builder.setHandler(this.zas);
            C0222GoogleApiClient build = builder.build();
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
                C0446Preconditions.checkState(z2, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    throw th;
                }
            }
            int intValue = ((Integer) C0446Preconditions.checkNotNull(this.zaw)).intValue();
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
            C0446Preconditions.checkArgument(z, sb.toString());
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
            C0318zabu zabu = this.zal;
            if (zabu != null) {
                zabu.zah();
            }
            this.zau.zab();
            for (C0243BaseImplementation.ApiMethodImpl apiMethodImpl : this.zaa) {
                apiMethodImpl.zan((C0347zacw) null);
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
        C0318zabu zabu = this.zal;
        if (zabu != null) {
            zabu.zan(str2, fileDescriptor2, printWriter2, strArr2);
        }
    }

    /* JADX INFO: finally extract failed */
    public final <A extends C0211Api.AnyClient, R extends C0231Result, T extends C0243BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        String str;
        StringBuilder sb;
        T t2 = t;
        C0211Api<?> api = t2.getApi();
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
        C0446Preconditions.checkArgument(containsKey, sb.toString());
        this.zaj.lock();
        try {
            C0318zabu zabu = this.zal;
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
    public final <A extends C0211Api.AnyClient, T extends C0243BaseImplementation.ApiMethodImpl<? extends C0231Result, A>> T execute(@NonNull T t) {
        String str;
        StringBuilder sb;
        Throwable th;
        T t2 = t;
        C0211Api<?> api = t2.getApi();
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
        C0446Preconditions.checkArgument(containsKey, sb.toString());
        this.zaj.lock();
        try {
            C0318zabu zabu = this.zal;
            if (zabu == null) {
                new IllegalStateException("GoogleApiClient is not connected yet.");
                throw th;
            } else if (this.zap) {
                boolean add = this.zaa.add(t2);
                while (!this.zaa.isEmpty()) {
                    C0243BaseImplementation.ApiMethodImpl remove = this.zaa.remove();
                    this.zai.zaa(remove);
                    remove.setFailedResult(C0236Status.RESULT_INTERNAL_ERROR);
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
    public final <C extends C0211Api.Client> C getClient(@NonNull C0211Api.AnyClientKey<C> anyClientKey) {
        C c = (C0211Api.Client) this.zac.get(anyClientKey);
        Object checkNotNull = C0446Preconditions.checkNotNull(c, "Appropriate Api was not requested.");
        return c;
    }

    /* JADX INFO: finally extract failed */
    @NonNull
    public final C0184ConnectionResult getConnectionResult(@NonNull C0211Api<?> api) {
        Throwable th;
        Throwable th2;
        C0184ConnectionResult connectionResult;
        Throwable th3;
        C0211Api<?> api2 = api;
        this.zaj.lock();
        try {
            if (!isConnected() && !this.zap) {
                new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
                throw th3;
            } else if (this.zac.containsKey(api2.zac())) {
                C0184ConnectionResult zad2 = ((C0318zabu) C0446Preconditions.checkNotNull(this.zal)).zad(api2);
                if (zad2 != null) {
                    this.zaj.unlock();
                    return zad2;
                } else if (this.zap) {
                    C0184ConnectionResult connectionResult2 = C0184ConnectionResult.RESULT_SUCCESS;
                    this.zaj.unlock();
                    return connectionResult2;
                } else {
                    int w = Log.w("GoogleApiClientImpl", zae());
                    String concat = String.valueOf(api2.zad()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map");
                    new Exception();
                    int wtf = Log.wtf("GoogleApiClientImpl", concat, th2);
                    new C0184ConnectionResult(8, (PendingIntent) null);
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

    public final boolean hasApi(@NonNull C0211Api<?> api) {
        return this.zac.containsKey(api.zac());
    }

    public final boolean hasConnectedApi(@NonNull C0211Api<?> api) {
        C0211Api<?> api2 = api;
        if (!isConnected()) {
            return false;
        }
        C0211Api.Client client = this.zac.get(api2.zac());
        return client != null && client.isConnected();
    }

    public final boolean isConnected() {
        C0318zabu zabu = this.zal;
        return zabu != null && zabu.zai();
    }

    public final boolean isConnecting() {
        C0318zabu zabu = this.zal;
        return zabu != null && zabu.zaj();
    }

    public final boolean isConnectionCallbacksRegistered(@NonNull C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zak.zag(connectionCallbacks);
    }

    public final boolean isConnectionFailedListenerRegistered(@NonNull C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zak.zaj(onConnectionFailedListener);
    }

    public final boolean maybeSignIn(C0263SignInConnectionListener signInConnectionListener) {
        C0263SignInConnectionListener signInConnectionListener2 = signInConnectionListener;
        C0318zabu zabu = this.zal;
        return zabu != null && zabu.zak(signInConnectionListener2);
    }

    public final void maybeSignOut() {
        C0318zabu zabu = this.zal;
        if (zabu != null) {
            zabu.zam();
        }
    }

    public final void reconnect() {
        disconnect();
        connect();
    }

    public final void registerConnectionCallbacks(@NonNull C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zaf(connectionCallbacks);
    }

    public final void registerConnectionFailedListener(@NonNull C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zai(onConnectionFailedListener);
    }

    /* JADX INFO: finally extract failed */
    public final <L> C0254ListenerHolder<L> registerListener(@NonNull L l) {
        L l2 = l;
        this.zaj.lock();
        try {
            C0254ListenerHolder<L> zaa2 = this.zau.zaa(l2, this.zao, "NO_TYPE");
            this.zaj.unlock();
            return zaa2;
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zaj.unlock();
            throw th2;
        }
    }

    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity) {
        C0251LifecycleActivity lifecycleActivity;
        Throwable th;
        new C0251LifecycleActivity((Activity) fragmentActivity);
        if (this.zam < 0) {
            new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
            throw th;
        } else {
            C0356zak.zaa(lifecycleActivity).zac(this.zam);
        }
    }

    public final void unregisterConnectionCallbacks(@NonNull C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zah(connectionCallbacks);
    }

    public final void unregisterConnectionFailedListener(@NonNull C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zak(onConnectionFailedListener);
    }

    @GuardedBy("mLock")
    public final void zaa(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        while (!this.zaa.isEmpty()) {
            C0243BaseImplementation.ApiMethodImpl execute = execute(this.zaa.remove());
        }
        this.zak.zac(bundle2);
    }

    @GuardedBy("mLock")
    public final void zab(C0184ConnectionResult connectionResult) {
        C0184ConnectionResult connectionResult2 = connectionResult;
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

    public final void zao(C0346zacv zacv) {
        Set<C0346zacv> set;
        C0346zacv zacv2 = zacv;
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

    public final void zap(C0346zacv zacv) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        C0346zacv zacv2 = zacv;
        this.zaj.lock();
        try {
            Set<C0346zacv> set = this.zah;
            if (set == null) {
                new Exception();
                int wtf = Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", th4);
            } else if (!set.remove(zacv2)) {
                new Exception();
                int wtf2 = Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", th3);
            } else {
                this.zaj.lock();
                Set<C0346zacv> set2 = this.zah;
                if (set2 == null) {
                    this.zaj.unlock();
                } else {
                    boolean z = !set2.isEmpty();
                    this.zaj.unlock();
                    if (!z) {
                    }
                }
                C0318zabu zabu = this.zal;
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
        C0315zabr zabr = this.zab;
        if (zabr != null) {
            zabr.zab();
            this.zab = null;
        }
        return true;
    }

    @GuardedBy("mLock")
    public final void zac(int i, boolean z) {
        C0314zabq zabq;
        int i2 = i;
        boolean z2 = z;
        if (i2 == 1) {
            if (z2) {
                i2 = 1;
            } else if (this.zap) {
                i2 = 1;
            } else {
                this.zap = true;
                if (this.zab == null && !C0591ClientLibraryUtils.isPackageSide()) {
                    try {
                        C0189GoogleApiAvailability googleApiAvailability = this.zat;
                        Context applicationContext = this.zan.getApplicationContext();
                        new C0295zaay(this);
                        this.zab = googleApiAvailability.zae(applicationContext, zabq);
                    } catch (SecurityException e) {
                    }
                }
                C0294zaax zaax = this.zas;
                boolean sendMessageDelayed = zaax.sendMessageDelayed(zaax.obtainMessage(1), this.zaq);
                C0294zaax zaax2 = this.zas;
                boolean sendMessageDelayed2 = zaax2.sendMessageDelayed(zaax2.obtainMessage(2), this.zar);
                i2 = 1;
            }
        }
        C0244BasePendingResult[] basePendingResultArr = (C0244BasePendingResult[]) this.zai.zab.toArray(new C0244BasePendingResult[0]);
        int length = basePendingResultArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            basePendingResultArr[i3].forceFailureUnlessReady(C0348zacx.zaa);
        }
        this.zak.zad(i2);
        this.zak.zaa();
        if (i2 == 2) {
            zan();
        }
    }

    /* JADX INFO: finally extract failed */
    public final C0184ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        boolean z;
        Throwable th;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C0446Preconditions.checkState(z, "blockingConnect must not be called on the UI thread");
        Object checkNotNull = C0446Preconditions.checkNotNull(timeUnit2, "TimeUnit must not be null");
        this.zaj.lock();
        try {
            Integer num = this.zaw;
            if (num == null) {
                this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
            } else if (num.intValue() == 2) {
                new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                throw th;
            }
            zam(((Integer) C0446Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            C0184ConnectionResult zag2 = ((C0318zabu) C0446Preconditions.checkNotNull(this.zal)).zag(j2, timeUnit2);
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
            C0446Preconditions.checkArgument(z, sb.toString());
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
