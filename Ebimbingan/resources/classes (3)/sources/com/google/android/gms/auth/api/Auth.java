package com.google.android.gms.auth.api;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzf;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.p001authapi.zzj;
import com.google.android.gms.internal.p001authapi.zzq;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class Auth {
    public static final Api<AuthCredentialsOptions> CREDENTIALS_API;
    public static final CredentialsApi CredentialsApi;
    public static final Api<GoogleSignInOptions> GOOGLE_SIGN_IN_API;
    public static final GoogleSignInApi GoogleSignInApi;
    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static final Api<AuthProxyOptions> PROXY_API = AuthProxy.API;
    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static final ProxyApi ProxyApi = AuthProxy.ProxyApi;
    public static final Api.ClientKey<zzq> zzg;
    public static final Api.ClientKey<zzf> zzh;
    private static final Api.AbstractClientBuilder<zzq, AuthCredentialsOptions> zzi;
    private static final Api.AbstractClientBuilder<zzf, GoogleSignInOptions> zzj;

    private Auth() {
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class AuthCredentialsOptions implements Api.ApiOptions.Optional {
        public static final AuthCredentialsOptions zzk;
        /* access modifiers changed from: private */
        public final String zzl;
        /* access modifiers changed from: private */
        public final boolean zzm;
        /* access modifiers changed from: private */
        @Nullable
        public final String zzn;

        public AuthCredentialsOptions(Builder builder) {
            Builder builder2 = builder;
            this.zzl = builder2.zzl;
            this.zzm = builder2.zzu.booleanValue();
            this.zzn = builder2.zzn;
        }

        @Deprecated
        /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
        public static class Builder {
            protected String zzl;
            @Nullable
            protected String zzn;
            protected Boolean zzu = false;

            public Builder() {
            }

            @ShowFirstParty
            public Builder(AuthCredentialsOptions authCredentialsOptions) {
                AuthCredentialsOptions authCredentialsOptions2 = authCredentialsOptions;
                this.zzl = authCredentialsOptions2.zzl;
                this.zzu = Boolean.valueOf(authCredentialsOptions2.zzm);
                this.zzn = authCredentialsOptions2.zzn;
            }

            public Builder forceEnableSaveDialog() {
                this.zzu = true;
                return this;
            }

            @ShowFirstParty
            public Builder zzc(String str) {
                this.zzn = str;
                return this;
            }

            @ShowFirstParty
            public AuthCredentialsOptions zze() {
                AuthCredentialsOptions authCredentialsOptions;
                new AuthCredentialsOptions(this);
                return authCredentialsOptions;
            }
        }

        @Nullable
        public final String zzd() {
            return this.zzl;
        }

        @Nullable
        public final String getLogSessionId() {
            return this.zzn;
        }

        /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(@androidx.annotation.Nullable java.lang.Object r6) {
            /*
                r5 = this;
                r0 = r5
                r1 = r6
                r3 = r1
                r4 = r0
                if (r3 != r4) goto L_0x0009
                r3 = 1
                r0 = r3
            L_0x0008:
                return r0
            L_0x0009:
                r3 = r1
                boolean r3 = r3 instanceof com.google.android.gms.auth.api.Auth.AuthCredentialsOptions
                if (r3 != 0) goto L_0x0011
                r3 = 0
                r0 = r3
                goto L_0x0008
            L_0x0011:
                r3 = r1
                com.google.android.gms.auth.api.Auth$AuthCredentialsOptions r3 = (com.google.android.gms.auth.api.Auth.AuthCredentialsOptions) r3
                r2 = r3
                r3 = r0
                java.lang.String r3 = r3.zzl
                r4 = r2
                java.lang.String r4 = r4.zzl
                boolean r3 = com.google.android.gms.common.internal.Objects.equal(r3, r4)
                if (r3 == 0) goto L_0x0038
                r3 = r0
                boolean r3 = r3.zzm
                r4 = r2
                boolean r4 = r4.zzm
                if (r3 != r4) goto L_0x0038
                r3 = r0
                java.lang.String r3 = r3.zzn
                r4 = r2
                java.lang.String r4 = r4.zzn
                boolean r3 = com.google.android.gms.common.internal.Objects.equal(r3, r4)
                if (r3 == 0) goto L_0x0038
                r3 = 1
                r0 = r3
                goto L_0x0008
            L_0x0038:
                r3 = 0
                r0 = r3
                goto L_0x0008
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Object[] objArr = new Object[3];
            objArr[0] = this.zzl;
            Object[] objArr2 = objArr;
            objArr2[1] = Boolean.valueOf(this.zzm);
            Object[] objArr3 = objArr2;
            objArr3[2] = this.zzn;
            return Objects.hashCode(objArr3);
        }

        public final Bundle toBundle() {
            Bundle bundle;
            new Bundle();
            Bundle bundle2 = bundle;
            Bundle bundle3 = bundle2;
            bundle2.putString("consumer_package", this.zzl);
            bundle3.putBoolean("force_save_dialog", this.zzm);
            bundle3.putString("log_session_id", this.zzn);
            return bundle3;
        }

        static {
            Builder builder;
            new Builder();
            zzk = builder.zze();
        }
    }

    static {
        Api.ClientKey<zzq> clientKey;
        Api.ClientKey<zzf> clientKey2;
        Api.AbstractClientBuilder<zzq, AuthCredentialsOptions> abstractClientBuilder;
        Api.AbstractClientBuilder<zzf, GoogleSignInOptions> abstractClientBuilder2;
        Api<AuthCredentialsOptions> api;
        Api<GoogleSignInOptions> api2;
        CredentialsApi credentialsApi;
        GoogleSignInApi googleSignInApi;
        new Api.ClientKey<>();
        zzg = clientKey;
        new Api.ClientKey<>();
        zzh = clientKey2;
        new zzc();
        zzi = abstractClientBuilder;
        new zzd();
        zzj = abstractClientBuilder2;
        new Api<>("Auth.CREDENTIALS_API", zzi, zzg);
        CREDENTIALS_API = api;
        new Api<>("Auth.GOOGLE_SIGN_IN_API", zzj, zzh);
        GOOGLE_SIGN_IN_API = api2;
        new zzj();
        CredentialsApi = credentialsApi;
        new zzg();
        GoogleSignInApi = googleSignInApi;
    }
}
