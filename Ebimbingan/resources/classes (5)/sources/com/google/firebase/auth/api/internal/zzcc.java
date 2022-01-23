package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.firebase_auth.zzcp;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzcc implements RemoteCall {
    private final zzcd zzns;

    zzcc(zzcd zzcd) {
        this.zzns = zzcd;
    }

    public final void accept(Object obj, Object obj2) {
        zzel<ResultT> zzel;
        zzcp zzcp;
        zzdp zzdp = (zzdp) obj;
        zzcd zzcd = this.zzns;
        zzcd zzcd2 = zzcd;
        zzcd zzcd3 = zzcd;
        new zzeu(zzcd3, (TaskCompletionSource) obj2);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        zzcd2.zzpu = zzel2;
        if (zzcd3.zzqh) {
            zzdp.zzeb().zzf(zzcd3.zzpr.zzcz(), zzcd3.zzpq);
            return;
        }
        new zzcp(zzcd3.zzpr.zzcz());
        zzdp.zzeb().zza(zzcp, (zzdu) zzcd3.zzpq);
    }
}
