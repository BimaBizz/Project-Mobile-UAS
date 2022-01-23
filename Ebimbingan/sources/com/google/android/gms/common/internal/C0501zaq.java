package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C0230Response;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.internal.C0445PendingResultUtil;

/* renamed from: com.google.android.gms.common.internal.zaq */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0501zaq implements C0445PendingResultUtil.ResultConverter {
    final /* synthetic */ C0230Response zaa;

    C0501zaq(C0230Response response) {
        this.zaa = response;
    }

    public final /* bridge */ /* synthetic */ Object convert(C0231Result result) {
        this.zaa.setResult(result);
        return this.zaa;
    }
}
