package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zabx<T> implements OnCompleteListener<T> {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey<?> zac;
    private final long zad;

    @VisibleForTesting
    zabx(GoogleApiManager googleApiManager, int i, ApiKey<?> apiKey, long j, @Nullable String str, @Nullable String str2) {
        String str3 = str;
        String str4 = str2;
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
    }

    @Nullable
    static <T> zabx<T> zaa(GoogleApiManager googleApiManager, int i, ApiKey<?> apiKey) {
        boolean z;
        zabx<T> zabx;
        GoogleApiManager googleApiManager2 = googleApiManager;
        int i2 = i;
        ApiKey<?> apiKey2 = apiKey;
        if (!googleApiManager2.zam()) {
            return null;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            z = true;
        } else if (!config.getMethodInvocationTelemetryEnabled()) {
            return null;
        } else {
            z = config.getMethodTimingTelemetryEnabled();
            zabl zag = googleApiManager2.zag(apiKey2);
            if (zag != null) {
                if (!(zag.zaf() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) zag.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration zab2 = zab(zag, baseGmsClient, i2);
                    if (zab2 == null) {
                        return null;
                    }
                    zag.zas();
                    z = zab2.getMethodTimingTelemetryEnabled();
                }
            }
        }
        zabx = new zabx<>(googleApiManager2, i2, apiKey2, z ? System.currentTimeMillis() : 0, (String) null, (String) null);
        return r7;
    }

    @Nullable
    private static ConnectionTelemetryConfiguration zab(zabl<?> zabl, BaseGmsClient<?> baseGmsClient, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        zabl<?> zabl2 = zabl;
        int i2 = i;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i2) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i2)))) {
            return null;
        }
        if (zabl2.zar() < telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return telemetryConfiguration;
        }
        return null;
    }

    @WorkerThread
    public final void onComplete(@NonNull Task<T> task) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        MethodInvocation methodInvocation;
        Task<T> task2 = task;
        if (this.zaa.zam()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if (config == null || config.getMethodInvocationTelemetryEnabled()) {
                zabl zag = this.zaa.zag(this.zac);
                if (zag != null && (zag.zaf() instanceof BaseGmsClient)) {
                    BaseGmsClient baseGmsClient = (BaseGmsClient) zag.zaf();
                    if (this.zad > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                    if (config != null) {
                        z2 &= config.getMethodTimingTelemetryEnabled();
                        int batchPeriodMillis = config.getBatchPeriodMillis();
                        int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                        int version = config.getVersion();
                        if (!baseGmsClient.hasConnectionInfo()) {
                            i = maxMethodInvocationsInBatch;
                            i2 = batchPeriodMillis;
                            i3 = version;
                        } else if (!baseGmsClient.isConnecting()) {
                            ConnectionTelemetryConfiguration zab2 = zab(zag, baseGmsClient, this.zab);
                            if (zab2 != null) {
                                if (zab2.getMethodTimingTelemetryEnabled()) {
                                    z2 = this.zad > 0;
                                } else {
                                    z2 = false;
                                }
                                i = zab2.getMaxMethodInvocationsLogged();
                                i2 = batchPeriodMillis;
                                i3 = version;
                            } else {
                                return;
                            }
                        } else {
                            i = maxMethodInvocationsInBatch;
                            i2 = batchPeriodMillis;
                            i3 = version;
                        }
                    } else {
                        i = 100;
                        i2 = 5000;
                        i3 = 0;
                    }
                    GoogleApiManager googleApiManager = this.zaa;
                    if (task2.isSuccessful()) {
                        i4 = 0;
                        i5 = 0;
                    } else if (task2.isCanceled()) {
                        i4 = 100;
                        i5 = -1;
                    } else {
                        Exception exception = task2.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            int statusCode = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            if (connectionResult == null) {
                                i5 = -1;
                            } else {
                                i5 = connectionResult.getErrorCode();
                            }
                            i4 = statusCode;
                        } else {
                            i4 = 101;
                            i5 = -1;
                        }
                    }
                    if (z2) {
                        j = this.zad;
                        j2 = System.currentTimeMillis();
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    new MethodInvocation(this.zab, i4, i5, j, j2, (String) null, (String) null, gCoreServiceId);
                    googleApiManager.zar(methodInvocation, i3, (long) i2, i);
                }
            }
        }
    }
}
