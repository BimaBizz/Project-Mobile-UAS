package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.C0189GoogleApiAvailability;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.common.api.internal.C0245ConnectionCallbacks;
import com.google.android.gms.common.api.internal.C0251LifecycleActivity;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.C0263SignInConnectionListener;
import com.google.android.gms.common.api.internal.C0346zacv;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0486zab;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.signin.C1134SignInOptions;
import com.google.android.gms.signin.C1151zad;
import com.google.android.gms.signin.C1152zae;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

@C0206KeepForSdk
@Deprecated
/* renamed from: com.google.android.gms.common.api.GoogleApiClient */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0222GoogleApiClient {
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    /* access modifiers changed from: private */
    @GuardedBy("sAllClients")
    public static final Set<C0222GoogleApiClient> zaa;

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface ConnectionCallbacks extends C0245ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface OnConnectionFailedListener extends C0257OnConnectionFailedListener {
    }

    static {
        Map map;
        new WeakHashMap();
        zaa = Collections.newSetFromMap(map);
    }

    public C0222GoogleApiClient() {
    }

    /* JADX INFO: finally extract failed */
    public static void dumpAll(@RecentlyNonNull String str, @RecentlyNonNull FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @RecentlyNonNull String[] strArr) {
        String str2 = str;
        FileDescriptor fileDescriptor2 = fileDescriptor;
        PrintWriter printWriter2 = printWriter;
        String[] strArr2 = strArr;
        Set<C0222GoogleApiClient> set = zaa;
        synchronized (set) {
            try {
                String concat = String.valueOf(str2).concat("  ");
                int i = 0;
                for (C0222GoogleApiClient next : zaa) {
                    printWriter2.append(str2).append("GoogleApiClient#").println(i);
                    next.dump(concat, fileDescriptor2, printWriter2, strArr2);
                    i++;
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Set<C0222GoogleApiClient> set2 = set;
                throw th2;
            }
        }
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static Set<C0222GoogleApiClient> getAllClients() {
        Set<C0222GoogleApiClient> set;
        Set<C0222GoogleApiClient> set2 = zaa;
        synchronized (set2) {
            try {
                set = zaa;
            } catch (Throwable th) {
                Throwable th2 = th;
                Set<C0222GoogleApiClient> set3 = set2;
                throw th2;
            }
        }
        return set;
    }

    @RecentlyNonNull
    public abstract C0184ConnectionResult blockingConnect();

    @RecentlyNonNull
    public abstract C0184ConnectionResult blockingConnect(long j, @RecentlyNonNull TimeUnit timeUnit);

    @RecentlyNonNull
    public abstract C0225PendingResult<C0236Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i) {
        Throwable th;
        int i2 = i;
        new UnsupportedOperationException();
        throw th;
    }

    public abstract void disconnect();

    public abstract void dump(@RecentlyNonNull String str, @RecentlyNonNull FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @RecentlyNonNull String[] strArr);

    @RecentlyNonNull
    @C0206KeepForSdk
    public <A extends C0211Api.AnyClient, R extends C0231Result, T extends C0243BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@RecentlyNonNull T t) {
        Throwable th;
        T t2 = t;
        new UnsupportedOperationException();
        throw th;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public <A extends C0211Api.AnyClient, T extends C0243BaseImplementation.ApiMethodImpl<? extends C0231Result, A>> T execute(@RecentlyNonNull T t) {
        Throwable th;
        T t2 = t;
        new UnsupportedOperationException();
        throw th;
    }

    @NonNull
    @C0206KeepForSdk
    public <C extends C0211Api.Client> C getClient(@RecentlyNonNull C0211Api.AnyClientKey<C> anyClientKey) {
        Throwable th;
        C0211Api.AnyClientKey<C> anyClientKey2 = anyClientKey;
        new UnsupportedOperationException();
        throw th;
    }

    @NonNull
    public abstract C0184ConnectionResult getConnectionResult(@RecentlyNonNull C0211Api<?> api);

    @RecentlyNonNull
    @C0206KeepForSdk
    public Context getContext() {
        Throwable th;
        new UnsupportedOperationException();
        throw th;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public Looper getLooper() {
        Throwable th;
        new UnsupportedOperationException();
        throw th;
    }

    @C0206KeepForSdk
    public boolean hasApi(@RecentlyNonNull C0211Api<?> api) {
        Throwable th;
        C0211Api<?> api2 = api;
        new UnsupportedOperationException();
        throw th;
    }

    public abstract boolean hasConnectedApi(@RecentlyNonNull C0211Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(@RecentlyNonNull ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(@RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener);

    @C0206KeepForSdk
    public boolean maybeSignIn(@RecentlyNonNull C0263SignInConnectionListener signInConnectionListener) {
        Throwable th;
        C0263SignInConnectionListener signInConnectionListener2 = signInConnectionListener;
        new UnsupportedOperationException();
        throw th;
    }

    @C0206KeepForSdk
    public void maybeSignOut() {
        Throwable th;
        new UnsupportedOperationException();
        throw th;
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(@RecentlyNonNull ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(@RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener);

    @RecentlyNonNull
    @C0206KeepForSdk
    public <L> C0254ListenerHolder<L> registerListener(@RecentlyNonNull L l) {
        Throwable th;
        L l2 = l;
        new UnsupportedOperationException();
        throw th;
    }

    public abstract void stopAutoManage(@RecentlyNonNull FragmentActivity fragmentActivity);

    public abstract void unregisterConnectionCallbacks(@RecentlyNonNull ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(@RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener);

    public void zao(C0346zacv zacv) {
        Throwable th;
        C0346zacv zacv2 = zacv;
        new UnsupportedOperationException();
        throw th;
    }

    public void zap(C0346zacv zacv) {
        Throwable th;
        C0346zacv zacv2 = zacv;
        new UnsupportedOperationException();
        throw th;
    }

    @C0206KeepForSdk
    @Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$Builder */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static final class Builder {
        @Nullable
        private Account zaa;
        private final Set<C0235Scope> zab;
        private final Set<C0235Scope> zac;
        private int zad;
        private View zae;
        private String zaf;
        private String zag;
        private final Map<C0211Api<?>, C0486zab> zah;
        private final Context zai;
        private final Map<C0211Api<?>, C0211Api.ApiOptions> zaj;
        private C0251LifecycleActivity zak;
        private int zal;
        @Nullable
        private OnConnectionFailedListener zam;
        private Looper zan;
        private C0189GoogleApiAvailability zao;
        private C0211Api.AbstractClientBuilder<? extends C1152zae, C1134SignInOptions> zap;
        private final ArrayList<ConnectionCallbacks> zaq;
        private final ArrayList<OnConnectionFailedListener> zar;

        /* JADX WARNING: Multi-variable type inference failed */
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(@androidx.annotation.RecentlyNonNull android.content.Context r6) {
            /*
                r5 = this;
                r0 = r5
                r1 = r6
                r3 = r0
                r3.<init>()
                java.util.HashSet r3 = new java.util.HashSet
                r2 = r3
                r3 = r2
                r3.<init>()
                r3 = r0
                r4 = r2
                r3.zab = r4
                java.util.HashSet r3 = new java.util.HashSet
                r2 = r3
                r3 = r2
                r3.<init>()
                r3 = r0
                r4 = r2
                r3.zac = r4
                androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
                r2 = r3
                r3 = r2
                r3.<init>()
                r3 = r0
                r4 = r2
                r3.zah = r4
                androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
                r2 = r3
                r3 = r2
                r3.<init>()
                r3 = r0
                r4 = r2
                r3.zaj = r4
                r3 = r0
                r4 = -1
                r3.zal = r4
                r3 = r0
                com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.C0189GoogleApiAvailability.getInstance()
                r3.zao = r4
                r3 = r0
                com.google.android.gms.common.api.Api$AbstractClientBuilder<com.google.android.gms.signin.internal.SignInClientImpl, com.google.android.gms.signin.SignInOptions> r4 = com.google.android.gms.signin.C1151zad.zac
                r3.zap = r4
                java.util.ArrayList r3 = new java.util.ArrayList
                r2 = r3
                r3 = r2
                r3.<init>()
                r3 = r0
                r4 = r2
                r3.zaq = r4
                java.util.ArrayList r3 = new java.util.ArrayList
                r2 = r3
                r3 = r2
                r3.<init>()
                r3 = r0
                r4 = r2
                r3.zar = r4
                r3 = r0
                r4 = r1
                r3.zai = r4
                r3 = r0
                r4 = r1
                android.os.Looper r4 = r4.getMainLooper()
                r3.zan = r4
                r3 = r0
                r4 = r1
                java.lang.String r4 = r4.getPackageName()
                r3.zaf = r4
                r3 = r0
                r4 = r1
                java.lang.Class r4 = r4.getClass()
                java.lang.String r4 = r4.getName()
                r3.zag = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C0222GoogleApiClient.Builder.<init>(android.content.Context):void");
        }

        private final <O extends C0211Api.ApiOptions> void zaa(C0211Api<O> api, @Nullable O o, C0235Scope... scopeArr) {
            Set set;
            Object obj;
            C0211Api<O> api2 = api;
            C0235Scope[] scopeArr2 = scopeArr;
            new HashSet(((C0211Api.BaseClientBuilder) C0446Preconditions.checkNotNull(api2.zaa(), "Base client builder must not be null")).getImpliedScopes(o));
            int length = scopeArr2.length;
            for (int i = 0; i < length; i++) {
                boolean add = set.add(scopeArr2[i]);
            }
            Map<C0211Api<?>, C0486zab> map = this.zah;
            new C0486zab(set);
            C0486zab put = map.put(api2, obj);
        }

        @RecentlyNonNull
        public Builder addApi(@RecentlyNonNull C0211Api<? extends C0211Api.ApiOptions.NotRequiredOptions> api) {
            C0211Api<? extends C0211Api.ApiOptions.NotRequiredOptions> api2 = api;
            Object checkNotNull = C0446Preconditions.checkNotNull(api2, "Api must not be null");
            C0211Api.ApiOptions put = this.zaj.put(api2, (Object) null);
            List<C0235Scope> impliedScopes = ((C0211Api.BaseClientBuilder) C0446Preconditions.checkNotNull(api2.zaa(), "Base client builder must not be null")).getImpliedScopes(null);
            boolean addAll = this.zac.addAll(impliedScopes);
            boolean addAll2 = this.zab.addAll(impliedScopes);
            return this;
        }

        @RecentlyNonNull
        public <O extends C0211Api.ApiOptions.HasOptions> Builder addApiIfAvailable(@RecentlyNonNull C0211Api<O> api, @RecentlyNonNull O o, @RecentlyNonNull C0235Scope... scopeArr) {
            C0211Api<O> api2 = api;
            O o2 = o;
            Object checkNotNull = C0446Preconditions.checkNotNull(api2, "Api must not be null");
            Object checkNotNull2 = C0446Preconditions.checkNotNull(o2, "Null options are not permitted for this Api");
            C0211Api.ApiOptions put = this.zaj.put(api2, o2);
            zaa(api2, o2, scopeArr);
            return this;
        }

        @RecentlyNonNull
        public Builder addConnectionCallbacks(@RecentlyNonNull ConnectionCallbacks connectionCallbacks) {
            ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
            Object checkNotNull = C0446Preconditions.checkNotNull(connectionCallbacks2, "Listener must not be null");
            boolean add = this.zaq.add(connectionCallbacks2);
            return this;
        }

        @RecentlyNonNull
        public Builder addOnConnectionFailedListener(@RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener) {
            OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
            Object checkNotNull = C0446Preconditions.checkNotNull(onConnectionFailedListener2, "Listener must not be null");
            boolean add = this.zar.add(onConnectionFailedListener2);
            return this;
        }

        @RecentlyNonNull
        public Builder addScope(@RecentlyNonNull C0235Scope scope) {
            C0235Scope scope2 = scope;
            Object checkNotNull = C0446Preconditions.checkNotNull(scope2, "Scope must not be null");
            boolean add = this.zab.add(scope2);
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder addScopeNames(@RecentlyNonNull String[] strArr) {
            Object obj;
            String[] strArr2 = strArr;
            for (int i = 0; i < strArr2.length; i++) {
                Set<C0235Scope> set = this.zab;
                new C0235Scope(strArr2[i]);
                boolean add = set.add(obj);
            }
            return this;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: type inference failed for: r20v2, types: [com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener] */
        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.common.api.C0222GoogleApiClient build() {
            /*
                r28 = this;
                r1 = r28
                r14 = r1
                java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.api.Api$ApiOptions> r14 = r14.zaj
                boolean r14 = r14.isEmpty()
                r15 = 1
                r14 = r14 ^ 1
                java.lang.String r15 = "must call addApi() to add at least one API"
                com.google.android.gms.common.internal.C0446Preconditions.checkArgument(r14, r15)
                r14 = r1
                com.google.android.gms.common.internal.ClientSettings r14 = r14.buildClientSettings()
                r5 = r14
                r14 = r5
                java.util.Map r14 = r14.zaa()
                r6 = r14
                androidx.collection.ArrayMap r14 = new androidx.collection.ArrayMap
                r7 = r14
                r14 = r7
                r14.<init>()
                androidx.collection.ArrayMap r14 = new androidx.collection.ArrayMap
                r8 = r14
                r14 = r8
                r14.<init>()
                java.util.ArrayList r14 = new java.util.ArrayList
                r9 = r14
                r14 = r9
                r14.<init>()
                r14 = r1
                java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.api.Api$ApiOptions> r14 = r14.zaj
                java.util.Set r14 = r14.keySet()
                java.util.Iterator r14 = r14.iterator()
                r10 = r14
                r14 = 0
                r2 = r14
                r14 = 0
                r3 = r14
            L_0x0043:
                r14 = r10
                boolean r14 = r14.hasNext()
                if (r14 == 0) goto L_0x00d3
                r14 = r10
                java.lang.Object r14 = r14.next()
                com.google.android.gms.common.api.Api r14 = (com.google.android.gms.common.api.C0211Api) r14
                r11 = r14
                r14 = r1
                java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.api.Api$ApiOptions> r14 = r14.zaj
                r15 = r11
                java.lang.Object r14 = r14.get(r15)
                r12 = r14
                r14 = r6
                r15 = r11
                java.lang.Object r14 = r14.get(r15)
                if (r14 == 0) goto L_0x00d0
                r14 = 1
                r4 = r14
            L_0x0065:
                r14 = r7
                r15 = r11
                r16 = r4
                java.lang.Boolean r16 = java.lang.Boolean.valueOf(r16)
                java.lang.Object r14 = r14.put(r15, r16)
                com.google.android.gms.common.api.internal.zas r14 = new com.google.android.gms.common.api.internal.zas
                r13 = r14
                r14 = r13
                r15 = r11
                r16 = r4
                r14.<init>(r15, r16)
                r14 = r9
                r15 = r13
                boolean r14 = r14.add(r15)
                r14 = r11
                com.google.android.gms.common.api.Api$AbstractClientBuilder r14 = r14.zab()
                java.lang.Object r14 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r14)
                com.google.android.gms.common.api.Api$AbstractClientBuilder r14 = (com.google.android.gms.common.api.C0211Api.AbstractClientBuilder) r14
                r4 = r14
                r14 = r4
                r15 = r1
                android.content.Context r15 = r15.zai
                r16 = r1
                r0 = r16
                android.os.Looper r0 = r0.zan
                r16 = r0
                r17 = r5
                r18 = r12
                r19 = r13
                r20 = r13
                com.google.android.gms.common.api.Api$Client r14 = r14.buildClient((android.content.Context) r15, (android.os.Looper) r16, (com.google.android.gms.common.internal.C0427ClientSettings) r17, r18, (com.google.android.gms.common.api.C0222GoogleApiClient.ConnectionCallbacks) r19, (com.google.android.gms.common.api.C0222GoogleApiClient.OnConnectionFailedListener) r20)
                r13 = r14
                r14 = r8
                r15 = r11
                com.google.android.gms.common.api.Api$AnyClientKey r15 = r15.zac()
                r16 = r13
                java.lang.Object r14 = r14.put(r15, r16)
                r14 = r4
                int r14 = r14.getPriority()
                r15 = 1
                if (r14 != r15) goto L_0x00bf
                r14 = r12
                if (r14 == 0) goto L_0x00cd
                r14 = 1
                r3 = r14
            L_0x00bf:
                r14 = r13
                boolean r14 = r14.providesSignIn()
                if (r14 == 0) goto L_0x0043
                r14 = r2
                if (r14 != 0) goto L_0x01f0
                r14 = r11
                r2 = r14
                goto L_0x0043
            L_0x00cd:
                r14 = 0
                r3 = r14
                goto L_0x00bf
            L_0x00d0:
                r14 = 0
                r4 = r14
                goto L_0x0065
            L_0x00d3:
                r14 = r2
                if (r14 == 0) goto L_0x015f
                r14 = r3
                if (r14 == 0) goto L_0x011b
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                r1 = r14
                r14 = r2
                java.lang.String r14 = r14.zad()
                r2 = r14
                r14 = r2
                java.lang.String r14 = java.lang.String.valueOf(r14)
                r3 = r14
                r14 = r3
                int r14 = r14.length()
                r3 = r14
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r4 = r14
                r14 = r4
                r15 = r3
                r16 = 82
                int r15 = r15 + 82
                r14.<init>(r15)
                r14 = r4
                java.lang.String r15 = "With using "
                java.lang.StringBuilder r14 = r14.append(r15)
                r14 = r4
                r15 = r2
                java.lang.StringBuilder r14 = r14.append(r15)
                r14 = r4
                java.lang.String r15 = ", GamesOptions can only be specified within GoogleSignInOptions.Builder"
                java.lang.StringBuilder r14 = r14.append(r15)
                r14 = r1
                r15 = r4
                java.lang.String r15 = r15.toString()
                r14.<init>(r15)
                r14 = r1
                throw r14
            L_0x011b:
                r14 = r1
                android.accounts.Account r14 = r14.zaa
                if (r14 != 0) goto L_0x01ec
                r14 = 1
                r3 = r14
            L_0x0122:
                r14 = 1
                java.lang.Object[] r14 = new java.lang.Object[r14]
                r4 = r14
                r14 = r4
                r15 = 0
                r16 = r2
                java.lang.String r16 = r16.zad()
                r14[r15] = r16
                r14 = r3
                java.lang.String r15 = "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead"
                r16 = r4
                com.google.android.gms.common.internal.C0446Preconditions.checkState(r14, r15, r16)
                r14 = r1
                java.util.Set<com.google.android.gms.common.api.Scope> r14 = r14.zab
                r3 = r14
                r14 = r1
                java.util.Set<com.google.android.gms.common.api.Scope> r14 = r14.zac
                r4 = r14
                r14 = r3
                r15 = r4
                boolean r14 = r14.equals(r15)
                r3 = r14
                r14 = 1
                java.lang.Object[] r14 = new java.lang.Object[r14]
                r4 = r14
                r14 = r4
                r15 = 0
                r16 = r2
                java.lang.String r16 = r16.zad()
                r14[r15] = r16
                r14 = r3
                java.lang.String r15 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
                r16 = r4
                com.google.android.gms.common.internal.C0446Preconditions.checkState(r14, r15, r16)
            L_0x015f:
                r14 = r8
                java.util.Collection r14 = r14.values()
                r2 = r14
                r14 = r2
                r15 = 1
                int r14 = com.google.android.gms.common.api.internal.C0296zaaz.zaf(r14, r15)
                r2 = r14
                com.google.android.gms.common.api.internal.zaaz r14 = new com.google.android.gms.common.api.internal.zaaz
                r3 = r14
                r14 = r1
                android.content.Context r14 = r14.zai
                r4 = r14
                java.util.concurrent.locks.ReentrantLock r14 = new java.util.concurrent.locks.ReentrantLock
                r6 = r14
                r14 = r6
                r14.<init>()
                r14 = r3
                r15 = r4
                r16 = r6
                r17 = r1
                r0 = r17
                android.os.Looper r0 = r0.zan
                r17 = r0
                r18 = r5
                r19 = r1
                r0 = r19
                com.google.android.gms.common.GoogleApiAvailability r0 = r0.zao
                r19 = r0
                r20 = r1
                r0 = r20
                com.google.android.gms.common.api.Api$AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> r0 = r0.zap
                r20 = r0
                r21 = r7
                r22 = r1
                r0 = r22
                java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r0 = r0.zaq
                r22 = r0
                r23 = r1
                r0 = r23
                java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener> r0 = r0.zar
                r23 = r0
                r24 = r8
                r25 = r1
                r0 = r25
                int r0 = r0.zal
                r25 = r0
                r26 = r2
                r27 = r9
                r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                java.util.Set r14 = com.google.android.gms.common.api.C0222GoogleApiClient.zaa
                r2 = r14
                r14 = r2
                monitor-enter(r14)
                java.util.Set r14 = com.google.android.gms.common.api.C0222GoogleApiClient.zaa     // Catch:{ all -> 0x0246 }
                r15 = r3
                boolean r14 = r14.add(r15)     // Catch:{ all -> 0x0246 }
                r14 = r2
                monitor-exit(r14)     // Catch:{ all -> 0x0246 }
                r14 = r1
                int r14 = r14.zal
                if (r14 < 0) goto L_0x01e9
                r14 = r1
                com.google.android.gms.common.api.internal.LifecycleActivity r14 = r14.zak
                com.google.android.gms.common.api.internal.zak r14 = com.google.android.gms.common.api.internal.C0356zak.zaa(r14)
                r15 = r1
                int r15 = r15.zal
                r16 = r3
                r17 = r1
                r0 = r17
                com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r0 = r0.zam
                r17 = r0
                r14.zab(r15, r16, r17)
            L_0x01e9:
                r14 = r3
                r1 = r14
                return r1
            L_0x01ec:
                r14 = 0
                r3 = r14
                goto L_0x0122
            L_0x01f0:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                r1 = r14
                r14 = r11
                java.lang.String r14 = r14.zad()
                r3 = r14
                r14 = r2
                java.lang.String r14 = r14.zad()
                r2 = r14
                r14 = r3
                java.lang.String r14 = java.lang.String.valueOf(r14)
                r4 = r14
                r14 = r4
                int r14 = r14.length()
                r4 = r14
                r14 = r2
                java.lang.String r14 = java.lang.String.valueOf(r14)
                r5 = r14
                r14 = r5
                int r14 = r14.length()
                r5 = r14
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r6 = r14
                r14 = r6
                r15 = r4
                r16 = 21
                int r15 = r15 + 21
                r16 = r5
                int r15 = r15 + r16
                r14.<init>(r15)
                r14 = r6
                r15 = r3
                java.lang.StringBuilder r14 = r14.append(r15)
                r14 = r6
                java.lang.String r15 = " cannot be used with "
                java.lang.StringBuilder r14 = r14.append(r15)
                r14 = r6
                r15 = r2
                java.lang.StringBuilder r14 = r14.append(r15)
                r14 = r1
                r15 = r6
                java.lang.String r15 = r15.toString()
                r14.<init>(r15)
                r14 = r1
                throw r14
            L_0x0246:
                r14 = move-exception
                r1 = r14
                r14 = r2
                monitor-exit(r14)     // Catch:{ all -> 0x0246 }
                r14 = r1
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C0222GoogleApiClient.Builder.build():com.google.android.gms.common.api.GoogleApiClient");
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        @C0617VisibleForTesting
        public C0427ClientSettings buildClientSettings() {
            C0427ClientSettings clientSettings;
            C1134SignInOptions signInOptions = C1134SignInOptions.zaa;
            if (this.zaj.containsKey(C1151zad.zag)) {
                signInOptions = (C1134SignInOptions) this.zaj.get(C1151zad.zag);
            }
            new C0427ClientSettings(this.zaa, this.zab, this.zah, this.zad, this.zae, this.zaf, this.zag, signInOptions, false);
            return clientSettings;
        }

        @RecentlyNonNull
        public Builder enableAutoManage(@RecentlyNonNull FragmentActivity fragmentActivity, int i, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            C0251LifecycleActivity lifecycleActivity;
            boolean z;
            int i2 = i;
            OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
            new C0251LifecycleActivity((Activity) fragmentActivity);
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            C0446Preconditions.checkArgument(z, "clientId must be non-negative");
            this.zal = i2;
            this.zam = onConnectionFailedListener2;
            this.zak = lifecycleActivity;
            return this;
        }

        @RecentlyNonNull
        public Builder setAccountName(@RecentlyNonNull String str) {
            Account account;
            Account account2;
            String str2 = str;
            if (str2 == null) {
                account2 = null;
            } else {
                new Account(str2, "com.google");
                account2 = account;
            }
            this.zaa = account2;
            return this;
        }

        @RecentlyNonNull
        public Builder setGravityForPopups(int i) {
            this.zad = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setHandler(@RecentlyNonNull Handler handler) {
            Handler handler2 = handler;
            Object checkNotNull = C0446Preconditions.checkNotNull(handler2, "Handler must not be null");
            this.zan = handler2.getLooper();
            return this;
        }

        @RecentlyNonNull
        public Builder setViewForPopups(@RecentlyNonNull View view) {
            View view2 = view;
            Object checkNotNull = C0446Preconditions.checkNotNull(view2, "View must not be null");
            this.zae = view2;
            return this;
        }

        @RecentlyNonNull
        public Builder useDefaultAccount() {
            Builder accountName = setAccountName("<<default account>>");
            return this;
        }

        @RecentlyNonNull
        public Builder enableAutoManage(@RecentlyNonNull FragmentActivity fragmentActivity, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            Builder enableAutoManage = enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
            return this;
        }

        @RecentlyNonNull
        public <T extends C0211Api.ApiOptions.NotRequiredOptions> Builder addApiIfAvailable(@RecentlyNonNull C0211Api<? extends C0211Api.ApiOptions.NotRequiredOptions> api, @RecentlyNonNull C0235Scope... scopeArr) {
            C0211Api<? extends C0211Api.ApiOptions.NotRequiredOptions> api2 = api;
            Object checkNotNull = C0446Preconditions.checkNotNull(api2, "Api must not be null");
            C0211Api.ApiOptions put = this.zaj.put(api2, (Object) null);
            zaa(api2, (C0211Api.ApiOptions) null, scopeArr);
            return this;
        }

        @RecentlyNonNull
        public <O extends C0211Api.ApiOptions.HasOptions> Builder addApi(@RecentlyNonNull C0211Api<O> api, @RecentlyNonNull O o) {
            C0211Api<O> api2 = api;
            O o2 = o;
            Object checkNotNull = C0446Preconditions.checkNotNull(api2, "Api must not be null");
            Object checkNotNull2 = C0446Preconditions.checkNotNull(o2, "Null options are not permitted for this Api");
            C0211Api.ApiOptions put = this.zaj.put(api2, o2);
            List<C0235Scope> impliedScopes = ((C0211Api.BaseClientBuilder) C0446Preconditions.checkNotNull(api2.zaa(), "Base client builder must not be null")).getImpliedScopes(o2);
            boolean addAll = this.zac.addAll(impliedScopes);
            boolean addAll2 = this.zab.addAll(impliedScopes);
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        @C0206KeepForSdk
        public Builder(@RecentlyNonNull Context context, @RecentlyNonNull ConnectionCallbacks connectionCallbacks, @RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
            OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
            Object checkNotNull = C0446Preconditions.checkNotNull(connectionCallbacks2, "Must provide a connected listener");
            boolean add = this.zaq.add(connectionCallbacks2);
            Object checkNotNull2 = C0446Preconditions.checkNotNull(onConnectionFailedListener2, "Must provide a connection failed listener");
            boolean add2 = this.zar.add(onConnectionFailedListener2);
        }
    }
}
