package com.onesignal;

import java.security.SecureRandom;

class OneSignalChromeTabAndroidFrame extends OneSignalChromeTab {
    private static boolean opened;

    OneSignalChromeTabAndroidFrame() {
    }

    static void setup(String str, String str2, String str3) {
        StringBuilder sb;
        StringBuilder sb2;
        SecureRandom secureRandom;
        StringBuilder sb3;
        StringBuilder sb4;
        String appId = str;
        String userId = str2;
        String adId = str3;
        if (!opened && OneSignal.remoteParams != null && !OneSignal.remoteParams.enterprise && appId != null && userId != null) {
            new StringBuilder();
            String params = sb.append("?app_id=").append(appId).append("&user_id=").append(userId).toString();
            if (adId != null) {
                new StringBuilder();
                params = sb4.append(params).append("&ad_id=").append(adId).toString();
            }
            new StringBuilder();
            StringBuilder append = sb2.append(params).append("&cbs_id=");
            new SecureRandom();
            String params2 = append.append(secureRandom.nextInt(Integer.MAX_VALUE)).toString();
            new StringBuilder();
            opened = open(sb3.append("https://onesignal.com/android_frame.html").append(params2).toString(), false);
        }
    }
}
