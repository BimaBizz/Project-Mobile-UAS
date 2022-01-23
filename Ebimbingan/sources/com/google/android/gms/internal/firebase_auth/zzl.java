package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;

public final class zzl extends zzhs<zzl, zza> implements zzje {
    /* access modifiers changed from: private */
    public static final zzl zzr;
    private static volatile zzjm<zzl> zzs;
    private int zzo;
    private String zzp = "";
    private String zzq = "";

    private zzl() {
    }

    public static final class zza extends zzhs.zza<zzl, zza> implements zzje {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private zza() {
            super(zzl.zzr);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zza(zzn zzn) {
            this();
            zzn zzn2 = zzn;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        zzjm<zzl> zzjm;
        Object obj3;
        Object obj4;
        Throwable th;
        Object obj5 = obj;
        Object obj6 = obj2;
        switch (zzn.zzt[i - 1]) {
            case 1:
                new zzl();
                return obj4;
            case 2:
                new zza((zzn) null);
                return obj3;
            case 3:
                Object[] objArr = new Object[3];
                objArr[0] = "zzo";
                Object[] objArr2 = objArr;
                objArr2[1] = "zzp";
                Object[] objArr3 = objArr2;
                objArr3[2] = "zzq";
                return zza((zzjc) zzr, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", objArr3);
            case 4:
                return zzr;
            case 5:
                zzjm<zzl> zzjm2 = zzs;
                zzjm<zzl> zzjm3 = zzjm2;
                if (zzjm2 == null) {
                    Class<zzl> cls = zzl.class;
                    Class<zzl> cls2 = cls;
                    synchronized (cls) {
                        try {
                            zzjm<zzl> zzjm4 = zzs;
                            zzjm3 = zzjm4;
                            if (zzjm4 == null) {
                                new zzhs.zzc(zzr);
                                zzjm<zzl> zzjm5 = zzjm;
                                zzjm3 = zzjm5;
                                zzs = zzjm5;
                            }
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            Class<zzl> cls3 = cls2;
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

    static {
        zzl zzl;
        new zzl();
        zzr = zzl;
        zzhs.zza(zzl.class, zzr);
    }
}
