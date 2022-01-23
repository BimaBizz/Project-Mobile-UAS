package com.onesignal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

class AdvertisingIdProviderGPS implements AdvertisingIdentifierProvider {
    private static String lastValue;

    AdvertisingIdProviderGPS() {
    }

    static String getLastValue() {
        return lastValue;
    }

    public String getIdentifier(Context appContext) {
        try {
            AdvertisingIdClient.Info adInfo = AdvertisingIdClient.getAdvertisingIdInfo(appContext);
            if (adInfo.isLimitAdTrackingEnabled()) {
                lastValue = "OptedOut";
            } else {
                lastValue = adInfo.getId();
            }
            return lastValue;
        } catch (Throwable th) {
            OneSignal.Log(OneSignal.LOG_LEVEL.INFO, "Error getting Google Ad id: ", th);
            return null;
        }
    }
}
