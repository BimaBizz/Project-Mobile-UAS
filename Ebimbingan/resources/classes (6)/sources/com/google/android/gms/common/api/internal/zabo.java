package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zabo implements BaseGmsClient.ConnectionProgressReportCallbacks, zacn {
    final /* synthetic */ GoogleApiManager zaa;
    /* access modifiers changed from: private */
    public final Api.Client zab;
    /* access modifiers changed from: private */
    public final ApiKey<?> zac;
    @Nullable
    private IAccountAccessor zad = null;
    @Nullable
    private Set<Scope> zae = null;
    private boolean zaf = false;

    public zabo(GoogleApiManager googleApiManager, Api.Client client, ApiKey<?> apiKey) {
        this.zaa = googleApiManager;
        this.zab = client;
        this.zac = apiKey;
    }

    static /* synthetic */ boolean zad(zabo zabo, boolean z) {
        boolean z2 = z;
        zabo.zaf = true;
        return true;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zag() {
        IAccountAccessor iAccountAccessor;
        if (this.zaf && (iAccountAccessor = this.zad) != null) {
            this.zab.getRemoteService(iAccountAccessor, this.zae);
        }
    }

    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        Runnable runnable;
        Handler zas = this.zaa.zat;
        new zabn(this, connectionResult);
        boolean post = zas.post(runnable);
    }

    @WorkerThread
    public final void zaa(ConnectionResult connectionResult) {
        ConnectionResult connectionResult2 = connectionResult;
        zabl zabl = (zabl) this.zaa.zap.get(this.zac);
        if (zabl != null) {
            zabl.zab(connectionResult2);
        }
    }

    @WorkerThread
    public final void zab(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set) {
        Throwable th;
        ConnectionResult connectionResult;
        IAccountAccessor iAccountAccessor2 = iAccountAccessor;
        Set<Scope> set2 = set;
        if (iAccountAccessor2 == null || set2 == null) {
            new Exception();
            int wtf = Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", th);
            new ConnectionResult(4);
            zaa(connectionResult);
            return;
        }
        this.zad = iAccountAccessor2;
        this.zae = set2;
        zag();
    }
}
