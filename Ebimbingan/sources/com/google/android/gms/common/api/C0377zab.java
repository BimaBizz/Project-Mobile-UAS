package com.google.android.gms.common.api;

import com.google.android.gms.common.api.C0225PendingResult;

/* renamed from: com.google.android.gms.common.api.zab */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0377zab implements C0225PendingResult.StatusListener {
    final /* synthetic */ C0214Batch zaa;

    C0377zab(C0214Batch batch) {
        this.zaa = batch;
    }

    /* JADX INFO: finally extract failed */
    public final void onComplete(C0236Status status) {
        C0236Status status2;
        C0231Result result;
        C0236Status status3 = status;
        Object zaa2 = this.zaa.zai;
        synchronized (zaa2) {
            try {
                if (!this.zaa.isCanceled()) {
                    if (status3.isCanceled()) {
                        boolean zab = C0214Batch.zab(this.zaa, true);
                    } else if (!status3.isSuccess()) {
                        boolean zac = C0214Batch.zac(this.zaa, true);
                    }
                    int zad = C0214Batch.zad(this.zaa);
                    if (this.zaa.zae == 0) {
                        if (this.zaa.zag) {
                            C0377zab.super.cancel();
                        } else {
                            if (this.zaa.zaf) {
                                new C0236Status(13);
                            } else {
                                status2 = C0236Status.RESULT_SUCCESS;
                            }
                            C0214Batch batch = this.zaa;
                            new C0215BatchResult(status2, batch.zah);
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
