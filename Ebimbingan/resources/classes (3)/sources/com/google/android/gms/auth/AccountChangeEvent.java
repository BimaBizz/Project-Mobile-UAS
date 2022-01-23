package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AccountChangeEventCreator")
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    private final int zza;
    @SafeParcelable.Field(id = 2)
    private final long zzb;
    @SafeParcelable.Field(id = 3)
    private final String zzc;
    @SafeParcelable.Field(id = 4)
    private final int zzd;
    @SafeParcelable.Field(id = 5)
    private final int zze;
    @SafeParcelable.Field(id = 6)
    private final String zzf;

    @SafeParcelable.Constructor
    AccountChangeEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) String str2) {
        this.zza = i;
        this.zzb = j;
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str2;
    }

    public AccountChangeEvent(long j, String str, int i, int i2, String str2) {
        this.zza = 1;
        this.zzb = j;
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzd = i;
        this.zze = i2;
        this.zzf = str2;
    }

    public String getAccountName() {
        return this.zzc;
    }

    public int getChangeType() {
        return this.zzd;
    }

    public int getEventIndex() {
        return this.zze;
    }

    public String getChangeData() {
        return this.zzf;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        SafeParcelWriter.writeLong(parcel2, 2, this.zzb);
        SafeParcelWriter.writeString(parcel2, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel2, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel2, 5, this.zze);
        SafeParcelWriter.writeString(parcel2, 6, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public String toString() {
        StringBuilder sb;
        String str = "UNKNOWN";
        switch (this.zzd) {
            case 1:
                str = "ADDED";
                break;
            case 2:
                str = "REMOVED";
                break;
            case 3:
                str = "RENAMED_FROM";
                break;
            case 4:
                str = "RENAMED_TO";
                break;
        }
        String str2 = this.zzc;
        String str3 = str;
        String str4 = this.zzf;
        int i = this.zze;
        new StringBuilder(91 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        return sb.append("AccountChangeEvent {accountName = ").append(str2).append(", changeType = ").append(str3).append(", changeData = ").append(str4).append(", eventIndex = ").append(i).append("}").toString();
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(this.zza);
        Object[] objArr2 = objArr;
        objArr2[1] = Long.valueOf(this.zzb);
        Object[] objArr3 = objArr2;
        objArr3[2] = this.zzc;
        Object[] objArr4 = objArr3;
        objArr4[3] = Integer.valueOf(this.zzd);
        Object[] objArr5 = objArr4;
        objArr5[4] = Integer.valueOf(this.zze);
        Object[] objArr6 = objArr5;
        objArr6[5] = this.zzf;
        return Objects.hashCode(objArr6);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r1 = r8
            r2 = r9
            r4 = r2
            r5 = r1
            if (r4 != r5) goto L_0x0009
            r4 = 1
            r1 = r4
        L_0x0008:
            return r1
        L_0x0009:
            r4 = r2
            boolean r4 = r4 instanceof com.google.android.gms.auth.AccountChangeEvent
            if (r4 == 0) goto L_0x0052
            r4 = r2
            com.google.android.gms.auth.AccountChangeEvent r4 = (com.google.android.gms.auth.AccountChangeEvent) r4
            r3 = r4
            r4 = r1
            int r4 = r4.zza
            r5 = r3
            int r5 = r5.zza
            if (r4 != r5) goto L_0x004f
            r4 = r1
            long r4 = r4.zzb
            r6 = r3
            long r6 = r6.zzb
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x004f
            r4 = r1
            java.lang.String r4 = r4.zzc
            r5 = r3
            java.lang.String r5 = r5.zzc
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r5)
            if (r4 == 0) goto L_0x004f
            r4 = r1
            int r4 = r4.zzd
            r5 = r3
            int r5 = r5.zzd
            if (r4 != r5) goto L_0x004f
            r4 = r1
            int r4 = r4.zze
            r5 = r3
            int r5 = r5.zze
            if (r4 != r5) goto L_0x004f
            r4 = r1
            java.lang.String r4 = r4.zzf
            r5 = r3
            java.lang.String r5 = r5.zzf
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r5)
            if (r4 == 0) goto L_0x004f
            r4 = 1
            r1 = r4
            goto L_0x0008
        L_0x004f:
            r4 = 0
            r1 = r4
            goto L_0x0008
        L_0x0052:
            r4 = 0
            r1 = r4
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.AccountChangeEvent.equals(java.lang.Object):boolean");
    }

    static {
        Parcelable.Creator<AccountChangeEvent> creator;
        new zza();
        CREATOR = creator;
    }
}
