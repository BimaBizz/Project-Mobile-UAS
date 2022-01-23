package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BeginSignInResultCreator")
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR;
    @SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final PendingIntent zzbc;

    @SafeParcelable.Constructor
    public BeginSignInResult(@SafeParcelable.Param(id = 1) PendingIntent pendingIntent) {
        this.zzbc = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    public final PendingIntent getPendingIntent() {
        return this.zzbc;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<BeginSignInResult> creator;
        new zzd();
        CREATOR = creator;
    }
}
