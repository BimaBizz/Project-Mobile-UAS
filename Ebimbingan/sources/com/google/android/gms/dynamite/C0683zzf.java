package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.C0677DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.zzf */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0683zzf implements C0677DynamiteModule.VersionPolicy {
    C0683zzf() {
    }

    public final C0691zzn zza(Context context, String str, C0690zzm zzm) throws C0677DynamiteModule.LoadingException {
        C0691zzn zzn;
        new C0691zzn();
        int zza = zzm.zza(context, str, false);
        zzn.zzb = zza;
        if (zza == 0) {
            zzn.zzc = 0;
        } else {
            zzn.zzc = 1;
        }
        return zzn;
    }
}
