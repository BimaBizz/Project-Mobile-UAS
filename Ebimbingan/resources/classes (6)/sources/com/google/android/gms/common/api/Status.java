package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
@SafeParcelable.Class(creator = "StatusCreator")
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Status> CREATOR;
    @RecentlyNonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_CANCELED;
    @RecentlyNonNull
    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT;
    @RecentlyNonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_INTERNAL_ERROR;
    @RecentlyNonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_INTERRUPTED;
    @RecentlyNonNull
    @ShowFirstParty
    @KeepForSdk
    @VisibleForTesting
    public static final Status RESULT_SUCCESS;
    @RecentlyNonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_TIMEOUT;
    @RecentlyNonNull
    @ShowFirstParty
    public static final Status zza;
    @SafeParcelable.VersionField(id = 1000)
    final int zzb;
    @SafeParcelable.Field(getter = "getStatusCode", id = 1)
    private final int zzc;
    @SafeParcelable.Field(getter = "getStatusMessage", id = 2)
    @Nullable
    private final String zzd;
    @SafeParcelable.Field(getter = "getPendingIntent", id = 3)
    @Nullable
    private final PendingIntent zze;
    @SafeParcelable.Field(getter = "getConnectionResult", id = 4)
    @Nullable
    private final ConnectionResult zzf;

    static {
        Status status;
        Status status2;
        Status status3;
        Status status4;
        Status status5;
        Status status6;
        Status status7;
        Parcelable.Creator<Status> creator;
        new Status(0);
        RESULT_SUCCESS = status;
        new Status(14);
        RESULT_INTERRUPTED = status2;
        new Status(8);
        RESULT_INTERNAL_ERROR = status3;
        new Status(15);
        RESULT_TIMEOUT = status4;
        new Status(16);
        RESULT_CANCELED = status5;
        new Status(17);
        zza = status6;
        new Status(18);
        RESULT_DEAD_CLIENT = status7;
        new zzb();
        CREATOR = creator;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    public Status(int i) {
        this(i, (String) null);
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    Status(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) @Nullable String str, @SafeParcelable.Param(id = 3) @Nullable PendingIntent pendingIntent, @SafeParcelable.Param(id = 4) @Nullable ConnectionResult connectionResult) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str;
        this.zze = pendingIntent;
        this.zzf = connectionResult;
    }

    public boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof Status)) {
            return false;
        }
        Status status = (Status) obj2;
        return this.zzb == status.zzb && this.zzc == status.zzc && Objects.equal(this.zzd, status.zzd) && Objects.equal(this.zze, status.zze) && Objects.equal(this.zzf, status.zzf);
    }

    @RecentlyNullable
    public ConnectionResult getConnectionResult() {
        return this.zzf;
    }

    @RecentlyNullable
    public PendingIntent getResolution() {
        return this.zze;
    }

    @RecentlyNonNull
    @KeepForSdk
    public Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.zzc;
    }

    @RecentlyNullable
    public String getStatusMessage() {
        return this.zzd;
    }

    @VisibleForTesting
    public boolean hasResolution() {
        return this.zze != null;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf);
    }

    public boolean isCanceled() {
        return this.zzc == 16;
    }

    public boolean isInterrupted() {
        return this.zzc == 14;
    }

    public boolean isSuccess() {
        return this.zzc <= 0;
    }

    @RecentlyNonNull
    public String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        Objects.ToStringHelper add = stringHelper.add("statusCode", zza());
        Objects.ToStringHelper add2 = stringHelper.add("resolution", this.zze);
        return stringHelper.toString();
    }

    @KeepForSdk
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, getStatusCode());
        SafeParcelWriter.writeString(parcel2, 2, getStatusMessage(), false);
        SafeParcelWriter.writeParcelable(parcel2, 3, this.zze, i2, false);
        SafeParcelWriter.writeParcelable(parcel2, 4, getConnectionResult(), i2, false);
        SafeParcelWriter.writeInt(parcel2, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    @RecentlyNonNull
    public final String zza() {
        String str = this.zzd;
        return str != null ? str : CommonStatusCodes.getStatusCodeString(this.zzc);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    Status(int i, int i2, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(i, i2, str, pendingIntent, (ConnectionResult) null);
    }

    public void startResolutionForResult(@RecentlyNonNull Activity activity, int i) throws IntentSender.SendIntentException {
        Activity activity2 = activity;
        int i2 = i;
        if (hasResolution()) {
            PendingIntent pendingIntent = this.zze;
            Object checkNotNull = Preconditions.checkNotNull(pendingIntent);
            activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, (Intent) null, 0, 0, 0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    public Status(int i, @Nullable String str) {
        this(1, i, str, (PendingIntent) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    public Status(int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Status(@RecentlyNonNull ConnectionResult connectionResult, @RecentlyNonNull String str) {
        this(connectionResult, str, 17);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Status(@androidx.annotation.RecentlyNonNull com.google.android.gms.common.ConnectionResult r11, @androidx.annotation.RecentlyNonNull java.lang.String r12, int r13) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r0
            r5 = 1
            r6 = r3
            r7 = r2
            r8 = r1
            android.app.PendingIntent r8 = r8.getResolution()
            r9 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.Status.<init>(com.google.android.gms.common.ConnectionResult, java.lang.String, int):void");
    }
}
