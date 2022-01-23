package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "BeginSignInRequestCreator")
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR;
    @SafeParcelable.Field(getter = "getPasswordRequestOptions", id = 1)
    private final PasswordRequestOptions zzas;
    @SafeParcelable.Field(getter = "getGoogleIdTokenRequestOptions", id = 2)
    private final GoogleIdTokenRequestOptions zzat;
    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    @Nullable
    private final String zzau;
    @SafeParcelable.Field(getter = "isAutoSelectEnabled", id = 4)
    private final boolean zzav;

    @SafeParcelable.Class(creator = "GoogleIdTokenRequestOptionsCreator")
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR;
        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zzaw;
        @SafeParcelable.Field(getter = "getServerClientId", id = 2)
        @Nullable
        private final String zzax;
        @SafeParcelable.Field(getter = "getNonce", id = 3)
        @Nullable
        private final String zzay;
        @SafeParcelable.Field(getter = "filterByAuthorizedAccounts", id = 4)
        private final boolean zzaz;
        @SafeParcelable.Field(getter = "getLinkedServiceId", id = 5)
        @Nullable
        private final String zzba;
        @SafeParcelable.Field(getter = "getIdTokenDepositionScopes", id = 6)
        @Nullable
        private final List<String> zzbb;

        public static Builder builder() {
            Builder builder;
            Builder builder2 = builder;
            new Builder();
            return builder2;
        }

        @SafeParcelable.Constructor
        GoogleIdTokenRequestOptions(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) @Nullable String str, @SafeParcelable.Param(id = 3) @Nullable String str2, @SafeParcelable.Param(id = 4) boolean z2, @SafeParcelable.Param(id = 5) @Nullable String str3, @SafeParcelable.Param(id = 6) @Nullable List<String> list) {
            boolean z3 = z;
            String str4 = str;
            String str5 = str2;
            boolean z4 = z2;
            String str6 = str3;
            List<String> list2 = list;
            this.zzaw = z3;
            if (z3) {
                Object checkNotNull = Preconditions.checkNotNull(str4, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.zzax = str4;
            this.zzay = str5;
            this.zzaz = z4;
            this.zzbb = BeginSignInRequest.zzc(list2);
            this.zzba = str6;
        }

        /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
        public static final class Builder {
            private boolean zzaw = false;
            @Nullable
            private String zzax = null;
            @Nullable
            private String zzay = null;
            private boolean zzaz = true;
            @Nullable
            private String zzba = null;
            @Nullable
            private List<String> zzbb = null;

            public Builder() {
            }

            public final Builder setSupported(boolean z) {
                this.zzaw = z;
                return this;
            }

            public final Builder setServerClientId(@NonNull String str) {
                this.zzax = Preconditions.checkNotEmpty(str);
                return this;
            }

            public final Builder setNonce(@Nullable String str) {
                this.zzay = str;
                return this;
            }

            public final Builder setFilterByAuthorizedAccounts(boolean z) {
                this.zzaz = z;
                return this;
            }

            public final GoogleIdTokenRequestOptions build() {
                GoogleIdTokenRequestOptions googleIdTokenRequestOptions;
                new GoogleIdTokenRequestOptions(this.zzaw, this.zzax, this.zzay, this.zzaz, (String) null, (List<String>) null);
                return googleIdTokenRequestOptions;
            }
        }

        public final boolean isSupported() {
            return this.zzaw;
        }

        @Nullable
        public final String getServerClientId() {
            return this.zzax;
        }

        @Nullable
        public final String getNonce() {
            return this.zzay;
        }

        public final boolean filterByAuthorizedAccounts() {
            return this.zzaz;
        }

        public final int hashCode() {
            Object[] objArr = new Object[6];
            objArr[0] = Boolean.valueOf(this.zzaw);
            Object[] objArr2 = objArr;
            objArr2[1] = this.zzax;
            Object[] objArr3 = objArr2;
            objArr3[2] = this.zzay;
            Object[] objArr4 = objArr3;
            objArr4[3] = Boolean.valueOf(this.zzaz);
            Object[] objArr5 = objArr4;
            objArr5[4] = this.zzba;
            Object[] objArr6 = objArr5;
            objArr6[5] = this.zzbb;
            return Objects.hashCode(objArr6);
        }

        public final boolean equals(@Nullable Object obj) {
            Object obj2 = obj;
            if (!(obj2 instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj2;
            if (this.zzaw != googleIdTokenRequestOptions.zzaw || !Objects.equal(this.zzax, googleIdTokenRequestOptions.zzax) || !Objects.equal(this.zzay, googleIdTokenRequestOptions.zzay) || this.zzaz != googleIdTokenRequestOptions.zzaz || !Objects.equal(this.zzba, googleIdTokenRequestOptions.zzba) || !Objects.equal(this.zzbb, googleIdTokenRequestOptions.zzbb)) {
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = i;
            Parcel parcel2 = parcel;
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
            SafeParcelWriter.writeBoolean(parcel2, 1, isSupported());
            SafeParcelWriter.writeString(parcel2, 2, getServerClientId(), false);
            SafeParcelWriter.writeString(parcel2, 3, getNonce(), false);
            SafeParcelWriter.writeBoolean(parcel2, 4, filterByAuthorizedAccounts());
            SafeParcelWriter.writeString(parcel2, 5, this.zzba, false);
            SafeParcelWriter.writeStringList(parcel2, 6, this.zzbb, false);
            SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
        }

        static {
            Parcelable.Creator<GoogleIdTokenRequestOptions> creator;
            new zzh();
            CREATOR = creator;
        }
    }

    @SafeParcelable.Class(creator = "PasswordRequestOptionsCreator")
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR;
        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zzaw;

        public static Builder builder() {
            Builder builder;
            Builder builder2 = builder;
            new Builder();
            return builder2;
        }

        @SafeParcelable.Constructor
        PasswordRequestOptions(@SafeParcelable.Param(id = 1) boolean z) {
            this.zzaw = z;
        }

        /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
        public static final class Builder {
            private boolean zzaw = false;

            public Builder() {
            }

            public final Builder setSupported(boolean z) {
                this.zzaw = z;
                return this;
            }

            public final PasswordRequestOptions build() {
                PasswordRequestOptions passwordRequestOptions;
                new PasswordRequestOptions(this.zzaw);
                return passwordRequestOptions;
            }
        }

        public final boolean isSupported() {
            return this.zzaw;
        }

        public final int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zzaw));
        }

        public final boolean equals(@Nullable Object obj) {
            Object obj2 = obj;
            if (!(obj2 instanceof PasswordRequestOptions)) {
                return false;
            }
            return this.zzaw == ((PasswordRequestOptions) obj2).zzaw;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = i;
            Parcel parcel2 = parcel;
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
            SafeParcelWriter.writeBoolean(parcel2, 1, isSupported());
            SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
        }

        static {
            Parcelable.Creator<PasswordRequestOptions> creator;
            new zzi();
            CREATOR = creator;
        }
    }

    public static Builder builder() {
        Builder builder;
        Builder builder2 = builder;
        new Builder();
        return builder2;
    }

    @SafeParcelable.Constructor
    BeginSignInRequest(@SafeParcelable.Param(id = 1) PasswordRequestOptions passwordRequestOptions, @SafeParcelable.Param(id = 2) GoogleIdTokenRequestOptions googleIdTokenRequestOptions, @SafeParcelable.Param(id = 3) @Nullable String str, @SafeParcelable.Param(id = 4) boolean z) {
        this.zzas = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
        this.zzat = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
        this.zzau = str;
        this.zzav = z;
    }

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder {
        private PasswordRequestOptions zzas = PasswordRequestOptions.builder().setSupported(false).build();
        private GoogleIdTokenRequestOptions zzat = GoogleIdTokenRequestOptions.builder().setSupported(false).build();
        @Nullable
        private String zzau;
        private boolean zzav;

        public Builder() {
        }

        public final Builder setPasswordRequestOptions(@NonNull PasswordRequestOptions passwordRequestOptions) {
            this.zzas = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
            return this;
        }

        public final Builder setGoogleIdTokenRequestOptions(@NonNull GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.zzat = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
            return this;
        }

        public final Builder zzd(@NonNull String str) {
            this.zzau = str;
            return this;
        }

        public final Builder setAutoSelectEnabled(boolean z) {
            this.zzav = z;
            return this;
        }

        public final BeginSignInRequest build() {
            BeginSignInRequest beginSignInRequest;
            new BeginSignInRequest(this.zzas, this.zzat, this.zzau, this.zzav);
            return beginSignInRequest;
        }
    }

    public final PasswordRequestOptions getPasswordRequestOptions() {
        return this.zzas;
    }

    public final GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
        return this.zzat;
    }

    public final boolean isAutoSelectEnabled() {
        return this.zzav;
    }

    public final int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.zzas;
        Object[] objArr2 = objArr;
        objArr2[1] = this.zzat;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.zzau;
        Object[] objArr4 = objArr3;
        objArr4[3] = Boolean.valueOf(this.zzav);
        return Objects.hashCode(objArr4);
    }

    public final boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj2;
        if (!Objects.equal(this.zzas, beginSignInRequest.zzas) || !Objects.equal(this.zzat, beginSignInRequest.zzat) || !Objects.equal(this.zzau, beginSignInRequest.zzau) || this.zzav != beginSignInRequest.zzav) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, getPasswordRequestOptions(), i2, false);
        SafeParcelWriter.writeParcelable(parcel2, 2, getGoogleIdTokenRequestOptions(), i2, false);
        SafeParcelWriter.writeString(parcel2, 3, this.zzau, false);
        SafeParcelWriter.writeBoolean(parcel2, 4, isAutoSelectEnabled());
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public static Builder zzc(BeginSignInRequest beginSignInRequest) {
        BeginSignInRequest beginSignInRequest2 = beginSignInRequest;
        Object checkNotNull = Preconditions.checkNotNull(beginSignInRequest2);
        Builder autoSelectEnabled = builder().setGoogleIdTokenRequestOptions(beginSignInRequest2.getGoogleIdTokenRequestOptions()).setPasswordRequestOptions(beginSignInRequest2.getPasswordRequestOptions()).setAutoSelectEnabled(beginSignInRequest2.zzav);
        String str = beginSignInRequest2.zzau;
        String str2 = str;
        if (str != null) {
            Builder zzd = autoSelectEnabled.zzd(str2);
        }
        return autoSelectEnabled;
    }

    /* access modifiers changed from: private */
    @Nullable
    public static List<String> zzc(@Nullable List<String> list) {
        List<String> list2;
        List<String> list3 = list;
        if (list3 == null || list3.isEmpty()) {
            return null;
        }
        new ArrayList(list3);
        List<String> list4 = list2;
        Collections.sort(list4);
        return list4;
    }

    static {
        Parcelable.Creator<BeginSignInRequest> creator;
        new zzc();
        CREATOR = creator;
    }
}
