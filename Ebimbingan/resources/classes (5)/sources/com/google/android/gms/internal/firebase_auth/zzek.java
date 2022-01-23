package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzdv;
import java.util.List;

@SafeParcelable.Class(creator = "GetAccountInfoResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzek extends AbstractSafeParcelable implements zzdv<zzek, zzp.zzg> {
    public static final Parcelable.Creator<zzek> CREATOR;
    @SafeParcelable.Field(getter = "getUserList", id = 2)
    private zzeo zzro;

    public zzek() {
    }

    @SafeParcelable.Constructor
    zzek(@SafeParcelable.Param(id = 2) zzeo zzeo) {
        zzeo zza;
        zzeo zzeo2;
        zzeo zzeo3 = zzeo;
        if (zzeo3 == null) {
            zza = zzeo2;
            new zzeo();
        } else {
            zza = zzeo.zza(zzeo3);
        }
        this.zzro = zza;
    }

    public final List<zzem> zzer() {
        return this.zzro.zzer();
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [com.google.android.gms.internal.firebase_auth.zzeo, android.os.Parcelable] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 2, this.zzro, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final zzjm<zzp.zzg> zzee() {
        return zzp.zzg.zzm();
    }

    public final /* synthetic */ zzdv zza(zzjc zzjc) {
        zzeo zzeo;
        Throwable th;
        zzjc zzjc2 = zzjc;
        if (!(zzjc2 instanceof zzp.zzg)) {
            Throwable th2 = th;
            new IllegalArgumentException("The passed proto must be an instance of GetAccountInfoResponse.");
            throw th2;
        }
        zzp.zzg zzg = (zzp.zzg) zzjc2;
        zzp.zzg zzg2 = zzg;
        if (zzg.zzy() == 0) {
            new zzeo();
            this.zzro = zzeo;
        } else {
            this.zzro = zzeo.zza(zzg2);
        }
        return this;
    }

    static {
        Parcelable.Creator<zzek> creator;
        new zzen();
        CREATOR = creator;
    }
}
