package com.google.android.gms.common.internal;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.service.C0480zao;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.TelemetryLogging */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0455TelemetryLogging {
    private C0455TelemetryLogging() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0456TelemetryLoggingClient getClient(@RecentlyNonNull Context context) {
        return getClient(context, C0457TelemetryLoggingOptions.zaa);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0456TelemetryLoggingClient getClient(@RecentlyNonNull Context context, @RecentlyNonNull C0457TelemetryLoggingOptions telemetryLoggingOptions) {
        C0456TelemetryLoggingClient telemetryLoggingClient;
        new C0480zao(context, telemetryLoggingOptions);
        return telemetryLoggingClient;
    }
}
