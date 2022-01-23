package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConnectionResultCreator")
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    @RecentlyNonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR;
    public static final int DEVELOPER_ERROR = 10;
    @Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_ACTIVITY_NOT_FOUND = 22;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
    @RecentlyNonNull
    @ShowFirstParty
    @KeepForSdk
    public static final ConnectionResult RESULT_SUCCESS;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    @KeepForSdk
    public static final int UNKNOWN = -1;
    @SafeParcelable.VersionField(id = 1)
    final int zza;
    @SafeParcelable.Field(getter = "getErrorCode", id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getResolution", id = 3)
    @Nullable
    private final PendingIntent zzc;
    @SafeParcelable.Field(getter = "getErrorMessage", id = 4)
    @Nullable
    private final String zzd;

    static {
        ConnectionResult connectionResult;
        Parcelable.Creator<ConnectionResult> creator;
        new ConnectionResult(0);
        RESULT_SUCCESS = connectionResult;
        new zzb();
        CREATOR = creator;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    @SafeParcelable.Constructor
    ConnectionResult(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) @Nullable PendingIntent pendingIntent, @SafeParcelable.Param(id = 4) @Nullable String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = pendingIntent;
        this.zzd = str;
    }

    @NonNull
    static String zza(int i) {
        StringBuilder sb;
        int i2 = i;
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case SERVICE_INVALID /*9*/:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case LICENSE_CHECK_FAILED /*11*/:
                return "LICENSE_CHECK_FAILED";
            case 13:
                return "CANCELED";
            case 14:
                return "TIMEOUT";
            case 15:
                return "INTERRUPTED";
            case 16:
                return "API_UNAVAILABLE";
            case 17:
                return "SIGN_IN_FAILED";
            case SERVICE_UPDATING /*18*/:
                return "SERVICE_UPDATING";
            case 19:
                return "SERVICE_MISSING_PERMISSION";
            case 20:
                return "RESTRICTED_PROFILE";
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /*21*/:
                return "API_VERSION_UPDATE_REQUIRED";
            case 22:
                return "RESOLUTION_ACTIVITY_NOT_FOUND";
            case API_DISABLED /*23*/:
                return "API_DISABLED";
            case API_DISABLED_FOR_CONNECTION /*24*/:
                return "API_DISABLED_FOR_CONNECTION";
            case 99:
                return "UNFINISHED";
            case DRIVE_EXTERNAL_STORAGE_REQUIRED /*1500*/:
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            default:
                new StringBuilder(31);
                StringBuilder append = sb.append("UNKNOWN_ERROR_CODE(");
                StringBuilder append2 = sb.append(i2);
                StringBuilder append3 = sb.append(")");
                return sb.toString();
        }
    }

    public int getErrorCode() {
        return this.zzb;
    }

    @RecentlyNullable
    public String getErrorMessage() {
        return this.zzd;
    }

    @RecentlyNullable
    public PendingIntent getResolution() {
        return this.zzc;
    }

    public boolean hasResolution() {
        return (this.zzb == 0 || this.zzc == null) ? false : true;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public boolean isSuccess() {
        return this.zzb == 0;
    }

    @RecentlyNonNull
    public String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        Objects.ToStringHelper add = stringHelper.add("statusCode", zza(this.zzb));
        Objects.ToStringHelper add2 = stringHelper.add("resolution", this.zzc);
        Objects.ToStringHelper add3 = stringHelper.add("message", this.zzd);
        return stringHelper.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        SafeParcelWriter.writeInt(parcel2, 2, getErrorCode());
        SafeParcelWriter.writeParcelable(parcel2, 3, getResolution(), i, false);
        SafeParcelWriter.writeString(parcel2, 4, getErrorMessage(), false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public void startResolutionForResult(@RecentlyNonNull Activity activity, int i) throws IntentSender.SendIntentException {
        Activity activity2 = activity;
        int i2 = i;
        if (hasResolution()) {
            PendingIntent pendingIntent = this.zzc;
            Object checkNotNull = Preconditions.checkNotNull(pendingIntent);
            activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, (Intent) null, 0, 0, 0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        this(1, i, pendingIntent, str);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r1
            r3 = r0
            if (r2 != r3) goto L_0x0009
            r2 = 1
            r0 = r2
        L_0x0008:
            return r0
        L_0x0009:
            r2 = r1
            boolean r2 = r2 instanceof com.google.android.gms.common.ConnectionResult
            if (r2 != 0) goto L_0x0011
            r2 = 0
            r0 = r2
            goto L_0x0008
        L_0x0011:
            r2 = r1
            com.google.android.gms.common.ConnectionResult r2 = (com.google.android.gms.common.ConnectionResult) r2
            r1 = r2
            r2 = r0
            int r2 = r2.zzb
            r3 = r1
            int r3 = r3.zzb
            if (r2 != r3) goto L_0x0038
            r2 = r0
            android.app.PendingIntent r2 = r2.zzc
            r3 = r1
            android.app.PendingIntent r3 = r3.zzc
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x0038
            r2 = r0
            java.lang.String r2 = r2.zzd
            r3 = r1
            java.lang.String r3 = r3.zzd
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x0038
            r2 = 1
            r0 = r2
            goto L_0x0008
        L_0x0038:
            r2 = 0
            r0 = r2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.ConnectionResult.equals(java.lang.Object):boolean");
    }
}
