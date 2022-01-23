package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiKey;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface HasApiKey<O extends Api.ApiOptions> {
    @RecentlyNonNull
    @KeepForSdk
    ApiKey<O> getApiKey();
}
