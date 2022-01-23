package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import java.util.HashMap;

/* renamed from: com.google.android.gms.common.internal.zzp */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0536zzp implements Handler.Callback {
    final /* synthetic */ C0537zzq zza;

    /* synthetic */ C0536zzp(C0537zzq zzq, C0534zzn zzn) {
        C0534zzn zzn2 = zzn;
        this.zza = zzq;
    }

    /* JADX INFO: finally extract failed */
    public final boolean handleMessage(Message message) {
        StringBuilder sb;
        Throwable th;
        Message message2 = message;
        switch (message2.what) {
            case 0:
                HashMap zzd = this.zza.zza;
                synchronized (zzd) {
                    try {
                        C0533zzm zzm = (C0533zzm) message2.obj;
                        C0535zzo zzo = (C0535zzo) this.zza.zza.get(zzm);
                        if (zzo != null && zzo.zzh()) {
                            if (zzo.zze()) {
                                zzo.zzb("GmsClientSupervisor");
                            }
                            Object remove = this.zza.zza.remove(zzm);
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            Throwable th3 = th2;
                            HashMap hashMap = zzd;
                            throw th3;
                            break;
                        }
                    }
                }
                return true;
            case 1:
                HashMap zzd2 = this.zza.zza;
                synchronized (zzd2) {
                    try {
                        C0533zzm zzm2 = (C0533zzm) message2.obj;
                        C0535zzo zzo2 = (C0535zzo) this.zza.zza.get(zzm2);
                        if (zzo2 != null && zzo2.zzf() == 3) {
                            String valueOf = String.valueOf(zzm2);
                            new StringBuilder(String.valueOf(valueOf).length() + 47);
                            StringBuilder append = sb.append("Timeout waiting for ServiceConnection callback ");
                            StringBuilder append2 = sb.append(valueOf);
                            String sb2 = sb.toString();
                            new Exception();
                            int e = Log.e("GmsClientSupervisor", sb2, th);
                            ComponentName zzj = zzo2.zzj();
                            if (zzj == null) {
                                zzj = zzm2.zzb();
                            }
                            if (zzj == null) {
                                String zza2 = zzm2.zza();
                                Object checkNotNull = C0446Preconditions.checkNotNull(zza2);
                                new ComponentName(zza2, EnvironmentCompat.MEDIA_UNKNOWN);
                            }
                            zzo2.onServiceDisconnected(zzj);
                        }
                    } catch (Throwable th4) {
                        while (true) {
                            Throwable th5 = th4;
                            HashMap hashMap2 = zzd2;
                            throw th5;
                            break;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
