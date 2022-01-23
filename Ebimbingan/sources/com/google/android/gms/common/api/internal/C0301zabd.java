package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.C0190GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.signin.C1134SignInOptions;
import com.google.android.gms.signin.C1152zae;
import com.microsoft.appcenter.Constants;
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

/* renamed from: com.google.android.gms.common.api.internal.zabd */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0301zabd implements C0318zabu, C0365zat {
    final Map<C0211Api.AnyClientKey<?>, C0211Api.Client> zaa;
    final Map<C0211Api.AnyClientKey<?>, C0184ConnectionResult> zab;
    @Nullable
    final C0427ClientSettings zac;
    final Map<C0211Api<?>, Boolean> zad;
    @Nullable
    final C0211Api.AbstractClientBuilder<? extends C1152zae, C1134SignInOptions> zae;
    int zaf;
    final C0296zaaz zag;
    final C0317zabt zah;
    /* access modifiers changed from: private */
    public final Lock zai;
    private final Condition zaj;
    private final Context zak;
    private final C0190GoogleApiAvailabilityLight zal;
    private final C0300zabc zam;
    /* access modifiers changed from: private */
    @NotOnlyInitialized
    public volatile C0298zaba zan;
    @Nullable
    private C0184ConnectionResult zao = null;

    public C0301zabd(Context context, C0296zaaz zaaz, Lock lock, Looper looper, C0190GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<C0211Api.AnyClientKey<?>, C0211Api.Client> map, @Nullable C0427ClientSettings clientSettings, Map<C0211Api<?>, Boolean> map2, @Nullable C0211Api.AbstractClientBuilder<? extends C1152zae, C1134SignInOptions> abstractClientBuilder, ArrayList<C0364zas> arrayList, C0317zabt zabt) {
        Map<C0211Api.AnyClientKey<?>, C0184ConnectionResult> map3;
        C0300zabc zabc;
        C0298zaba zaba;
        Lock lock2 = lock;
        Looper looper2 = looper;
        ArrayList<C0364zas> arrayList2 = arrayList;
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
        new C0300zabc(this, looper2);
        this.zam = zabc;
        this.zaj = lock2.newCondition();
        new C0289zaas(this);
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

    public final void zaa(@NonNull C0184ConnectionResult connectionResult, @NonNull C0211Api<?> api, boolean z) {
        C0184ConnectionResult connectionResult2 = connectionResult;
        C0211Api<?> api2 = api;
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
    public final <A extends C0211Api.AnyClient, R extends C0231Result, T extends C0243BaseImplementation.ApiMethodImpl<R, A>> T zab(@NonNull T t) {
        T t2 = t;
        t2.zak();
        C0243BaseImplementation.ApiMethodImpl zab2 = this.zan.zab(t2);
        return t2;
    }

    @GuardedBy("mLock")
    public final <A extends C0211Api.AnyClient, T extends C0243BaseImplementation.ApiMethodImpl<? extends C0231Result, A>> T zac(@NonNull T t) {
        T t2 = t;
        t2.zak();
        return this.zan.zac(t2);
    }

    @GuardedBy("mLock")
    @Nullable
    public final C0184ConnectionResult zad(@NonNull C0211Api<?> api) {
        C0211Api.AnyClientKey<?> zac2 = api.zac();
        if (this.zaa.containsKey(zac2)) {
            if (this.zaa.get(zac2).isConnected()) {
                return C0184ConnectionResult.RESULT_SUCCESS;
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
    public final C0184ConnectionResult zaf() {
        C0184ConnectionResult connectionResult;
        C0184ConnectionResult connectionResult2;
        zae();
        while (this.zan instanceof C0288zaar) {
            try {
                this.zaj.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                new C0184ConnectionResult(15, (PendingIntent) null);
                return connectionResult2;
            }
        }
        if (this.zan instanceof C0277zaag) {
            return C0184ConnectionResult.RESULT_SUCCESS;
        }
        C0184ConnectionResult connectionResult3 = this.zao;
        if (connectionResult3 != null) {
            return connectionResult3;
        }
        new C0184ConnectionResult(13, (PendingIntent) null);
        return connectionResult;
    }

    @GuardedBy("mLock")
    public final C0184ConnectionResult zag(long j, TimeUnit timeUnit) {
        C0184ConnectionResult connectionResult;
        C0184ConnectionResult connectionResult2;
        C0184ConnectionResult connectionResult3;
        zae();
        long nanos = timeUnit.toNanos(j);
        while (true) {
            long j2 = nanos;
            if (this.zan instanceof C0288zaar) {
                if (j2 <= 0) {
                    try {
                        zah();
                        new C0184ConnectionResult(14, (PendingIntent) null);
                        return connectionResult3;
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        new C0184ConnectionResult(15, (PendingIntent) null);
                        return connectionResult2;
                    }
                } else {
                    nanos = this.zaj.awaitNanos(j2);
                }
            } else if (this.zan instanceof C0277zaag) {
                return C0184ConnectionResult.RESULT_SUCCESS;
            } else {
                C0184ConnectionResult connectionResult4 = this.zao;
                if (connectionResult4 != null) {
                    return connectionResult4;
                }
                new C0184ConnectionResult(13, (PendingIntent) null);
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
        return this.zan instanceof C0277zaag;
    }

    public final boolean zaj() {
        return this.zan instanceof C0288zaar;
    }

    public final boolean zak(C0263SignInConnectionListener signInConnectionListener) {
        C0263SignInConnectionListener signInConnectionListener2 = signInConnectionListener;
        return false;
    }

    @GuardedBy("mLock")
    public final void zal() {
        if (this.zan instanceof C0277zaag) {
            ((C0277zaag) this.zan).zai();
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
        for (C0211Api next : this.zad.keySet()) {
            printWriter2.append(str2).append(next.zad()).println(Constants.COMMON_SCHEMA_PREFIX_SEPARATOR);
            ((C0211Api.Client) C0446Preconditions.checkNotNull(this.zaa.get(next.zac()))).dump(concat, fileDescriptor2, printWriter2, strArr2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zao() {
        C0298zaba zaba;
        this.zai.lock();
        try {
            new C0288zaar(this, this.zac, this.zad, this.zal, this.zae, this.zai, this.zak);
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
        C0298zaba zaba;
        this.zai.lock();
        try {
            boolean zad2 = this.zag.zad();
            new C0277zaag(this);
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
    public final void zaq(@Nullable C0184ConnectionResult connectionResult) {
        C0298zaba zaba;
        this.zai.lock();
        try {
            this.zao = connectionResult;
            new C0289zaas(this);
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
    public final void zar(C0299zabb zabb) {
        boolean sendMessage = this.zam.sendMessage(this.zam.obtainMessage(1, zabb));
    }

    /* access modifiers changed from: package-private */
    public final void zas(RuntimeException runtimeException) {
        boolean sendMessage = this.zam.sendMessage(this.zam.obtainMessage(2, runtimeException));
    }
}
