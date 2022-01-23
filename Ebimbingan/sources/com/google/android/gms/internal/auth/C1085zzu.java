package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth.zzu */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class C1085zzu implements C0262RemoteCall {
    private final C1084zzt zza;
    private final String zzb;

    C1085zzu(C1084zzt zzt, String str) {
        this.zza = zzt;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        C1073zzl zzl;
        C1084zzt zzt = this.zza;
        String str = this.zzb;
        C1084zzt zzt2 = zzt;
        new C0777zzaa(zzt2, (TaskCompletionSource) obj2);
        ((C1082zzr) ((C0992zzi) obj).getService()).zza(zzl, str);
    }
}
