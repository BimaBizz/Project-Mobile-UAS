package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

/* renamed from: com.google.android.gms.internal.auth.zzcu */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0851zzcu {
    @GuardedBy("PhenotypeConstants.class")
    private static final ArrayMap<String, Uri> zza;

    public static synchronized Uri zza(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4 = str;
        synchronized (C0851zzcu.class) {
            Uri uri2 = zza.get(str4);
            Uri uri3 = uri2;
            if (uri2 == null) {
                String valueOf = String.valueOf(Uri.encode(str4));
                String str5 = valueOf;
                if (valueOf.length() != 0) {
                    str3 = "content://com.google.android.gms.phenotype/".concat(str5);
                } else {
                    str3 = str2;
                    new String("content://com.google.android.gms.phenotype/");
                }
                uri3 = Uri.parse(str3);
                Uri put = zza.put(str4, uri3);
            }
            uri = uri3;
        }
        return uri;
    }

    static {
        ArrayMap<String, Uri> arrayMap;
        new ArrayMap<>();
        zza = arrayMap;
    }
}
