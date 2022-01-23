package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0212ApiException;
import com.google.android.gms.common.api.C0228ResolvableApiException;
import com.google.android.gms.common.api.C0236Status;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.ApiExceptionUtil */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0422ApiExceptionUtil {
    public C0422ApiExceptionUtil() {
    }

    @NonNull
    @C0206KeepForSdk
    public static C0212ApiException fromStatus(@RecentlyNonNull C0236Status status) {
        C0212ApiException apiException;
        C0212ApiException apiException2;
        C0236Status status2 = status;
        if (status2.hasResolution()) {
            new C0228ResolvableApiException(status2);
            return apiException2;
        }
        new C0212ApiException(status2);
        return apiException;
    }
}
