package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;

@Deprecated
public interface FusedLocationProviderApi {
    @Deprecated
    public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    C0225PendingResult<C0236Status> flushLocations(C0222GoogleApiClient googleApiClient);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Location getLastLocation(C0222GoogleApiClient googleApiClient);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    LocationAvailability getLocationAvailability(C0222GoogleApiClient googleApiClient);

    C0225PendingResult<C0236Status> removeLocationUpdates(C0222GoogleApiClient googleApiClient, PendingIntent pendingIntent);

    C0225PendingResult<C0236Status> removeLocationUpdates(C0222GoogleApiClient googleApiClient, LocationCallback locationCallback);

    C0225PendingResult<C0236Status> removeLocationUpdates(C0222GoogleApiClient googleApiClient, LocationListener locationListener);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    C0225PendingResult<C0236Status> requestLocationUpdates(C0222GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    C0225PendingResult<C0236Status> requestLocationUpdates(C0222GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    C0225PendingResult<C0236Status> requestLocationUpdates(C0222GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    C0225PendingResult<C0236Status> requestLocationUpdates(C0222GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    C0225PendingResult<C0236Status> setMockLocation(C0222GoogleApiClient googleApiClient, Location location);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    C0225PendingResult<C0236Status> setMockMode(C0222GoogleApiClient googleApiClient, boolean z);
}
