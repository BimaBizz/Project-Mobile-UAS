package com.google.firebase.auth;

import androidx.annotation.NonNull;

public class TwitterAuthProvider {
    public static final String PROVIDER_ID = "twitter.com";
    public static final String TWITTER_SIGN_IN_METHOD = "twitter.com";

    private TwitterAuthProvider() {
    }

    public static AuthCredential getCredential(@NonNull String str, @NonNull String str2) {
        AuthCredential authCredential;
        new TwitterAuthCredential(str, str2);
        return authCredential;
    }
}
