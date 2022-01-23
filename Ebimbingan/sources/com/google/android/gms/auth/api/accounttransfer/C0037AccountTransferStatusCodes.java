package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.C0218CommonStatusCodes;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.AccountTransferStatusCodes */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0037AccountTransferStatusCodes extends C0218CommonStatusCodes {
    public static final int CHALLENGE_NOT_ALLOWED = 20503;
    public static final int INVALID_REQUEST = 20502;
    public static final int NOT_ALLOWED_SECURITY = 20500;
    public static final int NO_DATA_AVAILABLE = 20501;
    public static final int SESSION_INACTIVE = 20504;

    public static String getStatusCodeString(int i) {
        int i2 = i;
        switch (i2) {
            case 20500:
                return "NOT_ALLOWED_SECURITY";
            case 20501:
                return "NO_DATA_AVAILABLE";
            case 20502:
                return "INVALID_REQUEST";
            case 20503:
                return "CHALLENGE_NOT_ALLOWED";
            case 20504:
                return "SESSION_INACTIVE";
            default:
                return C0218CommonStatusCodes.getStatusCodeString(i2);
        }
    }

    private C0037AccountTransferStatusCodes() {
    }
}
