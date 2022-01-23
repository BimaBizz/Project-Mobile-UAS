package com.google.android.gms.internal.firebase_auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zzf;
import java.util.List;

@SafeParcelable.Class(creator = "GetAccountInfoUserCreator")
@SafeParcelable.Reserved({1})
public final class zzem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzem> CREATOR;
    @SafeParcelable.Field(getter = "getEmail", id = 3)
    private String zzif;
    @SafeParcelable.Field(getter = "getPassword", id = 8)
    private String zzig;
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 9)
    private String zzjo;
    @SafeParcelable.Field(getter = "getDisplayName", id = 5)
    private String zzjv;
    @SafeParcelable.Field(getter = "getPhotoUrl", id = 6)
    private String zzkc;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 13)
    private zzf zzkw;
    @SafeParcelable.Field(getter = "getMfaInfoList", id = 14)
    private List<zzeu> zzky;
    @SafeParcelable.Field(getter = "getLocalId", id = 2)
    private String zzrf;
    @SafeParcelable.Field(getter = "isNewUser", id = 12)
    private boolean zzrg;
    @SafeParcelable.Field(getter = "isEmailVerified", id = 4)
    private boolean zzrp;
    @SafeParcelable.Field(getter = "getProviderInfoList", id = 7)
    private zzey zzrq;
    @SafeParcelable.Field(getter = "getCreationTimestamp", id = 10)
    private long zzrr;
    @SafeParcelable.Field(getter = "getLastSignInTimestamp", id = 11)
    private long zzrs;

    public zzem() {
        zzey zzey;
        new zzey();
        this.zzrq = zzey;
    }

    @SafeParcelable.Constructor
    public zzem(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) zzey zzey, @SafeParcelable.Param(id = 8) String str5, @SafeParcelable.Param(id = 9) String str6, @SafeParcelable.Param(id = 10) long j, @SafeParcelable.Param(id = 11) long j2, @SafeParcelable.Param(id = 12) boolean z2, @SafeParcelable.Param(id = 13) zzf zzf, @SafeParcelable.Param(id = 14) List<zzeu> list) {
        zzey zza;
        zzey zzey2;
        zzey zzey3 = zzey;
        String str7 = str5;
        String str8 = str6;
        long j3 = j;
        long j4 = j2;
        boolean z3 = z2;
        zzf zzf2 = zzf;
        List<zzeu> list2 = list;
        this.zzrf = str;
        this.zzif = str2;
        this.zzrp = z;
        this.zzjv = str3;
        this.zzkc = str4;
        if (zzey3 == null) {
            zza = zzey2;
            new zzey();
        } else {
            zza = zzey.zza(zzey3);
        }
        this.zzrq = zza;
        this.zzig = str7;
        this.zzjo = str8;
        this.zzrr = j3;
        this.zzrs = j4;
        this.zzrg = z3;
        this.zzkw = zzf2;
        this.zzky = list2 == null ? zzay.zzce() : list2;
    }

    @Nullable
    public final String getEmail() {
        return this.zzif;
    }

    public final boolean isEmailVerified() {
        return this.zzrp;
    }

    @NonNull
    public final String getLocalId() {
        return this.zzrf;
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

    @Nullable
    public final String getPhoneNumber() {
        return this.zzjo;
    }

    public final long getCreationTimestamp() {
        return this.zzrr;
    }

    public final long getLastSignInTimestamp() {
        return this.zzrs;
    }

    public final boolean isNewUser() {
        return this.zzrg;
    }

    @NonNull
    public final zzem zzcf(@Nullable String str) {
        this.zzif = str;
        return this;
    }

    @NonNull
    public final zzem zzcg(@Nullable String str) {
        this.zzjv = str;
        return this;
    }

    @NonNull
    public final zzem zzch(@Nullable String str) {
        this.zzkc = str;
        return this;
    }

    @NonNull
    public final zzem zzci(String str) {
        String str2 = str;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        this.zzig = str2;
        return this;
    }

    @NonNull
    public final zzem zzc(List<zzew> list) {
        zzey zzey;
        List<zzew> list2 = list;
        Object checkNotNull = Preconditions.checkNotNull(list2);
        new zzey();
        this.zzrq = zzey;
        boolean addAll = this.zzrq.zzes().addAll(list2);
        return this;
    }

    public final zzem zzo(boolean z) {
        this.zzrg = z;
        return this;
    }

    @NonNull
    public final List<zzew> zzes() {
        return this.zzrq.zzes();
    }

    public final zzey zzet() {
        return this.zzrq;
    }

    @Nullable
    public final zzf zzdo() {
        return this.zzkw;
    }

    @NonNull
    public final zzem zza(zzf zzf) {
        this.zzkw = zzf;
        return this;
    }

    @NonNull
    public final List<zzeu> zzbc() {
        return this.zzky;
    }

    /* JADX WARNING: type inference failed for: r8v11, types: [android.os.Parcelable, com.google.android.gms.internal.firebase_auth.zzey] */
    /* JADX WARNING: type inference failed for: r8v23, types: [android.os.Parcelable, com.google.firebase.auth.zzf] */
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 2, this.zzrf, false);
        SafeParcelWriter.writeString(parcel2, 3, this.zzif, false);
        SafeParcelWriter.writeBoolean(parcel2, 4, this.zzrp);
        SafeParcelWriter.writeString(parcel2, 5, this.zzjv, false);
        SafeParcelWriter.writeString(parcel2, 6, this.zzkc, false);
        SafeParcelWriter.writeParcelable(parcel2, 7, this.zzrq, i2, false);
        SafeParcelWriter.writeString(parcel2, 8, this.zzig, false);
        SafeParcelWriter.writeString(parcel2, 9, this.zzjo, false);
        SafeParcelWriter.writeLong(parcel2, 10, this.zzrr);
        SafeParcelWriter.writeLong(parcel2, 11, this.zzrs);
        SafeParcelWriter.writeBoolean(parcel2, 12, this.zzrg);
        SafeParcelWriter.writeParcelable(parcel2, 13, this.zzkw, i2, false);
        SafeParcelWriter.writeTypedList(parcel2, 14, this.zzky, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzem> creator;
        new zzep();
        CREATOR = creator;
    }
}
