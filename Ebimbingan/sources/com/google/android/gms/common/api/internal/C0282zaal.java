package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.internal.C0424BaseGmsClient;
import com.google.android.gms.common.internal.C0496zal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.zaal */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0282zaal extends C0287zaaq {
    final /* synthetic */ C0288zaar zaa;
    private final Map<C0211Api.Client, C0279zaai> zac;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0282zaal(com.google.android.gms.common.api.internal.C0288zaar r7, java.util.Map<com.google.android.gms.common.api.C0211Api.Client, com.google.android.gms.common.api.internal.C0279zaai> r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0282zaal.<init>(com.google.android.gms.common.api.internal.zaar, java.util.Map):void");
    }

    @GuardedBy("mLock")
    @WorkerThread
    public final void zaa() {
        C0496zal zal;
        List list;
        List list2;
        int i;
        C0299zabb zabb;
        C0184ConnectionResult connectionResult;
        C0299zabb zabb2;
        new C0496zal(this.zaa.zad);
        new ArrayList();
        new ArrayList();
        for (C0211Api.Client next : this.zac.keySet()) {
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
                i3 = zal.zaa(this.zaa.zac, (C0211Api.Client) list.get(i2));
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
                i5 = zal.zaa(this.zaa.zac, (C0211Api.Client) list2.get(i4));
                i4++;
                if (i5 == 0) {
                    i = i5;
                    break;
                }
            }
        }
        if (i != 0) {
            new C0184ConnectionResult(i, (PendingIntent) null);
            C0301zabd zal2 = this.zaa.zaa;
            new C0280zaaj(this, this.zaa, connectionResult);
            zal2.zar(zabb2);
            return;
        }
        if (this.zaa.zam && this.zaa.zak != null) {
            this.zaa.zak.zad();
        }
        for (C0211Api.Client next2 : this.zac.keySet()) {
            C0424BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = this.zac.get(next2);
            if (!next2.requiresGooglePlayServices() || zal.zaa(this.zaa.zac, next2) == 0) {
                next2.connect(connectionProgressReportCallbacks);
            } else {
                C0301zabd zal3 = this.zaa.zaa;
                new C0281zaak(this, this.zaa, connectionProgressReportCallbacks);
                zal3.zar(zabb);
            }
        }
    }
}
