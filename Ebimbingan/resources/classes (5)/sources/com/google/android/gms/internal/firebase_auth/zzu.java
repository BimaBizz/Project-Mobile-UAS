package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;
import org.shaded.apache.commons.logging.impl.SimpleLog;

public final class zzu extends zzhs<zzu, zza> implements zzje {
    /* access modifiers changed from: private */
    public static final zzu zzfi;
    private static volatile zzjm<zzu> zzs;
    private String zzaz = "";
    private String zzce = "";
    private String zzcj = "";
    private String zzct = "";
    private String zzdq = "";
    private String zzeo = "";
    private String zzfh = "";
    private int zzo;
    private String zzx = "";

    private zzu() {
    }

    public static final class zza extends zzhs.zza<zzu, zza> implements zzje {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private zza() {
            super(zzu.zzfi);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zza(zzt zzt) {
            this();
            zzt zzt2 = zzt;
        }
    }

    public final String getProviderId() {
        return this.zzx;
    }

    public final String getDisplayName() {
        return this.zzcj;
    }

    public final String zzam() {
        return this.zzct;
    }

    public final String zzbo() {
        return this.zzdq;
    }

    public final String getEmail() {
        return this.zzaz;
    }

    public final String getPhoneNumber() {
        return this.zzce;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        zzjm<zzu> zzjm;
        Object obj3;
        Object obj4;
        Throwable th;
        Object obj5 = obj;
        Object obj6 = obj2;
        switch (zzt.zzt[i - 1]) {
            case 1:
                new zzu();
                return obj4;
            case 2:
                new zza((zzt) null);
                return obj3;
            case 3:
                Object[] objArr = new Object[9];
                objArr[0] = "zzo";
                Object[] objArr2 = objArr;
                objArr2[1] = "zzx";
                Object[] objArr3 = objArr2;
                objArr3[2] = "zzcj";
                Object[] objArr4 = objArr3;
                objArr4[3] = "zzct";
                Object[] objArr5 = objArr4;
                objArr5[4] = "zzdq";
                Object[] objArr6 = objArr5;
                objArr6[5] = "zzaz";
                Object[] objArr7 = objArr6;
                objArr7[6] = "zzfh";
                Object[] objArr8 = objArr7;
                objArr8[7] = "zzeo";
                Object[] objArr9 = objArr8;
                objArr9[8] = "zzce";
                return zza((zzjc) zzfi, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\t\b\u0007", objArr9);
            case 4:
                return zzfi;
            case 5:
                zzjm<zzu> zzjm2 = zzs;
                zzjm<zzu> zzjm3 = zzjm2;
                if (zzjm2 == null) {
                    Class<zzu> cls = zzu.class;
                    Class<zzu> cls2 = cls;
                    synchronized (cls) {
                        try {
                            zzjm<zzu> zzjm4 = zzs;
                            zzjm3 = zzjm4;
                            if (zzjm4 == null) {
                                new zzhs.zzc(zzfi);
                                zzjm<zzu> zzjm5 = zzjm;
                                zzjm3 = zzjm5;
                                zzs = zzjm5;
                            }
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            Class<zzu> cls3 = cls2;
                            throw th3;
                        }
                    }
                }
                return zzjm3;
            case SimpleLog.LOG_LEVEL_FATAL /*6*/:
                return 1;
            case SimpleLog.LOG_LEVEL_OFF /*7*/:
                return null;
            default:
                Throwable th4 = th;
                new UnsupportedOperationException();
                throw th4;
        }
    }

    static {
        zzu zzu;
        new zzu();
        zzfi = zzu;
        zzhs.zza(zzu.class, zzfi);
    }
}
