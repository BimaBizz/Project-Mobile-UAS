package com.google.android.gms.auth.api;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.C0068CredentialsApi;
import com.google.android.gms.auth.api.proxy.C0115ProxyApi;
import com.google.android.gms.auth.api.signin.C0123GoogleSignInApi;
import com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C0140zzf;
import com.google.android.gms.auth.api.signin.internal.C0141zzg;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.internal.p001authapi.C0759zzj;
import com.google.android.gms.internal.p001authapi.C0766zzq;

/* renamed from: com.google.android.gms.auth.api.Auth */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0031Auth {
    public static final C0211Api<AuthCredentialsOptions> CREDENTIALS_API;
    public static final C0068CredentialsApi CredentialsApi;
    public static final C0211Api<C0125GoogleSignInOptions> GOOGLE_SIGN_IN_API;
    public static final C0123GoogleSignInApi GoogleSignInApi;
    @C0452ShowFirstParty
    @C0206KeepForSdk
    @Deprecated
    public static final C0211Api<C0033AuthProxyOptions> PROXY_API = C0032AuthProxy.API;
    @C0452ShowFirstParty
    @C0206KeepForSdk
    @Deprecated
    public static final C0115ProxyApi ProxyApi = C0032AuthProxy.ProxyApi;
    public static final C0211Api.ClientKey<C0766zzq> zzg;
    public static final C0211Api.ClientKey<C0140zzf> zzh;
    private static final C0211Api.AbstractClientBuilder<C0766zzq, AuthCredentialsOptions> zzi;
    private static final C0211Api.AbstractClientBuilder<C0140zzf, C0125GoogleSignInOptions> zzj;

    private C0031Auth() {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.Auth$AuthCredentialsOptions */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class AuthCredentialsOptions implements C0211Api.ApiOptions.Optional {
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
        /* renamed from: com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder */
        /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
        public static class Builder {
            protected String zzl;
            @Nullable
            protected String zzn;
            protected Boolean zzu = false;

            public Builder() {
            }

            @C0452ShowFirstParty
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

            @C0452ShowFirstParty
            public Builder zzc(String str) {
                this.zzn = str;
                return this;
            }

            @C0452ShowFirstParty
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
                boolean r3 = r3 instanceof com.google.android.gms.auth.api.C0031Auth.AuthCredentialsOptions
                if (r3 != 0) goto L_0x0011
                r3 = 0
                r0 = r3
                goto L_0x0008
            L_0x0011:
                r3 = r1
                com.google.android.gms.auth.api.Auth$AuthCredentialsOptions r3 = (com.google.android.gms.auth.api.C0031Auth.AuthCredentialsOptions) r3
                r2 = r3
                r3 = r0
                java.lang.String r3 = r3.zzl
                r4 = r2
                java.lang.String r4 = r4.zzl
                boolean r3 = com.google.android.gms.common.internal.C0444Objects.equal(r3, r4)
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
                boolean r3 = com.google.android.gms.common.internal.C0444Objects.equal(r3, r4)
                if (r3 == 0) goto L_0x0038
                r3 = 1
                r0 = r3
                goto L_0x0008
            L_0x0038:
                r3 = 0
                r0 = r3
                goto L_0x0008
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.C0031Auth.AuthCredentialsOptions.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Object[] objArr = new Object[3];
            objArr[0] = this.zzl;
            Object[] objArr2 = objArr;
            objArr2[1] = Boolean.valueOf(this.zzm);
            Object[] objArr3 = objArr2;
            objArr3[2] = this.zzn;
            return C0444Objects.hashCode(objArr3);
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
        C0211Api.ClientKey<C0766zzq> clientKey;
        C0211Api.ClientKey<C0140zzf> clientKey2;
        C0211Api.AbstractClientBuilder<C0766zzq, AuthCredentialsOptions> abstractClientBuilder;
        C0211Api.AbstractClientBuilder<C0140zzf, C0125GoogleSignInOptions> abstractClientBuilder2;
        C0211Api<AuthCredentialsOptions> api;
        C0211Api<C0125GoogleSignInOptions> api2;
        C0068CredentialsApi credentialsApi;
        C0123GoogleSignInApi googleSignInApi;
        new C0211Api.ClientKey<>();
        zzg = clientKey;
        new C0211Api.ClientKey<>();
        zzh = clientKey2;
        new C0167zzc();
        zzi = abstractClientBuilder;
        new C0168zzd();
        zzj = abstractClientBuilder2;
        new C0211Api<>("Auth.CREDENTIALS_API", zzi, zzg);
        CREDENTIALS_API = api;
        new C0211Api<>("Auth.GOOGLE_SIGN_IN_API", zzj, zzh);
        GOOGLE_SIGN_IN_API = api2;
        new C0759zzj();
        CredentialsApi = credentialsApi;
        new C0141zzg();
        GoogleSignInApi = googleSignInApi;
    }
}
