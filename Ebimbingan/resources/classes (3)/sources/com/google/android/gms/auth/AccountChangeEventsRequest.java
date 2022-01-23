package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AccountChangeEventsRequestCreator")
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    private final int zza;
    @SafeParcelable.Field(id = 2)
    private int zzb;
    @SafeParcelable.Field(id = 3)
    @Deprecated
    private String zzc;
    @SafeParcelable.Field(id = 4)
    private Account zzd;

    @SafeParcelable.Constructor
    AccountChangeEventsRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) Account account) {
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

    public AccountChangeEventsRequest() {
        this.zza = 1;
    }

    public AccountChangeEventsRequest setEventIndex(int i) {
        this.zzb = i;
        return this;
    }

    @Deprecated
    public AccountChangeEventsRequest setAccountName(String str) {
        this.zzc = str;
        return this;
    }

    @Deprecated
    public String getAccountName() {
        return this.zzc;
    }

    public AccountChangeEventsRequest setAccount(Account account) {
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
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        SafeParcelWriter.writeInt(parcel2, 2, this.zzb);
        SafeParcelWriter.writeString(parcel2, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel2, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<AccountChangeEventsRequest> creator;
        new zzb();
        CREATOR = creator;
    }
}
