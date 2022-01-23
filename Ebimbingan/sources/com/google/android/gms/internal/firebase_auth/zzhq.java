package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;

final class zzhq implements zziz {
    private static final zzhq zzaae;

    private zzhq() {
    }

    public static zzhq zzib() {
        return zzaae;
    }

    public final boolean zza(Class<?> cls) {
        return zzhs.class.isAssignableFrom(cls);
    }

    public final zzja zzb(Class<?> cls) {
        String str;
        String str2;
        String str3;
        String str4;
        Class<?> cls2 = cls;
        if (!zzhs.class.isAssignableFrom(cls2)) {
            IllegalArgumentException illegalArgumentException = r9;
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
            zzhs zzd = zzhs.zzd(cls2.asSubclass(zzhs.class));
            int i = zzhs.zzd.zzaap;
            int i2 = i;
            return (zzja) zzd.zza(i, (Object) null, (Object) null);
        } catch (Exception e) {
            Exception exc = e;
            RuntimeException runtimeException = r9;
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
        zzhq zzhq;
        new zzhq();
        zzaae = zzhq;
    }
}
