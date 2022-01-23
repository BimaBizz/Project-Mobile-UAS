package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzjc {
    private static final zzja zza = zzc();
    private static final zzja zzb;

    static zzja zza() {
        return zza;
    }

    static zzja zzb() {
        return zzb;
    }

    private static zzja zzc() {
        try {
            return (zzja) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static {
        zzja zzja;
        new zzjd();
        zzb = zzja;
    }
}
