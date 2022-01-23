package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zae;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zabd implements zabu, zat {
    final Map<Api.AnyClientKey<?>, Api.Client> zaa;
    final Map<Api.AnyClientKey<?>, ConnectionResult> zab;
    @Nullable
    final ClientSettings zac;
    final Map<Api<?>, Boolean> zad;
    @Nullable
    final Api.AbstractClientBuilder<? extends zae, SignInOptions> zae;
    int zaf;
    final zaaz zag;
    final zabt zah;
    /* access modifiers changed from: private */
    public final Lock zai;
    private final Condition zaj;
    private final Context zak;
    private final GoogleApiAvailabilityLight zal;
    private final zabc zam;
    /* access modifiers changed from: private */
    @NotOnlyInitialized
    public volatile zaba zan;
    @Nullable
    private ConnectionResult zao = null;

    public zabd(Context context, zaaz zaaz, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, @Nullable ClientSettings clientSettings, Map<Api<?>, Boolean> map2, @Nullable Api.AbstractClientBuilder<? extends zae, SignInOptions> abstractClientBuilder, ArrayList<zas> arrayList, zabt zabt) {
        Map<Api.AnyClientKey<?>, ConnectionResult> map3;
        zabc zabc;
        zaba zaba;
        Lock lock2 = lock;
        Looper looper2 = looper;
        ArrayList<zas> arrayList2 = arrayList;
        new HashMap();
        this.zab = map3;
        this.zak = context;
        this.zai = lock2;
        this.zal = googleApiAvailabilityLight;
        this.zaa = map;
        this.zac = clientSettings;
        this.zad = map2;
        this.zae = abstractClientBuilder;
        this.zag = zaaz;
        this.zah = zabt;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList2.get(i).zaa(this);
        }
        new zabc(this, looper2);
        this.zam = zabc;
        this.zaj = lock2.newCondition();
        new zaas(this);
        this.zan = zaba;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        this.zai.lock();
        try {
            this.zan.zaf(bundle2);
            this.zai.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zai.unlock();
            throw th2;
        }
    }

    public final void onConnectionSuspended(int i) {
        int i2 = i;
        this.zai.lock();
        try {
            this.zan.zah(i2);
            this.zai.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zai.unlock();
            throw th2;
        }
    }

    public final void zaa(@NonNull ConnectionResult connectionResult, @NonNull Api<?> api, boolean z) {
        ConnectionResult connectionResult2 = connectionResult;
        Api<?> api2 = api;
        boolean z2 = z;
        this.zai.lock();
        try {
            this.zan.zag(connectionResult2, api2, z2);
            this.zai.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zai.unlock();
            throw th2;
        }
    }

    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zab(@NonNull T t) {
        T t2 = t;
        t2.zak();
        BaseImplementation.ApiMethodImpl zab2 = this.zan.zab(t2);
        return t2;
    }

    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zac(@NonNull T t) {
        T t2 = t;
        t2.zak();
        return this.zan.zac(t2);
    }

    @GuardedBy("mLock")
    @Nullable
    public final ConnectionResult zad(@NonNull Api<?> api) {
        Api.AnyClientKey<?> zac2 = api.zac();
        if (this.zaa.containsKey(zac2)) {
            if (this.zaa.get(zac2).isConnected()) {
                return ConnectionResult.RESULT_SUCCESS;
            }
            if (this.zab.containsKey(zac2)) {
                return this.zab.get(zac2);
            }
        }
        return null;
    }

    @GuardedBy("mLock")
    public final void zae() {
        this.zan.zae();
    }

    @GuardedBy("mLock")
    public final ConnectionResult zaf() {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        zae();
        while (this.zan instanceof zaar) {
            try {
                this.zaj.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                new ConnectionResult(15, (PendingIntent) null);
                return connectionResult2;
            }
        }
        if (this.zan instanceof zaag) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult3 = this.zao;
        if (connectionResult3 != null) {
            return connectionResult3;
        }
        new ConnectionResult(13, (PendingIntent) null);
        return connectionResult;
    }

    @GuardedBy("mLock")
    public final ConnectionResult zag(long j, TimeUnit timeUnit) {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3;
        zae();
        long nanos = timeUnit.toNanos(j);
        while (true) {
            long j2 = nanos;
            if (this.zan instanceof zaar) {
                if (j2 <= 0) {
                    try {
                        zah();
                        new ConnectionResult(14, (PendingIntent) null);
                        return connectionResult3;
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        new ConnectionResult(15, (PendingIntent) null);
                        return connectionResult2;
                    }
                } else {
                    nanos = this.zaj.awaitNanos(j2);
                }
            } else if (this.zan instanceof zaag) {
                return ConnectionResult.RESULT_SUCCESS;
            } else {
                ConnectionResult connectionResult4 = this.zao;
                if (connectionResult4 != null) {
                    return connectionResult4;
                }
                new ConnectionResult(13, (PendingIntent) null);
                return connectionResult;
            }
        }
    }

    @GuardedBy("mLock")
    public final void zah() {
        if (this.zan.zad()) {
            this.zab.clear();
        }
    }

    public final boolean zai() {
        return this.zan instanceof zaag;
    }

    public final boolean zaj() {
        return this.zan instanceof zaar;
    }

    public final boolean zak(SignInConnectionListener signInConnectionListener) {
        SignInConnectionListener signInConnectionListener2 = signInConnectionListener;
        return false;
    }

    @GuardedBy("mLock")
    public final void zal() {
        if (this.zan instanceof zaag) {
            ((zaag) this.zan).zai();
        }
    }

    public final void zam() {
    }

    public final void zan(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        String str2 = str;
        FileDescriptor fileDescriptor2 = fileDescriptor;
        PrintWriter printWriter2 = printWriter;
        String[] strArr2 = strArr;
        String concat = String.valueOf(str2).concat("  ");
        printWriter2.append(str2).append("mState=").println(this.zan);
        for (Api next : this.zad.keySet()) {
            printWriter2.append(str2).append(next.zad()).println(":");
            ((Api.Client) Preconditions.checkNotNull(this.zaa.get(next.zac()))).dump(concat, fileDescriptor2, printWriter2, strArr2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zao() {
        zaba zaba;
        this.zai.lock();
        try {
            new zaar(this, this.zac, this.zad, this.zal, this.zae, this.zai, this.zak);
            this.zan = zaba;
            this.zan.zaa();
            this.zaj.signalAll();
            this.zai.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zai.unlock();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zap() {
        zaba zaba;
        this.zai.lock();
        try {
            boolean zad2 = this.zag.zad();
            new zaag(this);
            this.zan = zaba;
            this.zan.zaa();
            this.zaj.signalAll();
            this.zai.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zai.unlock();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zaq(@Nullable ConnectionResult connectionResult) {
        zaba zaba;
        this.zai.lock();
        try {
            this.zao = connectionResult;
            new zaas(this);
            this.zan = zaba;
            this.zan.zaa();
            this.zaj.signalAll();
            this.zai.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zai.unlock();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zar(zabb zabb) {
        boolean sendMessage = this.zam.sendMessage(this.zam.obtainMessage(1, zabb));
    }

    /* access modifiers changed from: package-private */
    public final void zas(RuntimeException runtimeException) {
        boolean sendMessage = this.zam.sendMessage(this.zam.obtainMessage(2, runtimeException));
    }
}
