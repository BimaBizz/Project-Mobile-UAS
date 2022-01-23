package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.C0063CredentialPickerConfig;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@C0463SafeParcelable.Class(creator = "CredentialRequestCreator")
/* renamed from: com.google.android.gms.auth.api.credentials.CredentialRequest */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0064CredentialRequest extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0064CredentialRequest> CREATOR;
    @C0463SafeParcelable.Field(getter = "isPasswordLoginSupported", id = 1)
    private final boolean zzaa;
    @C0463SafeParcelable.Field(getter = "getAccountTypes", id = 2)
    private final String[] zzab;
    @C0463SafeParcelable.Field(getter = "getCredentialPickerConfig", id = 3)
    private final C0063CredentialPickerConfig zzac;
    @C0463SafeParcelable.Field(getter = "getCredentialHintPickerConfig", id = 4)
    private final C0063CredentialPickerConfig zzad;
    @C0463SafeParcelable.Field(getter = "isIdTokenRequested", id = 5)
    private final boolean zzae;
    @C0463SafeParcelable.Field(getter = "getServerClientId", id = 6)
    @Nullable
    private final String zzaf;
    @C0463SafeParcelable.Field(getter = "getIdTokenNonce", id = 7)
    @Nullable
    private final String zzag;
    @C0463SafeParcelable.Field(getter = "getRequireUserMediation", id = 8)
    private final boolean zzah;
    @C0463SafeParcelable.Field(id = 1000)
    private final int zzv;

    @C0463SafeParcelable.Constructor
    C0064CredentialRequest(@C0463SafeParcelable.Param(id = 1000) int i, @C0463SafeParcelable.Param(id = 1) boolean z, @C0463SafeParcelable.Param(id = 2) String[] strArr, @C0463SafeParcelable.Param(id = 3) @Nullable C0063CredentialPickerConfig credentialPickerConfig, @C0463SafeParcelable.Param(id = 4) @Nullable C0063CredentialPickerConfig credentialPickerConfig2, @C0463SafeParcelable.Param(id = 5) boolean z2, @C0463SafeParcelable.Param(id = 6) @Nullable String str, @C0463SafeParcelable.Param(id = 7) @Nullable String str2, @C0463SafeParcelable.Param(id = 8) boolean z3) {
        C0063CredentialPickerConfig credentialPickerConfig3;
        C0063CredentialPickerConfig credentialPickerConfig4;
        C0063CredentialPickerConfig.Builder builder;
        C0063CredentialPickerConfig.Builder builder2;
        int i2 = i;
        C0063CredentialPickerConfig credentialPickerConfig5 = credentialPickerConfig;
        C0063CredentialPickerConfig credentialPickerConfig6 = credentialPickerConfig2;
        boolean z4 = z2;
        String str3 = str;
        String str4 = str2;
        boolean z5 = z3;
        this.zzv = i2;
        this.zzaa = z;
        this.zzab = (String[]) C0446Preconditions.checkNotNull(strArr);
        if (credentialPickerConfig5 == null) {
            new C0063CredentialPickerConfig.Builder();
            credentialPickerConfig3 = builder2.build();
        } else {
            credentialPickerConfig3 = credentialPickerConfig5;
        }
        this.zzac = credentialPickerConfig3;
        if (credentialPickerConfig6 == null) {
            new C0063CredentialPickerConfig.Builder();
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

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialRequest$Builder */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zzaa;
        /* access modifiers changed from: private */
        public String[] zzab;
        /* access modifiers changed from: private */
        public C0063CredentialPickerConfig zzac;
        /* access modifiers changed from: private */
        public C0063CredentialPickerConfig zzad;
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

        public final Builder setCredentialPickerConfig(C0063CredentialPickerConfig credentialPickerConfig) {
            this.zzac = credentialPickerConfig;
            return this;
        }

        public final Builder setCredentialHintPickerConfig(C0063CredentialPickerConfig credentialPickerConfig) {
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

        public final C0064CredentialRequest build() {
            C0064CredentialRequest credentialRequest;
            Throwable th;
            if (this.zzab == null) {
                this.zzab = new String[0];
            }
            if (this.zzaa || this.zzab.length != 0) {
                new C0064CredentialRequest(this, (C0077zzf) null);
                return credentialRequest;
            }
            Throwable th2 = th;
            new IllegalStateException("At least one authentication method must be specified");
            throw th2;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0064CredentialRequest(com.google.android.gms.auth.api.credentials.C0064CredentialRequest.Builder r13) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.C0064CredentialRequest.<init>(com.google.android.gms.auth.api.credentials.CredentialRequest$Builder):void");
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
    public final C0063CredentialPickerConfig getCredentialPickerConfig() {
        return this.zzac;
    }

    @NonNull
    public final C0063CredentialPickerConfig getCredentialHintPickerConfig() {
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
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeBoolean(parcel2, 1, isPasswordLoginSupported());
        C0462SafeParcelWriter.writeStringArray(parcel2, 2, getAccountTypes(), false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 3, getCredentialPickerConfig(), i2, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 4, getCredentialHintPickerConfig(), i2, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 5, isIdTokenRequested());
        C0462SafeParcelWriter.writeString(parcel2, 6, getServerClientId(), false);
        C0462SafeParcelWriter.writeString(parcel2, 7, getIdTokenNonce(), false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 8, this.zzah);
        C0462SafeParcelWriter.writeInt(parcel2, 1000, this.zzv);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C0064CredentialRequest(Builder builder, C0077zzf zzf) {
        this(builder);
        C0077zzf zzf2 = zzf;
    }

    static {
        Parcelable.Creator<C0064CredentialRequest> creator;
        new C0078zzg();
        CREATOR = creator;
    }
}
