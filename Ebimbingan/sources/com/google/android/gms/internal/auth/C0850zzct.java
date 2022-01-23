package com.google.android.gms.internal.auth;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.auth.zzct */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0850zzct {
    private final Map<String, Map<String, String>> zza;

    C0850zzct(Map<String, Map<String, String>> map) {
        this.zza = map;
    }

    @Nullable
    public final String zza(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        String str4;
        String str5;
        String str6;
        Uri uri2 = uri;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        if (uri2 != null) {
            str4 = uri2.toString();
        } else if (str7 == null) {
            return null;
        } else {
            str4 = str7;
        }
        Map map = this.zza.get(str4);
        Map map2 = map;
        if (map == null) {
            return null;
        }
        if (str8 != null) {
            String valueOf = String.valueOf(str8);
            String valueOf2 = String.valueOf(str9);
            String str10 = valueOf2;
            if (valueOf2.length() != 0) {
                str5 = valueOf.concat(str10);
            } else {
                String str11 = valueOf;
                str5 = str6;
                new String(str11);
            }
        } else {
            str5 = str9;
        }
        return (String) map2.get(str5);
    }
}
