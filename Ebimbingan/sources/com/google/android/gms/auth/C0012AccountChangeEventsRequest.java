package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "AccountChangeEventsRequestCreator")
/* renamed from: com.google.android.gms.auth.AccountChangeEventsRequest */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0012AccountChangeEventsRequest extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0012AccountChangeEventsRequest> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    private final int zza;
    @C0463SafeParcelable.Field(id = 2)
    private int zzb;
    @C0463SafeParcelable.Field(id = 3)
    @Deprecated
    private String zzc;
    @C0463SafeParcelable.Field(id = 4)
    private Account zzd;

    @C0463SafeParcelable.Constructor
    C0012AccountChangeEventsRequest(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) int i2, @C0463SafeParcelable.Param(id = 3) String str, @C0463SafeParcelable.Param(id = 4) Account account) {
        Account account2;
        String str2 = str;
        Account account3 = account;
        this.zza = i;
        this.zzb = i2;
        this.zzc = str2;
        if (account3 != null || TextUtils.isEmpty(str2)) {
            this.zzd = account3;
            return;
        }
        new Account(str2, "com.google");
        this.zzd = account2;
    }

    public C0012AccountChangeEventsRequest() {
        this.zza = 1;
    }

    public C0012AccountChangeEventsRequest setEventIndex(int i) {
        this.zzb = i;
        return this;
    }

    @Deprecated
    public C0012AccountChangeEventsRequest setAccountName(String str) {
        this.zzc = str;
        return this;
    }

    @Deprecated
    public String getAccountName() {
        return this.zzc;
    }

    public C0012AccountChangeEventsRequest setAccount(Account account) {
        this.zzd = account;
        return this;
    }

    public Account getAccount() {
        return this.zzd;
    }

    public int getEventIndex() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        C0462SafeParcelWriter.writeInt(parcel2, 2, this.zzb);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzc, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 4, this.zzd, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<C0012AccountChangeEventsRequest> creator;
        new C0170zzb();
        CREATOR = creator;
    }
}
