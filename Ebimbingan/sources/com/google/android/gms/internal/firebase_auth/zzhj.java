package com.google.android.gms.internal.firebase_auth;

final class zzhj {
    private static final zzhh<?> zzxl;
    private static final zzhh<?> zzxm = zzhu();

    private static zzhh<?> zzhu() {
        try {
            return (zzhh) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static zzhh<?> zzhv() {
        return zzxl;
    }

    static zzhh<?> zzhw() {
        Throwable th;
        if (zzxm != null) {
            return zzxm;
        }
        Throwable th2 = th;
        new IllegalStateException("Protobuf runtime is not correctly loaded.");
        throw th2;
    }

    static {
        zzhh<?> zzhh;
        new zzhg();
        zzxl = zzhh;
    }
}
