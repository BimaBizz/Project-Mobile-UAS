package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "PhoneAuthCredentialCreator")
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR;
    @C0463SafeParcelable.Field(getter = "getSessionInfo", id = 1)
    private String zzjl;
    @C0463SafeParcelable.Field(getter = "getSmsCode", id = 2)
    private String zzjm;
    @C0463SafeParcelable.Field(getter = "getHasVerificationProof", id = 3)
    private boolean zzjn;
    @C0463SafeParcelable.Field(getter = "getPhoneNumber", id = 4)
    private String zzjo;
    @C0463SafeParcelable.Field(getter = "getAutoCreate", id = 5)
    private boolean zzjp;
    @C0463SafeParcelable.Field(getter = "getTemporaryProof", id = 6)
    private String zzjq;

    @C0463SafeParcelable.Constructor
    PhoneAuthCredential(@C0463SafeParcelable.Param(id = 1) @Nullable String str, @C0463SafeParcelable.Param(id = 2) @Nullable String str2, @C0463SafeParcelable.Param(id = 3) boolean z, @C0463SafeParcelable.Param(id = 4) @Nullable String str3, @C0463SafeParcelable.Param(id = 5) boolean z2, @C0463SafeParcelable.Param(id = 6) @Nullable String str4) {
        String str5 = str;
        String str6 = str2;
        boolean z3 = z;
        String str7 = str3;
        boolean z4 = z2;
        String str8 = str4;
        C0446Preconditions.checkArgument((z3 && !TextUtils.isEmpty(str7)) || (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) || (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)), "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, ortemprary proof.");
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
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzjl, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, getSmsCode(), false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 3, this.zzjn);
        C0462SafeParcelWriter.writeString(parcel2, 4, this.zzjo, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 5, this.zzjp);
        C0462SafeParcelWriter.writeString(parcel2, 6, this.zzjq, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
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
