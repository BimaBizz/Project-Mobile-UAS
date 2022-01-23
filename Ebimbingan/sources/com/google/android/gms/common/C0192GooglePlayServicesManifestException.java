package com.google.android.gms.common;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0209KeepName;

@C0209KeepName
/* renamed from: com.google.android.gms.common.GooglePlayServicesManifestException */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0192GooglePlayServicesManifestException extends IllegalStateException {
    private final int zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0192GooglePlayServicesManifestException(int i, @RecentlyNonNull String str) {
        super(str);
        this.zza = i;
    }

    public int getActualVersion() {
        return this.zza;
    }

    public int getExpectedVersion() {
        return C0190GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
