package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

/* renamed from: com.google.android.gms.common.api.UnsupportedApiCallException */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0238UnsupportedApiCallException extends UnsupportedOperationException {
    private final C0186Feature zza;

    @C0206KeepForSdk
    public C0238UnsupportedApiCallException(@RecentlyNonNull C0186Feature feature) {
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
