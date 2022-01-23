package com.google.android.gms.location;

import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.C0230Response;
import com.google.android.gms.common.internal.C0445PendingResultUtil;
import com.google.android.gms.tasks.Task;

public class SettingsClient extends C0220GoogleApi<C0211Api.ApiOptions.NoOptions> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SettingsClient(@androidx.annotation.NonNull android.app.Activity r10) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r0
            r3 = r1
            com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api$ApiOptions$NoOptions> r4 = com.google.android.gms.location.LocationServices.API
            r5 = 0
            com.google.android.gms.common.api.internal.ApiExceptionMapper r6 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r8 = r6
            r6 = r8
            r7 = r8
            r7.<init>()
            r2.<init>((android.app.Activity) r3, r4, r5, (com.google.android.gms.common.api.internal.C0265StatusExceptionMapper) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.SettingsClient.<init>(android.app.Activity):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SettingsClient(@androidx.annotation.NonNull android.content.Context r10) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r0
            r3 = r1
            com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api$ApiOptions$NoOptions> r4 = com.google.android.gms.location.LocationServices.API
            r5 = 0
            com.google.android.gms.common.api.internal.ApiExceptionMapper r6 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r8 = r6
            r6 = r8
            r7 = r8
            r7.<init>()
            r2.<init>((android.content.Context) r3, r4, r5, (com.google.android.gms.common.api.internal.C0265StatusExceptionMapper) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.SettingsClient.<init>(android.content.Context):void");
    }

    public Task<LocationSettingsResponse> checkLocationSettings(LocationSettingsRequest locationSettingsRequest) {
        C0230Response response;
        new LocationSettingsResponse();
        return C0445PendingResultUtil.toResponseTask(LocationServices.SettingsApi.checkLocationSettings(asGoogleApiClient(), locationSettingsRequest), response);
    }
}
