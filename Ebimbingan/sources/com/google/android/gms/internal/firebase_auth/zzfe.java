package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzfd;

@C0463SafeParcelable.Class(creator = "SendVerificationCodeRequestCreator")
public final class zzfe extends C0460AbstractSafeParcelable implements zzfd<zzp.zzk> {
    public static final Parcelable.Creator<zzfe> CREATOR;
    @C0463SafeParcelable.Field(getter = "getTenantId", id = 5)
    @Nullable
    private final String zzhy;
    @C0463SafeParcelable.Field(getter = "getPhoneNumber", id = 1)
    private final String zzjo;
    @C0463SafeParcelable.Field(getter = "getTimeoutInSeconds", id = 2)
    private final long zzko;
    @C0463SafeParcelable.Field(getter = "getForceNewSmsVerificationSession", id = 3)
    private final boolean zzsf;
    @C0463SafeParcelable.Field(getter = "getLanguageHeader", id = 4)
    private final String zzsg;

    @C0463SafeParcelable.Constructor
    public zzfe(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) long j, @C0463SafeParcelable.Param(id = 3) boolean z, @C0463SafeParcelable.Param(id = 4) String str2, @C0463SafeParcelable.Param(id = 5) @Nullable String str3) {
        this.zzjo = C0446Preconditions.checkNotEmpty(str);
        this.zzko = j;
        this.zzsf = z;
        this.zzsg = str2;
        this.zzhy = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzjo, false);
        C0462SafeParcelWriter.writeLong(parcel2, 2, this.zzko);
        C0462SafeParcelWriter.writeBoolean(parcel2, 3, this.zzsf);
        C0462SafeParcelWriter.writeString(parcel2, 4, this.zzsg, false);
        C0462SafeParcelWriter.writeString(parcel2, 5, this.zzhy, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final /* synthetic */ zzjc zzeq() {
        zzp.zzk.zza zzak = zzp.zzk.zzah().zzak(this.zzjo);
        if (this.zzhy != null) {
            zzp.zzk.zza zzal = zzak.zzal(this.zzhy);
        }
        return (zzp.zzk) ((zzhs) zzak.zzih());
    }

    static {
        Parcelable.Creator<zzfe> creator;
        new zzfh();
        CREATOR = creator;
    }
}
