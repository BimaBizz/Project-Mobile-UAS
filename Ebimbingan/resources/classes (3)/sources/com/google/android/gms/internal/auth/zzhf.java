package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzhf {
    private static final zzhd<?> zza;
    private static final zzhd<?> zzb = zzc();

    private static zzhd<?> zzc() {
        try {
            return (zzhd) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static zzhd<?> zza() {
        return zza;
    }

    static zzhd<?> zzb() {
        Throwable th;
        if (zzb != null) {
            return zzb;
        }
        Throwable th2 = th;
        new IllegalStateException("Protobuf runtime is not correctly loaded.");
        throw th2;
    }

    static {
        zzhd<?> zzhd;
        new zzhc();
        zza = zzhd;
    }
}
