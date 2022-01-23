package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;

public abstract class AuthCredential extends C0460AbstractSafeParcelable {
    AuthCredential() {
    }

    public abstract String getProvider();

    public abstract String getSignInMethod();
}
