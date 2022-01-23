package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class Batch extends BasePendingResult<BatchResult> {
    /* access modifiers changed from: private */
    public int zae;
    /* access modifiers changed from: private */
    public boolean zaf;
    /* access modifiers changed from: private */
    public boolean zag;
    /* access modifiers changed from: private */
    public final PendingResult<?>[] zah;
    /* access modifiers changed from: private */
    public final Object zai;

    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static final class Builder {
        private List<PendingResult<?>> zaa;
        private GoogleApiClient zab;

        public Builder(@RecentlyNonNull GoogleApiClient googleApiClient) {
            List<PendingResult<?>> list;
            new ArrayList();
            this.zaa = list;
            this.zab = googleApiClient;
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.BatchResultToken<R> add(@androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.PendingResult<R> r6) {
            /*
                r5 = this;
                r0 = r5
                r1 = r6
                com.google.android.gms.common.api.BatchResultToken r3 = new com.google.android.gms.common.api.BatchResultToken
                r2 = r3
                r3 = r2
                r4 = r0
                java.util.List<com.google.android.gms.common.api.PendingResult<?>> r4 = r4.zaa
                int r4 = r4.size()
                r3.<init>(r4)
                r3 = r0
                java.util.List<com.google.android.gms.common.api.PendingResult<?>> r3 = r3.zaa
                r4 = r1
                boolean r3 = r3.add(r4)
                r3 = r2
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.Batch.Builder.add(com.google.android.gms.common.api.PendingResult):com.google.android.gms.common.api.BatchResultToken");
        }

        @RecentlyNonNull
        public Batch build() {
            Batch batch;
            new Batch(this.zaa, this.zab, (zab) null);
            return batch;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* synthetic */ Batch(List list, GoogleApiClient googleApiClient, zab zab) {
        super(googleApiClient);
        Object obj;
        Result result;
        PendingResult.StatusListener statusListener;
        List list2 = list;
        zab zab2 = zab;
        new Object();
        this.zai = obj;
        int size = list2.size();
        this.zae = size;
        this.zah = new PendingResult[size];
        if (!list2.isEmpty()) {
            for (int i = 0; i < list2.size(); i++) {
                PendingResult pendingResult = (PendingResult) list2.get(i);
                this.zah[i] = pendingResult;
                new zab(this);
                pendingResult.addStatusListener(statusListener);
            }
            return;
        }
        new BatchResult(Status.RESULT_SUCCESS, this.zah);
        setResult(result);
    }

    static /* synthetic */ boolean zab(Batch batch, boolean z) {
        boolean z2 = z;
        batch.zag = true;
        return true;
    }

    static /* synthetic */ boolean zac(Batch batch, boolean z) {
        boolean z2 = z;
        batch.zaf = true;
        return true;
    }

    static /* synthetic */ int zad(Batch batch) {
        Batch batch2 = batch;
        int i = batch2.zae;
        batch2.zae = i - 1;
        return i;
    }

    public void cancel() {
        super.cancel();
        PendingResult<?>[] pendingResultArr = this.zah;
        int length = pendingResultArr.length;
        for (int i = 0; i < length; i++) {
            pendingResultArr[i].cancel();
        }
    }

    @RecentlyNonNull
    public BatchResult createFailedResult(@RecentlyNonNull Status status) {
        BatchResult batchResult;
        new BatchResult(status, this.zah);
        return batchResult;
    }
}
