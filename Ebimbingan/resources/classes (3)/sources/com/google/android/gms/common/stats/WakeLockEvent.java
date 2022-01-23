package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.Nullable;

@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class WakeLockEvent extends StatsEvent {
    @RecentlyNonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zza;
    @SafeParcelable.Field(getter = "getTimeMillis", id = 2)
    private final long zzb;
    @SafeParcelable.Field(getter = "getEventType", id = 11)
    private int zzc;
    @SafeParcelable.Field(getter = "getWakeLockName", id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", id = 10)
    private final String zze;
    @SafeParcelable.Field(getter = "getCodePackage", id = 17)
    private final String zzf;
    @SafeParcelable.Field(getter = "getWakeLockType", id = 5)
    private final int zzg;
    @SafeParcelable.Field(getter = "getCallingPackages", id = 6)
    @Nullable
    private final List<String> zzh;
    @SafeParcelable.Field(getter = "getEventKey", id = 12)
    private final String zzi;
    @SafeParcelable.Field(getter = "getElapsedRealtime", id = 8)
    private final long zzj;
    @SafeParcelable.Field(getter = "getDeviceState", id = 14)
    private int zzk;
    @SafeParcelable.Field(getter = "getHostPackage", id = 13)
    private final String zzl;
    @SafeParcelable.Field(getter = "getBeginPowerPercentage", id = 15)
    private final float zzm;
    @SafeParcelable.Field(getter = "getTimeout", id = 16)
    private final long zzn;
    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", id = 18)
    private final boolean zzo;
    private long zzp = -1;

    static {
        Parcelable.Creator<WakeLockEvent> creator;
        new zza();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    WakeLockEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 11) int i2, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) @Nullable List<String> list, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 14) int i4, @SafeParcelable.Param(id = 10) String str3, @SafeParcelable.Param(id = 13) String str4, @SafeParcelable.Param(id = 15) float f, @SafeParcelable.Param(id = 16) long j3, @SafeParcelable.Param(id = 17) String str5, @SafeParcelable.Param(id = 18) boolean z) {
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
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        SafeParcelWriter.writeLong(parcel2, 2, this.zzb);
        SafeParcelWriter.writeString(parcel2, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel2, 5, this.zzg);
        SafeParcelWriter.writeStringList(parcel2, 6, this.zzh, false);
        SafeParcelWriter.writeLong(parcel2, 8, this.zzj);
        SafeParcelWriter.writeString(parcel2, 10, this.zze, false);
        SafeParcelWriter.writeInt(parcel2, 11, this.zzc);
        SafeParcelWriter.writeString(parcel2, 12, this.zzi, false);
        SafeParcelWriter.writeString(parcel2, 13, this.zzl, false);
        SafeParcelWriter.writeInt(parcel2, 14, this.zzk);
        SafeParcelWriter.writeFloat(parcel2, 15, this.zzm);
        SafeParcelWriter.writeLong(parcel2, 16, this.zzn);
        SafeParcelWriter.writeString(parcel2, 17, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel2, 18, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
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
