package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;

public final class zzfe {
    @Nullable
    public static String getProperty(String str) {
        String str2 = str;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str2});
            Object obj = invoke;
            if (invoke != null && String.class.isAssignableFrom(obj.getClass())) {
                return (String) obj;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
