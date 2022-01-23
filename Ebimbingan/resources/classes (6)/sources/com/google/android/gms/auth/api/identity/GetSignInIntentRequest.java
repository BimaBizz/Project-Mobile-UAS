package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetSignInIntentRequestCreator")
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR;
    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    @Nullable
    private String zzau;
    @SafeParcelable.Field(getter = "getServerClientId", id = 1)
    private final String zzax;
    @SafeParcelable.Field(getter = "getHostedDomainFilter", id = 2)
    @Nullable
    private final String zzbd;

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
            Object checkNotNull = Preconditions.checkNotNull(str2);
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

        public final GetSignInIntentRequest build() {
            GetSignInIntentRequest getSignInIntentRequest;
            new GetSignInIntentRequest(this.zzax, this.zzbd, this.zzau);
            return getSignInIntentRequest;
        }
    }

    public static Builder builder() {
        Builder builder;
        Builder builder2 = builder;
        new Builder();
        return builder2;
    }

    @SafeParcelable.Constructor
    GetSignInIntentRequest(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) @Nullable String str2, @SafeParcelable.Param(id = 3) @Nullable String str3) {
        String str4 = str;
        Object checkNotNull = Preconditions.checkNotNull(str4);
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
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel2, 2, getHostedDomainFilter(), false);
        SafeParcelWriter.writeString(parcel2, 3, this.zzau, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public static Builder zzc(GetSignInIntentRequest getSignInIntentRequest) {
        GetSignInIntentRequest getSignInIntentRequest2 = getSignInIntentRequest;
        Object checkNotNull = Preconditions.checkNotNull(getSignInIntentRequest2);
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
        if (!(obj2 instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj2;
        if (!Objects.equal(this.zzax, getSignInIntentRequest.zzax) || !Objects.equal(this.zzbd, getSignInIntentRequest.zzbd) || !Objects.equal(this.zzau, getSignInIntentRequest.zzau)) {
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
        return Objects.hashCode(objArr3);
    }

    static {
        Parcelable.Creator<GetSignInIntentRequest> creator;
        new zzg();
        CREATOR = creator;
    }
}
