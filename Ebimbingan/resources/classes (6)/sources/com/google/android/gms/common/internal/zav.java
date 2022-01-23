package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    @SafeParcelable.Field(id = 2)
    @Nullable
    final IBinder zab;
    @SafeParcelable.Field(getter = "getConnectionResult", id = 3)
    private final ConnectionResult zac;
    @SafeParcelable.Field(getter = "getSaveDefaultAccount", id = 4)
    private final boolean zad;
    @SafeParcelable.Field(getter = "isFromCrossClientAuth", id = 5)
    private final boolean zae;

    static {
        Parcelable.Creator<zav> creator;
        new zaw();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    zav(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) @Nullable IBinder iBinder, @SafeParcelable.Param(id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2) {
        this.zaa = i;
        this.zab = iBinder;
        this.zac = connectionResult;
        this.zad = z;
        this.zae = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        SafeParcelWriter.writeIBinder(parcel2, 2, this.zab, false);
        SafeParcelWriter.writeParcelable(parcel2, 3, this.zac, i, false);
        SafeParcelWriter.writeBoolean(parcel2, 4, this.zad);
        SafeParcelWriter.writeBoolean(parcel2, 5, this.zae);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    @Nullable
    public final IAccountAccessor zaa() {
        IBinder iBinder = this.zab;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.asInterface(iBinder);
    }

    public final ConnectionResult zab() {
        return this.zac;
    }

    public final boolean zac() {
        return this.zad;
    }

    public final boolean zad() {
        return this.zae;
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
            if (r2 != 0) goto L_0x0008
            r2 = 0
            r0 = r2
        L_0x0007:
            return r0
        L_0x0008:
            r2 = r0
            r3 = r1
            if (r2 != r3) goto L_0x000f
            r2 = 1
            r0 = r2
            goto L_0x0007
        L_0x000f:
            r2 = r1
            boolean r2 = r2 instanceof com.google.android.gms.common.internal.zav
            if (r2 != 0) goto L_0x0017
            r2 = 0
            r0 = r2
            goto L_0x0007
        L_0x0017:
            r2 = r1
            com.google.android.gms.common.internal.zav r2 = (com.google.android.gms.common.internal.zav) r2
            r1 = r2
            r2 = r0
            com.google.android.gms.common.ConnectionResult r2 = r2.zac
            r3 = r1
            com.google.android.gms.common.ConnectionResult r3 = r3.zac
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003a
            r2 = r0
            com.google.android.gms.common.internal.IAccountAccessor r2 = r2.zaa()
            r3 = r1
            com.google.android.gms.common.internal.IAccountAccessor r3 = r3.zaa()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x003a
            r2 = 1
            r0 = r2
            goto L_0x0007
        L_0x003a:
            r2 = 0
            r0 = r2
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zav.equals(java.lang.Object):boolean");
    }
}
