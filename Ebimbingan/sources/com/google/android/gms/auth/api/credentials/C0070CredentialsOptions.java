package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.C0031Auth;
import com.google.android.gms.common.internal.C0452ShowFirstParty;

/* renamed from: com.google.android.gms.auth.api.credentials.CredentialsOptions */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0070CredentialsOptions extends C0031Auth.AuthCredentialsOptions {
    public static final C0070CredentialsOptions DEFAULT;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialsOptions$Builder */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder extends C0031Auth.AuthCredentialsOptions.Builder {
        public Builder() {
        }

        public final Builder forceEnableSaveDialog() {
            this.zzu = true;
            return this;
        }

        /* renamed from: build */
        public final C0070CredentialsOptions zze() {
            C0070CredentialsOptions credentialsOptions;
            new C0070CredentialsOptions(this, (C0079zzh) null);
            return credentialsOptions;
        }

        @C0452ShowFirstParty
        public final /* synthetic */ C0031Auth.AuthCredentialsOptions.Builder zzc(String str) {
            this.zzn = str;
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C0070CredentialsOptions(Builder builder) {
        super(builder);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C0070CredentialsOptions(Builder builder, C0079zzh zzh) {
        this(builder);
        C0079zzh zzh2 = zzh;
    }

    static {
        C0031Auth.AuthCredentialsOptions.Builder builder;
        new Builder();
        DEFAULT = (C0070CredentialsOptions) builder.zze();
    }
}
