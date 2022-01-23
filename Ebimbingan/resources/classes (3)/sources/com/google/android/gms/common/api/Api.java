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
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class Api<O extends ApiOptions> {
    private final AbstractClientBuilder<?, O> zaa;
    private final ClientKey<?> zab;
    private final String zac;

    @KeepForSdk
    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        public AbstractClientBuilder() {
        }

        @RecentlyNonNull
        @KeepForSdk
        @Deprecated
        public T buildClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull ClientSettings clientSettings, @RecentlyNonNull O o, @RecentlyNonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks, @RecentlyNonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return buildClient(context, looper, clientSettings, o, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
        }

        @RecentlyNonNull
        @KeepForSdk
        public T buildClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull ClientSettings clientSettings, @RecentlyNonNull O o, @RecentlyNonNull ConnectionCallbacks connectionCallbacks, @RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener) {
            Throwable th;
            Context context2 = context;
            Looper looper2 = looper;
            ClientSettings clientSettings2 = clientSettings;
            O o2 = o;
            ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
            OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
            new UnsupportedOperationException("buildClient must be implemented");
            throw th;
        }
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface AnyClient {
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class AnyClientKey<C extends AnyClient> {
        public AnyClientKey() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface ApiOptions {
        @RecentlyNonNull
        public static final NoOptions NO_OPTIONS;

        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            @RecentlyNonNull
            Account getAccount();
        }

        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public interface HasGoogleSignInAccountOptions extends HasOptions {
            @RecentlyNullable
            GoogleSignInAccount getGoogleSignInAccount();
        }

        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public interface HasOptions extends ApiOptions {
        }

        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }

            /* synthetic */ NoOptions(zaa zaa) {
                zaa zaa2 = zaa;
            }
        }

        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public interface NotRequiredOptions extends ApiOptions {
        }

        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public interface Optional extends HasOptions, NotRequiredOptions {
        }

        static {
            NoOptions noOptions;
            new NoOptions((zaa) null);
            NO_OPTIONS = noOptions;
        }
    }

    @KeepForSdk
    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
        @KeepForSdk
        public static final int API_PRIORITY_GAMES = 1;
        @KeepForSdk
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        @KeepForSdk
        public static final int API_PRIORITY_PLUS = 2;

        public BaseClientBuilder() {
        }

        @RecentlyNonNull
        @KeepForSdk
        public List<Scope> getImpliedScopes(@Nullable O o) {
            O o2 = o;
            return Collections.emptyList();
        }

        @KeepForSdk
        public int getPriority() {
            return API_PRIORITY_OTHER;
        }
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface Client extends AnyClient {
        @KeepForSdk
        void connect(@RecentlyNonNull BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        @KeepForSdk
        void disconnect();

        @KeepForSdk
        void disconnect(@RecentlyNonNull String str);

        @KeepForSdk
        void dump(@RecentlyNonNull String str, @Nullable FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @Nullable String[] strArr);

        @RecentlyNonNull
        @KeepForSdk
        Feature[] getAvailableFeatures();

        @RecentlyNonNull
        @KeepForSdk
        String getEndpointPackageName();

        @KeepForSdk
        @RecentlyNullable
        String getLastDisconnectMessage();

        @KeepForSdk
        int getMinApkVersion();

        @KeepForSdk
        void getRemoteService(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set);

        @RecentlyNonNull
        @KeepForSdk
        Feature[] getRequiredFeatures();

        @NonNull
        @KeepForSdk
        Set<Scope> getScopesForConnectionlessNonSignIn();

        @KeepForSdk
        @RecentlyNullable
        IBinder getServiceBrokerBinder();

        @RecentlyNonNull
        @KeepForSdk
        Intent getSignInIntent();

        @KeepForSdk
        boolean isConnected();

        @KeepForSdk
        boolean isConnecting();

        @KeepForSdk
        void onUserSignOut(@RecentlyNonNull BaseGmsClient.SignOutCallbacks signOutCallbacks);

        @KeepForSdk
        boolean providesSignIn();

        @KeepForSdk
        boolean requiresAccount();

        @KeepForSdk
        boolean requiresGooglePlayServices();

        @KeepForSdk
        boolean requiresSignIn();
    }

    @KeepForSdk
    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
        public ClientKey() {
        }
    }

    @KeepForSdk
    public <C extends Client> Api(@RecentlyNonNull String str, @RecentlyNonNull AbstractClientBuilder<C, O> abstractClientBuilder, @RecentlyNonNull ClientKey<C> clientKey) {
        AbstractClientBuilder<C, O> abstractClientBuilder2 = abstractClientBuilder;
        ClientKey<C> clientKey2 = clientKey;
        C checkNotNull = Preconditions.checkNotNull(abstractClientBuilder2, "Cannot construct an Api with a null ClientBuilder");
        Object checkNotNull2 = Preconditions.checkNotNull(clientKey2, "Cannot construct an Api with a null ClientKey");
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
