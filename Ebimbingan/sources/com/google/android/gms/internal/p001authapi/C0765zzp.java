package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;

/* renamed from: com.google.android.gms.internal.auth-api.zzp  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0765zzp extends C0757zzh {
    private C0243BaseImplementation.ResultHolder<C0236Status> zzaq;

    C0765zzp(C0243BaseImplementation.ResultHolder<C0236Status> resultHolder) {
        this.zzaq = resultHolder;
    }

    public final void zzd(C0236Status status) {
        this.zzaq.setResult(status);
    }
}
