package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.util.List;

@C0452ShowFirstParty
@C0463SafeParcelable.Class(creator = "TokenDataCreator")
/* renamed from: com.google.android.gms.auth.TokenData */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0018TokenData extends C0460AbstractSafeParcelable implements C0447ReflectedParcelable {
    public static final Parcelable.Creator<C0018TokenData> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    private final int zza;
    @C0463SafeParcelable.Field(getter = "getToken", id = 2)
    private final String zzb;
    @C0463SafeParcelable.Field(getter = "getExpirationTimeSecs", id = 3)
    private final Long zzc;
    @C0463SafeParcelable.Field(getter = "isCached", id = 4)
    private final boolean zzd;
    @C0463SafeParcelable.Field(getter = "isSnowballed", id = 5)
    private final boolean zze;
    @C0463SafeParcelable.Field(getter = "getGrantedScopes", id = 6)
    private final List<String> zzf;
    @C0463SafeParcelable.Field(getter = "getScopeData", id = 7)
    private final String zzg;

    @Nullable
    public static C0018TokenData zza(Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        bundle2.setClassLoader(C0018TokenData.class.getClassLoader());
        Bundle bundle3 = bundle2.getBundle(str);
        Bundle bundle4 = bundle3;
        if (bundle3 == null) {
            return null;
        }
        bundle4.setClassLoader(C0018TokenData.class.getClassLoader());
        return (C0018TokenData) bundle4.getParcelable("TokenData");
    }

    @C0463SafeParcelable.Constructor
    C0018TokenData(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) Long l, @C0463SafeParcelable.Param(id = 4) boolean z, @C0463SafeParcelable.Param(id = 5) boolean z2, @C0463SafeParcelable.Param(id = 6) List<String> list, @C0463SafeParcelable.Param(id = 7) String str2) {
        this.zza = i;
        this.zzb = C0446Preconditions.checkNotEmpty(str);
        this.zzc = l;
        this.zzd = z;
        this.zze = z2;
        this.zzf = list;
        this.zzg = str2;
    }

    public final String zza() {
        return this.zzb;
    }

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof C0018TokenData)) {
            return false;
        }
        C0018TokenData tokenData = (C0018TokenData) obj2;
        if (!TextUtils.equals(this.zzb, tokenData.zzb) || !C0444Objects.equal(this.zzc, tokenData.zzc) || this.zzd != tokenData.zzd || this.zze != tokenData.zze || !C0444Objects.equal(this.zzf, tokenData.zzf) || !C0444Objects.equal(this.zzg, tokenData.zzg)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.zzb;
        Object[] objArr2 = objArr;
        objArr2[1] = this.zzc;
        Object[] objArr3 = objArr2;
        objArr3[2] = Boolean.valueOf(this.zzd);
        Object[] objArr4 = objArr3;
        objArr4[3] = Boolean.valueOf(this.zze);
        Object[] objArr5 = objArr4;
        objArr5[4] = this.zzf;
        Object[] objArr6 = objArr5;
        objArr6[5] = this.zzg;
        return C0444Objects.hashCode(objArr6);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzb, false);
        C0462SafeParcelWriter.writeLongObject(parcel2, 3, this.zzc, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 4, this.zzd);
        C0462SafeParcelWriter.writeBoolean(parcel2, 5, this.zze);
        C0462SafeParcelWriter.writeStringList(parcel2, 6, this.zzf, false);
        C0462SafeParcelWriter.writeString(parcel2, 7, this.zzg, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<C0018TokenData> creator;
        new C0181zzm();
        CREATOR = creator;
    }
}
