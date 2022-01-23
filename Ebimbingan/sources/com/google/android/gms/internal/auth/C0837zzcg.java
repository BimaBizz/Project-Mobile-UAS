package com.google.android.gms.internal.auth;

import android.content.Context;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.auth.zzcg */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0837zzcg extends C0862zzde {
    private final Context zza;
    private final C0879zzdv<C0875zzdr<C0850zzct>> zzb;

    C0837zzcg(Context context, @Nullable C0879zzdv<C0875zzdr<C0850zzct>> zzdv) {
        Throwable th;
        Context context2 = context;
        C0879zzdv<C0875zzdr<C0850zzct>> zzdv2 = zzdv;
        if (context2 == null) {
            Throwable th2 = th;
            new NullPointerException("Null context");
            throw th2;
        }
        this.zza = context2;
        this.zzb = zzdv2;
    }

    /* access modifiers changed from: package-private */
    public final Context zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final C0879zzdv<C0875zzdr<C0850zzct>> zzb() {
        return this.zzb;
    }

    public final String toString() {
        StringBuilder sb;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        new StringBuilder(46 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        return sb.append("FlagsContext{context=").append(valueOf).append(", hermeticFileOverrides=").append(valueOf2).append("}").toString();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r3 = r1
            r4 = r0
            if (r3 != r4) goto L_0x0009
            r3 = 1
            r0 = r3
        L_0x0008:
            return r0
        L_0x0009:
            r3 = r1
            boolean r3 = r3 instanceof com.google.android.gms.internal.auth.C0862zzde
            if (r3 == 0) goto L_0x0040
            r3 = r1
            com.google.android.gms.internal.auth.zzde r3 = (com.google.android.gms.internal.auth.C0862zzde) r3
            r2 = r3
            r3 = r0
            android.content.Context r3 = r3.zza
            r4 = r2
            android.content.Context r4 = r4.zza()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x003d
            r3 = r0
            com.google.android.gms.internal.auth.zzdv<com.google.android.gms.internal.auth.zzdr<com.google.android.gms.internal.auth.zzct>> r3 = r3.zzb
            if (r3 != 0) goto L_0x002f
            r3 = r2
            com.google.android.gms.internal.auth.zzdv r3 = r3.zzb()
            if (r3 != 0) goto L_0x003d
        L_0x002c:
            r3 = 1
            r0 = r3
            goto L_0x0008
        L_0x002f:
            r3 = r0
            com.google.android.gms.internal.auth.zzdv<com.google.android.gms.internal.auth.zzdr<com.google.android.gms.internal.auth.zzct>> r3 = r3.zzb
            r4 = r2
            com.google.android.gms.internal.auth.zzdv r4 = r4.zzb()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x002c
        L_0x003d:
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x0040:
            r3 = 0
            r0 = r3
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0837zzcg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((1000003 ^ this.zza.hashCode()) * 1000003) ^ (this.zzb == null ? 0 : this.zzb.hashCode());
    }
}
