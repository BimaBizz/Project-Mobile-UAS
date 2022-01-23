package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "HintRequestCreator")
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR;
    @SafeParcelable.Field(getter = "getAccountTypes", id = 4)
    private final String[] zzab;
    @SafeParcelable.Field(getter = "isIdTokenRequested", id = 5)
    private final boolean zzae;
    @SafeParcelable.Field(getter = "getServerClientId", id = 6)
    @Nullable
    private final String zzaf;
    @SafeParcelable.Field(getter = "getIdTokenNonce", id = 7)
    @Nullable
    private final String zzag;
    @SafeParcelable.Field(getter = "getHintPickerConfig", id = 1)
    private final CredentialPickerConfig zzai;
    @SafeParcelable.Field(getter = "isEmailAddressIdentifierSupported", id = 2)
    private final boolean zzaj;
    @SafeParcelable.Field(getter = "isPhoneNumberIdentifierSupported", id = 3)
    private final boolean zzak;
    @SafeParcelable.Field(id = 1000)
    private final int zzv;

    @SafeParcelable.Constructor
    HintRequest(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) String[] strArr, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) @Nullable String str, @SafeParcelable.Param(id = 7) @Nullable String str2) {
        boolean z4 = z3;
        String str3 = str;
        String str4 = str2;
        this.zzv = i;
        this.zzai = (CredentialPickerConfig) Preconditions.checkNotNull(credentialPickerConfig);
        this.zzaj = z;
        this.zzak = z2;
        this.zzab = (String[]) Preconditions.checkNotNull(strArr);
        if (this.zzv < 2) {
            this.zzae = true;
            this.zzaf = null;
            this.zzag = null;
            return;
        }
        this.zzae = z4;
        this.zzaf = str3;
        this.zzag = str4;
    }

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public String[] zzab;
        /* access modifiers changed from: private */
        public boolean zzae = false;
        /* access modifiers changed from: private */
        @Nullable
        public String zzaf;
        /* access modifiers changed from: private */
        @Nullable
        public String zzag;
        /* access modifiers changed from: private */
        public CredentialPickerConfig zzai;
        /* access modifiers changed from: private */
        public boolean zzaj;
        /* access modifiers changed from: private */
        public boolean zzak;

        public Builder() {
            CredentialPickerConfig.Builder builder;
            new CredentialPickerConfig.Builder();
            this.zzai = builder.build();
        }

        public final Builder setEmailAddressIdentifierSupported(boolean z) {
            this.zzaj = z;
            return this;
        }

        public final Builder setPhoneNumberIdentifierSupported(boolean z) {
            this.zzak = z;
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

        public final Builder setHintPickerConfig(@NonNull CredentialPickerConfig credentialPickerConfig) {
            this.zzai = (CredentialPickerConfig) Preconditions.checkNotNull(credentialPickerConfig);
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

        public final HintRequest build() {
            HintRequest hintRequest;
            Throwable th;
            if (this.zzab == null) {
                this.zzab = new String[0];
            }
            if (this.zzaj || this.zzak || this.zzab.length != 0) {
                new HintRequest(this, (zzi) null);
                return hintRequest;
            }
            Throwable th2 = th;
            new IllegalStateException("At least one authentication method must be specified");
            throw th2;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private HintRequest(com.google.android.gms.auth.api.credentials.HintRequest.Builder r12) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r0
            r3 = 2
            r4 = r1
            com.google.android.gms.auth.api.credentials.CredentialPickerConfig r4 = r4.zzai
            r5 = r1
            boolean r5 = r5.zzaj
            r6 = r1
            boolean r6 = r6.zzak
            r7 = r1
            java.lang.String[] r7 = r7.zzab
            r8 = r1
            boolean r8 = r8.zzae
            r9 = r1
            java.lang.String r9 = r9.zzaf
            r10 = r1
            java.lang.String r10 = r10.zzag
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.HintRequest.<init>(com.google.android.gms.auth.api.credentials.HintRequest$Builder):void");
    }

    @NonNull
    public final CredentialPickerConfig getHintPickerConfig() {
        return this.zzai;
    }

    public final boolean isEmailAddressIdentifierSupported() {
        return this.zzaj;
    }

    @NonNull
    public final String[] getAccountTypes() {
        return this.zzab;
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
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, getHintPickerConfig(), i, false);
        SafeParcelWriter.writeBoolean(parcel2, 2, isEmailAddressIdentifierSupported());
        SafeParcelWriter.writeBoolean(parcel2, 3, this.zzak);
        SafeParcelWriter.writeStringArray(parcel2, 4, getAccountTypes(), false);
        SafeParcelWriter.writeBoolean(parcel2, 5, isIdTokenRequested());
        SafeParcelWriter.writeString(parcel2, 6, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel2, 7, getIdTokenNonce(), false);
        SafeParcelWriter.writeInt(parcel2, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ HintRequest(Builder builder, zzi zzi) {
        this(builder);
        zzi zzi2 = zzi;
    }

    static {
        Parcelable.Creator<HintRequest> creator;
        new zzj();
        CREATOR = creator;
    }
}
