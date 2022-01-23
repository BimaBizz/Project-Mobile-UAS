package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.AsyncTaskLoader;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzd extends AsyncTaskLoader<Void> implements SignInConnectionListener {
    private Semaphore zzcg;
    private Set<GoogleApiClient> zzch;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzd(Context context, Set<GoogleApiClient> set) {
        super(context);
        Semaphore semaphore;
        new Semaphore(0);
        this.zzcg = semaphore;
        this.zzch = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzn */
    public final Void loadInBackground() {
        int i = 0;
        for (GoogleApiClient maybeSignIn : this.zzch) {
            if (maybeSignIn.maybeSignIn(this)) {
                i++;
            }
        }
        try {
            boolean tryAcquire = this.zzcg.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            int i2 = Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        int drainPermits = this.zzcg.drainPermits();
        forceLoad();
    }

    public final void onComplete() {
        this.zzcg.release();
    }
}
