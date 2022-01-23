package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class zaad extends GoogleApiClient {
    private final String zaa = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public zaad(String str) {
        String str2 = str;
    }

    public final ConnectionResult blockingConnect() {
        Throwable th;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Throwable th;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void connect() {
        Throwable th;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void disconnect() {
        Throwable th;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Throwable th;
        String str2 = str;
        FileDescriptor fileDescriptor2 = fileDescriptor;
        PrintWriter printWriter2 = printWriter;
        String[] strArr2 = strArr;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    @NonNull
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        Throwable th;
        Api<?> api2 = api;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final boolean hasConnectedApi(@NonNull Api<?> api) {
        Throwable th;
        Api<?> api2 = api;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final boolean isConnected() {
        Throwable th;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final boolean isConnecting() {
        Throwable th;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final boolean isConnectionCallbacksRegistered(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Throwable th;
        GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final boolean isConnectionFailedListenerRegistered(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Throwable th;
        GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void reconnect() {
        Throwable th;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void registerConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Throwable th;
        GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void registerConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Throwable th;
        GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity) {
        Throwable th;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void unregisterConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Throwable th;
        GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void unregisterConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Throwable th;
        GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        Throwable th;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }
}
