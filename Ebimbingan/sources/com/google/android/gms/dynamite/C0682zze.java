package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.C0677DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.zze */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0682zze implements C0677DynamiteModule.VersionPolicy {
    C0682zze() {
    }

    public final C0691zzn zza(Context context, String str, C0690zzm zzm) throws C0677DynamiteModule.LoadingException {
        C0691zzn zzn;
        Context context2 = context;
        String str2 = str;
        C0690zzm zzm2 = zzm;
        new C0691zzn();
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
