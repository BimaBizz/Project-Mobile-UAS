package com.google.android.gms.location;

import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;

@Deprecated
public interface SettingsApi {
    C0225PendingResult<LocationSettingsResult> checkLocationSettings(C0222GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest);
}
