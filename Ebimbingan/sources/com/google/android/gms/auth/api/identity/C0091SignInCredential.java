package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "SignInCredentialCreator")
/* renamed from: com.google.android.gms.auth.api.identity.SignInCredential */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0091SignInCredential extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0091SignInCredential> CREATOR;
    @C0463SafeParcelable.Field(getter = "getId", id = 1)
    private final String zzbf;
    @C0463SafeParcelable.Field(getter = "getDisplayName", id = 2)
    @Nullable
    private final String zzbg;
    @C0463SafeParcelable.Field(getter = "getGivenName", id = 3)
    @Nullable
    private final String zzbh;
    @C0463SafeParcelable.Field(getter = "getFamilyName", id = 4)
    @Nullable
    private final String zzbi;
    @C0463SafeParcelable.Field(getter = "getProfilePictureUri", id = 5)
    @Nullable
    private final Uri zzbj;
    @C0463SafeParcelable.Field(getter = "getPassword", id = 6)
    @Nullable
    private final String zzbk;
    @C0463SafeParcelable.Field(getter = "getGoogleIdToken", id = 7)
    @Nullable
    private final String zzbl;

    @C0463SafeParcelable.Constructor
    public C0091SignInCredential(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) @Nullable String str2, @C0463SafeParcelable.Param(id = 3) @Nullable String str3, @C0463SafeParcelable.Param(id = 4) @Nullable String str4, @C0463SafeParcelable.Param(id = 5) @Nullable Uri uri, @C0463SafeParcelable.Param(id = 6) @Nullable String str5, @C0463SafeParcelable.Param(id = 7) @Nullable String str6) {
        this.zzbf = C0446Preconditions.checkNotEmpty(str);
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
        return C0444Objects.hashCode(objArr7);
    }

    public final boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof C0091SignInCredential)) {
            return false;
        }
        C0091SignInCredential signInCredential = (C0091SignInCredential) obj2;
        if (!C0444Objects.equal(this.zzbf, signInCredential.zzbf) || !C0444Objects.equal(this.zzbg, signInCredential.zzbg) || !C0444Objects.equal(this.zzbh, signInCredential.zzbh) || !C0444Objects.equal(this.zzbi, signInCredential.zzbi) || !C0444Objects.equal(this.zzbj, signInCredential.zzbj) || !C0444Objects.equal(this.zzbk, signInCredential.zzbk) || !C0444Objects.equal(this.zzbl, signInCredential.zzbl)) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, getId(), false);
        C0462SafeParcelWriter.writeString(parcel2, 2, getDisplayName(), false);
        C0462SafeParcelWriter.writeString(parcel2, 3, getGivenName(), false);
        C0462SafeParcelWriter.writeString(parcel2, 4, getFamilyName(), false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 5, getProfilePictureUri(), i, false);
        C0462SafeParcelWriter.writeString(parcel2, 6, getPassword(), false);
        C0462SafeParcelWriter.writeString(parcel2, 7, getGoogleIdToken(), false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<C0091SignInCredential> creator;
        new C0103zzm();
        CREATOR = creator;
    }
}
