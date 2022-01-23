package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaar implements zaba {
    /* access modifiers changed from: private */
    public final zabd zaa;
    /* access modifiers changed from: private */
    public final Lock zab;
    /* access modifiers changed from: private */
    public final Context zac;
    /* access modifiers changed from: private */
    public final GoogleApiAvailabilityLight zad;
    @Nullable
    private ConnectionResult zae;
    private int zaf;
    private int zag = 0;
    private int zah;
    private final Bundle zai;
    private final Set<Api.AnyClientKey> zaj;
    /* access modifiers changed from: private */
    @Nullable
    public zae zak;
    private boolean zal;
    /* access modifiers changed from: private */
    public boolean zam;
    private boolean zan;
    /* access modifiers changed from: private */
    @Nullable
    public IAccountAccessor zao;
    private boolean zap;
    private boolean zaq;
    /* access modifiers changed from: private */
    @Nullable
    public final ClientSettings zar;
    private final Map<Api<?>, Boolean> zas;
    @Nullable
    private final Api.AbstractClientBuilder<? extends zae, SignInOptions> zat;
    private final ArrayList<Future<?>> zau;

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zaar(com.google.android.gms.common.api.internal.zabd r12, @androidx.annotation.Nullable com.google.android.gms.common.internal.ClientSettings r13, java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> r14, com.google.android.gms.common.GoogleApiAvailabilityLight r15, @androidx.annotation.Nullable com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> r16, java.util.concurrent.locks.Lock r17, android.content.Context r18) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r0
            r9.<init>()
            r9 = r0
            r10 = 0
            r9.zag = r10
            android.os.Bundle r9 = new android.os.Bundle
            r8 = r9
            r9 = r8
            r9.<init>()
            r9 = r0
            r10 = r8
            r9.zai = r10
            java.util.HashSet r9 = new java.util.HashSet
            r8 = r9
            r9 = r8
            r9.<init>()
            r9 = r0
            r10 = r8
            r9.zaj = r10
            java.util.ArrayList r9 = new java.util.ArrayList
            r8 = r9
            r9 = r8
            r9.<init>()
            r9 = r0
            r10 = r8
            r9.zau = r10
            r9 = r0
            r10 = r1
            r9.zaa = r10
            r9 = r0
            r10 = r2
            r9.zar = r10
            r9 = r0
            r10 = r3
            r9.zas = r10
            r9 = r0
            r10 = r4
            r9.zad = r10
            r9 = r0
            r10 = r5
            r9.zat = r10
            r9 = r0
            r10 = r6
            r9.zab = r10
            r9 = r0
            r10 = r7
            r9.zac = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaar.<init>(com.google.android.gms.common.api.internal.zabd, com.google.android.gms.common.internal.ClientSettings, java.util.Map, com.google.android.gms.common.GoogleApiAvailabilityLight, com.google.android.gms.common.api.Api$AbstractClientBuilder, java.util.concurrent.locks.Lock, android.content.Context):void");
    }

    @GuardedBy("mLock")
    private final void zaB() {
        Runnable runnable;
        Bundle bundle;
        this.zaa.zap();
        ExecutorService zaa2 = zabe.zaa();
        new zaah(this);
        zaa2.execute(runnable);
        zae zae2 = this.zak;
        if (zae2 != null) {
            if (this.zap) {
                zae2.zab((IAccountAccessor) Preconditions.checkNotNull(this.zao), this.zaq);
            }
            zaG(false);
        }
        for (Api.AnyClientKey anyClientKey : this.zaa.zab.keySet()) {
            ((Api.Client) Preconditions.checkNotNull(this.zaa.zaa.get(anyClientKey))).disconnect();
        }
        if (this.zai.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.zai;
        }
        this.zaa.zah.zaa(bundle);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zaC(ConnectionResult connectionResult, Api<?> api, boolean z) {
        ConnectionResult connectionResult2 = connectionResult;
        Api<?> api2 = api;
        int priority = api2.zaa().getPriority();
        if ((!z || connectionResult2.hasResolution() || this.zad.getErrorResolutionIntent(connectionResult2.getErrorCode()) != null) && (this.zae == null || priority < this.zaf)) {
            this.zae = connectionResult2;
            this.zaf = priority;
        }
        ConnectionResult put = this.zaa.zab.put(api2.zac(), connectionResult2);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zaD() {
        Object obj;
        this.zam = false;
        this.zaa.zag.zad = Collections.emptySet();
        for (Api.AnyClientKey next : this.zaj) {
            if (!this.zaa.zab.containsKey(next)) {
                Map<Api.AnyClientKey<?>, ConnectionResult> map = this.zaa.zab;
                new ConnectionResult(17, (PendingIntent) null);
                ConnectionResult put = map.put(next, obj);
            }
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean zaE(ConnectionResult connectionResult) {
        return this.zal && !connectionResult.hasResolution();
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zaF(ConnectionResult connectionResult) {
        ConnectionResult connectionResult2 = connectionResult;
        zaH();
        zaG(!connectionResult2.hasResolution());
        this.zaa.zaq(connectionResult2);
        this.zaa.zah.zab(connectionResult2);
    }

    @GuardedBy("mLock")
    private final void zaG(boolean z) {
        boolean z2 = z;
        zae zae2 = this.zak;
        if (zae2 != null) {
            if (zae2.isConnected() && z2) {
                zae2.zac();
            }
            zae2.disconnect();
            ClientSettings clientSettings = (ClientSettings) Preconditions.checkNotNull(this.zar);
            this.zao = null;
        }
    }

    private final void zaH() {
        ArrayList<Future<?>> arrayList = this.zau;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            boolean cancel = arrayList.get(i).cancel(true);
        }
        this.zau.clear();
    }

    @GuardedBy("mLock")
    private final boolean zaI(int i) {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        Throwable th;
        ConnectionResult connectionResult;
        int i2 = i;
        if (this.zag == i2) {
            return true;
        }
        int w = Log.w("GACConnecting", this.zaa.zag.zae());
        String valueOf = String.valueOf(this);
        new StringBuilder(String.valueOf(valueOf).length() + 23);
        StringBuilder append = sb.append("Unexpected callback in ");
        StringBuilder append2 = sb.append(valueOf);
        int w2 = Log.w("GACConnecting", sb.toString());
        int i3 = this.zah;
        new StringBuilder(33);
        StringBuilder append3 = sb2.append("mRemainingConnections=");
        StringBuilder append4 = sb2.append(i3);
        int w3 = Log.w("GACConnecting", sb2.toString());
        String zaJ = zaJ(this.zag);
        String zaJ2 = zaJ(i2);
        new StringBuilder(zaJ.length() + 70 + zaJ2.length());
        StringBuilder append5 = sb3.append("GoogleApiClient connecting is in step ");
        StringBuilder append6 = sb3.append(zaJ);
        StringBuilder append7 = sb3.append(" but received callback for step ");
        StringBuilder append8 = sb3.append(zaJ2);
        String sb4 = sb3.toString();
        new Exception();
        int e = Log.e("GACConnecting", sb4, th);
        new ConnectionResult(8, (PendingIntent) null);
        zaF(connectionResult);
        return false;
    }

    private static final String zaJ(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            default:
                return "STEP_GETTING_REMOTE_SERVICE";
        }
    }

    static /* synthetic */ Set zap(zaar zaar) {
        Set set;
        Set set2;
        zaar zaar2 = zaar;
        ClientSettings clientSettings = zaar2.zar;
        if (clientSettings == null) {
            set2 = Collections.emptySet();
        } else {
            new HashSet(clientSettings.getRequiredScopes());
            Map<Api<?>, zab> zaa2 = zaar2.zar.zaa();
            for (Api next : zaa2.keySet()) {
                if (!zaar2.zaa.zab.containsKey(next.zac())) {
                    boolean addAll = set.addAll(zaa2.get(next).zaa);
                }
            }
            set2 = set;
        }
        return set2;
    }

    static /* synthetic */ boolean zav(zaar zaar, int i) {
        int i2 = i;
        return zaar.zaI(0);
    }

    static /* synthetic */ void zay(zaar zaar, zak zak2) {
        StringBuilder sb;
        Throwable th;
        zaar zaar2 = zaar;
        zak zak3 = zak2;
        if (zaar2.zaI(0)) {
            ConnectionResult zaa2 = zak3.zaa();
            if (zaa2.isSuccess()) {
                zav zav = (zav) Preconditions.checkNotNull(zak3.zab());
                ConnectionResult zab2 = zav.zab();
                if (!zab2.isSuccess()) {
                    String valueOf = String.valueOf(zab2);
                    new StringBuilder(String.valueOf(valueOf).length() + 48);
                    StringBuilder append = sb.append("Sign-in succeeded with resolve account failure: ");
                    StringBuilder append2 = sb.append(valueOf);
                    String sb2 = sb.toString();
                    new Exception();
                    int wtf = Log.wtf("GACConnecting", sb2, th);
                    zaar2.zaF(zab2);
                    return;
                }
                zaar2.zan = true;
                zaar2.zao = (IAccountAccessor) Preconditions.checkNotNull(zav.zaa());
                zaar2.zap = zav.zac();
                zaar2.zaq = zav.zad();
                zaar2.zaA();
            } else if (zaar2.zaE(zaa2)) {
                zaar2.zaD();
                zaar2.zaA();
            } else {
                zaar2.zaF(zaa2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: com.google.android.gms.common.api.Api$AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions>} */
    /* JADX WARNING: type inference failed for: r15v0, types: [com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener] */
    /* JADX WARNING: type inference failed for: r9v20, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    /* JADX WARNING: Multi-variable type inference failed */
    @javax.annotation.concurrent.GuardedBy("mLock")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zaa() {
        /*
            r16 = this;
            r0 = r16
            r8 = r0
            com.google.android.gms.common.api.internal.zabd r8 = r8.zaa
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult> r8 = r8.zab
            r8.clear()
            r8 = r0
            r9 = 0
            r8.zam = r9
            r8 = r0
            r9 = 0
            r8.zae = r9
            r8 = r0
            r9 = 0
            r8.zag = r9
            r8 = r0
            r9 = 1
            r8.zal = r9
            r8 = r0
            r9 = 0
            r8.zan = r9
            r8 = r0
            r9 = 0
            r8.zap = r9
            java.util.HashMap r8 = new java.util.HashMap
            r3 = r8
            r8 = r3
            r8.<init>()
            r8 = r0
            java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> r8 = r8.zas
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
            r4 = r8
            r8 = 0
            r1 = r8
        L_0x0037:
            r8 = r4
            boolean r8 = r8.hasNext()
            if (r8 == 0) goto L_0x00b2
            r8 = r4
            java.lang.Object r8 = r8.next()
            com.google.android.gms.common.api.Api r8 = (com.google.android.gms.common.api.Api) r8
            r5 = r8
            r8 = r0
            com.google.android.gms.common.api.internal.zabd r8 = r8.zaa
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r8 = r8.zaa
            r9 = r5
            com.google.android.gms.common.api.Api$AnyClientKey r9 = r9.zac()
            java.lang.Object r8 = r8.get(r9)
            com.google.android.gms.common.api.Api$Client r8 = (com.google.android.gms.common.api.Api.Client) r8
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            com.google.android.gms.common.api.Api$Client r8 = (com.google.android.gms.common.api.Api.Client) r8
            r6 = r8
            r8 = r5
            com.google.android.gms.common.api.Api$BaseClientBuilder r8 = r8.zaa()
            int r8 = r8.getPriority()
            r9 = 1
            if (r8 != r9) goto L_0x00af
            r8 = 1
            r2 = r8
        L_0x006b:
            r8 = r1
            r9 = r2
            r8 = r8 | r9
            r1 = r8
            r8 = r0
            java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> r8 = r8.zas
            r9 = r5
            java.lang.Object r8 = r8.get(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = r8
            r8 = r6
            boolean r8 = r8.requiresSignIn()
            if (r8 == 0) goto L_0x0098
            r8 = r0
            r9 = 1
            r8.zam = r9
            r8 = r2
            if (r8 == 0) goto L_0x00aa
            r8 = r0
            java.util.Set<com.google.android.gms.common.api.Api$AnyClientKey> r8 = r8.zaj
            r9 = r5
            com.google.android.gms.common.api.Api$AnyClientKey r9 = r9.zac()
            boolean r8 = r8.add(r9)
        L_0x0098:
            com.google.android.gms.common.api.internal.zaai r8 = new com.google.android.gms.common.api.internal.zaai
            r7 = r8
            r8 = r7
            r9 = r0
            r10 = r5
            r11 = r2
            r8.<init>(r9, r10, r11)
            r8 = r3
            r9 = r6
            r10 = r7
            java.lang.Object r8 = r8.put(r9, r10)
            goto L_0x0037
        L_0x00aa:
            r8 = r0
            r9 = 0
            r8.zal = r9
            goto L_0x0098
        L_0x00af:
            r8 = 0
            r2 = r8
            goto L_0x006b
        L_0x00b2:
            r8 = r1
            if (r8 == 0) goto L_0x00b9
            r8 = r0
            r9 = 0
            r8.zam = r9
        L_0x00b9:
            r8 = r0
            boolean r8 = r8.zam
            if (r8 == 0) goto L_0x0114
            r8 = r0
            com.google.android.gms.common.internal.ClientSettings r8 = r8.zar
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            r8 = r0
            com.google.android.gms.common.api.Api$AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> r8 = r8.zat
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            r8 = r0
            com.google.android.gms.common.internal.ClientSettings r8 = r8.zar
            r9 = r0
            com.google.android.gms.common.api.internal.zabd r9 = r9.zaa
            com.google.android.gms.common.api.internal.zaaz r9 = r9.zag
            int r9 = java.lang.System.identityHashCode(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.zae(r9)
            com.google.android.gms.common.api.internal.zaap r8 = new com.google.android.gms.common.api.internal.zaap
            r1 = r8
            r8 = r1
            r9 = r0
            r10 = 0
            r8.<init>(r9, r10)
            r8 = r0
            com.google.android.gms.common.api.Api$AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> r8 = r8.zat
            r2 = r8
            r8 = r0
            android.content.Context r8 = r8.zac
            r4 = r8
            r8 = r0
            com.google.android.gms.common.api.internal.zabd r8 = r8.zaa
            r5 = r8
            r8 = r5
            com.google.android.gms.common.api.internal.zaaz r8 = r8.zag
            r5 = r8
            r8 = r5
            android.os.Looper r8 = r8.getLooper()
            r5 = r8
            r8 = r0
            com.google.android.gms.common.internal.ClientSettings r8 = r8.zar
            r6 = r8
            r8 = r0
            r9 = r2
            r10 = r4
            r11 = r5
            r12 = r6
            r13 = r6
            com.google.android.gms.signin.SignInOptions r13 = r13.zac()
            r14 = r1
            r15 = r1
            com.google.android.gms.common.api.Api$Client r9 = r9.buildClient((android.content.Context) r10, (android.os.Looper) r11, (com.google.android.gms.common.internal.ClientSettings) r12, r13, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r14, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r15)
            r8.zak = r9
        L_0x0114:
            r8 = r0
            r9 = r0
            com.google.android.gms.common.api.internal.zabd r9 = r9.zaa
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r9 = r9.zaa
            int r9 = r9.size()
            r8.zah = r9
            r8 = r0
            java.util.ArrayList<java.util.concurrent.Future<?>> r8 = r8.zau
            r1 = r8
            java.util.concurrent.ExecutorService r8 = com.google.android.gms.common.api.internal.zabe.zaa()
            r2 = r8
            com.google.android.gms.common.api.internal.zaal r8 = new com.google.android.gms.common.api.internal.zaal
            r4 = r8
            r8 = r4
            r9 = r0
            r10 = r3
            r8.<init>(r9, r10)
            r8 = r1
            r9 = r2
            r10 = r4
            java.util.concurrent.Future r9 = r9.submit(r10)
            boolean r8 = r8.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaar.zaa():void");
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zab(T t) {
        T t2 = t;
        boolean add = this.zaa.zag.zaa.add(t2);
        return t2;
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zac(T t) {
        Throwable th;
        T t2 = t;
        new IllegalStateException("GoogleApiClient is not connected yet.");
        throw th;
    }

    @GuardedBy("mLock")
    public final boolean zad() {
        zaH();
        zaG(true);
        this.zaa.zaq((ConnectionResult) null);
        return true;
    }

    public final void zae() {
    }

    @GuardedBy("mLock")
    public final void zaf(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        if (zaI(1)) {
            if (bundle2 != null) {
                this.zai.putAll(bundle2);
            }
            if (zaz()) {
                zaB();
            }
        }
    }

    @GuardedBy("mLock")
    public final void zag(ConnectionResult connectionResult, Api<?> api, boolean z) {
        ConnectionResult connectionResult2 = connectionResult;
        Api<?> api2 = api;
        boolean z2 = z;
        if (zaI(1)) {
            zaC(connectionResult2, api2, z2);
            if (zaz()) {
                zaB();
            }
        }
    }

    @GuardedBy("mLock")
    public final void zah(int i) {
        ConnectionResult connectionResult;
        int i2 = i;
        new ConnectionResult(8, (PendingIntent) null);
        zaF(connectionResult);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean zaz() {
        Throwable th;
        ConnectionResult connectionResult;
        int i = this.zah - 1;
        this.zah = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            int w = Log.w("GACConnecting", this.zaa.zag.zae());
            new Exception();
            int wtf = Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", th);
            new ConnectionResult(8, (PendingIntent) null);
            zaF(connectionResult);
            return false;
        }
        ConnectionResult connectionResult2 = this.zae;
        if (connectionResult2 == null) {
            return true;
        }
        this.zaa.zaf = this.zaf;
        zaF(connectionResult2);
        return false;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zaA() {
        ArrayList arrayList;
        Runnable runnable;
        if (this.zah == 0) {
            if (!this.zam || this.zan) {
                new ArrayList();
                this.zag = 1;
                this.zah = this.zaa.zaa.size();
                for (Api.AnyClientKey next : this.zaa.zaa.keySet()) {
                    if (!this.zaa.zab.containsKey(next)) {
                        boolean add = arrayList.add(this.zaa.zaa.get(next));
                    } else if (zaz()) {
                        zaB();
                    }
                }
                if (!arrayList.isEmpty()) {
                    ArrayList<Future<?>> arrayList2 = this.zau;
                    ExecutorService zaa2 = zabe.zaa();
                    new zaam(this, arrayList);
                    boolean add2 = arrayList2.add(zaa2.submit(runnable));
                }
            }
        }
    }
}
