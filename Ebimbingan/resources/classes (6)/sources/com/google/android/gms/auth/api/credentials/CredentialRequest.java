package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SafeParcelable.Class(creator = "CredentialRequestCreator")
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR;
    @SafeParcelable.Field(getter = "isPasswordLoginSupported", id = 1)
    private final boolean zzaa;
    @SafeParcelable.Field(getter = "getAccountTypes", id = 2)
    private final String[] zzab;
    @SafeParcelable.Field(getter = "getCredentialPickerConfig", id = 3)
    private final CredentialPickerConfig zzac;
    @SafeParcelable.Field(getter = "getCredentialHintPickerConfig", id = 4)
    private final CredentialPickerConfig zzad;
    @SafeParcelable.Field(getter = "isIdTokenRequested", id = 5)
    private final boolean zzae;
    @SafeParcelable.Field(getter = "getServerClientId", id = 6)
    @Nullable
    private final String zzaf;
    @SafeParcelable.Field(getter = "getIdTokenNonce", id = 7)
    @Nullable
    private final String zzag;
    @SafeParcelable.Field(getter = "getRequireUserMediation", id = 8)
    private final boolean zzah;
    @SafeParcelable.Field(id = 1000)
    private final int zzv;

    @SafeParcelable.Constructor
    CredentialRequest(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) @Nullable CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(id = 4) @Nullable CredentialPickerConfig credentialPickerConfig2, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) @Nullable String str, @SafeParcelable.Param(id = 7) @Nullable String str2, @SafeParcelable.Param(id = 8) boolean z3) {
        CredentialPickerConfig credentialPickerConfig3;
        CredentialPickerConfig credentialPickerConfig4;
        CredentialPickerConfig.Builder builder;
        CredentialPickerConfig.Builder builder2;
        int i2 = i;
        CredentialPickerConfig credentialPickerConfig5 = credentialPickerConfig;
        CredentialPickerConfig credentialPickerConfig6 = credentialPickerConfig2;
        boolean z4 = z2;
        String str3 = str;
        String str4 = str2;
        boolean z5 = z3;
        this.zzv = i2;
        this.zzaa = z;
        this.zzab = (String[]) Preconditions.checkNotNull(strArr);
        if (credentialPickerConfig5 == null) {
            new CredentialPickerConfig.Builder();
            credentialPickerConfig3 = builder2.build();
        } else {
            credentialPickerConfig3 = credentialPickerConfig5;
        }
        this.zzac = credentialPickerConfig3;
        if (credentialPickerConfig6 == null) {
            new CredentialPickerConfig.Builder();
            credentialPickerConfig4 = builder.build();
        } else {
            credentialPickerConfig4 = credentialPickerConfig6;
        }
        this.zzad = credentialPickerConfig4;
        if (i2 < 3) {
            this.zzae = true;
            this.zzaf = null;
            this.zzag = null;
        } else {
            this.zzae = z4;
            this.zzaf = str3;
            this.zzag = str4;
        }
        this.zzah = z5;
    }

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zzaa;
        /* access modifiers changed from: private */
        public String[] zzab;
        /* access modifiers changed from: private */
        public CredentialPickerConfig zzac;
        /* access modifiers changed from: private */
        public CredentialPickerConfig zzad;
        /* access modifiers changed from: private */
        public boolean zzae = false;
        /* access modifiers changed from: private */
        @Nullable
        public String zzaf = null;
        /* access modifiers changed from: private */
        @Nullable
        public String zzag;
        private boolean zzah = false;

        public Builder() {
        }

        @Deprecated
        public final Builder setSupportsPasswordLogin(boolean z) {
            return setPasswordLoginSupported(z);
        }

        public final Builder setPasswordLoginSupported(boolean z) {
            this.zzaa = z;
            return this;
        }

        public final Builder setAccountTypes(String... strArr) {
            String[] strArr2 = strArr;
            if (strArr2 == null) {
                strArr2 = new String[0];
            }
            this.zzab = strArr2;
            return this;
        }

        public final Builder setCredentialPickerConfig(CredentialPickerConfig credentialPickerConfig) {
            this.zzac = credentialPickerConfig;
            return this;
        }

        public final Builder setCredentialHintPickerConfig(CredentialPickerConfig credentialPickerConfig) {
            this.zzad = credentialPickerConfig;
            return this;
        }

        public final Builder setIdTokenRequested(boolean z) {
            this.zzae = z;
            return this;
        }

        public final Builder setServerClientId(@Nullable String str) {
            this.zzaf = str;
            return this;
        }

        public final Builder setIdTokenNonce(@Nullable String str) {
            this.zzag = str;
            return this;
        }

        public final CredentialRequest build() {
            CredentialRequest credentialRequest;
            Throwable th;
            if (this.zzab == null) {
                this.zzab = new String[0];
            }
            if (this.zzaa || this.zzab.length != 0) {
                new CredentialRequest(this, (zzf) null);
                return credentialRequest;
            }
            Throwable th2 = th;
            new IllegalStateException("At least one authentication method must be specified");
            throw th2;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private CredentialRequest(com.google.android.gms.auth.api.credentials.CredentialRequest.Builder r13) {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r0
            r3 = 4
            r4 = r1
            boolean r4 = r4.zzaa
            r5 = r1
            java.lang.String[] r5 = r5.zzab
            r6 = r1
            com.google.android.gms.auth.api.credentials.CredentialPickerConfig r6 = r6.zzac
            r7 = r1
            com.google.android.gms.auth.api.credentials.CredentialPickerConfig r7 = r7.zzad
            r8 = r1
            boolean r8 = r8.zzae
            r9 = r1
            java.lang.String r9 = r9.zzaf
            r10 = r1
            java.lang.String r10 = r10.zzag
            r11 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.CredentialRequest.<init>(com.google.android.gms.auth.api.credentials.CredentialRequest$Builder):void");
    }

    @Deprecated
    public final boolean getSupportsPasswordLogin() {
        return isPasswordLoginSupported();
    }

    public final boolean isPasswordLoginSupported() {
        return this.zzaa;
    }

    @NonNull
    public final String[] getAccountTypes() {
        return this.zzab;
    }

    @NonNull
    public final Set<String> getAccountTypesSet() {
        Set<String> set;
        new HashSet(Arrays.asList(this.zzab));
        return set;
    }

    @NonNull
    public final CredentialPickerConfig getCredentialPickerConfig() {
        return this.zzac;
    }

    @NonNull
    public final CredentialPickerConfig getCredentialHintPickerConfig() {
        return this.zzad;
    }

    public final boolean isIdTokenRequested() {
        return this.zzae;
    }

    @Nullable
    public final String getServerClientId() {
        return this.zzaf;
    }

    @Nullable
    public final String getIdTokenNonce() {
        return this.zzag;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeBoolean(parcel2, 1, isPasswordLoginSupported());
        SafeParcelWriter.writeStringArray(parcel2, 2, getAccountTypes(), false);
        SafeParcelWriter.writeParcelable(parcel2, 3, getCredentialPickerConfig(), i2, false);
        SafeParcelWriter.writeParcelable(parcel2, 4, getCredentialHintPickerConfig(), i2, false);
        SafeParcelWriter.writeBoolean(parcel2, 5, isIdTokenRequested());
        SafeParcelWriter.writeString(parcel2, 6, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel2, 7, getIdTokenNonce(), false);
        SafeParcelWriter.writeBoolean(parcel2, 8, this.zzah);
        SafeParcelWriter.writeInt(parcel2, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ CredentialRequest(Builder builder, zzf zzf) {
        this(builder);
        zzf zzf2 = zzf;
    }

    static {
        Parcelable.Creator<CredentialRequest> creator;
        new zzg();
        CREATOR = creator;
    }
}
