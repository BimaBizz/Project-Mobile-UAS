package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.common.zzh;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class zzb extends zzh {
    final /* synthetic */ BaseGmsClient zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.zza = baseGmsClient;
    }

    private static final void zza(Message message) {
        zzc zzc = (zzc) message.obj;
        zzc.zzc();
        zzc.zzf();
    }

    private static final boolean zzb(Message message) {
        Message message2 = message;
        return message2.what == 2 || message2.what == 1 || message2.what == 7;
    }

    public final void handleMessage(Message message) {
        StringBuilder sb;
        Throwable th;
        PendingIntent pendingIntent;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3;
        ConnectionResult connectionResult4;
        Message message2 = message;
        if (this.zza.zzd.get() != message2.arg1) {
            if (zzb(message2)) {
                zza(message2);
            }
        } else if ((message2.what == 1 || message2.what == 7 || ((message2.what == 4 && !this.zza.enableLocalFallback()) || message2.what == 5)) && !this.zza.isConnecting()) {
            zza(message2);
        } else if (message2.what == 4) {
            BaseGmsClient baseGmsClient = this.zza;
            new ConnectionResult(message2.arg2);
            ConnectionResult zzf = BaseGmsClient.zzf(baseGmsClient, connectionResult3);
            if (!BaseGmsClient.zzg(this.zza) || this.zza.zzC) {
                if (this.zza.zzB != null) {
                    connectionResult4 = this.zza.zzB;
                } else {
                    new ConnectionResult(8);
                }
                this.zza.zzc.onReportServiceBinding(connectionResult4);
                this.zza.onConnectionFailed(connectionResult4);
                return;
            }
            BaseGmsClient.zzi(this.zza, 3, (IInterface) null);
        } else if (message2.what == 5) {
            if (this.zza.zzB != null) {
                connectionResult2 = this.zza.zzB;
            } else {
                new ConnectionResult(8);
            }
            this.zza.zzc.onReportServiceBinding(connectionResult2);
            this.zza.onConnectionFailed(connectionResult2);
        } else if (message2.what == 3) {
            if (message2.obj instanceof PendingIntent) {
                pendingIntent = (PendingIntent) message2.obj;
            } else {
                pendingIntent = null;
            }
            new ConnectionResult(message2.arg2, pendingIntent);
            this.zza.zzc.onReportServiceBinding(connectionResult);
            this.zza.onConnectionFailed(connectionResult);
        } else if (message2.what == 6) {
            BaseGmsClient.zzi(this.zza, 5, (IInterface) null);
            if (this.zza.zzw != null) {
                this.zza.zzw.onConnectionSuspended(message2.arg2);
            }
            this.zza.onConnectionSuspended(message2.arg2);
            boolean zzl = BaseGmsClient.zzl(this.zza, 5, 1, (IInterface) null);
        } else if (message2.what == 2 && !this.zza.isConnected()) {
            zza(message2);
        } else if (zzb(message2)) {
            ((zzc) message2.obj).zze();
        } else {
            int i = message2.what;
            new StringBuilder(45);
            StringBuilder append = sb.append("Don't know how to handle message: ");
            StringBuilder append2 = sb.append(i);
            String sb2 = sb.toString();
            new Exception();
            int wtf = Log.wtf("GmsClient", sb2, th);
        }
    }
}
