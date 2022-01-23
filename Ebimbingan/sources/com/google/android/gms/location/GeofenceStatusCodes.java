package com.google.android.gms.location;

import com.google.android.gms.common.api.C0218CommonStatusCodes;

public final class GeofenceStatusCodes extends C0218CommonStatusCodes {
    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;

    private GeofenceStatusCodes() {
    }

    public static String getStatusCodeString(int i) {
        int i2 = i;
        switch (i2) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            default:
                return C0218CommonStatusCodes.getStatusCodeString(i2);
        }
    }
}
