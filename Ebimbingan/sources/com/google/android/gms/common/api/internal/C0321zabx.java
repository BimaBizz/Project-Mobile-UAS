package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0212ApiException;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.C0424BaseGmsClient;
import com.google.android.gms.common.internal.C0428ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.C0443MethodInvocation;
import com.google.android.gms.common.internal.C0449RootTelemetryConfigManager;
import com.google.android.gms.common.internal.C0450RootTelemetryConfiguration;
import com.google.android.gms.common.util.C0588ArrayUtils;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.common.api.internal.zabx */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0321zabx<T> implements OnCompleteListener<T> {
    private final C0248GoogleApiManager zaa;
    private final int zab;
    private final C0241ApiKey<?> zac;
    private final long zad;

    @C0617VisibleForTesting
    C0321zabx(C0248GoogleApiManager googleApiManager, int i, C0241ApiKey<?> apiKey, long j, @Nullable String str, @Nullable String str2) {
        String str3 = str;
        String str4 = str2;
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
    }

    @Nullable
    static <T> C0321zabx<T> zaa(C0248GoogleApiManager googleApiManager, int i, C0241ApiKey<?> apiKey) {
        boolean z;
        C0321zabx<T> zabx;
        C0248GoogleApiManager googleApiManager2 = googleApiManager;
        int i2 = i;
        C0241ApiKey<?> apiKey2 = apiKey;
        if (!googleApiManager2.zam()) {
            return null;
        }
        C0450RootTelemetryConfiguration config = C0449RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            z = true;
        } else if (!config.getMethodInvocationTelemetryEnabled()) {
            return null;
        } else {
            z = config.getMethodTimingTelemetryEnabled();
            C0309zabl zag = googleApiManager2.zag(apiKey2);
            if (zag != null) {
                if (!(zag.zaf() instanceof C0424BaseGmsClient)) {
                    return null;
                }
                C0424BaseGmsClient baseGmsClient = (C0424BaseGmsClient) zag.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    C0428ConnectionTelemetryConfiguration zab2 = zab(zag, baseGmsClient, i2);
                    if (zab2 == null) {
                        return null;
                    }
                    zag.zas();
                    z = zab2.getMethodTimingTelemetryEnabled();
                }
            }
        }
        zabx = new C0321zabx<>(googleApiManager2, i2, apiKey2, z ? System.currentTimeMillis() : 0, (String) null, (String) null);
        return r7;
    }

    @Nullable
    private static C0428ConnectionTelemetryConfiguration zab(C0309zabl<?> zabl, C0424BaseGmsClient<?> baseGmsClient, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        C0309zabl<?> zabl2 = zabl;
        int i2 = i;
        C0428ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !C0588ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i2) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !C0588ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i2)))) {
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
        C0443MethodInvocation methodInvocation;
        Task<T> task2 = task;
        if (this.zaa.zam()) {
            C0450RootTelemetryConfiguration config = C0449RootTelemetryConfigManager.getInstance().getConfig();
            if (config == null || config.getMethodInvocationTelemetryEnabled()) {
                C0309zabl zag = this.zaa.zag(this.zac);
                if (zag != null && (zag.zaf() instanceof C0424BaseGmsClient)) {
                    C0424BaseGmsClient baseGmsClient = (C0424BaseGmsClient) zag.zaf();
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
                            C0428ConnectionTelemetryConfiguration zab2 = zab(zag, baseGmsClient, this.zab);
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
                    C0248GoogleApiManager googleApiManager = this.zaa;
                    if (task2.isSuccessful()) {
                        i4 = 0;
                        i5 = 0;
                    } else if (task2.isCanceled()) {
                        i4 = 100;
                        i5 = -1;
                    } else {
                        Exception exception = task2.getException();
                        if (exception instanceof C0212ApiException) {
                            C0236Status status = ((C0212ApiException) exception).getStatus();
                            int statusCode = status.getStatusCode();
                            C0184ConnectionResult connectionResult = status.getConnectionResult();
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
                    new C0443MethodInvocation(this.zab, i4, i5, j, j2, (String) null, (String) null, gCoreServiceId);
                    googleApiManager.zar(methodInvocation, i3, (long) i2, i);
                }
            }
        }
    }
}
