package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "SavePasswordRequestCreator")
/* renamed from: com.google.android.gms.auth.api.identity.SavePasswordRequest */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C0088SavePasswordRequest extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0088SavePasswordRequest> CREATOR;
    @C0463SafeParcelable.Field(getter = "getSessionId", id = 2)
    @Nullable
    private final String zzau;
    @C0463SafeParcelable.Field(getter = "getSignInPassword", id = 1)
    private final C0092SignInPassword zzbe;

    /* renamed from: com.google.android.gms.auth.api.identity.SavePasswordRequest$Builder */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder {
        @Nullable
        private String zzau;
        private C0092SignInPassword zzbe;

        public Builder() {
        }

        public final Builder setSignInPassword(@NonNull C0092SignInPassword signInPassword) {
            this.zzbe = signInPassword;
            return this;
        }

        public final Builder zzg(@NonNull String str) {
            this.zzau = str;
            return this;
        }

        public final C0088SavePasswordRequest build() {
            C0088SavePasswordRequest savePasswordRequest;
            new C0088SavePasswordRequest(this.zzbe, this.zzau);
            return savePasswordRequest;
        }
    }

    public static Builder builder() {
        Builder builder;
        Builder builder2 = builder;
        new Builder();
        return builder2;
    }

    public static Builder zzc(C0088SavePasswordRequest savePasswordRequest) {
        C0088SavePasswordRequest savePasswordRequest2 = savePasswordRequest;
        Object checkNotNull = C0446Preconditions.checkNotNull(savePasswordRequest2);
        Builder signInPassword = builder().setSignInPassword(savePasswordRequest2.getSignInPassword());
        String str = savePasswordRequest2.zzau;
        String str2 = str;
        if (str != null) {
            Builder zzg = signInPassword.zzg(str2);
        }
        return signInPassword;
    }

    @C0463SafeParcelable.Constructor
    C0088SavePasswordRequest(@C0463SafeParcelable.Param(id = 1) C0092SignInPassword signInPassword, @C0463SafeParcelable.Param(id = 2) @Nullable String str) {
        this.zzbe = (C0092SignInPassword) C0446Preconditions.checkNotNull(signInPassword);
        this.zzau = str;
    }

    public C0092SignInPassword getSignInPassword() {
        return this.zzbe;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zzbe;
        Object[] objArr2 = objArr;
        objArr2[1] = this.zzau;
        return C0444Objects.hashCode(objArr2);
    }

    public boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof C0088SavePasswordRequest)) {
            return false;
        }
        C0088SavePasswordRequest savePasswordRequest = (C0088SavePasswordRequest) obj2;
        if (!C0444Objects.equal(this.zzbe, savePasswordRequest.zzbe) || !C0444Objects.equal(this.zzau, savePasswordRequest.zzau)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, getSignInPassword(), i, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzau, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<C0088SavePasswordRequest> creator;
        new C0100zzj();
        CREATOR = creator;
    }
}
