package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import org.shaded.apache.http.cookie.ClientCookie;

@C0206KeepForSdk
@C0463SafeParcelable.Class(creator = "FeatureCreator")
/* renamed from: com.google.android.gms.common.Feature */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0186Feature extends C0460AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0186Feature> CREATOR;
    @C0463SafeParcelable.Field(getter = "getName", id = 1)
    private final String zza;
    @C0463SafeParcelable.Field(getter = "getOldVersion", id = 2)
    @Deprecated
    private final int zzb;
    @C0463SafeParcelable.Field(defaultValue = "-1", getter = "getVersion", id = 3)
    private final long zzc;

    static {
        Parcelable.Creator<C0186Feature> creator;
        new C0634zzc();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    public C0186Feature(@RecentlyNonNull @C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) int i, @C0463SafeParcelable.Param(id = 3) long j) {
        this.zza = str;
        this.zzb = i;
        this.zzc = j;
    }

    @C0206KeepForSdk
    public C0186Feature(@RecentlyNonNull String str, long j) {
        this.zza = str;
        this.zzc = j;
        this.zzb = -1;
    }

    public final boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof C0186Feature)) {
            return false;
        }
        C0186Feature feature = (C0186Feature) obj2;
        return ((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && getVersion() == feature.getVersion();
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public String getName() {
        return this.zza;
    }

    @C0206KeepForSdk
    public long getVersion() {
        long j = this.zzc;
        return j == -1 ? (long) this.zzb : j;
    }

    public final int hashCode() {
        return C0444Objects.hashCode(getName(), Long.valueOf(getVersion()));
    }

    @RecentlyNonNull
    public final String toString() {
        C0444Objects.ToStringHelper stringHelper = C0444Objects.toStringHelper(this);
        C0444Objects.ToStringHelper add = stringHelper.add(CommonProperties.NAME, getName());
        C0444Objects.ToStringHelper add2 = stringHelper.add(ClientCookie.VERSION_ATTR, Long.valueOf(getVersion()));
        return stringHelper.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, getName(), false);
        C0462SafeParcelWriter.writeInt(parcel2, 2, this.zzb);
        C0462SafeParcelWriter.writeLong(parcel2, 3, getVersion());
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
