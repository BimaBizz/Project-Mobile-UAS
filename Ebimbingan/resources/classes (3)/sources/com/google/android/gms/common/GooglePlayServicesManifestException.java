package com.google.android.gms.common;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class GooglePlayServicesManifestException extends IllegalStateException {
    private final int zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GooglePlayServicesManifestException(int i, @RecentlyNonNull String str) {
        super(str);
        this.zza = i;
    }

    public int getActualVersion() {
        return this.zza;
    }

    public int getExpectedVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
