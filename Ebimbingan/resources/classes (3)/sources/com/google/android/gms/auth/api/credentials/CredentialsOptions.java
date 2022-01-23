package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class CredentialsOptions extends Auth.AuthCredentialsOptions {
    public static final CredentialsOptions DEFAULT;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder extends Auth.AuthCredentialsOptions.Builder {
        public Builder() {
        }

        public final Builder forceEnableSaveDialog() {
            this.zzu = true;
            return this;
        }

        /* renamed from: build */
        public final CredentialsOptions zze() {
            CredentialsOptions credentialsOptions;
            new CredentialsOptions(this, (zzh) null);
            return credentialsOptions;
        }

        @ShowFirstParty
        public final /* synthetic */ Auth.AuthCredentialsOptions.Builder zzc(String str) {
            this.zzn = str;
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CredentialsOptions(Builder builder) {
        super(builder);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ CredentialsOptions(Builder builder, zzh zzh) {
        this(builder);
        zzh zzh2 = zzh;
    }

    static {
        Auth.AuthCredentialsOptions.Builder builder;
        new Builder();
        DEFAULT = (CredentialsOptions) builder.zze();
    }
}
