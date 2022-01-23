package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "UserProfileChangeRequestCreator")
@C0463SafeParcelable.Reserved({1})
public class UserProfileChangeRequest extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR;
    @C0463SafeParcelable.Field(getter = "getDisplayName", id = 2)
    private String zzjv;
    private Uri zzjz;
    @C0463SafeParcelable.Field(getter = "shouldRemoveDisplayName", id = 4)
    private boolean zzka;
    @C0463SafeParcelable.Field(getter = "shouldRemovePhotoUri", id = 5)
    private boolean zzkb;
    @C0463SafeParcelable.Field(getter = "getPhotoUrl", id = 3)
    private String zzkc;

    public static class Builder {
        private String zzjv;
        private Uri zzjz;
        private boolean zzka;
        private boolean zzkb;

        public Builder() {
        }

        public Builder setDisplayName(@Nullable String str) {
            String str2 = str;
            if (str2 == null) {
                this.zzka = true;
            } else {
                this.zzjv = str2;
            }
            return this;
        }

        public Builder setPhotoUri(@Nullable Uri uri) {
            Uri uri2 = uri;
            if (uri2 == null) {
                this.zzkb = true;
            } else {
                this.zzjz = uri2;
            }
            return this;
        }

        public UserProfileChangeRequest build() {
            UserProfileChangeRequest userProfileChangeRequest = r7;
            UserProfileChangeRequest userProfileChangeRequest2 = new UserProfileChangeRequest(this.zzjv, this.zzjz == null ? null : this.zzjz.toString(), this.zzka, this.zzkb);
            return userProfileChangeRequest;
        }
    }

    @C0463SafeParcelable.Constructor
    UserProfileChangeRequest(@C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) String str2, @C0463SafeParcelable.Param(id = 4) boolean z, @C0463SafeParcelable.Param(id = 5) boolean z2) {
        String str3 = str2;
        this.zzjv = str;
        this.zzkc = str3;
        this.zzka = z;
        this.zzkb = z2;
        this.zzjz = TextUtils.isEmpty(str3) ? null : Uri.parse(str3);
    }

    @Nullable
    public String getDisplayName() {
        return this.zzjv;
    }

    public final String zzam() {
        return this.zzkc;
    }

    @Nullable
    public Uri getPhotoUri() {
        return this.zzjz;
    }

    public final boolean zzde() {
        return this.zzka;
    }

    public final boolean zzdf() {
        return this.zzkb;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 2, getDisplayName(), false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzkc, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 4, this.zzka);
        C0462SafeParcelWriter.writeBoolean(parcel2, 5, this.zzkb);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<UserProfileChangeRequest> creator;
        new zzaf();
        CREATOR = creator;
    }
}
