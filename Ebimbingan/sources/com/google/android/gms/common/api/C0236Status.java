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
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.util.C0617VisibleForTesting;

@C0206KeepForSdk
@C0463SafeParcelable.Class(creator = "StatusCreator")
/* renamed from: com.google.android.gms.common.api.Status */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0236Status extends C0460AbstractSafeParcelable implements C0231Result, C0447ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0236Status> CREATOR;
    @RecentlyNonNull
    @C0452ShowFirstParty
    @C0206KeepForSdk
    public static final C0236Status RESULT_CANCELED;
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final C0236Status RESULT_DEAD_CLIENT;
    @RecentlyNonNull
    @C0452ShowFirstParty
    @C0206KeepForSdk
    public static final C0236Status RESULT_INTERNAL_ERROR;
    @RecentlyNonNull
    @C0452ShowFirstParty
    @C0206KeepForSdk
    public static final C0236Status RESULT_INTERRUPTED;
    @RecentlyNonNull
    @C0452ShowFirstParty
    @C0206KeepForSdk
    @C0617VisibleForTesting
    public static final C0236Status RESULT_SUCCESS;
    @RecentlyNonNull
    @C0452ShowFirstParty
    @C0206KeepForSdk
    public static final C0236Status RESULT_TIMEOUT;
    @RecentlyNonNull
    @C0452ShowFirstParty
    public static final C0236Status zza;
    @C0463SafeParcelable.VersionField(id = 1000)
    final int zzb;
    @C0463SafeParcelable.Field(getter = "getStatusCode", id = 1)
    private final int zzc;
    @C0463SafeParcelable.Field(getter = "getStatusMessage", id = 2)
    @Nullable
    private final String zzd;
    @C0463SafeParcelable.Field(getter = "getPendingIntent", id = 3)
    @Nullable
    private final PendingIntent zze;
    @C0463SafeParcelable.Field(getter = "getConnectionResult", id = 4)
    @Nullable
    private final C0184ConnectionResult zzf;

    static {
        C0236Status status;
        C0236Status status2;
        C0236Status status3;
        C0236Status status4;
        C0236Status status5;
        C0236Status status6;
        C0236Status status7;
        Parcelable.Creator<C0236Status> creator;
        new C0236Status(0);
        RESULT_SUCCESS = status;
        new C0236Status(14);
        RESULT_INTERRUPTED = status2;
        new C0236Status(8);
        RESULT_INTERNAL_ERROR = status3;
        new C0236Status(15);
        RESULT_TIMEOUT = status4;
        new C0236Status(16);
        RESULT_CANCELED = status5;
        new C0236Status(17);
        zza = status6;
        new C0236Status(18);
        RESULT_DEAD_CLIENT = status7;
        new C0384zzb();
        CREATOR = creator;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C0206KeepForSdk
    public C0236Status(int i) {
        this(i, (String) null);
    }

    @C0463SafeParcelable.Constructor
    @C0206KeepForSdk
    C0236Status(@C0463SafeParcelable.Param(id = 1000) int i, @C0463SafeParcelable.Param(id = 1) int i2, @C0463SafeParcelable.Param(id = 2) @Nullable String str, @C0463SafeParcelable.Param(id = 3) @Nullable PendingIntent pendingIntent, @C0463SafeParcelable.Param(id = 4) @Nullable C0184ConnectionResult connectionResult) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str;
        this.zze = pendingIntent;
        this.zzf = connectionResult;
    }

    public boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof C0236Status)) {
            return false;
        }
        C0236Status status = (C0236Status) obj2;
        return this.zzb == status.zzb && this.zzc == status.zzc && C0444Objects.equal(this.zzd, status.zzd) && C0444Objects.equal(this.zze, status.zze) && C0444Objects.equal(this.zzf, status.zzf);
    }

    @RecentlyNullable
    public C0184ConnectionResult getConnectionResult() {
        return this.zzf;
    }

    @RecentlyNullable
    public PendingIntent getResolution() {
        return this.zze;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public C0236Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.zzc;
    }

    @RecentlyNullable
    public String getStatusMessage() {
        return this.zzd;
    }

    @C0617VisibleForTesting
    public boolean hasResolution() {
        return this.zze != null;
    }

    public int hashCode() {
        return C0444Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf);
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
        C0444Objects.ToStringHelper stringHelper = C0444Objects.toStringHelper(this);
        C0444Objects.ToStringHelper add = stringHelper.add("statusCode", zza());
        C0444Objects.ToStringHelper add2 = stringHelper.add("resolution", this.zze);
        return stringHelper.toString();
    }

    @C0206KeepForSdk
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, getStatusCode());
        C0462SafeParcelWriter.writeString(parcel2, 2, getStatusMessage(), false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 3, this.zze, i2, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 4, getConnectionResult(), i2, false);
        C0462SafeParcelWriter.writeInt(parcel2, 1000, this.zzb);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    @RecentlyNonNull
    public final String zza() {
        String str = this.zzd;
        return str != null ? str : C0218CommonStatusCodes.getStatusCodeString(this.zzc);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C0206KeepForSdk
    C0236Status(int i, int i2, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(i, i2, str, pendingIntent, (C0184ConnectionResult) null);
    }

    public void startResolutionForResult(@RecentlyNonNull Activity activity, int i) throws IntentSender.SendIntentException {
        Activity activity2 = activity;
        int i2 = i;
        if (hasResolution()) {
            PendingIntent pendingIntent = this.zze;
            Object checkNotNull = C0446Preconditions.checkNotNull(pendingIntent);
            activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, (Intent) null, 0, 0, 0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C0206KeepForSdk
    public C0236Status(int i, @Nullable String str) {
        this(1, i, str, (PendingIntent) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C0206KeepForSdk
    public C0236Status(int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0236Status(@RecentlyNonNull C0184ConnectionResult connectionResult, @RecentlyNonNull String str) {
        this(connectionResult, str, 17);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0236Status(@androidx.annotation.RecentlyNonNull com.google.android.gms.common.C0184ConnectionResult r11, @androidx.annotation.RecentlyNonNull java.lang.String r12, int r13) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C0236Status.<init>(com.google.android.gms.common.ConnectionResult, java.lang.String, int):void");
    }
}
