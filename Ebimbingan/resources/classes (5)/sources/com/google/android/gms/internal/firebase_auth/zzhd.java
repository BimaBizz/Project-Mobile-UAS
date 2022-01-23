package com.google.android.gms.internal.firebase_auth;

final class zzhd {
    private static final Class<?> zzxa = zzhm();

    private static Class<?> zzhm() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static zzhf zzhn() {
        if (zzxa != null) {
            try {
                return zzdk("getEmptyRegistry");
            } catch (Exception e) {
            }
        }
        return zzhf.zzxf;
    }

    static zzhf zzho() {
        zzhf zzhf = null;
        if (zzxa != null) {
            try {
                zzhf = zzdk("loadGeneratedRegistry");
            } catch (Exception e) {
            }
        }
        if (zzhf == null) {
            zzhf = zzhf.zzho();
        }
        return zzhf == null ? zzhn() : zzhf;
    }

    private static final zzhf zzdk(String str) throws Exception {
        return (zzhf) zzxa.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }
}
