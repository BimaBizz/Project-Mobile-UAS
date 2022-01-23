package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzf extends zza {
    @Nullable
    public final IBinder zze;
    final /* synthetic */ BaseGmsClient zzf;

    /* JADX WARNING: Illegal instructions before constructor call */
    @androidx.annotation.BinderThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzf(com.google.android.gms.common.internal.BaseGmsClient r10, @androidx.annotation.Nullable int r11, @androidx.annotation.Nullable android.os.IBinder r12, android.os.Bundle r13) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r0
            r6 = r1
            r5.zzf = r6
            r5 = r0
            r6 = r1
            r7 = r2
            r8 = r4
            r5.<init>(r6, r7, r8)
            r5 = r0
            r6 = r3
            r5.zze = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzf.<init>(com.google.android.gms.common.internal.BaseGmsClient, int, android.os.IBinder, android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final boolean zza() {
        StringBuilder sb;
        try {
            IBinder iBinder = this.zze;
            Object checkNotNull = Preconditions.checkNotNull(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.zzf.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = this.zzf.getServiceDescriptor();
                new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                StringBuilder append = sb.append("service descriptor mismatch: ");
                StringBuilder append2 = sb.append(serviceDescriptor);
                StringBuilder append3 = sb.append(" vs. ");
                StringBuilder append4 = sb.append(interfaceDescriptor);
                int e = Log.e("GmsClient", sb.toString());
                return false;
            }
            IInterface createServiceInterface = this.zzf.createServiceInterface(this.zze);
            if (createServiceInterface == null || (!BaseGmsClient.zzl(this.zzf, 2, 4, createServiceInterface) && !BaseGmsClient.zzl(this.zzf, 3, 4, createServiceInterface))) {
                return false;
            }
            ConnectionResult zzf2 = BaseGmsClient.zzf(this.zzf, (ConnectionResult) null);
            Bundle connectionHint = this.zzf.getConnectionHint();
            if (this.zzf.zzw != null) {
                this.zzf.zzw.onConnected(connectionHint);
            }
            return true;
        } catch (RemoteException e2) {
            int w = Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzb(ConnectionResult connectionResult) {
        ConnectionResult connectionResult2 = connectionResult;
        if (this.zzf.zzx != null) {
            this.zzf.zzx.onConnectionFailed(connectionResult2);
        }
        this.zzf.onConnectionFailed(connectionResult2);
    }
}
