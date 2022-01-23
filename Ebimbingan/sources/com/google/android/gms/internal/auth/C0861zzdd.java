package com.google.android.gms.internal.auth;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.auth.zzdd */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0861zzdd extends C0854zzcx<T> {
    private final /* synthetic */ C0860zzdc zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0861zzdd(C0863zzdf zzdf, String str, Object obj, boolean z, C0860zzdc zzdc) {
        super(zzdf, str, obj, true, (C0855zzcy) null);
        boolean z2 = z;
        this.zza = zzdc;
    }

    /* access modifiers changed from: package-private */
    public final T zza(Object obj) {
        StringBuilder sb;
        Object obj2 = obj;
        if (obj2 instanceof String) {
            try {
                return this.zza.zza(Base64.decode((String) obj2, 3));
            } catch (IOException | IllegalArgumentException e) {
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj2);
        new StringBuilder(27 + String.valueOf(zzb).length() + String.valueOf(valueOf).length());
        int e2 = Log.e("PhenotypeFlag", sb.append("Invalid byte[] value for ").append(zzb).append(": ").append(valueOf).toString());
        return null;
    }
}
