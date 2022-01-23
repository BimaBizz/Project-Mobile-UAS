package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzbl;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "PhoneMultiFactorInfoCreator")
public final class zzac extends zzx {
    public static final Parcelable.Creator<zzac> CREATOR;
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 4)
    private final String zzjo;
    @SafeParcelable.Field(getter = "getUid", id = 1)
    private final String zzju;
    @SafeParcelable.Field(getter = "getDisplayName", id = 2)
    @Nullable
    private final String zzjv;
    @SafeParcelable.Field(getter = "getEnrollmentTimestamp", id = 3)
    private final long zzjw;

    @SafeParcelable.Constructor
    public zzac(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) @Nullable String str2, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) String str3) {
        this.zzju = Preconditions.checkNotEmpty(str);
        this.zzjv = str2;
        this.zzjw = j;
        this.zzjo = Preconditions.checkNotEmpty(str3);
    }

    public static zzac zza(JSONObject jSONObject) {
        zzac zzac;
        Throwable th;
        JSONObject jSONObject2 = jSONObject;
        if (!jSONObject2.has("enrollmentTimestamp")) {
            Throwable th2 = th;
            new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
            throw th2;
        }
        new zzac(jSONObject2.optString("uid"), jSONObject2.optString("displayName"), jSONObject2.optLong("enrollmentTimestamp"), jSONObject2.optString("phoneNumber"));
        return zzac;
    }

    @Nullable
    public final JSONObject toJson() {
        JSONObject jSONObject;
        Throwable th;
        new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        try {
            JSONObject putOpt = jSONObject2.putOpt("factorIdKey", "phone");
            JSONObject putOpt2 = jSONObject2.putOpt("uid", this.zzju);
            JSONObject putOpt3 = jSONObject2.putOpt("displayName", this.zzjv);
            JSONObject putOpt4 = jSONObject2.putOpt("enrollmentTimestamp", Long.valueOf(this.zzjw));
            JSONObject putOpt5 = jSONObject2.putOpt("phoneNumber", this.zzjo);
            return jSONObject2;
        } catch (JSONException e) {
            JSONException jSONException = e;
            int d = Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            Throwable th2 = th;
            new zzbl((Throwable) jSONException);
            throw th2;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzju, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzjv, false);
        SafeParcelWriter.writeLong(parcel2, 3, this.zzjw);
        SafeParcelWriter.writeString(parcel2, 4, this.zzjo, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzac> creator;
        new zzab();
        CREATOR = creator;
    }
}
