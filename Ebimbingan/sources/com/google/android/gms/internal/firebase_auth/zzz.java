package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;
import java.util.List;

public final class zzz extends zzhs<zzz, zza> implements zzje {
    /* access modifiers changed from: private */
    public static final zzz zzga;
    private static volatile zzjm<zzz> zzs;
    private String zzai = "";
    private String zzau = "";
    private String zzaz = "";
    private String zzce = "";
    private String zzcj = "";
    private zzhz<String> zzcl = zzhs.zzim();
    private boolean zzcm;
    private String zzct = "";
    private long zzcy;
    private long zzcz;
    private zzhz<zzu> zzdb = zzim();
    private boolean zzde;
    private String zzdv = "";
    private String zzdw = "";
    private String zzdx = "";
    private String zzeo = "";
    private zzhz<zzr> zzes = zzim();
    private zzgf zzft = zzgf.zzvv;
    private zzgf zzfu = zzgf.zzvv;
    private int zzfv;
    private long zzfw;
    private long zzfx;
    private boolean zzfy;
    private String zzfz = "";
    private int zzo;

    private zzz() {
    }

    public static final class zza extends zzhs.zza<zzz, zza> implements zzje {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private zza() {
            super(zzz.zzga);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zza(zzy zzy) {
            this();
            zzy zzy2 = zzy;
        }
    }

    public final String getLocalId() {
        return this.zzau;
    }

    public final String getEmail() {
        return this.zzaz;
    }

    public final String getDisplayName() {
        return this.zzcj;
    }

    public final String zzam() {
        return this.zzct;
    }

    public final boolean zzao() {
        return this.zzcm;
    }

    public final List<zzu> zzal() {
        return this.zzdb;
    }

    public final long zzbs() {
        return this.zzcy;
    }

    public final long zzbt() {
        return this.zzcz;
    }

    public final String zzbu() {
        return this.zzfz;
    }

    public final String getPhoneNumber() {
        return this.zzce;
    }

    public final List<zzr> zzbc() {
        return this.zzes;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        zzjm<zzz> zzjm;
        Object obj3;
        Object obj4;
        Throwable th;
        Object obj5 = obj;
        Object obj6 = obj2;
        switch (zzy.zzt[i - 1]) {
            case 1:
                new zzz();
                return obj4;
            case 2:
                new zza((zzy) null);
                return obj3;
            case 3:
                Object[] objArr = new Object[27];
                objArr[0] = "zzo";
                Object[] objArr2 = objArr;
                objArr2[1] = "zzau";
                Object[] objArr3 = objArr2;
                objArr3[2] = "zzaz";
                Object[] objArr4 = objArr3;
                objArr4[3] = "zzcj";
                Object[] objArr5 = objArr4;
                objArr5[4] = "zzcl";
                Object[] objArr6 = objArr5;
                objArr6[5] = "zzdv";
                Object[] objArr7 = objArr6;
                objArr7[6] = "zzct";
                Object[] objArr8 = objArr7;
                objArr8[7] = "zzdw";
                Object[] objArr9 = objArr8;
                objArr9[8] = "zzdx";
                Object[] objArr10 = objArr9;
                objArr10[9] = "zzft";
                Object[] objArr11 = objArr10;
                objArr11[10] = "zzfu";
                Object[] objArr12 = objArr11;
                objArr12[11] = "zzfv";
                Object[] objArr13 = objArr12;
                objArr13[12] = "zzcm";
                Object[] objArr14 = objArr13;
                objArr14[13] = "zzfw";
                Object[] objArr15 = objArr14;
                objArr15[14] = "zzdb";
                Object[] objArr16 = objArr15;
                objArr16[15] = zzu.class;
                Object[] objArr17 = objArr16;
                objArr17[16] = "zzfx";
                Object[] objArr18 = objArr17;
                objArr18[17] = "zzde";
                Object[] objArr19 = objArr18;
                objArr19[18] = "zzcy";
                Object[] objArr20 = objArr19;
                objArr20[19] = "zzcz";
                Object[] objArr21 = objArr20;
                objArr21[20] = "zzeo";
                Object[] objArr22 = objArr21;
                objArr22[21] = "zzfy";
                Object[] objArr23 = objArr22;
                objArr23[22] = "zzfz";
                Object[] objArr24 = objArr23;
                objArr24[23] = "zzce";
                Object[] objArr25 = objArr24;
                objArr25[24] = "zzai";
                Object[] objArr26 = objArr25;
                objArr26[25] = "zzes";
                Object[] objArr27 = objArr26;
                objArr27[26] = zzr.class;
                return zza((zzjc) zzga, "\u0001\u0018\u0000\u0001\u0001\u001a\u0018\u0000\u0003\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u001a\u0005\b\u0003\u0006\b\u0004\u0007\b\u0005\b\b\u0006\t\n\u0007\n\n\b\u000b\u0004\t\f\u0007\n\r\u0002\u000b\u000e\u001b\u000f\u0002\f\u0010\u0007\r\u0011\u0002\u000e\u0012\u0002\u000f\u0013\b\u0010\u0014\u0007\u0011\u0015\b\u0012\u0016\b\u0013\u0019\b\u0014\u001a\u001b", objArr27);
            case 4:
                return zzga;
            case 5:
                zzjm<zzz> zzjm2 = zzs;
                zzjm<zzz> zzjm3 = zzjm2;
                if (zzjm2 == null) {
                    Class<zzz> cls = zzz.class;
                    Class<zzz> cls2 = cls;
                    synchronized (cls) {
                        try {
                            zzjm<zzz> zzjm4 = zzs;
                            zzjm3 = zzjm4;
                            if (zzjm4 == null) {
                                new zzhs.zzc(zzga);
                                zzjm<zzz> zzjm5 = zzjm;
                                zzjm3 = zzjm5;
                                zzs = zzjm5;
                            }
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            Class<zzz> cls3 = cls2;
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
        zzz zzz;
        new zzz();
        zzga = zzz;
        zzhs.zza(zzz.class, zzga);
    }
}
