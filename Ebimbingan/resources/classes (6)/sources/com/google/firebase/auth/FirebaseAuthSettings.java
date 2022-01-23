package com.google.firebase.auth;

import androidx.annotation.Nullable;

public abstract class FirebaseAuthSettings {
    public FirebaseAuthSettings() {
    }

    public abstract void setAutoRetrievedSmsCodeForPhoneNumber(@Nullable String str, @Nullable String str2);
}
