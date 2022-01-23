package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "FeatureCreator")
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class Feature extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Feature> CREATOR;
    @SafeParcelable.Field(getter = "getName", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getOldVersion", id = 2)
    @Deprecated
    private final int zzb;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getVersion", id = 3)
    private final long zzc;

    static {
        Parcelable.Creator<Feature> creator;
        new zzc();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    public Feature(@RecentlyNonNull @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) long j) {
        this.zza = str;
        this.zzb = i;
        this.zzc = j;
    }

    @KeepForSdk
    public Feature(@RecentlyNonNull String str, long j) {
        this.zza = str;
        this.zzc = j;
        this.zzb = -1;
    }

    public final boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj2;
        return ((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && getVersion() == feature.getVersion();
    }

    @RecentlyNonNull
    @KeepForSdk
    public String getName() {
        return this.zza;
    }

    @KeepForSdk
    public long getVersion() {
        long j = this.zzc;
        return j == -1 ? (long) this.zzb : j;
    }

    public final int hashCode() {
        return Objects.hashCode(getName(), Long.valueOf(getVersion()));
    }

    @RecentlyNonNull
    public final String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        Objects.ToStringHelper add = stringHelper.add("name", getName());
        Objects.ToStringHelper add2 = stringHelper.add("version", Long.valueOf(getVersion()));
        return stringHelper.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel2, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel2, 3, getVersion());
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
