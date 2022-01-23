package com.google.android.gms.internal.firebase_auth;

import org.shaded.apache.commons.logging.impl.SimpleLog;

public enum zzfw implements zzhw {
    ;
    
    private static final zzhv<zzfw> zzfq = null;
    private final int value;

    public final int zzbq() {
        return this.value;
    }

    public static zzfw zzk(int i) {
        switch (i) {
            case 0:
                return zzvd;
            case 1:
                return zzve;
            case 2:
                return zzvf;
            case 3:
                return zzvg;
            case 4:
                return zzvh;
            case 5:
                return zzvi;
            case SimpleLog.LOG_LEVEL_FATAL /*6*/:
                return zzvj;
            case SimpleLog.LOG_LEVEL_OFF /*7*/:
                return zzvk;
            default:
                return null;
        }
    }

    public static zzhy zzbr() {
        return zzfy.zzfs;
    }

    private zzfw(int i) {
        String str = r8;
        int i2 = r9;
        this.value = i;
    }

    static {
        zzhv<zzfw> zzhv;
        new zzfv();
        zzfq = zzhv;
    }
}
