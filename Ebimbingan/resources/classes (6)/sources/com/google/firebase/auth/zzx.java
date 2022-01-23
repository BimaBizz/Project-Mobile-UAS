package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.Nullable;
import org.json.JSONObject;

public abstract class zzx extends AbstractSafeParcelable {
    public zzx() {
    }

    @Nullable
    public abstract JSONObject toJson();
}
