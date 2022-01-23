package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.util.List;
import javax.annotation.Nullable;

@C0206KeepForSdk
@C0463SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
/* renamed from: com.google.android.gms.common.stats.WakeLockEvent */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0584WakeLockEvent extends C0582StatsEvent {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0584WakeLockEvent> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zza;
    @C0463SafeParcelable.Field(getter = "getTimeMillis", id = 2)
    private final long zzb;
    @C0463SafeParcelable.Field(getter = "getEventType", id = 11)
    private int zzc;
    @C0463SafeParcelable.Field(getter = "getWakeLockName", id = 4)
    private final String zzd;
    @C0463SafeParcelable.Field(getter = "getSecondaryWakeLockName", id = 10)
    private final String zze;
    @C0463SafeParcelable.Field(getter = "getCodePackage", id = 17)
    private final String zzf;
    @C0463SafeParcelable.Field(getter = "getWakeLockType", id = 5)
    private final int zzg;
    @C0463SafeParcelable.Field(getter = "getCallingPackages", id = 6)
    @Nullable
    private final List<String> zzh;
    @C0463SafeParcelable.Field(getter = "getEventKey", id = 12)
    private final String zzi;
    @C0463SafeParcelable.Field(getter = "getElapsedRealtime", id = 8)
    private final long zzj;
    @C0463SafeParcelable.Field(getter = "getDeviceState", id = 14)
    private int zzk;
    @C0463SafeParcelable.Field(getter = "getHostPackage", id = 13)
    private final String zzl;
    @C0463SafeParcelable.Field(getter = "getBeginPowerPercentage", id = 15)
    private final float zzm;
    @C0463SafeParcelable.Field(getter = "getTimeout", id = 16)
    private final long zzn;
    @C0463SafeParcelable.Field(getter = "getAcquiredWithTimeout", id = 18)
    private final boolean zzo;
    private long zzp = -1;

    static {
        Parcelable.Creator<C0584WakeLockEvent> creator;
        new C0586zza();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0584WakeLockEvent(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) long j, @C0463SafeParcelable.Param(id = 11) int i2, @C0463SafeParcelable.Param(id = 4) String str, @C0463SafeParcelable.Param(id = 5) int i3, @C0463SafeParcelable.Param(id = 6) @Nullable List<String> list, @C0463SafeParcelable.Param(id = 12) String str2, @C0463SafeParcelable.Param(id = 8) long j2, @C0463SafeParcelable.Param(id = 14) int i4, @C0463SafeParcelable.Param(id = 10) String str3, @C0463SafeParcelable.Param(id = 13) String str4, @C0463SafeParcelable.Param(id = 15) float f, @C0463SafeParcelable.Param(id = 16) long j3, @C0463SafeParcelable.Param(id = 17) String str5, @C0463SafeParcelable.Param(id = 18) boolean z) {
        this.zza = i;
        this.zzb = j;
        this.zzc = i2;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i3;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j2;
        this.zzk = i4;
        this.zzl = str4;
        this.zzm = f;
        this.zzn = j3;
        this.zzo = z;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        C0462SafeParcelWriter.writeLong(parcel2, 2, this.zzb);
        C0462SafeParcelWriter.writeString(parcel2, 4, this.zzd, false);
        C0462SafeParcelWriter.writeInt(parcel2, 5, this.zzg);
        C0462SafeParcelWriter.writeStringList(parcel2, 6, this.zzh, false);
        C0462SafeParcelWriter.writeLong(parcel2, 8, this.zzj);
        C0462SafeParcelWriter.writeString(parcel2, 10, this.zze, false);
        C0462SafeParcelWriter.writeInt(parcel2, 11, this.zzc);
        C0462SafeParcelWriter.writeString(parcel2, 12, this.zzi, false);
        C0462SafeParcelWriter.writeString(parcel2, 13, this.zzl, false);
        C0462SafeParcelWriter.writeInt(parcel2, 14, this.zzk);
        C0462SafeParcelWriter.writeFloat(parcel2, 15, this.zzm);
        C0462SafeParcelWriter.writeLong(parcel2, 16, this.zzn);
        C0462SafeParcelWriter.writeString(parcel2, 17, this.zzf, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 18, this.zzo);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final long zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzp;
    }

    @RecentlyNonNull
    public final String zzd() {
        String join;
        StringBuilder sb;
        List<String> list = this.zzh;
        String str = this.zzd;
        int i = this.zzg;
        if (list == null) {
            join = "";
        } else {
            join = TextUtils.join(",", list);
        }
        int i2 = this.zzk;
        String str2 = this.zze;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.zzl;
        if (str3 == null) {
            str3 = "";
        }
        float f = this.zzm;
        String str4 = this.zzf;
        if (str4 == null) {
            str4 = "";
        }
        boolean z = this.zzo;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(join).length();
        int length3 = str2.length();
        new StringBuilder(length + 51 + length2 + length3 + str3.length() + str4.length());
        StringBuilder append = sb.append("\t");
        StringBuilder append2 = sb.append(str);
        StringBuilder append3 = sb.append("\t");
        StringBuilder append4 = sb.append(i);
        StringBuilder append5 = sb.append("\t");
        StringBuilder append6 = sb.append(join);
        StringBuilder append7 = sb.append("\t");
        StringBuilder append8 = sb.append(i2);
        StringBuilder append9 = sb.append("\t");
        StringBuilder append10 = sb.append(str2);
        StringBuilder append11 = sb.append("\t");
        StringBuilder append12 = sb.append(str3);
        StringBuilder append13 = sb.append("\t");
        StringBuilder append14 = sb.append(f);
        StringBuilder append15 = sb.append("\t");
        StringBuilder append16 = sb.append(str4);
        StringBuilder append17 = sb.append("\t");
        StringBuilder append18 = sb.append(z);
        return sb.toString();
    }
}
