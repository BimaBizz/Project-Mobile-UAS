package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.internal.C0250IStatusCallback;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzo  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final /* synthetic */ class C0713zzo implements C0262RemoteCall {
    private final C0710zzl zza;

    C0713zzo(C0710zzl zzl) {
        this.zza = zzl;
    }

    public final void accept(Object obj, Object obj2) {
        C0250IStatusCallback iStatusCallback;
        C0710zzl zzl = this.zza;
        new C0717zzs(zzl, (TaskCompletionSource) obj2);
        C0250IStatusCallback iStatusCallback2 = iStatusCallback;
        ((C0706zzh) ((C0722zzx) obj).getService()).zza(iStatusCallback2);
    }
}
