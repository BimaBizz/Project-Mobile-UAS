package com.google.android.gms.common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzu;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class zzy {
    @Nullable
    private String zza = null;
    private long zzb = -1;
    private zzu<byte[]> zzc = zzu.zzi();
    private zzu<byte[]> zzd = zzu.zzi();

    zzy() {
    }

    /* access modifiers changed from: package-private */
    public final zzy zza(String str) {
        this.zza = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final zzy zzb(long j) {
        this.zzb = j;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final zzy zzc(List<byte[]> list) {
        List<byte[]> list2 = list;
        Object checkNotNull = Preconditions.checkNotNull(list2);
        this.zzc = zzu.zzm(list2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final zzy zzd(List<byte[]> list) {
        List<byte[]> list2 = list;
        Object checkNotNull = Preconditions.checkNotNull(list2);
        this.zzd = zzu.zzm(list2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final zzz zze() {
        zzz zzz;
        Throwable th;
        Throwable th2;
        Throwable th3;
        if (this.zza == null) {
            new IllegalStateException("packageName must be defined");
            throw th3;
        } else if (this.zzb < 0) {
            new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
            throw th2;
        } else if (!this.zzc.isEmpty() || !this.zzd.isEmpty()) {
            new zzz(this.zza, this.zzb, this.zzc, this.zzd, (zzx) null);
            return zzz;
        } else {
            new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
            throw th;
        }
    }
}
