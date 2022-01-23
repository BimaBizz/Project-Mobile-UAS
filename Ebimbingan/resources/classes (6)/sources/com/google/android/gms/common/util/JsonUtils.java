package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepForSdk
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class JsonUtils {
    private static final Pattern zza = Pattern.compile("\\\\.");
    private static final Pattern zzb = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    private JsonUtils() {
    }

    @KeepForSdk
    @RecentlyNullable
    public static String escapeString(@Nullable String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        Matcher matcher = zzb.matcher(str2);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                new StringBuffer();
            }
            switch (matcher.group().charAt(0)) {
                case 8:
                    Matcher appendReplacement = matcher.appendReplacement(stringBuffer, "\\\\b");
                    break;
                case ConnectionResult.SERVICE_INVALID:
                    Matcher appendReplacement2 = matcher.appendReplacement(stringBuffer, "\\\\t");
                    break;
                case 10:
                    Matcher appendReplacement3 = matcher.appendReplacement(stringBuffer, "\\\\n");
                    break;
                case 12:
                    Matcher appendReplacement4 = matcher.appendReplacement(stringBuffer, "\\\\f");
                    break;
                case 13:
                    Matcher appendReplacement5 = matcher.appendReplacement(stringBuffer, "\\\\r");
                    break;
                case '\"':
                    Matcher appendReplacement6 = matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                    break;
                case '/':
                    Matcher appendReplacement7 = matcher.appendReplacement(stringBuffer, "\\\\/");
                    break;
                case '\\':
                    Matcher appendReplacement8 = matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                    break;
            }
        }
        if (stringBuffer == null) {
            return str2;
        }
        StringBuffer appendTail = matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @RecentlyNonNull
    @KeepForSdk
    public static String unescapeString(@RecentlyNonNull String str) {
        Throwable th;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        String zza2 = zzc.zza(str2);
        Matcher matcher = zza.matcher(zza2);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                new StringBuffer();
            }
            switch (matcher.group().charAt(1)) {
                case '\"':
                    Matcher appendReplacement = matcher.appendReplacement(stringBuffer, "\"");
                    break;
                case '/':
                    Matcher appendReplacement2 = matcher.appendReplacement(stringBuffer, "/");
                    break;
                case '\\':
                    Matcher appendReplacement3 = matcher.appendReplacement(stringBuffer, "\\\\");
                    break;
                case 'b':
                    Matcher appendReplacement4 = matcher.appendReplacement(stringBuffer, "\b");
                    break;
                case 'f':
                    Matcher appendReplacement5 = matcher.appendReplacement(stringBuffer, "\f");
                    break;
                case 'n':
                    Matcher appendReplacement6 = matcher.appendReplacement(stringBuffer, "\n");
                    break;
                case 'r':
                    Matcher appendReplacement7 = matcher.appendReplacement(stringBuffer, "\r");
                    break;
                case 't':
                    Matcher appendReplacement8 = matcher.appendReplacement(stringBuffer, "\t");
                    break;
                default:
                    new IllegalStateException("Found an escaped character that should never be.");
                    throw th;
            }
        }
        if (stringBuffer == null) {
            return zza2;
        }
        StringBuffer appendTail = matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @KeepForSdk
    public static boolean areJsonValuesEquivalent(@Nullable Object obj, @Nullable Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (obj3 == null && obj4 == null) {
            return true;
        }
        if (obj3 == null || obj4 == null) {
            return false;
        }
        if ((obj3 instanceof JSONObject) && (obj4 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj3;
            JSONObject jSONObject2 = (JSONObject) obj4;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    Object checkNotNull = Preconditions.checkNotNull(next);
                    if (!areJsonValuesEquivalent(jSONObject.get(next), jSONObject2.get(next))) {
                        return false;
                    }
                } catch (JSONException e) {
                    return false;
                }
            }
            return true;
        } else if (!(obj3 instanceof JSONArray) || !(obj4 instanceof JSONArray)) {
            return obj3.equals(obj4);
        } else {
            JSONArray jSONArray = (JSONArray) obj3;
            JSONArray jSONArray2 = (JSONArray) obj4;
            if (jSONArray.length() != jSONArray2.length()) {
                return false;
            }
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    if (!areJsonValuesEquivalent(jSONArray.get(i), jSONArray2.get(i))) {
                        return false;
                    }
                    i++;
                } catch (JSONException e2) {
                    return false;
                }
            }
            return true;
        }
    }
}
