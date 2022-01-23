package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzac  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final /* synthetic */ class C0697zzac implements C0262RemoteCall {
    private final C0695zzaa zza;
    private final String zzb;

    C0697zzac(C0695zzaa zzaa, String str) {
        this.zza = zzaa;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        C0708zzj zzj;
        new C0699zzae(this.zza, (TaskCompletionSource) obj2);
        ((C0706zzh) ((C0722zzx) obj).getService()).zza(this.zzb, zzj);
    }
}
