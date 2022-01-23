package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaam extends zaaq {
    final /* synthetic */ zaar zaa;
    private final ArrayList<Api.Client> zac;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zaam(com.google.android.gms.common.api.internal.zaar r7, java.util.ArrayList<com.google.android.gms.common.api.Api.Client> r8) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r0
            r4 = r1
            r3.zaa = r4
            r3 = r0
            r4 = r1
            r5 = 0
            r3.<init>(r4, r5)
            r3 = r0
            r4 = r2
            r3.zac = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaam.<init>(com.google.android.gms.common.api.internal.zaar, java.util.ArrayList):void");
    }

    @WorkerThread
    public final void zaa() {
        this.zaa.zaa.zag.zad = zaar.zap(this.zaa);
        ArrayList<Api.Client> arrayList = this.zac;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).getRemoteService(this.zaa.zao, this.zaa.zaa.zag.zad);
        }
    }
}
