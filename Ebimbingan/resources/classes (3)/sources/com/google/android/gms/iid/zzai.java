package com.google.android.gms.iid;

import javax.annotation.concurrent.GuardedBy;

public abstract class zzai {
    @GuardedBy("SdkFlagFactory.class")
    private static zzai zzdd;

    public zzai() {
    }

    public abstract zzaj<Boolean> zzd(String str, boolean z);

    public static synchronized zzai zzy() {
        zzai zzai;
        zzai zzai2;
        synchronized (zzai.class) {
            if (zzdd == null) {
                new zzac();
                zzdd = zzai2;
            }
            zzai = zzdd;
        }
        return zzai;
    }
}
