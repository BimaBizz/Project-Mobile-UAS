package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class HttpUtils {
    private static final Pattern zza = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final Pattern zzb = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final Pattern zzc = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private HttpUtils() {
    }

    @RecentlyNonNull
    @KeepForSdk
    public static Map<String, String> parse(@RecentlyNonNull URI uri, @RecentlyNonNull String str) {
        Map map;
        Map map2;
        Scanner scanner;
        Throwable th;
        String str2;
        String str3 = str;
        Map emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null) {
            map = emptyMap;
        } else if (rawQuery.length() > 0) {
            new HashMap();
            new Scanner(rawQuery);
            Scanner useDelimiter = scanner.useDelimiter("&");
            while (scanner.hasNext()) {
                String[] split = scanner.next().split("=");
                int length = split.length;
                if (length == 0 || length > 2) {
                    new IllegalArgumentException("bad parameter");
                    throw th;
                }
                String zza2 = zza(split[0], str3);
                if (length == 2) {
                    str2 = zza(split[1], str3);
                } else {
                    str2 = null;
                }
                Object put = map2.put(zza2, str2);
            }
            map = map2;
        } else {
            map = emptyMap;
        }
        return map;
    }

    private static String zza(String str, String str2) {
        Throwable th;
        String str3 = str;
        String str4 = str2;
        if (str4 == null) {
            str4 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str3, str4);
        } catch (UnsupportedEncodingException e) {
            new IllegalArgumentException(e);
            throw th;
        }
    }
}
