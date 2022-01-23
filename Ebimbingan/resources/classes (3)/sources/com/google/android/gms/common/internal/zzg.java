package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzg extends zza {
    final /* synthetic */ BaseGmsClient zze;

    /* JADX WARNING: Illegal instructions before constructor call */
    @androidx.annotation.BinderThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzg(com.google.android.gms.common.internal.BaseGmsClient r9, @androidx.annotation.Nullable int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r0
            r5 = r1
            r4.zze = r5
            r4 = r0
            r5 = r1
            r6 = r2
            r7 = 0
            r4.<init>(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzg.<init>(com.google.android.gms.common.internal.BaseGmsClient, int, android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final boolean zza() {
        this.zze.zzc.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void zzb(ConnectionResult connectionResult) {
        ConnectionResult connectionResult2 = connectionResult;
        if (!this.zze.enableLocalFallback() || !BaseGmsClient.zzg(this.zze)) {
            this.zze.zzc.onReportServiceBinding(connectionResult2);
            this.zze.onConnectionFailed(connectionResult2);
            return;
        }
        BaseGmsClient.zzc(this.zze, 16);
    }
}
