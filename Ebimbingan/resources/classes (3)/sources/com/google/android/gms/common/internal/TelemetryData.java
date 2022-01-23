package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

@KeepForSdk
@SafeParcelable.Class(creator = "TelemetryDataCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class TelemetryData extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR;
    @SafeParcelable.Field(getter = "getTelemetryConfigVersion", id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getMethodInvocations", id = 2)
    @Nullable
    private List<MethodInvocation> zab;

    static {
        Parcelable.Creator<TelemetryData> creator;
        new zaab();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    public TelemetryData(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) @Nullable List<MethodInvocation> list) {
        this.zaa = i;
        this.zab = list;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        SafeParcelWriter.writeTypedList(parcel2, 2, this.zab, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final int zaa() {
        return this.zaa;
    }

    @RecentlyNullable
    public final List<MethodInvocation> zab() {
        return this.zab;
    }

    public final void zac(@RecentlyNonNull MethodInvocation methodInvocation) {
        List<MethodInvocation> list;
        MethodInvocation methodInvocation2 = methodInvocation;
        if (this.zab == null) {
            new ArrayList();
            this.zab = list;
        }
        boolean add = this.zab.add(methodInvocation2);
    }
}
