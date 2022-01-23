package com.google.android.gms.common.api;

import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.internal.C0244BasePendingResult;
import com.google.android.gms.common.api.internal.C0258OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.C0266StatusPendingResult;
import com.google.android.gms.common.internal.C0446Preconditions;

/* renamed from: com.google.android.gms.common.api.PendingResults */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0226PendingResults {
    @C0206KeepForSdk
    private C0226PendingResults() {
    }

    @RecentlyNonNull
    public static C0225PendingResult<C0236Status> canceledPendingResult() {
        C0244BasePendingResult basePendingResult;
        new C0266StatusPendingResult(Looper.getMainLooper());
        basePendingResult.cancel();
        return basePendingResult;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static <R extends C0231Result> C0225PendingResult<R> immediateFailedResult(@RecentlyNonNull R r, @RecentlyNonNull C0222GoogleApiClient googleApiClient) {
        C0244BasePendingResult basePendingResult;
        R r2 = r;
        Object checkNotNull = C0446Preconditions.checkNotNull(r2, "Result must not be null");
        C0446Preconditions.checkArgument(!r2.getStatus().isSuccess(), "Status code must not be SUCCESS");
        new C0381zaf(googleApiClient, r2);
        basePendingResult.setResult(r2);
        return basePendingResult;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static <R extends C0231Result> C0224OptionalPendingResult<R> immediatePendingResult(@RecentlyNonNull R r) {
        C0244BasePendingResult basePendingResult;
        C0224OptionalPendingResult<R> optionalPendingResult;
        R r2 = r;
        Object checkNotNull = C0446Preconditions.checkNotNull(r2, "Result must not be null");
        new C0382zag((C0222GoogleApiClient) null);
        basePendingResult.setResult(r2);
        new C0258OptionalPendingResultImpl(basePendingResult);
        return optionalPendingResult;
    }

    @RecentlyNonNull
    public static <R extends C0231Result> C0225PendingResult<R> canceledPendingResult(@RecentlyNonNull R r) {
        boolean z;
        C0244BasePendingResult basePendingResult;
        R r2 = r;
        Object checkNotNull = C0446Preconditions.checkNotNull(r2, "Result must not be null");
        if (r2.getStatus().getStatusCode() == 16) {
            z = true;
        } else {
            z = false;
        }
        C0446Preconditions.checkArgument(z, "Status code must be CommonStatusCodes.CANCELED");
        new C0380zae(r2);
        basePendingResult.cancel();
        return basePendingResult;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static <R extends C0231Result> C0224OptionalPendingResult<R> immediatePendingResult(@RecentlyNonNull R r, @RecentlyNonNull C0222GoogleApiClient googleApiClient) {
        C0244BasePendingResult basePendingResult;
        C0224OptionalPendingResult<R> optionalPendingResult;
        R r2 = r;
        Object checkNotNull = C0446Preconditions.checkNotNull(r2, "Result must not be null");
        new C0382zag(googleApiClient);
        basePendingResult.setResult(r2);
        new C0258OptionalPendingResultImpl(basePendingResult);
        return optionalPendingResult;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0225PendingResult<C0236Status> immediatePendingResult(@RecentlyNonNull C0236Status status) {
        C0244BasePendingResult basePendingResult;
        C0236Status status2 = status;
        Object checkNotNull = C0446Preconditions.checkNotNull(status2, "Result must not be null");
        new C0266StatusPendingResult(Looper.getMainLooper());
        basePendingResult.setResult(status2);
        return basePendingResult;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0225PendingResult<C0236Status> immediatePendingResult(@RecentlyNonNull C0236Status status, @RecentlyNonNull C0222GoogleApiClient googleApiClient) {
        C0244BasePendingResult basePendingResult;
        C0236Status status2 = status;
        Object checkNotNull = C0446Preconditions.checkNotNull(status2, "Result must not be null");
        new C0266StatusPendingResult(googleApiClient);
        basePendingResult.setResult(status2);
        return basePendingResult;
    }
}
