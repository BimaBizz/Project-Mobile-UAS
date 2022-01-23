package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzgb */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0940zzgb {
    private static final Class<?> zza = zza("libcore.io.Memory");
    private static final boolean zzb = (zza("org.robolectric.Robolectric") != null);

    static boolean zza() {
        return zza != null && !zzb;
    }

    static Class<?> zzb() {
        return zza;
    }

    private static <T> Class<T> zza(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }
}
