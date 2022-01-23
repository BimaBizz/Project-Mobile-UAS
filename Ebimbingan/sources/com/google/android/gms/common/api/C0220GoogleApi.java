package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0211Api.ApiOptions;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.internal.C0240ApiExceptionMapper;
import com.google.android.gms.common.api.internal.C0241ApiKey;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.common.api.internal.C0248GoogleApiManager;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.common.api.internal.C0255ListenerHolders;
import com.google.android.gms.common.api.internal.C0256NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.C0260RegisterListenerMethod;
import com.google.android.gms.common.api.internal.C0261RegistrationMethods;
import com.google.android.gms.common.api.internal.C0265StatusExceptionMapper;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.api.internal.C0269UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.C0272zaab;
import com.google.android.gms.common.api.internal.C0309zabl;
import com.google.android.gms.common.api.internal.C0313zabp;
import com.google.android.gms.common.api.internal.C0339zaco;
import com.google.android.gms.common.internal.C0424BaseGmsClient;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0609PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.GoogleApi */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0220GoogleApi<O extends C0211Api.ApiOptions> implements C0223HasApiKey<O> {
    @RecentlyNonNull
    protected final C0248GoogleApiManager zaa;
    private final Context zab;
    @Nullable
    private final String zac;
    private final C0211Api<O> zad;
    private final O zae;
    private final C0241ApiKey<O> zaf;
    private final Looper zag;
    private final int zah;
    @NotOnlyInitialized
    private final C0222GoogleApiClient zai;
    private final C0265StatusExceptionMapper zaj;

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.api.GoogleApi$Settings */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class Settings {
        @RecentlyNonNull
        @C0206KeepForSdk
        public static final Settings DEFAULT_SETTINGS;
        @RecentlyNonNull
        public final C0265StatusExceptionMapper zaa;
        @RecentlyNonNull
        public final Looper zab;

        @C0206KeepForSdk
        /* renamed from: com.google.android.gms.common.api.GoogleApi$Settings$Builder */
        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public static class Builder {
            private C0265StatusExceptionMapper zaa;
            private Looper zab;

            @C0206KeepForSdk
            public Builder() {
            }

            @RecentlyNonNull
            @C0206KeepForSdk
            public Settings build() {
                Settings settings;
                C0265StatusExceptionMapper statusExceptionMapper;
                if (this.zaa == null) {
                    new C0240ApiExceptionMapper();
                    this.zaa = statusExceptionMapper;
                }
                if (this.zab == null) {
                    this.zab = Looper.getMainLooper();
                }
                new Settings(this.zaa, (Account) null, this.zab, (C0379zad) null);
                return settings;
            }

            @RecentlyNonNull
            @C0206KeepForSdk
            public Builder setLooper(@RecentlyNonNull Looper looper) {
                Looper looper2 = looper;
                Object checkNotNull = C0446Preconditions.checkNotNull(looper2, "Looper must not be null.");
                this.zab = looper2;
                return this;
            }

            @RecentlyNonNull
            @C0206KeepForSdk
            public Builder setMapper(@RecentlyNonNull C0265StatusExceptionMapper statusExceptionMapper) {
                C0265StatusExceptionMapper statusExceptionMapper2 = statusExceptionMapper;
                Object checkNotNull = C0446Preconditions.checkNotNull(statusExceptionMapper2, "StatusExceptionMapper must not be null.");
                this.zaa = statusExceptionMapper2;
                return this;
            }
        }

        static {
            Builder builder;
            new Builder();
            DEFAULT_SETTINGS = builder.build();
        }

        @C0206KeepForSdk
        private Settings(C0265StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            Account account2 = account;
            this.zaa = statusExceptionMapper;
            this.zab = looper;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ Settings(C0265StatusExceptionMapper statusExceptionMapper, Account account, Looper looper, C0379zad zad) {
            this(statusExceptionMapper, (Account) null, looper);
            Account account2 = account;
            C0379zad zad2 = zad;
        }
    }

    @MainThread
    @C0206KeepForSdk
    public C0220GoogleApi(@RecentlyNonNull Activity activity, @RecentlyNonNull C0211Api<O> api, @RecentlyNonNull O o, @RecentlyNonNull Settings settings) {
        C0222GoogleApiClient googleApiClient;
        Activity activity2 = activity;
        C0211Api<O> api2 = api;
        Settings settings2 = settings;
        Object checkNotNull = C0446Preconditions.checkNotNull(activity2, "Null activity is not permitted.");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(api2, "Api must not be null.");
        Object checkNotNull3 = C0446Preconditions.checkNotNull(settings2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = activity2.getApplicationContext();
        this.zac = zaf(activity2);
        this.zad = api2;
        this.zae = o;
        this.zag = settings2.zab;
        this.zaf = C0241ApiKey.zaa(this.zad, this.zae, this.zac);
        new C0313zabp(this);
        this.zai = googleApiClient;
        this.zaa = C0248GoogleApiManager.zaa(this.zab);
        this.zah = this.zaa.zac();
        this.zaj = settings2.zaa;
        if (!(activity2 instanceof C0221GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C0272zaab.zaa(activity2, this.zaa, this.zaf);
        }
        this.zaa.zad(this);
    }

    private final <A extends C0211Api.AnyClient, T extends C0243BaseImplementation.ApiMethodImpl<? extends C0231Result, A>> T zad(int i, @NonNull T t) {
        T t2 = t;
        t2.zak();
        this.zaa.zak(this, i, t2);
        return t2;
    }

    private final <TResult, A extends C0211Api.AnyClient> Task<TResult> zae(int i, @NonNull C0267TaskApiCall<A, TResult> taskApiCall) {
        TaskCompletionSource taskCompletionSource;
        new TaskCompletionSource();
        this.zaa.zal(this, i, taskApiCall, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    @Nullable
    private static String zaf(Object obj) {
        Object obj2 = obj;
        if (C0609PlatformVersion.isAtLeastR()) {
            try {
                return (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(obj2, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            }
        }
        return null;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public C0222GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @C0206KeepForSdk
    public C0427ClientSettings.Builder createClientSettingsBuilder() {
        C0427ClientSettings.Builder builder;
        Account account;
        Set<C0235Scope> emptySet;
        C0122GoogleSignInAccount googleSignInAccount;
        new C0427ClientSettings.Builder();
        O o = this.zae;
        if (!(o instanceof C0211Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount = ((C0211Api.ApiOptions.HasGoogleSignInAccountOptions) o).getGoogleSignInAccount()) == null) {
            O o2 = this.zae;
            account = o2 instanceof C0211Api.ApiOptions.HasAccountOptions ? ((C0211Api.ApiOptions.HasAccountOptions) o2).getAccount() : null;
        } else {
            account = googleSignInAccount.getAccount();
        }
        C0427ClientSettings.Builder zaa2 = builder.zaa(account);
        O o3 = this.zae;
        if (o3 instanceof C0211Api.ApiOptions.HasGoogleSignInAccountOptions) {
            C0122GoogleSignInAccount googleSignInAccount2 = ((C0211Api.ApiOptions.HasGoogleSignInAccountOptions) o3).getGoogleSignInAccount();
            if (googleSignInAccount2 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = googleSignInAccount2.getRequestedScopes();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        C0427ClientSettings.Builder zab2 = builder.zab(emptySet);
        C0427ClientSettings.Builder zac2 = builder.zac(this.zab.getClass().getName());
        C0427ClientSettings.Builder realClientPackageName = builder.setRealClientPackageName(this.zab.getPackageName());
        return builder;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @C0206KeepForSdk
    public Task<Boolean> disconnectService() {
        return this.zaa.zaj(this);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public <A extends C0211Api.AnyClient, T extends C0243BaseImplementation.ApiMethodImpl<? extends C0231Result, A>> T doBestEffortWrite(@RecentlyNonNull T t) {
        T t2 = t;
        C0243BaseImplementation.ApiMethodImpl zad2 = zad(2, t2);
        return t2;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public <A extends C0211Api.AnyClient, T extends C0243BaseImplementation.ApiMethodImpl<? extends C0231Result, A>> T doRead(@RecentlyNonNull T t) {
        T t2 = t;
        C0243BaseImplementation.ApiMethodImpl zad2 = zad(0, t2);
        return t2;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    @Deprecated
    public <A extends C0211Api.AnyClient, T extends C0260RegisterListenerMethod<A, ?>, U extends C0269UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(@RecentlyNonNull T t, @RecentlyNonNull U u) {
        T t2 = t;
        U u2 = u;
        Object checkNotNull = C0446Preconditions.checkNotNull(t2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(u2);
        Object checkNotNull3 = C0446Preconditions.checkNotNull(t2.getListenerKey(), "Listener has already been released.");
        Object checkNotNull4 = C0446Preconditions.checkNotNull(u2.getListenerKey(), "Listener has already been released.");
        C0446Preconditions.checkArgument(C0444Objects.equal(t2.getListenerKey(), u2.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.zan(this, t2, u2, C0378zac.zaa);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public Task<Boolean> doUnregisterEventListener(@RecentlyNonNull C0254ListenerHolder.ListenerKey<?> listenerKey) {
        return doUnregisterEventListener(listenerKey, 0);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public <A extends C0211Api.AnyClient, T extends C0243BaseImplementation.ApiMethodImpl<? extends C0231Result, A>> T doWrite(@RecentlyNonNull T t) {
        T t2 = t;
        C0243BaseImplementation.ApiMethodImpl zad2 = zad(1, t2);
        return t2;
    }

    @RecentlyNonNull
    public final C0241ApiKey<O> getApiKey() {
        return this.zaf;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public O getApiOptions() {
        return this.zae;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public Context getApplicationContext() {
        return this.zab;
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    @RecentlyNullable
    public String getContextAttributionTag() {
        return this.zac;
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    @Deprecated
    @RecentlyNullable
    public String getContextFeatureId() {
        return this.zac;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public Looper getLooper() {
        return this.zag;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public <L> C0254ListenerHolder<L> registerListener(@RecentlyNonNull L l, @RecentlyNonNull String str) {
        return C0255ListenerHolders.createListenerHolder(l, this.zag, str);
    }

    @WorkerThread
    public final C0211Api.Client zaa(Looper looper, C0309zabl<O> zabl) {
        C0309zabl<O> zabl2 = zabl;
        C0211Api.Client buildClient = ((C0211Api.AbstractClientBuilder) C0446Preconditions.checkNotNull(this.zad.zab())).buildClient(this.zab, looper, createClientSettingsBuilder().build(), this.zae, (C0222GoogleApiClient.ConnectionCallbacks) zabl2, (C0222GoogleApiClient.OnConnectionFailedListener) zabl2);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof C0424BaseGmsClient)) {
            ((C0424BaseGmsClient) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof C0256NonGmsServiceBrokerClient)) {
            ((C0256NonGmsServiceBrokerClient) buildClient).zaa(contextAttributionTag);
        }
        return buildClient;
    }

    public final int zab() {
        return this.zah;
    }

    public final C0339zaco zac(Context context, Handler handler) {
        C0339zaco zaco;
        new C0339zaco(context, handler, createClientSettingsBuilder().build());
        return zaco;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public <TResult, A extends C0211Api.AnyClient> Task<TResult> doBestEffortWrite(@RecentlyNonNull C0267TaskApiCall<A, TResult> taskApiCall) {
        return zae(2, taskApiCall);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public <TResult, A extends C0211Api.AnyClient> Task<TResult> doRead(@RecentlyNonNull C0267TaskApiCall<A, TResult> taskApiCall) {
        return zae(0, taskApiCall);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public Task<Boolean> doUnregisterEventListener(@RecentlyNonNull C0254ListenerHolder.ListenerKey<?> listenerKey, int i) {
        C0254ListenerHolder.ListenerKey<?> listenerKey2 = listenerKey;
        Object checkNotNull = C0446Preconditions.checkNotNull(listenerKey2, "Listener key cannot be null.");
        return this.zaa.zao(this, listenerKey2, i);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public <TResult, A extends C0211Api.AnyClient> Task<TResult> doWrite(@RecentlyNonNull C0267TaskApiCall<A, TResult> taskApiCall) {
        return zae(1, taskApiCall);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public <A extends C0211Api.AnyClient> Task<Void> doRegisterEventListener(@RecentlyNonNull C0261RegistrationMethods<A, ?> registrationMethods) {
        C0261RegistrationMethods<A, ?> registrationMethods2 = registrationMethods;
        Object checkNotNull = C0446Preconditions.checkNotNull(registrationMethods2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(registrationMethods2.register.getListenerKey(), "Listener has already been released.");
        Object checkNotNull3 = C0446Preconditions.checkNotNull(registrationMethods2.zaa.getListenerKey(), "Listener has already been released.");
        return this.zaa.zan(this, registrationMethods2.register, registrationMethods2.zaa, registrationMethods2.zab);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0220GoogleApi(@androidx.annotation.RecentlyNonNull android.app.Activity r12, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.C0211Api<O> r13, @androidx.annotation.RecentlyNonNull O r14, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.C0265StatusExceptionMapper r15) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r6 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r5 = r6
            r6 = r5
            r6.<init>()
            r6 = r5
            r7 = r4
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r6 = r6.setMapper(r7)
            r6 = r5
            r7 = r1
            android.os.Looper r7 = r7.getMainLooper()
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r6 = r6.setLooper(r7)
            r6 = r0
            r7 = r1
            r8 = r2
            r9 = r3
            r10 = r5
            com.google.android.gms.common.api.GoogleApi$Settings r10 = r10.build()
            r6.<init>((android.app.Activity) r7, r8, r9, (com.google.android.gms.common.api.C0220GoogleApi.Settings) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C0220GoogleApi.<init>(android.app.Activity, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0220GoogleApi(@androidx.annotation.RecentlyNonNull android.content.Context r13, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.C0211Api<O> r14, @androidx.annotation.RecentlyNonNull O r15, @androidx.annotation.RecentlyNonNull android.os.Looper r16, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.C0265StatusExceptionMapper r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r7 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r6 = r7
            r7 = r6
            r7.<init>()
            r7 = r6
            r8 = r4
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r7 = r7.setLooper(r8)
            r7 = r6
            r8 = r5
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r7 = r7.setMapper(r8)
            r7 = r0
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r6
            com.google.android.gms.common.api.GoogleApi$Settings r11 = r11.build()
            r7.<init>((android.content.Context) r8, r9, r10, (com.google.android.gms.common.api.C0220GoogleApi.Settings) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C0220GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, android.os.Looper, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    @C0206KeepForSdk
    public C0220GoogleApi(@RecentlyNonNull Context context, @RecentlyNonNull C0211Api<O> api, @RecentlyNonNull O o, @RecentlyNonNull Settings settings) {
        C0222GoogleApiClient googleApiClient;
        Context context2 = context;
        C0211Api<O> api2 = api;
        Settings settings2 = settings;
        Object checkNotNull = C0446Preconditions.checkNotNull(context2, "Null context is not permitted.");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(api2, "Api must not be null.");
        Object checkNotNull3 = C0446Preconditions.checkNotNull(settings2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = context2.getApplicationContext();
        this.zac = zaf(context2);
        this.zad = api2;
        this.zae = o;
        this.zag = settings2.zab;
        this.zaf = C0241ApiKey.zaa(this.zad, this.zae, this.zac);
        new C0313zabp(this);
        this.zai = googleApiClient;
        this.zaa = C0248GoogleApiManager.zaa(this.zab);
        this.zah = this.zaa.zac();
        this.zaj = settings2.zaa;
        this.zaa.zad(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0220GoogleApi(@androidx.annotation.RecentlyNonNull android.content.Context r12, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.C0211Api<O> r13, @androidx.annotation.RecentlyNonNull O r14, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.C0265StatusExceptionMapper r15) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r6 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r5 = r6
            r6 = r5
            r6.<init>()
            r6 = r5
            r7 = r4
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r6 = r6.setMapper(r7)
            r6 = r0
            r7 = r1
            r8 = r2
            r9 = r3
            r10 = r5
            com.google.android.gms.common.api.GoogleApi$Settings r10 = r10.build()
            r6.<init>((android.content.Context) r7, r8, r9, (com.google.android.gms.common.api.C0220GoogleApi.Settings) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C0220GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }
}
