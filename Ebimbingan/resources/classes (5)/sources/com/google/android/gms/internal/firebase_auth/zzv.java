package com.google.android.gms.internal.firebase_auth;

import org.shaded.apache.commons.logging.impl.SimpleLog;

public enum zzv implements zzhw {
    ;
    
    private static final zzhv<zzv> zzfq = null;
    private final int value;

    public final int zzbq() {
        return this.value;
    }

    public static zzv zzc(int i) {
        switch (i) {
            case 0:
                return zzfj;
            case 1:
                return zzfk;
            case 2:
                return zzfl;
            case 3:
                return zzfm;
            case 4:
                return zzfn;
            case 5:
                return zzfo;
            case SimpleLog.LOG_LEVEL_FATAL /*6*/:
                return zzfp;
            default:
                return null;
        }
    }

    public static zzhy zzbr() {
        return zzw.zzfs;
    }

    private zzv(int i) {
        String str = r8;
        int i2 = r9;
        this.value = i;
    }

    static {
        zzhv<zzv> zzhv;
        new zzx();
        zzfq = zzhv;
    }
}
