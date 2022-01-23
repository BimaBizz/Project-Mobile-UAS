package com.google.android.gms.internal.auth;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.auth.zzhj */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public enum C0975zzhj {
    ;
    
    private static final C0975zzhj[] zzbe = null;
    private static final Type[] zzbf = null;
    private final C0986zzhu zzaz;
    private final int zzba;
    private final C0977zzhl zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    private C0975zzhj(int i, C0977zzhl zzhl, C0986zzhu zzhu) {
        C0977zzhl zzhl2 = zzhl;
        C0986zzhu zzhu2 = zzhu;
        String str = r11;
        int i2 = r12;
        this.zzba = i;
        this.zzbb = zzhl2;
        this.zzaz = zzhu2;
        switch (C0974zzhi.zza[zzhl2.ordinal()]) {
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
        if (zzhl2 == C0977zzhl.zza) {
            switch (C0974zzhi.zzb[zzhu2.ordinal()]) {
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
        C0975zzhj[] values = values();
        zzbe = new C0975zzhj[values.length];
        C0975zzhj[] zzhjArr = values;
        C0975zzhj[] zzhjArr2 = zzhjArr;
        int length = zzhjArr.length;
        for (int i = 0; i < length; i++) {
            C0975zzhj zzhj = zzhjArr2[i];
            zzbe[zzhj.zzba] = zzhj;
        }
    }
}
