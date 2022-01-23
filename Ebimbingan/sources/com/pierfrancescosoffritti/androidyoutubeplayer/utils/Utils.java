package com.pierfrancescosoffritti.androidyoutubeplayer.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Utils {
    public Utils() {
    }

    @SuppressLint({"DefaultLocale"})
    public static String formatTime(float f) {
        float f2 = f;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf((int) (f2 / 60.0f));
        Object[] objArr2 = objArr;
        objArr2[1] = Integer.valueOf((int) (f2 % 60.0f));
        return String.format("%d:%02d", objArr2);
    }

    public static boolean isOnline(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
