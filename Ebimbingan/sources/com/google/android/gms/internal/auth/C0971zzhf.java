package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzhf */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0971zzhf {
    private static final C0969zzhd<?> zza;
    private static final C0969zzhd<?> zzb = zzc();

    private static C0969zzhd<?> zzc() {
        try {
            return (C0969zzhd) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static C0969zzhd<?> zza() {
        return zza;
    }

    static C0969zzhd<?> zzb() {
        Throwable th;
        if (zzb != null) {
            return zzb;
        }
        Throwable th2 = th;
        new IllegalStateException("Protobuf runtime is not correctly loaded.");
        throw th2;
    }

    static {
        C0969zzhd<?> zzhd;
        new C0968zzhc();
        zza = zzhd;
    }
}
