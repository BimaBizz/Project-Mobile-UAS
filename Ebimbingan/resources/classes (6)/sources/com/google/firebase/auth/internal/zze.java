package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import java.util.Map;
import javax.annotation.Nullable;

@SafeParcelable.Class(creator = "DefaultAdditionalUserInfoCreator")
public final class zze implements AdditionalUserInfo {
    public static final Parcelable.Creator<zze> CREATOR;
    @SafeParcelable.Field(getter = "getProviderId", id = 1)
    private final String zzia;
    @SafeParcelable.Field(getter = "isNewUser", id = 3)
    private boolean zzrg;
    @SafeParcelable.Field(getter = "getRawUserInfo", id = 2)
    private final String zzsd;
    private Map<String, Object> zztc;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) boolean z) {
        String str3 = str;
        String str4 = str2;
        String checkNotEmpty = Preconditions.checkNotEmpty(str3);
        String checkNotEmpty2 = Preconditions.checkNotEmpty(str4);
        this.zzia = str3;
        this.zzsd = str4;
        this.zztc = zzam.zzde(str4);
        this.zzrg = z;
    }

    public zze(boolean z) {
        this.zzrg = z;
        this.zzsd = null;
        this.zzia = null;
        this.zztc = null;
    }

    @Nullable
    public final String getProviderId() {
        return this.zzia;
    }

    @Nullable
    public final Map<String, Object> getProfile() {
        return this.zztc;
    }

    @Nullable
    public final String getUsername() {
        if ("github.com".equals(this.zzia)) {
            return (String) this.zztc.get("login");
        }
        if ("twitter.com".equals(this.zzia)) {
            return (String) this.zztc.get("screen_name");
        }
        return null;
    }

    public final boolean isNewUser() {
        return this.zzrg;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, getProviderId(), false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzsd, false);
        SafeParcelWriter.writeBoolean(parcel2, 3, isNewUser());
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final int describeContents() {
        return 0;
    }

    static {
        Parcelable.Creator<zze> creator;
        new zzd();
        CREATOR = creator;
    }
}
