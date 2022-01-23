package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzn  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final /* synthetic */ class C0712zzn implements C0262RemoteCall {
    private final C0710zzl zza;

    C0712zzn(C0710zzl zzl) {
        this.zza = zzl;
    }

    public final void accept(Object obj, Object obj2) {
        C0703zze zze;
        C0710zzl zzl = this.zza;
        new C0716zzr(zzl, (TaskCompletionSource) obj2);
        C0703zze zze2 = zze;
        ((C0706zzh) ((C0722zzx) obj).getService()).zza(zze2);
    }
}
