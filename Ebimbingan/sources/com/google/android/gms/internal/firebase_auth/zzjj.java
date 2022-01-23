package com.google.android.gms.internal.firebase_auth;

final class zzjj {
    private static final zzjh zzadk = zzjt();
    private static final zzjh zzadl;

    static zzjh zzjr() {
        return zzadk;
    }

    static zzjh zzjs() {
        return zzadl;
    }

    private static zzjh zzjt() {
        try {
            return (zzjh) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static {
        zzjh zzjh;
        new zzjk();
        zzadl = zzjh;
    }
}
