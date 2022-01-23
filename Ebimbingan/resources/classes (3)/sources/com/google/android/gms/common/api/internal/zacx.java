package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zacx {
    public static final Status zaa;
    @VisibleForTesting
    final Set<BasePendingResult<?>> zab;
    private final zacw zac;

    static {
        Status status;
        new Status(8, "The connection to Google Play services was lost");
        zaa = status;
    }

    public zacx() {
        Map map;
        zacw zacw;
        new WeakHashMap();
        this.zab = Collections.synchronizedSet(Collections.newSetFromMap(map));
        new zacw(this);
        this.zac = zacw;
    }

    /* access modifiers changed from: package-private */
    public final void zaa(BasePendingResult<? extends Result> basePendingResult) {
        BasePendingResult<? extends Result> basePendingResult2 = basePendingResult;
        boolean add = this.zab.add(basePendingResult2);
        basePendingResult2.zan(this.zac);
    }

    public final void zab() {
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.zab.toArray(new BasePendingResult[0]);
        int length = basePendingResultArr.length;
        for (int i = 0; i < length; i++) {
            BasePendingResult basePendingResult = basePendingResultArr[i];
            basePendingResult.zan((zacw) null);
            if (basePendingResult.zaj()) {
                boolean remove = this.zab.remove(basePendingResult);
            }
        }
    }
}
