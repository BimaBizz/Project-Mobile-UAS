package com.google.android.gms.location;

import com.google.android.gms.common.api.C0230Response;

public class LocationSettingsResponse extends C0230Response<LocationSettingsResult> {
    public LocationSettingsResponse() {
    }

    public LocationSettingsStates getLocationSettingsStates() {
        return ((LocationSettingsResult) getResult()).getLocationSettingsStates();
    }
}
