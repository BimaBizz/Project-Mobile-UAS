package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.common.internal.service.zaf */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
abstract class C0471zaf extends C0472zag<C0236Status> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0471zaf(C0222GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public final /* bridge */ /* synthetic */ C0231Result createFailedResult(C0236Status status) {
        return status;
    }
}
