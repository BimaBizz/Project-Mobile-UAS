package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

public interface FirebaseUserMetadata extends C0463SafeParcelable {
    long getCreationTimestamp();

    long getLastSignInTimestamp();
}
