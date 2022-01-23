package com.onesignal;

import com.huawei.hmf.tasks.Task;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.onesignal.OneSignal;

class HMSLocationController extends LocationController {
    /* access modifiers changed from: private */
    public static FusedLocationProviderClient hmsFusedLocationClient;
    static LocationUpdateListener locationUpdateListener;

    HMSLocationController() {
    }

    static void startGetLocation() {
        initHuaweiLocation();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void initHuaweiLocation() {
        /*
            java.lang.Object r3 = syncLock
            r6 = r3
            r3 = r6
            r4 = r6
            r0 = r4
            monitor-enter(r3)
            com.huawei.hms.location.FusedLocationProviderClient r3 = hmsFusedLocationClient     // Catch:{ all -> 0x0063 }
            if (r3 != 0) goto L_0x0013
            android.content.Context r3 = classContext     // Catch:{ Exception -> 0x001f }
            com.huawei.hms.location.FusedLocationProviderClient r3 = com.huawei.hms.location.LocationServices.getFusedLocationProviderClient(r3)     // Catch:{ Exception -> 0x001f }
            hmsFusedLocationClient = r3     // Catch:{ Exception -> 0x001f }
        L_0x0013:
            android.location.Location r3 = lastLocation     // Catch:{ all -> 0x0063 }
            if (r3 == 0) goto L_0x0044
            android.location.Location r3 = lastLocation     // Catch:{ all -> 0x0063 }
            fireCompleteForLocation(r3)     // Catch:{ all -> 0x0063 }
        L_0x001c:
            r3 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
        L_0x001e:
            return
        L_0x001f:
            r3 = move-exception
            r1 = r3
            com.onesignal.OneSignal$LOG_LEVEL r3 = com.onesignal.OneSignal.LOG_LEVEL.ERROR     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r6 = r4
            r4 = r6
            r5 = r6
            r5.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Huawei LocationServices getFusedLocationProviderClient failed! "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ all -> 0x0063 }
            r5 = r1
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0063 }
            com.onesignal.OneSignal.Log(r3, r4)     // Catch:{ all -> 0x0063 }
            fireFailedComplete()     // Catch:{ all -> 0x0063 }
            r3 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            goto L_0x001e
        L_0x0044:
            com.huawei.hms.location.FusedLocationProviderClient r3 = hmsFusedLocationClient     // Catch:{ all -> 0x0063 }
            com.huawei.hmf.tasks.Task r3 = r3.getLastLocation()     // Catch:{ all -> 0x0063 }
            com.onesignal.HMSLocationController$2 r4 = new com.onesignal.HMSLocationController$2     // Catch:{ all -> 0x0063 }
            r6 = r4
            r4 = r6
            r5 = r6
            r5.<init>()     // Catch:{ all -> 0x0063 }
            com.huawei.hmf.tasks.Task r3 = r3.addOnSuccessListener(r4)     // Catch:{ all -> 0x0063 }
            com.onesignal.HMSLocationController$1 r4 = new com.onesignal.HMSLocationController$1     // Catch:{ all -> 0x0063 }
            r6 = r4
            r4 = r6
            r5 = r6
            r5.<init>()     // Catch:{ all -> 0x0063 }
            com.huawei.hmf.tasks.Task r3 = r3.addOnFailureListener(r4)     // Catch:{ all -> 0x0063 }
            goto L_0x001c
        L_0x0063:
            r3 = move-exception
            r2 = r3
            r3 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            r3 = r2
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.HMSLocationController.initHuaweiLocation():void");
    }

    static void fireFailedComplete() {
        Object obj = syncLock;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                hmsFusedLocationClient = null;
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
                OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "HMSLocationController onFocusChange!");
                if (!isHMSAvailable() || hmsFusedLocationClient != null) {
                    if (hmsFusedLocationClient != null) {
                        if (locationUpdateListener != null) {
                            Task removeLocationUpdates = hmsFusedLocationClient.removeLocationUpdates(locationUpdateListener);
                        }
                        new LocationUpdateListener(hmsFusedLocationClient);
                        locationUpdateListener = locationUpdateListener2;
                    }
                    return;
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    static class LocationUpdateListener extends LocationCallback {
        private FusedLocationProviderClient huaweiFusedLocationProviderClient;

        LocationUpdateListener(FusedLocationProviderClient huaweiFusedLocationProviderClient2) {
            this.huaweiFusedLocationProviderClient = huaweiFusedLocationProviderClient2;
            init();
        }

        private void init() {
            long updateInterval = 570000;
            if (OneSignal.isForeground()) {
                updateInterval = 270000;
            }
            LocationRequest locationRequest = LocationRequest.create().setFastestInterval(updateInterval).setInterval(updateInterval).setMaxWaitTime((long) (((double) updateInterval) * 1.5d)).setPriority(102);
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "HMSLocationController Huawei LocationServices requestLocationUpdates!");
            Task requestLocationUpdates = this.huaweiFusedLocationProviderClient.requestLocationUpdates(locationRequest, this, LocationController.locationHandlerThread.getLooper());
        }

        public void onLocationResult(LocationResult locationResult) {
            StringBuilder sb;
            LocationResult locationResult2 = locationResult;
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.Log(log_level, sb.append("HMSLocationController onLocationResult: ").append(locationResult2).toString());
            if (locationResult2 != null) {
                LocationController.lastLocation = locationResult2.getLastLocation();
            }
        }
    }
}
