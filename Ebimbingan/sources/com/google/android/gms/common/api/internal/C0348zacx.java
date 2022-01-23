package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.zacx */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0348zacx {
    public static final C0236Status zaa;
    @C0617VisibleForTesting
    final Set<C0244BasePendingResult<?>> zab;
    private final C0347zacw zac;

    static {
        C0236Status status;
        new C0236Status(8, "The connection to Google Play services was lost");
        zaa = status;
    }

    public C0348zacx() {
        Map map;
        C0347zacw zacw;
        new WeakHashMap();
        this.zab = Collections.synchronizedSet(Collections.newSetFromMap(map));
        new C0347zacw(this);
        this.zac = zacw;
    }

    /* access modifiers changed from: package-private */
    public final void zaa(C0244BasePendingResult<? extends C0231Result> basePendingResult) {
        C0244BasePendingResult<? extends C0231Result> basePendingResult2 = basePendingResult;
        boolean add = this.zab.add(basePendingResult2);
        basePendingResult2.zan(this.zac);
    }

    public final void zab() {
        C0244BasePendingResult[] basePendingResultArr = (C0244BasePendingResult[]) this.zab.toArray(new C0244BasePendingResult[0]);
        int length = basePendingResultArr.length;
        for (int i = 0; i < length; i++) {
            C0244BasePendingResult basePendingResult = basePendingResultArr[i];
            basePendingResult.zan((C0347zacw) null);
            if (basePendingResult.zaj()) {
                boolean remove = this.zab.remove(basePendingResult);
            }
        }
    }
}
