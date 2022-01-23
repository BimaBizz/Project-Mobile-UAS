package com.google.android.gms.common.internal;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.service.zao;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class TelemetryLogging {
    private TelemetryLogging() {
    }

    @RecentlyNonNull
    @KeepForSdk
    public static TelemetryLoggingClient getClient(@RecentlyNonNull Context context) {
        return getClient(context, TelemetryLoggingOptions.zaa);
    }

    @RecentlyNonNull
    @KeepForSdk
    public static TelemetryLoggingClient getClient(@RecentlyNonNull Context context, @RecentlyNonNull TelemetryLoggingOptions telemetryLoggingOptions) {
        TelemetryLoggingClient telemetryLoggingClient;
        new zao(context, telemetryLoggingOptions);
        return telemetryLoggingClient;
    }
}
