package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0435GmsLogger;
import java.util.Locale;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.logging.Logger */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0547Logger {
    private final String zza;
    private final String zzb;
    private final C0435GmsLogger zzc;
    private final int zzd;

    @C0206KeepForSdk
    public C0547Logger(@RecentlyNonNull String str, @RecentlyNonNull String... strArr) {
        StringBuilder sb;
        String sb2;
        C0435GmsLogger gmsLogger;
        String str2 = str;
        String[] strArr2 = strArr;
        int length = strArr2.length;
        if (length == 0) {
            sb2 = "";
        } else {
            new StringBuilder();
            StringBuilder append = sb.append('[');
            for (int i = 0; i < length; i++) {
                String str3 = strArr2[i];
                if (sb.length() > 1) {
                    StringBuilder append2 = sb.append(",");
                }
                StringBuilder append3 = sb.append(str3);
            }
            StringBuilder append4 = sb.append("] ");
            sb2 = sb.toString();
        }
        this.zzb = sb2;
        this.zza = str2;
        new C0435GmsLogger(str2);
        this.zzc = gmsLogger;
        int i2 = 2;
        while (i2 <= 7 && !Log.isLoggable(this.zza, i2)) {
            i2++;
        }
        this.zzd = i2;
    }

    @C0206KeepForSdk
    public void d(@RecentlyNonNull String str, @RecentlyNonNull Throwable th, @Nullable Object... objArr) {
        String str2 = str;
        Throwable th2 = th;
        Object[] objArr2 = objArr;
        if (isLoggable(3)) {
            int d = Log.d(this.zza, format(str2, objArr2), th2);
        }
    }

    @C0206KeepForSdk
    public void e(@RecentlyNonNull String str, @RecentlyNonNull Throwable th, @Nullable Object... objArr) {
        int e = Log.e(this.zza, format(str, objArr), th);
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @C0206KeepForSdk
    public String format(@RecentlyNonNull String str, @Nullable Object... objArr) {
        String str2 = str;
        Object[] objArr2 = objArr;
        if (objArr2 != null && objArr2.length > 0) {
            str2 = String.format(Locale.US, str2, objArr2);
        }
        return this.zzb.concat(str2);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public String getTag() {
        return this.zza;
    }

    @C0206KeepForSdk
    public void i(@RecentlyNonNull String str, @Nullable Object... objArr) {
        int i = Log.i(this.zza, format(str, objArr));
    }

    @C0206KeepForSdk
    public boolean isLoggable(int i) {
        return this.zzd <= i;
    }

    @C0206KeepForSdk
    public void v(@RecentlyNonNull String str, @RecentlyNonNull Throwable th, @Nullable Object... objArr) {
        String str2 = str;
        Throwable th2 = th;
        Object[] objArr2 = objArr;
        if (isLoggable(2)) {
            int v = Log.v(this.zza, format(str2, objArr2), th2);
        }
    }

    @C0206KeepForSdk
    public void w(@RecentlyNonNull String str, @Nullable Object... objArr) {
        int w = Log.w(this.zza, format(str, objArr));
    }

    @C0206KeepForSdk
    public void wtf(@RecentlyNonNull String str, @RecentlyNonNull Throwable th, @Nullable Object... objArr) {
        int wtf = Log.wtf(this.zza, format(str, objArr), th);
    }

    @C0206KeepForSdk
    public void e(@RecentlyNonNull String str, @Nullable Object... objArr) {
        int e = Log.e(this.zza, format(str, objArr));
    }

    @C0206KeepForSdk
    public void wtf(@RecentlyNonNull Throwable th) {
        int wtf = Log.wtf(this.zza, th);
    }

    @C0206KeepForSdk
    public void d(@RecentlyNonNull String str, @Nullable Object... objArr) {
        String str2 = str;
        Object[] objArr2 = objArr;
        if (isLoggable(3)) {
            int d = Log.d(this.zza, format(str2, objArr2));
        }
    }

    @C0206KeepForSdk
    public void v(@RecentlyNonNull String str, @Nullable Object... objArr) {
        String str2 = str;
        Object[] objArr2 = objArr;
        if (isLoggable(2)) {
            int v = Log.v(this.zza, format(str2, objArr2));
        }
    }
}
