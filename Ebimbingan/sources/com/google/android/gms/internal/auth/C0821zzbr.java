package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth.zzbr */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class C0821zzbr implements C0262RemoteCall {
    private final C0819zzbp zza;

    C0821zzbr(C0819zzbp zzbp) {
        this.zza = zzbp;
    }

    public final void accept(Object obj, Object obj2) {
        C0813zzbj zzbj;
        C0819zzbp zzbp = this.zza;
        new C0823zzbt(zzbp, (TaskCompletionSource) obj2);
        C0813zzbj zzbj2 = zzbj;
        ((C0815zzbl) ((C0810zzbg) obj).getService()).zza(zzbj2);
    }
}
