package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.util.Collections;
import java.util.List;

@C0463SafeParcelable.Class(creator = "RemoveGeofencingRequestCreator")
@C0463SafeParcelable.Reserved({1000})
public final class zzal extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR;
    @C0463SafeParcelable.Field(defaultValue = "", getter = "getTag", id = 3)
    private final String tag;
    @C0463SafeParcelable.Field(getter = "getGeofenceIds", id = 1)
    private final List<String> zzbu;
    @C0463SafeParcelable.Field(getter = "getPendingIntent", id = 2)
    private final PendingIntent zzbv;

    static {
        Parcelable.Creator<zzal> creator;
        new zzam();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    zzal(@C0463SafeParcelable.Param(id = 1) @Nullable List<String> list, @C0463SafeParcelable.Param(id = 2) @Nullable PendingIntent pendingIntent, @C0463SafeParcelable.Param(id = 3) String str) {
        List<String> list2 = list;
        PendingIntent pendingIntent2 = pendingIntent;
        String str2 = str;
        this.zzbu = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.zzbv = pendingIntent2;
        this.tag = str2;
    }

    public static zzal zza(PendingIntent pendingIntent) {
        zzal zzal;
        PendingIntent pendingIntent2 = pendingIntent;
        Object checkNotNull = C0446Preconditions.checkNotNull(pendingIntent2, "PendingIntent can not be null.");
        new zzal((List<String>) null, pendingIntent2, "");
        return zzal;
    }

    public static zzal zza(List<String> list) {
        zzal zzal;
        List<String> list2 = list;
        Object checkNotNull = C0446Preconditions.checkNotNull(list2, "geofence can't be null.");
        C0446Preconditions.checkArgument(!list2.isEmpty(), "Geofences must contains at least one id.");
        new zzal(list2, (PendingIntent) null, "");
        return zzal;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeStringList(parcel2, 1, this.zzbu, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 2, this.zzbv, i, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.tag, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
