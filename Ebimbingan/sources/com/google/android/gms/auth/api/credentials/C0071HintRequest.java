package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.C0063CredentialPickerConfig;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "HintRequestCreator")
/* renamed from: com.google.android.gms.auth.api.credentials.HintRequest */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0071HintRequest extends C0460AbstractSafeParcelable implements C0447ReflectedParcelable {
    public static final Parcelable.Creator<C0071HintRequest> CREATOR;
    @C0463SafeParcelable.Field(getter = "getAccountTypes", id = 4)
    private final String[] zzab;
    @C0463SafeParcelable.Field(getter = "isIdTokenRequested", id = 5)
    private final boolean zzae;
    @C0463SafeParcelable.Field(getter = "getServerClientId", id = 6)
    @Nullable
    private final String zzaf;
    @C0463SafeParcelable.Field(getter = "getIdTokenNonce", id = 7)
    @Nullable
    private final String zzag;
    @C0463SafeParcelable.Field(getter = "getHintPickerConfig", id = 1)
    private final C0063CredentialPickerConfig zzai;
    @C0463SafeParcelable.Field(getter = "isEmailAddressIdentifierSupported", id = 2)
    private final boolean zzaj;
    @C0463SafeParcelable.Field(getter = "isPhoneNumberIdentifierSupported", id = 3)
    private final boolean zzak;
    @C0463SafeParcelable.Field(id = 1000)
    private final int zzv;

    @C0463SafeParcelable.Constructor
    C0071HintRequest(@C0463SafeParcelable.Param(id = 1000) int i, @C0463SafeParcelable.Param(id = 1) C0063CredentialPickerConfig credentialPickerConfig, @C0463SafeParcelable.Param(id = 2) boolean z, @C0463SafeParcelable.Param(id = 3) boolean z2, @C0463SafeParcelable.Param(id = 4) String[] strArr, @C0463SafeParcelable.Param(id = 5) boolean z3, @C0463SafeParcelable.Param(id = 6) @Nullable String str, @C0463SafeParcelable.Param(id = 7) @Nullable String str2) {
        boolean z4 = z3;
        String str3 = str;
        String str4 = str2;
        this.zzv = i;
        this.zzai = (C0063CredentialPickerConfig) C0446Preconditions.checkNotNull(credentialPickerConfig);
        this.zzaj = z;
        this.zzak = z2;
        this.zzab = (String[]) C0446Preconditions.checkNotNull(strArr);
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

    /* renamed from: com.google.android.gms.auth.api.credentials.HintRequest$Builder */
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
        public C0063CredentialPickerConfig zzai;
        /* access modifiers changed from: private */
        public boolean zzaj;
        /* access modifiers changed from: private */
        public boolean zzak;

        public Builder() {
            C0063CredentialPickerConfig.Builder builder;
            new C0063CredentialPickerConfig.Builder();
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

        public final Builder setHintPickerConfig(@NonNull C0063CredentialPickerConfig credentialPickerConfig) {
            this.zzai = (C0063CredentialPickerConfig) C0446Preconditions.checkNotNull(credentialPickerConfig);
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

        public final C0071HintRequest build() {
            C0071HintRequest hintRequest;
            Throwable th;
            if (this.zzab == null) {
                this.zzab = new String[0];
            }
            if (this.zzaj || this.zzak || this.zzab.length != 0) {
                new C0071HintRequest(this, (C0080zzi) null);
                return hintRequest;
            }
            Throwable th2 = th;
            new IllegalStateException("At least one authentication method must be specified");
            throw th2;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0071HintRequest(com.google.android.gms.auth.api.credentials.C0071HintRequest.Builder r12) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.C0071HintRequest.<init>(com.google.android.gms.auth.api.credentials.HintRequest$Builder):void");
    }

    @NonNull
    public final C0063CredentialPickerConfig getHintPickerConfig() {
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
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, getHintPickerConfig(), i, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 2, isEmailAddressIdentifierSupported());
        C0462SafeParcelWriter.writeBoolean(parcel2, 3, this.zzak);
        C0462SafeParcelWriter.writeStringArray(parcel2, 4, getAccountTypes(), false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 5, isIdTokenRequested());
        C0462SafeParcelWriter.writeString(parcel2, 6, getServerClientId(), false);
        C0462SafeParcelWriter.writeString(parcel2, 7, getIdTokenNonce(), false);
        C0462SafeParcelWriter.writeInt(parcel2, 1000, this.zzv);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C0071HintRequest(Builder builder, C0080zzi zzi) {
        this(builder);
        C0080zzi zzi2 = zzi;
    }

    static {
        Parcelable.Creator<C0071HintRequest> creator;
        new C0081zzj();
        CREATOR = creator;
    }
}
