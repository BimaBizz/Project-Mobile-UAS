package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "MethodInvocationCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class MethodInvocation extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR;
    @SafeParcelable.Field(getter = "getMethodKey", id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getResultStatusCode", id = 2)
    private final int zab;
    @SafeParcelable.Field(getter = "getConnectionResultStatusCode", id = 3)
    private final int zac;
    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 4)
    private final long zad;
    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 5)
    private final long zae;
    @SafeParcelable.Field(getter = "getCallingModuleId", id = 6)
    @Nullable
    private final String zaf;
    @SafeParcelable.Field(getter = "getCallingEntryPoint", id = 7)
    @Nullable
    private final String zag;
    @SafeParcelable.Field(defaultValue = "0", getter = "getServiceId", id = 8)
    private final int zah;

    static {
        Parcelable.Creator<MethodInvocation> creator;
        new zan();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) long j, @SafeParcelable.Param(id = 5) long j2, @SafeParcelable.Param(id = 6) @Nullable String str, @SafeParcelable.Param(id = 7) @Nullable String str2, @SafeParcelable.Param(id = 8) int i4) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = j;
        this.zae = j2;
        this.zaf = str;
        this.zag = str2;
        this.zah = i4;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        SafeParcelWriter.writeInt(parcel2, 2, this.zab);
        SafeParcelWriter.writeInt(parcel2, 3, this.zac);
        SafeParcelWriter.writeLong(parcel2, 4, this.zad);
        SafeParcelWriter.writeLong(parcel2, 5, this.zae);
        SafeParcelWriter.writeString(parcel2, 6, this.zaf, false);
        SafeParcelWriter.writeString(parcel2, 7, this.zag, false);
        SafeParcelWriter.writeInt(parcel2, 8, this.zah);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
