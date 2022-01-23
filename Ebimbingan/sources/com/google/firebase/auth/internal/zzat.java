package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.logging.C0547Logger;
import com.google.android.gms.internal.firebase_auth.zzbl;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zzac;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.shaded.apache.http.cookie.ClientCookie;

public final class zzat {
    private C0547Logger zzjt;
    private Context zzml;
    private String zzuy;
    private SharedPreferences zzuz = this.zzml.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", new Object[]{this.zzuy}), 0);

    public zzat(Context context, String str) {
        C0547Logger logger;
        Context context2 = context;
        Object checkNotNull = C0446Preconditions.checkNotNull(context2);
        this.zzuy = C0446Preconditions.checkNotEmpty(str);
        this.zzml = context2.getApplicationContext();
        new C0547Logger("StorageHelpers", new String[0]);
        this.zzjt = logger;
    }

    public final void zzg(FirebaseUser firebaseUser) {
        FirebaseUser firebaseUser2 = firebaseUser;
        Object checkNotNull = C0446Preconditions.checkNotNull(firebaseUser2);
        String zzi = zzi(firebaseUser2);
        String str = zzi;
        if (!TextUtils.isEmpty(zzi)) {
            this.zzuz.edit().putString("com.google.firebase.auth.FIREBASE_USER", str).apply();
        }
    }

    @Nullable
    public final FirebaseUser zzfr() {
        JSONObject jSONObject;
        String string = this.zzuz.getString("com.google.firebase.auth.FIREBASE_USER", (String) null);
        String str = string;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            new JSONObject(str);
            JSONObject jSONObject2 = jSONObject;
            JSONObject jSONObject3 = jSONObject2;
            if (jSONObject2.has(CommonProperties.TYPE) && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject3.optString(CommonProperties.TYPE))) {
                return zzd(jSONObject3);
            }
        } catch (Exception e) {
        }
        return null;
    }

    public final void zza(FirebaseUser firebaseUser, zzes zzes) {
        FirebaseUser firebaseUser2 = firebaseUser;
        zzes zzes2 = zzes;
        Object checkNotNull = C0446Preconditions.checkNotNull(firebaseUser2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(zzes2);
        this.zzuz.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser2.getUid()}), zzes2.zzew()).apply();
    }

    public final zzes zzh(FirebaseUser firebaseUser) {
        FirebaseUser firebaseUser2 = firebaseUser;
        Object checkNotNull = C0446Preconditions.checkNotNull(firebaseUser2);
        String string = this.zzuz.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser2.getUid()}), (String) null);
        String str = string;
        if (string != null) {
            return zzes.zzcn(str);
        }
        return null;
    }

    public final void clear(String str) {
        this.zzuz.edit().remove(str).apply();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v41, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v56, resolved type: org.json.JSONArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String zzi(com.google.firebase.auth.FirebaseUser r14) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            org.json.JSONObject r8 = new org.json.JSONObject
            r12 = r8
            r8 = r12
            r9 = r12
            r9.<init>()
            r2 = r8
            java.lang.Class<com.google.firebase.auth.internal.zzm> r8 = com.google.firebase.auth.internal.zzm.class
            r9 = r1
            java.lang.Class r9 = r9.getClass()
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L_0x011e
            r8 = r1
            com.google.firebase.auth.internal.zzm r8 = (com.google.firebase.auth.internal.zzm) r8
            r3 = r8
            r8 = r2
            java.lang.String r9 = "cachedTokenState"
            r10 = r3
            java.lang.String r10 = r10.zzcz()     // Catch:{ Exception -> 0x0105 }
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch:{ Exception -> 0x0105 }
            r8 = r2
            java.lang.String r9 = "applicationName"
            r10 = r3
            com.google.firebase.FirebaseApp r10 = r10.zzcu()     // Catch:{ Exception -> 0x0105 }
            java.lang.String r10 = r10.getName()     // Catch:{ Exception -> 0x0105 }
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch:{ Exception -> 0x0105 }
            r8 = r2
            java.lang.String r9 = "type"
            java.lang.String r10 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch:{ Exception -> 0x0105 }
            r8 = r3
            java.util.List r8 = r8.zzff()     // Catch:{ Exception -> 0x0105 }
            if (r8 == 0) goto L_0x0084
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x0105 }
            r12 = r8
            r8 = r12
            r9 = r12
            r9.<init>()     // Catch:{ Exception -> 0x0105 }
            r4 = r8
            r8 = r3
            java.util.List r8 = r8.zzff()     // Catch:{ Exception -> 0x0105 }
            r5 = r8
            r8 = 0
            r6 = r8
        L_0x005d:
            r8 = r6
            r9 = r5
            int r9 = r9.size()     // Catch:{ Exception -> 0x0105 }
            if (r8 >= r9) goto L_0x007b
            r8 = r5
            r9 = r6
            java.lang.Object r8 = r8.get(r9)     // Catch:{ Exception -> 0x0105 }
            com.google.firebase.auth.internal.zzi r8 = (com.google.firebase.auth.internal.zzi) r8     // Catch:{ Exception -> 0x0105 }
            r7 = r8
            r8 = r4
            r9 = r7
            java.lang.String r9 = r9.zzew()     // Catch:{ Exception -> 0x0105 }
            org.json.JSONArray r8 = r8.put(r9)     // Catch:{ Exception -> 0x0105 }
            int r6 = r6 + 1
            goto L_0x005d
        L_0x007b:
            r8 = r2
            java.lang.String r9 = "userInfos"
            r10 = r4
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch:{ Exception -> 0x0105 }
        L_0x0084:
            r8 = r2
            java.lang.String r9 = "anonymous"
            r10 = r3
            boolean r10 = r10.isAnonymous()     // Catch:{ Exception -> 0x0105 }
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch:{ Exception -> 0x0105 }
            r8 = r2
            java.lang.String r9 = "version"
            java.lang.String r10 = "2"
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch:{ Exception -> 0x0105 }
            r8 = r3
            com.google.firebase.auth.FirebaseUserMetadata r8 = r8.getMetadata()     // Catch:{ Exception -> 0x0105 }
            if (r8 == 0) goto L_0x00b6
            r8 = r2
            java.lang.String r9 = "userMetadata"
            r10 = r3
            com.google.firebase.auth.FirebaseUserMetadata r10 = r10.getMetadata()     // Catch:{ Exception -> 0x0105 }
            com.google.firebase.auth.internal.zzo r10 = (com.google.firebase.auth.internal.zzo) r10     // Catch:{ Exception -> 0x0105 }
            org.json.JSONObject r10 = r10.zzfg()     // Catch:{ Exception -> 0x0105 }
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch:{ Exception -> 0x0105 }
        L_0x00b6:
            r8 = r3
            com.google.firebase.auth.zzv r8 = r8.zzdb()     // Catch:{ Exception -> 0x0105 }
            com.google.firebase.auth.internal.zzq r8 = (com.google.firebase.auth.internal.zzq) r8     // Catch:{ Exception -> 0x0105 }
            java.util.List r8 = r8.zzdc()     // Catch:{ Exception -> 0x0105 }
            r12 = r8
            r8 = r12
            r9 = r12
            r4 = r9
            if (r8 == 0) goto L_0x00fe
            r8 = r4
            boolean r8 = r8.isEmpty()     // Catch:{ Exception -> 0x0105 }
            if (r8 != 0) goto L_0x00fe
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x0105 }
            r12 = r8
            r8 = r12
            r9 = r12
            r9.<init>()     // Catch:{ Exception -> 0x0105 }
            r5 = r8
            r8 = 0
            r6 = r8
        L_0x00d9:
            r8 = r6
            r9 = r4
            int r9 = r9.size()     // Catch:{ Exception -> 0x0105 }
            if (r8 >= r9) goto L_0x00f5
            r8 = r5
            r9 = r4
            r10 = r6
            java.lang.Object r9 = r9.get(r10)     // Catch:{ Exception -> 0x0105 }
            com.google.firebase.auth.zzx r9 = (com.google.firebase.auth.zzx) r9     // Catch:{ Exception -> 0x0105 }
            org.json.JSONObject r9 = r9.toJson()     // Catch:{ Exception -> 0x0105 }
            org.json.JSONArray r8 = r8.put(r9)     // Catch:{ Exception -> 0x0105 }
            int r6 = r6 + 1
            goto L_0x00d9
        L_0x00f5:
            r8 = r2
            java.lang.String r9 = "userMultiFactorInfo"
            r10 = r5
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch:{ Exception -> 0x0105 }
        L_0x00fe:
            r8 = r2
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0105 }
            r0 = r8
        L_0x0104:
            return r0
        L_0x0105:
            r8 = move-exception
            r4 = r8
            r8 = r0
            com.google.android.gms.common.logging.Logger r8 = r8.zzjt
            java.lang.String r9 = "Failed to turn object into JSON"
            r10 = r4
            r11 = 0
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r8.wtf(r9, r10, r11)
            com.google.android.gms.internal.firebase_auth.zzbl r8 = new com.google.android.gms.internal.firebase_auth.zzbl
            r12 = r8
            r8 = r12
            r9 = r12
            r10 = r4
            r9.<init>((java.lang.Throwable) r10)
            throw r8
        L_0x011e:
            r8 = 0
            r0 = r8
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.zzat.zzi(com.google.firebase.auth.FirebaseUser):java.lang.String");
    }

    private final zzm zzd(JSONObject jSONObject) {
        List list;
        zzm zzm;
        List list2;
        JSONObject jSONObject2;
        zzac zzac;
        JSONObject jSONObject3 = jSONObject;
        try {
            String string = jSONObject3.getString("cachedTokenState");
            String string2 = jSONObject3.getString("applicationName");
            boolean z = jSONObject3.getBoolean("anonymous");
            String str = "2";
            String string3 = jSONObject3.getString(ClientCookie.VERSION_ATTR);
            String str2 = string3;
            if (string3 != null) {
                str = str2;
            }
            JSONArray jSONArray = jSONObject3.getJSONArray("userInfos");
            JSONArray jSONArray2 = jSONArray;
            int length = jSONArray.length();
            new ArrayList(length);
            List list3 = list;
            for (int i = 0; i < length; i++) {
                boolean add = list3.add(zzi.zzda(jSONArray2.getString(i)));
            }
            new zzm(FirebaseApp.getInstance(string2), list3);
            zzm zzm2 = zzm;
            if (!TextUtils.isEmpty(string)) {
                zzm2.zza(zzes.zzcn(string));
            }
            if (!z) {
                FirebaseUser zzcx = zzm2.zzcx();
            }
            zzm zzdb = zzm2.zzdb(str);
            if (jSONObject3.has("userMetadata")) {
                zzo zzb = zzo.zzb(jSONObject3.getJSONObject("userMetadata"));
                zzo zzo = zzb;
                if (zzb != null) {
                    zzm2.zza(zzo);
                }
            }
            if (jSONObject3.has("userMultiFactorInfo")) {
                JSONArray jSONArray3 = jSONObject3.getJSONArray("userMultiFactorInfo");
                JSONArray jSONArray4 = jSONArray3;
                if (jSONArray3 != null) {
                    new ArrayList();
                    List list4 = list2;
                    for (int i2 = 0; i2 < jSONArray4.length(); i2++) {
                        List list5 = list4;
                        new JSONObject(jSONArray4.getString(i2));
                        JSONObject jSONObject4 = jSONObject2;
                        JSONObject jSONObject5 = jSONObject4;
                        if ("phone".equals(jSONObject4.optString("factorIdKey"))) {
                            zzac = zzac.zza(jSONObject5);
                        } else {
                            zzac = null;
                        }
                        boolean add2 = list5.add(zzac);
                    }
                    zzm2.zzb(list4);
                }
            }
            return zzm2;
        } catch (zzbl | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException e) {
            this.zzjt.wtf(e);
            return null;
        }
    }
}
