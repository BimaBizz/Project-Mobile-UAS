package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@C0463SafeParcelable.Class(creator = "CredentialPickerConfigCreator")
/* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0063CredentialPickerConfig extends C0460AbstractSafeParcelable implements C0447ReflectedParcelable {
    public static final Parcelable.Creator<C0063CredentialPickerConfig> CREATOR;
    @C0463SafeParcelable.Field(getter = "shouldShowCancelButton", id = 2)
    private final boolean mShowCancelButton;
    @C0463SafeParcelable.Field(id = 1000)
    private final int zzv;
    @C0463SafeParcelable.Field(getter = "shouldShowAddAccountButton", id = 1)
    private final boolean zzw;
    @C0463SafeParcelable.Field(getter = "isForNewAccount", id = 3)
    @Deprecated
    private final boolean zzx;
    @C0463SafeParcelable.Field(getter = "getPromptInternalId", id = 4)
    private final int zzy;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Prompt */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public @interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;
    }

    @C0463SafeParcelable.Constructor
    C0063CredentialPickerConfig(@C0463SafeParcelable.Param(id = 1000) int i, @C0463SafeParcelable.Param(id = 1) boolean z, @C0463SafeParcelable.Param(id = 2) boolean z2, @C0463SafeParcelable.Param(id = 3) boolean z3, @C0463SafeParcelable.Param(id = 4) int i2) {
        int i3 = i;
        boolean z4 = z3;
        int i4 = i2;
        this.zzv = i3;
        this.zzw = z;
        this.mShowCancelButton = z2;
        if (i3 < 2) {
            this.zzx = z4;
            this.zzy = z4 ? 3 : 1;
            return;
        }
        this.zzx = i4 == 3;
        this.zzy = i4;
    }

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class Builder {
        /* access modifiers changed from: private */
        public boolean mShowCancelButton = true;
        /* access modifiers changed from: private */
        public boolean zzw = false;
        /* access modifiers changed from: private */
        public int zzz = 1;

        public Builder() {
        }

        public Builder setShowAddAccountButton(boolean z) {
            this.zzw = z;
            return this;
        }

        public Builder setShowCancelButton(boolean z) {
            this.mShowCancelButton = z;
            return this;
        }

        public Builder setPrompt(int i) {
            this.zzz = i;
            return this;
        }

        @Deprecated
        public Builder setForNewAccount(boolean z) {
            this.zzz = z ? 3 : 1;
            return this;
        }

        public C0063CredentialPickerConfig build() {
            C0063CredentialPickerConfig credentialPickerConfig;
            new C0063CredentialPickerConfig(this, (C0075zzd) null);
            return credentialPickerConfig;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0063CredentialPickerConfig(com.google.android.gms.auth.api.credentials.C0063CredentialPickerConfig.Builder r9) {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r0
            r3 = 2
            r4 = r1
            boolean r4 = r4.zzw
            r5 = r1
            boolean r5 = r5.mShowCancelButton
            r6 = 0
            r7 = r1
            int r7 = r7.zzz
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.C0063CredentialPickerConfig.<init>(com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder):void");
    }

    public final boolean shouldShowAddAccountButton() {
        return this.zzw;
    }

    public final boolean shouldShowCancelButton() {
        return this.mShowCancelButton;
    }

    @Deprecated
    public final boolean isForNewAccount() {
        return this.zzy == 3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeBoolean(parcel2, 1, shouldShowAddAccountButton());
        C0462SafeParcelWriter.writeBoolean(parcel2, 2, shouldShowCancelButton());
        C0462SafeParcelWriter.writeBoolean(parcel2, 3, isForNewAccount());
        C0462SafeParcelWriter.writeInt(parcel2, 4, this.zzy);
        C0462SafeParcelWriter.writeInt(parcel2, 1000, this.zzv);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C0063CredentialPickerConfig(Builder builder, C0075zzd zzd) {
        this(builder);
        C0075zzd zzd2 = zzd;
    }

    static {
        Parcelable.Creator<C0063CredentialPickerConfig> creator;
        new C0076zze();
        CREATOR = creator;
    }
}
