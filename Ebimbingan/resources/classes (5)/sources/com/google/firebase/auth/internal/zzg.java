package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zzf;
import java.util.List;

@SafeParcelable.Class(creator = "DefaultAuthResultCreator")
public final class zzg implements AuthResult {
    public static final Parcelable.Creator<zzg> CREATOR;
    @SafeParcelable.Field(getter = "getUser", id = 1)
    private zzm zztd;
    @SafeParcelable.Field(getter = "getAdditionalUserInfo", id = 2)
    private zze zzte;
    @SafeParcelable.Field(getter = "getOAuthCredential", id = 3)
    private zzf zztf;

    @SafeParcelable.Constructor
    zzg(@SafeParcelable.Param(id = 1) zzm zzm, @SafeParcelable.Param(id = 2) zze zze, @SafeParcelable.Param(id = 3) zzf zzf) {
        this.zztd = zzm;
        this.zzte = zze;
        this.zztf = zzf;
    }

    public zzg(zzm zzm) {
        zze zze;
        zze zze2;
        zzm zzm2 = zzm;
        this.zztd = (zzm) Preconditions.checkNotNull(zzm2);
        List<zzi> zzff = this.zztd.zzff();
        this.zzte = null;
        for (int i = 0; i < zzff.size(); i++) {
            if (!TextUtils.isEmpty(zzff.get(i).getRawUserInfo())) {
                new zze(zzff.get(i).getProviderId(), zzff.get(i).getRawUserInfo(), zzm2.isNewUser());
                this.zzte = zze2;
            }
        }
        if (this.zzte == null) {
            new zze(zzm2.isNewUser());
            this.zzte = zze;
        }
        this.zztf = zzm2.zzdo();
    }

    @Nullable
    public final FirebaseUser getUser() {
        return this.zztd;
    }

    @Nullable
    public final AdditionalUserInfo getAdditionalUserInfo() {
        return this.zzte;
    }

    public final AuthCredential getCredential() {
        return this.zztf;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [android.os.Parcelable, com.google.firebase.auth.FirebaseUser] */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.os.Parcelable, com.google.firebase.auth.AdditionalUserInfo] */
    /* JADX WARNING: type inference failed for: r8v5, types: [android.os.Parcelable, com.google.firebase.auth.zzf] */
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, getUser(), i2, false);
        SafeParcelWriter.writeParcelable(parcel2, 2, getAdditionalUserInfo(), i2, false);
        SafeParcelWriter.writeParcelable(parcel2, 3, this.zztf, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final int describeContents() {
        return 0;
    }

    static {
        Parcelable.Creator<zzg> creator;
        new zzf();
        CREATOR = creator;
    }
}
