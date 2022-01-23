package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class HashAccumulator {
    @VisibleForTesting
    static int zaa = 31;
    private int zab = 1;

    public HashAccumulator() {
    }

    @RecentlyNonNull
    @KeepForSdk
    public HashAccumulator addObject(@Nullable Object obj) {
        Object obj2 = obj;
        this.zab = (zaa * this.zab) + (obj2 == null ? 0 : obj2.hashCode());
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.zab;
    }

    @RecentlyNonNull
    public final HashAccumulator zaa(boolean z) {
        this.zab = (zaa * this.zab) + (z ? 1 : 0);
        return this;
    }
}
