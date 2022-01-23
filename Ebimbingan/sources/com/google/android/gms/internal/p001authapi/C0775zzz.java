package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.C0062Credential;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "SaveRequestCreator")
@C0463SafeParcelable.Reserved({1000})
/* renamed from: com.google.android.gms.internal.auth-api.zzz  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0775zzz extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0775zzz> CREATOR;
    @C0463SafeParcelable.Field(getter = "getCredential", id = 1)
    private final C0062Credential zzam;

    @C0463SafeParcelable.Constructor
    public C0775zzz(@C0463SafeParcelable.Param(id = 1) C0062Credential credential) {
        this.zzam = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, this.zzam, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<C0775zzz> creator;
        new C0774zzy();
        CREATOR = creator;
    }
}
