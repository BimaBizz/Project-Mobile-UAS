package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0227Releasable;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0232ResultCallback;
import com.google.android.gms.common.api.C0233ResultCallbacks;
import com.google.android.gms.common.api.C0234ResultTransform;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.C0237TransformedResult;
import com.google.android.gms.common.internal.C0446Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.zacv */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0346zacv<R extends C0231Result> extends C0237TransformedResult<R> implements C0232ResultCallback<R> {
    /* access modifiers changed from: private */
    @Nullable
    public C0234ResultTransform<? super R, ? extends C0231Result> zaa = null;
    /* access modifiers changed from: private */
    @Nullable
    public C0346zacv<? extends C0231Result> zab = null;
    @Nullable
    private volatile C0233ResultCallbacks<? super R> zac = null;
    @Nullable
    private C0225PendingResult<R> zad = null;
    /* access modifiers changed from: private */
    public final Object zae;
    @Nullable
    private C0236Status zaf;
    /* access modifiers changed from: private */
    public final WeakReference<C0222GoogleApiClient> zag;
    /* access modifiers changed from: private */
    public final C0345zacu zah;
    private boolean zai;

    public C0346zacv(WeakReference<C0222GoogleApiClient> weakReference) {
        Object obj;
        C0345zacu zacu;
        WeakReference<C0222GoogleApiClient> weakReference2 = weakReference;
        new Object();
        this.zae = obj;
        this.zaf = null;
        this.zai = false;
        Object checkNotNull = C0446Preconditions.checkNotNull(weakReference2, "GoogleApiClient reference must not be null");
        this.zag = weakReference2;
        C0222GoogleApiClient googleApiClient = (C0222GoogleApiClient) this.zag.get();
        zacu = new C0345zacu(this, googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.zah = r2;
    }

    static /* synthetic */ void zae(C0346zacv zacv, C0231Result result) {
        C0346zacv zacv2 = zacv;
        zan(result);
    }

    @GuardedBy("mSyncToken")
    private final void zaj() {
        if (this.zaa != null || this.zac != null) {
            C0222GoogleApiClient googleApiClient = (C0222GoogleApiClient) this.zag.get();
            if (!(this.zai || this.zaa == null || googleApiClient == null)) {
                googleApiClient.zao(this);
                this.zai = true;
            }
            C0236Status status = this.zaf;
            if (status != null) {
                zal(status);
                return;
            }
            C0225PendingResult<R> pendingResult = this.zad;
            if (pendingResult != null) {
                pendingResult.setResultCallback(this);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public final void zak(C0236Status status) {
        C0236Status status2 = status;
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
    private final void zal(C0236Status status) {
        C0236Status status2 = status;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                C0234ResultTransform<? super R, ? extends C0231Result> resultTransform = this.zaa;
                if (resultTransform != null) {
                    ((C0346zacv) C0446Preconditions.checkNotNull(this.zab)).zak((C0236Status) C0446Preconditions.checkNotNull(resultTransform.onFailure(status2), "onFailure must not return null"));
                } else if (zam()) {
                    ((C0233ResultCallbacks) C0446Preconditions.checkNotNull(this.zac)).onFailure(status2);
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
        return (this.zac == null || ((C0222GoogleApiClient) this.zag.get()) == null) ? false : true;
    }

    private static final void zan(C0231Result result) {
        StringBuilder sb;
        C0231Result result2 = result;
        if (result2 instanceof C0227Releasable) {
            try {
                ((C0227Releasable) result2).release();
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
    public final void andFinally(@NonNull C0233ResultCallbacks<? super R> resultCallbacks) {
        boolean z;
        boolean z2;
        C0233ResultCallbacks<? super R> resultCallbacks2 = resultCallbacks;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                if (this.zac == null) {
                    z = true;
                } else {
                    z = false;
                }
                C0446Preconditions.checkState(z, "Cannot call andFinally() twice.");
                if (this.zaa == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0446Preconditions.checkState(z2, "Cannot call then() and andFinally() on the same TransformedResult.");
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
                    ExecutorService zaa2 = C0334zacj.zaa();
                    new C0344zact(this, r2);
                    Future<?> submit = zaa2.submit(runnable);
                } else if (zam()) {
                    ((C0233ResultCallbacks) C0446Preconditions.checkNotNull(this.zac)).onSuccess(r2);
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
    public final <S extends C0231Result> C0237TransformedResult<S> then(@NonNull C0234ResultTransform<? super R, ? extends S> resultTransform) {
        boolean z;
        boolean z2;
        C0346zacv<? extends C0231Result> zacv;
        C0234ResultTransform<? super R, ? extends S> resultTransform2 = resultTransform;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                if (this.zaa == null) {
                    z = true;
                } else {
                    z = false;
                }
                C0446Preconditions.checkState(z, "Cannot call then() twice.");
                if (this.zac == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0446Preconditions.checkState(z2, "Cannot call then() and andFinally() on the same TransformedResult.");
                this.zaa = resultTransform2;
                new C0346zacv(this.zag);
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

    public final void zaa(C0225PendingResult<?> pendingResult) {
        C0225PendingResult<?> pendingResult2 = pendingResult;
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
