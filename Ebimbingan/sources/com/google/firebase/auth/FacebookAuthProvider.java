package com.google.firebase.auth;

import androidx.annotation.NonNull;

public class FacebookAuthProvider {
    public static final String FACEBOOK_SIGN_IN_METHOD = "facebook.com";
    public static final String PROVIDER_ID = "facebook.com";

    private FacebookAuthProvider() {
    }

    public static AuthCredential getCredential(@NonNull String str) {
        AuthCredential authCredential;
        new FacebookAuthCredential(str);
        return authCredential;
    }
}
