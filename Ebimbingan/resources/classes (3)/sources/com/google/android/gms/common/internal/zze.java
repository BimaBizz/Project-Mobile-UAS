package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zze implements ServiceConnection {
    final /* synthetic */ BaseGmsClient zza;
    private final int zzb;

    public zze(BaseGmsClient baseGmsClient, int i) {
        this.zza = baseGmsClient;
        this.zzb = i;
    }

    /* JADX INFO: finally extract failed */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IGmsServiceBroker iGmsServiceBroker;
        ComponentName componentName2 = componentName;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            BaseGmsClient.zzc(this.zza, 16);
            return;
        }
        Object zzd = this.zza.zzq;
        synchronized (zzd) {
            try {
                BaseGmsClient baseGmsClient = this.zza;
                IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) {
                    new zzab(iBinder2);
                } else {
                    iGmsServiceBroker = (IGmsServiceBroker) queryLocalInterface;
                }
                IGmsServiceBroker zze = BaseGmsClient.zze(baseGmsClient, iGmsServiceBroker);
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj = zzd;
                throw th2;
            }
        }
        this.zza.zzb(0, (Bundle) null, this.zzb);
    }

    /* JADX INFO: finally extract failed */
    public final void onServiceDisconnected(ComponentName componentName) {
        ComponentName componentName2 = componentName;
        Object zzd = this.zza.zzq;
        synchronized (zzd) {
            try {
                IGmsServiceBroker zze = BaseGmsClient.zze(this.zza, (IGmsServiceBroker) null);
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Object obj = zzd;
                    throw th2;
                }
            }
        }
        Handler handler = this.zza.zzb;
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(6, this.zzb, 1));
    }
}
