package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;

public final class zzkh extends zzhs<zzkh, zza> implements zzje {
    /* access modifiers changed from: private */
    public static final zzkh zzaej;
    private static volatile zzjm<zzkh> zzs;
    private long zzaeh;
    private int zzaei;

    private zzkh() {
    }

    public static final class zza extends zzhs.zza<zzkh, zza> implements zzje {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private zza() {
            super(zzkh.zzaej);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zza(zzkj zzkj) {
            this();
            zzkj zzkj2 = zzkj;
        }
    }

    public final long getSeconds() {
        return this.zzaeh;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        zzjm<zzkh> zzjm;
        Object obj3;
        Object obj4;
        Throwable th;
        Object obj5 = obj;
        Object obj6 = obj2;
        switch (zzkj.zzt[i - 1]) {
            case 1:
                new zzkh();
                return obj4;
            case 2:
                new zza((zzkj) null);
                return obj3;
            case 3:
                Object[] objArr = new Object[2];
                objArr[0] = "zzaeh";
                Object[] objArr2 = objArr;
                objArr2[1] = "zzaei";
                return zza((zzjc) zzaej, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", objArr2);
            case 4:
                return zzaej;
            case 5:
                zzjm<zzkh> zzjm2 = zzs;
                zzjm<zzkh> zzjm3 = zzjm2;
                if (zzjm2 == null) {
                    Class<zzkh> cls = zzkh.class;
                    Class<zzkh> cls2 = cls;
                    synchronized (cls) {
                        try {
                            zzjm<zzkh> zzjm4 = zzs;
                            zzjm3 = zzjm4;
                            if (zzjm4 == null) {
                                new zzhs.zzc(zzaej);
                                zzjm<zzkh> zzjm5 = zzjm;
                                zzjm3 = zzjm5;
                                zzs = zzjm5;
                            }
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            Class<zzkh> cls3 = cls2;
                            throw th3;
                        }
                    }
                }
                return zzjm3;
            case 6:
                return 1;
            case 7:
                return null;
            default:
                Throwable th4 = th;
                new UnsupportedOperationException();
                throw th4;
        }
    }

    public static zzkh zzkl() {
        return zzaej;
    }

    static {
        zzkh zzkh;
        new zzkh();
        zzaej = zzkh;
        zzhs.zza(zzkh.class, zzaej);
    }
}
