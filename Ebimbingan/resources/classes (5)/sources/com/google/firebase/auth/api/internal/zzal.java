package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;

@VisibleForTesting
final class zzal implements zzam {
    private final int zzmg;
    private final int zzmh;
    private final Map<String, Integer> zzmi;

    public zzal(int i, int i2, Map<String, Integer> map) {
        this.zzmg = i;
        this.zzmh = i2;
        this.zzmi = (Map) Preconditions.checkNotNull(map);
    }

    public final boolean zzbx(String str) {
        String str2 = str;
        if (this.zzmg == 0) {
            return true;
        }
        if (this.zzmh <= this.zzmg) {
            return false;
        }
        Integer num = this.zzmi.get(str2);
        Integer num2 = num;
        if (num == null) {
            num2 = 0;
        }
        return num2.intValue() > this.zzmg && this.zzmh >= num2.intValue();
    }
}
