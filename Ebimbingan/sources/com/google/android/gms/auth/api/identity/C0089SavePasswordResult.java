package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "SavePasswordResultCreator")
/* renamed from: com.google.android.gms.auth.api.identity.SavePasswordResult */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C0089SavePasswordResult extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0089SavePasswordResult> CREATOR;
    @C0463SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final PendingIntent zzbc;

    @C0463SafeParcelable.Constructor
    public C0089SavePasswordResult(@C0463SafeParcelable.Param(id = 1) PendingIntent pendingIntent) {
        this.zzbc = (PendingIntent) C0446Preconditions.checkNotNull(pendingIntent);
    }

    public PendingIntent getPendingIntent() {
        return this.zzbc;
    }

    public int hashCode() {
        return C0444Objects.hashCode(this.zzbc);
    }

    public boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof C0089SavePasswordResult)) {
            return false;
        }
        return C0444Objects.equal(this.zzbc, ((C0089SavePasswordResult) obj2).zzbc);
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, getPendingIntent(), i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<C0089SavePasswordResult> creator;
        new C0101zzk();
        CREATOR = creator;
    }
}
