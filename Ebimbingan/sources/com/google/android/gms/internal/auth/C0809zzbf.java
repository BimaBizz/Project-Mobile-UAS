package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "UserChallengeRequestCreator")
/* renamed from: com.google.android.gms.internal.auth.zzbf */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0809zzbf extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0809zzbf> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    private final int zza;
    @C0463SafeParcelable.Field(id = 2)
    private final String zzb;
    @C0463SafeParcelable.Field(id = 3)
    private final PendingIntent zzc;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0809zzbf(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }

    @C0463SafeParcelable.Constructor
    C0809zzbf(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) PendingIntent pendingIntent) {
        int i2 = i;
        this.zza = 1;
        this.zzb = (String) C0446Preconditions.checkNotNull(str);
        this.zzc = (PendingIntent) C0446Preconditions.checkNotNull(pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzb, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 3, this.zzc, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<C0809zzbf> creator;
        new C0808zzbe();
        CREATOR = creator;
    }
}
