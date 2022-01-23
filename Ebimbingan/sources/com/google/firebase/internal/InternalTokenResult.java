package com.google.firebase.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0444Objects;

@C0206KeepForSdk
public class InternalTokenResult {
    private String zza;

    @C0206KeepForSdk
    public InternalTokenResult(@Nullable String str) {
        this.zza = str;
    }

    @C0206KeepForSdk
    @Nullable
    public String getToken() {
        return this.zza;
    }

    public int hashCode() {
        return C0444Objects.hashCode(this.zza);
    }

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof InternalTokenResult)) {
            return false;
        }
        return C0444Objects.equal(this.zza, ((InternalTokenResult) obj2).zza);
    }

    public String toString() {
        return C0444Objects.toStringHelper(this).add("token", this.zza).toString();
    }
}
