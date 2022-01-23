package com.google.firebase.auth.api.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.internal.firebase_auth.zzam;
import java.util.List;

public final class zzeg {
    private final int zzph;
    private final int zzpi = -1;

    private zzeg(String str, int i) {
        int i2 = i;
        this.zzph = zzcd(str);
    }

    public final boolean zzej() {
        return this.zzph >= zzcd("16.2.1");
    }

    public static String zzek() {
        return zzcc("firebase-auth");
    }

    private static String zzcc(String str) {
        String version = LibraryVersion.getInstance().getVersion(str);
        String str2 = version;
        if (TextUtils.isEmpty(version) || str2.equals("UNKNOWN")) {
            str2 = "-1";
        }
        return str2;
    }

    public static zzeg zzel() {
        zzeg zzeg;
        zzeg zzeg2 = zzeg;
        new zzeg(zzcc("firebase-auth-impl"), -1);
        return zzeg2;
    }

    private static int zzcd(String str) {
        String str2;
        String str3;
        String str4 = str;
        List<String> zza = zzam.zzbp(".").zza((CharSequence) str4);
        List<String> list = zza;
        if (zza.size() == 1) {
            return Integer.parseInt(str4);
        }
        if (list.size() == 3) {
            return (Integer.parseInt(list.get(0)) * 1000000) + (Integer.parseInt(list.get(1)) * 1000) + Integer.parseInt(list.get(2));
        }
        String str5 = "";
        for (String next : list) {
            String valueOf = String.valueOf(str5);
            String valueOf2 = String.valueOf(next);
            String str6 = valueOf2;
            if (valueOf2.length() != 0) {
                str3 = valueOf.concat(str6);
            } else {
                String str7 = valueOf;
                str3 = str2;
                new String(str7);
            }
            str5 = str3;
        }
        return Integer.parseInt(str5);
    }
}
