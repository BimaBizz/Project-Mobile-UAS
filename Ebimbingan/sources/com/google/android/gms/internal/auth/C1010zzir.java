package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzir */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1010zzir {
    private static final C1008zzip zza = zzc();
    private static final C1008zzip zzb;

    static C1008zzip zza() {
        return zza;
    }

    static C1008zzip zzb() {
        return zzb;
    }

    private static C1008zzip zzc() {
        try {
            return (C1008zzip) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static {
        C1008zzip zzip;
        new C1007zzio();
        zzb = zzip;
    }
}
