package com.google.android.gms.internal.firebase_auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "ProviderUserInfoCreator")
@C0463SafeParcelable.Reserved({1})
public final class zzew extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzew> CREATOR;
    @C0463SafeParcelable.Field(getter = "getProviderId", id = 5)
    private String zzia;
    @C0463SafeParcelable.Field(getter = "getEmail", id = 8)
    private String zzif;
    @C0463SafeParcelable.Field(getter = "getPhoneNumber", id = 7)
    private String zzjo;
    @C0463SafeParcelable.Field(getter = "getDisplayName", id = 3)
    private String zzjv;
    @C0463SafeParcelable.Field(getter = "getPhotoUrl", id = 4)
    private String zzkc;
    @C0463SafeParcelable.Field(getter = "getFederatedId", id = 2)
    private String zzsc;
    @C0463SafeParcelable.Field(getter = "getRawUserInfo", id = 6)
    private String zzsd;

    public zzew() {
    }

    @C0463SafeParcelable.Constructor
    zzew(@C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) String str2, @C0463SafeParcelable.Param(id = 4) String str3, @C0463SafeParcelable.Param(id = 5) String str4, @C0463SafeParcelable.Param(id = 6) String str5, @C0463SafeParcelable.Param(id = 7) String str6, @C0463SafeParcelable.Param(id = 8) String str7) {
        this.zzsc = str;
        this.zzjv = str2;
        this.zzkc = str3;
        this.zzia = str4;
        this.zzsd = str5;
        this.zzjo = str6;
        this.zzif = str7;
    }

    public final String zzbo() {
        return this.zzsc;
    }

    @Nullable
    public final String getDisplayName() {
        return this.zzjv;
    }

    @Nullable
    public final Uri getPhotoUri() {
        if (!TextUtils.isEmpty(this.zzkc)) {
            return Uri.parse(this.zzkc);
        }
        return null;
    }

    public final String getProviderId() {
        return this.zzia;
    }

    public final String getPhoneNumber() {
        return this.zzjo;
    }

    public final void zzco(String str) {
        String str2 = str;
        this.zzsd = str2;
    }

    @Nullable
    public final String getRawUserInfo() {
        return this.zzsd;
    }

    @Nullable
    public final String getEmail() {
        return this.zzif;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzsc, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzjv, false);
        C0462SafeParcelWriter.writeString(parcel2, 4, this.zzkc, false);
        C0462SafeParcelWriter.writeString(parcel2, 5, this.zzia, false);
        C0462SafeParcelWriter.writeString(parcel2, 6, this.zzsd, false);
        C0462SafeParcelWriter.writeString(parcel2, 7, this.zzjo, false);
        C0462SafeParcelWriter.writeString(parcel2, 8, this.zzif, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzew> creator;
        new zzez();
        CREATOR = creator;
    }
}
