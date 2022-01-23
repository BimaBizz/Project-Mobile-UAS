package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class ApiExceptionMapper implements StatusExceptionMapper {
    public ApiExceptionMapper() {
    }

    @RecentlyNonNull
    public final Exception getException(@RecentlyNonNull Status status) {
        return ApiExceptionUtil.fromStatus(status);
    }
}
