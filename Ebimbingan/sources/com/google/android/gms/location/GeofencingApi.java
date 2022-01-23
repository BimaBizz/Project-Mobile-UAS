package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;
import java.util.List;

@Deprecated
public interface GeofencingApi {
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    C0225PendingResult<C0236Status> addGeofences(C0222GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @Deprecated
    C0225PendingResult<C0236Status> addGeofences(C0222GoogleApiClient googleApiClient, List<Geofence> list, PendingIntent pendingIntent);

    C0225PendingResult<C0236Status> removeGeofences(C0222GoogleApiClient googleApiClient, PendingIntent pendingIntent);

    C0225PendingResult<C0236Status> removeGeofences(C0222GoogleApiClient googleApiClient, List<String> list);
}
