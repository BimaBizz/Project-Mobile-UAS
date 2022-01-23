package com.google.android.gms.common.api;

import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class PendingResults {
    @KeepForSdk
    private PendingResults() {
    }

    @RecentlyNonNull
    public static PendingResult<Status> canceledPendingResult() {
        BasePendingResult basePendingResult;
        new StatusPendingResult(Looper.getMainLooper());
        basePendingResult.cancel();
        return basePendingResult;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <R extends Result> PendingResult<R> immediateFailedResult(@RecentlyNonNull R r, @RecentlyNonNull GoogleApiClient googleApiClient) {
        BasePendingResult basePendingResult;
        R r2 = r;
        Object checkNotNull = Preconditions.checkNotNull(r2, "Result must not be null");
        Preconditions.checkArgument(!r2.getStatus().isSuccess(), "Status code must not be SUCCESS");
        new zaf(googleApiClient, r2);
        basePendingResult.setResult(r2);
        return basePendingResult;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(@RecentlyNonNull R r) {
        BasePendingResult basePendingResult;
        OptionalPendingResult<R> optionalPendingResult;
        R r2 = r;
        Object checkNotNull = Preconditions.checkNotNull(r2, "Result must not be null");
        new zag((GoogleApiClient) null);
        basePendingResult.setResult(r2);
        new OptionalPendingResultImpl(basePendingResult);
        return optionalPendingResult;
    }

    @RecentlyNonNull
    public static <R extends Result> PendingResult<R> canceledPendingResult(@RecentlyNonNull R r) {
        boolean z;
        BasePendingResult basePendingResult;
        R r2 = r;
        Object checkNotNull = Preconditions.checkNotNull(r2, "Result must not be null");
        if (r2.getStatus().getStatusCode() == 16) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Status code must be CommonStatusCodes.CANCELED");
        new zae(r2);
        basePendingResult.cancel();
        return basePendingResult;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(@RecentlyNonNull R r, @RecentlyNonNull GoogleApiClient googleApiClient) {
        BasePendingResult basePendingResult;
        OptionalPendingResult<R> optionalPendingResult;
        R r2 = r;
        Object checkNotNull = Preconditions.checkNotNull(r2, "Result must not be null");
        new zag(googleApiClient);
        basePendingResult.setResult(r2);
        new OptionalPendingResultImpl(basePendingResult);
        return optionalPendingResult;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static PendingResult<Status> immediatePendingResult(@RecentlyNonNull Status status) {
        BasePendingResult basePendingResult;
        Status status2 = status;
        Object checkNotNull = Preconditions.checkNotNull(status2, "Result must not be null");
        new StatusPendingResult(Looper.getMainLooper());
        basePendingResult.setResult(status2);
        return basePendingResult;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static PendingResult<Status> immediatePendingResult(@RecentlyNonNull Status status, @RecentlyNonNull GoogleApiClient googleApiClient) {
        BasePendingResult basePendingResult;
        Status status2 = status;
        Object checkNotNull = Preconditions.checkNotNull(status2, "Result must not be null");
        new StatusPendingResult(googleApiClient);
        basePendingResult.setResult(status2);
        return basePendingResult;
    }
}
