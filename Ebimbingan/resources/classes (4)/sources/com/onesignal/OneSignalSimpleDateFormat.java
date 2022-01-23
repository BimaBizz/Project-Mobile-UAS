package com.onesignal;

import java.text.SimpleDateFormat;
import java.util.Locale;

class OneSignalSimpleDateFormat {
    OneSignalSimpleDateFormat() {
    }

    static SimpleDateFormat iso8601Format() {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        return simpleDateFormat2;
    }
}
