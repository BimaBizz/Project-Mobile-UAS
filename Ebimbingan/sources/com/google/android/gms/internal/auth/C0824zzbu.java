package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.C0118ProxyResponse;
import com.google.android.gms.common.api.C0231Result;

/* renamed from: com.google.android.gms.internal.auth.zzbu */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0824zzbu extends C0811zzbh {
    private final /* synthetic */ C0825zzbv zza;

    C0824zzbu(C0825zzbv zzbv) {
        this.zza = zzbv;
    }

    public final void zza(C0118ProxyResponse proxyResponse) {
        C0231Result result;
        new C0829zzbz(proxyResponse);
        this.zza.setResult(result);
    }
}
