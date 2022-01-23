package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.util.List;

@C0463SafeParcelable.Class(creator = "AccountChangeEventsResponseCreator")
/* renamed from: com.google.android.gms.auth.AccountChangeEventsResponse */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0013AccountChangeEventsResponse extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0013AccountChangeEventsResponse> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    private final int zza;
    @C0463SafeParcelable.Field(id = 2)
    private final List<C0011AccountChangeEvent> zzb;

    @C0463SafeParcelable.Constructor
    C0013AccountChangeEventsResponse(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) List<C0011AccountChangeEvent> list) {
        this.zza = i;
        this.zzb = (List) C0446Preconditions.checkNotNull(list);
    }

    public C0013AccountChangeEventsResponse(List<C0011AccountChangeEvent> list) {
        this.zza = 1;
        this.zzb = (List) C0446Preconditions.checkNotNull(list);
    }

    public List<C0011AccountChangeEvent> getEvents() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        C0462SafeParcelWriter.writeTypedList(parcel2, 2, this.zzb, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<C0013AccountChangeEventsResponse> creator;
        new C0172zzd();
        CREATOR = creator;
    }
}
