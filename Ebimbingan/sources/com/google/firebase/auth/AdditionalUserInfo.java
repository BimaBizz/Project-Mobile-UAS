package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.util.Map;

public interface AdditionalUserInfo extends C0463SafeParcelable {
    Map<String, Object> getProfile();

    String getProviderId();

    String getUsername();

    boolean isNewUser();
}
