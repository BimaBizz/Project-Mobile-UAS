package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "GetSignInIntentRequestCreator")
/* renamed from: com.google.android.gms.auth.api.identity.GetSignInIntentRequest */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C0086GetSignInIntentRequest extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0086GetSignInIntentRequest> CREATOR;
    @C0463SafeParcelable.Field(getter = "getSessionId", id = 3)
    @Nullable
    private String zzau;
    @C0463SafeParcelable.Field(getter = "getServerClientId", id = 1)
    private final String zzax;
    @C0463SafeParcelable.Field(getter = "getHostedDomainFilter", id = 2)
    @Nullable
    private final String zzbd;

    /* renamed from: com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder {
        @Nullable
        private String zzau;
        private String zzax;
        @Nullable
        private String zzbd;

        public Builder() {
        }

        public final Builder setServerClientId(String str) {
            String str2 = str;
            Object checkNotNull = C0446Preconditions.checkNotNull(str2);
            this.zzax = str2;
            return this;
        }

        public final Builder filterByHostedDomain(@Nullable String str) {
            this.zzbd = str;
            return this;
        }

        public final Builder zzf(@Nullable String str) {
            this.zzau = str;
            return this;
        }

        public final C0086GetSignInIntentRequest build() {
            C0086GetSignInIntentRequest getSignInIntentRequest;
            new C0086GetSignInIntentRequest(this.zzax, this.zzbd, this.zzau);
            return getSignInIntentRequest;
        }
    }

    public static Builder builder() {
        Builder builder;
        Builder builder2 = builder;
        new Builder();
        return builder2;
    }

    @C0463SafeParcelable.Constructor
    C0086GetSignInIntentRequest(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) @Nullable String str2, @C0463SafeParcelable.Param(id = 3) @Nullable String str3) {
        String str4 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(str4);
        this.zzax = str4;
        this.zzbd = str2;
        this.zzau = str3;
    }

    public String getServerClientId() {
        return this.zzax;
    }

    @Nullable
    public String getHostedDomainFilter() {
        return this.zzbd;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, getServerClientId(), false);
        C0462SafeParcelWriter.writeString(parcel2, 2, getHostedDomainFilter(), false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzau, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public static Builder zzc(C0086GetSignInIntentRequest getSignInIntentRequest) {
        C0086GetSignInIntentRequest getSignInIntentRequest2 = getSignInIntentRequest;
        Object checkNotNull = C0446Preconditions.checkNotNull(getSignInIntentRequest2);
        Builder filterByHostedDomain = builder().setServerClientId(getSignInIntentRequest2.getServerClientId()).filterByHostedDomain(getSignInIntentRequest2.getHostedDomainFilter());
        String str = getSignInIntentRequest2.zzau;
        String str2 = str;
        if (str != null) {
            Builder zzf = filterByHostedDomain.zzf(str2);
        }
        return filterByHostedDomain;
    }

    public boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof C0086GetSignInIntentRequest)) {
            return false;
        }
        C0086GetSignInIntentRequest getSignInIntentRequest = (C0086GetSignInIntentRequest) obj2;
        if (!C0444Objects.equal(this.zzax, getSignInIntentRequest.zzax) || !C0444Objects.equal(this.zzbd, getSignInIntentRequest.zzbd) || !C0444Objects.equal(this.zzau, getSignInIntentRequest.zzau)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.zzax;
        Object[] objArr2 = objArr;
        objArr2[1] = this.zzbd;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.zzau;
        return C0444Objects.hashCode(objArr3);
    }

    static {
        Parcelable.Creator<C0086GetSignInIntentRequest> creator;
        new C0097zzg();
        CREATOR = creator;
    }
}
