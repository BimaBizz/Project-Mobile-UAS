package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class ApiExceptionUtil {
    public ApiExceptionUtil() {
    }

    @NonNull
    @KeepForSdk
    public static ApiException fromStatus(@RecentlyNonNull Status status) {
        ApiException apiException;
        ApiException apiException2;
        Status status2 = status;
        if (status2.hasResolution()) {
            new ResolvableApiException(status2);
            return apiException2;
        }
        new ApiException(status2);
        return apiException;
    }
}
