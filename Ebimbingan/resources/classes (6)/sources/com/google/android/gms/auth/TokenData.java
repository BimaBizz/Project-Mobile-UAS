package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@ShowFirstParty
@SafeParcelable.Class(creator = "TokenDataCreator")
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getToken", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", id = 3)
    private final Long zzc;
    @SafeParcelable.Field(getter = "isCached", id = 4)
    private final boolean zzd;
    @SafeParcelable.Field(getter = "isSnowballed", id = 5)
    private final boolean zze;
    @SafeParcelable.Field(getter = "getGrantedScopes", id = 6)
    private final List<String> zzf;
    @SafeParcelable.Field(getter = "getScopeData", id = 7)
    private final String zzg;

    @Nullable
    public static TokenData zza(Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle3 = bundle2.getBundle(str);
        Bundle bundle4 = bundle3;
        if (bundle3 == null) {
            return null;
        }
        bundle4.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle4.getParcelable("TokenData");
    }

    @SafeParcelable.Constructor
    TokenData(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) Long l, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) List<String> list, @SafeParcelable.Param(id = 7) String str2) {
        this.zza = i;
        this.zzb = Preconditions.checkNotEmpty(str);
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
        if (!(obj2 instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj2;
        if (!TextUtils.equals(this.zzb, tokenData.zzb) || !Objects.equal(this.zzc, tokenData.zzc) || this.zzd != tokenData.zzd || this.zze != tokenData.zze || !Objects.equal(this.zzf, tokenData.zzf) || !Objects.equal(this.zzg, tokenData.zzg)) {
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
        return Objects.hashCode(objArr6);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        SafeParcelWriter.writeString(parcel2, 2, this.zzb, false);
        SafeParcelWriter.writeLongObject(parcel2, 3, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel2, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel2, 5, this.zze);
        SafeParcelWriter.writeStringList(parcel2, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel2, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<TokenData> creator;
        new zzm();
        CREATOR = creator;
    }
}
