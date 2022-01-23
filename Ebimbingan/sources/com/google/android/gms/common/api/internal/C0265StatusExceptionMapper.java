package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0236Status;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.StatusExceptionMapper */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface C0265StatusExceptionMapper {
    @RecentlyNonNull
    @C0206KeepForSdk
    Exception getException(@RecentlyNonNull C0236Status status);
}
