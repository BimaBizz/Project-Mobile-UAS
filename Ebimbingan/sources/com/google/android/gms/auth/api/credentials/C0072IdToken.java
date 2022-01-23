package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "IdTokenCreator")
@C0463SafeParcelable.Reserved({1000})
/* renamed from: com.google.android.gms.auth.api.credentials.IdToken */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0072IdToken extends C0460AbstractSafeParcelable implements C0447ReflectedParcelable {
    public static final Parcelable.Creator<C0072IdToken> CREATOR;
    @C0463SafeParcelable.Field(getter = "getIdToken", id = 2)
    @NonNull
    private final String zzal;
    @C0463SafeParcelable.Field(getter = "getAccountType", id = 1)
    @NonNull
    private final String zzr;

    @C0463SafeParcelable.Constructor
    public C0072IdToken(@C0463SafeParcelable.Param(id = 1) @NonNull String str, @C0463SafeParcelable.Param(id = 2) @NonNull String str2) {
        String str3 = str;
        String str4 = str2;
        C0446Preconditions.checkArgument(!TextUtils.isEmpty(str3), "account type string cannot be null or empty");
        C0446Preconditions.checkArgument(!TextUtils.isEmpty(str4), "id token string cannot be null or empty");
        this.zzr = str3;
        this.zzal = str4;
    }

    @NonNull
    public final String getAccountType() {
        return this.zzr;
    }

    @NonNull
    public final String getIdToken() {
        return this.zzal;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, getAccountType(), false);
        C0462SafeParcelWriter.writeString(parcel2, 2, getIdToken(), false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r3 = r0
            r4 = r1
            if (r3 != r4) goto L_0x0009
            r3 = 1
            r0 = r3
        L_0x0008:
            return r0
        L_0x0009:
            r3 = r1
            boolean r3 = r3 instanceof com.google.android.gms.auth.api.credentials.C0072IdToken
            if (r3 != 0) goto L_0x0011
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x0011:
            r3 = r1
            com.google.android.gms.auth.api.credentials.IdToken r3 = (com.google.android.gms.auth.api.credentials.C0072IdToken) r3
            r2 = r3
            r3 = r0
            java.lang.String r3 = r3.zzr
            r4 = r2
            java.lang.String r4 = r4.zzr
            boolean r3 = com.google.android.gms.common.internal.C0444Objects.equal(r3, r4)
            if (r3 == 0) goto L_0x0030
            r3 = r0
            java.lang.String r3 = r3.zzal
            r4 = r2
            java.lang.String r4 = r4.zzal
            boolean r3 = com.google.android.gms.common.internal.C0444Objects.equal(r3, r4)
            if (r3 == 0) goto L_0x0030
            r3 = 1
            r0 = r3
            goto L_0x0008
        L_0x0030:
            r3 = 0
            r0 = r3
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.C0072IdToken.equals(java.lang.Object):boolean");
    }

    static {
        Parcelable.Creator<C0072IdToken> creator;
        new C0082zzk();
        CREATOR = creator;
    }
}
