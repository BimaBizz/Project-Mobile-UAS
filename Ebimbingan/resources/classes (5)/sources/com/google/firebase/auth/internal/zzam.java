package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.shaded.apache.http.protocol.HTTP;

final class zzam {
    private static final Logger zzjt;

    @NonNull
    public static Map<String, Object> zzdd(String str) {
        String str2;
        String str3;
        String str4;
        String str5 = str;
        String checkNotEmpty = Preconditions.checkNotEmpty(str5);
        List<String> zza = com.google.android.gms.internal.firebase_auth.zzam.zzd('.').zza((CharSequence) str5);
        List<String> list = zza;
        if (zza.size() < 2) {
            Logger logger = zzjt;
            String valueOf = String.valueOf(str5);
            String str6 = valueOf;
            if (valueOf.length() != 0) {
                str4 = "Invalid idToken ".concat(str6);
            } else {
                str4 = str3;
                new String("Invalid idToken ");
            }
            logger.e(str4, new Object[0]);
            return Collections.EMPTY_MAP;
        }
        try {
            new String(Base64Utils.decodeUrlSafeNoPadding(list.get(1)), HTTP.UTF_8);
            Map<String, Object> zzde = zzde(str2);
            return zzde == null ? Collections.EMPTY_MAP : zzde;
        } catch (UnsupportedEncodingException e) {
            zzjt.e("Unable to decode token", e, new Object[0]);
            return Collections.EMPTY_MAP;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: org.json.JSONObject} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.Object> zzde(java.lang.String r6) {
        /*
            r0 = r6
            r2 = r0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x000b
            r2 = 0
            r0 = r2
        L_0x000a:
            return r0
        L_0x000b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0026 }
            r5 = r2
            r2 = r5
            r3 = r5
            r4 = r0
            r3.<init>(r4)     // Catch:{ Exception -> 0x0026 }
            r5 = r2
            r2 = r5
            r3 = r5
            r1 = r3
            java.lang.Object r3 = org.json.JSONObject.NULL     // Catch:{ Exception -> 0x0026 }
            if (r2 == r3) goto L_0x0023
            r2 = r1
            java.util.Map r2 = zzc(r2)     // Catch:{ Exception -> 0x0026 }
            r0 = r2
            goto L_0x000a
        L_0x0023:
            r2 = 0
            r0 = r2
            goto L_0x000a
        L_0x0026:
            r2 = move-exception
            r1 = r2
            java.lang.String r2 = "JSONParser"
            java.lang.String r3 = "Failed to parse JSONObject into Map."
            int r2 = android.util.Log.d(r2, r3)
            com.google.android.gms.internal.firebase_auth.zzbl r2 = new com.google.android.gms.internal.firebase_auth.zzbl
            r5 = r2
            r2 = r5
            r3 = r5
            r4 = r1
            r3.<init>((java.lang.Throwable) r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.zzam.zzde(java.lang.String):java.util.Map");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.Map<java.lang.String, java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.util.List<java.lang.Object>} */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map<java.lang.String, java.lang.Object> zzc(org.json.JSONObject r9) throws org.json.JSONException {
        /*
            r0 = r9
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r8 = r5
            r5 = r8
            r6 = r8
            r6.<init>()
            r1 = r5
            r5 = r0
            java.util.Iterator r5 = r5.keys()
            r2 = r5
        L_0x0010:
            r5 = r2
            boolean r5 = r5.hasNext()
            if (r5 == 0) goto L_0x004b
            r5 = r2
            java.lang.Object r5 = r5.next()
            java.lang.String r5 = (java.lang.String) r5
            r3 = r5
            r5 = r0
            r6 = r3
            java.lang.Object r5 = r5.get(r6)
            r8 = r5
            r5 = r8
            r6 = r8
            r4 = r6
            boolean r5 = r5 instanceof org.json.JSONArray
            if (r5 == 0) goto L_0x003d
            r5 = r4
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            java.util.List r5 = zza(r5)
            r4 = r5
        L_0x0035:
            r5 = r1
            r6 = r3
            r7 = r4
            java.lang.Object r5 = r5.put(r6, r7)
            goto L_0x0010
        L_0x003d:
            r5 = r4
            boolean r5 = r5 instanceof org.json.JSONObject
            if (r5 == 0) goto L_0x0035
            r5 = r4
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.util.Map r5 = zzc(r5)
            r4 = r5
            goto L_0x0035
        L_0x004b:
            r5 = r1
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.zzam.zzc(org.json.JSONObject):java.util.Map");
    }

    @VisibleForTesting
    private static List<Object> zza(JSONArray jSONArray) throws JSONException {
        List<Object> list;
        JSONArray jSONArray2 = jSONArray;
        new ArrayList();
        List<Object> list2 = list;
        for (int i = 0; i < jSONArray2.length(); i++) {
            Object obj = jSONArray2.get(i);
            List<Object> list3 = obj;
            if (obj instanceof JSONArray) {
                list3 = zza((JSONArray) list3);
            } else if (list3 instanceof JSONObject) {
                list3 = zzc((JSONObject) list3);
            }
            boolean add = list2.add(list3);
        }
        return list2;
    }

    static {
        Logger logger;
        new Logger("JSONParser", new String[0]);
        zzjt = logger;
    }
}
