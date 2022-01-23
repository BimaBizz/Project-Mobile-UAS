package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zae;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zax implements zabu {
    private final Context zaa;
    private final zaaz zab;
    private final Looper zac;
    /* access modifiers changed from: private */
    public final zabd zad;
    /* access modifiers changed from: private */
    public final zabd zae;
    private final Map<Api.AnyClientKey<?>, zabd> zaf;
    private final Set<SignInConnectionListener> zag;
    @Nullable
    private final Api.Client zah;
    @Nullable
    private Bundle zai;
    @Nullable
    private ConnectionResult zaj = null;
    /* access modifiers changed from: private */
    @Nullable
    public ConnectionResult zak = null;
    /* access modifiers changed from: private */
    public boolean zal = false;
    /* access modifiers changed from: private */
    public final Lock zam;
    @GuardedBy("mLock")
    private int zan = 0;

    private zax(Context context, zaaz zaaz, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zae, SignInOptions> abstractClientBuilder, @Nullable Api.Client client, ArrayList<zas> arrayList, ArrayList<zas> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        Map map5;
        zabd zabd;
        zabt zabt;
        zabd zabd2;
        zabt zabt2;
        ArrayMap arrayMap;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        GoogleApiAvailabilityLight googleApiAvailabilityLight2 = googleApiAvailabilityLight;
        Map<Api.AnyClientKey<?>, Api.Client> map6 = map;
        Map<Api.AnyClientKey<?>, Api.Client> map7 = map2;
        new WeakHashMap();
        this.zag = Collections.newSetFromMap(map5);
        this.zaa = context2;
        this.zab = zaaz;
        this.zam = lock2;
        this.zac = looper2;
        this.zah = client;
        zaaz zaaz2 = this.zab;
        new zav(this, (zau) null);
        new zabd(context2, zaaz2, lock2, looper2, googleApiAvailabilityLight2, map7, (ClientSettings) null, map4, (Api.AbstractClientBuilder<? extends zae, SignInOptions>) null, arrayList2, zabt);
        this.zad = zabd;
        zaaz zaaz3 = this.zab;
        new zaw(this, (zau) null);
        new zabd(context2, zaaz3, lock2, looper2, googleApiAvailabilityLight2, map6, clientSettings, map3, abstractClientBuilder, arrayList, zabt2);
        this.zae = zabd2;
        new ArrayMap();
        for (Api.AnyClientKey<?> put : map7.keySet()) {
            Object put2 = arrayMap.put(put, this.zad);
        }
        for (Api.AnyClientKey<?> put3 : map6.keySet()) {
            Object put4 = arrayMap.put(put3, this.zae);
        }
        this.zaf = Collections.unmodifiableMap(arrayMap);
    }

    @GuardedBy("mLock")
    private final void zaA() {
        for (SignInConnectionListener onComplete : this.zag) {
            onComplete.onComplete();
        }
        this.zag.clear();
    }

    @GuardedBy("mLock")
    private final boolean zaB() {
        ConnectionResult connectionResult = this.zak;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final boolean zaC(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        zabd zabd = this.zaf.get(apiMethodImpl.getClientKey());
        Object checkNotNull = Preconditions.checkNotNull(zabd, "GoogleApiClient is not configured to use the API required for this call.");
        return zabd.equals(this.zae);
    }

    private static boolean zaE(@Nullable ConnectionResult connectionResult) {
        ConnectionResult connectionResult2 = connectionResult;
        return connectionResult2 != null && connectionResult2.isSuccess();
    }

    public static zax zaa(Context context, zaaz zaaz, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zae, SignInOptions> abstractClientBuilder, ArrayList<zas> arrayList) {
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        ArrayList arrayList2;
        ArrayList arrayList3;
        zax zax;
        Throwable th;
        Throwable th2;
        Context context2 = context;
        zaaz zaaz2 = zaaz;
        Lock lock2 = lock;
        Looper looper2 = looper;
        GoogleApiAvailabilityLight googleApiAvailabilityLight2 = googleApiAvailabilityLight;
        ClientSettings clientSettings2 = clientSettings;
        Map<Api<?>, Boolean> map7 = map2;
        Api.AbstractClientBuilder<? extends zae, SignInOptions> abstractClientBuilder2 = abstractClientBuilder;
        ArrayList<zas> arrayList4 = arrayList;
        new ArrayMap();
        new ArrayMap();
        Api.Client client = null;
        for (Map.Entry next : map.entrySet()) {
            Api.Client client2 = (Api.Client) next.getValue();
            if (true == client2.providesSignIn()) {
                client = client2;
            }
            if (client2.requiresSignIn()) {
                Object put = map3.put((Api.AnyClientKey) next.getKey(), client2);
            } else {
                Object put2 = map4.put((Api.AnyClientKey) next.getKey(), client2);
            }
        }
        Preconditions.checkState(!map3.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        new ArrayMap();
        new ArrayMap();
        for (Api next2 : map7.keySet()) {
            Api.AnyClientKey<?> zac2 = next2.zac();
            if (map3.containsKey(zac2)) {
                Object put3 = map5.put(next2, map7.get(next2));
            } else if (map4.containsKey(zac2)) {
                Object put4 = map6.put(next2, map7.get(next2));
            } else {
                new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                throw th2;
            }
        }
        new ArrayList();
        new ArrayList();
        int size = arrayList4.size();
        for (int i = 0; i < size; i++) {
            zas zas = arrayList4.get(i);
            if (map5.containsKey(zas.zaa)) {
                boolean add = arrayList2.add(zas);
            } else if (map6.containsKey(zas.zaa)) {
                boolean add2 = arrayList3.add(zas);
            } else {
                new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                throw th;
            }
        }
        new zax(context2, zaaz2, lock2, looper2, googleApiAvailabilityLight2, map3, map4, clientSettings2, abstractClientBuilder2, client, arrayList2, arrayList3, map5, map6);
        return zax;
    }

    static /* synthetic */ void zap(zax zax) {
        ConnectionResult connectionResult;
        Throwable th;
        zax zax2 = zax;
        if (zaE(zax2.zaj)) {
            if (zaE(zax2.zak) || zax2.zaB()) {
                switch (zax2.zan) {
                    case 1:
                        break;
                    case 2:
                        ((zaaz) Preconditions.checkNotNull(zax2.zab)).zaa(zax2.zai);
                        break;
                    default:
                        new AssertionError();
                        int wtf = Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", th);
                        break;
                }
                zax2.zaA();
                zax2.zan = 0;
                return;
            }
            ConnectionResult connectionResult2 = zax2.zak;
            if (connectionResult2 == null) {
                return;
            }
            if (zax2.zan == 1) {
                zax2.zaA();
                return;
            }
            zax2.zaz(connectionResult2);
            zax2.zad.zah();
        } else if (zax2.zaj == null || !zaE(zax2.zak)) {
            ConnectionResult connectionResult3 = zax2.zaj;
            if (connectionResult3 != null && (connectionResult = zax2.zak) != null) {
                if (zax2.zae.zaf < zax2.zad.zaf) {
                    connectionResult3 = connectionResult;
                }
                zax2.zaz(connectionResult3);
            }
        } else {
            zax2.zae.zah();
            zax2.zaz((ConnectionResult) Preconditions.checkNotNull(zax2.zaj));
        }
    }

    static /* synthetic */ void zaq(zax zax, Bundle bundle) {
        zax zax2 = zax;
        Bundle bundle2 = bundle;
        Bundle bundle3 = zax2.zai;
        if (bundle3 == null) {
            zax2.zai = bundle2;
        } else if (bundle2 != null) {
            bundle3.putAll(bundle2);
        }
    }

    static /* synthetic */ ConnectionResult zar(zax zax, ConnectionResult connectionResult) {
        ConnectionResult connectionResult2 = connectionResult;
        zax.zaj = connectionResult2;
        return connectionResult2;
    }

    static /* synthetic */ boolean zau(zax zax, boolean z) {
        boolean z2 = z;
        zax.zal = z2;
        return z2;
    }

    static /* synthetic */ void zav(zax zax, int i, boolean z) {
        zax zax2 = zax;
        zax2.zab.zac(i, z);
        zax2.zak = null;
        zax2.zaj = null;
    }

    static /* synthetic */ ConnectionResult zax(zax zax, ConnectionResult connectionResult) {
        ConnectionResult connectionResult2 = connectionResult;
        zax.zak = connectionResult2;
        return connectionResult2;
    }

    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zab(@NonNull T t) {
        Status status;
        T t2 = t;
        if (!zaC(t2)) {
            BaseImplementation.ApiMethodImpl zab2 = this.zad.zab(t2);
            return t2;
        } else if (zaB()) {
            new Status(4, (String) null, zaD());
            t2.setFailedResult(status);
            return t2;
        } else {
            BaseImplementation.ApiMethodImpl zab3 = this.zae.zab(t2);
            return t2;
        }
    }

    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zac(@NonNull T t) {
        Status status;
        T t2 = t;
        if (!zaC(t2)) {
            return this.zad.zac(t2);
        }
        if (!zaB()) {
            return this.zae.zac(t2);
        }
        new Status(4, (String) null, zaD());
        t2.setFailedResult(status);
        return t2;
    }

    @GuardedBy("mLock")
    @Nullable
    public final ConnectionResult zad(@NonNull Api<?> api) {
        ConnectionResult connectionResult;
        Api<?> api2 = api;
        if (!Objects.equal(this.zaf.get(api2.zac()), this.zae)) {
            return this.zad.zad(api2);
        }
        if (!zaB()) {
            return this.zae.zad(api2);
        }
        new ConnectionResult(4, zaD());
        return connectionResult;
    }

    @GuardedBy("mLock")
    public final void zae() {
        this.zan = 2;
        this.zal = false;
        this.zak = null;
        this.zaj = null;
        this.zad.zae();
        this.zae.zae();
    }

    @GuardedBy("mLock")
    public final ConnectionResult zaf() {
        Throwable th;
        new UnsupportedOperationException();
        throw th;
    }

    @GuardedBy("mLock")
    public final ConnectionResult zag(long j, @NonNull TimeUnit timeUnit) {
        Throwable th;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        new UnsupportedOperationException();
        throw th;
    }

    @GuardedBy("mLock")
    public final void zah() {
        this.zak = null;
        this.zaj = null;
        this.zan = 0;
        this.zad.zah();
        this.zae.zah();
        zaA();
    }

    public final boolean zai() {
        boolean z;
        this.zam.lock();
        try {
            if (!this.zad.zai()) {
                z = false;
            } else if (!this.zae.zai()) {
                z = !zaB() ? this.zan == 1 : true;
            } else {
                z = true;
            }
            this.zam.unlock();
            return z;
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zam.unlock();
            throw th2;
        }
    }

    public final boolean zaj() {
        boolean z;
        this.zam.lock();
        try {
            if (this.zan == 2) {
                z = true;
            } else {
                z = false;
            }
            this.zam.unlock();
            return z;
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zam.unlock();
            throw th2;
        }
    }

    public final boolean zak(SignInConnectionListener signInConnectionListener) {
        SignInConnectionListener signInConnectionListener2 = signInConnectionListener;
        this.zam.lock();
        try {
            if ((zaj() || zai()) && !this.zae.zai()) {
                boolean add = this.zag.add(signInConnectionListener2);
                if (this.zan == 0) {
                    this.zan = 1;
                }
                this.zak = null;
                this.zae.zae();
                this.zam.unlock();
                return true;
            }
            this.zam.unlock();
            return false;
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zam.unlock();
            throw th2;
        }
    }

    @GuardedBy("mLock")
    public final void zal() {
        this.zad.zal();
        this.zae.zal();
    }

    public final void zam() {
        ConnectionResult connectionResult;
        Handler handler;
        Runnable runnable;
        this.zam.lock();
        try {
            boolean zaj2 = zaj();
            this.zae.zah();
            new ConnectionResult(4);
            this.zak = connectionResult;
            if (zaj2) {
                new zap(this.zac);
                new zau(this);
                boolean post = handler.post(runnable);
            } else {
                zaA();
            }
            this.zam.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zam.unlock();
            throw th2;
        }
    }

    public final void zan(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        String str2 = str;
        FileDescriptor fileDescriptor2 = fileDescriptor;
        PrintWriter printWriter2 = printWriter;
        String[] strArr2 = strArr;
        printWriter2.append(str2).append("authClient").println(":");
        this.zae.zan(String.valueOf(str2).concat("  "), fileDescriptor2, printWriter2, strArr2);
        printWriter2.append(str2).append("anonClient").println(":");
        this.zad.zan(String.valueOf(str2).concat("  "), fileDescriptor2, printWriter2, strArr2);
    }

    @Nullable
    private final PendingIntent zaD() {
        if (this.zah == null) {
            return null;
        }
        return PendingIntent.getActivity(this.zaa, System.identityHashCode(this.zab), this.zah.getSignInIntent(), 134217728);
    }

    @GuardedBy("mLock")
    private final void zaz(ConnectionResult connectionResult) {
        Throwable th;
        ConnectionResult connectionResult2 = connectionResult;
        switch (this.zan) {
            case 1:
                break;
            case 2:
                this.zab.zab(connectionResult2);
                break;
            default:
                new Exception();
                int wtf = Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", th);
                break;
        }
        zaA();
        this.zan = 0;
    }
}
