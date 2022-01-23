package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class zzu implements RemoteCall {
    private final zzt zza;
    private final String zzb;

    zzu(zzt zzt, String str) {
        this.zza = zzt;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        zzl zzl;
        zzt zzt = this.zza;
        String str = this.zzb;
        zzt zzt2 = zzt;
        new zzaa(zzt2, (TaskCompletionSource) obj2);
        ((zzr) ((zzi) obj).getService()).zza(zzl, str);
    }
}
