package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzir {
    private static final zzip zza = zzc();
    private static final zzip zzb;

    static zzip zza() {
        return zza;
    }

    static zzip zzb() {
        return zzb;
    }

    private static zzip zzc() {
        try {
            return (zzip) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static {
        zzip zzip;
        new zzio();
        zzb = zzip;
    }
}
