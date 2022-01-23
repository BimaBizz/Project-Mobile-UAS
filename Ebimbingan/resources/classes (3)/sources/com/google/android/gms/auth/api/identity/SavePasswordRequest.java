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

@SafeParcelable.Class(creator = "SavePasswordRequestCreator")
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR;
    @SafeParcelable.Field(getter = "getSessionId", id = 2)
    @Nullable
    private final String zzau;
    @SafeParcelable.Field(getter = "getSignInPassword", id = 1)
    private final SignInPassword zzbe;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder {
        @Nullable
        private String zzau;
        private SignInPassword zzbe;

        public Builder() {
        }

        public final Builder setSignInPassword(@NonNull SignInPassword signInPassword) {
            this.zzbe = signInPassword;
            return this;
        }

        public final Builder zzg(@NonNull String str) {
            this.zzau = str;
            return this;
        }

        public final SavePasswordRequest build() {
            SavePasswordRequest savePasswordRequest;
            new SavePasswordRequest(this.zzbe, this.zzau);
            return savePasswordRequest;
        }
    }

    public static Builder builder() {
        Builder builder;
        Builder builder2 = builder;
        new Builder();
        return builder2;
    }

    public static Builder zzc(SavePasswordRequest savePasswordRequest) {
        SavePasswordRequest savePasswordRequest2 = savePasswordRequest;
        Object checkNotNull = Preconditions.checkNotNull(savePasswordRequest2);
        Builder signInPassword = builder().setSignInPassword(savePasswordRequest2.getSignInPassword());
        String str = savePasswordRequest2.zzau;
        String str2 = str;
        if (str != null) {
            Builder zzg = signInPassword.zzg(str2);
        }
        return signInPassword;
    }

    @SafeParcelable.Constructor
    SavePasswordRequest(@SafeParcelable.Param(id = 1) SignInPassword signInPassword, @SafeParcelable.Param(id = 2) @Nullable String str) {
        this.zzbe = (SignInPassword) Preconditions.checkNotNull(signInPassword);
        this.zzau = str;
    }

    public SignInPassword getSignInPassword() {
        return this.zzbe;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zzbe;
        Object[] objArr2 = objArr;
        objArr2[1] = this.zzau;
        return Objects.hashCode(objArr2);
    }

    public boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj2;
        if (!Objects.equal(this.zzbe, savePasswordRequest.zzbe) || !Objects.equal(this.zzau, savePasswordRequest.zzau)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, getSignInPassword(), i, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzau, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<SavePasswordRequest> creator;
        new zzj();
        CREATOR = creator;
    }
}
