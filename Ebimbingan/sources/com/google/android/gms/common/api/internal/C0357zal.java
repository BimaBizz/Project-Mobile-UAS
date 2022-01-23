package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0213AvailabilityException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.zal */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0357zal {
    private final ArrayMap<C0241ApiKey<?>, C0184ConnectionResult> zaa;
    private final ArrayMap<C0241ApiKey<?>, String> zab;
    private final TaskCompletionSource<Map<C0241ApiKey<?>, String>> zac;
    private int zad;
    private boolean zae = false;

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0357zal(java.lang.Iterable<? extends com.google.android.gms.common.api.C0223HasApiKey<?>> r7) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r3 = r0
            r3.<init>()
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r2 = r3
            r3 = r2
            r3.<init>()
            r3 = r0
            r4 = r2
            r3.zab = r4
            com.google.android.gms.tasks.TaskCompletionSource r3 = new com.google.android.gms.tasks.TaskCompletionSource
            r2 = r3
            r3 = r2
            r3.<init>()
            r3 = r0
            r4 = r2
            r3.zac = r4
            r3 = r0
            r4 = 0
            r3.zae = r4
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r2 = r3
            r3 = r2
            r3.<init>()
            r3 = r0
            r4 = r2
            r3.zaa = r4
            r3 = r1
            java.util.Iterator r3 = r3.iterator()
            r1 = r3
        L_0x0031:
            r3 = r1
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L_0x0050
            r3 = r1
            java.lang.Object r3 = r3.next()
            r2 = r3
            r3 = r2
            com.google.android.gms.common.api.HasApiKey r3 = (com.google.android.gms.common.api.C0223HasApiKey) r3
            r2 = r3
            r3 = r0
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> r3 = r3.zaa
            r4 = r2
            com.google.android.gms.common.api.internal.ApiKey r4 = r4.getApiKey()
            r5 = 0
            java.lang.Object r3 = r3.put(r4, r5)
            goto L_0x0031
        L_0x0050:
            r3 = r0
            r4 = r0
            androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> r4 = r4.zaa
            java.util.Set r4 = r4.keySet()
            int r4 = r4.size()
            r3.zad = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0357zal.<init>(java.lang.Iterable):void");
    }

    public final Set<C0241ApiKey<?>> zaa() {
        return this.zaa.keySet();
    }

    public final Task<Map<C0241ApiKey<?>, String>> zab() {
        return this.zac.getTask();
    }

    public final void zac(C0241ApiKey<?> apiKey, C0184ConnectionResult connectionResult, @Nullable String str) {
        Exception exc;
        C0241ApiKey<?> apiKey2 = apiKey;
        C0184ConnectionResult connectionResult2 = connectionResult;
        C0184ConnectionResult put = this.zaa.put(apiKey2, connectionResult2);
        String put2 = this.zab.put(apiKey2, str);
        this.zad--;
        if (!connectionResult2.isSuccess()) {
            this.zae = true;
        }
        if (this.zad != 0) {
            return;
        }
        if (this.zae) {
            new C0213AvailabilityException(this.zaa);
            this.zac.setException(exc);
            return;
        }
        this.zac.setResult(this.zab);
    }
}
