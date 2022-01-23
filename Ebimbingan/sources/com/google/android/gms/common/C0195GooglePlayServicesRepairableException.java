package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.GooglePlayServicesRepairableException */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0195GooglePlayServicesRepairableException extends C0205UserRecoverableException {
    private final int zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0195GooglePlayServicesRepairableException(int i, @RecentlyNonNull String str, @RecentlyNonNull Intent intent) {
        super(str, intent);
        this.zza = i;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
