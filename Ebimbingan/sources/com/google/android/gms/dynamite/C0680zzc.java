package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.C0677DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.zzc */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0680zzc implements C0690zzm {
    C0680zzc() {
    }

    public final int zza(Context context, String str, boolean z) throws C0677DynamiteModule.LoadingException {
        return C0677DynamiteModule.zza(context, str, z);
    }

    public final int zzb(Context context, String str) {
        return C0677DynamiteModule.getLocalVersion(context, str);
    }
}
