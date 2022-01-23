package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzc {
    private static final Pattern zza = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String zza(String str) {
        String str2;
        String str3 = str;
        if (TextUtils.isEmpty(str3)) {
            return str3;
        }
        Matcher matcher = zza.matcher(str3);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                new StringBuffer();
            }
            new String(Character.toChars(Integer.parseInt(matcher.group().substring(2), 16)));
            Matcher appendReplacement = matcher.appendReplacement(stringBuffer, str2);
        }
        if (stringBuffer == null) {
            return str3;
        }
        StringBuffer appendTail = matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
