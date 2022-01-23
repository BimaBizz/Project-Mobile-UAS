package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0227Releasable;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.data.C0400DataHolder;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.DataHolderResult */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0247DataHolderResult implements C0231Result, C0227Releasable {
    @RecentlyNonNull
    @C0206KeepForSdk
    protected final C0400DataHolder mDataHolder;
    @RecentlyNonNull
    @C0206KeepForSdk
    protected final C0236Status mStatus;

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C0247DataHolderResult(@androidx.annotation.RecentlyNonNull com.google.android.gms.common.data.C0400DataHolder r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0247DataHolderResult.<init>(com.google.android.gms.common.data.DataHolder):void");
    }

    @C0206KeepForSdk
    protected C0247DataHolderResult(@RecentlyNonNull C0400DataHolder dataHolder, @RecentlyNonNull C0236Status status) {
        this.mStatus = status;
        this.mDataHolder = dataHolder;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public C0236Status getStatus() {
        return this.mStatus;
    }

    @C0206KeepForSdk
    public void release() {
        C0400DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
