package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;

public final class zzr extends zzhs<zzr, zza> implements zzje {
    /* access modifiers changed from: private */
    public static final zzr zzfg;
    private static volatile zzjm<zzr> zzs;
    private String zzcj = "";
    private int zzfa = 0;
    private Object zzfb;
    private int zzfc = 0;
    private Object zzfd;
    private String zzfe = "";
    private zzkh zzff;
    private int zzo;

    private zzr() {
    }

    public static final class zza extends zzhs.zza<zzr, zza> implements zzje {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private zza() {
            super(zzr.zzfg);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zza(zzs zzs) {
            this();
            zzs zzs2 = zzs;
        }
    }

    public final String zzbk() {
        String str = "";
        if (this.zzfa == 1) {
            str = (String) this.zzfb;
        }
        return str;
    }

    public final String zzbl() {
        return this.zzfe;
    }

    public final String getDisplayName() {
        return this.zzcj;
    }

    public final zzkh zzbm() {
        return this.zzff == null ? zzkh.zzkl() : this.zzff;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        zzjm<zzr> zzjm;
        Object obj3;
        Object obj4;
        Throwable th;
        Object obj5 = obj;
        Object obj6 = obj2;
        switch (zzs.zzt[i - 1]) {
            case 1:
                new zzr();
                return obj4;
            case 2:
                new zza((zzs) null);
                return obj3;
            case 3:
                Object[] objArr = new Object[8];
                objArr[0] = "zzfb";
                Object[] objArr2 = objArr;
                objArr2[1] = "zzfa";
                Object[] objArr3 = objArr2;
                objArr3[2] = "zzfd";
                Object[] objArr4 = objArr3;
                objArr4[3] = "zzfc";
                Object[] objArr5 = objArr4;
                objArr5[4] = "zzo";
                Object[] objArr6 = objArr5;
                objArr6[5] = "zzfe";
                Object[] objArr7 = objArr6;
                objArr7[6] = "zzcj";
                Object[] objArr8 = objArr7;
                objArr8[7] = "zzff";
                return zza((zzjc) zzfg, "\u0001\u0005\u0002\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001;\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003\u0005;\u0001", objArr8);
            case 4:
                return zzfg;
            case 5:
                zzjm<zzr> zzjm2 = zzs;
                zzjm<zzr> zzjm3 = zzjm2;
                if (zzjm2 == null) {
                    Class<zzr> cls = zzr.class;
                    Class<zzr> cls2 = cls;
                    synchronized (cls) {
                        try {
                            zzjm<zzr> zzjm4 = zzs;
                            zzjm3 = zzjm4;
                            if (zzjm4 == null) {
                                new zzhs.zzc(zzfg);
                                zzjm<zzr> zzjm5 = zzjm;
                                zzjm3 = zzjm5;
                                zzs = zzjm5;
                            }
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            Class<zzr> cls3 = cls2;
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
        zzr zzr;
        new zzr();
        zzfg = zzr;
        zzhs.zza(zzr.class, zzfg);
    }
}
