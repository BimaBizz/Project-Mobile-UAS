package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import com.google.android.gms.common.stats.C0580ConnectionTracker;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.zzq */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0537zzq extends C0434GmsClientSupervisor {
    /* access modifiers changed from: private */
    @GuardedBy("connectionStatus")
    public final HashMap<C0533zzm, C0535zzo> zza;
    /* access modifiers changed from: private */
    public final Context zzb;
    /* access modifiers changed from: private */
    public final Handler zzc;
    /* access modifiers changed from: private */
    public final C0580ConnectionTracker zzd = C0580ConnectionTracker.getInstance();
    private final long zze = 5000;
    /* access modifiers changed from: private */
    public final long zzf = 300000;

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0537zzq(android.content.Context r9) {
        /*
            r8 = this;
            r1 = r8
            r2 = r9
            r5 = r1
            r5.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r3 = r5
            r5 = r3
            r5.<init>()
            r5 = r1
            r6 = r3
            r5.zza = r6
            r5 = r1
            r6 = r2
            android.content.Context r6 = r6.getApplicationContext()
            r5.zzb = r6
            com.google.android.gms.internal.common.zzh r5 = new com.google.android.gms.internal.common.zzh
            r3 = r5
            r5 = r2
            android.os.Looper r5 = r5.getMainLooper()
            r2 = r5
            com.google.android.gms.common.internal.zzp r5 = new com.google.android.gms.common.internal.zzp
            r4 = r5
            r5 = r4
            r6 = r1
            r7 = 0
            r5.<init>(r6, r7)
            r5 = r3
            r6 = r2
            r7 = r4
            r5.<init>(r6, r7)
            r5 = r1
            r6 = r3
            r5.zzc = r6
            r5 = r1
            com.google.android.gms.common.stats.ConnectionTracker r6 = com.google.android.gms.common.stats.C0580ConnectionTracker.getInstance()
            r5.zzd = r6
            r5 = r1
            r6 = 5000(0x1388, double:2.4703E-320)
            r5.zze = r6
            r5 = r1
            r6 = 300000(0x493e0, double:1.482197E-318)
            r5.zzf = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0537zzq.<init>(android.content.Context):void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final boolean zzb(C0533zzm zzm, ServiceConnection serviceConnection, String str) {
        C0535zzo zzo;
        Throwable th;
        StringBuilder sb;
        boolean zze2;
        C0535zzo zzo2;
        C0533zzm zzm2 = zzm;
        ServiceConnection serviceConnection2 = serviceConnection;
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(serviceConnection2, "ServiceConnection must not be null");
        HashMap<C0533zzm, C0535zzo> hashMap = this.zza;
        synchronized (hashMap) {
            try {
                C0535zzo zzo3 = this.zza.get(zzm2);
                if (zzo3 != null) {
                    this.zzc.removeMessages(0, zzm2);
                    if (!zzo3.zzg(serviceConnection2)) {
                        zzo3.zzc(serviceConnection2, serviceConnection2, str2);
                        switch (zzo3.zzf()) {
                            case 1:
                                serviceConnection2.onServiceConnected(zzo3.zzj(), zzo3.zzi());
                                zzo = zzo3;
                                break;
                            case 2:
                                zzo3.zza(str2);
                                zzo = zzo3;
                                break;
                            default:
                                zzo = zzo3;
                                break;
                        }
                    } else {
                        String valueOf = String.valueOf(zzm2);
                        new StringBuilder(String.valueOf(valueOf).length() + 81);
                        StringBuilder append = sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        StringBuilder append2 = sb.append(valueOf);
                        new IllegalStateException(sb.toString());
                        throw th;
                    }
                } else {
                    new C0535zzo(this, zzm2);
                    zzo2.zzc(serviceConnection2, serviceConnection2, str2);
                    zzo2.zza(str2);
                    C0535zzo put = this.zza.put(zzm2, zzo2);
                    zzo = zzo2;
                }
                zze2 = zzo.zze();
            } catch (Throwable th2) {
                Throwable th3 = th2;
                HashMap<C0533zzm, C0535zzo> hashMap2 = hashMap;
                throw th3;
            }
        }
        return zze2;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void zzc(C0533zzm zzm, ServiceConnection serviceConnection, String str) {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        StringBuilder sb2;
        C0533zzm zzm2 = zzm;
        ServiceConnection serviceConnection2 = serviceConnection;
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(serviceConnection2, "ServiceConnection must not be null");
        HashMap<C0533zzm, C0535zzo> hashMap = this.zza;
        synchronized (hashMap) {
            try {
                C0535zzo zzo = this.zza.get(zzm2);
                if (zzo == null) {
                    String valueOf = String.valueOf(zzm2);
                    new StringBuilder(String.valueOf(valueOf).length() + 50);
                    StringBuilder append = sb2.append("Nonexistent connection status for service config: ");
                    StringBuilder append2 = sb2.append(valueOf);
                    new IllegalStateException(sb2.toString());
                    throw th2;
                } else if (!zzo.zzg(serviceConnection2)) {
                    String valueOf2 = String.valueOf(zzm2);
                    new StringBuilder(String.valueOf(valueOf2).length() + 76);
                    StringBuilder append3 = sb.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    StringBuilder append4 = sb.append(valueOf2);
                    new IllegalStateException(sb.toString());
                    throw th;
                } else {
                    zzo.zzd(serviceConnection2, str2);
                    if (zzo.zzh()) {
                        boolean sendMessageDelayed = this.zzc.sendMessageDelayed(this.zzc.obtainMessage(0, zzm2), this.zze);
                    }
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                HashMap<C0533zzm, C0535zzo> hashMap2 = hashMap;
                throw th4;
            }
        }
    }
}
