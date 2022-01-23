package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.internal.C0245ConnectionCallbacks;
import com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0457TelemetryLoggingOptions;

/* renamed from: com.google.android.gms.common.internal.service.zan */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0479zan extends C0211Api.AbstractClientBuilder<C0481zap, C0457TelemetryLoggingOptions> {
    C0479zan() {
    }

    public final /* bridge */ /* synthetic */ C0211Api.Client buildClient(Context context, Looper looper, C0427ClientSettings clientSettings, Object obj, C0245ConnectionCallbacks connectionCallbacks, C0257OnConnectionFailedListener onConnectionFailedListener) {
        C0211Api.Client client;
        new C0481zap(context, looper, clientSettings, (C0457TelemetryLoggingOptions) obj, connectionCallbacks, onConnectionFailedListener);
        return client;
    }
}
