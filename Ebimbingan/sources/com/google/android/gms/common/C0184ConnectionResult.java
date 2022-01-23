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
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.iid.InstanceID;
import com.onesignal.OneSignalDbContract;

@C0463SafeParcelable.Class(creator = "ConnectionResultCreator")
/* renamed from: com.google.android.gms.common.ConnectionResult */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0184ConnectionResult extends C0460AbstractSafeParcelable {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    @RecentlyNonNull
    public static final Parcelable.Creator<C0184ConnectionResult> CREATOR;
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
    @C0452ShowFirstParty
    @C0206KeepForSdk
    public static final C0184ConnectionResult RESULT_SUCCESS;
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
    @C0206KeepForSdk
    public static final int UNKNOWN = -1;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zza;
    @C0463SafeParcelable.Field(getter = "getErrorCode", id = 2)
    private final int zzb;
    @C0463SafeParcelable.Field(getter = "getResolution", id = 3)
    @Nullable
    private final PendingIntent zzc;
    @C0463SafeParcelable.Field(getter = "getErrorMessage", id = 4)
    @Nullable
    private final String zzd;

    static {
        C0184ConnectionResult connectionResult;
        Parcelable.Creator<C0184ConnectionResult> creator;
        new C0184ConnectionResult(0);
        RESULT_SUCCESS = connectionResult;
        new C0633zzb();
        CREATOR = creator;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0184ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    @C0463SafeParcelable.Constructor
    C0184ConnectionResult(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) int i2, @C0463SafeParcelable.Param(id = 3) @Nullable PendingIntent pendingIntent, @C0463SafeParcelable.Param(id = 4) @Nullable String str) {
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
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            case 13:
                return "CANCELED";
            case 14:
                return InstanceID.ERROR_TIMEOUT;
            case 15:
                return "INTERRUPTED";
            case 16:
                return "API_UNAVAILABLE";
            case 17:
                return "SIGN_IN_FAILED";
            case 18:
                return "SERVICE_UPDATING";
            case 19:
                return "SERVICE_MISSING_PERMISSION";
            case 20:
                return "RESTRICTED_PROFILE";
            case 21:
                return "API_VERSION_UPDATE_REQUIRED";
            case 22:
                return "RESOLUTION_ACTIVITY_NOT_FOUND";
            case 23:
                return "API_DISABLED";
            case 24:
                return "API_DISABLED_FOR_CONNECTION";
            case 99:
                return "UNFINISHED";
            case 1500:
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
        return C0444Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public boolean isSuccess() {
        return this.zzb == 0;
    }

    @RecentlyNonNull
    public String toString() {
        C0444Objects.ToStringHelper stringHelper = C0444Objects.toStringHelper(this);
        C0444Objects.ToStringHelper add = stringHelper.add("statusCode", zza(this.zzb));
        C0444Objects.ToStringHelper add2 = stringHelper.add("resolution", this.zzc);
        C0444Objects.ToStringHelper add3 = stringHelper.add(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, this.zzd);
        return stringHelper.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        C0462SafeParcelWriter.writeInt(parcel2, 2, getErrorCode());
        C0462SafeParcelWriter.writeParcelable(parcel2, 3, getResolution(), i, false);
        C0462SafeParcelWriter.writeString(parcel2, 4, getErrorMessage(), false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0184ConnectionResult(int i, @Nullable PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public void startResolutionForResult(@RecentlyNonNull Activity activity, int i) throws IntentSender.SendIntentException {
        Activity activity2 = activity;
        int i2 = i;
        if (hasResolution()) {
            PendingIntent pendingIntent = this.zzc;
            Object checkNotNull = C0446Preconditions.checkNotNull(pendingIntent);
            activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, (Intent) null, 0, 0, 0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0184ConnectionResult(int i, @Nullable PendingIntent pendingIntent, @Nullable String str) {
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
            boolean r2 = r2 instanceof com.google.android.gms.common.C0184ConnectionResult
            if (r2 != 0) goto L_0x0011
            r2 = 0
            r0 = r2
            goto L_0x0008
        L_0x0011:
            r2 = r1
            com.google.android.gms.common.ConnectionResult r2 = (com.google.android.gms.common.C0184ConnectionResult) r2
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
            boolean r2 = com.google.android.gms.common.internal.C0444Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x0038
            r2 = r0
            java.lang.String r2 = r2.zzd
            r3 = r1
            java.lang.String r3 = r3.zzd
            boolean r2 = com.google.android.gms.common.internal.C0444Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x0038
            r2 = 1
            r0 = r2
            goto L_0x0008
        L_0x0038:
            r2 = 0
            r0 = r2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C0184ConnectionResult.equals(java.lang.Object):boolean");
    }
}
