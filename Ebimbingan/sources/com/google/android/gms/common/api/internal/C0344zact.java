package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0234ResultTransform;
import com.google.android.gms.common.internal.C0446Preconditions;

/* renamed from: com.google.android.gms.common.api.internal.zact */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0344zact implements Runnable {
    final /* synthetic */ C0231Result zaa;
    final /* synthetic */ C0346zacv zab;

    C0344zact(C0346zacv zacv, C0231Result result) {
        this.zab = zacv;
        this.zaa = result;
    }

    @WorkerThread
    public final void run() {
        try {
            C0244BasePendingResult.zaa.set(true);
            boolean sendMessage = this.zab.zah.sendMessage(this.zab.zah.obtainMessage(0, ((C0234ResultTransform) C0446Preconditions.checkNotNull(this.zab.zaa)).onSuccess(this.zaa)));
            C0244BasePendingResult.zaa.set(false);
            C0346zacv.zae(this.zab, this.zaa);
            C0222GoogleApiClient googleApiClient = (C0222GoogleApiClient) this.zab.zag.get();
            if (googleApiClient != null) {
                googleApiClient.zap(this.zab);
            }
        } catch (RuntimeException e) {
            boolean sendMessage2 = this.zab.zah.sendMessage(this.zab.zah.obtainMessage(1, e));
            C0244BasePendingResult.zaa.set(false);
            C0346zacv.zae(this.zab, this.zaa);
            C0222GoogleApiClient googleApiClient2 = (C0222GoogleApiClient) this.zab.zag.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zap(this.zab);
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            C0244BasePendingResult.zaa.set(false);
            C0346zacv.zae(this.zab, this.zaa);
            C0222GoogleApiClient googleApiClient3 = (C0222GoogleApiClient) this.zab.zag.get();
            if (googleApiClient3 != null) {
                googleApiClient3.zap(this.zab);
            }
            throw th2;
        }
    }
}
