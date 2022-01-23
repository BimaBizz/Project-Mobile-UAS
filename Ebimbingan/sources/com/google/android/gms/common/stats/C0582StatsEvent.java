package com.google.android.gms.common.stats;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;

@C0206KeepForSdk
@Deprecated
/* renamed from: com.google.android.gms.common.stats.StatsEvent */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C0582StatsEvent extends C0460AbstractSafeParcelable implements C0447ReflectedParcelable {

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.stats.StatsEvent$Types */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface Types {
        @C0206KeepForSdk
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        @C0206KeepForSdk
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public C0582StatsEvent() {
    }

    @RecentlyNonNull
    public final String toString() {
        StringBuilder sb;
        long zza = zza();
        int zzb = zzb();
        long zzc = zzc();
        String zzd = zzd();
        new StringBuilder(String.valueOf(zzd).length() + 53);
        StringBuilder append = sb.append(zza);
        StringBuilder append2 = sb.append("\t");
        StringBuilder append3 = sb.append(zzb);
        StringBuilder append4 = sb.append("\t");
        StringBuilder append5 = sb.append(zzc);
        StringBuilder append6 = sb.append(zzd);
        return sb.toString();
    }

    public abstract long zza();

    public abstract int zzb();

    public abstract long zzc();

    @RecentlyNonNull
    public abstract String zzd();
}
