package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class zze implements DynamiteModule.VersionPolicy {
    zze() {
    }

    public final zzn zza(Context context, String str, zzm zzm) throws DynamiteModule.LoadingException {
        zzn zzn;
        Context context2 = context;
        String str2 = str;
        zzm zzm2 = zzm;
        new zzn();
        int zzb = zzm2.zzb(context2, str2);
        zzn.zza = zzb;
        if (zzb != 0) {
            zzn.zzc = -1;
        } else {
            int zza = zzm2.zza(context2, str2, true);
            zzn.zzb = zza;
            if (zza != 0) {
                zzn.zzc = 1;
            }
        }
        return zzn;
    }
}
