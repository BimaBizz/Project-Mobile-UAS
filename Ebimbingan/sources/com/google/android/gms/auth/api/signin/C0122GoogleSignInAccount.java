package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.util.C0592Clock;
import com.google.android.gms.common.util.C0597DefaultClock;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C0463SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
/* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInAccount */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0122GoogleSignInAccount extends C0460AbstractSafeParcelable implements C0447ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0122GoogleSignInAccount> CREATOR;
    @RecentlyNonNull
    @C0617VisibleForTesting
    public static C0592Clock zaa = C0597DefaultClock.getInstance();
    @C0463SafeParcelable.VersionField(id = 1)
    final int zab;
    @C0463SafeParcelable.Field(id = 10)
    List<C0235Scope> zac;
    @C0463SafeParcelable.Field(getter = "getId", id = 2)
    @Nullable
    private String zad;
    @C0463SafeParcelable.Field(getter = "getIdToken", id = 3)
    @Nullable
    private String zae;
    @C0463SafeParcelable.Field(getter = "getEmail", id = 4)
    @Nullable
    private String zaf;
    @C0463SafeParcelable.Field(getter = "getDisplayName", id = 5)
    @Nullable
    private String zag;
    @C0463SafeParcelable.Field(getter = "getPhotoUrl", id = 6)
    @Nullable
    private Uri zah;
    @C0463SafeParcelable.Field(getter = "getServerAuthCode", id = 7)
    @Nullable
    private String zai;
    @C0463SafeParcelable.Field(getter = "getExpirationTimeSecs", id = 8)
    private long zaj;
    @C0463SafeParcelable.Field(getter = "getObfuscatedIdentifier", id = 9)
    private String zak;
    @C0463SafeParcelable.Field(getter = "getGivenName", id = 11)
    @Nullable
    private String zal;
    @C0463SafeParcelable.Field(getter = "getFamilyName", id = 12)
    @Nullable
    private String zam;
    private Set<C0235Scope> zan;

    static {
        Parcelable.Creator<C0122GoogleSignInAccount> creator;
        new C0161zab();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0122GoogleSignInAccount(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) @Nullable String str, @C0463SafeParcelable.Param(id = 3) @Nullable String str2, @C0463SafeParcelable.Param(id = 4) @Nullable String str3, @C0463SafeParcelable.Param(id = 5) @Nullable String str4, @C0463SafeParcelable.Param(id = 6) @Nullable Uri uri, @C0463SafeParcelable.Param(id = 7) @Nullable String str5, @C0463SafeParcelable.Param(id = 8) long j, @C0463SafeParcelable.Param(id = 9) String str6, @C0463SafeParcelable.Param(id = 10) List<C0235Scope> list, @C0463SafeParcelable.Param(id = 11) @Nullable String str7, @C0463SafeParcelable.Param(id = 12) @Nullable String str8) {
        Set<C0235Scope> set;
        new HashSet();
        this.zan = set;
        this.zab = i;
        this.zad = str;
        this.zae = str2;
        this.zaf = str3;
        this.zag = str4;
        this.zah = uri;
        this.zai = str5;
        this.zaj = j;
        this.zak = str6;
        this.zac = list;
        this.zal = str7;
        this.zam = str8;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0122GoogleSignInAccount createDefault() {
        Account account;
        Set set;
        new Account("<<default account>>", "com.google");
        new HashSet();
        return zae(account, set);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0122GoogleSignInAccount fromAccount(@RecentlyNonNull Account account) {
        Set set;
        new ArraySet();
        return zae(account, set);
    }

    @RecentlyNullable
    public static C0122GoogleSignInAccount zaa(@Nullable String str) throws JSONException {
        JSONObject jSONObject;
        Uri uri;
        Set set;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Object obj;
        String str7 = str;
        if (TextUtils.isEmpty(str7)) {
            return null;
        }
        new JSONObject(str7);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            new C0235Scope(jSONArray.getString(i));
            boolean add = set.add(obj);
        }
        String optString2 = jSONObject.optString(CommonProperties.ID);
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        C0122GoogleSignInAccount zab2 = zab(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), set);
        zab2.zai = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return zab2;
    }

    @RecentlyNonNull
    public static C0122GoogleSignInAccount zab(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Uri uri, @Nullable Long l, @RecentlyNonNull String str7, @RecentlyNonNull Set<C0235Scope> set) {
        C0122GoogleSignInAccount googleSignInAccount;
        List list;
        long longValue = l.longValue();
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str7);
        new ArrayList((Collection) C0446Preconditions.checkNotNull(set));
        new C0122GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, longValue, checkNotEmpty, list, str5, str6);
        return googleSignInAccount;
    }

    private static C0122GoogleSignInAccount zae(Account account, Set<C0235Scope> set) {
        Account account2 = account;
        return zab((String) null, (String) null, account2.name, (String) null, (String) null, (String) null, (Uri) null, 0L, account2.name, set);
    }

    @RecentlyNullable
    public Account getAccount() {
        Account account;
        String str = this.zaf;
        if (str == null) {
            return null;
        }
        new Account(str, "com.google");
        return account;
    }

    @RecentlyNullable
    public String getDisplayName() {
        return this.zag;
    }

    @RecentlyNullable
    public String getEmail() {
        return this.zaf;
    }

    @RecentlyNullable
    public String getFamilyName() {
        return this.zam;
    }

    @RecentlyNullable
    public String getGivenName() {
        return this.zal;
    }

    @NonNull
    public Set<C0235Scope> getGrantedScopes() {
        Set<C0235Scope> set;
        new HashSet(this.zac);
        return set;
    }

    @RecentlyNullable
    public String getId() {
        return this.zad;
    }

    @RecentlyNullable
    public String getIdToken() {
        return this.zae;
    }

    @RecentlyNullable
    public Uri getPhotoUrl() {
        return this.zah;
    }

    @NonNull
    @C0206KeepForSdk
    public Set<C0235Scope> getRequestedScopes() {
        Set<C0235Scope> set;
        new HashSet(this.zac);
        boolean addAll = set.addAll(this.zan);
        return set;
    }

    @RecentlyNullable
    public String getServerAuthCode() {
        return this.zai;
    }

    public int hashCode() {
        return ((this.zak.hashCode() + 527) * 31) + getRequestedScopes().hashCode();
    }

    @C0206KeepForSdk
    public boolean isExpired() {
        return zaa.currentTimeMillis() / 1000 >= this.zaj + -300;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public C0122GoogleSignInAccount requestExtraScopes(@RecentlyNonNull C0235Scope... scopeArr) {
        C0235Scope[] scopeArr2 = scopeArr;
        if (scopeArr2 != null) {
            boolean addAll = Collections.addAll(this.zan, scopeArr2);
        }
        return this;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zab);
        C0462SafeParcelWriter.writeString(parcel2, 2, getId(), false);
        C0462SafeParcelWriter.writeString(parcel2, 3, getIdToken(), false);
        C0462SafeParcelWriter.writeString(parcel2, 4, getEmail(), false);
        C0462SafeParcelWriter.writeString(parcel2, 5, getDisplayName(), false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 6, getPhotoUrl(), i, false);
        C0462SafeParcelWriter.writeString(parcel2, 7, getServerAuthCode(), false);
        C0462SafeParcelWriter.writeLong(parcel2, 8, this.zaj);
        C0462SafeParcelWriter.writeString(parcel2, 9, this.zak, false);
        C0462SafeParcelWriter.writeTypedList(parcel2, 10, this.zac, false);
        C0462SafeParcelWriter.writeString(parcel2, 11, getGivenName(), false);
        C0462SafeParcelWriter.writeString(parcel2, 12, getFamilyName(), false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    @NonNull
    public final String zac() {
        return this.zak;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v55, resolved type: org.json.JSONArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.RecentlyNonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zad() {
        /*
            r10 = this;
            r1 = r10
            org.json.JSONObject r6 = new org.json.JSONObject
            r2 = r6
            r6 = r2
            r6.<init>()
            r6 = r1
            java.lang.String r6 = r6.getId()     // Catch:{ JSONException -> 0x0123 }
            r3 = r6
            r6 = r3
            if (r6 == 0) goto L_0x001e
            r6 = r2
            java.lang.String r7 = "id"
            r8 = r1
            java.lang.String r8 = r8.getId()     // Catch:{ JSONException -> 0x0123 }
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch:{ JSONException -> 0x0123 }
        L_0x001e:
            r6 = r1
            java.lang.String r6 = r6.getIdToken()     // Catch:{ JSONException -> 0x0123 }
            r3 = r6
            r6 = r3
            if (r6 == 0) goto L_0x0034
            r6 = r2
            java.lang.String r7 = "tokenId"
            r8 = r1
            java.lang.String r8 = r8.getIdToken()     // Catch:{ JSONException -> 0x0123 }
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch:{ JSONException -> 0x0123 }
        L_0x0034:
            r6 = r1
            java.lang.String r6 = r6.getEmail()     // Catch:{ JSONException -> 0x0123 }
            r3 = r6
            r6 = r3
            if (r6 == 0) goto L_0x004a
            r6 = r2
            java.lang.String r7 = "email"
            r8 = r1
            java.lang.String r8 = r8.getEmail()     // Catch:{ JSONException -> 0x0123 }
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch:{ JSONException -> 0x0123 }
        L_0x004a:
            r6 = r1
            java.lang.String r6 = r6.getDisplayName()     // Catch:{ JSONException -> 0x0123 }
            r3 = r6
            r6 = r3
            if (r6 == 0) goto L_0x0060
            r6 = r2
            java.lang.String r7 = "displayName"
            r8 = r1
            java.lang.String r8 = r8.getDisplayName()     // Catch:{ JSONException -> 0x0123 }
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch:{ JSONException -> 0x0123 }
        L_0x0060:
            r6 = r1
            java.lang.String r6 = r6.getGivenName()     // Catch:{ JSONException -> 0x0123 }
            r3 = r6
            r6 = r3
            if (r6 == 0) goto L_0x0076
            r6 = r2
            java.lang.String r7 = "givenName"
            r8 = r1
            java.lang.String r8 = r8.getGivenName()     // Catch:{ JSONException -> 0x0123 }
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch:{ JSONException -> 0x0123 }
        L_0x0076:
            r6 = r1
            java.lang.String r6 = r6.getFamilyName()     // Catch:{ JSONException -> 0x0123 }
            r3 = r6
            r6 = r3
            if (r6 == 0) goto L_0x008c
            r6 = r2
            java.lang.String r7 = "familyName"
            r8 = r1
            java.lang.String r8 = r8.getFamilyName()     // Catch:{ JSONException -> 0x0123 }
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch:{ JSONException -> 0x0123 }
        L_0x008c:
            r6 = r1
            android.net.Uri r6 = r6.getPhotoUrl()     // Catch:{ JSONException -> 0x0123 }
            r3 = r6
            r6 = r3
            if (r6 == 0) goto L_0x00a2
            r6 = r2
            java.lang.String r7 = "photoUrl"
            r8 = r3
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x0123 }
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch:{ JSONException -> 0x0123 }
        L_0x00a2:
            r6 = r1
            java.lang.String r6 = r6.getServerAuthCode()     // Catch:{ JSONException -> 0x0123 }
            r3 = r6
            r6 = r3
            if (r6 == 0) goto L_0x00b8
            r6 = r2
            java.lang.String r7 = "serverAuthCode"
            r8 = r1
            java.lang.String r8 = r8.getServerAuthCode()     // Catch:{ JSONException -> 0x0123 }
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch:{ JSONException -> 0x0123 }
        L_0x00b8:
            r6 = r2
            java.lang.String r7 = "expirationTime"
            r8 = r1
            long r8 = r8.zaj     // Catch:{ JSONException -> 0x0123 }
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch:{ JSONException -> 0x0123 }
            java.lang.String r6 = "obfuscatedIdentifier"
            r3 = r6
            r6 = r1
            java.lang.String r6 = r6.zak     // Catch:{ JSONException -> 0x0123 }
            r4 = r6
            r6 = r2
            r7 = r3
            r8 = r4
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch:{ JSONException -> 0x0123 }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0123 }
            r3 = r6
            r6 = r3
            r6.<init>()     // Catch:{ JSONException -> 0x0123 }
            r6 = r1
            java.util.List<com.google.android.gms.common.api.Scope> r6 = r6.zac     // Catch:{ JSONException -> 0x0123 }
            r1 = r6
            r6 = r1
            r7 = r1
            int r7 = r7.size()     // Catch:{ JSONException -> 0x0123 }
            com.google.android.gms.common.api.Scope[] r7 = new com.google.android.gms.common.api.C0235Scope[r7]     // Catch:{ JSONException -> 0x0123 }
            java.lang.Object[] r6 = r6.toArray(r7)     // Catch:{ JSONException -> 0x0123 }
            com.google.android.gms.common.api.Scope[] r6 = (com.google.android.gms.common.api.C0235Scope[]) r6     // Catch:{ JSONException -> 0x0123 }
            r4 = r6
            r6 = r4
            java.util.Comparator r7 = com.google.android.gms.auth.api.signin.C0160zaa.zaa     // Catch:{ JSONException -> 0x0123 }
            java.util.Arrays.sort(r6, r7)     // Catch:{ JSONException -> 0x0123 }
            r6 = r4
            int r6 = r6.length     // Catch:{ JSONException -> 0x0123 }
            r5 = r6
            r6 = 0
            r1 = r6
        L_0x00f7:
            r6 = r1
            r7 = r5
            if (r6 >= r7) goto L_0x010b
            r6 = r3
            r7 = r4
            r8 = r1
            r7 = r7[r8]     // Catch:{ JSONException -> 0x0123 }
            java.lang.String r7 = r7.getScopeUri()     // Catch:{ JSONException -> 0x0123 }
            org.json.JSONArray r6 = r6.put(r7)     // Catch:{ JSONException -> 0x0123 }
            int r1 = r1 + 1
            goto L_0x00f7
        L_0x010b:
            r6 = r2
            java.lang.String r7 = "grantedScopes"
            r8 = r3
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch:{ JSONException -> 0x0123 }
            r6 = r2
            java.lang.String r7 = "serverAuthCode"
            java.lang.Object r6 = r6.remove(r7)
            r6 = r2
            java.lang.String r6 = r6.toString()
            r1 = r6
            return r1
        L_0x0123:
            r6 = move-exception
            r1 = r6
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r2 = r6
            r6 = r2
            r7 = r1
            r6.<init>(r7)
            r6 = r2
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount.zad():java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r1
            if (r2 != 0) goto L_0x0008
            r2 = 0
            r0 = r2
        L_0x0007:
            return r0
        L_0x0008:
            r2 = r1
            r3 = r0
            if (r2 != r3) goto L_0x000f
            r2 = 1
            r0 = r2
            goto L_0x0007
        L_0x000f:
            r2 = r1
            boolean r2 = r2 instanceof com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount
            if (r2 != 0) goto L_0x0017
            r2 = 0
            r0 = r2
            goto L_0x0007
        L_0x0017:
            r2 = r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = (com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount) r2
            r1 = r2
            r2 = r1
            java.lang.String r2 = r2.zak
            r3 = r0
            java.lang.String r3 = r3.zak
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003a
            r2 = r1
            java.util.Set r2 = r2.getRequestedScopes()
            r3 = r0
            java.util.Set r3 = r3.getRequestedScopes()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003a
            r2 = 1
            r0 = r2
            goto L_0x0007
        L_0x003a:
            r2 = 0
            r0 = r2
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount.equals(java.lang.Object):boolean");
    }
}
