package com.google.firebase.auth.api.internal;

import java.util.Locale;

public final class zzem {
    public static String zzem() {
        StringBuilder sb;
        Locale locale = Locale.getDefault();
        new StringBuilder();
        StringBuilder sb2 = sb;
        StringBuilder sb3 = sb2;
        zza(sb2, locale);
        if (!locale.equals(Locale.US)) {
            if (sb3.length() > 0) {
                StringBuilder append = sb3.append(", ");
            }
            zza(sb3, Locale.US);
        }
        return sb3.toString();
    }

    private static void zza(StringBuilder sb, Locale locale) {
        StringBuilder sb2 = sb;
        Locale locale2 = locale;
        String language = locale2.getLanguage();
        String str = language;
        if (language != null) {
            StringBuilder append = sb2.append(str);
            String country = locale2.getCountry();
            String str2 = country;
            if (country != null) {
                StringBuilder append2 = sb2.append("-");
                StringBuilder append3 = sb2.append(str2);
            }
        }
    }
}
