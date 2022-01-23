package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.common.api.internal.zay */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0370zay implements C0225PendingResult.StatusListener {
    final /* synthetic */ C0244BasePendingResult zaa;
    final /* synthetic */ C0271zaaa zab;

    C0370zay(C0271zaaa zaaa, C0244BasePendingResult basePendingResult) {
        this.zab = zaaa;
        this.zaa = basePendingResult;
    }

    public final void onComplete(C0236Status status) {
        C0236Status status2 = status;
        Object remove = this.zab.zaa.remove(this.zaa);
    }
}
