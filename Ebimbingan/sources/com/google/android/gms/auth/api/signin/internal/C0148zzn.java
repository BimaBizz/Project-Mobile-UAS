package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.C0031Auth;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zzn */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
abstract class C0148zzn<R extends C0231Result> extends C0243BaseImplementation.ApiMethodImpl<R, C0140zzf> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0148zzn(C0222GoogleApiClient googleApiClient) {
        super((C0211Api<?>) C0031Auth.GOOGLE_SIGN_IN_API, googleApiClient);
    }

    @C0206KeepForSdk
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((C0231Result) obj);
    }
}
