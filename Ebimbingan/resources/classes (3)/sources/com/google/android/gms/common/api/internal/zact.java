package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zact implements Runnable {
    final /* synthetic */ Result zaa;
    final /* synthetic */ zacv zab;

    zact(zacv zacv, Result result) {
        this.zab = zacv;
        this.zaa = result;
    }

    @WorkerThread
    public final void run() {
        try {
            BasePendingResult.zaa.set(true);
            boolean sendMessage = this.zab.zah.sendMessage(this.zab.zah.obtainMessage(0, ((ResultTransform) Preconditions.checkNotNull(this.zab.zaa)).onSuccess(this.zaa)));
            BasePendingResult.zaa.set(false);
            zacv.zae(this.zab, this.zaa);
            GoogleApiClient googleApiClient = (GoogleApiClient) this.zab.zag.get();
            if (googleApiClient != null) {
                googleApiClient.zap(this.zab);
            }
        } catch (RuntimeException e) {
            boolean sendMessage2 = this.zab.zah.sendMessage(this.zab.zah.obtainMessage(1, e));
            BasePendingResult.zaa.set(false);
            zacv.zae(this.zab, this.zaa);
            GoogleApiClient googleApiClient2 = (GoogleApiClient) this.zab.zag.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zap(this.zab);
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            BasePendingResult.zaa.set(false);
            zacv.zae(this.zab, this.zaa);
            GoogleApiClient googleApiClient3 = (GoogleApiClient) this.zab.zag.get();
            if (googleApiClient3 != null) {
                googleApiClient3.zap(this.zab);
            }
            throw th2;
        }
    }
}
