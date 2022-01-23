package com.google.android.gms.auth.api.phone;

import com.google.android.gms.common.api.C0218CommonStatusCodes;

/* renamed from: com.google.android.gms.auth.api.phone.SmsRetrieverStatusCodes */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public final class C0112SmsRetrieverStatusCodes extends C0218CommonStatusCodes {
    public static final int API_NOT_AVAILABLE = 36501;
    public static final int PLATFORM_NOT_SUPPORTED = 36500;
    public static final int USER_PERMISSION_REQUIRED = 36502;

    public static String getStatusCodeString(int i) {
        int i2 = i;
        switch (i2) {
            case 36500:
                return "PLATFORM_NOT_SUPPORTED";
            case 36501:
                return "API_NOT_AVAILABLE";
            case 36502:
                return "USER_PERMISSION_REQUIRED";
            default:
                return C0218CommonStatusCodes.getStatusCodeString(i2);
        }
    }

    private C0112SmsRetrieverStatusCodes() {
    }
}
