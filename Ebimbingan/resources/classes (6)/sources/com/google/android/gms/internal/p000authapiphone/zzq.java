package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzq  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final /* synthetic */ class zzq implements RemoteCall {
    private final zzl zza;
    private final String zzb;

    zzq(zzl zzl, String str) {
        this.zza = zzl;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        zzf zzf;
        zzl zzl = this.zza;
        String str = this.zzb;
        new zzu(zzl, (TaskCompletionSource) obj2);
        zzf zzf2 = zzf;
        ((zzh) ((zzx) obj).getService()).zza(str, zzf2);
    }
}
