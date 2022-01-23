package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0211Api.ApiOptions;
import com.google.android.gms.common.api.internal.C0241ApiKey;

/* renamed from: com.google.android.gms.common.api.HasApiKey */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface C0223HasApiKey<O extends C0211Api.ApiOptions> {
    @RecentlyNonNull
    @C0206KeepForSdk
    C0241ApiKey<O> getApiKey();
}
