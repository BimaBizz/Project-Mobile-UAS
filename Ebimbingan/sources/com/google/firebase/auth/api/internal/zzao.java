package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.C0238UnsupportedApiCallException;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class zzao implements Continuation<ResultT, Task<ResultT>> {
    private final /* synthetic */ zzan zzmj;
    private final /* synthetic */ zzap zzmk;

    zzao(zzap zzap, zzan zzan) {
        this.zzmk = zzap;
        this.zzmj = zzan;
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        Task task2 = task;
        if (task2.getException() instanceof C0238UnsupportedApiCallException) {
            return this.zzmk.zza(this.zzmj.zzdw());
        }
        return task2;
    }
}
