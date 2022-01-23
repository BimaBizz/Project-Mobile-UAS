package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzq  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final /* synthetic */ class C0715zzq implements C0262RemoteCall {
    private final C0710zzl zza;
    private final String zzb;

    C0715zzq(C0710zzl zzl, String str) {
        this.zza = zzl;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        C0704zzf zzf;
        C0710zzl zzl = this.zza;
        String str = this.zzb;
        new C0719zzu(zzl, (TaskCompletionSource) obj2);
        C0704zzf zzf2 = zzf;
        ((C0706zzh) ((C0722zzx) obj).getService()).zza(str, zzf2);
    }
}
