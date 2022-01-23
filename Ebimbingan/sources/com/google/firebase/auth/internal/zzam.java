package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.logging.C0547Logger;
import com.google.android.gms.common.util.C0589Base64Utils;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class zzam {
    private static final C0547Logger zzjt;

    @NonNull
    public static Map<String, Object> zzdd(String str) {
        String str2;
        String str3;
        String str4;
        String str5 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str5);
        List<String> zza = com.google.android.gms.internal.firebase_auth.zzam.zzd('.').zza((CharSequence) str5);
        List<String> list = zza;
        if (zza.size() < 2) {
            C0547Logger logger = zzjt;
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
            new String(C0589Base64Utils.decodeUrlSafeNoPadding(list.get(1)), "UTF-8");
            Map<String, Object> zzde = zzde(str2);
            return zzde == null ? Collections.EMPTY_MAP : zzde;
        } catch (UnsupportedEncodingException e) {
            zzjt.e("Unable to decode token", e, new Object[0]);
            return Collections.EMPTY_MAP;
        }
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [org.json.JSONObject] */
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

    @C0617VisibleForTesting
    private static Map<String, Object> zzc(JSONObject jSONObject) throws JSONException {
        Map<String, Object> map;
        JSONObject jSONObject2 = jSONObject;
        new ArrayMap();
        Map<String, Object> map2 = map;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            List<Object> list = obj;
            if (obj instanceof JSONArray) {
                list = zza((JSONArray) list);
            } else if (list instanceof JSONObject) {
                list = zzc((JSONObject) list);
            }
            Object put = map2.put(next, list);
        }
        return map2;
    }

    @C0617VisibleForTesting
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
        C0547Logger logger;
        new C0547Logger("JSONParser", new String[0]);
        zzjt = logger;
    }
}
