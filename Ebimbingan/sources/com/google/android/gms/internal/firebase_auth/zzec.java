package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.util.C0615Strings;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzdv;
import java.util.ArrayList;
import java.util.List;

@C0463SafeParcelable.Class(creator = "CreateAuthUriResponseCreator")
@C0463SafeParcelable.Reserved({1})
public final class zzec extends C0460AbstractSafeParcelable implements zzdv<zzec, zzp.zzb> {
    public static final Parcelable.Creator<zzec> CREATOR;
    @C0463SafeParcelable.Field(getter = "getProviderId", id = 4)
    private String zzia;
    @C0463SafeParcelable.Field(getter = "getAuthUri", id = 2)
    private String zzqy;
    @C0463SafeParcelable.Field(getter = "isRegistered", id = 3)
    private boolean zzqz;
    @C0463SafeParcelable.Field(getter = "isForExistingProvider", id = 5)
    private boolean zzra;
    @C0463SafeParcelable.Field(getter = "getStringList", id = 6)
    private zzfk zzrb;
    @C0463SafeParcelable.Field(getter = "getSignInMethods", id = 7)
    private List<String> zzrc;

    public zzec() {
        this.zzrb = zzfk.zzfa();
    }

    @C0463SafeParcelable.Constructor
    public zzec(@C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) boolean z, @C0463SafeParcelable.Param(id = 4) String str2, @C0463SafeParcelable.Param(id = 5) boolean z2, @C0463SafeParcelable.Param(id = 6) zzfk zzfk, @C0463SafeParcelable.Param(id = 7) List<String> list) {
        zzfk zzfk2 = zzfk;
        List<String> list2 = list;
        this.zzqy = str;
        this.zzqz = z;
        this.zzia = str2;
        this.zzra = z2;
        this.zzrb = zzfk2 == null ? zzfk.zzfa() : zzfk.zza(zzfk2);
        this.zzrc = list2;
    }

    @Nullable
    public final List<String> getSignInMethods() {
        return this.zzrc;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzqy, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 3, this.zzqz);
        C0462SafeParcelWriter.writeString(parcel2, 4, this.zzia, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 5, this.zzra);
        C0462SafeParcelWriter.writeParcelable(parcel2, 6, this.zzrb, i, false);
        C0462SafeParcelWriter.writeStringList(parcel2, 7, this.zzrc, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final zzjm<zzp.zzb> zzee() {
        return zzp.zzb.zzm();
    }

    public final /* synthetic */ zzdv zza(zzjc zzjc) {
        zzfk zzfk;
        zzfk zzfk2;
        List list;
        List<String> zzk;
        List<String> list2;
        Throwable th;
        zzjc zzjc2 = zzjc;
        if (!(zzjc2 instanceof zzp.zzb)) {
            Throwable th2 = th;
            new IllegalArgumentException("The passed proto must be an instance of CreateAuthUriResponse.");
            throw th2;
        }
        zzp.zzb zzb = (zzp.zzb) zzjc2;
        this.zzqy = C0615Strings.emptyToNull(zzb.zzf());
        this.zzqz = zzb.zzi();
        this.zzia = C0615Strings.emptyToNull(zzb.getProviderId());
        this.zzra = zzb.zzj();
        if (zzb.zzh() == 0) {
            zzfk2 = zzfk.zzfa();
        } else {
            zzfk2 = zzfk;
            new ArrayList(zzb.zzg());
            new zzfk(1, list);
        }
        this.zzrb = zzfk2;
        if (zzb.zzl() == 0) {
            zzk = list2;
            new ArrayList(0);
        } else {
            zzk = zzb.zzk();
        }
        this.zzrc = zzk;
        return this;
    }

    static {
        Parcelable.Creator<zzec> creator;
        new zzef();
        CREATOR = creator;
    }
}
