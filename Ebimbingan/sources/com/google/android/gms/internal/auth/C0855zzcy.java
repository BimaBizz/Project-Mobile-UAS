package com.google.android.gms.internal.auth;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.auth.zzcy */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0855zzcy extends C0854zzcx<Long> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0855zzcy(C0863zzdf zzdf, String str, Long l, boolean z) {
        super(zzdf, str, l, true, (C0855zzcy) null);
        boolean z2 = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final Long zza(Object obj) {
        StringBuilder sb;
        Object obj2 = obj;
        if (obj2 instanceof Long) {
            return (Long) obj2;
        }
        if (obj2 instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj2));
            } catch (NumberFormatException e) {
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj2);
        new StringBuilder(25 + String.valueOf(zzb).length() + String.valueOf(valueOf).length());
        int e2 = Log.e("PhenotypeFlag", sb.append("Invalid long value for ").append(zzb).append(": ").append(valueOf).toString());
        return null;
    }
}
