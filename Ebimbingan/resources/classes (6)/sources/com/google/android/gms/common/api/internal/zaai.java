package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaai implements BaseGmsClient.ConnectionProgressReportCallbacks {
    private final WeakReference<zaar> zaa;
    private final Api<?> zab;
    /* access modifiers changed from: private */
    public final boolean zac;

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zaai(com.google.android.gms.common.api.internal.zaar r8, com.google.android.gms.common.api.Api<?> r9, boolean r10) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r0
            r5.<init>()
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r4 = r5
            r5 = r4
            r6 = r1
            r5.<init>(r6)
            r5 = r0
            r6 = r4
            r5.zaa = r6
            r5 = r0
            r6 = r2
            r5.zab = r6
            r5 = r0
            r6 = r3
            r5.zac = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaai.<init>(com.google.android.gms.common.api.internal.zaar, com.google.android.gms.common.api.Api, boolean):void");
    }

    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        boolean z;
        ConnectionResult connectionResult2 = connectionResult;
        zaar zaar = (zaar) this.zaa.get();
        if (zaar != null) {
            if (Looper.myLooper() == zaar.zaa.zag.getLooper()) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zaar.zab.lock();
            try {
                if (!zaar.zav(zaar, 0)) {
                    zaar.zab.unlock();
                    return;
                }
                if (!connectionResult2.isSuccess()) {
                    zaar.zaC(connectionResult2, this.zab, this.zac);
                }
                if (zaar.zaz()) {
                    zaar.zaA();
                }
                zaar.zab.unlock();
            } catch (Throwable th) {
                Throwable th2 = th;
                zaar.zab.unlock();
                throw th2;
            }
        }
    }
}
