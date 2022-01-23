package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

public interface AuthResult extends C0463SafeParcelable {
    AdditionalUserInfo getAdditionalUserInfo();

    AuthCredential getCredential();

    FirebaseUser getUser();
}
