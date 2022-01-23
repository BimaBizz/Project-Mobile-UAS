package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "GoogleSignInOptionsExtensionCreator")
/* renamed from: com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0131GoogleSignInOptionsExtensionParcelable extends C0460AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0131GoogleSignInOptionsExtensionParcelable> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaa;
    @C0463SafeParcelable.Field(getter = "getType", id = 2)
    private int zab;
    @C0463SafeParcelable.Field(getter = "getBundle", id = 3)
    private Bundle zac;

    static {
        Parcelable.Creator<C0131GoogleSignInOptionsExtensionParcelable> creator;
        new C0136zaa();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0131GoogleSignInOptionsExtensionParcelable(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) int i2, @C0463SafeParcelable.Param(id = 3) Bundle bundle) {
        this.zaa = i;
        this.zab = i2;
        this.zac = bundle;
    }

    @C0206KeepForSdk
    public int getType() {
        return this.zab;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeInt(parcel2, 2, getType());
        C0462SafeParcelWriter.writeBundle(parcel2, 3, this.zac, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0131GoogleSignInOptionsExtensionParcelable(@androidx.annotation.RecentlyNonNull com.google.android.gms.auth.api.signin.C0126GoogleSignInOptionsExtension r7) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r0
            r3 = 1
            r4 = r1
            int r4 = r4.getExtensionType()
            r5 = r1
            android.os.Bundle r5 = r5.toBundle()
            r2.<init>(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.C0131GoogleSignInOptionsExtensionParcelable.<init>(com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension):void");
    }
}
