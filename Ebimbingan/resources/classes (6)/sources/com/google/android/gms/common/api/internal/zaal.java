package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaal extends zaaq {
    final /* synthetic */ zaar zaa;
    private final Map<Api.Client, zaai> zac;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zaal(com.google.android.gms.common.api.internal.zaar r7, java.util.Map<com.google.android.gms.common.api.Api.Client, com.google.android.gms.common.api.internal.zaai> r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaal.<init>(com.google.android.gms.common.api.internal.zaar, java.util.Map):void");
    }

    @GuardedBy("mLock")
    @WorkerThread
    public final void zaa() {
        zal zal;
        List list;
        List list2;
        int i;
        zabb zabb;
        ConnectionResult connectionResult;
        zabb zabb2;
        new zal(this.zaa.zad);
        new ArrayList();
        new ArrayList();
        for (Api.Client next : this.zac.keySet()) {
            if (!next.requiresGooglePlayServices() || this.zac.get(next).zac) {
                boolean add = list2.add(next);
            } else {
                boolean add2 = list.add(next);
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            int i2 = 0;
            int i3 = -1;
            while (true) {
                if (i2 >= size) {
                    i = i3;
                    break;
                }
                i3 = zal.zaa(this.zaa.zac, (Api.Client) list.get(i2));
                i2++;
                if (i3 != 0) {
                    i = i3;
                    break;
                }
            }
        } else {
            int size2 = list2.size();
            int i4 = 0;
            int i5 = -1;
            while (true) {
                if (i4 >= size2) {
                    i = i5;
                    break;
                }
                i5 = zal.zaa(this.zaa.zac, (Api.Client) list2.get(i4));
                i4++;
                if (i5 == 0) {
                    i = i5;
                    break;
                }
            }
        }
        if (i != 0) {
            new ConnectionResult(i, (PendingIntent) null);
            zabd zal2 = this.zaa.zaa;
            new zaaj(this, this.zaa, connectionResult);
            zal2.zar(zabb2);
            return;
        }
        if (this.zaa.zam && this.zaa.zak != null) {
            this.zaa.zak.zad();
        }
        for (Api.Client next2 : this.zac.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = this.zac.get(next2);
            if (!next2.requiresGooglePlayServices() || zal.zaa(this.zaa.zac, next2) == 0) {
                next2.connect(connectionProgressReportCallbacks);
            } else {
                zabd zal3 = this.zaa.zaa;
                new zaak(this, this.zaa, connectionProgressReportCallbacks);
                zal3.zar(zabb);
            }
        }
    }
}
