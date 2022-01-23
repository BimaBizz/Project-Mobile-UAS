package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

@C0206KeepForSdk
@C0463SafeParcelable.Class(creator = "TelemetryDataCreator")
/* renamed from: com.google.android.gms.common.internal.TelemetryData */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0454TelemetryData extends C0460AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0454TelemetryData> CREATOR;
    @C0463SafeParcelable.Field(getter = "getTelemetryConfigVersion", id = 1)
    private final int zaa;
    @C0463SafeParcelable.Field(getter = "getMethodInvocations", id = 2)
    @Nullable
    private List<C0443MethodInvocation> zab;

    static {
        Parcelable.Creator<C0454TelemetryData> creator;
        new C0484zaab();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    public C0454TelemetryData(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) @Nullable List<C0443MethodInvocation> list) {
        this.zaa = i;
        this.zab = list;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeTypedList(parcel2, 2, this.zab, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final int zaa() {
        return this.zaa;
    }

    @RecentlyNullable
    public final List<C0443MethodInvocation> zab() {
        return this.zab;
    }

    public final void zac(@RecentlyNonNull C0443MethodInvocation methodInvocation) {
        List<C0443MethodInvocation> list;
        C0443MethodInvocation methodInvocation2 = methodInvocation;
        if (this.zab == null) {
            new ArrayList();
            this.zab = list;
        }
        boolean add = this.zab.add(methodInvocation2);
    }
}
