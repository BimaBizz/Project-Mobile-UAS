package com.google.android.gms.internal.auth;

import java.lang.reflect.Type;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public enum zzhj {
    ;
    
    private static final zzhj[] zzbe = null;
    private static final Type[] zzbf = null;
    private final zzhu zzaz;
    private final int zzba;
    private final zzhl zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    private zzhj(int i, zzhl zzhl, zzhu zzhu) {
        zzhl zzhl2 = zzhl;
        zzhu zzhu2 = zzhu;
        String str = r11;
        int i2 = r12;
        this.zzba = i;
        this.zzbb = zzhl2;
        this.zzaz = zzhu2;
        switch (zzhi.zza[zzhl2.ordinal()]) {
            case 1:
                this.zzbc = zzhu2.zza();
                break;
            case 2:
                this.zzbc = zzhu2.zza();
                break;
            default:
                this.zzbc = null;
                break;
        }
        boolean z = false;
        if (zzhl2 == zzhl.zza) {
            switch (zzhi.zzb[zzhu2.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    z = true;
                    break;
            }
        }
        this.zzbd = z;
    }

    public final int zza() {
        return this.zzba;
    }

    static {
        zzbf = new Type[0];
        zzhj[] values = values();
        zzbe = new zzhj[values.length];
        zzhj[] zzhjArr = values;
        zzhj[] zzhjArr2 = zzhjArr;
        int length = zzhjArr.length;
        for (int i = 0; i < length; i++) {
            zzhj zzhj = zzhjArr2[i];
            zzbe[zzhj.zzba] = zzhj;
        }
    }
}
