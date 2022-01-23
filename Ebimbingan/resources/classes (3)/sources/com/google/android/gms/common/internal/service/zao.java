package com.google.android.gms.common.internal.service;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zao extends GoogleApi<TelemetryLoggingOptions> implements TelemetryLoggingClient {
    public static final /* synthetic */ int zab = 0;
    private static final Api.ClientKey<zap> zac;
    private static final Api.AbstractClientBuilder<zap, TelemetryLoggingOptions> zad;
    private static final Api<TelemetryLoggingOptions> zae;

    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            com.google.android.gms.common.api.Api$ClientKey r1 = new com.google.android.gms.common.api.Api$ClientKey
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            zac = r1
            com.google.android.gms.common.internal.service.zan r1 = new com.google.android.gms.common.internal.service.zan
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            zad = r1
            com.google.android.gms.common.api.Api r1 = new com.google.android.gms.common.api.Api
            r0 = r1
            r1 = r0
            java.lang.String r2 = "ClientTelemetry.API"
            com.google.android.gms.common.api.Api$AbstractClientBuilder<com.google.android.gms.common.internal.service.zap, com.google.android.gms.common.internal.TelemetryLoggingOptions> r3 = zad
            com.google.android.gms.common.api.Api$ClientKey<com.google.android.gms.common.internal.service.zap> r4 = zac
            r1.<init>(r2, r3, r4)
            r1 = r0
            zae = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.service.zao.<clinit>():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zao(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        super(context, zae, telemetryLoggingOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<Void> log(TelemetryData telemetryData) {
        RemoteCall remoteCall;
        TaskApiCall.Builder builder = TaskApiCall.builder();
        TaskApiCall.Builder features = builder.setFeatures(zad.zaa);
        TaskApiCall.Builder autoResolveMissingFeatures = builder.setAutoResolveMissingFeatures(false);
        new zam(telemetryData);
        TaskApiCall.Builder run = builder.run(remoteCall);
        return doBestEffortWrite(builder.build());
    }
}
