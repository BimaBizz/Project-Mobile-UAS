package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SavePasswordResultCreator")
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordResult> CREATOR;
    @SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final PendingIntent zzbc;

    @SafeParcelable.Constructor
    public SavePasswordResult(@SafeParcelable.Param(id = 1) PendingIntent pendingIntent) {
        this.zzbc = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    public PendingIntent getPendingIntent() {
        return this.zzbc;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzbc);
    }

    public boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof SavePasswordResult)) {
            return false;
        }
        return Objects.equal(this.zzbc, ((SavePasswordResult) obj2).zzbc);
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<SavePasswordResult> creator;
        new zzk();
        CREATOR = creator;
    }
}
