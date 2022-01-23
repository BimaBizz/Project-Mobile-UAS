package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.internal.C0437IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
/* renamed from: com.google.android.gms.common.internal.zav */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0506zav extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0506zav> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaa;
    @C0463SafeParcelable.Field(id = 2)
    @Nullable
    final IBinder zab;
    @C0463SafeParcelable.Field(getter = "getConnectionResult", id = 3)
    private final C0184ConnectionResult zac;
    @C0463SafeParcelable.Field(getter = "getSaveDefaultAccount", id = 4)
    private final boolean zad;
    @C0463SafeParcelable.Field(getter = "isFromCrossClientAuth", id = 5)
    private final boolean zae;

    static {
        Parcelable.Creator<C0506zav> creator;
        new C0507zaw();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0506zav(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) @Nullable IBinder iBinder, @C0463SafeParcelable.Param(id = 3) C0184ConnectionResult connectionResult, @C0463SafeParcelable.Param(id = 4) boolean z, @C0463SafeParcelable.Param(id = 5) boolean z2) {
        this.zaa = i;
        this.zab = iBinder;
        this.zac = connectionResult;
        this.zad = z;
        this.zae = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeIBinder(parcel2, 2, this.zab, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 3, this.zac, i, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 4, this.zad);
        C0462SafeParcelWriter.writeBoolean(parcel2, 5, this.zae);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    @Nullable
    public final C0437IAccountAccessor zaa() {
        IBinder iBinder = this.zab;
        if (iBinder == null) {
            return null;
        }
        return C0437IAccountAccessor.Stub.asInterface(iBinder);
    }

    public final C0184ConnectionResult zab() {
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
            boolean r2 = r2 instanceof com.google.android.gms.common.internal.C0506zav
            if (r2 != 0) goto L_0x0017
            r2 = 0
            r0 = r2
            goto L_0x0007
        L_0x0017:
            r2 = r1
            com.google.android.gms.common.internal.zav r2 = (com.google.android.gms.common.internal.C0506zav) r2
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
            boolean r2 = com.google.android.gms.common.internal.C0444Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x003a
            r2 = 1
            r0 = r2
            goto L_0x0007
        L_0x003a:
            r2 = 0
            r0 = r2
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0506zav.equals(java.lang.Object):boolean");
    }
}
