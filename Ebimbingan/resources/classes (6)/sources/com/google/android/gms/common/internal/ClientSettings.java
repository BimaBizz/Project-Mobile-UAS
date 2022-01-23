package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@KeepForSdk
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class ClientSettings {
    @Nullable
    private final Account zaa;
    private final Set<Scope> zab;
    private final Set<Scope> zac;
    private final Map<Api<?>, zab> zad;
    private final int zae;
    @Nullable
    private final View zaf;
    private final String zag;
    private final String zah;
    private final SignInOptions zai;
    private Integer zaj;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static final class Builder {
        @Nullable
        private Account zaa;
        private ArraySet<Scope> zab;
        private String zac;
        private String zad;
        private SignInOptions zae = SignInOptions.zaa;

        public Builder() {
        }

        @RecentlyNonNull
        @KeepForSdk
        public ClientSettings build() {
            ClientSettings clientSettings;
            new ClientSettings(this.zaa, this.zab, (Map<Api<?>, zab>) null, 0, (View) null, this.zac, this.zad, this.zae, false);
            return clientSettings;
        }

        @RecentlyNonNull
        @KeepForSdk
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
        public final com.google.android.gms.common.internal.ClientSettings.Builder zab(@androidx.annotation.RecentlyNonNull java.util.Collection<com.google.android.gms.common.api.Scope> r6) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.ClientSettings.Builder.zab(java.util.Collection):com.google.android.gms.common.internal.ClientSettings$Builder");
        }

        @RecentlyNonNull
        public final Builder zac(@RecentlyNonNull String str) {
            this.zad = str;
            return this;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    public ClientSettings(@RecentlyNonNull Account account, @RecentlyNonNull Set<Scope> set, @RecentlyNonNull Map<Api<?>, zab> map, int i, @Nullable View view, @RecentlyNonNull String str, @RecentlyNonNull String str2, @Nullable SignInOptions signInOptions) {
        this(account, set, map, i, view, str, str2, signInOptions, false);
    }

    @RecentlyNonNull
    @KeepForSdk
    public static ClientSettings createDefault(@RecentlyNonNull Context context) {
        GoogleApiClient.Builder builder;
        new GoogleApiClient.Builder(context);
        return builder.buildClientSettings();
    }

    @KeepForSdk
    @RecentlyNullable
    public Account getAccount() {
        return this.zaa;
    }

    @KeepForSdk
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
    @KeepForSdk
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
    @KeepForSdk
    public Set<Scope> getAllRequestedScopes() {
        return this.zac;
    }

    @RecentlyNonNull
    @KeepForSdk
    public Set<Scope> getApplicableScopes(@RecentlyNonNull Api<?> api) {
        Set<Scope> set;
        zab zab2 = this.zad.get(api);
        if (zab2 == null || zab2.zaa.isEmpty()) {
            return this.zab;
        }
        new HashSet(this.zab);
        boolean addAll = set.addAll(zab2.zaa);
        return set;
    }

    @KeepForSdk
    public int getGravityForPopups() {
        return this.zae;
    }

    @RecentlyNonNull
    @KeepForSdk
    public String getRealClientPackageName() {
        return this.zag;
    }

    @RecentlyNonNull
    @KeepForSdk
    public Set<Scope> getRequiredScopes() {
        return this.zab;
    }

    @KeepForSdk
    @RecentlyNullable
    public View getViewForPopups() {
        return this.zaf;
    }

    @RecentlyNonNull
    public final Map<Api<?>, zab> zaa() {
        return this.zad;
    }

    @RecentlyNullable
    public final String zab() {
        return this.zah;
    }

    @RecentlyNonNull
    public final SignInOptions zac() {
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

    public ClientSettings(@Nullable Account account, @RecentlyNonNull Set<Scope> set, @RecentlyNonNull Map<Api<?>, zab> map, int i, @Nullable View view, @RecentlyNonNull String str, @RecentlyNonNull String str2, @Nullable SignInOptions signInOptions, boolean z) {
        Map<Api<?>, zab> map2;
        SignInOptions signInOptions2;
        Set set2;
        Set<Scope> set3 = set;
        Map<Api<?>, zab> map3 = map;
        int i2 = i;
        View view2 = view;
        String str3 = str;
        String str4 = str2;
        SignInOptions signInOptions3 = signInOptions;
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
            signInOptions2 = SignInOptions.zaa;
        } else {
            signInOptions2 = signInOptions3;
        }
        this.zai = signInOptions2;
        new HashSet(this.zab);
        for (zab zab2 : this.zad.values()) {
            boolean addAll = set2.addAll(zab2.zaa);
        }
        this.zac = Collections.unmodifiableSet(set2);
    }
}
