package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.firebase.auth.FirebaseUserMetadata;
import org.json.JSONException;
import org.json.JSONObject;

@C0463SafeParcelable.Class(creator = "DefaultFirebaseUserMetadataCreator")
public final class zzo implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzo> CREATOR;
    @C0463SafeParcelable.Field(getter = "getCreationTimestamp", id = 2)
    private long zzrr;
    @C0463SafeParcelable.Field(getter = "getLastSignInTimestamp", id = 1)
    private long zztr;

    @C0463SafeParcelable.Constructor
    public zzo(@C0463SafeParcelable.Param(id = 1) long j, @C0463SafeParcelable.Param(id = 2) long j2) {
        this.zztr = j;
        this.zzrr = j2;
    }

    public final long getLastSignInTimestamp() {
        return this.zztr;
    }

    public final long getCreationTimestamp() {
        return this.zzrr;
    }

    public final JSONObject zzfg() {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        try {
            JSONObject put = jSONObject2.put("lastSignInTimestamp", this.zztr);
            JSONObject put2 = jSONObject2.put("creationTimestamp", this.zzrr);
        } catch (JSONException e) {
        }
        return jSONObject2;
    }

    public static zzo zzb(JSONObject jSONObject) {
        zzo zzo;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return null;
        }
        try {
            zzo zzo2 = zzo;
            new zzo(jSONObject2.getLong("lastSignInTimestamp"), jSONObject2.getLong("creationTimestamp"));
            return zzo2;
        } catch (JSONException e) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeLong(parcel2, 1, getLastSignInTimestamp());
        C0462SafeParcelWriter.writeLong(parcel2, 2, getCreationTimestamp());
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final int describeContents() {
        return 0;
    }

    static {
        Parcelable.Creator<zzo> creator;
        new zzn();
        CREATOR = creator;
    }
}
