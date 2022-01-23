package com.google.android.gms.internal.auth;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.auth.zzda */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0858zzda extends C0854zzcx<Double> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0858zzda(C0863zzdf zzdf, String str, Double d, boolean z) {
        super(zzdf, str, d, true, (C0855zzcy) null);
        boolean z2 = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final Double zza(Object obj) {
        StringBuilder sb;
        Object obj2 = obj;
        if (obj2 instanceof Double) {
            return (Double) obj2;
        }
        if (obj2 instanceof Float) {
            return Double.valueOf(((Float) obj2).doubleValue());
        }
        if (obj2 instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj2));
            } catch (NumberFormatException e) {
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj2);
        new StringBuilder(27 + String.valueOf(zzb).length() + String.valueOf(valueOf).length());
        int e2 = Log.e("PhenotypeFlag", sb.append("Invalid double value for ").append(zzb).append(": ").append(valueOf).toString());
        return null;
    }
}
