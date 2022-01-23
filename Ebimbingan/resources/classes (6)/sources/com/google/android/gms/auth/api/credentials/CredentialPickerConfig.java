package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "CredentialPickerConfigCreator")
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR;
    @SafeParcelable.Field(getter = "shouldShowCancelButton", id = 2)
    private final boolean mShowCancelButton;
    @SafeParcelable.Field(id = 1000)
    private final int zzv;
    @SafeParcelable.Field(getter = "shouldShowAddAccountButton", id = 1)
    private final boolean zzw;
    @SafeParcelable.Field(getter = "isForNewAccount", id = 3)
    @Deprecated
    private final boolean zzx;
    @SafeParcelable.Field(getter = "getPromptInternalId", id = 4)
    private final int zzy;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public @interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;
    }

    @SafeParcelable.Constructor
    CredentialPickerConfig(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z2, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) int i2) {
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

        public CredentialPickerConfig build() {
            CredentialPickerConfig credentialPickerConfig;
            new CredentialPickerConfig(this, (zzd) null);
            return credentialPickerConfig;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private CredentialPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder r9) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.CredentialPickerConfig.<init>(com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder):void");
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
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeBoolean(parcel2, 1, shouldShowAddAccountButton());
        SafeParcelWriter.writeBoolean(parcel2, 2, shouldShowCancelButton());
        SafeParcelWriter.writeBoolean(parcel2, 3, isForNewAccount());
        SafeParcelWriter.writeInt(parcel2, 4, this.zzy);
        SafeParcelWriter.writeInt(parcel2, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ CredentialPickerConfig(Builder builder, zzd zzd) {
        this(builder);
        zzd zzd2 = zzd;
    }

    static {
        Parcelable.Creator<CredentialPickerConfig> creator;
        new zze();
        CREATOR = creator;
    }
}
