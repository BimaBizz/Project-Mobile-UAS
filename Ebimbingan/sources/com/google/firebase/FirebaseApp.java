package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.internal.C0242BackgroundDetector;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0589Base64Utils;
import com.google.android.gms.common.util.C0609PlatformVersion;
import com.google.android.gms.common.util.C0611ProcessUtils;
import com.google.firebase.annotations.PublicApi;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.events.Publisher;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;
import org.slf4j.Marker;

@PublicApi
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class FirebaseApp {
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";
    private static final String FIREBASE_ANDROID = "fire-android";
    private static final String FIREBASE_COMMON = "fire-core";
    @GuardedBy("LOCK")
    static final Map<String, FirebaseApp> INSTANCES;
    /* access modifiers changed from: private */
    public static final Object LOCK;
    private static final String LOG_TAG = "FirebaseApp";
    private static final Executor UI_EXECUTOR;
    private final Context applicationContext;
    /* access modifiers changed from: private */
    public final AtomicBoolean automaticResourceManagementEnabled;
    private final List<BackgroundStateChangeListener> backgroundStateChangeListeners;
    private final ComponentRuntime componentRuntime;
    private final Lazy<DataCollectionConfigStorage> dataCollectionConfigStorage;
    private final AtomicBoolean deleted;
    private final List<FirebaseAppLifecycleListener> lifecycleListeners;
    private final String name;
    private final FirebaseOptions options;

    @C0206KeepForSdk
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    public interface BackgroundStateChangeListener {
        @C0206KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    static {
        Object obj;
        Executor executor;
        Map<String, FirebaseApp> map;
        new Object();
        LOCK = obj;
        new UiExecutor((AnonymousClass1) null);
        UI_EXECUTOR = executor;
        new ArrayMap();
        INSTANCES = map;
    }

    @PublicApi
    @NonNull
    public Context getApplicationContext() {
        checkNotDeleted();
        return this.applicationContext;
    }

    @PublicApi
    @NonNull
    public String getName() {
        checkNotDeleted();
        return this.name;
    }

    @PublicApi
    @NonNull
    public FirebaseOptions getOptions() {
        checkNotDeleted();
        return this.options;
    }

    public boolean equals(Object obj) {
        Object o = obj;
        if (!(o instanceof FirebaseApp)) {
            return false;
        }
        return this.name.equals(((FirebaseApp) o).getName());
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return C0444Objects.toStringHelper(this).add(CommonProperties.NAME, this.name).add("options", this.options).toString();
    }

    @PublicApi
    public static List<FirebaseApp> getApps(Context context) {
        List<FirebaseApp> list;
        Context context2 = context;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                List<FirebaseApp> list2 = list;
                new ArrayList(INSTANCES.values());
                return list2;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    @PublicApi
    @NonNull
    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        Throwable th;
        StringBuilder sb;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                defaultApp = INSTANCES.get(DEFAULT_APP_NAME);
                if (defaultApp == null) {
                    Throwable th2 = th;
                    new StringBuilder();
                    new IllegalStateException(sb.append("Default FirebaseApp is not initialized in this process ").append(C0611ProcessUtils.getMyProcessName()).append(". Make sure to call FirebaseApp.initializeApp(Context) first.").toString());
                    throw th2;
                }
                return firebaseApp;
            } finally {
                firebaseApp = defaultApp;
                Object obj3 = obj2;
                Throwable th3 = firebaseApp;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @PublicApi
    @NonNull
    public static FirebaseApp getInstance(@NonNull String str) {
        StringBuilder sb;
        String availableAppNamesMessage;
        Throwable th;
        String name2 = str;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                FirebaseApp firebaseApp = INSTANCES.get(normalize(name2));
                if (firebaseApp != null) {
                    FirebaseApp firebaseApp2 = firebaseApp;
                    return firebaseApp2;
                }
                List<String> availableAppNames = getAllAppNames();
                if (availableAppNames.isEmpty()) {
                    availableAppNamesMessage = "";
                } else {
                    new StringBuilder();
                    availableAppNamesMessage = sb.append("Available app names: ").append(TextUtils.join(", ", availableAppNames)).toString();
                }
                Object[] objArr = new Object[2];
                objArr[0] = name2;
                Object[] objArr2 = objArr;
                objArr2[1] = availableAppNamesMessage;
                Throwable th2 = th;
                new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", objArr2));
                throw th2;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                Object obj3 = obj2;
                throw th4;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @PublicApi
    @Nullable
    public static FirebaseApp initializeApp(@NonNull Context context) {
        Context context2 = context;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                if (INSTANCES.containsKey(DEFAULT_APP_NAME)) {
                    FirebaseApp instance = getInstance();
                    return instance;
                }
                FirebaseOptions firebaseOptions = FirebaseOptions.fromResource(context2);
                if (firebaseOptions == null) {
                    int w = Log.w(LOG_TAG, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                FirebaseApp initializeApp = initializeApp(context2, firebaseOptions);
                return initializeApp;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    @PublicApi
    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context, @NonNull FirebaseOptions options2) {
        return initializeApp(context, options2, DEFAULT_APP_NAME);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: com.google.firebase.FirebaseApp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.google.firebase.FirebaseApp} */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.firebase.annotations.PublicApi
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.firebase.FirebaseApp initializeApp(@androidx.annotation.NonNull android.content.Context r14, @androidx.annotation.NonNull com.google.firebase.FirebaseOptions r15, @androidx.annotation.NonNull java.lang.String r16) {
        /*
            r0 = r14
            r1 = r15
            r2 = r16
            r8 = r0
            com.google.firebase.FirebaseApp.GlobalBackgroundStateListener.ensureBackgroundStateListenerRegistered(r8)
            r8 = r2
            java.lang.String r8 = normalize(r8)
            r3 = r8
            r8 = r0
            android.content.Context r8 = r8.getApplicationContext()
            if (r8 != 0) goto L_0x006f
            r8 = r0
            r5 = r8
        L_0x0017:
            java.lang.Object r8 = LOCK
            r13 = r8
            r8 = r13
            r9 = r13
            r6 = r9
            monitor-enter(r8)
            java.util.Map<java.lang.String, com.google.firebase.FirebaseApp> r8 = INSTANCES     // Catch:{ all -> 0x0078 }
            r9 = r3
            boolean r8 = r8.containsKey(r9)     // Catch:{ all -> 0x0078 }
            if (r8 != 0) goto L_0x0076
            r8 = 1
        L_0x0028:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r13 = r9
            r9 = r13
            r10 = r13
            r10.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r10 = "FirebaseApp name "
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch:{ all -> 0x0078 }
            r10 = r3
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch:{ all -> 0x0078 }
            java.lang.String r10 = " already exists!"
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch:{ all -> 0x0078 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0078 }
            com.google.android.gms.common.internal.C0446Preconditions.checkState(r8, r9)     // Catch:{ all -> 0x0078 }
            r8 = r5
            java.lang.String r9 = "Application context cannot be null."
            java.lang.Object r8 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r8, r9)     // Catch:{ all -> 0x0078 }
            com.google.firebase.FirebaseApp r8 = new com.google.firebase.FirebaseApp     // Catch:{ all -> 0x0078 }
            r13 = r8
            r8 = r13
            r9 = r13
            r10 = r5
            r11 = r3
            r12 = r1
            r9.<init>(r10, r11, r12)     // Catch:{ all -> 0x0078 }
            r4 = r8
            java.util.Map<java.lang.String, com.google.firebase.FirebaseApp> r8 = INSTANCES     // Catch:{ all -> 0x0078 }
            r9 = r3
            r10 = r4
            java.lang.Object r8 = r8.put(r9, r10)     // Catch:{ all -> 0x0078 }
            r8 = r6
            monitor-exit(r8)     // Catch:{ all -> 0x0078 }
            r8 = r4
            r8.initializeAllApis()
            r8 = r4
            r0 = r8
            return r0
        L_0x006f:
            r8 = r0
            android.content.Context r8 = r8.getApplicationContext()
            r5 = r8
            goto L_0x0017
        L_0x0076:
            r8 = 0
            goto L_0x0028
        L_0x0078:
            r8 = move-exception
            r7 = r8
            r8 = r6
            monitor-exit(r8)     // Catch:{ all -> 0x0078 }
            r8 = r7
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.FirebaseApp.initializeApp(android.content.Context, com.google.firebase.FirebaseOptions, java.lang.String):com.google.firebase.FirebaseApp");
    }

    @PublicApi
    public void delete() {
        if (this.deleted.compareAndSet(false, true)) {
            Object obj = LOCK;
            Object obj2 = obj;
            synchronized (obj) {
                try {
                    FirebaseApp remove = INSTANCES.remove(this.name);
                    notifyOnAppDeleted();
                } catch (Throwable th) {
                    while (true) {
                        Throwable th2 = th;
                        Object obj3 = obj2;
                        throw th2;
                    }
                }
            }
        }
    }

    @C0206KeepForSdk
    public <T> T get(Class<T> anInterface) {
        checkNotDeleted();
        return this.componentRuntime.get(anInterface);
    }

    @PublicApi
    public void setAutomaticResourceManagementEnabled(boolean z) {
        boolean enabled = z;
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.compareAndSet(!enabled, enabled)) {
            boolean inBackground = C0242BackgroundDetector.getInstance().isInBackground();
            if (enabled && inBackground) {
                notifyBackgroundStateChangeListeners(true);
            } else if (!enabled && inBackground) {
                notifyBackgroundStateChangeListeners(false);
            }
        }
    }

    @C0206KeepForSdk
    public boolean isDataCollectionDefaultEnabled() {
        checkNotDeleted();
        return this.dataCollectionConfigStorage.get().isEnabled();
    }

    @C0206KeepForSdk
    public void setDataCollectionDefaultEnabled(boolean enabled) {
        checkNotDeleted();
        this.dataCollectionConfigStorage.get().setEnabled(enabled);
    }

    protected FirebaseApp(Context context, String name2, FirebaseOptions firebaseOptions) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        List<BackgroundStateChangeListener> list;
        List<FirebaseAppLifecycleListener> list2;
        ComponentRuntime componentRuntime2;
        Lazy<DataCollectionConfigStorage> lazy;
        Context applicationContext2 = context;
        FirebaseOptions options2 = firebaseOptions;
        new AtomicBoolean(false);
        this.automaticResourceManagementEnabled = atomicBoolean;
        new AtomicBoolean();
        this.deleted = atomicBoolean2;
        new CopyOnWriteArrayList();
        this.backgroundStateChangeListeners = list;
        new CopyOnWriteArrayList();
        this.lifecycleListeners = list2;
        this.applicationContext = (Context) C0446Preconditions.checkNotNull(applicationContext2);
        this.name = C0446Preconditions.checkNotEmpty(name2);
        this.options = (FirebaseOptions) C0446Preconditions.checkNotNull(options2);
        List<ComponentRegistrar> registrars = ComponentDiscovery.forContext(applicationContext2).discover();
        ComponentRuntime componentRuntime3 = componentRuntime2;
        Component[] componentArr = new Component[6];
        componentArr[0] = Component.of(applicationContext2, Context.class, new Class[0]);
        Component[] componentArr2 = componentArr;
        componentArr2[1] = Component.of(this, FirebaseApp.class, new Class[0]);
        Component[] componentArr3 = componentArr2;
        componentArr3[2] = Component.of(options2, FirebaseOptions.class, new Class[0]);
        Component[] componentArr4 = componentArr3;
        componentArr4[3] = LibraryVersionComponent.create(FIREBASE_ANDROID, "");
        Component[] componentArr5 = componentArr4;
        componentArr5[4] = LibraryVersionComponent.create(FIREBASE_COMMON, BuildConfig.VERSION_NAME);
        Component[] componentArr6 = componentArr5;
        componentArr6[5] = DefaultUserAgentPublisher.component();
        new ComponentRuntime(UI_EXECUTOR, registrars, componentArr6);
        this.componentRuntime = componentRuntime3;
        new Lazy<>(FirebaseApp$$Lambda$1.lambdaFactory$(this, applicationContext2));
        this.dataCollectionConfigStorage = lazy;
    }

    static /* synthetic */ DataCollectionConfigStorage lambda$new$0(FirebaseApp firebaseApp, Context applicationContext2) {
        DataCollectionConfigStorage dataCollectionConfigStorage2;
        FirebaseApp firebaseApp2 = firebaseApp;
        new DataCollectionConfigStorage(applicationContext2, firebaseApp2.getPersistenceKey(), (Publisher) firebaseApp2.componentRuntime.get(Publisher.class));
        return dataCollectionConfigStorage2;
    }

    private void checkNotDeleted() {
        C0446Preconditions.checkState(!this.deleted.get(), "FirebaseApp was deleted");
    }

    @VisibleForTesting
    @C0206KeepForSdk
    public boolean isDefaultApp() {
        return DEFAULT_APP_NAME.equals(getName());
    }

    /* access modifiers changed from: private */
    public void notifyBackgroundStateChangeListeners(boolean z) {
        boolean background = z;
        int d = Log.d(LOG_TAG, "Notifying background state change listeners.");
        for (BackgroundStateChangeListener listener : this.backgroundStateChangeListeners) {
            listener.onBackgroundStateChanged(background);
        }
    }

    @C0206KeepForSdk
    public void addBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        BackgroundStateChangeListener listener = backgroundStateChangeListener;
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.get() && C0242BackgroundDetector.getInstance().isInBackground()) {
            listener.onBackgroundStateChanged(true);
        }
        boolean add = this.backgroundStateChangeListeners.add(listener);
    }

    @C0206KeepForSdk
    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener listener) {
        checkNotDeleted();
        boolean remove = this.backgroundStateChangeListeners.remove(listener);
    }

    @C0206KeepForSdk
    public String getPersistenceKey() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append(C0589Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset()))).append(Marker.ANY_NON_NULL_MARKER).append(C0589Base64Utils.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(Charset.defaultCharset()))).toString();
    }

    @C0206KeepForSdk
    public void addLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        FirebaseAppLifecycleListener listener = firebaseAppLifecycleListener;
        checkNotDeleted();
        Object checkNotNull = C0446Preconditions.checkNotNull(listener);
        boolean add = this.lifecycleListeners.add(listener);
    }

    @C0206KeepForSdk
    public void removeLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        FirebaseAppLifecycleListener listener = firebaseAppLifecycleListener;
        checkNotDeleted();
        Object checkNotNull = C0446Preconditions.checkNotNull(listener);
        boolean remove = this.lifecycleListeners.remove(listener);
    }

    private void notifyOnAppDeleted() {
        for (FirebaseAppLifecycleListener listener : this.lifecycleListeners) {
            listener.onDeleted(this.name, this.options);
        }
    }

    @VisibleForTesting
    public static void clearInstancesForTest() {
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                INSTANCES.clear();
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    @C0206KeepForSdk
    public static String getPersistenceKey(String name2, FirebaseOptions options2) {
        StringBuilder sb;
        new StringBuilder();
        return sb.append(C0589Base64Utils.encodeUrlSafeNoPadding(name2.getBytes(Charset.defaultCharset()))).append(Marker.ANY_NON_NULL_MARKER).append(C0589Base64Utils.encodeUrlSafeNoPadding(options2.getApplicationId().getBytes(Charset.defaultCharset()))).toString();
    }

    /* JADX INFO: finally extract failed */
    private static List<String> getAllAppNames() {
        List<String> list;
        new ArrayList();
        List<String> allAppNames = list;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                for (FirebaseApp app : INSTANCES.values()) {
                    boolean add = allAppNames.add(app.getName());
                }
                Collections.sort(allAppNames);
                return allAppNames;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Object obj3 = obj2;
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void initializeAllApis() {
        if (!UserManagerCompat.isUserUnlocked(this.applicationContext)) {
            UserUnlockReceiver.ensureReceiverRegistered(this.applicationContext);
        } else {
            this.componentRuntime.initializeEagerComponents(isDefaultApp());
        }
    }

    private static String normalize(@NonNull String name2) {
        return name2.trim();
    }

    @TargetApi(24)
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class UserUnlockReceiver extends BroadcastReceiver {
        private static AtomicReference<UserUnlockReceiver> INSTANCE;
        private final Context applicationContext;

        static {
            AtomicReference<UserUnlockReceiver> atomicReference;
            new AtomicReference<>();
            INSTANCE = atomicReference;
        }

        public UserUnlockReceiver(Context applicationContext2) {
            this.applicationContext = applicationContext2;
        }

        /* access modifiers changed from: private */
        public static void ensureReceiverRegistered(Context context) {
            UserUnlockReceiver userUnlockReceiver;
            IntentFilter intentFilter;
            Context applicationContext2 = context;
            if (INSTANCE.get() == null) {
                new UserUnlockReceiver(applicationContext2);
                UserUnlockReceiver receiver = userUnlockReceiver;
                if (INSTANCE.compareAndSet((Object) null, receiver)) {
                    new IntentFilter("android.intent.action.USER_UNLOCKED");
                    Intent registerReceiver = applicationContext2.registerReceiver(receiver, intentFilter);
                }
            }
        }

        /* JADX INFO: finally extract failed */
        public void onReceive(Context context, Intent intent) {
            Context context2 = context;
            Intent intent2 = intent;
            Object access$300 = FirebaseApp.LOCK;
            Object obj = access$300;
            synchronized (access$300) {
                try {
                    for (FirebaseApp app : FirebaseApp.INSTANCES.values()) {
                        app.initializeAllApis();
                    }
                    unregister();
                } catch (Throwable th) {
                    while (true) {
                        Throwable th2 = th;
                        Object obj2 = obj;
                        throw th2;
                    }
                }
            }
        }

        public void unregister() {
            this.applicationContext.unregisterReceiver(this);
        }
    }

    @TargetApi(14)
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class GlobalBackgroundStateListener implements C0242BackgroundDetector.BackgroundStateChangeListener {
        private static AtomicReference<GlobalBackgroundStateListener> INSTANCE;

        private GlobalBackgroundStateListener() {
        }

        static {
            AtomicReference<GlobalBackgroundStateListener> atomicReference;
            new AtomicReference<>();
            INSTANCE = atomicReference;
        }

        /* access modifiers changed from: private */
        public static void ensureBackgroundStateListenerRegistered(Context context) {
            GlobalBackgroundStateListener globalBackgroundStateListener;
            Context context2 = context;
            if (C0609PlatformVersion.isAtLeastIceCreamSandwich() && (context2.getApplicationContext() instanceof Application)) {
                Application application = (Application) context2.getApplicationContext();
                if (INSTANCE.get() == null) {
                    new GlobalBackgroundStateListener();
                    GlobalBackgroundStateListener listener = globalBackgroundStateListener;
                    if (INSTANCE.compareAndSet((Object) null, listener)) {
                        C0242BackgroundDetector.initialize(application);
                        C0242BackgroundDetector.getInstance().addListener(listener);
                    }
                }
            }
        }

        /* JADX INFO: finally extract failed */
        public void onBackgroundStateChanged(boolean z) {
            ArrayList arrayList;
            boolean background = z;
            Object access$300 = FirebaseApp.LOCK;
            Object obj = access$300;
            synchronized (access$300) {
                try {
                    new ArrayList(FirebaseApp.INSTANCES.values());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        FirebaseApp app = (FirebaseApp) it.next();
                        if (app.automaticResourceManagementEnabled.get()) {
                            app.notifyBackgroundStateChangeListeners(background);
                        }
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj2 = obj;
                    throw th2;
                }
            }
        }
    }

    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class UiExecutor implements Executor {
        private static final Handler HANDLER;

        private UiExecutor() {
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ UiExecutor(AnonymousClass1 r4) {
            this();
            AnonymousClass1 r1 = r4;
        }

        static {
            Handler handler;
            new Handler(Looper.getMainLooper());
            HANDLER = handler;
        }

        public void execute(@NonNull Runnable command) {
            boolean post = HANDLER.post(command);
        }
    }
}
