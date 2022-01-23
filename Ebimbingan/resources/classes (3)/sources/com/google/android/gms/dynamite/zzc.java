package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class zzc implements zzm {
    zzc() {
    }

    public final int zza(Context context, String str, boolean z) throws DynamiteModule.LoadingException {
        return DynamiteModule.zza(context, str, z);
    }

    public final int zzb(Context context, String str) {
        return DynamiteModule.getLocalVersion(context, str);
    }
}
