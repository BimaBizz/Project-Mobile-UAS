package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.internal.C0454TelemetryData;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.internal.service.zam */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class C0478zam implements C0262RemoteCall {
    private final C0454TelemetryData zaa;

    C0478zam(C0454TelemetryData telemetryData) {
        this.zaa = telemetryData;
    }

    public final void accept(Object obj, Object obj2) {
        int i = C0480zao.zab;
        ((C0474zai) ((C0481zap) obj).getService()).zae(this.zaa);
        ((TaskCompletionSource) obj2).setResult(null);
    }
}
