package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0206KeepForSdk
@C0463SafeParcelable.Class(creator = "FavaDiagnosticsEntityCreator")
/* renamed from: com.google.android.gms.common.server.FavaDiagnosticsEntity */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0550FavaDiagnosticsEntity extends C0460AbstractSafeParcelable implements C0447ReflectedParcelable {
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final Parcelable.Creator<C0550FavaDiagnosticsEntity> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaa;
    @RecentlyNonNull
    @C0463SafeParcelable.Field(id = 2)
    public final String zab;
    @C0463SafeParcelable.Field(id = 3)
    public final int zac;

    static {
        Parcelable.Creator<C0550FavaDiagnosticsEntity> creator;
        new C0578zaa();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    public C0550FavaDiagnosticsEntity(@C0463SafeParcelable.Param(id = 1) int i, @RecentlyNonNull @C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) int i2) {
        this.zaa = i;
        this.zab = str;
        this.zac = i2;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zab, false);
        C0462SafeParcelWriter.writeInt(parcel2, 3, this.zac);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    @C0206KeepForSdk
    public C0550FavaDiagnosticsEntity(@RecentlyNonNull String str, int i) {
        this.zaa = 1;
        this.zab = str;
        this.zac = i;
    }
}
