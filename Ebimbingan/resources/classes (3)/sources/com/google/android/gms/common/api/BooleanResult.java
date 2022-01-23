package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class BooleanResult implements Result {
    private final Status zaa;
    private final boolean zab;

    @ShowFirstParty
    @KeepForSdk
    public BooleanResult(@RecentlyNonNull Status status, boolean z) {
        this.zaa = (Status) Preconditions.checkNotNull(status, "Status must not be null");
        this.zab = z;
    }

    @RecentlyNonNull
    @KeepForSdk
    public Status getStatus() {
        return this.zaa;
    }

    @KeepForSdk
    public boolean getValue() {
        return this.zab;
    }

    @KeepForSdk
    public final int hashCode() {
        return ((this.zaa.hashCode() + 527) * 31) + (this.zab ? 1 : 0);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r1
            if (r2 != 0) goto L_0x0008
            r2 = 0
            r0 = r2
        L_0x0007:
            return r0
        L_0x0008:
            r2 = r1
            r3 = r0
            if (r2 != r3) goto L_0x000f
            r2 = 1
            r0 = r2
            goto L_0x0007
        L_0x000f:
            r2 = r1
            boolean r2 = r2 instanceof com.google.android.gms.common.api.BooleanResult
            if (r2 != 0) goto L_0x0017
            r2 = 0
            r0 = r2
            goto L_0x0007
        L_0x0017:
            r2 = r1
            com.google.android.gms.common.api.BooleanResult r2 = (com.google.android.gms.common.api.BooleanResult) r2
            r1 = r2
            r2 = r0
            com.google.android.gms.common.api.Status r2 = r2.zaa
            r3 = r1
            com.google.android.gms.common.api.Status r3 = r3.zaa
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0032
            r2 = r0
            boolean r2 = r2.zab
            r3 = r1
            boolean r3 = r3.zab
            if (r2 != r3) goto L_0x0032
            r2 = 1
            r0 = r2
            goto L_0x0007
        L_0x0032:
            r2 = 0
            r0 = r2
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.BooleanResult.equals(java.lang.Object):boolean");
    }
}
