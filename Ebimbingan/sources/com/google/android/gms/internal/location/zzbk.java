package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.SettingsApi;

public final class zzbk implements SettingsApi {
    public zzbk() {
    }

    public final C0225PendingResult<LocationSettingsResult> checkLocationSettings(C0222GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzbl(this, googleApiClient2, locationSettingsRequest, (String) null);
        return googleApiClient2.enqueue(apiMethodImpl);
    }
}
