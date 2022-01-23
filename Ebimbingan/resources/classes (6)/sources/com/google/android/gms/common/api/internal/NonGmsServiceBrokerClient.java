package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class NonGmsServiceBrokerClient implements Api.Client, ServiceConnection {
    private static final String zaa = NonGmsServiceBrokerClient.class.getSimpleName();
    @Nullable
    private final String zab;
    @Nullable
    private final String zac;
    @Nullable
    private final ComponentName zad;
    private final Context zae;
    private final ConnectionCallbacks zaf;
    private final Handler zag;
    private final OnConnectionFailedListener zah;
    @Nullable
    private IBinder zai;
    private boolean zaj;
    @Nullable
    private String zak;
    @Nullable
    private String zal;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    public NonGmsServiceBrokerClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull ComponentName componentName, @RecentlyNonNull ConnectionCallbacks connectionCallbacks, @RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, (String) null, (String) null, componentName, connectionCallbacks, onConnectionFailedListener);
    }

    @WorkerThread
    private final void zad() {
        Throwable th;
        if (Thread.currentThread() != this.zag.getLooper().getThread()) {
            new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
            throw th;
        }
    }

    private final void zae(String str) {
        String valueOf = String.valueOf(this.zai);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
    }

    @WorkerThread
    public final void connect(@RecentlyNonNull BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Intent intent;
        ConnectionResult connectionResult;
        BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks2 = connectionProgressReportCallbacks;
        zad();
        zae("Connect started.");
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception e) {
            }
        }
        try {
            new Intent();
            ComponentName componentName = this.zad;
            if (componentName != null) {
                Intent component = intent.setComponent(componentName);
            } else {
                Intent action = intent.setPackage(this.zab).setAction(this.zac);
            }
            boolean bindService = this.zae.bindService(intent, this, GmsClientSupervisor.getDefaultBindFlags());
            this.zaj = bindService;
            if (!bindService) {
                this.zai = null;
                OnConnectionFailedListener onConnectionFailedListener = this.zah;
                new ConnectionResult(16);
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
            zae("Finished connect.");
        } catch (SecurityException e2) {
            SecurityException securityException = e2;
            this.zaj = false;
            this.zai = null;
            throw securityException;
        }
    }

    @WorkerThread
    public final void disconnect() {
        zad();
        zae("Disconnect called.");
        try {
            this.zae.unbindService(this);
        } catch (IllegalArgumentException e) {
        }
        this.zaj = false;
        this.zai = null;
    }

    public final void dump(@RecentlyNonNull String str, @Nullable FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }

    @RecentlyNonNull
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    @WorkerThread
    @KeepForSdk
    @RecentlyNullable
    public IBinder getBinder() {
        zad();
        return this.zai;
    }

    @RecentlyNullable
    public final String getLastDisconnectMessage() {
        return this.zak;
    }

    public final int getMinApkVersion() {
        return 0;
    }

    public final void getRemoteService(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set) {
    }

    @RecentlyNonNull
    public final Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @NonNull
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @RecentlyNullable
    public final IBinder getServiceBrokerBinder() {
        return null;
    }

    @RecentlyNonNull
    public final Intent getSignInIntent() {
        Intent intent;
        new Intent();
        return intent;
    }

    @WorkerThread
    public final boolean isConnected() {
        zad();
        return this.zai != null;
    }

    @WorkerThread
    public final boolean isConnecting() {
        zad();
        return this.zaj;
    }

    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull IBinder iBinder) {
        Runnable runnable;
        ComponentName componentName2 = componentName;
        Handler handler = this.zag;
        new zabz(this, iBinder);
        boolean post = handler.post(runnable);
    }

    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
        Runnable runnable;
        ComponentName componentName2 = componentName;
        Handler handler = this.zag;
        new zaca(this);
        boolean post = handler.post(runnable);
    }

    public final void onUserSignOut(@RecentlyNonNull BaseGmsClient.SignOutCallbacks signOutCallbacks) {
    }

    public final boolean providesSignIn() {
        return false;
    }

    public final boolean requiresAccount() {
        return false;
    }

    public final boolean requiresGooglePlayServices() {
        return false;
    }

    public final boolean requiresSignIn() {
        return false;
    }

    public final void zaa(@Nullable String str) {
        String str2 = str;
        this.zal = str2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zab() {
        this.zaj = false;
        this.zai = null;
        zae("Disconnected.");
        this.zaf.onConnectionSuspended(1);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zac(IBinder iBinder) {
        Bundle bundle;
        this.zaj = false;
        this.zai = iBinder;
        zae("Connected.");
        ConnectionCallbacks connectionCallbacks = this.zaf;
        new Bundle();
        connectionCallbacks.onConnected(bundle);
    }

    private NonGmsServiceBrokerClient(Context context, Looper looper, @Nullable String str, @Nullable String str2, @Nullable ComponentName componentName, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        Handler handler;
        Throwable th;
        ComponentName componentName2;
        String str3 = str;
        String str4 = str2;
        ComponentName componentName3 = componentName;
        this.zaj = false;
        this.zak = null;
        this.zae = context;
        new zap(looper);
        this.zag = handler;
        this.zaf = connectionCallbacks;
        this.zah = onConnectionFailedListener;
        if (str3 == null || str4 == null) {
            componentName2 = componentName3 != null ? componentName3 : componentName2;
            new AssertionError("Must specify either package or component, but not both");
            throw th;
        }
        if (componentName3 == null) {
            componentName2 = null;
        }
        new AssertionError("Must specify either package or component, but not both");
        throw th;
        this.zab = str3;
        this.zac = str4;
        this.zad = componentName2;
    }

    @RecentlyNonNull
    public final String getEndpointPackageName() {
        String str = this.zab;
        if (str != null) {
            return str;
        }
        Object checkNotNull = Preconditions.checkNotNull(this.zad);
        return this.zad.getPackageName();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    public NonGmsServiceBrokerClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull ConnectionCallbacks connectionCallbacks, @RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, str, str2, (ComponentName) null, connectionCallbacks, onConnectionFailedListener);
    }

    @WorkerThread
    public final void disconnect(@RecentlyNonNull String str) {
        zad();
        this.zak = str;
        disconnect();
    }
}
