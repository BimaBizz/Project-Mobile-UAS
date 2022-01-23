package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class zam implements RemoteCall {
    private final TelemetryData zaa;

    zam(TelemetryData telemetryData) {
        this.zaa = telemetryData;
    }

    public final void accept(Object obj, Object obj2) {
        int i = zao.zab;
        ((zai) ((zap) obj).getService()).zae(this.zaa);
        ((TaskCompletionSource) obj2).setResult((Object) null);
    }
}
