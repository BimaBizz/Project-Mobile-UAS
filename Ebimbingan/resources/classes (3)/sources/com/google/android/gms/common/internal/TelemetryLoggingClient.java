package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface TelemetryLoggingClient extends HasApiKey<TelemetryLoggingOptions> {
    @RecentlyNonNull
    @KeepForSdk
    Task<Void> log(@RecentlyNonNull TelemetryData telemetryData);
}
