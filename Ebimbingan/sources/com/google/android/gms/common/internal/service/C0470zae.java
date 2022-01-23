package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;

/* renamed from: com.google.android.gms.common.internal.service.zae */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0470zae {
    public C0470zae() {
    }

    public final C0225PendingResult<C0236Status> zaa(C0222GoogleApiClient googleApiClient) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new C0468zac(this, googleApiClient2);
        return googleApiClient2.execute(apiMethodImpl);
    }
}
