package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaak extends zabb {
    final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zaak(zaal zaal, zaba zaba, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zaba);
        zaal zaal2 = zaal;
        this.zaa = connectionProgressReportCallbacks;
    }

    @GuardedBy("mLock")
    public final void zaa() {
        ConnectionResult connectionResult;
        BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = this.zaa;
        new ConnectionResult(16, (PendingIntent) null);
        connectionProgressReportCallbacks.onReportServiceBinding(connectionResult);
    }
}
