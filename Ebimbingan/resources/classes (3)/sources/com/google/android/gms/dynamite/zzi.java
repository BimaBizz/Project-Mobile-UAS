package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class zzi implements DynamiteModule.VersionPolicy {
    zzi() {
    }

    public final zzn zza(Context context, String str, zzm zzm) throws DynamiteModule.LoadingException {
        zzn zzn;
        Context context2 = context;
        String str2 = str;
        zzm zzm2 = zzm;
        new zzn();
        zzn.zza = zzm2.zzb(context2, str2);
        int zza = zzm2.zza(context2, str2, true);
        zzn.zzb = zza;
        int i = zzn.zza;
        if (i == 0) {
            if (zza == 0) {
                zzn.zzc = 0;
                return zzn;
            }
            i = 0;
        }
        if (zza >= i) {
            zzn.zzc = 1;
        } else {
            zzn.zzc = -1;
        }
        return zzn;
    }
}
