package com.onesignal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.AndroidSupportV4Compat;
import com.onesignal.OneSignal;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

class LocationController {
    static final long BACKGROUND_UPDATE_TIME_MS = 570000;
    static final long FOREGROUND_UPDATE_TIME_MS = 270000;
    private static final long TIME_BACKGROUND_SEC = 600;
    private static final long TIME_FOREGROUND_SEC = 300;
    static Context classContext;
    static Thread fallbackFailThread;
    static Location lastLocation;
    private static boolean locationCoarse;
    static LocationHandlerThread locationHandlerThread;
    private static ConcurrentHashMap<PermissionType, LocationHandler> locationHandlers;
    private static final List<LocationPromptCompletionHandler> promptHandlers;
    static String requestPermission;
    static final Object syncLock;

    interface LocationHandler {
        PermissionType getType();

        void onComplete(LocationPoint locationPoint);
    }

    enum PermissionType {
    }

    LocationController() {
    }

    static {
        List<LocationPromptCompletionHandler> list;
        ConcurrentHashMap<PermissionType, LocationHandler> concurrentHashMap;
        Object obj;
        new ArrayList();
        promptHandlers = list;
        new ConcurrentHashMap<>();
        locationHandlers = concurrentHashMap;
        new Object() {
        };
        syncLock = obj;
    }

    static class LocationPoint {
        Float accuracy;
        Boolean bg;
        Double lat;
        Double log;
        Long timeStamp;
        Integer type;

        LocationPoint() {
        }

        public String toString() {
            StringBuilder sb;
            new StringBuilder();
            return sb.append("LocationPoint{lat=").append(this.lat).append(", log=").append(this.log).append(", accuracy=").append(this.accuracy).append(", type=").append(this.type).append(", bg=").append(this.bg).append(", timeStamp=").append(this.timeStamp).append('}').toString();
        }
    }

    static abstract class LocationPromptCompletionHandler implements LocationHandler {
        LocationPromptCompletionHandler() {
        }

        /* access modifiers changed from: package-private */
        public void onAnswered(OneSignal.PromptActionResult result) {
        }
    }

    static boolean scheduleUpdate(Context context) {
        Context context2 = context;
        if (!hasLocationPermission(context2) || !OneSignal.shareLocation) {
            return false;
        }
        OneSignalSyncServiceUtils.scheduleLocationUpdateTask(context2, (1000 * (OneSignal.isForeground() ? TIME_FOREGROUND_SEC : TIME_BACKGROUND_SEC)) - (System.currentTimeMillis() - getLastLocationTime()));
        return true;
    }

    private static void setLastLocationTime(long time) {
        OneSignalPrefs.saveLong(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_LAST_LOCATION_TIME, time);
    }

    private static long getLastLocationTime() {
        return OneSignalPrefs.getLong(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_LAST_LOCATION_TIME, -600000);
    }

    private static boolean hasLocationPermission(Context context) {
        Context context2 = context;
        return AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context2, "android.permission.ACCESS_FINE_LOCATION") == 0 || AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context2, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    private static void addPromptHandlerIfAvailable(LocationHandler locationHandler) {
        LocationHandler handler = locationHandler;
        if (handler instanceof LocationPromptCompletionHandler) {
            List<LocationPromptCompletionHandler> list = promptHandlers;
            List<LocationPromptCompletionHandler> list2 = list;
            synchronized (list) {
                try {
                    boolean add = promptHandlers.add((LocationPromptCompletionHandler) handler);
                } catch (Throwable th) {
                    Throwable th2 = th;
                    List<LocationPromptCompletionHandler> list3 = list2;
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    static void sendAndClearPromptHandlers(boolean promptLocation, OneSignal.PromptActionResult promptActionResult) {
        OneSignal.PromptActionResult result = promptActionResult;
        if (!promptLocation) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "LocationController sendAndClearPromptHandlers from non prompt flow");
            return;
        }
        List<LocationPromptCompletionHandler> list = promptHandlers;
        List<LocationPromptCompletionHandler> list2 = list;
        synchronized (list) {
            try {
                OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "LocationController calling prompt handlers");
                for (LocationPromptCompletionHandler promptHandler : promptHandlers) {
                    promptHandler.onAnswered(result);
                }
                promptHandlers.clear();
            } catch (Throwable th) {
                Throwable th2 = th;
                List<LocationPromptCompletionHandler> list3 = list2;
                throw th2;
            }
        }
    }

    static void getLocation(Context context, boolean z, boolean z2, LocationHandler locationHandler) {
        Context context2 = context;
        boolean promptLocation = z;
        boolean fallbackToSettings = z2;
        LocationHandler handler = locationHandler;
        addPromptHandlerIfAvailable(handler);
        classContext = context2;
        LocationHandler put = locationHandlers.put(handler.getType(), handler);
        if (!OneSignal.shareLocation) {
            sendAndClearPromptHandlers(promptLocation, OneSignal.PromptActionResult.ERROR);
            fireFailedComplete();
            return;
        }
        int locationCoarsePermission = -1;
        int locationFinePermission = AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context2, "android.permission.ACCESS_FINE_LOCATION");
        if (locationFinePermission == -1) {
            locationCoarsePermission = AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context2, "android.permission.ACCESS_COARSE_LOCATION");
            locationCoarse = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (locationFinePermission == 0 || locationCoarsePermission == 0) {
                sendAndClearPromptHandlers(promptLocation, OneSignal.PromptActionResult.PERMISSION_GRANTED);
                startGetLocation();
                return;
            }
            sendAndClearPromptHandlers(promptLocation, OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST);
            handler.onComplete((LocationPoint) null);
        } else if (locationFinePermission != 0) {
            try {
                List<String> permissionList = Arrays.asList(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 4096).requestedPermissions);
                OneSignal.PromptActionResult result = OneSignal.PromptActionResult.PERMISSION_DENIED;
                if (permissionList.contains("android.permission.ACCESS_FINE_LOCATION")) {
                    requestPermission = "android.permission.ACCESS_FINE_LOCATION";
                } else if (!permissionList.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.INFO, "Location permissions not added on AndroidManifest file");
                    result = OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST;
                } else if (locationCoarsePermission != 0) {
                    requestPermission = "android.permission.ACCESS_COARSE_LOCATION";
                }
                if (requestPermission != null && promptLocation) {
                    PermissionsActivity.startPrompt(fallbackToSettings);
                } else if (locationCoarsePermission == 0) {
                    sendAndClearPromptHandlers(promptLocation, OneSignal.PromptActionResult.PERMISSION_GRANTED);
                    startGetLocation();
                } else {
                    sendAndClearPromptHandlers(promptLocation, result);
                    fireFailedComplete();
                }
            } catch (PackageManager.NameNotFoundException e) {
                sendAndClearPromptHandlers(promptLocation, OneSignal.PromptActionResult.ERROR);
                e.printStackTrace();
            }
        } else {
            sendAndClearPromptHandlers(promptLocation, OneSignal.PromptActionResult.PERMISSION_GRANTED);
            startGetLocation();
        }
    }

    static void startGetLocation() {
        StringBuilder sb;
        LocationHandlerThread locationHandlerThread2;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("LocationController startGetLocation with lastLocation: ").append(lastLocation).toString());
        if (locationHandlerThread == null) {
            new LocationHandlerThread();
            locationHandlerThread = locationHandlerThread2;
        }
        try {
            if (isGooglePlayServicesAvailable()) {
                GMSLocationController.startGetLocation();
            } else if (isHMSAvailable()) {
                HMSLocationController.startGetLocation();
            } else {
                fireFailedComplete();
            }
        } catch (Throwable th) {
            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Location permission exists but there was an error initializing: ", th);
            fireFailedComplete();
        }
    }

    static void onFocusChange() {
        Object obj = syncLock;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                if (isGooglePlayServicesAvailable()) {
                    GMSLocationController.onFocusChange();
                    return;
                }
                if (isHMSAvailable()) {
                    HMSLocationController.onFocusChange();
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    static boolean isGooglePlayServicesAvailable() {
        return OSUtils.isAndroidDeviceType() && OSUtils.hasGMSLocationLibrary();
    }

    static boolean isHMSAvailable() {
        return OSUtils.isHuaweiDeviceType() && OSUtils.hasHMSLocationLibrary();
    }

    static void fireFailedComplete() {
        PermissionsActivity.answered = false;
        Object obj = syncLock;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                if (isGooglePlayServicesAvailable()) {
                    GMSLocationController.fireFailedComplete();
                } else if (isHMSAvailable()) {
                    HMSLocationController.fireFailedComplete();
                }
                fireComplete((LocationPoint) null);
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private static void fireComplete(LocationPoint locationPoint) {
        HashMap hashMap;
        LocationPoint point = locationPoint;
        new HashMap();
        HashMap hashMap2 = hashMap;
        Class<LocationController> cls = LocationController.class;
        Class<LocationController> cls2 = cls;
        synchronized (cls) {
            try {
                hashMap2.putAll(locationHandlers);
                locationHandlers.clear();
                Thread _fallbackFailThread = fallbackFailThread;
                for (PermissionType type : hashMap2.keySet()) {
                    ((LocationHandler) hashMap2.get(type)).onComplete(point);
                }
                if (_fallbackFailThread != null && !Thread.currentThread().equals(_fallbackFailThread)) {
                    _fallbackFailThread.interrupt();
                }
                if (_fallbackFailThread == fallbackFailThread) {
                    Class<LocationController> cls3 = LocationController.class;
                    Class<LocationController> cls4 = cls3;
                    synchronized (cls3) {
                        try {
                            if (_fallbackFailThread == fallbackFailThread) {
                                fallbackFailThread = null;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                Throwable th2 = th;
                                Class<LocationController> cls5 = cls4;
                                throw th2;
                            }
                        }
                    }
                }
                setLastLocationTime(System.currentTimeMillis());
            } catch (Throwable th3) {
                while (true) {
                    Throwable th4 = th3;
                    Class<LocationController> cls6 = cls2;
                    throw th4;
                }
            }
        }
    }

    protected static void fireCompleteForLocation(Location location) {
        StringBuilder sb;
        LocationPoint locationPoint;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Location location2 = location;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("LocationController fireCompleteForLocation with location: ").append(location2).toString());
        new LocationPoint();
        LocationPoint point = locationPoint;
        point.accuracy = Float.valueOf(location2.getAccuracy());
        point.bg = Boolean.valueOf(!OneSignal.isForeground());
        point.type = Integer.valueOf(locationCoarse ? 0 : 1);
        point.timeStamp = Long.valueOf(location2.getTime());
        if (locationCoarse) {
            new BigDecimal(location2.getLatitude());
            point.lat = Double.valueOf(bigDecimal.setScale(7, RoundingMode.HALF_UP).doubleValue());
            new BigDecimal(location2.getLongitude());
            point.log = Double.valueOf(bigDecimal2.setScale(7, RoundingMode.HALF_UP).doubleValue());
        } else {
            point.lat = Double.valueOf(location2.getLatitude());
            point.log = Double.valueOf(location2.getLongitude());
        }
        fireComplete(point);
        boolean scheduleUpdate = scheduleUpdate(classContext);
    }

    protected static class LocationHandlerThread extends HandlerThread {
        Handler mHandler;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        LocationHandlerThread() {
            super("OSH_LocationHandlerThread");
            Handler handler;
            start();
            new Handler(getLooper());
            this.mHandler = handler;
        }
    }
}
