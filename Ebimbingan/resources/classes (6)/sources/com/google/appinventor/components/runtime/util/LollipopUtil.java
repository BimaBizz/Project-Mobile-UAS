package com.google.appinventor.components.runtime.util;

import android.telephony.PhoneNumberUtils;
import java.util.Locale;

public final class LollipopUtil {
    private LollipopUtil() {
    }

    public static String formatNumber(String str) {
        return PhoneNumberUtils.formatNumber(str, Locale.getDefault().getCountry());
    }
}
