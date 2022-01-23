package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.StatusPendingResult */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0266StatusPendingResult extends C0244BasePendingResult<C0236Status> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public C0266StatusPendingResult(@RecentlyNonNull Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public final /* bridge */ /* synthetic */ C0231Result createFailedResult(@RecentlyNonNull C0236Status status) {
        return status;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C0206KeepForSdk
    public C0266StatusPendingResult(@RecentlyNonNull C0222GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }
}
