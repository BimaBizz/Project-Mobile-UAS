package com.google.android.gms.internal.firebase_auth;

import java.lang.reflect.Type;

public enum zzhn {
    ;
    
    private static final zzhn[] zzzt = null;
    private static final Type[] zzzu = null;
    private final int id;
    private final zzie zzzp;
    private final zzhp zzzq;
    private final Class<?> zzzr;
    private final boolean zzzs;

    private zzhn(int i, zzhp zzhp, zzie zzie) {
        zzhp zzhp2 = zzhp;
        zzie zzie2 = zzie;
        String str = r11;
        int i2 = r12;
        this.id = i;
        this.zzzq = zzhp2;
        this.zzzp = zzie2;
        switch (zzhm.zzxo[zzhp2.ordinal()]) {
            case 1:
                this.zzzr = zzie2.zzjb();
                break;
            case 2:
                this.zzzr = zzie2.zzjb();
                break;
            default:
                this.zzzr = null;
                break;
        }
        boolean z = false;
        if (zzhp2 == zzhp.zzzy) {
            switch (zzhm.zzxp[zzie2.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    z = true;
                    break;
            }
        }
        this.zzzs = z;
    }

    public final int id() {
        return this.id;
    }

    static {
        zzzu = new Type[0];
        zzhn[] values = values();
        zzzt = new zzhn[values.length];
        zzhn[] zzhnArr = values;
        zzhn[] zzhnArr2 = zzhnArr;
        int length = zzhnArr.length;
        for (int i = 0; i < length; i++) {
            zzhn zzhn = zzhnArr2[i];
            zzzt[zzhn.id] = zzhn;
        }
    }
}
