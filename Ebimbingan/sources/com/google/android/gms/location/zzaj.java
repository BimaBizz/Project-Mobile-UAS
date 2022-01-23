package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "NetworkLocationStatusCreator")
public final class zzaj extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 2)
    private final int zzar;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 1)
    private final int zzas;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 4)
    private final long zzat;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 3)
    private final long zzbt;

    static {
        Parcelable.Creator<zzaj> creator;
        new zzak();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    zzaj(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) int i2, @C0463SafeParcelable.Param(id = 3) long j, @C0463SafeParcelable.Param(id = 4) long j2) {
        this.zzas = i;
        this.zzar = i2;
        this.zzbt = j;
        this.zzat = j2;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r1 = r8
            r2 = r9
            r4 = r1
            r5 = r2
            if (r4 != r5) goto L_0x0009
            r4 = 1
            r1 = r4
        L_0x0008:
            return r1
        L_0x0009:
            r4 = r2
            if (r4 == 0) goto L_0x0018
            r4 = r1
            java.lang.Class r4 = r4.getClass()
            r5 = r2
            java.lang.Class r5 = r5.getClass()
            if (r4 == r5) goto L_0x001b
        L_0x0018:
            r4 = 0
            r1 = r4
            goto L_0x0008
        L_0x001b:
            r4 = r2
            com.google.android.gms.location.zzaj r4 = (com.google.android.gms.location.zzaj) r4
            r3 = r4
            r4 = r1
            int r4 = r4.zzas
            r5 = r3
            int r5 = r5.zzas
            if (r4 != r5) goto L_0x0046
            r4 = r1
            int r4 = r4.zzar
            r5 = r3
            int r5 = r5.zzar
            if (r4 != r5) goto L_0x0046
            r4 = r1
            long r4 = r4.zzbt
            r6 = r3
            long r6 = r6.zzbt
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0046
            r4 = r1
            long r4 = r4.zzat
            r6 = r3
            long r6 = r6.zzat
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0046
            r4 = 1
            r1 = r4
            goto L_0x0008
        L_0x0046:
            r4 = 0
            r1 = r4
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzaj.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(this.zzar);
        Object[] objArr2 = objArr;
        objArr2[1] = Integer.valueOf(this.zzas);
        Object[] objArr3 = objArr2;
        objArr3[2] = Long.valueOf(this.zzat);
        Object[] objArr4 = objArr3;
        objArr4[3] = Long.valueOf(this.zzbt);
        return C0444Objects.hashCode(objArr4);
    }

    public final String toString() {
        StringBuilder sb;
        new StringBuilder("NetworkLocationStatus:");
        StringBuilder sb2 = sb;
        StringBuilder sb3 = sb2;
        StringBuilder append = sb2.append(" Wifi status: ").append(this.zzas).append(" Cell status: ").append(this.zzar).append(" elapsed time NS: ").append(this.zzat).append(" system time ms: ").append(this.zzbt);
        return sb3.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zzas);
        C0462SafeParcelWriter.writeInt(parcel2, 2, this.zzar);
        C0462SafeParcelWriter.writeLong(parcel2, 3, this.zzbt);
        C0462SafeParcelWriter.writeLong(parcel2, 4, this.zzat);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
