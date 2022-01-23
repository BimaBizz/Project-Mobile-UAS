package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.location.zzr;
import com.google.android.gms.location.zzs;

@C0463SafeParcelable.Class(creator = "DeviceOrientationRequestUpdateDataCreator")
public final class zzo extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestUpdateData.OPERATION_ADD", id = 1)
    private int zzcg;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "null", id = 2)
    private zzm zzch;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getDeviceOrientationListenerBinder", id = 3, type = "android.os.IBinder")
    private zzr zzci;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackBinder", id = 4, type = "android.os.IBinder")
    private zzaj zzcj;

    static {
        Parcelable.Creator<zzo> creator;
        new zzp();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    zzo(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) zzm zzm, @C0463SafeParcelable.Param(id = 3) IBinder iBinder, @C0463SafeParcelable.Param(id = 4) IBinder iBinder2) {
        zzaj zzaj;
        zzaj zzaj2;
        IBinder iBinder3 = iBinder;
        IBinder iBinder4 = iBinder2;
        this.zzcg = i;
        this.zzch = zzm;
        this.zzci = iBinder3 == null ? null : zzs.zza(iBinder3);
        if (iBinder4 == null) {
            zzaj2 = null;
        } else {
            IBinder iBinder5 = iBinder4;
            IBinder iBinder6 = iBinder5;
            if (iBinder5 == null) {
                zzaj2 = null;
            } else {
                IInterface queryLocalInterface = iBinder6.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                IInterface iInterface = queryLocalInterface;
                if (queryLocalInterface instanceof zzaj) {
                    zzaj2 = (zzaj) iInterface;
                } else {
                    zzaj2 = zzaj;
                    new zzal(iBinder6);
                }
            }
        }
        this.zzcj = zzaj2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zzcg);
        C0462SafeParcelWriter.writeParcelable(parcel2, 2, this.zzch, i, false);
        C0462SafeParcelWriter.writeIBinder(parcel2, 3, this.zzci == null ? null : this.zzci.asBinder(), false);
        C0462SafeParcelWriter.writeIBinder(parcel2, 4, this.zzcj == null ? null : this.zzcj.asBinder(), false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
