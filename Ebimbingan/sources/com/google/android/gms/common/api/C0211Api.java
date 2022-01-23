package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api.ApiOptions;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.internal.C0245ConnectionCallbacks;
import com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener;
import com.google.android.gms.common.internal.C0424BaseGmsClient;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0437IAccountAccessor;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.Api */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0211Api<O extends ApiOptions> {
    private final AbstractClientBuilder<?, O> zaa;
    private final ClientKey<?> zab;
    private final String zac;

    @C0206KeepForSdk
    @C0617VisibleForTesting
    /* renamed from: com.google.android.gms.common.api.Api$AbstractClientBuilder */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        public AbstractClientBuilder() {
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        @Deprecated
        public T buildClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull C0427ClientSettings clientSettings, @RecentlyNonNull O o, @RecentlyNonNull C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks, @RecentlyNonNull C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return buildClient(context, looper, clientSettings, o, (C0245ConnectionCallbacks) connectionCallbacks, (C0257OnConnectionFailedListener) onConnectionFailedListener);
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public T buildClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull C0427ClientSettings clientSettings, @RecentlyNonNull O o, @RecentlyNonNull C0245ConnectionCallbacks connectionCallbacks, @RecentlyNonNull C0257OnConnectionFailedListener onConnectionFailedListener) {
            Throwable th;
            Context context2 = context;
            Looper looper2 = looper;
            C0427ClientSettings clientSettings2 = clientSettings;
            O o2 = o;
            C0245ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
            C0257OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
            new UnsupportedOperationException("buildClient must be implemented");
            throw th;
        }
    }

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.api.Api$AnyClient */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface AnyClient {
    }

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.api.Api$AnyClientKey */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class AnyClientKey<C extends AnyClient> {
        public AnyClientKey() {
        }
    }

    /* renamed from: com.google.android.gms.common.api.Api$ApiOptions */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface ApiOptions {
        @RecentlyNonNull
        public static final NoOptions NO_OPTIONS;

        /* renamed from: com.google.android.gms.common.api.Api$ApiOptions$HasAccountOptions */
        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            @RecentlyNonNull
            Account getAccount();
        }

        /* renamed from: com.google.android.gms.common.api.Api$ApiOptions$HasGoogleSignInAccountOptions */
        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public interface HasGoogleSignInAccountOptions extends HasOptions {
            @RecentlyNullable
            C0122GoogleSignInAccount getGoogleSignInAccount();
        }

        /* renamed from: com.google.android.gms.common.api.Api$ApiOptions$HasOptions */
        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public interface HasOptions extends ApiOptions {
        }

        /* renamed from: com.google.android.gms.common.api.Api$ApiOptions$NoOptions */
        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }

            /* synthetic */ NoOptions(C0376zaa zaa) {
                C0376zaa zaa2 = zaa;
            }
        }

        /* renamed from: com.google.android.gms.common.api.Api$ApiOptions$NotRequiredOptions */
        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public interface NotRequiredOptions extends ApiOptions {
        }

        /* renamed from: com.google.android.gms.common.api.Api$ApiOptions$Optional */
        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public interface Optional extends HasOptions, NotRequiredOptions {
        }

        static {
            NoOptions noOptions;
            new NoOptions((C0376zaa) null);
            NO_OPTIONS = noOptions;
        }
    }

    @C0206KeepForSdk
    @C0617VisibleForTesting
    /* renamed from: com.google.android.gms.common.api.Api$BaseClientBuilder */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
        @C0206KeepForSdk
        public static final int API_PRIORITY_GAMES = 1;
        @C0206KeepForSdk
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        @C0206KeepForSdk
        public static final int API_PRIORITY_PLUS = 2;

        public BaseClientBuilder() {
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public List<C0235Scope> getImpliedScopes(@Nullable O o) {
            O o2 = o;
            return Collections.emptyList();
        }

        @C0206KeepForSdk
        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.api.Api$Client */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface Client extends AnyClient {
        @C0206KeepForSdk
        void connect(@RecentlyNonNull C0424BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        @C0206KeepForSdk
        void disconnect();

        @C0206KeepForSdk
        void disconnect(@RecentlyNonNull String str);

        @C0206KeepForSdk
        void dump(@RecentlyNonNull String str, @Nullable FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @Nullable String[] strArr);

        @RecentlyNonNull
        @C0206KeepForSdk
        C0186Feature[] getAvailableFeatures();

        @RecentlyNonNull
        @C0206KeepForSdk
        String getEndpointPackageName();

        @C0206KeepForSdk
        @RecentlyNullable
        String getLastDisconnectMessage();

        @C0206KeepForSdk
        int getMinApkVersion();

        @C0206KeepForSdk
        void getRemoteService(@Nullable C0437IAccountAccessor iAccountAccessor, @Nullable Set<C0235Scope> set);

        @RecentlyNonNull
        @C0206KeepForSdk
        C0186Feature[] getRequiredFeatures();

        @NonNull
        @C0206KeepForSdk
        Set<C0235Scope> getScopesForConnectionlessNonSignIn();

        @C0206KeepForSdk
        @RecentlyNullable
        IBinder getServiceBrokerBinder();

        @RecentlyNonNull
        @C0206KeepForSdk
        Intent getSignInIntent();

        @C0206KeepForSdk
        boolean isConnected();

        @C0206KeepForSdk
        boolean isConnecting();

        @C0206KeepForSdk
        void onUserSignOut(@RecentlyNonNull C0424BaseGmsClient.SignOutCallbacks signOutCallbacks);

        @C0206KeepForSdk
        boolean providesSignIn();

        @C0206KeepForSdk
        boolean requiresAccount();

        @C0206KeepForSdk
        boolean requiresGooglePlayServices();

        @C0206KeepForSdk
        boolean requiresSignIn();
    }

    @C0206KeepForSdk
    @C0617VisibleForTesting
    /* renamed from: com.google.android.gms.common.api.Api$ClientKey */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
        public ClientKey() {
        }
    }

    @C0206KeepForSdk
    public <C extends Client> C0211Api(@RecentlyNonNull String str, @RecentlyNonNull AbstractClientBuilder<C, O> abstractClientBuilder, @RecentlyNonNull ClientKey<C> clientKey) {
        AbstractClientBuilder<C, O> abstractClientBuilder2 = abstractClientBuilder;
        ClientKey<C> clientKey2 = clientKey;
        C checkNotNull = C0446Preconditions.checkNotNull(abstractClientBuilder2, "Cannot construct an Api with a null ClientBuilder");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(clientKey2, "Cannot construct an Api with a null ClientKey");
        this.zac = str;
        this.zaa = abstractClientBuilder2;
        this.zab = clientKey2;
    }

    @RecentlyNonNull
    public final BaseClientBuilder<?, O> zaa() {
        return this.zaa;
    }

    @RecentlyNonNull
    public final AbstractClientBuilder<?, O> zab() {
        return this.zaa;
    }

    @RecentlyNonNull
    public final AnyClientKey<?> zac() {
        return this.zab;
    }

    @RecentlyNonNull
    public final String zad() {
        return this.zac;
    }
}
