package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class StatusPendingResult extends BasePendingResult<Status> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public StatusPendingResult(@RecentlyNonNull Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public final /* bridge */ /* synthetic */ Result createFailedResult(@RecentlyNonNull Status status) {
        return status;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    public StatusPendingResult(@RecentlyNonNull GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }
}
