package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.util.C0615Strings;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzdv;

@C0463SafeParcelable.Class(creator = "ResetPasswordResponseCreator")
@C0463SafeParcelable.Reserved({1})
public final class zzfd extends C0460AbstractSafeParcelable implements zzdv<zzfd, zzp.zzj> {
    public static final Parcelable.Creator<zzfd> CREATOR;
    @C0463SafeParcelable.Field(getter = "getEmail", id = 2)
    private String zzif;
    @C0463SafeParcelable.Field(getter = "getNewEmail", id = 3)
    private String zzku;
    @C0463SafeParcelable.Field(getter = "getRequestType", id = 4)
    private String zzru;

    public zzfd() {
    }

    @C0463SafeParcelable.Constructor
    zzfd(@C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) String str2, @C0463SafeParcelable.Param(id = 4) String str3) {
        this.zzif = str;
        this.zzku = str2;
        this.zzru = str3;
    }

    public final String getEmail() {
        return this.zzif;
    }

    public final String zzae() {
        return this.zzku;
    }

    public final String zzey() {
        return this.zzru;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzif, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzku, false);
        C0462SafeParcelWriter.writeString(parcel2, 4, this.zzru, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final zzjm<zzp.zzj> zzee() {
        return zzp.zzj.zzm();
    }

    public final /* synthetic */ zzdv zza(zzjc zzjc) {
        String str;
        Throwable th;
        zzjc zzjc2 = zzjc;
        if (!(zzjc2 instanceof zzp.zzj)) {
            Throwable th2 = th;
            new IllegalArgumentException("The passed proto must be an instance of ResetPasswordResponse.");
            throw th2;
        }
        zzp.zzj zzj = (zzp.zzj) zzjc2;
        this.zzif = C0615Strings.emptyToNull(zzj.getEmail());
        this.zzku = C0615Strings.emptyToNull(zzj.zzae());
        switch (zzfc.zzry[zzj.zzaf().ordinal()]) {
            case 1:
                str = "VERIFY_EMAIL";
                break;
            case 2:
                str = "PASSWORD_RESET";
                break;
            default:
                str = null;
                break;
        }
        this.zzru = str;
        return this;
    }

    static {
        Parcelable.Creator<zzfd> creator;
        new zzff();
        CREATOR = creator;
    }
}
