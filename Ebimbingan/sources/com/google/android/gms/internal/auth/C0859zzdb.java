package com.google.android.gms.internal.auth;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.auth.zzdb */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0859zzdb extends C0854zzcx<Boolean> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0859zzdb(C0863zzdf zzdf, String str, Boolean bool, boolean z) {
        super(zzdf, str, bool, true, (C0855zzcy) null);
        boolean z2 = z;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(Object obj) {
        StringBuilder sb;
        Object obj2 = obj;
        if (obj2 instanceof Boolean) {
            return (Boolean) obj2;
        }
        if (obj2 instanceof String) {
            String str = (String) obj2;
            if (C0836zzcf.zzb.matcher(str).matches()) {
                return 1;
            }
            if (C0836zzcf.zzc.matcher(str).matches()) {
                return null;
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj2);
        new StringBuilder(28 + String.valueOf(zzb).length() + String.valueOf(valueOf).length());
        int e = Log.e("PhenotypeFlag", sb.append("Invalid boolean value for ").append(zzb).append(": ").append(valueOf).toString());
        return null;
    }
}
