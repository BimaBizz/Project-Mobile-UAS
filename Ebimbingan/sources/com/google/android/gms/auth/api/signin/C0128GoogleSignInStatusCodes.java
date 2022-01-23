package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.C0218CommonStatusCodes;

/* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0128GoogleSignInStatusCodes extends C0218CommonStatusCodes {
    public static final int SIGN_IN_CANCELLED = 12501;
    public static final int SIGN_IN_CURRENTLY_IN_PROGRESS = 12502;
    public static final int SIGN_IN_FAILED = 12500;

    public static String getStatusCodeString(int i) {
        int i2 = i;
        switch (i2) {
            case 12500:
                return "A non-recoverable sign in failure occurred";
            case 12501:
                return "Sign in action cancelled";
            case 12502:
                return "Sign-in in progress";
            default:
                return C0218CommonStatusCodes.getStatusCodeString(i2);
        }
    }

    private C0128GoogleSignInStatusCodes() {
    }
}
