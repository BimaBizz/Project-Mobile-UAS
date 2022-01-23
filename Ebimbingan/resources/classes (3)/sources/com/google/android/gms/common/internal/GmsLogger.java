package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class GmsLogger {
    private final String zza;
    @Nullable
    private final String zzb;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    public GmsLogger(@RecentlyNonNull String str) {
        this(str, (String) null);
    }

    private final String zza(String str) {
        String str2 = str;
        String str3 = this.zzb;
        return str3 == null ? str2 : str3.concat(str2);
    }

    private final String zzb(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.zzb;
        if (str2 == null) {
            return format;
        }
        return str2.concat(format);
    }

    @KeepForSdk
    public boolean canLog(int i) {
        return Log.isLoggable(this.zza, i);
    }

    @KeepForSdk
    public boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    public void d(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (canLog(3)) {
            int d = Log.d(str3, zza(str4));
        }
    }

    @KeepForSdk
    public void e(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (canLog(6)) {
            int e = Log.e(str3, zza(str4));
        }
    }

    @KeepForSdk
    public void efmt(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Object... objArr) {
        String str3 = str;
        String str4 = str2;
        Object[] objArr2 = objArr;
        if (canLog(6)) {
            int e = Log.e(str3, zzb(str4, objArr2));
        }
    }

    @KeepForSdk
    public void i(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (canLog(4)) {
            int i = Log.i(str3, zza(str4));
        }
    }

    @KeepForSdk
    public void pii(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
    }

    @KeepForSdk
    public void pii(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
    }

    @KeepForSdk
    public void v(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (canLog(2)) {
            int v = Log.v(str3, zza(str4));
        }
    }

    @KeepForSdk
    public void w(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (canLog(5)) {
            int w = Log.w(str3, zza(str4));
        }
    }

    @KeepForSdk
    public void wfmt(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Object... objArr) {
        String str3 = str;
        String str4 = str2;
        Object[] objArr2 = objArr;
        if (canLog(5)) {
            int w = Log.w(this.zza, zzb(str4, objArr2));
        }
    }

    @KeepForSdk
    public void wtf(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        String str3 = str;
        String str4 = str2;
        Throwable th2 = th;
        if (canLog(7)) {
            int e = Log.e(str3, zza(str4), th2);
            int wtf = Log.wtf(str3, zza(str4), th2);
        }
    }

    @KeepForSdk
    public GmsLogger(@RecentlyNonNull String str, @Nullable String str2) {
        boolean z;
        String str3 = str;
        String str4 = str2;
        Object checkNotNull = Preconditions.checkNotNull(str3, "log tag cannot be null");
        if (str3.length() <= 23) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "tag \"%s\" is longer than the %d character maximum", str3, 23);
        this.zza = str3;
        if (str4 == null || str4.length() <= 0) {
            this.zzb = null;
            return;
        }
        this.zzb = str4;
    }

    @KeepForSdk
    public void d(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        String str3 = str;
        String str4 = str2;
        Throwable th2 = th;
        if (canLog(3)) {
            int d = Log.d(str3, zza(str4), th2);
        }
    }

    @KeepForSdk
    public void e(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        String str3 = str;
        String str4 = str2;
        Throwable th2 = th;
        if (canLog(6)) {
            int e = Log.e(str3, zza(str4), th2);
        }
    }

    @KeepForSdk
    public void i(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        String str3 = str;
        String str4 = str2;
        Throwable th2 = th;
        if (canLog(4)) {
            int i = Log.i(str3, zza(str4), th2);
        }
    }

    @KeepForSdk
    public void v(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        String str3 = str;
        String str4 = str2;
        Throwable th2 = th;
        if (canLog(2)) {
            int v = Log.v(str3, zza(str4), th2);
        }
    }

    @KeepForSdk
    public void w(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Throwable th) {
        String str3 = str;
        String str4 = str2;
        Throwable th2 = th;
        if (canLog(5)) {
            int w = Log.w(str3, zza(str4), th2);
        }
    }
}
