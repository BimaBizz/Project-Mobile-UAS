package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "ResolveAccountRequestCreator")
/* renamed from: com.google.android.gms.common.internal.zat */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0504zat extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0504zat> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaa;
    @C0463SafeParcelable.Field(getter = "getAccount", id = 2)
    private final Account zab;
    @C0463SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final int zac;
    @C0463SafeParcelable.Field(getter = "getSignInAccountHint", id = 4)
    @Nullable
    private final C0122GoogleSignInAccount zad;

    static {
        Parcelable.Creator<C0504zat> creator;
        new C0505zau();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0504zat(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) Account account, @C0463SafeParcelable.Param(id = 3) int i2, @C0463SafeParcelable.Param(id = 4) @Nullable C0122GoogleSignInAccount googleSignInAccount) {
        this.zaa = i;
        this.zab = account;
        this.zac = i2;
        this.zad = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeParcelable(parcel2, 2, this.zab, i2, false);
        C0462SafeParcelWriter.writeInt(parcel2, 3, this.zac);
        C0462SafeParcelWriter.writeParcelable(parcel2, 4, this.zad, i2, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0504zat(Account account, int i, @Nullable C0122GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
