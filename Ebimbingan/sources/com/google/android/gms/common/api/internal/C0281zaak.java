package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.internal.C0424BaseGmsClient;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.zaak */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0281zaak extends C0299zabb {
    final /* synthetic */ C0424BaseGmsClient.ConnectionProgressReportCallbacks zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0281zaak(C0282zaal zaal, C0298zaba zaba, C0424BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zaba);
        C0282zaal zaal2 = zaal;
        this.zaa = connectionProgressReportCallbacks;
    }

    @GuardedBy("mLock")
    public final void zaa() {
        C0184ConnectionResult connectionResult;
        C0424BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = this.zaa;
        new C0184ConnectionResult(16, (PendingIntent) null);
        connectionProgressReportCallbacks.onReportServiceBinding(connectionResult);
    }
}
