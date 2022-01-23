package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.util.C0617VisibleForTesting;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.auth.api.signin.internal.HashAccumulator */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0132HashAccumulator {
    @C0617VisibleForTesting
    static int zaa = 31;
    private int zab = 1;

    public C0132HashAccumulator() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public C0132HashAccumulator addObject(@Nullable Object obj) {
        Object obj2 = obj;
        this.zab = (zaa * this.zab) + (obj2 == null ? 0 : obj2.hashCode());
        return this;
    }

    @C0206KeepForSdk
    public int hash() {
        return this.zab;
    }

    @RecentlyNonNull
    public final C0132HashAccumulator zaa(boolean z) {
        this.zab = (zaa * this.zab) + (z ? 1 : 0);
        return this;
    }
}
