package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.location.LocationServices;

abstract class zzai extends LocationServices.zza<C0236Status> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzai(C0222GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public /* synthetic */ C0231Result createFailedResult(C0236Status status) {
        return status;
    }
}
