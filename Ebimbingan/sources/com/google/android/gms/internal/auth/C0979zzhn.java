package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.C0978zzhm;

/* renamed from: com.google.android.gms.internal.auth.zzhn */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0979zzhn implements C1012zzit {
    private static final C0979zzhn zza;

    private C0979zzhn() {
    }

    public static C0979zzhn zza() {
        return zza;
    }

    public final boolean zza(Class<?> cls) {
        return C0978zzhm.class.isAssignableFrom(cls);
    }

    public final C1009zziq zzb(Class<?> cls) {
        String str;
        String str2;
        String str3;
        String str4;
        Class<?> cls2 = cls;
        if (!C0978zzhm.class.isAssignableFrom(cls2)) {
            IllegalArgumentException illegalArgumentException = r8;
            String valueOf = String.valueOf(cls2.getName());
            String str5 = valueOf;
            if (valueOf.length() != 0) {
                str4 = "Unsupported message type: ".concat(str5);
            } else {
                str4 = str3;
                new String("Unsupported message type: ");
            }
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(str4);
            throw illegalArgumentException;
        }
        try {
            return (C1009zziq) C0978zzhm.zza(cls2.asSubclass(C0978zzhm.class)).zza(C0978zzhm.zze.zzc, (Object) null, (Object) null);
        } catch (Exception e) {
            Exception exc = e;
            RuntimeException runtimeException = r8;
            String valueOf2 = String.valueOf(cls2.getName());
            String str6 = valueOf2;
            if (valueOf2.length() != 0) {
                str2 = "Unable to get message info for ".concat(str6);
            } else {
                str2 = str;
                new String("Unable to get message info for ");
            }
            RuntimeException runtimeException2 = new RuntimeException(str2, exc);
            throw runtimeException;
        }
    }

    static {
        C0979zzhn zzhn;
        new C0979zzhn();
        zza = zzhn;
    }
}
