package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zab implements PendingResult.StatusListener {
    final /* synthetic */ Batch zaa;

    zab(Batch batch) {
        this.zaa = batch;
    }

    /* JADX INFO: finally extract failed */
    public final void onComplete(Status status) {
        Status status2;
        Result result;
        Status status3 = status;
        Object zaa2 = this.zaa.zai;
        synchronized (zaa2) {
            try {
                if (!this.zaa.isCanceled()) {
                    if (status3.isCanceled()) {
                        boolean zab = Batch.zab(this.zaa, true);
                    } else if (!status3.isSuccess()) {
                        boolean zac = Batch.zac(this.zaa, true);
                    }
                    int zad = Batch.zad(this.zaa);
                    if (this.zaa.zae == 0) {
                        if (this.zaa.zag) {
                            zab.super.cancel();
                        } else {
                            if (this.zaa.zaf) {
                                new Status(13);
                            } else {
                                status2 = Status.RESULT_SUCCESS;
                            }
                            Batch batch = this.zaa;
                            new BatchResult(status2, batch.zah);
                            batch.setResult(result);
                        }
                    }
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj = zaa2;
                throw th2;
            }
        }
    }
}
