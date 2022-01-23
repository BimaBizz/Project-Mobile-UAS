package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.zzd */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final /* synthetic */ class C0635zzd implements Callable {
    private final boolean zza;
    private final String zzb;
    private final C0640zzi zzc;

    C0635zzd(boolean z, String str, C0640zzi zzi) {
        this.zza = z;
        this.zzb = str;
        this.zzc = zzi;
    }

    public final Object call() {
        return C0644zzm.zze(this.zza, this.zzb, this.zzc);
    }
}
