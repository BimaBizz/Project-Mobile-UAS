package com.google.android.gms.common.stats;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface Types {
        @KeepForSdk
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        @KeepForSdk
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public StatsEvent() {
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
