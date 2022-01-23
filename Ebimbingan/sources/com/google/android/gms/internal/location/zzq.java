package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

@C0617VisibleForTesting
public final class zzq implements FusedLocationProviderApi {
    public zzq() {
    }

    public final C0225PendingResult<C0236Status> flushLocations(C0222GoogleApiClient googleApiClient) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzv(this, googleApiClient2);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final Location getLastLocation(C0222GoogleApiClient googleApiClient) {
        try {
            return LocationServices.zza(googleApiClient).getLastLocation();
        } catch (Exception e) {
            return null;
        }
    }

    public final LocationAvailability getLocationAvailability(C0222GoogleApiClient googleApiClient) {
        try {
            return LocationServices.zza(googleApiClient).zza();
        } catch (Exception e) {
            return null;
        }
    }

    public final C0225PendingResult<C0236Status> removeLocationUpdates(C0222GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzaa(this, googleApiClient2, pendingIntent);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0236Status> removeLocationUpdates(C0222GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzs(this, googleApiClient2, locationCallback);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0236Status> removeLocationUpdates(C0222GoogleApiClient googleApiClient, LocationListener locationListener) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzz(this, googleApiClient2, locationListener);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0236Status> requestLocationUpdates(C0222GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzy(this, googleApiClient2, locationRequest, pendingIntent);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0236Status> requestLocationUpdates(C0222GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzx(this, googleApiClient2, locationRequest, locationCallback, looper);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0236Status> requestLocationUpdates(C0222GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        Object checkNotNull = C0446Preconditions.checkNotNull(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        new zzr(this, googleApiClient2, locationRequest, locationListener);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0236Status> requestLocationUpdates(C0222GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzw(this, googleApiClient2, locationRequest, locationListener, looper);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0236Status> setMockLocation(C0222GoogleApiClient googleApiClient, Location location) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzu(this, googleApiClient2, location);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0236Status> setMockMode(C0222GoogleApiClient googleApiClient, boolean z) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzt(this, googleApiClient2, z);
        return googleApiClient2.execute(apiMethodImpl);
    }
}
