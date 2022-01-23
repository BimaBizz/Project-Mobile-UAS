package com.onesignal;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;
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

    /* JADX WARNING: type inference failed for: r5v5, types: [com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void initGoogleLocation() {
        /*
            java.lang.Thread r4 = fallbackFailThread
            if (r4 == 0) goto L_0x0005
        L_0x0004:
            return
        L_0x0005:
            java.lang.Object r4 = syncLock
            r7 = r4
            r4 = r7
            r5 = r7
            r0 = r5
            monitor-enter(r4)
            startFallBackThread()     // Catch:{ all -> 0x0065 }
            com.onesignal.GoogleApiClientCompatProxy r4 = googleApiClient     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0017
            android.location.Location r4 = lastLocation     // Catch:{ all -> 0x0065 }
            if (r4 != 0) goto L_0x005b
        L_0x0017:
            com.onesignal.GMSLocationController$GoogleApiClientListener r4 = new com.onesignal.GMSLocationController$GoogleApiClientListener     // Catch:{ all -> 0x0065 }
            r7 = r4
            r4 = r7
            r5 = r7
            r6 = 0
            r5.<init>(r6)     // Catch:{ all -> 0x0065 }
            r1 = r4
            com.google.android.gms.common.api.GoogleApiClient$Builder r4 = new com.google.android.gms.common.api.GoogleApiClient$Builder     // Catch:{ all -> 0x0065 }
            r7 = r4
            r4 = r7
            r5 = r7
            android.content.Context r6 = classContext     // Catch:{ all -> 0x0065 }
            r5.<init>(r6)     // Catch:{ all -> 0x0065 }
            com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api$ApiOptions$NoOptions> r5 = com.google.android.gms.location.LocationServices.API     // Catch:{ all -> 0x0065 }
            com.google.android.gms.common.api.GoogleApiClient$Builder r4 = r4.addApi(r5)     // Catch:{ all -> 0x0065 }
            r5 = r1
            com.google.android.gms.common.api.GoogleApiClient$Builder r4 = r4.addConnectionCallbacks(r5)     // Catch:{ all -> 0x0065 }
            r5 = r1
            com.google.android.gms.common.api.GoogleApiClient$Builder r4 = r4.addOnConnectionFailedListener(r5)     // Catch:{ all -> 0x0065 }
            com.onesignal.LocationController$LocationHandlerThread r5 = locationHandlerThread     // Catch:{ all -> 0x0065 }
            android.os.Handler r5 = r5.mHandler     // Catch:{ all -> 0x0065 }
            com.google.android.gms.common.api.GoogleApiClient$Builder r4 = r4.setHandler(r5)     // Catch:{ all -> 0x0065 }
            com.google.android.gms.common.api.GoogleApiClient r4 = r4.build()     // Catch:{ all -> 0x0065 }
            r2 = r4
            com.onesignal.GoogleApiClientCompatProxy r4 = new com.onesignal.GoogleApiClientCompatProxy     // Catch:{ all -> 0x0065 }
            r7 = r4
            r4 = r7
            r5 = r7
            r6 = r2
            r5.<init>(r6)     // Catch:{ all -> 0x0065 }
            googleApiClient = r4     // Catch:{ all -> 0x0065 }
            com.onesignal.GoogleApiClientCompatProxy r4 = googleApiClient     // Catch:{ all -> 0x0065 }
            r4.connect()     // Catch:{ all -> 0x0065 }
        L_0x0058:
            r4 = r0
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            goto L_0x0004
        L_0x005b:
            android.location.Location r4 = lastLocation     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0058
            android.location.Location r4 = lastLocation     // Catch:{ all -> 0x0065 }
            fireCompleteForLocation(r4)     // Catch:{ all -> 0x0065 }
            goto L_0x0058
        L_0x0065:
            r4 = move-exception
            r3 = r4
            r4 = r0
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            r4 = r3
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.GMSLocationController.initGoogleLocation():void");
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
                    C0222GoogleApiClient googleApiClient2 = googleApiClient.realInstance();
                    if (locationUpdateListener != null) {
                        C0225PendingResult<C0236Status> removeLocationUpdates = LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient2, (LocationListener) locationUpdateListener);
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

    private static class GoogleApiClientListener implements C0222GoogleApiClient.ConnectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener {
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

        public void onConnectionFailed(@NonNull C0184ConnectionResult connectionResult) {
            GMSLocationController.fireFailedComplete();
        }
    }

    static class LocationUpdateListener implements LocationListener {
        private C0222GoogleApiClient googleApiClient;

        LocationUpdateListener(C0222GoogleApiClient googleApiClient2) {
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

        static void requestLocationUpdates(C0222GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
            Object obj;
            C0222GoogleApiClient googleApiClient2 = googleApiClient;
            LocationRequest locationRequest2 = locationRequest;
            LocationListener locationListener2 = locationListener;
            try {
                Object obj2 = GMSLocationController.syncLock;
                obj = obj2;
                synchronized (obj2) {
                    if (googleApiClient2.isConnected()) {
                        C0225PendingResult<C0236Status> requestLocationUpdates = LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient2, locationRequest2, locationListener2);
                    }
                }
            } catch (Throwable th) {
                OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "FusedLocationApi.requestLocationUpdates failed!", th);
            }
        }

        static Location getLastLocation(C0222GoogleApiClient googleApiClient) {
            C0222GoogleApiClient googleApiClient2 = googleApiClient;
            Object obj = GMSLocationController.syncLock;
            Object obj2 = obj;
            synchronized (obj) {
                try {
                    if (googleApiClient2.isConnected()) {
                        Location lastLocation = LocationServices.FusedLocationApi.getLastLocation(googleApiClient2);
                        return lastLocation;
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
