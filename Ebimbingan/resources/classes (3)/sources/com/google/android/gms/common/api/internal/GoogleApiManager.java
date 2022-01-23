package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.zal;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class GoogleApiManager implements Handler.Callback {
    @RecentlyNonNull
    public static final Status zaa;
    /* access modifiers changed from: private */
    public static final Status zab;
    /* access modifiers changed from: private */
    public static final Object zag;
    @GuardedBy("lock")
    @Nullable
    private static GoogleApiManager zaj;
    /* access modifiers changed from: private */
    public long zac = 5000;
    /* access modifiers changed from: private */
    public long zad = 120000;
    /* access modifiers changed from: private */
    public long zae = 10000;
    private boolean zaf = false;
    @Nullable
    private TelemetryData zah;
    @Nullable
    private TelemetryLoggingClient zai;
    /* access modifiers changed from: private */
    public final Context zak;
    /* access modifiers changed from: private */
    public final GoogleApiAvailability zal;
    /* access modifiers changed from: private */
    public final zal zam;
    private final AtomicInteger zan;
    private final AtomicInteger zao;
    /* access modifiers changed from: private */
    public final Map<ApiKey<?>, zabl<?>> zap;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    @Nullable
    public zaab zaq;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public final Set<ApiKey<?>> zar;
    private final Set<ApiKey<?>> zas;
    /* access modifiers changed from: private */
    @NotOnlyInitialized
    public final Handler zat;
    /* access modifiers changed from: private */
    public volatile boolean zau;

    static {
        Status status;
        Status status2;
        Object obj;
        new Status(4, "Sign-out occurred while this API call was in progress.");
        zaa = status;
        new Status(4, "The user must be signed in to make this API call.");
        zab = status2;
        new Object();
        zag = obj;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private GoogleApiManager(android.content.Context r10, android.os.Looper r11, com.google.android.gms.common.GoogleApiAvailability r12) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r0
            r5.<init>()
            r5 = r0
            r6 = 5000(0x1388, double:2.4703E-320)
            r5.zac = r6
            r5 = r0
            r6 = 120000(0x1d4c0, double:5.9288E-319)
            r5.zad = r6
            r5 = r0
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.zae = r6
            r5 = r0
            r6 = 0
            r5.zaf = r6
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r4 = r5
            r5 = r4
            r6 = 1
            r5.<init>(r6)
            r5 = r0
            r6 = r4
            r5.zan = r6
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r4 = r5
            r5 = r4
            r6 = 0
            r5.<init>(r6)
            r5 = r0
            r6 = r4
            r5.zao = r6
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap
            r4 = r5
            r5 = r4
            r6 = 5
            r7 = 1061158912(0x3f400000, float:0.75)
            r8 = 1
            r5.<init>(r6, r7, r8)
            r5 = r0
            r6 = r4
            r5.zap = r6
            r5 = r0
            r6 = 0
            r5.zaq = r6
            androidx.collection.ArraySet r5 = new androidx.collection.ArraySet
            r4 = r5
            r5 = r4
            r5.<init>()
            r5 = r0
            r6 = r4
            r5.zar = r6
            androidx.collection.ArraySet r5 = new androidx.collection.ArraySet
            r4 = r5
            r5 = r4
            r5.<init>()
            r5 = r0
            r6 = r4
            r5.zas = r6
            r5 = r0
            r6 = 1
            r5.zau = r6
            r5 = r0
            r6 = r1
            r5.zak = r6
            com.google.android.gms.internal.base.zap r5 = new com.google.android.gms.internal.base.zap
            r4 = r5
            r5 = r4
            r6 = r2
            r7 = r0
            r5.<init>(r6, r7)
            r5 = r0
            r6 = r4
            r5.zat = r6
            r5 = r0
            r6 = r3
            r5.zal = r6
            com.google.android.gms.common.internal.zal r5 = new com.google.android.gms.common.internal.zal
            r2 = r5
            r5 = r2
            r6 = r3
            r5.<init>(r6)
            r5 = r0
            r6 = r2
            r5.zam = r6
            r5 = r1
            boolean r5 = com.google.android.gms.common.util.DeviceProperties.isAuto((android.content.Context) r5)
            if (r5 == 0) goto L_0x008d
            r5 = r0
            r6 = 0
            r5.zau = r6
        L_0x008d:
            r5 = r0
            android.os.Handler r5 = r5.zat
            r0 = r5
            r5 = r0
            r6 = r0
            r7 = 6
            android.os.Message r6 = r6.obtainMessage(r7)
            boolean r5 = r5.sendMessage(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.GoogleApiManager.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.GoogleApiAvailability):void");
    }

    /* JADX INFO: finally extract failed */
    @KeepForSdk
    public static void reportSignOut() {
        Object obj = zag;
        synchronized (obj) {
            try {
                if (zaj != null) {
                    GoogleApiManager googleApiManager = zaj;
                    int incrementAndGet = googleApiManager.zao.incrementAndGet();
                    Handler handler = googleApiManager.zat;
                    boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    static /* synthetic */ boolean zaA(GoogleApiManager googleApiManager, boolean z) {
        boolean z2 = z;
        googleApiManager.zaf = true;
        return true;
    }

    @WorkerThread
    private final zabl<?> zaH(GoogleApi<?> googleApi) {
        zabl zabl;
        zabl zabl2;
        GoogleApi<?> googleApi2 = googleApi;
        ApiKey<?> apiKey = googleApi2.getApiKey();
        zabl zabl3 = this.zap.get(apiKey);
        if (zabl3 == null) {
            new zabl(this, googleApi2);
            zabl<?> put = this.zap.put(apiKey, zabl2);
            zabl = zabl2;
        } else {
            zabl = zabl3;
        }
        if (zabl.zap()) {
            boolean add = this.zas.add(apiKey);
        }
        zabl.zam();
        return zabl;
    }

    private final <T> void zaI(TaskCompletionSource<T> taskCompletionSource, int i, GoogleApi googleApi) {
        zabx zaa2;
        TaskCompletionSource<T> taskCompletionSource2 = taskCompletionSource;
        int i2 = i;
        GoogleApi googleApi2 = googleApi;
        if (i2 != 0 && (zaa2 = zabx.zaa(this, i2, googleApi2.getApiKey())) != null) {
            Task<T> task = taskCompletionSource2.getTask();
            Handler handler = this.zat;
            Class<?> cls = handler.getClass();
            Task<T> addOnCompleteListener = task.addOnCompleteListener(zabf.zaa(handler), (OnCompleteListener<T>) zaa2);
        }
    }

    /* access modifiers changed from: private */
    public static Status zaJ(ApiKey<?> apiKey, ConnectionResult connectionResult) {
        Status status;
        StringBuilder sb;
        ConnectionResult connectionResult2 = connectionResult;
        String zab2 = apiKey.zab();
        String valueOf = String.valueOf(connectionResult2);
        new StringBuilder(String.valueOf(zab2).length() + 63 + String.valueOf(valueOf).length());
        StringBuilder append = sb.append("API: ");
        StringBuilder append2 = sb.append(zab2);
        StringBuilder append3 = sb.append(" is not available on this device. Connection failed with: ");
        StringBuilder append4 = sb.append(valueOf);
        new Status(connectionResult2, sb.toString());
        return status;
    }

    @WorkerThread
    private final void zaK() {
        TelemetryData telemetryData = this.zah;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zam()) {
                Task<Void> log = zaL().log(telemetryData);
            }
            this.zah = null;
        }
    }

    @WorkerThread
    private final TelemetryLoggingClient zaL() {
        if (this.zai == null) {
            this.zai = TelemetryLogging.getClient(this.zak);
        }
        return this.zai;
    }

    /* JADX INFO: finally extract failed */
    @RecentlyNonNull
    public static GoogleApiManager zaa(@RecentlyNonNull Context context) {
        GoogleApiManager googleApiManager;
        HandlerThread handlerThread;
        GoogleApiManager googleApiManager2;
        Context context2 = context;
        Object obj = zag;
        synchronized (obj) {
            try {
                if (zaj == null) {
                    new HandlerThread("GoogleApiHandler", 9);
                    handlerThread.start();
                    new GoogleApiManager(context2.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
                    zaj = googleApiManager2;
                }
                googleApiManager = zaj;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return googleApiManager;
    }

    @RecentlyNonNull
    public static GoogleApiManager zab() {
        GoogleApiManager googleApiManager;
        Object obj = zag;
        synchronized (obj) {
            try {
                Object checkNotNull = Preconditions.checkNotNull(zaj, "Must guarantee manager is non-null before using getInstance");
                googleApiManager = zaj;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return googleApiManager;
    }

    @WorkerThread
    public final boolean handleMessage(@RecentlyNonNull Message message) {
        long j;
        ConnectionResult connectionResult;
        zabl zabl;
        StringBuilder sb;
        Throwable th;
        Status status;
        StringBuilder sb2;
        ArrayList arrayList;
        TelemetryData telemetryData;
        TelemetryData telemetryData2;
        BackgroundDetector.BackgroundStateChangeListener backgroundStateChangeListener;
        StringBuilder sb3;
        Message message2 = message;
        switch (message2.what) {
            case 1:
                if (true != ((Boolean) message2.obj).booleanValue()) {
                    j = 300000;
                } else {
                    j = 10000;
                }
                this.zae = j;
                this.zat.removeMessages(12);
                for (ApiKey next : this.zap.keySet()) {
                    Handler handler = this.zat;
                    boolean sendMessageDelayed = handler.sendMessageDelayed(handler.obtainMessage(12, next), this.zae);
                }
                break;
            case 2:
                zal zal2 = (zal) message2.obj;
                Iterator<ApiKey<?>> it = zal2.zaa().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        ApiKey next2 = it.next();
                        zabl zabl2 = this.zap.get(next2);
                        if (zabl2 == null) {
                            new ConnectionResult(13);
                            zal2.zac(next2, connectionResult, (String) null);
                            break;
                        } else if (zabl2.zao()) {
                            zal2.zac(next2, ConnectionResult.RESULT_SUCCESS, zabl2.zaf().getEndpointPackageName());
                        } else {
                            ConnectionResult zai2 = zabl2.zai();
                            if (zai2 != null) {
                                zal2.zac(next2, zai2, (String) null);
                            } else {
                                zabl2.zan(zal2);
                                zabl2.zam();
                            }
                        }
                    }
                }
            case 3:
                for (zabl next3 : this.zap.values()) {
                    next3.zah();
                    next3.zam();
                }
                break;
            case 4:
            case 8:
            case 13:
                zacb zacb = (zacb) message2.obj;
                zabl<?> zabl3 = this.zap.get(zacb.zac.getApiKey());
                if (zabl3 == null) {
                    zabl3 = zaH(zacb.zac);
                }
                if (zabl3.zap() && this.zao.get() != zacb.zab) {
                    zacb.zaa.zac(zaa);
                    zabl3.zae();
                    break;
                } else {
                    zabl3.zad(zacb.zaa);
                    break;
                }
                break;
            case 5:
                int i = message2.arg1;
                ConnectionResult connectionResult2 = (ConnectionResult) message2.obj;
                Iterator<zabl<?>> it2 = this.zap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zabl next4 = it2.next();
                        if (next4.zaq() == i) {
                            zabl = next4;
                        }
                    } else {
                        zabl = null;
                    }
                }
                if (zabl != null) {
                    if (connectionResult2.getErrorCode() != 13) {
                        zabl.zaI(zaJ(zabl.zad, connectionResult2));
                        break;
                    } else {
                        String errorString = this.zal.getErrorString(connectionResult2.getErrorCode());
                        String errorMessage = connectionResult2.getErrorMessage();
                        new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(errorMessage).length());
                        StringBuilder append = sb2.append("Error resolution was canceled by the user, original error message: ");
                        StringBuilder append2 = sb2.append(errorString);
                        StringBuilder append3 = sb2.append(": ");
                        StringBuilder append4 = sb2.append(errorMessage);
                        new Status(17, sb2.toString());
                        zabl.zaI(status);
                        break;
                    }
                } else {
                    new StringBuilder(76);
                    StringBuilder append5 = sb.append("Could not find API instance ");
                    StringBuilder append6 = sb.append(i);
                    StringBuilder append7 = sb.append(" while trying to fail enqueued calls.");
                    String sb4 = sb.toString();
                    new Exception();
                    int wtf = Log.wtf("GoogleApiManager", sb4, th);
                    break;
                }
            case 6:
                if (this.zak.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.zak.getApplicationContext());
                    BackgroundDetector instance = BackgroundDetector.getInstance();
                    new zabg(this);
                    instance.addListener(backgroundStateChangeListener);
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zae = 300000;
                        break;
                    }
                }
                break;
            case 7:
                zabl<?> zaH = zaH((GoogleApi) message2.obj);
                break;
            case ConnectionResult.SERVICE_INVALID:
                if (this.zap.containsKey(message2.obj)) {
                    this.zap.get(message2.obj).zaj();
                    break;
                }
                break;
            case 10:
                for (ApiKey remove : this.zas) {
                    zabl remove2 = this.zap.remove(remove);
                    if (remove2 != null) {
                        remove2.zae();
                    }
                }
                this.zas.clear();
                break;
            case ConnectionResult.LICENSE_CHECK_FAILED:
                if (this.zap.containsKey(message2.obj)) {
                    this.zap.get(message2.obj).zak();
                    break;
                }
                break;
            case 12:
                if (this.zap.containsKey(message2.obj)) {
                    boolean zal3 = this.zap.get(message2.obj).zal();
                    break;
                }
                break;
            case 14:
                zaac zaac = (zaac) message2.obj;
                ApiKey<?> zaa2 = zaac.zaa();
                if (this.zap.containsKey(zaa2)) {
                    zaac.zab().setResult(Boolean.valueOf(zabl.zat(this.zap.get(zaa2), false)));
                    break;
                } else {
                    zaac.zab().setResult(false);
                    break;
                }
            case 15:
                zabm zabm = (zabm) message2.obj;
                if (this.zap.containsKey(zabm.zaa)) {
                    zabl.zau(this.zap.get(zabm.zaa), zabm);
                    break;
                }
                break;
            case 16:
                zabm zabm2 = (zabm) message2.obj;
                if (this.zap.containsKey(zabm2.zaa)) {
                    zabl.zav(this.zap.get(zabm2.zaa), zabm2);
                    break;
                }
                break;
            case 17:
                zaK();
                break;
            case ConnectionResult.SERVICE_UPDATING:
                zaby zaby = (zaby) message2.obj;
                if (zaby.zac != 0) {
                    TelemetryData telemetryData3 = this.zah;
                    if (telemetryData3 != null) {
                        List<MethodInvocation> zab2 = telemetryData3.zab();
                        if (this.zah.zaa() != zaby.zab || (zab2 != null && zab2.size() >= zaby.zad)) {
                            this.zat.removeMessages(17);
                            zaK();
                        } else {
                            this.zah.zac(zaby.zaa);
                        }
                    }
                    if (this.zah == null) {
                        new ArrayList();
                        boolean add = arrayList.add(zaby.zaa);
                        new TelemetryData(zaby.zab, arrayList);
                        this.zah = telemetryData;
                        Handler handler2 = this.zat;
                        boolean sendMessageDelayed2 = handler2.sendMessageDelayed(handler2.obtainMessage(17), zaby.zac);
                        break;
                    }
                } else {
                    new TelemetryData(zaby.zab, Arrays.asList(new MethodInvocation[]{zaby.zaa}));
                    Task<Void> log = zaL().log(telemetryData2);
                    break;
                }
                break;
            case 19:
                this.zaf = false;
                break;
            default:
                int i2 = message2.what;
                new StringBuilder(31);
                StringBuilder append8 = sb3.append("Unknown message id: ");
                StringBuilder append9 = sb3.append(i2);
                int w = Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    public final int zac() {
        return this.zan.getAndIncrement();
    }

    public final void zad(@RecentlyNonNull GoogleApi<?> googleApi) {
        Handler handler = this.zat;
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    /* JADX INFO: finally extract failed */
    public final void zae(@NonNull zaab zaab) {
        zaab zaab2 = zaab;
        Object obj = zag;
        synchronized (obj) {
            try {
                if (this.zaq != zaab2) {
                    this.zaq = zaab2;
                    this.zar.clear();
                }
                boolean addAll = this.zar.addAll(zaab2.zab());
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zaf(@NonNull zaab zaab) {
        zaab zaab2 = zaab;
        Object obj = zag;
        synchronized (obj) {
            try {
                if (this.zaq == zaab2) {
                    this.zaq = null;
                    this.zar.clear();
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final zabl zag(ApiKey<?> apiKey) {
        return this.zap.get(apiKey);
    }

    @RecentlyNonNull
    public final Task<Map<ApiKey<?>, String>> zah(@RecentlyNonNull Iterable<? extends HasApiKey<?>> iterable) {
        zal zal2;
        new zal(iterable);
        Handler handler = this.zat;
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(2, zal2));
        return zal2.zab();
    }

    public final void zai() {
        Handler handler = this.zat;
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(3));
    }

    @RecentlyNonNull
    public final Task<Boolean> zaj(@RecentlyNonNull GoogleApi<?> googleApi) {
        zaac zaac;
        new zaac(googleApi.getApiKey());
        Handler handler = this.zat;
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(14, zaac));
        return zaac.zab().getTask();
    }

    public final <O extends Api.ApiOptions> void zak(@RecentlyNonNull GoogleApi<O> googleApi, int i, @RecentlyNonNull BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zai zai2;
        Object obj;
        new zae(i, apiMethodImpl);
        Handler handler = this.zat;
        new zacb(zai2, this.zao.get(), googleApi);
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(4, obj));
    }

    public final <O extends Api.ApiOptions, ResultT> void zal(@RecentlyNonNull GoogleApi<O> googleApi, int i, @RecentlyNonNull TaskApiCall<Api.AnyClient, ResultT> taskApiCall, @RecentlyNonNull TaskCompletionSource<ResultT> taskCompletionSource, @RecentlyNonNull StatusExceptionMapper statusExceptionMapper) {
        zai zai2;
        Object obj;
        GoogleApi<O> googleApi2 = googleApi;
        TaskApiCall<Api.AnyClient, ResultT> taskApiCall2 = taskApiCall;
        TaskCompletionSource<ResultT> taskCompletionSource2 = taskCompletionSource;
        zaI(taskCompletionSource2, taskApiCall2.zab(), googleApi2);
        new zag(i, taskApiCall2, taskCompletionSource2, statusExceptionMapper);
        Handler handler = this.zat;
        new zacb(zai2, this.zao.get(), googleApi2);
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(4, obj));
    }

    @RecentlyNonNull
    public final <O extends Api.ApiOptions> Task<Void> zan(@RecentlyNonNull GoogleApi<O> googleApi, @RecentlyNonNull RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, @RecentlyNonNull UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, @RecentlyNonNull Runnable runnable) {
        TaskCompletionSource taskCompletionSource;
        zai zai2;
        zacc zacc;
        Object obj;
        GoogleApi<O> googleApi2 = googleApi;
        RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod2 = registerListenerMethod;
        new TaskCompletionSource();
        zaI(taskCompletionSource, registerListenerMethod2.zab(), googleApi2);
        new zacc(registerListenerMethod2, unregisterListenerMethod, runnable);
        new zaf(zacc, taskCompletionSource);
        Handler handler = this.zat;
        new zacb(zai2, this.zao.get(), googleApi2);
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(8, obj));
        return taskCompletionSource.getTask();
    }

    @RecentlyNonNull
    public final <O extends Api.ApiOptions> Task<Boolean> zao(@RecentlyNonNull GoogleApi<O> googleApi, @RecentlyNonNull ListenerHolder.ListenerKey listenerKey, int i) {
        TaskCompletionSource taskCompletionSource;
        zai zai2;
        Object obj;
        GoogleApi<O> googleApi2 = googleApi;
        new TaskCompletionSource();
        zaI(taskCompletionSource, i, googleApi2);
        new zah(listenerKey, taskCompletionSource);
        Handler handler = this.zat;
        new zacb(zai2, this.zao.get(), googleApi2);
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(13, obj));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public final boolean zap(ConnectionResult connectionResult, int i) {
        return this.zal.zac(this.zak, connectionResult, i);
    }

    public final void zaq(@RecentlyNonNull ConnectionResult connectionResult, int i) {
        ConnectionResult connectionResult2 = connectionResult;
        int i2 = i;
        if (!zap(connectionResult2, i2)) {
            Handler handler = this.zat;
            boolean sendMessage = handler.sendMessage(handler.obtainMessage(5, i2, 0, connectionResult2));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zar(MethodInvocation methodInvocation, int i, long j, int i2) {
        Object obj;
        Handler handler = this.zat;
        new zaby(methodInvocation, i, j, i2);
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(18, obj));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final boolean zam() {
        if (this.zaf) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int zab2 = this.zam.zab(this.zak, 203390000);
        return zab2 == -1 || zab2 == 0;
    }
}
