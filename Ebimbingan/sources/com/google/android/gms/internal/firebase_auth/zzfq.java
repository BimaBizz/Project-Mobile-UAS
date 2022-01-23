package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.util.C0615Strings;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzdv;

@C0463SafeParcelable.Class(creator = "VerifyCustomTokenResponseCreator")
@C0463SafeParcelable.Reserved({1})
public final class zzfq extends C0460AbstractSafeParcelable implements zzdv<zzfq, zzp.zzs> {
    public static final Parcelable.Creator<zzfq> CREATOR;
    @C0463SafeParcelable.Field(getter = "getIdToken", id = 2)
    private String zzib;
    @C0463SafeParcelable.Field(getter = "getRefreshToken", id = 3)
    private String zzkh;
    @C0463SafeParcelable.Field(getter = "isNewUser", id = 5)
    private boolean zzrg;
    @C0463SafeParcelable.Field(getter = "getExpiresIn", id = 4)
    private long zzrh;

    public zzfq() {
    }

    @C0463SafeParcelable.Constructor
    zzfq(@C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) String str2, @C0463SafeParcelable.Param(id = 4) long j, @C0463SafeParcelable.Param(id = 5) boolean z) {
        this.zzib = str;
        this.zzkh = str2;
        this.zzrh = j;
        this.zzrg = z;
    }

    public final String getIdToken() {
        return this.zzib;
    }

    @NonNull
    public final String zzs() {
        return this.zzkh;
    }

    public final long zzt() {
        return this.zzrh;
    }

    public final boolean isNewUser() {
        return this.zzrg;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzib, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzkh, false);
        C0462SafeParcelWriter.writeLong(parcel2, 4, this.zzrh);
        C0462SafeParcelWriter.writeBoolean(parcel2, 5, this.zzrg);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final zzjm<zzp.zzs> zzee() {
        return zzp.zzs.zzm();
    }

    public final /* synthetic */ zzdv zza(zzjc zzjc) {
        Throwable th;
        zzjc zzjc2 = zzjc;
        if (!(zzjc2 instanceof zzp.zzs)) {
            Throwable th2 = th;
            new IllegalArgumentException("The passed proto must be an instance of VerifyCustomTokenResponse.");
            throw th2;
        }
        zzp.zzs zzs = (zzp.zzs) zzjc2;
        this.zzib = C0615Strings.emptyToNull(zzs.getIdToken());
        this.zzkh = C0615Strings.emptyToNull(zzs.zzs());
        this.zzrh = zzs.zzt();
        this.zzrg = zzs.zzu();
        return this;
    }

    static {
        Parcelable.Creator<zzfq> creator;
        new zzft();
        CREATOR = creator;
    }
}
