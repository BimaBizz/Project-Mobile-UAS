package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0206KeepForSdk
@C0463SafeParcelable.Class(creator = "ScopeCreator")
/* renamed from: com.google.android.gms.common.api.Scope */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0235Scope extends C0460AbstractSafeParcelable implements C0447ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0235Scope> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zza;
    @C0463SafeParcelable.Field(getter = "getScopeUri", id = 2)
    private final String zzb;

    static {
        Parcelable.Creator<C0235Scope> creator;
        new C0383zza();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0235Scope(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) String str) {
        String str2 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2, "scopeUri must not be null or empty");
        this.zza = i;
        this.zzb = str2;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public String getScopeUri() {
        return this.zzb;
    }

    public int hashCode() {
        return this.zzb.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.zzb;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        C0462SafeParcelWriter.writeString(parcel2, 2, getScopeUri(), false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0235Scope(@RecentlyNonNull String str) {
        this(1, str);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r0
            r3 = r1
            if (r2 != r3) goto L_0x0009
            r2 = 1
            r0 = r2
        L_0x0008:
            return r0
        L_0x0009:
            r2 = r1
            boolean r2 = r2 instanceof com.google.android.gms.common.api.C0235Scope
            if (r2 != 0) goto L_0x0011
            r2 = 0
            r0 = r2
            goto L_0x0008
        L_0x0011:
            r2 = r0
            java.lang.String r2 = r2.zzb
            r3 = r1
            com.google.android.gms.common.api.Scope r3 = (com.google.android.gms.common.api.C0235Scope) r3
            java.lang.String r3 = r3.zzb
            boolean r2 = r2.equals(r3)
            r0 = r2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C0235Scope.equals(java.lang.Object):boolean");
    }
}
