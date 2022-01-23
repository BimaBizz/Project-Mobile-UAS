package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInCredentialCreator")
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR;
    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String zzbf;
    @SafeParcelable.Field(getter = "getDisplayName", id = 2)
    @Nullable
    private final String zzbg;
    @SafeParcelable.Field(getter = "getGivenName", id = 3)
    @Nullable
    private final String zzbh;
    @SafeParcelable.Field(getter = "getFamilyName", id = 4)
    @Nullable
    private final String zzbi;
    @SafeParcelable.Field(getter = "getProfilePictureUri", id = 5)
    @Nullable
    private final Uri zzbj;
    @SafeParcelable.Field(getter = "getPassword", id = 6)
    @Nullable
    private final String zzbk;
    @SafeParcelable.Field(getter = "getGoogleIdToken", id = 7)
    @Nullable
    private final String zzbl;

    @SafeParcelable.Constructor
    public SignInCredential(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) @Nullable String str2, @SafeParcelable.Param(id = 3) @Nullable String str3, @SafeParcelable.Param(id = 4) @Nullable String str4, @SafeParcelable.Param(id = 5) @Nullable Uri uri, @SafeParcelable.Param(id = 6) @Nullable String str5, @SafeParcelable.Param(id = 7) @Nullable String str6) {
        this.zzbf = Preconditions.checkNotEmpty(str);
        this.zzbg = str2;
        this.zzbh = str3;
        this.zzbi = str4;
        this.zzbj = uri;
        this.zzbk = str5;
        this.zzbl = str6;
    }

    public final String getId() {
        return this.zzbf;
    }

    @Nullable
    public final String getDisplayName() {
        return this.zzbg;
    }

    @Nullable
    public final String getGivenName() {
        return this.zzbh;
    }

    @Nullable
    public final String getFamilyName() {
        return this.zzbi;
    }

    @Nullable
    public final Uri getProfilePictureUri() {
        return this.zzbj;
    }

    @Nullable
    public final String getPassword() {
        return this.zzbk;
    }

    @Nullable
    public final String getGoogleIdToken() {
        return this.zzbl;
    }

    public final int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.zzbf;
        Object[] objArr2 = objArr;
        objArr2[1] = this.zzbg;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.zzbh;
        Object[] objArr4 = objArr3;
        objArr4[3] = this.zzbi;
        Object[] objArr5 = objArr4;
        objArr5[4] = this.zzbj;
        Object[] objArr6 = objArr5;
        objArr6[5] = this.zzbk;
        Object[] objArr7 = objArr6;
        objArr7[6] = this.zzbl;
        return Objects.hashCode(objArr7);
    }

    public final boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj2;
        if (!Objects.equal(this.zzbf, signInCredential.zzbf) || !Objects.equal(this.zzbg, signInCredential.zzbg) || !Objects.equal(this.zzbh, signInCredential.zzbh) || !Objects.equal(this.zzbi, signInCredential.zzbi) || !Objects.equal(this.zzbj, signInCredential.zzbj) || !Objects.equal(this.zzbk, signInCredential.zzbk) || !Objects.equal(this.zzbl, signInCredential.zzbl)) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, getId(), false);
        SafeParcelWriter.writeString(parcel2, 2, getDisplayName(), false);
        SafeParcelWriter.writeString(parcel2, 3, getGivenName(), false);
        SafeParcelWriter.writeString(parcel2, 4, getFamilyName(), false);
        SafeParcelWriter.writeParcelable(parcel2, 5, getProfilePictureUri(), i, false);
        SafeParcelWriter.writeString(parcel2, 6, getPassword(), false);
        SafeParcelWriter.writeString(parcel2, 7, getGoogleIdToken(), false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<SignInCredential> creator;
        new zzm();
        CREATOR = creator;
    }
}
