package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.internal.C0244BasePendingResult;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.api.Batch */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0214Batch extends C0244BasePendingResult<C0215BatchResult> {
    /* access modifiers changed from: private */
    public int zae;
    /* access modifiers changed from: private */
    public boolean zaf;
    /* access modifiers changed from: private */
    public boolean zag;
    /* access modifiers changed from: private */
    public final C0225PendingResult<?>[] zah;
    /* access modifiers changed from: private */
    public final Object zai;

    /* renamed from: com.google.android.gms.common.api.Batch$Builder */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static final class Builder {
        private List<C0225PendingResult<?>> zaa;
        private C0222GoogleApiClient zab;

        public Builder(@RecentlyNonNull C0222GoogleApiClient googleApiClient) {
            List<C0225PendingResult<?>> list;
            new ArrayList();
            this.zaa = list;
            this.zab = googleApiClient;
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <R extends com.google.android.gms.common.api.C0231Result> com.google.android.gms.common.api.C0216BatchResultToken<R> add(@androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.C0225PendingResult<R> r6) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C0214Batch.Builder.add(com.google.android.gms.common.api.PendingResult):com.google.android.gms.common.api.BatchResultToken");
        }

        @RecentlyNonNull
        public C0214Batch build() {
            C0214Batch batch;
            new C0214Batch(this.zaa, this.zab, (C0377zab) null);
            return batch;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* synthetic */ C0214Batch(List list, C0222GoogleApiClient googleApiClient, C0377zab zab) {
        super(googleApiClient);
        Object obj;
        C0231Result result;
        C0225PendingResult.StatusListener statusListener;
        List list2 = list;
        C0377zab zab2 = zab;
        new Object();
        this.zai = obj;
        int size = list2.size();
        this.zae = size;
        this.zah = new C0225PendingResult[size];
        if (!list2.isEmpty()) {
            for (int i = 0; i < list2.size(); i++) {
                C0225PendingResult pendingResult = (C0225PendingResult) list2.get(i);
                this.zah[i] = pendingResult;
                new C0377zab(this);
                pendingResult.addStatusListener(statusListener);
            }
            return;
        }
        new C0215BatchResult(C0236Status.RESULT_SUCCESS, this.zah);
        setResult(result);
    }

    static /* synthetic */ boolean zab(C0214Batch batch, boolean z) {
        boolean z2 = z;
        batch.zag = true;
        return true;
    }

    static /* synthetic */ boolean zac(C0214Batch batch, boolean z) {
        boolean z2 = z;
        batch.zaf = true;
        return true;
    }

    static /* synthetic */ int zad(C0214Batch batch) {
        C0214Batch batch2 = batch;
        int i = batch2.zae;
        batch2.zae = i - 1;
        return i;
    }

    public void cancel() {
        super.cancel();
        C0225PendingResult<?>[] pendingResultArr = this.zah;
        int length = pendingResultArr.length;
        for (int i = 0; i < length; i++) {
            pendingResultArr[i].cancel();
        }
    }

    @RecentlyNonNull
    public C0215BatchResult createFailedResult(@RecentlyNonNull C0236Status status) {
        C0215BatchResult batchResult;
        new C0215BatchResult(status, this.zah);
        return batchResult;
    }
}
