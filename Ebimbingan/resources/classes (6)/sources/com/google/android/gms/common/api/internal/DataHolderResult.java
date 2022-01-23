package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class DataHolderResult implements Result, Releasable {
    @RecentlyNonNull
    @KeepForSdk
    protected final DataHolder mDataHolder;
    @RecentlyNonNull
    @KeepForSdk
    protected final Status mStatus;

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected DataHolderResult(@androidx.annotation.RecentlyNonNull com.google.android.gms.common.data.DataHolder r7) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status
            r2 = r3
            r3 = r2
            r4 = r1
            int r4 = r4.getStatusCode()
            r3.<init>(r4)
            r3 = r0
            r4 = r1
            r5 = r2
            r3.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.DataHolderResult.<init>(com.google.android.gms.common.data.DataHolder):void");
    }

    @KeepForSdk
    protected DataHolderResult(@RecentlyNonNull DataHolder dataHolder, @RecentlyNonNull Status status) {
        this.mStatus = status;
        this.mDataHolder = dataHolder;
    }

    @RecentlyNonNull
    @KeepForSdk
    public Status getStatus() {
        return this.mStatus;
    }

    @KeepForSdk
    public void release() {
        DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
