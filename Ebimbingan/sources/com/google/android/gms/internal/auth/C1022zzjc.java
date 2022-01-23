package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzjc */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1022zzjc {
    private static final C1020zzja zza = zzc();
    private static final C1020zzja zzb;

    static C1020zzja zza() {
        return zza;
    }

    static C1020zzja zzb() {
        return zzb;
    }

    private static C1020zzja zzc() {
        try {
            return (C1020zzja) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static {
        C1020zzja zzja;
        new C1023zzjd();
        zzb = zzja;
    }
}
