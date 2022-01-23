package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import javax.annotation.Nullable;
import org.json.JSONObject;

public abstract class zzx extends C0460AbstractSafeParcelable {
    public zzx() {
    }

    @Nullable
    public abstract JSONObject toJson();
}
