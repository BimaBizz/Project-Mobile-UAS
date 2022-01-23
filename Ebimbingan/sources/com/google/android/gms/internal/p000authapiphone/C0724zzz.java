package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzz  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final /* synthetic */ class C0724zzz implements C0262RemoteCall {
    private final C0695zzaa zza;

    C0724zzz(C0695zzaa zzaa) {
        this.zza = zzaa;
    }

    public final void accept(Object obj, Object obj2) {
        C0708zzj zzj;
        new C0696zzab(this.zza, (TaskCompletionSource) obj2);
        ((C0706zzh) ((C0722zzx) obj).getService()).zza(zzj);
    }
}
