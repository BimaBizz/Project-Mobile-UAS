package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zacv<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {
    /* access modifiers changed from: private */
    @Nullable
    public ResultTransform<? super R, ? extends Result> zaa = null;
    /* access modifiers changed from: private */
    @Nullable
    public zacv<? extends Result> zab = null;
    @Nullable
    private volatile ResultCallbacks<? super R> zac = null;
    @Nullable
    private PendingResult<R> zad = null;
    /* access modifiers changed from: private */
    public final Object zae;
    @Nullable
    private Status zaf;
    /* access modifiers changed from: private */
    public final WeakReference<GoogleApiClient> zag;
    /* access modifiers changed from: private */
    public final zacu zah;
    private boolean zai;

    public zacv(WeakReference<GoogleApiClient> weakReference) {
        Object obj;
        zacu zacu;
        WeakReference<GoogleApiClient> weakReference2 = weakReference;
        new Object();
        this.zae = obj;
        this.zaf = null;
        this.zai = false;
        Object checkNotNull = Preconditions.checkNotNull(weakReference2, "GoogleApiClient reference must not be null");
        this.zag = weakReference2;
        GoogleApiClient googleApiClient = (GoogleApiClient) this.zag.get();
        zacu = new zacu(this, googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.zah = r2;
    }

    static /* synthetic */ void zae(zacv zacv, Result result) {
        zacv zacv2 = zacv;
        zan(result);
    }

    @GuardedBy("mSyncToken")
    private final void zaj() {
        if (this.zaa != null || this.zac != null) {
            GoogleApiClient googleApiClient = (GoogleApiClient) this.zag.get();
            if (!(this.zai || this.zaa == null || googleApiClient == null)) {
                googleApiClient.zao(this);
                this.zai = true;
            }
            Status status = this.zaf;
            if (status != null) {
                zal(status);
                return;
            }
            PendingResult<R> pendingResult = this.zad;
            if (pendingResult != null) {
                pendingResult.setResultCallback(this);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public final void zak(Status status) {
        Status status2 = status;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                this.zaf = status2;
                zal(this.zaf);
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private final void zal(Status status) {
        Status status2 = status;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                ResultTransform<? super R, ? extends Result> resultTransform = this.zaa;
                if (resultTransform != null) {
                    ((zacv) Preconditions.checkNotNull(this.zab)).zak((Status) Preconditions.checkNotNull(resultTransform.onFailure(status2), "onFailure must not return null"));
                } else if (zam()) {
                    ((ResultCallbacks) Preconditions.checkNotNull(this.zac)).onFailure(status2);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    @GuardedBy("mSyncToken")
    private final boolean zam() {
        return (this.zac == null || ((GoogleApiClient) this.zag.get()) == null) ? false : true;
    }

    private static final void zan(Result result) {
        StringBuilder sb;
        Result result2 = result;
        if (result2 instanceof Releasable) {
            try {
                ((Releasable) result2).release();
            } catch (RuntimeException e) {
                RuntimeException runtimeException = e;
                String valueOf = String.valueOf(result2);
                new StringBuilder(String.valueOf(valueOf).length() + 18);
                StringBuilder append = sb.append("Unable to release ");
                StringBuilder append2 = sb.append(valueOf);
                int w = Log.w("TransformedResultImpl", sb.toString(), runtimeException);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void andFinally(@NonNull ResultCallbacks<? super R> resultCallbacks) {
        boolean z;
        boolean z2;
        ResultCallbacks<? super R> resultCallbacks2 = resultCallbacks;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                if (this.zac == null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "Cannot call andFinally() twice.");
                if (this.zaa == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Preconditions.checkState(z2, "Cannot call then() and andFinally() on the same TransformedResult.");
                this.zac = resultCallbacks2;
                zaj();
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onResult(R r) {
        Runnable runnable;
        R r2 = r;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                if (!r2.getStatus().isSuccess()) {
                    zak(r2.getStatus());
                    zan(r2);
                } else if (this.zaa != null) {
                    ExecutorService zaa2 = zacj.zaa();
                    new zact(this, r2);
                    Future<?> submit = zaa2.submit(runnable);
                } else if (zam()) {
                    ((ResultCallbacks) Preconditions.checkNotNull(this.zac)).onSuccess(r2);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform) {
        boolean z;
        boolean z2;
        zacv<? extends Result> zacv;
        ResultTransform<? super R, ? extends S> resultTransform2 = resultTransform;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                if (this.zaa == null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "Cannot call then() twice.");
                if (this.zac == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Preconditions.checkState(z2, "Cannot call then() and andFinally() on the same TransformedResult.");
                this.zaa = resultTransform2;
                new zacv(this.zag);
                this.zab = zacv;
                zaj();
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return zacv;
    }

    public final void zaa(PendingResult<?> pendingResult) {
        PendingResult<?> pendingResult2 = pendingResult;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                this.zad = pendingResult2;
                zaj();
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zab() {
        this.zac = null;
    }
}
