package com.onesignal;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.onesignal.OneSignal;

class GMSLocationController extends LocationController {
    static final int API_FALLBACK_TIME = 30000;
    /* access modifiers changed from: private */
    public static GoogleApiClientCompatProxy googleApiClient;
    static LocationUpdateListener locationUpdateListener;

    GMSLocationController() {
    }

    static void startGetLocation() {
        initGoogleLocation();
    }

    private static void initGoogleLocation() {
        GoogleApiClient.ConnectionCallbacks connectionCallbacks;
        GoogleApiClient.Builder builder;
        GoogleApiClientCompatProxy googleApiClientCompatProxy;
        if (fallbackFailThread == null) {
            Object obj = syncLock;
            Object obj2 = obj;
            synchronized (obj) {
                try {
                    startFallBackThread();
                    if (googleApiClient == null || lastLocation == null) {
                        new GoogleApiClientListener((AnonymousClass1) null);
                        GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
                        new GoogleApiClient.Builder(classContext);
                        new GoogleApiClientCompatProxy(builder.addApi(LocationServices.API).addConnectionCallbacks(connectionCallbacks2).addOnConnectionFailedListener(connectionCallbacks2).setHandler(locationHandlerThread.mHandler).build());
                        googleApiClient = googleApiClientCompatProxy;
                        googleApiClient.connect();
                    } else if (lastLocation != null) {
                        fireCompleteForLocation(lastLocation);
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj3 = obj2;
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static int getApiFallbackWait() {
        return API_FALLBACK_TIME;
    }

    private static void startFallBackThread() {
        Thread thread;
        Runnable runnable;
        new Runnable() {
            public void run() {
                try {
                    Thread.sleep((long) GMSLocationController.getApiFallbackWait());
                    OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.");
                    LocationController.fireFailedComplete();
                    boolean scheduleUpdate = LocationController.scheduleUpdate(LocationController.classContext);
                } catch (InterruptedException e) {
                    InterruptedException interruptedException = e;
                }
            }
        };
        new Thread(runnable, "OS_GMS_LOCATION_FALLBACK");
        fallbackFailThread = thread;
        fallbackFailThread.start();
    }

    static void fireFailedComplete() {
        Object obj = syncLock;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                if (googleApiClient != null) {
                    googleApiClient.disconnect();
                }
                googleApiClient = null;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    static void onFocusChange() {
        LocationUpdateListener locationUpdateListener2;
        Object obj = syncLock;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "GMSLocationController onFocusChange!");
                if (googleApiClient == null || !googleApiClient.realInstance().isConnected()) {
                    return;
                }
                if (googleApiClient != null) {
                    GoogleApiClient googleApiClient2 = googleApiClient.realInstance();
                    if (locationUpdateListener != null) {
                        PendingResult removeLocationUpdates = LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient2, locationUpdateListener);
                    }
                    new LocationUpdateListener(googleApiClient2);
                    locationUpdateListener = locationUpdateListener2;
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    private static class GoogleApiClientListener implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
        private GoogleApiClientListener() {
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ GoogleApiClientListener(AnonymousClass1 r4) {
            this();
            AnonymousClass1 r1 = r4;
        }

        public void onConnected(Bundle bundle) {
            StringBuilder sb;
            LocationUpdateListener locationUpdateListener;
            StringBuilder sb2;
            Bundle bundle2 = bundle;
            Object obj = LocationController.syncLock;
            Object obj2 = obj;
            synchronized (obj) {
                try {
                    PermissionsActivity.answered = false;
                    if (GMSLocationController.googleApiClient == null || GMSLocationController.googleApiClient.realInstance() == null) {
                        return;
                    }
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                    new StringBuilder();
                    OneSignal.Log(log_level, sb.append("LocationController GoogleApiClientListener onConnected lastLocation: ").append(LocationController.lastLocation).toString());
                    if (LocationController.lastLocation == null) {
                        LocationController.lastLocation = FusedLocationApiWrapper.getLastLocation(GMSLocationController.googleApiClient.realInstance());
                        OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
                        new StringBuilder();
                        OneSignal.Log(log_level2, sb2.append("LocationController GoogleApiClientListener lastLocation: ").append(LocationController.lastLocation).toString());
                        if (LocationController.lastLocation != null) {
                            LocationController.fireCompleteForLocation(LocationController.lastLocation);
                        }
                    }
                    new LocationUpdateListener(GMSLocationController.googleApiClient.realInstance());
                    GMSLocationController.locationUpdateListener = locationUpdateListener;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj3 = obj2;
                    throw th2;
                }
            }
        }

        public void onConnectionSuspended(int i) {
            GMSLocationController.fireFailedComplete();
        }

        public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            GMSLocationController.fireFailedComplete();
        }
    }

    static class LocationUpdateListener implements LocationListener {
        private GoogleApiClient googleApiClient;

        LocationUpdateListener(GoogleApiClient googleApiClient2) {
            this.googleApiClient = googleApiClient2;
            init();
        }

        private void init() {
            long updateInterval = 570000;
            if (OneSignal.isForeground()) {
                updateInterval = 270000;
            }
            if (this.googleApiClient != null) {
                LocationRequest locationRequest = LocationRequest.create().setFastestInterval(updateInterval).setInterval(updateInterval).setMaxWaitTime((long) (((double) updateInterval) * 1.5d)).setPriority(102);
                OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "GMSLocationController GoogleApiClient requestLocationUpdates!");
                FusedLocationApiWrapper.requestLocationUpdates(this.googleApiClient, locationRequest, this);
            }
        }

        public void onLocationChanged(Location location) {
            StringBuilder sb;
            Location location2 = location;
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.Log(log_level, sb.append("GMSLocationController onLocationChanged: ").append(location2).toString());
            LocationController.lastLocation = location2;
        }
    }

    static class FusedLocationApiWrapper {
        FusedLocationApiWrapper() {
        }

        static void requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
            Object obj;
            GoogleApiClient googleApiClient2 = googleApiClient;
            LocationRequest locationRequest2 = locationRequest;
            LocationListener locationListener2 = locationListener;
            try {
                Object obj2 = GMSLocationController.syncLock;
                obj = obj2;
                synchronized (obj2) {
                    if (googleApiClient2.isConnected()) {
                        PendingResult requestLocationUpdates = LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient2, locationRequest2, locationListener2);
                    }
                }
            } catch (Throwable th) {
                OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "FusedLocationApi.requestLocationUpdates failed!", th);
            }
        }

        static Location getLastLocation(GoogleApiClient googleApiClient) {
            GoogleApiClient googleApiClient2 = googleApiClient;
            Object obj = GMSLocationController.syncLock;
            Object obj2 = obj;
            synchronized (obj) {
                try {
                    if (googleApiClient2.isConnected()) {
                        GoogleApiClient googleApiClient3 = LocationServices.FusedLocationApi.getLastLocation(googleApiClient2);
                        return googleApiClient3;
                    }
                    return null;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj3 = obj2;
                    throw th2;
                }
            }
        }
    }
}
