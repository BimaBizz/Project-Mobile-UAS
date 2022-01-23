package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "NotifyCompletionRequestCreator")
/* renamed from: com.google.android.gms.internal.auth.zzaz */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0802zzaz extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0802zzaz> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    private final int zza;
    @C0463SafeParcelable.Field(id = 2)
    private final String zzb;
    @C0463SafeParcelable.Field(id = 3)
    private final int zzc;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0802zzaz(String str, int i) {
        this(1, str, i);
    }

    @C0463SafeParcelable.Constructor
    C0802zzaz(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) int i2) {
        int i3 = i;
        this.zza = 1;
        this.zzb = (String) C0446Preconditions.checkNotNull(str);
        this.zzc = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzb, false);
        C0462SafeParcelWriter.writeInt(parcel2, 3, this.zzc);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<C0802zzaz> creator;
        new C0801zzay();
        CREATOR = creator;
    }
}
