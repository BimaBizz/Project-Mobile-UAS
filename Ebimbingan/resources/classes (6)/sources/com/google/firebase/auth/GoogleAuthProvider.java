package com.google.firebase.auth;

import androidx.annotation.Nullable;

public class GoogleAuthProvider {
    public static final String GOOGLE_SIGN_IN_METHOD = "google.com";
    public static final String PROVIDER_ID = "google.com";

    private GoogleAuthProvider() {
    }

    public static AuthCredential getCredential(@Nullable String str, @Nullable String str2) {
        AuthCredential authCredential;
        new GoogleAuthCredential(str, str2);
        return authCredential;
    }
}
