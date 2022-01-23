package com.google.firebase.auth;

public abstract class OAuthCredential extends AuthCredential {
    public OAuthCredential() {
    }

    public abstract String getAccessToken();

    public abstract String getIdToken();
}
