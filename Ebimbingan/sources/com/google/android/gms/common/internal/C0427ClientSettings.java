package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.signin.C1134SignInOptions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@C0206KeepForSdk
@C0617VisibleForTesting
/* renamed from: com.google.android.gms.common.internal.ClientSettings */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0427ClientSettings {
    @Nullable
    private final Account zaa;
    private final Set<C0235Scope> zab;
    private final Set<C0235Scope> zac;
    private final Map<C0211Api<?>, C0486zab> zad;
    private final int zae;
    @Nullable
    private final View zaf;
    private final String zag;
    private final String zah;
    private final C1134SignInOptions zai;
    private Integer zaj;

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.ClientSettings$Builder */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static final class Builder {
        @Nullable
        private Account zaa;
        private ArraySet<C0235Scope> zab;
        private String zac;
        private String zad;
        private C1134SignInOptions zae = C1134SignInOptions.zaa;

        public Builder() {
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public C0427ClientSettings build() {
            C0427ClientSettings clientSettings;
            new C0427ClientSettings(this.zaa, this.zab, (Map<C0211Api<?>, C0486zab>) null, 0, (View) null, this.zac, this.zad, this.zae, false);
            return clientSettings;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder setRealClientPackageName(@RecentlyNonNull String str) {
            this.zac = str;
            return this;
        }

        @RecentlyNonNull
        public final Builder zaa(@Nullable Account account) {
            this.zaa = account;
            return this;
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.google.android.gms.common.internal.C0427ClientSettings.Builder zab(@androidx.annotation.RecentlyNonNull java.util.Collection<com.google.android.gms.common.api.C0235Scope> r6) {
            /*
                r5 = this;
                r0 = r5
                r1 = r6
                r3 = r0
                androidx.collection.ArraySet<com.google.android.gms.common.api.Scope> r3 = r3.zab
                if (r3 != 0) goto L_0x0012
                androidx.collection.ArraySet r3 = new androidx.collection.ArraySet
                r2 = r3
                r3 = r2
                r3.<init>()
                r3 = r0
                r4 = r2
                r3.zab = r4
            L_0x0012:
                r3 = r0
                androidx.collection.ArraySet<com.google.android.gms.common.api.Scope> r3 = r3.zab
                r4 = r1
                boolean r3 = r3.addAll(r4)
                r3 = r0
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0427ClientSettings.Builder.zab(java.util.Collection):com.google.android.gms.common.internal.ClientSettings$Builder");
        }

        @RecentlyNonNull
        public final Builder zac(@RecentlyNonNull String str) {
            this.zad = str;
            return this;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C0206KeepForSdk
    public C0427ClientSettings(@RecentlyNonNull Account account, @RecentlyNonNull Set<C0235Scope> set, @RecentlyNonNull Map<C0211Api<?>, C0486zab> map, int i, @Nullable View view, @RecentlyNonNull String str, @RecentlyNonNull String str2, @Nullable C1134SignInOptions signInOptions) {
        this(account, set, map, i, view, str, str2, signInOptions, false);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0427ClientSettings createDefault(@RecentlyNonNull Context context) {
        C0222GoogleApiClient.Builder builder;
        new C0222GoogleApiClient.Builder(context);
        return builder.buildClientSettings();
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public Account getAccount() {
        return this.zaa;
    }

    @C0206KeepForSdk
    @Deprecated
    @RecentlyNullable
    public String getAccountName() {
        Account account = this.zaa;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public Account getAccountOrDefault() {
        Account account;
        Account account2 = this.zaa;
        if (account2 != null) {
            return account2;
        }
        new Account("<<default account>>", "com.google");
        return account;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public Set<C0235Scope> getAllRequestedScopes() {
        return this.zac;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public Set<C0235Scope> getApplicableScopes(@RecentlyNonNull C0211Api<?> api) {
        Set<C0235Scope> set;
        C0486zab zab2 = this.zad.get(api);
        if (zab2 == null || zab2.zaa.isEmpty()) {
            return this.zab;
        }
        new HashSet(this.zab);
        boolean addAll = set.addAll(zab2.zaa);
        return set;
    }

    @C0206KeepForSdk
    public int getGravityForPopups() {
        return this.zae;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public String getRealClientPackageName() {
        return this.zag;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public Set<C0235Scope> getRequiredScopes() {
        return this.zab;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public View getViewForPopups() {
        return this.zaf;
    }

    @RecentlyNonNull
    public final Map<C0211Api<?>, C0486zab> zaa() {
        return this.zad;
    }

    @RecentlyNullable
    public final String zab() {
        return this.zah;
    }

    @RecentlyNonNull
    public final C1134SignInOptions zac() {
        return this.zai;
    }

    @RecentlyNullable
    public final Integer zad() {
        return this.zaj;
    }

    public final void zae(@RecentlyNonNull Integer num) {
        Integer num2 = num;
        this.zaj = num2;
    }

    public C0427ClientSettings(@Nullable Account account, @RecentlyNonNull Set<C0235Scope> set, @RecentlyNonNull Map<C0211Api<?>, C0486zab> map, int i, @Nullable View view, @RecentlyNonNull String str, @RecentlyNonNull String str2, @Nullable C1134SignInOptions signInOptions, boolean z) {
        Map<C0211Api<?>, C0486zab> map2;
        C1134SignInOptions signInOptions2;
        Set set2;
        Set<C0235Scope> set3 = set;
        Map<C0211Api<?>, C0486zab> map3 = map;
        int i2 = i;
        View view2 = view;
        String str3 = str;
        String str4 = str2;
        C1134SignInOptions signInOptions3 = signInOptions;
        boolean z2 = z;
        this.zaa = account;
        this.zab = set3 == null ? Collections.emptySet() : Collections.unmodifiableSet(set3);
        if (map3 == null) {
            map2 = Collections.emptyMap();
        } else {
            map2 = map3;
        }
        this.zad = map2;
        this.zaf = view2;
        this.zae = i2;
        this.zag = str3;
        this.zah = str4;
        if (signInOptions3 == null) {
            signInOptions2 = C1134SignInOptions.zaa;
        } else {
            signInOptions2 = signInOptions3;
        }
        this.zai = signInOptions2;
        new HashSet(this.zab);
        for (C0486zab zab2 : this.zad.values()) {
            boolean addAll = set2.addAll(zab2.zaa);
        }
        this.zac = Collections.unmodifiableSet(set2);
    }
}
