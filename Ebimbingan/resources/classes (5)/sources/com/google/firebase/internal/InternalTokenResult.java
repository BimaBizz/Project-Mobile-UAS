package com.google.firebase.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;

@KeepForSdk
public class InternalTokenResult {
    private String zza;

    @KeepForSdk
    public InternalTokenResult(@Nullable String str) {
        this.zza = str;
    }

    @KeepForSdk
    @Nullable
    public String getToken() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zza});
    }

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof InternalTokenResult)) {
            return false;
        }
        return Objects.equal(this.zza, ((InternalTokenResult) obj2).zza);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("token", this.zza).toString();
    }
}
