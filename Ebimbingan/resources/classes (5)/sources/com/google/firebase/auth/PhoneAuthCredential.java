package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PhoneAuthCredentialCreator")
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR;
    @SafeParcelable.Field(getter = "getSessionInfo", id = 1)
    private String zzjl;
    @SafeParcelable.Field(getter = "getSmsCode", id = 2)
    private String zzjm;
    @SafeParcelable.Field(getter = "getHasVerificationProof", id = 3)
    private boolean zzjn;
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 4)
    private String zzjo;
    @SafeParcelable.Field(getter = "getAutoCreate", id = 5)
    private boolean zzjp;
    @SafeParcelable.Field(getter = "getTemporaryProof", id = 6)
    private String zzjq;

    @SafeParcelable.Constructor
    PhoneAuthCredential(@SafeParcelable.Param(id = 1) @Nullable String str, @SafeParcelable.Param(id = 2) @Nullable String str2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) @Nullable String str3, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) @Nullable String str4) {
        String str5 = str;
        String str6 = str2;
        boolean z3 = z;
        String str7 = str3;
        boolean z4 = z2;
        String str8 = str4;
        Preconditions.checkArgument((z3 && !TextUtils.isEmpty(str7)) || (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) || (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)), "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, ortemprary proof.");
        this.zzjl = str5;
        this.zzjm = str6;
        this.zzjn = z3;
        this.zzjo = str7;
        this.zzjp = z4;
        this.zzjq = str8;
    }

    @Nullable
    public String getSmsCode() {
        return this.zzjm;
    }

    @NonNull
    public String getProvider() {
        return "phone";
    }

    public String getSignInMethod() {
        return "phone";
    }

    public final PhoneAuthCredential zzn(boolean z) {
        boolean z2 = z;
        this.zzjp = false;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzjl, false);
        SafeParcelWriter.writeString(parcel2, 2, getSmsCode(), false);
        SafeParcelWriter.writeBoolean(parcel2, 3, this.zzjn);
        SafeParcelWriter.writeString(parcel2, 4, this.zzjo, false);
        SafeParcelWriter.writeBoolean(parcel2, 5, this.zzjp);
        SafeParcelWriter.writeString(parcel2, 6, this.zzjq, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        Object obj;
        new PhoneAuthCredential(this.zzjl, getSmsCode(), this.zzjn, this.zzjo, this.zzjp, this.zzjq);
        return obj;
    }

    static {
        Parcelable.Creator<PhoneAuthCredential> creator;
        new zzaa();
        CREATOR = creator;
    }
}
