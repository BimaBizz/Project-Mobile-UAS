package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zay implements PendingResult.StatusListener {
    final /* synthetic */ BasePendingResult zaa;
    final /* synthetic */ zaaa zab;

    zay(zaaa zaaa, BasePendingResult basePendingResult) {
        this.zab = zaaa;
        this.zaa = basePendingResult;
    }

    public final void onComplete(Status status) {
        Status status2 = status;
        Object remove = this.zab.zaa.remove(this.zaa);
    }
}
