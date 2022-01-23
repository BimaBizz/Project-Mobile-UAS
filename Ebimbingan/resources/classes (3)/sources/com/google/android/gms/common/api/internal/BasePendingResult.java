package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    static final ThreadLocal<Boolean> zaa;
    public static final /* synthetic */ int zad = 0;
    @KeepName
    private zar mResultGuardian;
    @RecentlyNonNull
    protected final CallbackHandler<R> zab;
    @RecentlyNonNull
    protected final WeakReference<GoogleApiClient> zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList<PendingResult.StatusListener> zag;
    @Nullable
    private ResultCallback<? super R> zah;
    private final AtomicReference<zacw> zai;
    /* access modifiers changed from: private */
    @Nullable
    public R zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    @Nullable
    private ICancelToken zao;
    private volatile zacv<R> zap;
    private boolean zaq = false;

    static {
        ThreadLocal<Boolean> threadLocal;
        new zaq();
        zaa = threadLocal;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    BasePendingResult() {
        /*
            r4 = this;
            r0 = r4
            r2 = r0
            r2.<init>()
            java.lang.Object r2 = new java.lang.Object
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            r2.zae = r3
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r1 = r2
            r2 = r1
            r3 = 1
            r2.<init>(r3)
            r2 = r0
            r3 = r1
            r2.zaf = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            r2.zag = r3
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            r2.zai = r3
            r2 = r0
            r3 = 0
            r2.zaq = r3
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r2 = new com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler
            r1 = r2
            r2 = r1
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r2 = r0
            r3 = r1
            r2.zab = r3
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r1 = r2
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            r2 = r0
            r3 = r1
            r2.zac = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.<init>():void");
    }

    /* JADX INFO: finally extract failed */
    private final R zaa() {
        R r;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                Preconditions.checkState(!this.zal, "Result has already been consumed.");
                Preconditions.checkState(isReady(), "Result is not ready.");
                r = this.zaj;
                this.zaj = null;
                this.zah = null;
                this.zal = true;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Object obj2 = obj;
                    throw th2;
                }
            }
        }
        zacw andSet = this.zai.getAndSet((Object) null);
        if (andSet != null) {
            boolean remove = andSet.zaa.zab.remove(this);
        }
        return (Result) Preconditions.checkNotNull(r);
    }

    private final void zab(R r) {
        zar zar;
        R r2 = r;
        this.zaj = r2;
        this.zak = r2.getStatus();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            ResultCallback<? super R> resultCallback = this.zah;
            if (resultCallback != null) {
                this.zab.removeMessages(2);
                this.zab.zaa(resultCallback, zaa());
            } else if (this.zaj instanceof Releasable) {
                new zar(this, (zaq) null);
                this.mResultGuardian = zar;
            }
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.zag;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).onComplete(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(@Nullable Result result) {
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
                int w = Log.w("BasePendingResult", sb.toString(), runtimeException);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void addStatusListener(@RecentlyNonNull PendingResult.StatusListener statusListener) {
        boolean z;
        PendingResult.StatusListener statusListener2 = statusListener;
        if (statusListener2 != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Callback cannot be null.");
        Object obj = this.zae;
        synchronized (obj) {
            try {
                if (isReady()) {
                    statusListener2.onComplete(this.zak);
                } else {
                    boolean add = this.zag.add(statusListener2);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    @RecentlyNonNull
    public final R await() {
        boolean z;
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        Preconditions.checkState(!this.zal, "Result has already been consumed");
        if (this.zap == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException e) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return zaa();
    }

    /* JADX INFO: finally extract failed */
    @KeepForSdk
    public void cancel() {
        Object obj = this.zae;
        synchronized (obj) {
            try {
                if (!this.zam && !this.zal) {
                    ICancelToken iCancelToken = this.zao;
                    if (iCancelToken != null) {
                        try {
                            iCancelToken.cancel();
                        } catch (RemoteException e) {
                        }
                    }
                    zal(this.zaj);
                    this.zam = true;
                    zab(createFailedResult(Status.RESULT_CANCELED));
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    public abstract R createFailedResult(@RecentlyNonNull Status status);

    /* JADX INFO: finally extract failed */
    @KeepForSdk
    @Deprecated
    public final void forceFailureUnlessReady(@RecentlyNonNull Status status) {
        Status status2 = status;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status2));
                    this.zan = true;
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                z = this.zam;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return z;
    }

    @KeepForSdk
    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public final void setCancelToken(@RecentlyNonNull ICancelToken iCancelToken) {
        ICancelToken iCancelToken2 = iCancelToken;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                this.zao = iCancelToken2;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    @KeepForSdk
    public final void setResultCallback(@Nullable ResultCallback<? super R> resultCallback) {
        boolean z;
        ResultCallback<? super R> resultCallback2 = resultCallback;
        Object obj = this.zae;
        synchronized (obj) {
            if (resultCallback2 == null) {
                try {
                    this.zah = null;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj2 = obj;
                    throw th2;
                }
            } else {
                Preconditions.checkState(!this.zal, "Result has already been consumed.");
                if (this.zap == null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (!isCanceled()) {
                    if (isReady()) {
                        this.zab.zaa(resultCallback2, zaa());
                    } else {
                        this.zah = resultCallback2;
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @RecentlyNonNull
    public final <S extends Result> TransformedResult<S> then(@RecentlyNonNull ResultTransform<? super R, ? extends S> resultTransform) {
        boolean z;
        boolean z2;
        zacv<R> zacv;
        TransformedResult<S> then;
        ResultTransform<? super R, ? extends S> resultTransform2 = resultTransform;
        Preconditions.checkState(!this.zal, "Result has already been consumed.");
        Object obj = this.zae;
        synchronized (obj) {
            try {
                if (this.zap == null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "Cannot call then() twice.");
                if (this.zah == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Preconditions.checkState(z2, "Cannot call then() if callbacks are set.");
                Preconditions.checkState(!this.zam, "Cannot call then() if result was canceled.");
                this.zaq = true;
                new zacv(this.zac);
                this.zap = zacv;
                then = this.zap.then(resultTransform2);
                if (isReady()) {
                    this.zab.zaa(this.zap, zaa());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return then;
    }

    public final boolean zaj() {
        boolean isCanceled;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                if (((GoogleApiClient) this.zac.get()) == null || !this.zaq) {
                    cancel();
                }
                isCanceled = isCanceled();
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return isCanceled;
    }

    public final void zak() {
        this.zaq = !this.zaq ? zaa.get().booleanValue() : true;
    }

    public final void zan(@Nullable zacw zacw) {
        this.zai.set(zacw);
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class CallbackHandler<R extends Result> extends zap {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(@RecentlyNonNull Message message) {
            StringBuilder sb;
            Throwable th;
            Message message2 = message;
            switch (message2.what) {
                case 1:
                    Pair pair = (Pair) message2.obj;
                    ResultCallback resultCallback = (ResultCallback) pair.first;
                    Result result = (Result) pair.second;
                    try {
                        resultCallback.onResult(result);
                        return;
                    } catch (RuntimeException e) {
                        RuntimeException runtimeException = e;
                        BasePendingResult.zal(result);
                        throw runtimeException;
                    }
                case 2:
                    ((BasePendingResult) message2.obj).forceFailureUnlessReady(Status.RESULT_TIMEOUT);
                    return;
                default:
                    int i = message2.what;
                    new StringBuilder(45);
                    StringBuilder append = sb.append("Don't know how to handle message: ");
                    StringBuilder append2 = sb.append(i);
                    String sb2 = sb.toString();
                    new Exception();
                    int wtf = Log.wtf("BasePendingResult", sb2, th);
                    return;
            }
        }

        public final void zaa(@RecentlyNonNull ResultCallback<? super R> resultCallback, @RecentlyNonNull R r) {
            Object obj;
            int i = BasePendingResult.zad;
            new Pair((ResultCallback) Preconditions.checkNotNull(resultCallback), r);
            boolean sendMessage = sendMessage(obtainMessage(1, obj));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CallbackHandler(@RecentlyNonNull Looper looper) {
            super(looper);
        }
    }

    /* JADX INFO: finally extract failed */
    @KeepForSdk
    public final void setResult(@RecentlyNonNull R r) {
        R r2 = r;
        Object obj = this.zae;
        synchronized (obj) {
            try {
                if (this.zan || this.zam) {
                    zal(r2);
                    return;
                }
                boolean isReady = isReady();
                Preconditions.checkState(!isReady(), "Results have already been set");
                Preconditions.checkState(!this.zal, "Result has already been consumed");
                zab(r2);
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected BasePendingResult(@androidx.annotation.RecentlyNonNull android.os.Looper r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r3 = r0
            r3.<init>()
            java.lang.Object r3 = new java.lang.Object
            r2 = r3
            r3 = r2
            r3.<init>()
            r3 = r0
            r4 = r2
            r3.zae = r4
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r2 = r3
            r3 = r2
            r4 = 1
            r3.<init>(r4)
            r3 = r0
            r4 = r2
            r3.zaf = r4
            java.util.ArrayList r3 = new java.util.ArrayList
            r2 = r3
            r3 = r2
            r3.<init>()
            r3 = r0
            r4 = r2
            r3.zag = r4
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r2 = r3
            r3 = r2
            r3.<init>()
            r3 = r0
            r4 = r2
            r3.zai = r4
            r3 = r0
            r4 = 0
            r3.zaq = r4
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r3 = new com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler
            r2 = r3
            r3 = r2
            r4 = r1
            r3.<init>(r4)
            r3 = r0
            r4 = r2
            r3.zab = r4
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r1 = r3
            r3 = r1
            r4 = 0
            r3.<init>(r4)
            r3 = r0
            r4 = r1
            r3.zac = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.<init>(android.os.Looper):void");
    }

    @RecentlyNonNull
    public final R await(long j, @RecentlyNonNull TimeUnit timeUnit) {
        boolean z;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        if (j2 > 0) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        Preconditions.checkState(!this.zal, "Result has already been consumed.");
        if (this.zap == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j2, timeUnit2)) {
                forceFailureUnlessReady(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException e) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return zaa();
    }

    @KeepForSdk
    public final void setResultCallback(@RecentlyNonNull ResultCallback<? super R> resultCallback, long j, @RecentlyNonNull TimeUnit timeUnit) {
        boolean z;
        ResultCallback<? super R> resultCallback2 = resultCallback;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        Object obj = this.zae;
        synchronized (obj) {
            if (resultCallback2 == null) {
                try {
                    this.zah = null;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj2 = obj;
                    throw th2;
                }
            } else {
                Preconditions.checkState(!this.zal, "Result has already been consumed.");
                if (this.zap == null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (!isCanceled()) {
                    if (isReady()) {
                        this.zab.zaa(resultCallback2, zaa());
                    } else {
                        this.zah = resultCallback2;
                        CallbackHandler<R> callbackHandler = this.zab;
                        boolean sendMessageDelayed = callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit2.toMillis(j2));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected BasePendingResult(@androidx.annotation.Nullable com.google.android.gms.common.api.GoogleApiClient r7) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r4 = r0
            r4.<init>()
            java.lang.Object r4 = new java.lang.Object
            r2 = r4
            r4 = r2
            r4.<init>()
            r4 = r0
            r5 = r2
            r4.zae = r5
            java.util.concurrent.CountDownLatch r4 = new java.util.concurrent.CountDownLatch
            r2 = r4
            r4 = r2
            r5 = 1
            r4.<init>(r5)
            r4 = r0
            r5 = r2
            r4.zaf = r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r2 = r4
            r4 = r2
            r4.<init>()
            r4 = r0
            r5 = r2
            r4.zag = r5
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r2 = r4
            r4 = r2
            r4.<init>()
            r4 = r0
            r5 = r2
            r4.zai = r5
            r4 = r0
            r5 = 0
            r4.zaq = r5
            r4 = r1
            if (r4 == 0) goto L_0x0059
            r4 = r1
            android.os.Looper r4 = r4.getLooper()
            r2 = r4
        L_0x0040:
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r4 = new com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler
            r3 = r4
            r4 = r3
            r5 = r2
            r4.<init>(r5)
            r4 = r0
            r5 = r3
            r4.zab = r5
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r2 = r4
            r4 = r2
            r5 = r1
            r4.<init>(r5)
            r4 = r0
            r5 = r2
            r4.zac = r5
            return
        L_0x0059:
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r2 = r4
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.<init>(com.google.android.gms.common.api.GoogleApiClient):void");
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.annotation.KeepForSdk
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected BasePendingResult(@androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<R> r7) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r3 = r0
            r3.<init>()
            java.lang.Object r3 = new java.lang.Object
            r2 = r3
            r3 = r2
            r3.<init>()
            r3 = r0
            r4 = r2
            r3.zae = r4
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r2 = r3
            r3 = r2
            r4 = 1
            r3.<init>(r4)
            r3 = r0
            r4 = r2
            r3.zaf = r4
            java.util.ArrayList r3 = new java.util.ArrayList
            r2 = r3
            r3 = r2
            r3.<init>()
            r3 = r0
            r4 = r2
            r3.zag = r4
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r2 = r3
            r3 = r2
            r3.<init>()
            r3 = r0
            r4 = r2
            r3.zai = r4
            r3 = r0
            r4 = 0
            r3.zaq = r4
            r3 = r0
            r4 = r1
            java.lang.String r5 = "CallbackHandler must not be null"
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r5)
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r4 = (com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler) r4
            r3.zab = r4
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r1 = r3
            r3 = r1
            r4 = 0
            r3.<init>(r4)
            r3 = r0
            r4 = r1
            r3.zac = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.<init>(com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler):void");
    }
}
