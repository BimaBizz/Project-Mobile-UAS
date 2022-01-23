package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.zzc */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C0523zzc<TListener> {
    @Nullable
    private TListener zza;
    private boolean zzb = false;
    final /* synthetic */ C0424BaseGmsClient zzd;

    public C0523zzc(C0424BaseGmsClient baseGmsClient, TListener tlistener) {
        this.zzd = baseGmsClient;
        this.zza = tlistener;
    }

    /* access modifiers changed from: protected */
    public abstract void zzc();

    /* access modifiers changed from: protected */
    public abstract void zzd(TListener tlistener);

    /* JADX INFO: finally extract failed */
    public final void zze() {
        TListener tlistener;
        StringBuilder sb;
        synchronized (this) {
            try {
                tlistener = this.zza;
                if (this.zzb) {
                    String valueOf = String.valueOf(this);
                    new StringBuilder(String.valueOf(valueOf).length() + 47);
                    StringBuilder append = sb.append("Callback proxy ");
                    StringBuilder append2 = sb.append(valueOf);
                    StringBuilder append3 = sb.append(" being reused. This is not safe.");
                    int w = Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
        if (tlistener != null) {
            try {
                zzd(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            try {
                this.zzb = true;
            } catch (Throwable th3) {
                while (true) {
                    Throwable th4 = th3;
                    throw th4;
                }
            }
        }
        zzf();
    }

    public final void zzf() {
        zzg();
        ArrayList zzm = this.zzd.zzt;
        synchronized (zzm) {
            try {
                boolean remove = this.zzd.zzt.remove(this);
            } catch (Throwable th) {
                Throwable th2 = th;
                ArrayList arrayList = zzm;
                throw th2;
            }
        }
    }

    public final void zzg() {
        synchronized (this) {
            try {
                this.zza = null;
            } catch (Throwable th) {
                Throwable th2 = th;
                throw th2;
            }
        }
    }
}
