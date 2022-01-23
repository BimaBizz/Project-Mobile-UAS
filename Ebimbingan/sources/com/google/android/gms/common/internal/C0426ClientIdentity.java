package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.microsoft.appcenter.Constants;

@C0206KeepForSdk
@C0463SafeParcelable.Class(creator = "ClientIdentityCreator")
@C0463SafeParcelable.Reserved({1000})
/* renamed from: com.google.android.gms.common.internal.ClientIdentity */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0426ClientIdentity extends C0460AbstractSafeParcelable {
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final Parcelable.Creator<C0426ClientIdentity> CREATOR;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "0", id = 1)
    public final int zaa;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "null", id = 2)
    @RecentlyNullable
    public final String zab;

    static {
        Parcelable.Creator<C0426ClientIdentity> creator;
        new C0482zaa();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    public C0426ClientIdentity(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) @Nullable String str) {
        this.zaa = i;
        this.zab = str;
    }

    public final int hashCode() {
        return this.zaa;
    }

    @RecentlyNonNull
    public final String toString() {
        StringBuilder sb;
        int i = this.zaa;
        String str = this.zab;
        new StringBuilder(String.valueOf(str).length() + 12);
        StringBuilder append = sb.append(i);
        StringBuilder append2 = sb.append(Constants.COMMON_SCHEMA_PREFIX_SEPARATOR);
        StringBuilder append3 = sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zab, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r1
            r3 = r0
            if (r2 != r3) goto L_0x0009
            r2 = 1
            r0 = r2
        L_0x0008:
            return r0
        L_0x0009:
            r2 = r1
            boolean r2 = r2 instanceof com.google.android.gms.common.internal.C0426ClientIdentity
            if (r2 != 0) goto L_0x0011
            r2 = 0
            r0 = r2
            goto L_0x0008
        L_0x0011:
            r2 = r1
            com.google.android.gms.common.internal.ClientIdentity r2 = (com.google.android.gms.common.internal.C0426ClientIdentity) r2
            r1 = r2
            r2 = r1
            int r2 = r2.zaa
            r3 = r0
            int r3 = r3.zaa
            if (r2 != r3) goto L_0x002c
            r2 = r1
            java.lang.String r2 = r2.zab
            r3 = r0
            java.lang.String r3 = r3.zab
            boolean r2 = com.google.android.gms.common.internal.C0444Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x002c
            r2 = 1
            r0 = r2
            goto L_0x0008
        L_0x002c:
            r2 = 0
            r0 = r2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0426ClientIdentity.equals(java.lang.Object):boolean");
    }
}
