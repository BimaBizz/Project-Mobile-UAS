package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.annotation.C0208KeepForSdkWithMembers;
import com.google.android.gms.common.api.C0218CommonStatusCodes;
import com.google.android.gms.common.internal.C0452ShowFirstParty;

@C0208KeepForSdkWithMembers
@C0452ShowFirstParty
/* renamed from: com.google.android.gms.auth.api.proxy.AuthApiStatusCodes */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0114AuthApiStatusCodes extends C0218CommonStatusCodes {
    @C0452ShowFirstParty
    public static final int AUTH_API_ACCESS_FORBIDDEN = 3001;
    @C0452ShowFirstParty
    public static final int AUTH_API_CLIENT_ERROR = 3002;
    @C0452ShowFirstParty
    public static final int AUTH_API_INVALID_CREDENTIALS = 3000;
    @C0452ShowFirstParty
    public static final int AUTH_API_SERVER_ERROR = 3003;
    @C0452ShowFirstParty
    public static final int AUTH_APP_CERT_ERROR = 3006;
    @C0452ShowFirstParty
    public static final int AUTH_TOKEN_ERROR = 3004;
    @C0452ShowFirstParty
    public static final int AUTH_URL_RESOLUTION = 3005;

    public static String getStatusCodeString(int i) {
        int i2 = i;
        switch (i2) {
            case 3000:
                return "AUTH_API_INVALID_CREDENTIALS";
            case 3001:
                return "AUTH_API_ACCESS_FORBIDDEN";
            case 3002:
                return "AUTH_API_CLIENT_ERROR";
            case 3003:
                return "AUTH_API_SERVER_ERROR";
            case 3004:
                return "AUTH_TOKEN_ERROR";
            case 3005:
                return "AUTH_URL_RESOLUTION";
            case 3006:
                return "AUTH_APP_CERT_ERROR";
            default:
                return C0218CommonStatusCodes.getStatusCodeString(i2);
        }
    }

    private C0114AuthApiStatusCodes() {
    }
}
