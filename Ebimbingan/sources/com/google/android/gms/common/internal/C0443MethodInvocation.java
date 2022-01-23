package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0206KeepForSdk
@C0463SafeParcelable.Class(creator = "MethodInvocationCreator")
/* renamed from: com.google.android.gms.common.internal.MethodInvocation */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0443MethodInvocation extends C0460AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0443MethodInvocation> CREATOR;
    @C0463SafeParcelable.Field(getter = "getMethodKey", id = 1)
    private final int zaa;
    @C0463SafeParcelable.Field(getter = "getResultStatusCode", id = 2)
    private final int zab;
    @C0463SafeParcelable.Field(getter = "getConnectionResultStatusCode", id = 3)
    private final int zac;
    @C0463SafeParcelable.Field(getter = "getStartTimeMillis", id = 4)
    private final long zad;
    @C0463SafeParcelable.Field(getter = "getEndTimeMillis", id = 5)
    private final long zae;
    @C0463SafeParcelable.Field(getter = "getCallingModuleId", id = 6)
    @Nullable
    private final String zaf;
    @C0463SafeParcelable.Field(getter = "getCallingEntryPoint", id = 7)
    @Nullable
    private final String zag;
    @C0463SafeParcelable.Field(defaultValue = "0", getter = "getServiceId", id = 8)
    private final int zah;

    static {
        Parcelable.Creator<C0443MethodInvocation> creator;
        new C0498zan();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    public C0443MethodInvocation(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) int i2, @C0463SafeParcelable.Param(id = 3) int i3, @C0463SafeParcelable.Param(id = 4) long j, @C0463SafeParcelable.Param(id = 5) long j2, @C0463SafeParcelable.Param(id = 6) @Nullable String str, @C0463SafeParcelable.Param(id = 7) @Nullable String str2, @C0463SafeParcelable.Param(id = 8) int i4) {
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
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeInt(parcel2, 2, this.zab);
        C0462SafeParcelWriter.writeInt(parcel2, 3, this.zac);
        C0462SafeParcelWriter.writeLong(parcel2, 4, this.zad);
        C0462SafeParcelWriter.writeLong(parcel2, 5, this.zae);
        C0462SafeParcelWriter.writeString(parcel2, 6, this.zaf, false);
        C0462SafeParcelWriter.writeString(parcel2, 7, this.zag, false);
        C0462SafeParcelWriter.writeInt(parcel2, 8, this.zah);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
