package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzdj */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0867zzdj {
    private final boolean zza;

    public C0867zzdj(C0866zzdi zzdi) {
        C0866zzdi zzdi2 = zzdi;
        Object zza2 = C0874zzdq.zza(zzdi2, (Object) "BuildInfo must be non-null");
        this.zza = !zzdi2.zza();
    }

    public final boolean zza(String str) {
        String str2 = str;
        Object zza2 = C0874zzdq.zza(str2, (Object) "flagName must not be null");
        if (!this.zza) {
            return true;
        }
        return C0869zzdl.zza.zza().zza(str2);
    }
}
