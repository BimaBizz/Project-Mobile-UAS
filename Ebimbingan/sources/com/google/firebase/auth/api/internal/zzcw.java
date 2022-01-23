package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.internal.firebase_auth.zzdr;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzcw implements C0262RemoteCall {
    private final zzcx zzoi;

    zzcw(zzcx zzcx) {
        this.zzoi = zzcx;
    }

    public final void accept(Object obj, Object obj2) {
        zzel<ResultT> zzel;
        zzdr zzdr;
        zzdp zzdp = (zzdp) obj;
        zzcx zzcx = this.zzoi;
        zzcx zzcx2 = zzcx;
        zzcx zzcx3 = zzcx;
        new zzeu(zzcx3, (TaskCompletionSource) obj2);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        zzcx2.zzpu = zzel2;
        if (zzcx3.zzqh) {
            zzdp.zzeb().zze(zzcx3.zzpr.zzcz(), zzcx3.zzpq);
            return;
        }
        new zzdr(zzcx3.zzpr.zzcz());
        zzdp.zzeb().zza(zzdr, (zzdu) zzcx3.zzpq);
    }
}
