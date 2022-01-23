package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.internal.firebase_auth.zzbz;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzay implements C0262RemoteCall {
    private final zzaz zzmw;

    zzay(zzaz zzaz) {
        this.zzmw = zzaz;
    }

    public final void accept(Object obj, Object obj2) {
        zzel<ResultT> zzel;
        zzbz zzbz;
        zzdp zzdp = (zzdp) obj;
        zzaz zzaz = this.zzmw;
        zzaz zzaz2 = zzaz;
        zzaz zzaz3 = zzaz;
        new zzeu(zzaz3, (TaskCompletionSource) obj2);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        zzaz2.zzpu = zzel2;
        if (zzaz3.zzqh) {
            zzdp.zzeb().zzg(zzaz3.zzpr.zzcz(), zzaz3.zzpq);
            return;
        }
        new zzbz(zzaz3.zzpr.zzcz());
        zzdp.zzeb().zza(zzbz, (zzdu) zzaz3.zzpq);
    }
}
