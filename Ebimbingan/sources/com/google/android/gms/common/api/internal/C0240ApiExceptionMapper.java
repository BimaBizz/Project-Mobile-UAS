package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.C0422ApiExceptionUtil;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.ApiExceptionMapper */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0240ApiExceptionMapper implements C0265StatusExceptionMapper {
    public C0240ApiExceptionMapper() {
    }

    @RecentlyNonNull
    public final Exception getException(@RecentlyNonNull C0236Status status) {
        return C0422ApiExceptionUtil.fromStatus(status);
    }
}
