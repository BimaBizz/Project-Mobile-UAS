package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "BeginSignInResultCreator")
/* renamed from: com.google.android.gms.auth.api.identity.BeginSignInResult */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0084BeginSignInResult extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0084BeginSignInResult> CREATOR;
    @C0463SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final PendingIntent zzbc;

    @C0463SafeParcelable.Constructor
    public C0084BeginSignInResult(@C0463SafeParcelable.Param(id = 1) PendingIntent pendingIntent) {
        this.zzbc = (PendingIntent) C0446Preconditions.checkNotNull(pendingIntent);
    }

    public final PendingIntent getPendingIntent() {
        return this.zzbc;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, getPendingIntent(), i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<C0084BeginSignInResult> creator;
        new C0094zzd();
        CREATOR = creator;
    }
}
