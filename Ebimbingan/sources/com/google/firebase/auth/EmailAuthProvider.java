package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0446Preconditions;

public class EmailAuthProvider {
    public static final String EMAIL_LINK_SIGN_IN_METHOD = "emailLink";
    public static final String EMAIL_PASSWORD_SIGN_IN_METHOD = "password";
    public static final String PROVIDER_ID = "password";

    private EmailAuthProvider() {
    }

    public static AuthCredential getCredential(@NonNull String str, @NonNull String str2) {
        AuthCredential authCredential;
        String str3 = str;
        String str4 = str2;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str3);
        String checkNotEmpty2 = C0446Preconditions.checkNotEmpty(str4);
        new EmailAuthCredential(str3, str4);
        return authCredential;
    }

    public static AuthCredential getCredentialWithLink(@NonNull String str, @NonNull String str2) {
        AuthCredential authCredential;
        Throwable th;
        String str3 = str;
        String str4 = str2;
        if (!EmailAuthCredential.isSignInWithEmailLink(str4)) {
            Throwable th2 = th;
            new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
            throw th2;
        }
        new EmailAuthCredential(str3, (String) null, str4, (String) null, false);
        return authCredential;
    }
}
