package com.google.android.gms.common.internal.service;

import android.content.Context;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.internal.C0454TelemetryData;
import com.google.android.gms.common.internal.C0456TelemetryLoggingClient;
import com.google.android.gms.common.internal.C0457TelemetryLoggingOptions;
import com.google.android.gms.internal.base.C1094zad;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.common.internal.service.zao */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0480zao extends C0220GoogleApi<C0457TelemetryLoggingOptions> implements C0456TelemetryLoggingClient {
    public static final /* synthetic */ int zab = 0;
    private static final C0211Api.ClientKey<C0481zap> zac;
    private static final C0211Api.AbstractClientBuilder<C0481zap, C0457TelemetryLoggingOptions> zad;
    private static final C0211Api<C0457TelemetryLoggingOptions> zae;

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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.service.C0480zao.<clinit>():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0480zao(Context context, C0457TelemetryLoggingOptions telemetryLoggingOptions) {
        super(context, zae, telemetryLoggingOptions, C0220GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<Void> log(C0454TelemetryData telemetryData) {
        C0262RemoteCall remoteCall;
        C0267TaskApiCall.Builder builder = C0267TaskApiCall.builder();
        C0267TaskApiCall.Builder features = builder.setFeatures(C1094zad.zaa);
        C0267TaskApiCall.Builder autoResolveMissingFeatures = builder.setAutoResolveMissingFeatures(false);
        new C0478zam(telemetryData);
        C0267TaskApiCall.Builder run = builder.run(remoteCall);
        return doBestEffortWrite(builder.build());
    }
}
