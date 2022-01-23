package com.google.android.gms.common.util;

import com.google.android.gms.auth.api.credentials.CredentialsApi;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zza {
    public static int zza(int i) {
        int i2 = i;
        if (i2 == -1) {
            return -1;
        }
        return i2 / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
    }
}
