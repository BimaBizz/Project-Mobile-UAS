package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class zzf implements DynamiteModule.VersionPolicy {
    zzf() {
    }

    public final zzn zza(Context context, String str, zzm zzm) throws DynamiteModule.LoadingException {
        zzn zzn;
        new zzn();
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
