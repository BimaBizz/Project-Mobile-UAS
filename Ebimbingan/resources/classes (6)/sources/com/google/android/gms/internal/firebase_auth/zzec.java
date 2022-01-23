package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzdv;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "CreateAuthUriResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzec extends AbstractSafeParcelable implements zzdv<zzec, zzp.zzb> {
    public static final Parcelable.Creator<zzec> CREATOR;
    @SafeParcelable.Field(getter = "getProviderId", id = 4)
    private String zzia;
    @SafeParcelable.Field(getter = "getAuthUri", id = 2)
    private String zzqy;
    @SafeParcelable.Field(getter = "isRegistered", id = 3)
    private boolean zzqz;
    @SafeParcelable.Field(getter = "isForExistingProvider", id = 5)
    private boolean zzra;
    @SafeParcelable.Field(getter = "getStringList", id = 6)
    private zzfk zzrb;
    @SafeParcelable.Field(getter = "getSignInMethods", id = 7)
    private List<String> zzrc;

    public zzec() {
        this.zzrb = zzfk.zzfa();
    }

    @SafeParcelable.Constructor
    public zzec(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) zzfk zzfk, @SafeParcelable.Param(id = 7) List<String> list) {
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

    /* JADX WARNING: type inference failed for: r8v9, types: [android.os.Parcelable, com.google.android.gms.internal.firebase_auth.zzfk] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 2, this.zzqy, false);
        SafeParcelWriter.writeBoolean(parcel2, 3, this.zzqz);
        SafeParcelWriter.writeString(parcel2, 4, this.zzia, false);
        SafeParcelWriter.writeBoolean(parcel2, 5, this.zzra);
        SafeParcelWriter.writeParcelable(parcel2, 6, this.zzrb, i, false);
        SafeParcelWriter.writeStringList(parcel2, 7, this.zzrc, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
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
        this.zzqy = Strings.emptyToNull(zzb.zzf());
        this.zzqz = zzb.zzi();
        this.zzia = Strings.emptyToNull(zzb.getProviderId());
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
