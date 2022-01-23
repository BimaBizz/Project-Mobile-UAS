package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.internal.C0424BaseGmsClient;
import com.google.android.gms.common.internal.C0437IAccountAccessor;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.zabo */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0312zabo implements C0424BaseGmsClient.ConnectionProgressReportCallbacks, C0338zacn {
    final /* synthetic */ C0248GoogleApiManager zaa;
    /* access modifiers changed from: private */
    public final C0211Api.Client zab;
    /* access modifiers changed from: private */
    public final C0241ApiKey<?> zac;
    @Nullable
    private C0437IAccountAccessor zad = null;
    @Nullable
    private Set<C0235Scope> zae = null;
    private boolean zaf = false;

    public C0312zabo(C0248GoogleApiManager googleApiManager, C0211Api.Client client, C0241ApiKey<?> apiKey) {
        this.zaa = googleApiManager;
        this.zab = client;
        this.zac = apiKey;
    }

    static /* synthetic */ boolean zad(C0312zabo zabo, boolean z) {
        boolean z2 = z;
        zabo.zaf = true;
        return true;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zag() {
        C0437IAccountAccessor iAccountAccessor;
        if (this.zaf && (iAccountAccessor = this.zad) != null) {
            this.zab.getRemoteService(iAccountAccessor, this.zae);
        }
    }

    public final void onReportServiceBinding(@NonNull C0184ConnectionResult connectionResult) {
        Runnable runnable;
        Handler zas = this.zaa.zat;
        new C0311zabn(this, connectionResult);
        boolean post = zas.post(runnable);
    }

    @WorkerThread
    public final void zaa(C0184ConnectionResult connectionResult) {
        C0184ConnectionResult connectionResult2 = connectionResult;
        C0309zabl zabl = (C0309zabl) this.zaa.zap.get(this.zac);
        if (zabl != null) {
            zabl.zab(connectionResult2);
        }
    }

    @WorkerThread
    public final void zab(@Nullable C0437IAccountAccessor iAccountAccessor, @Nullable Set<C0235Scope> set) {
        Throwable th;
        C0184ConnectionResult connectionResult;
        C0437IAccountAccessor iAccountAccessor2 = iAccountAccessor;
        Set<C0235Scope> set2 = set;
        if (iAccountAccessor2 == null || set2 == null) {
            new Exception();
            int wtf = Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", th);
            new C0184ConnectionResult(4);
            zaa(connectionResult);
            return;
        }
        this.zad = iAccountAccessor2;
        this.zae = set2;
        zag();
    }
}
