package com.onesignal;

import java.io.File;

class RootToolsInternalMethods {
    RootToolsInternalMethods() {
    }

    static boolean isRooted() {
        File file;
        StringBuilder sb;
        String[] strArr = new String[8];
        strArr[0] = "/sbin/";
        String[] strArr2 = strArr;
        strArr2[1] = "/system/bin/";
        String[] strArr3 = strArr2;
        strArr3[2] = "/system/xbin/";
        String[] strArr4 = strArr3;
        strArr4[3] = "/data/local/xbin/";
        String[] strArr5 = strArr4;
        strArr5[4] = "/data/local/bin/";
        String[] strArr6 = strArr5;
        strArr6[5] = "/system/sd/xbin/";
        String[] strArr7 = strArr6;
        strArr7[6] = "/system/bin/failsafe/";
        String[] places = strArr7;
        places[7] = "/data/local/";
        String[] strArr8 = places;
        try {
            int length = strArr8.length;
            for (int i = 0; i < length; i++) {
                String where = strArr8[i];
                new StringBuilder();
                new File(sb.append(where).append("su").toString());
                if (file.exists()) {
                    return true;
                }
            }
        } catch (Throwable th) {
            Throwable th2 = th;
        }
        return false;
    }
}
