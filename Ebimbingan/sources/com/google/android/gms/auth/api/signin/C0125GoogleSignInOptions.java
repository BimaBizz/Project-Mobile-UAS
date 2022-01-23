package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.internal.C0131GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.C0132HashAccumulator;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.appinventor.components.runtime.util.OAuth2Helper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C0463SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
/* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0125GoogleSignInOptions extends C0460AbstractSafeParcelable implements C0211Api.ApiOptions.Optional, C0447ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0125GoogleSignInOptions> CREATOR;
    @RecentlyNonNull
    public static final C0125GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    @RecentlyNonNull
    public static final C0125GoogleSignInOptions DEFAULT_SIGN_IN;
    @RecentlyNonNull
    @C0617VisibleForTesting
    public static final C0235Scope zaa;
    @RecentlyNonNull
    @C0617VisibleForTesting
    public static final C0235Scope zab;
    @RecentlyNonNull
    @C0617VisibleForTesting
    public static final C0235Scope zac;
    @RecentlyNonNull
    @C0617VisibleForTesting
    public static final C0235Scope zad;
    @RecentlyNonNull
    @C0617VisibleForTesting
    public static final C0235Scope zae;
    private static Comparator<C0235Scope> zaq;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaf;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "getScopes", id = 2)
    public final ArrayList<C0235Scope> zag;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "getAccount", id = 3)
    @Nullable
    public Account zah;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "isIdTokenRequested", id = 4)
    public boolean zai;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "isServerAuthCodeRequested", id = 5)
    public final boolean zaj;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "isForceCodeForRefreshToken", id = 6)
    public final boolean zak;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "getServerClientId", id = 7)
    @Nullable
    public String zal;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "getHostedDomain", id = 8)
    @Nullable
    public String zam;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "getExtensions", id = 9)
    public ArrayList<C0131GoogleSignInOptionsExtensionParcelable> zan;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "getLogSessionId", id = 10)
    @Nullable
    public String zao;
    private Map<Integer, C0131GoogleSignInOptionsExtensionParcelable> zap;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static final class Builder {
        private Set<C0235Scope> zaa;
        private boolean zab;
        private boolean zac;
        private boolean zad;
        @Nullable
        private String zae;
        @Nullable
        private Account zaf;
        @Nullable
        private String zag;
        private Map<Integer, C0131GoogleSignInOptionsExtensionParcelable> zah;
        @Nullable
        private String zai;

        public Builder() {
            Set<C0235Scope> set;
            Map<Integer, C0131GoogleSignInOptionsExtensionParcelable> map;
            new HashSet();
            this.zaa = set;
            new HashMap();
            this.zah = map;
        }

        private final String zaa(String str) {
            boolean z;
            String str2 = str;
            String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
            String str3 = this.zae;
            if (str3 != null) {
                z = str3.equals(str2);
            } else {
                z = true;
            }
            C0446Preconditions.checkArgument(z, "two different server client ids provided");
            return str2;
        }

        @RecentlyNonNull
        public Builder addExtension(@RecentlyNonNull C0126GoogleSignInOptionsExtension googleSignInOptionsExtension) {
            Object obj;
            Throwable th;
            C0126GoogleSignInOptionsExtension googleSignInOptionsExtension2 = googleSignInOptionsExtension;
            if (this.zah.containsKey(Integer.valueOf(googleSignInOptionsExtension2.getExtensionType()))) {
                new IllegalStateException("Only one extension per type may be added");
                throw th;
            }
            List<C0235Scope> impliedScopes = googleSignInOptionsExtension2.getImpliedScopes();
            if (impliedScopes != null) {
                boolean addAll = this.zaa.addAll(impliedScopes);
            }
            Map<Integer, C0131GoogleSignInOptionsExtensionParcelable> map = this.zah;
            Integer valueOf = Integer.valueOf(googleSignInOptionsExtension2.getExtensionType());
            new C0131GoogleSignInOptionsExtensionParcelable(googleSignInOptionsExtension2);
            C0131GoogleSignInOptionsExtensionParcelable put = map.put(valueOf, obj);
            return this;
        }

        @RecentlyNonNull
        public C0125GoogleSignInOptions build() {
            C0125GoogleSignInOptions googleSignInOptions;
            ArrayList arrayList;
            if (this.zaa.contains(C0125GoogleSignInOptions.zae) && this.zaa.contains(C0125GoogleSignInOptions.zad)) {
                boolean remove = this.zaa.remove(C0125GoogleSignInOptions.zad);
            }
            if (this.zad && (this.zaf == null || !this.zaa.isEmpty())) {
                Builder requestId = requestId();
            }
            new ArrayList(this.zaa);
            new C0125GoogleSignInOptions(3, arrayList, this.zaf, this.zad, this.zab, this.zac, this.zae, this.zag, this.zah, this.zai, (C0162zac) null);
            return googleSignInOptions;
        }

        @RecentlyNonNull
        public Builder requestEmail() {
            boolean add = this.zaa.add(C0125GoogleSignInOptions.zab);
            return this;
        }

        @RecentlyNonNull
        public Builder requestId() {
            boolean add = this.zaa.add(C0125GoogleSignInOptions.zac);
            return this;
        }

        @RecentlyNonNull
        public Builder requestIdToken(@RecentlyNonNull String str) {
            String str2 = str;
            this.zad = true;
            String zaa2 = zaa(str2);
            this.zae = str2;
            return this;
        }

        @RecentlyNonNull
        public Builder requestProfile() {
            boolean add = this.zaa.add(C0125GoogleSignInOptions.zaa);
            return this;
        }

        @RecentlyNonNull
        public Builder requestScopes(@RecentlyNonNull C0235Scope scope, @RecentlyNonNull C0235Scope... scopeArr) {
            boolean add = this.zaa.add(scope);
            boolean addAll = this.zaa.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @RecentlyNonNull
        public Builder requestServerAuthCode(@RecentlyNonNull String str) {
            Builder requestServerAuthCode = requestServerAuthCode(str, false);
            return this;
        }

        @RecentlyNonNull
        public Builder setAccountName(@RecentlyNonNull String str) {
            Account account;
            new Account(C0446Preconditions.checkNotEmpty(str), "com.google");
            this.zaf = account;
            return this;
        }

        @RecentlyNonNull
        public Builder setHostedDomain(@RecentlyNonNull String str) {
            this.zag = C0446Preconditions.checkNotEmpty(str);
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder setLogSessionId(@RecentlyNonNull String str) {
            this.zai = str;
            return this;
        }

        @RecentlyNonNull
        public Builder requestServerAuthCode(@RecentlyNonNull String str, boolean z) {
            String str2 = str;
            this.zab = true;
            String zaa2 = zaa(str2);
            this.zae = str2;
            this.zac = z;
            return this;
        }

        public Builder(@RecentlyNonNull C0125GoogleSignInOptions googleSignInOptions) {
            Set<C0235Scope> set;
            Map<Integer, C0131GoogleSignInOptionsExtensionParcelable> map;
            Set<C0235Scope> set2;
            C0125GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
            new HashSet();
            this.zaa = set;
            new HashMap();
            this.zah = map;
            Object checkNotNull = C0446Preconditions.checkNotNull(googleSignInOptions2);
            new HashSet(googleSignInOptions2.zag);
            this.zaa = set2;
            this.zab = googleSignInOptions2.zaj;
            this.zac = googleSignInOptions2.zak;
            this.zad = googleSignInOptions2.zai;
            this.zae = googleSignInOptions2.zal;
            this.zaf = googleSignInOptions2.zah;
            this.zag = googleSignInOptions2.zam;
            this.zah = C0125GoogleSignInOptions.zam(googleSignInOptions2.zan);
            this.zai = googleSignInOptions2.zao;
        }
    }

    static {
        C0235Scope scope;
        C0235Scope scope2;
        C0235Scope scope3;
        C0235Scope scope4;
        C0235Scope scope5;
        Builder builder;
        Builder builder2;
        Parcelable.Creator<C0125GoogleSignInOptions> creator;
        Comparator<C0235Scope> comparator;
        new C0235Scope("profile");
        zaa = scope;
        new C0235Scope("email");
        zab = scope2;
        new C0235Scope("openid");
        zac = scope3;
        new C0235Scope("https://www.googleapis.com/auth/games_lite");
        zad = scope4;
        new C0235Scope("https://www.googleapis.com/auth/games");
        zae = scope5;
        new Builder();
        Builder requestId = builder.requestId();
        Builder requestProfile = builder.requestProfile();
        DEFAULT_SIGN_IN = builder.build();
        new Builder();
        Builder requestScopes = builder2.requestScopes(zad, new C0235Scope[0]);
        DEFAULT_GAMES_SIGN_IN = builder2.build();
        new C0163zad();
        CREATOR = creator;
        new C0162zac();
        zaq = comparator;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C0463SafeParcelable.Constructor
    C0125GoogleSignInOptions(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) ArrayList<C0235Scope> arrayList, @C0463SafeParcelable.Param(id = 3) @Nullable Account account, @C0463SafeParcelable.Param(id = 4) boolean z, @C0463SafeParcelable.Param(id = 5) boolean z2, @C0463SafeParcelable.Param(id = 6) boolean z3, @C0463SafeParcelable.Param(id = 7) @Nullable String str, @C0463SafeParcelable.Param(id = 8) @Nullable String str2, @C0463SafeParcelable.Param(id = 9) ArrayList<C0131GoogleSignInOptionsExtensionParcelable> arrayList2, @C0463SafeParcelable.Param(id = 10) @Nullable String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, zam(arrayList2), str3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C0125GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, C0162zac zac2) {
        this(3, (ArrayList<C0235Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, C0131GoogleSignInOptionsExtensionParcelable>) map, str3);
        int i2 = i;
        C0162zac zac3 = zac2;
    }

    @RecentlyNullable
    public static C0125GoogleSignInOptions zaa(@Nullable String str) throws JSONException {
        JSONObject jSONObject;
        Set set;
        String str2;
        Account account;
        ArrayList arrayList;
        String str3;
        Map map;
        C0125GoogleSignInOptions googleSignInOptions;
        Account account2;
        Object obj;
        String str4 = str;
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        new JSONObject(str4);
        new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            new C0235Scope(jSONArray.getString(i));
            boolean add = set.add(obj);
        }
        if (jSONObject.has(OAuth2Helper.PREF_ACCOUNT_NAME)) {
            str2 = jSONObject.optString(OAuth2Helper.PREF_ACCOUNT_NAME);
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            new Account(str2, "com.google");
            account = account2;
        } else {
            account = null;
        }
        new ArrayList(set);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        String optString = jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null;
        new HashMap();
        googleSignInOptions = new C0125GoogleSignInOptions(3, (ArrayList<C0235Scope>) arrayList, account, z, z2, z3, str3, optString, (Map<Integer, C0131GoogleSignInOptionsExtensionParcelable>) map, (String) null);
        return r3;
    }

    /* access modifiers changed from: private */
    public static Map<Integer, C0131GoogleSignInOptionsExtensionParcelable> zam(@Nullable List<C0131GoogleSignInOptionsExtensionParcelable> list) {
        Map<Integer, C0131GoogleSignInOptionsExtensionParcelable> map;
        List<C0131GoogleSignInOptionsExtensionParcelable> list2 = list;
        new HashMap();
        if (list2 == null) {
            return map;
        }
        for (C0131GoogleSignInOptionsExtensionParcelable next : list2) {
            C0131GoogleSignInOptionsExtensionParcelable put = map.put(Integer.valueOf(next.getType()), next);
        }
        return map;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public Account getAccount() {
        return this.zah;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public ArrayList<C0131GoogleSignInOptionsExtensionParcelable> getExtensions() {
        return this.zan;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public String getLogSessionId() {
        return this.zao;
    }

    @RecentlyNonNull
    public C0235Scope[] getScopeArray() {
        ArrayList<C0235Scope> arrayList = this.zag;
        return (C0235Scope[]) arrayList.toArray(new C0235Scope[arrayList.size()]);
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.RecentlyNonNull
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.google.android.gms.common.api.C0235Scope> getScopes() {
        /*
            r4 = this;
            r0 = r4
            java.util.ArrayList r2 = new java.util.ArrayList
            r1 = r2
            r2 = r1
            r3 = r0
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r3 = r3.zag
            r2.<init>(r3)
            r2 = r1
            r0 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions.getScopes():java.util.ArrayList");
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public String getServerClientId() {
        return this.zal;
    }

    public int hashCode() {
        ArrayList arrayList;
        C0132HashAccumulator hashAccumulator;
        new ArrayList();
        ArrayList<C0235Scope> arrayList2 = this.zag;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            boolean add = arrayList.add(arrayList2.get(i).getScopeUri());
        }
        Collections.sort(arrayList);
        new C0132HashAccumulator();
        C0132HashAccumulator addObject = hashAccumulator.addObject(arrayList);
        C0132HashAccumulator addObject2 = hashAccumulator.addObject(this.zah);
        C0132HashAccumulator addObject3 = hashAccumulator.addObject(this.zal);
        C0132HashAccumulator zaa2 = hashAccumulator.zaa(this.zak);
        C0132HashAccumulator zaa3 = hashAccumulator.zaa(this.zai);
        C0132HashAccumulator zaa4 = hashAccumulator.zaa(this.zaj);
        C0132HashAccumulator addObject4 = hashAccumulator.addObject(this.zao);
        return hashAccumulator.hash();
    }

    @C0206KeepForSdk
    public boolean isForceCodeForRefreshToken() {
        return this.zak;
    }

    @C0206KeepForSdk
    public boolean isIdTokenRequested() {
        return this.zai;
    }

    @C0206KeepForSdk
    public boolean isServerAuthCodeRequested() {
        return this.zaj;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaf);
        C0462SafeParcelWriter.writeTypedList(parcel2, 2, getScopes(), false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 3, getAccount(), i, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 4, isIdTokenRequested());
        C0462SafeParcelWriter.writeBoolean(parcel2, 5, isServerAuthCodeRequested());
        C0462SafeParcelWriter.writeBoolean(parcel2, 6, isForceCodeForRefreshToken());
        C0462SafeParcelWriter.writeString(parcel2, 7, getServerClientId(), false);
        C0462SafeParcelWriter.writeString(parcel2, 8, this.zam, false);
        C0462SafeParcelWriter.writeTypedList(parcel2, 9, getExtensions(), false);
        C0462SafeParcelWriter.writeString(parcel2, 10, getLogSessionId(), false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: org.json.JSONArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.RecentlyNonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zab() {
        /*
            r8 = this;
            r0 = r8
            org.json.JSONObject r5 = new org.json.JSONObject
            r1 = r5
            r5 = r1
            r5.<init>()
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00aa }
            r2 = r5
            r5 = r2
            r5.<init>()     // Catch:{ JSONException -> 0x00aa }
            r5 = r0
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r5 = r5.zag     // Catch:{ JSONException -> 0x00aa }
            java.util.Comparator<com.google.android.gms.common.api.Scope> r6 = zaq     // Catch:{ JSONException -> 0x00aa }
            java.util.Collections.sort(r5, r6)     // Catch:{ JSONException -> 0x00aa }
            r5 = r0
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r5 = r5.zag     // Catch:{ JSONException -> 0x00aa }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ JSONException -> 0x00aa }
            r3 = r5
        L_0x001f:
            r5 = r3
            boolean r5 = r5.hasNext()     // Catch:{ JSONException -> 0x00aa }
            r4 = r5
            r5 = r4
            if (r5 == 0) goto L_0x0039
            r5 = r2
            r6 = r3
            java.lang.Object r6 = r6.next()     // Catch:{ JSONException -> 0x00aa }
            com.google.android.gms.common.api.Scope r6 = (com.google.android.gms.common.api.C0235Scope) r6     // Catch:{ JSONException -> 0x00aa }
            java.lang.String r6 = r6.getScopeUri()     // Catch:{ JSONException -> 0x00aa }
            org.json.JSONArray r5 = r5.put(r6)     // Catch:{ JSONException -> 0x00aa }
            goto L_0x001f
        L_0x0039:
            r5 = r1
            java.lang.String r6 = "scopes"
            r7 = r2
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x00aa }
            r5 = r0
            android.accounts.Account r5 = r5.zah     // Catch:{ JSONException -> 0x00aa }
            r2 = r5
            r5 = r2
            if (r5 == 0) goto L_0x0056
            java.lang.String r5 = "accountName"
            r3 = r5
            r5 = r1
            r6 = r3
            r7 = r2
            java.lang.String r7 = r7.name     // Catch:{ JSONException -> 0x00aa }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x00aa }
        L_0x0056:
            r5 = r1
            java.lang.String r6 = "idTokenRequested"
            r7 = r0
            boolean r7 = r7.zai     // Catch:{ JSONException -> 0x00aa }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x00aa }
            r5 = r1
            java.lang.String r6 = "forceCodeForRefreshToken"
            r7 = r0
            boolean r7 = r7.zak     // Catch:{ JSONException -> 0x00aa }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x00aa }
            r5 = r1
            java.lang.String r6 = "serverAuthRequested"
            r7 = r0
            boolean r7 = r7.zaj     // Catch:{ JSONException -> 0x00aa }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x00aa }
            r5 = r0
            java.lang.String r5 = r5.zal     // Catch:{ JSONException -> 0x00aa }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x00aa }
            r2 = r5
            r5 = r2
            if (r5 != 0) goto L_0x008d
            r5 = r1
            java.lang.String r6 = "serverClientId"
            r7 = r0
            java.lang.String r7 = r7.zal     // Catch:{ JSONException -> 0x00aa }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x00aa }
        L_0x008d:
            r5 = r0
            java.lang.String r5 = r5.zam     // Catch:{ JSONException -> 0x00aa }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x00aa }
            r2 = r5
            r5 = r2
            if (r5 != 0) goto L_0x00a3
            r5 = r1
            java.lang.String r6 = "hostedDomain"
            r7 = r0
            java.lang.String r7 = r7.zam     // Catch:{ JSONException -> 0x00aa }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x00aa }
        L_0x00a3:
            r5 = r1
            java.lang.String r5 = r5.toString()
            r0 = r5
            return r0
        L_0x00aa:
            r5 = move-exception
            r0 = r5
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r1 = r5
            r5 = r1
            r6 = r0
            r5.<init>(r6)
            r5 = r1
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions.zab():java.lang.String");
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0125GoogleSignInOptions(int r14, java.util.ArrayList<com.google.android.gms.common.api.C0235Scope> r15, @androidx.annotation.Nullable android.accounts.Account r16, boolean r17, boolean r18, boolean r19, @androidx.annotation.Nullable java.lang.String r20, @androidx.annotation.Nullable java.lang.String r21, java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.C0131GoogleSignInOptionsExtensionParcelable> r22, @androidx.annotation.Nullable java.lang.String r23) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r0
            r11.<init>()
            r11 = r0
            r12 = r1
            r11.zaf = r12
            r11 = r0
            r12 = r2
            r11.zag = r12
            r11 = r0
            r12 = r3
            r11.zah = r12
            r11 = r0
            r12 = r4
            r11.zai = r12
            r11 = r0
            r12 = r5
            r11.zaj = r12
            r11 = r0
            r12 = r6
            r11.zak = r12
            r11 = r0
            r12 = r7
            r11.zal = r12
            r11 = r0
            r12 = r8
            r11.zam = r12
            java.util.ArrayList r11 = new java.util.ArrayList
            r1 = r11
            r11 = r1
            r12 = r9
            java.util.Collection r12 = r12.values()
            r11.<init>(r12)
            r11 = r0
            r12 = r1
            r11.zan = r12
            r11 = r0
            r12 = r9
            r11.zap = r12
            r11 = r0
            r12 = r10
            r11.zao = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions.<init>(int, java.util.ArrayList, android.accounts.Account, boolean, boolean, boolean, java.lang.String, java.lang.String, java.util.Map, java.lang.String):void");
    }

    public boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        try {
            C0125GoogleSignInOptions googleSignInOptions = (C0125GoogleSignInOptions) obj2;
            if (this.zan.size() > 0 || googleSignInOptions.zan.size() > 0) {
                return false;
            }
            if (this.zag.size() != googleSignInOptions.getScopes().size() || !this.zag.containsAll(googleSignInOptions.getScopes())) {
                return false;
            }
            Account account = this.zah;
            if (account != null ? account.equals(googleSignInOptions.getAccount()) : googleSignInOptions.getAccount() == null) {
                if (!TextUtils.isEmpty(this.zal) ? this.zal.equals(googleSignInOptions.getServerClientId()) : TextUtils.isEmpty(googleSignInOptions.getServerClientId())) {
                    if (this.zak == googleSignInOptions.isForceCodeForRefreshToken() && this.zai == googleSignInOptions.isIdTokenRequested() && this.zaj == googleSignInOptions.isServerAuthCodeRequested() && TextUtils.equals(this.zao, googleSignInOptions.getLogSessionId())) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ClassCastException e) {
            return false;
        }
    }
}
