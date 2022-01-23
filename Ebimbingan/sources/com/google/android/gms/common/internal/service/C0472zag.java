package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;

/* renamed from: com.google.android.gms.common.internal.service.zag */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
abstract class C0472zag<R extends C0231Result> extends C0243BaseImplementation.ApiMethodImpl<R, C0473zah> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0472zag(C0222GoogleApiClient googleApiClient) {
        super((C0211Api<?>) C0465Common.API, googleApiClient);
    }
}
