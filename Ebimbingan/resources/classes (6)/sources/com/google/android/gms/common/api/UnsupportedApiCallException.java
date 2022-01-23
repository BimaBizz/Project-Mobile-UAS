package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature zza;

    @KeepForSdk
    public UnsupportedApiCallException(@RecentlyNonNull Feature feature) {
        this.zza = feature;
    }

    @RecentlyNonNull
    public String getMessage() {
        StringBuilder sb;
        String valueOf = String.valueOf(this.zza);
        new StringBuilder(String.valueOf(valueOf).length() + 8);
        StringBuilder append = sb.append("Missing ");
        StringBuilder append2 = sb.append(valueOf);
        return sb.toString();
    }
}
