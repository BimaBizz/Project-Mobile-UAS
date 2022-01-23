package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleSignInOptionsExtensionCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    @SafeParcelable.Field(getter = "getType", id = 2)
    private int zab;
    @SafeParcelable.Field(getter = "getBundle", id = 3)
    private Bundle zac;

    static {
        Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> creator;
        new zaa();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) Bundle bundle) {
        this.zaa = i;
        this.zab = i2;
        this.zac = bundle;
    }

    @KeepForSdk
    public int getType() {
        return this.zab;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        SafeParcelWriter.writeInt(parcel2, 2, getType());
        SafeParcelWriter.writeBundle(parcel2, 3, this.zac, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GoogleSignInOptionsExtensionParcelable(@androidx.annotation.RecentlyNonNull com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable.<init>(com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension):void");
    }
}
