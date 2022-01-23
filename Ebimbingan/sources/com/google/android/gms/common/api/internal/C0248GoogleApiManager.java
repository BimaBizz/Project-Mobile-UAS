package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArraySet;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.C0189GoogleApiAvailability;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.C0223HasApiKey;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0242BackgroundDetector;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.common.internal.C0443MethodInvocation;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0449RootTelemetryConfigManager;
import com.google.android.gms.common.internal.C0450RootTelemetryConfiguration;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.internal.C0454TelemetryData;
import com.google.android.gms.common.internal.C0455TelemetryLogging;
import com.google.android.gms.common.internal.C0456TelemetryLoggingClient;
import com.google.android.gms.common.internal.C0496zal;
import com.google.android.gms.common.util.C0598DeviceProperties;
import com.google.android.gms.internal.base.C1106zap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

@C0452ShowFirstParty
@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.GoogleApiManager */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0248GoogleApiManager implements Handler.Callback {
    @RecentlyNonNull
    public static final C0236Status zaa;
    /* access modifiers changed from: private */
    public static final C0236Status zab;
    /* access modifiers changed from: private */
    public static final Object zag;
    @GuardedBy("lock")
    @Nullable
    private static C0248GoogleApiManager zaj;
    /* access modifiers changed from: private */
    public long zac = 5000;
    /* access modifiers changed from: private */
    public long zad = 120000;
    /* access modifiers changed from: private */
    public long zae = 10000;
    private boolean zaf = false;
    @Nullable
    private C0454TelemetryData zah;
    @Nullable
    private C0456TelemetryLoggingClient zai;
    /* access modifiers changed from: private */
    public final Context zak;
    /* access modifiers changed from: private */
    public final C0189GoogleApiAvailability zal;
    /* access modifiers changed from: private */
    public final C0496zal zam;
    private final AtomicInteger zan;
    private final AtomicInteger zao;
    /* access modifiers changed from: private */
    public final Map<C0241ApiKey<?>, C0309zabl<?>> zap;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    @Nullable
    public C0272zaab zaq;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public final Set<C0241ApiKey<?>> zar;
    private final Set<C0241ApiKey<?>> zas;
    /* access modifiers changed from: private */
    @NotOnlyInitialized
    public final Handler zat;
    /* access modifiers changed from: private */
    public volatile boolean zau;

    static {
        C0236Status status;
        C0236Status status2;
        Object obj;
        new C0236Status(4, "Sign-out occurred while this API call was in progress.");
        zaa = status;
        new C0236Status(4, "The user must be signed in to make this API call.");
        zab = status2;
        new Object();
        zag = obj;
    }

    @C0206KeepForSdk
    private C0248GoogleApiManager(Context context, Looper looper, C0189GoogleApiAvailability googleApiAvailability) {
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        Map<C0241ApiKey<?>, C0309zabl<?>> map;
        Set<C0241ApiKey<?>> set;
        Set<C0241ApiKey<?>> set2;
        Handler handler;
        C0496zal zal2;
        Context context2 = context;
        C0189GoogleApiAvailability googleApiAvailability2 = googleApiAvailability;
        new AtomicInteger(1);
        this.zan = atomicInteger;
        new AtomicInteger(0);
        this.zao = atomicInteger2;
        new ConcurrentHashMap(5, 0.75f, 1);
        this.zap = map;
        this.zaq = null;
        new ArraySet();
        this.zar = set;
        new ArraySet();
        this.zas = set2;
        this.zau = true;
        this.zak = context2;
        new C1106zap(looper, this);
        this.zat = handler;
        this.zal = googleApiAvailability2;
        new C0496zal(googleApiAvailability2);
        this.zam = zal2;
        if (C0598DeviceProperties.isAuto(context2)) {
            this.zau = false;
        }
        Handler handler2 = this.zat;
        boolean sendMessage = handler2.sendMessage(handler2.obtainMessage(6));
    }

    /* JADX INFO: finally extract failed */
    @C0206KeepForSdk
    public static void reportSignOut() {
        Object obj = zag;
        synchronized (obj) {
            try {
                if (zaj != null) {
                    C0248GoogleApiManager googleApiManager = zaj;
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

    static /* synthetic */ boolean zaA(C0248GoogleApiManager googleApiManager, boolean z) {
        boolean z2 = z;
        googleApiManager.zaf = true;
        return true;
    }

    @WorkerThread
    private final C0309zabl<?> zaH(C0220GoogleApi<?> googleApi) {
        C0309zabl zabl;
        C0309zabl zabl2;
        C0220GoogleApi<?> googleApi2 = googleApi;
        C0241ApiKey<?> apiKey = googleApi2.getApiKey();
        C0309zabl zabl3 = this.zap.get(apiKey);
        if (zabl3 == null) {
            new C0309zabl(this, googleApi2);
            C0309zabl<?> put = this.zap.put(apiKey, zabl2);
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

    private final <T> void zaI(TaskCompletionSource<T> taskCompletionSource, int i, C0220GoogleApi googleApi) {
        C0321zabx zaa2;
        TaskCompletionSource<T> taskCompletionSource2 = taskCompletionSource;
        int i2 = i;
        C0220GoogleApi googleApi2 = googleApi;
        if (i2 != 0 && (zaa2 = C0321zabx.zaa(this, i2, googleApi2.getApiKey())) != null) {
            Task<T> task = taskCompletionSource2.getTask();
            Handler handler = this.zat;
            Class<?> cls = handler.getClass();
            Task<T> addOnCompleteListener = task.addOnCompleteListener(C0303zabf.zaa(handler), (OnCompleteListener<T>) zaa2);
        }
    }

    /* access modifiers changed from: private */
    public static C0236Status zaJ(C0241ApiKey<?> apiKey, C0184ConnectionResult connectionResult) {
        C0236Status status;
        StringBuilder sb;
        C0184ConnectionResult connectionResult2 = connectionResult;
        String zab2 = apiKey.zab();
        String valueOf = String.valueOf(connectionResult2);
        new StringBuilder(String.valueOf(zab2).length() + 63 + String.valueOf(valueOf).length());
        StringBuilder append = sb.append("API: ");
        StringBuilder append2 = sb.append(zab2);
        StringBuilder append3 = sb.append(" is not available on this device. Connection failed with: ");
        StringBuilder append4 = sb.append(valueOf);
        new C0236Status(connectionResult2, sb.toString());
        return status;
    }

    @WorkerThread
    private final void zaK() {
        C0454TelemetryData telemetryData = this.zah;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zam()) {
                Task<Void> log = zaL().log(telemetryData);
            }
            this.zah = null;
        }
    }

    @WorkerThread
    private final C0456TelemetryLoggingClient zaL() {
        if (this.zai == null) {
            this.zai = C0455TelemetryLogging.getClient(this.zak);
        }
        return this.zai;
    }

    /* JADX INFO: finally extract failed */
    @RecentlyNonNull
    public static C0248GoogleApiManager zaa(@RecentlyNonNull Context context) {
        C0248GoogleApiManager googleApiManager;
        HandlerThread handlerThread;
        C0248GoogleApiManager googleApiManager2;
        Context context2 = context;
        Object obj = zag;
        synchronized (obj) {
            try {
                if (zaj == null) {
                    new HandlerThread("GoogleApiHandler", 9);
                    handlerThread.start();
                    new C0248GoogleApiManager(context2.getApplicationContext(), handlerThread.getLooper(), C0189GoogleApiAvailability.getInstance());
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
    public static C0248GoogleApiManager zab() {
        C0248GoogleApiManager googleApiManager;
        Object obj = zag;
        synchronized (obj) {
            try {
                Object checkNotNull = C0446Preconditions.checkNotNull(zaj, "Must guarantee manager is non-null before using getInstance");
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
        C0184ConnectionResult connectionResult;
        C0309zabl zabl;
        StringBuilder sb;
        Throwable th;
        C0236Status status;
        StringBuilder sb2;
        ArrayList arrayList;
        C0454TelemetryData telemetryData;
        C0454TelemetryData telemetryData2;
        C0242BackgroundDetector.BackgroundStateChangeListener backgroundStateChangeListener;
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
                for (C0241ApiKey next : this.zap.keySet()) {
                    Handler handler = this.zat;
                    boolean sendMessageDelayed = handler.sendMessageDelayed(handler.obtainMessage(12, next), this.zae);
                }
                break;
            case 2:
                C0357zal zal2 = (C0357zal) message2.obj;
                Iterator<C0241ApiKey<?>> it = zal2.zaa().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C0241ApiKey next2 = it.next();
                        C0309zabl zabl2 = this.zap.get(next2);
                        if (zabl2 == null) {
                            new C0184ConnectionResult(13);
                            zal2.zac(next2, connectionResult, (String) null);
                            break;
                        } else if (zabl2.zao()) {
                            zal2.zac(next2, C0184ConnectionResult.RESULT_SUCCESS, zabl2.zaf().getEndpointPackageName());
                        } else {
                            C0184ConnectionResult zai2 = zabl2.zai();
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
                for (C0309zabl next3 : this.zap.values()) {
                    next3.zah();
                    next3.zam();
                }
                break;
            case 4:
            case 8:
            case 13:
                C0326zacb zacb = (C0326zacb) message2.obj;
                C0309zabl<?> zabl3 = this.zap.get(zacb.zac.getApiKey());
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
                C0184ConnectionResult connectionResult2 = (C0184ConnectionResult) message2.obj;
                Iterator<C0309zabl<?>> it2 = this.zap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C0309zabl next4 = it2.next();
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
                        new C0236Status(17, sb2.toString());
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
                    C0242BackgroundDetector.initialize((Application) this.zak.getApplicationContext());
                    C0242BackgroundDetector instance = C0242BackgroundDetector.getInstance();
                    new C0304zabg(this);
                    instance.addListener(backgroundStateChangeListener);
                    if (!C0242BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zae = 300000;
                        break;
                    }
                }
                break;
            case 7:
                C0309zabl<?> zaH = zaH((C0220GoogleApi) message2.obj);
                break;
            case 9:
                if (this.zap.containsKey(message2.obj)) {
                    this.zap.get(message2.obj).zaj();
                    break;
                }
                break;
            case 10:
                for (C0241ApiKey remove : this.zas) {
                    C0309zabl remove2 = this.zap.remove(remove);
                    if (remove2 != null) {
                        remove2.zae();
                    }
                }
                this.zas.clear();
                break;
            case 11:
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
                C0273zaac zaac = (C0273zaac) message2.obj;
                C0241ApiKey<?> zaa2 = zaac.zaa();
                if (this.zap.containsKey(zaa2)) {
                    zaac.zab().setResult(Boolean.valueOf(C0309zabl.zat(this.zap.get(zaa2), false)));
                    break;
                } else {
                    zaac.zab().setResult(false);
                    break;
                }
            case 15:
                C0310zabm zabm = (C0310zabm) message2.obj;
                if (this.zap.containsKey(zabm.zaa)) {
                    C0309zabl.zau(this.zap.get(zabm.zaa), zabm);
                    break;
                }
                break;
            case 16:
                C0310zabm zabm2 = (C0310zabm) message2.obj;
                if (this.zap.containsKey(zabm2.zaa)) {
                    C0309zabl.zav(this.zap.get(zabm2.zaa), zabm2);
                    break;
                }
                break;
            case 17:
                zaK();
                break;
            case 18:
                C0322zaby zaby = (C0322zaby) message2.obj;
                if (zaby.zac != 0) {
                    C0454TelemetryData telemetryData3 = this.zah;
                    if (telemetryData3 != null) {
                        List<C0443MethodInvocation> zab2 = telemetryData3.zab();
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
                        new C0454TelemetryData(zaby.zab, arrayList);
                        this.zah = telemetryData;
                        Handler handler2 = this.zat;
                        boolean sendMessageDelayed2 = handler2.sendMessageDelayed(handler2.obtainMessage(17), zaby.zac);
                        break;
                    }
                } else {
                    new C0454TelemetryData(zaby.zab, Arrays.asList(new C0443MethodInvocation[]{zaby.zaa}));
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

    public final void zad(@RecentlyNonNull C0220GoogleApi<?> googleApi) {
        Handler handler = this.zat;
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    /* JADX INFO: finally extract failed */
    public final void zae(@NonNull C0272zaab zaab) {
        C0272zaab zaab2 = zaab;
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
    public final void zaf(@NonNull C0272zaab zaab) {
        C0272zaab zaab2 = zaab;
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
    public final C0309zabl zag(C0241ApiKey<?> apiKey) {
        return this.zap.get(apiKey);
    }

    @RecentlyNonNull
    public final Task<Map<C0241ApiKey<?>, String>> zah(@RecentlyNonNull Iterable<? extends C0223HasApiKey<?>> iterable) {
        C0357zal zal2;
        new C0357zal(iterable);
        Handler handler = this.zat;
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(2, zal2));
        return zal2.zab();
    }

    public final void zai() {
        Handler handler = this.zat;
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(3));
    }

    @RecentlyNonNull
    public final Task<Boolean> zaj(@RecentlyNonNull C0220GoogleApi<?> googleApi) {
        C0273zaac zaac;
        new C0273zaac(googleApi.getApiKey());
        Handler handler = this.zat;
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(14, zaac));
        return zaac.zab().getTask();
    }

    public final <O extends C0211Api.ApiOptions> void zak(@RecentlyNonNull C0220GoogleApi<O> googleApi, int i, @RecentlyNonNull C0243BaseImplementation.ApiMethodImpl<? extends C0231Result, C0211Api.AnyClient> apiMethodImpl) {
        C0354zai zai2;
        Object obj;
        new C0350zae(i, apiMethodImpl);
        Handler handler = this.zat;
        new C0326zacb(zai2, this.zao.get(), googleApi);
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(4, obj));
    }

    public final <O extends C0211Api.ApiOptions, ResultT> void zal(@RecentlyNonNull C0220GoogleApi<O> googleApi, int i, @RecentlyNonNull C0267TaskApiCall<C0211Api.AnyClient, ResultT> taskApiCall, @RecentlyNonNull TaskCompletionSource<ResultT> taskCompletionSource, @RecentlyNonNull C0265StatusExceptionMapper statusExceptionMapper) {
        C0354zai zai2;
        Object obj;
        C0220GoogleApi<O> googleApi2 = googleApi;
        C0267TaskApiCall<C0211Api.AnyClient, ResultT> taskApiCall2 = taskApiCall;
        TaskCompletionSource<ResultT> taskCompletionSource2 = taskCompletionSource;
        zaI(taskCompletionSource2, taskApiCall2.zab(), googleApi2);
        new C0352zag(i, taskApiCall2, taskCompletionSource2, statusExceptionMapper);
        Handler handler = this.zat;
        new C0326zacb(zai2, this.zao.get(), googleApi2);
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(4, obj));
    }

    @RecentlyNonNull
    public final <O extends C0211Api.ApiOptions> Task<Void> zan(@RecentlyNonNull C0220GoogleApi<O> googleApi, @RecentlyNonNull C0260RegisterListenerMethod<C0211Api.AnyClient, ?> registerListenerMethod, @RecentlyNonNull C0269UnregisterListenerMethod<C0211Api.AnyClient, ?> unregisterListenerMethod, @RecentlyNonNull Runnable runnable) {
        TaskCompletionSource taskCompletionSource;
        C0354zai zai2;
        C0327zacc zacc;
        Object obj;
        C0220GoogleApi<O> googleApi2 = googleApi;
        C0260RegisterListenerMethod<C0211Api.AnyClient, ?> registerListenerMethod2 = registerListenerMethod;
        new TaskCompletionSource();
        zaI(taskCompletionSource, registerListenerMethod2.zab(), googleApi2);
        new C0327zacc(registerListenerMethod2, unregisterListenerMethod, runnable);
        new C0351zaf(zacc, taskCompletionSource);
        Handler handler = this.zat;
        new C0326zacb(zai2, this.zao.get(), googleApi2);
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(8, obj));
        return taskCompletionSource.getTask();
    }

    @RecentlyNonNull
    public final <O extends C0211Api.ApiOptions> Task<Boolean> zao(@RecentlyNonNull C0220GoogleApi<O> googleApi, @RecentlyNonNull C0254ListenerHolder.ListenerKey listenerKey, int i) {
        TaskCompletionSource taskCompletionSource;
        C0354zai zai2;
        Object obj;
        C0220GoogleApi<O> googleApi2 = googleApi;
        new TaskCompletionSource();
        zaI(taskCompletionSource, i, googleApi2);
        new C0353zah(listenerKey, taskCompletionSource);
        Handler handler = this.zat;
        new C0326zacb(zai2, this.zao.get(), googleApi2);
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(13, obj));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public final boolean zap(C0184ConnectionResult connectionResult, int i) {
        return this.zal.zac(this.zak, connectionResult, i);
    }

    public final void zaq(@RecentlyNonNull C0184ConnectionResult connectionResult, int i) {
        C0184ConnectionResult connectionResult2 = connectionResult;
        int i2 = i;
        if (!zap(connectionResult2, i2)) {
            Handler handler = this.zat;
            boolean sendMessage = handler.sendMessage(handler.obtainMessage(5, i2, 0, connectionResult2));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zar(C0443MethodInvocation methodInvocation, int i, long j, int i2) {
        Object obj;
        Handler handler = this.zat;
        new C0322zaby(methodInvocation, i, j, i2);
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(18, obj));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final boolean zam() {
        if (this.zaf) {
            return false;
        }
        C0450RootTelemetryConfiguration config = C0449RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int zab2 = this.zam.zab(this.zak, 203390000);
        return zab2 == -1 || zab2 == 0;
    }
}
