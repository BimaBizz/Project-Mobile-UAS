package com.google.android.gms.auth;

import android.content.Intent;

/* renamed from: com.google.android.gms.auth.GooglePlayServicesAvailabilityException */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0017GooglePlayServicesAvailabilityException extends C0019UserRecoverableAuthException {
    private final int zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0017GooglePlayServicesAvailabilityException(int i, String str, Intent intent) {
        super(str, intent);
        this.zza = i;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
