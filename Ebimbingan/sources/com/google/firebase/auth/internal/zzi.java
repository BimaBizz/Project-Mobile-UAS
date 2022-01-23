package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzbl;
import com.google.android.gms.internal.firebase_auth.zzem;
import com.google.android.gms.internal.firebase_auth.zzew;
import com.google.firebase.auth.UserInfo;
import org.json.JSONException;
import org.json.JSONObject;

@C0463SafeParcelable.Class(creator = "DefaultAuthUserInfoCreator")
public final class zzi extends C0460AbstractSafeParcelable implements UserInfo {
    public static final Parcelable.Creator<zzi> CREATOR;
    @C0463SafeParcelable.Field(getter = "getProviderId", id = 2)
    @NonNull
    private String zzia;
    @C0463SafeParcelable.Field(getter = "getEmail", id = 5)
    @Nullable
    private String zzif;
    @C0463SafeParcelable.Field(getter = "getPhoneNumber", id = 6)
    @Nullable
    private String zzjo;
    @C0463SafeParcelable.Field(getter = "getDisplayName", id = 3)
    @Nullable
    private String zzjv;
    @Nullable
    private Uri zzjz;
    @C0463SafeParcelable.Field(getter = "getPhotoUrlString", id = 4)
    @Nullable
    private String zzkc;
    @C0463SafeParcelable.Field(getter = "isEmailVerified", id = 7)
    private boolean zzrp;
    @C0463SafeParcelable.Field(getter = "getRawUserInfo", id = 8)
    @Nullable
    private String zzsd;
    @C0463SafeParcelable.Field(getter = "getUid", id = 1)
    @NonNull
    private String zztg;

    @C0463SafeParcelable.Constructor
    @C0617VisibleForTesting
    public zzi(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) String str2, @C0463SafeParcelable.Param(id = 5) @Nullable String str3, @C0463SafeParcelable.Param(id = 4) @Nullable String str4, @C0463SafeParcelable.Param(id = 3) @Nullable String str5, @C0463SafeParcelable.Param(id = 6) @Nullable String str6, @C0463SafeParcelable.Param(id = 7) boolean z, @C0463SafeParcelable.Param(id = 8) @Nullable String str7) {
        boolean z2 = z;
        String str8 = str7;
        this.zztg = str;
        this.zzia = str2;
        this.zzif = str3;
        this.zzjo = str4;
        this.zzjv = str5;
        this.zzkc = str6;
        if (!TextUtils.isEmpty(this.zzkc)) {
            this.zzjz = Uri.parse(this.zzkc);
        }
        this.zzrp = z2;
        this.zzsd = str8;
    }

    public zzi(zzem zzem, String str) {
        zzem zzem2 = zzem;
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(zzem2);
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        this.zztg = C0446Preconditions.checkNotEmpty(zzem2.getLocalId());
        this.zzia = str2;
        this.zzif = zzem2.getEmail();
        this.zzjv = zzem2.getDisplayName();
        Uri photoUri = zzem2.getPhotoUri();
        Uri uri = photoUri;
        if (photoUri != null) {
            this.zzkc = uri.toString();
            this.zzjz = uri;
        }
        this.zzrp = zzem2.isEmailVerified();
        this.zzsd = null;
        this.zzjo = zzem2.getPhoneNumber();
    }

    public zzi(zzew zzew) {
        zzew zzew2 = zzew;
        Object checkNotNull = C0446Preconditions.checkNotNull(zzew2);
        this.zztg = zzew2.zzbo();
        this.zzia = C0446Preconditions.checkNotEmpty(zzew2.getProviderId());
        this.zzjv = zzew2.getDisplayName();
        Uri photoUri = zzew2.getPhotoUri();
        Uri uri = photoUri;
        if (photoUri != null) {
            this.zzkc = uri.toString();
            this.zzjz = uri;
        }
        this.zzif = zzew2.getEmail();
        this.zzjo = zzew2.getPhoneNumber();
        this.zzrp = false;
        this.zzsd = zzew2.getRawUserInfo();
    }

    @NonNull
    public final String getUid() {
        return this.zztg;
    }

    @NonNull
    public final String getProviderId() {
        return this.zzia;
    }

    @Nullable
    public final String getDisplayName() {
        return this.zzjv;
    }

    @Nullable
    public final Uri getPhotoUrl() {
        if (!TextUtils.isEmpty(this.zzkc) && this.zzjz == null) {
            this.zzjz = Uri.parse(this.zzkc);
        }
        return this.zzjz;
    }

    @Nullable
    public final String getEmail() {
        return this.zzif;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.zzjo;
    }

    public final boolean isEmailVerified() {
        return this.zzrp;
    }

    @Nullable
    public final String getRawUserInfo() {
        return this.zzsd;
    }

    @Nullable
    public final String zzew() {
        JSONObject jSONObject;
        Throwable th;
        new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        try {
            JSONObject putOpt = jSONObject2.putOpt("userId", this.zztg);
            JSONObject putOpt2 = jSONObject2.putOpt("providerId", this.zzia);
            JSONObject putOpt3 = jSONObject2.putOpt("displayName", this.zzjv);
            JSONObject putOpt4 = jSONObject2.putOpt("photoUrl", this.zzkc);
            JSONObject putOpt5 = jSONObject2.putOpt("email", this.zzif);
            JSONObject putOpt6 = jSONObject2.putOpt("phoneNumber", this.zzjo);
            JSONObject putOpt7 = jSONObject2.putOpt("isEmailVerified", Boolean.valueOf(this.zzrp));
            JSONObject putOpt8 = jSONObject2.putOpt("rawUserInfo", this.zzsd);
            return jSONObject2.toString();
        } catch (JSONException e) {
            JSONException jSONException = e;
            int d = Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            Throwable th2 = th;
            new zzbl((Throwable) jSONException);
            throw th2;
        }
    }

    @Nullable
    public static zzi zzda(String str) {
        Throwable th;
        JSONObject jSONObject;
        zzi zzi;
        try {
            new JSONObject(str);
            JSONObject jSONObject2 = jSONObject;
            JSONObject jSONObject3 = jSONObject2;
            zzi zzi2 = zzi;
            new zzi(jSONObject2.optString("userId"), jSONObject3.optString("providerId"), jSONObject3.optString("email"), jSONObject3.optString("phoneNumber"), jSONObject3.optString("displayName"), jSONObject3.optString("photoUrl"), jSONObject3.optBoolean("isEmailVerified"), jSONObject3.optString("rawUserInfo"));
            return zzi2;
        } catch (JSONException e) {
            JSONException jSONException = e;
            int d = Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            Throwable th2 = th;
            new zzbl((Throwable) jSONException);
            throw th2;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, getUid(), false);
        C0462SafeParcelWriter.writeString(parcel2, 2, getProviderId(), false);
        C0462SafeParcelWriter.writeString(parcel2, 3, getDisplayName(), false);
        C0462SafeParcelWriter.writeString(parcel2, 4, this.zzkc, false);
        C0462SafeParcelWriter.writeString(parcel2, 5, getEmail(), false);
        C0462SafeParcelWriter.writeString(parcel2, 6, getPhoneNumber(), false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 7, isEmailVerified());
        C0462SafeParcelWriter.writeString(parcel2, 8, this.zzsd, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzi> creator;
        new zzh();
        CREATOR = creator;
    }
}
