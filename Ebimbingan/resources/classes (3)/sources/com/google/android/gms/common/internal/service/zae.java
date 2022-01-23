package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zae {
    public zae() {
    }

    public final PendingResult<Status> zaa(GoogleApiClient googleApiClient) {
        BaseImplementation.ApiMethodImpl apiMethodImpl;
        GoogleApiClient googleApiClient2 = googleApiClient;
        new zac(this, googleApiClient2);
        return googleApiClient2.execute(apiMethodImpl);
    }
}
