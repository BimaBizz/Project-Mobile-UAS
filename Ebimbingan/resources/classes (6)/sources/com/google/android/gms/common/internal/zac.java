package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ConfigurationCompat;
import com.google.android.gms.base.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zac {
    @GuardedBy("sCache")
    private static final SimpleArrayMap<String, String> zaa;
    @GuardedBy("sCache")
    @Nullable
    private static Locale zab;

    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            zaa = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zac.<clinit>():void");
    }

    @Nullable
    public static String zaa(Context context, int i) {
        StringBuilder sb;
        Context context2 = context;
        int i2 = i;
        Resources resources = context2.getResources();
        switch (i2) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case ConnectionResult.SERVICE_UPDATING:
                return null;
            case 5:
                int e = Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zai(context2, "common_google_play_services_invalid_account_title");
            case 7:
                int e2 = Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zai(context2, "common_google_play_services_network_error_title");
            case 8:
                int e3 = Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case ConnectionResult.SERVICE_INVALID:
                int e4 = Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                int e5 = Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case ConnectionResult.LICENSE_CHECK_FAILED:
                int e6 = Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                int e7 = Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                int e8 = Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zai(context2, "common_google_play_services_sign_in_failed_title");
            case 20:
                int e9 = Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zai(context2, "common_google_play_services_restricted_profile_title");
            default:
                new StringBuilder(33);
                StringBuilder append = sb.append("Unexpected error code ");
                StringBuilder append2 = sb.append(i2);
                int e10 = Log.e("GoogleApiAvailability", sb.toString());
                return null;
        }
    }

    @NonNull
    public static String zab(Context context, int i) {
        String zaa2;
        Context context2 = context;
        int i2 = i;
        if (i2 == 6) {
            zaa2 = zai(context2, "common_google_play_services_resolution_required_title");
        } else {
            zaa2 = zaa(context2, i2);
        }
        return zaa2 == null ? context2.getResources().getString(R.string.common_google_play_services_notification_ticker) : zaa2;
    }

    @NonNull
    public static String zac(Context context, int i) {
        Context context2 = context;
        Resources resources = context2.getResources();
        String zaf = zaf(context2);
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_text, new Object[]{zaf});
            case 2:
                if (DeviceProperties.isWearableWithoutPlayStore(context2)) {
                    return resources.getString(R.string.common_google_play_services_wear_update_text);
                }
                return resources.getString(R.string.common_google_play_services_update_text, new Object[]{zaf});
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{zaf});
            case 5:
                return zah(context2, "common_google_play_services_invalid_account_text", zaf);
            case 7:
                return zah(context2, "common_google_play_services_network_error_text", zaf);
            case ConnectionResult.SERVICE_INVALID:
                return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{zaf});
            case 16:
                return zah(context2, "common_google_play_services_api_unavailable_text", zaf);
            case 17:
                return zah(context2, "common_google_play_services_sign_in_failed_text", zaf);
            case ConnectionResult.SERVICE_UPDATING:
                return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{zaf});
            case 20:
                return zah(context2, "common_google_play_services_restricted_profile_text", zaf);
            default:
                return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, new Object[]{zaf});
        }
    }

    @NonNull
    public static String zad(Context context, int i) {
        Context context2 = context;
        int i2 = i;
        if (i2 == 6 || i2 == 19) {
            return zah(context2, "common_google_play_services_resolution_required_text", zaf(context2));
        }
        return zac(context2, i2);
    }

    @NonNull
    public static String zae(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_button);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_button);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_button);
            default:
                return resources.getString(17039370);
        }
    }

    public static String zaf(Context context) {
        Context context2 = context;
        String packageName = context2.getPackageName();
        try {
            return Wrappers.packageManager(context2).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            String str = context2.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zag(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    private static String zah(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str2;
        Resources resources = context2.getResources();
        String zai = zai(context2, str);
        if (zai == null) {
            zai = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, zai, new Object[]{str3});
    }

    /* JADX INFO: finally extract failed */
    @Nullable
    private static String zai(Context context, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        Context context2 = context;
        String str6 = str;
        SimpleArrayMap<String, String> simpleArrayMap = zaa;
        synchronized (simpleArrayMap) {
            try {
                Locale locale = ConfigurationCompat.getLocales(context2.getResources().getConfiguration()).get(0);
                if (!locale.equals(zab)) {
                    zaa.clear();
                    zab = locale;
                }
                String str7 = (String) zaa.get(str6);
                if (str7 != null) {
                    return str7;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context2);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str6, "string", "com.google.android.gms");
                if (identifier == 0) {
                    String str8 = "GoogleApiAvailability";
                    String str9 = "Missing resource: ";
                    if (str6.length() != 0) {
                        str5 = str9.concat(str6);
                    } else {
                        new String(str9);
                        str5 = str4;
                    }
                    int w = Log.w(str8, str5);
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    String str10 = "GoogleApiAvailability";
                    String str11 = "Got empty resource: ";
                    if (str6.length() != 0) {
                        str3 = str11.concat(str6);
                    } else {
                        new String(str11);
                        str3 = str2;
                    }
                    int w2 = Log.w(str10, str3);
                    return null;
                }
                Object put = zaa.put(str6, string);
                return string;
            } catch (Throwable th) {
                Throwable th2 = th;
                SimpleArrayMap<String, String> simpleArrayMap2 = simpleArrayMap;
                throw th2;
            }
        }
    }
}
