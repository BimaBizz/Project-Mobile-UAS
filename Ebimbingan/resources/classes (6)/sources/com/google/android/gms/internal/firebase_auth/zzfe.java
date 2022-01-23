package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzfd;

@SafeParcelable.Class(creator = "SendVerificationCodeRequestCreator")
public final class zzfe extends AbstractSafeParcelable implements zzfd<zzp.zzk> {
    public static final Parcelable.Creator<zzfe> CREATOR;
    @SafeParcelable.Field(getter = "getTenantId", id = 5)
    @Nullable
    private final String zzhy;
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 1)
    private final String zzjo;
    @SafeParcelable.Field(getter = "getTimeoutInSeconds", id = 2)
    private final long zzko;
    @SafeParcelable.Field(getter = "getForceNewSmsVerificationSession", id = 3)
    private final boolean zzsf;
    @SafeParcelable.Field(getter = "getLanguageHeader", id = 4)
    private final String zzsg;

    @SafeParcelable.Constructor
    public zzfe(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) @Nullable String str3) {
        this.zzjo = Preconditions.checkNotEmpty(str);
        this.zzko = j;
        this.zzsf = z;
        this.zzsg = str2;
        this.zzhy = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzjo, false);
        SafeParcelWriter.writeLong(parcel2, 2, this.zzko);
        SafeParcelWriter.writeBoolean(parcel2, 3, this.zzsf);
        SafeParcelWriter.writeString(parcel2, 4, this.zzsg, false);
        SafeParcelWriter.writeString(parcel2, 5, this.zzhy, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
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
