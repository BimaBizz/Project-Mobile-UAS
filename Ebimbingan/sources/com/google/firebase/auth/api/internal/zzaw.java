package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzaw implements C0262RemoteCall {
    private final zzax zzmu;

    zzaw(zzax zzax) {
        this.zzmu = zzax;
    }

    public final void accept(Object obj, Object obj2) {
        zzel<ResultT> zzel;
        zzdp zzdp = (zzdp) obj;
        zzax zzax = this.zzmu;
        zzax zzax2 = zzax;
        zzax zzax3 = zzax;
        new zzeu(zzax3, (TaskCompletionSource) obj2);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        zzax2.zzpu = zzel2;
        if (zzax3.zzqh) {
            zzdp.zzeb().zzc(zzax3.zzmv.getEmail(), zzax3.zzmv.getPassword(), (zzdu) zzax3.zzpq);
        } else {
            zzdp.zzeb().zza(zzax3.zzmv, (zzdu) zzax3.zzpq);
        }
    }
}
