package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0223HasApiKey;
import com.google.android.gms.tasks.Task;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.TelemetryLoggingClient */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface C0456TelemetryLoggingClient extends C0223HasApiKey<C0457TelemetryLoggingOptions> {
    @RecentlyNonNull
    @C0206KeepForSdk
    Task<Void> log(@RecentlyNonNull C0454TelemetryData telemetryData);
}
