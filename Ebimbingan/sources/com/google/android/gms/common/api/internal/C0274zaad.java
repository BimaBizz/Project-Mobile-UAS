package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.zaad */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0274zaad extends C0222GoogleApiClient {
    private final String zaa = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public C0274zaad(String str) {
        String str2 = str;
    }

    public final C0184ConnectionResult blockingConnect() {
        Throwable th;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final C0225PendingResult<C0236Status> clearDefaultAccountAndReconnect() {
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
    public final C0184ConnectionResult getConnectionResult(@NonNull C0211Api<?> api) {
        Throwable th;
        C0211Api<?> api2 = api;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final boolean hasConnectedApi(@NonNull C0211Api<?> api) {
        Throwable th;
        C0211Api<?> api2 = api;
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

    public final boolean isConnectionCallbacksRegistered(@NonNull C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Throwable th;
        C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final boolean isConnectionFailedListenerRegistered(@NonNull C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Throwable th;
        C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void reconnect() {
        Throwable th;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void registerConnectionCallbacks(@NonNull C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Throwable th;
        C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void registerConnectionFailedListener(@NonNull C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Throwable th;
        C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity) {
        Throwable th;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void unregisterConnectionCallbacks(@NonNull C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Throwable th;
        C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final void unregisterConnectionFailedListener(@NonNull C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Throwable th;
        C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }

    public final C0184ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        Throwable th;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        new UnsupportedOperationException(this.zaa);
        throw th;
    }
}
