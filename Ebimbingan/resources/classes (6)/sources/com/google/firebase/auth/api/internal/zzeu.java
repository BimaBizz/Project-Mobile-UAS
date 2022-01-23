package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

public final class zzeu<ResultT, CallbackT> implements zzel<ResultT> {
    private final zzen<ResultT, CallbackT> zzqs;
    private final TaskCompletionSource<ResultT> zzqt;

    public zzeu(zzen<ResultT, CallbackT> zzen, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zzqs = zzen;
        this.zzqt = taskCompletionSource;
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [com.google.firebase.auth.FirebaseAuthUserCollisionException, java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r4v10, types: [com.google.firebase.auth.zzu, java.lang.Exception] */
    public final void zza(ResultT resultt, Status status) {
        ResultT resultt2 = resultt;
        Status status2 = status;
        Object checkNotNull = Preconditions.checkNotNull(this.zzqt, "completion source cannot be null");
        if (status2 == null) {
            this.zzqt.setResult(resultt2);
        } else if (this.zzqs.zzqg != null) {
            this.zzqt.setException(zzdr.zza(FirebaseAuth.getInstance(this.zzqs.zzik), this.zzqs.zzqg));
        } else if (this.zzqs.zzqd != null) {
            this.zzqt.setException(zzdr.zza(status2, this.zzqs.zzqd, this.zzqs.zzqe, this.zzqs.zzqf));
        } else {
            this.zzqt.setException(zzdr.zzb(status2));
        }
    }
}
