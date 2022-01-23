package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IInterface;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
abstract class zza extends zzc<Boolean> {
    public final int zza;
    @Nullable
    public final Bundle zzb;
    final /* synthetic */ BaseGmsClient zzc;

    /* JADX WARNING: Illegal instructions before constructor call */
    @androidx.annotation.BinderThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected zza(com.google.android.gms.common.internal.BaseGmsClient r8, @androidx.annotation.Nullable int r9, android.os.Bundle r10) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r0
            r5 = r1
            r4.zzc = r5
            r4 = r0
            r5 = r1
            r6 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4.<init>(r5, r6)
            r4 = r0
            r5 = r2
            r4.zza = r5
            r4 = r0
            r5 = r3
            r4.zzb = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zza.<init>(com.google.android.gms.common.internal.BaseGmsClient, int, android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public abstract boolean zza();

    /* access modifiers changed from: protected */
    public abstract void zzb(ConnectionResult connectionResult);

    /* access modifiers changed from: protected */
    public final void zzc() {
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzd(Object obj) {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        Object obj2 = obj;
        if (this.zza != 0) {
            BaseGmsClient.zzi(this.zzc, 1, (IInterface) null);
            Bundle bundle = this.zzb;
            new ConnectionResult(this.zza, bundle != null ? (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT) : null);
            zzb(connectionResult);
        } else if (!zza()) {
            BaseGmsClient.zzi(this.zzc, 1, (IInterface) null);
            new ConnectionResult(8, (PendingIntent) null);
            zzb(connectionResult2);
        }
    }
}
