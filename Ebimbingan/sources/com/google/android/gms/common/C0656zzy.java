package com.google.android.gms.common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.internal.common.C1127zzu;
import java.util.List;

/* renamed from: com.google.android.gms.common.zzy */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0656zzy {
    @Nullable
    private String zza = null;
    private long zzb = -1;
    private C1127zzu<byte[]> zzc = C1127zzu.zzi();
    private C1127zzu<byte[]> zzd = C1127zzu.zzi();

    C0656zzy() {
    }

    /* access modifiers changed from: package-private */
    public final C0656zzy zza(String str) {
        this.zza = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final C0656zzy zzb(long j) {
        this.zzb = j;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final C0656zzy zzc(List<byte[]> list) {
        List<byte[]> list2 = list;
        Object checkNotNull = C0446Preconditions.checkNotNull(list2);
        this.zzc = C1127zzu.zzm(list2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final C0656zzy zzd(List<byte[]> list) {
        List<byte[]> list2 = list;
        Object checkNotNull = C0446Preconditions.checkNotNull(list2);
        this.zzd = C1127zzu.zzm(list2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final C0657zzz zze() {
        C0657zzz zzz;
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
            new C0657zzz(this.zza, this.zzb, this.zzc, this.zzd, (C0655zzx) null);
            return zzz;
        } else {
            new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
            throw th;
        }
    }
}
