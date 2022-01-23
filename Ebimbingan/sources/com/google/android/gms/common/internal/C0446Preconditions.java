package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.util.C0624zzb;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.Preconditions */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0446Preconditions {
    private C0446Preconditions() {
        Throwable th;
        new AssertionError("Uninstantiable");
        throw th;
    }

    @C0206KeepForSdk
    public static void checkArgument(boolean z) {
        Throwable th;
        if (!z) {
            new IllegalArgumentException();
            throw th;
        }
    }

    @C0206KeepForSdk
    public static void checkHandlerThread(@RecentlyNonNull Handler handler) {
        String str;
        Throwable th;
        StringBuilder sb;
        Handler handler2 = handler;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler2.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler2.getLooper().getThread().getName();
            new StringBuilder(String.valueOf(name).length() + 36 + String.valueOf(str).length());
            StringBuilder append = sb.append("Must be called on ");
            StringBuilder append2 = sb.append(name);
            StringBuilder append3 = sb.append(" thread, but got ");
            StringBuilder append4 = sb.append(str);
            StringBuilder append5 = sb.append(".");
            new IllegalStateException(sb.toString());
            throw th;
        }
    }

    @C0206KeepForSdk
    public static void checkMainThread(@RecentlyNonNull String str) {
        Throwable th;
        String str2 = str;
        if (!C0624zzb.zza()) {
            new IllegalStateException(str2);
            throw th;
        }
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    @EnsuresNonNull({"#1"})
    public static String checkNotEmpty(@Nullable String str) {
        Throwable th;
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        new IllegalArgumentException("Given String is empty or null");
        throw th;
    }

    @C0206KeepForSdk
    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    @EnsuresNonNull({"#1"})
    @NonNull
    @C0206KeepForSdk
    public static <T> T checkNotNull(@Nullable T t) {
        Throwable th;
        T t2 = t;
        if (t2 != null) {
            return t2;
        }
        new NullPointerException("null reference");
        throw th;
    }

    @C0206KeepForSdk
    public static int checkNotZero(int i) {
        Throwable th;
        int i2 = i;
        if (i2 != 0) {
            return i2;
        }
        new IllegalArgumentException("Given Integer is zero");
        throw th;
    }

    @C0206KeepForSdk
    public static void checkState(boolean z) {
        Throwable th;
        if (!z) {
            new IllegalStateException();
            throw th;
        }
    }

    @C0206KeepForSdk
    public static void checkArgument(boolean z, @RecentlyNonNull Object obj) {
        Throwable th;
        Object obj2 = obj;
        if (!z) {
            new IllegalArgumentException(String.valueOf(obj2));
            throw th;
        }
    }

    @C0206KeepForSdk
    public static void checkNotMainThread(@RecentlyNonNull String str) {
        Throwable th;
        String str2 = str;
        if (C0624zzb.zza()) {
            new IllegalStateException(str2);
            throw th;
        }
    }

    @EnsuresNonNull({"#1"})
    @NonNull
    @C0206KeepForSdk
    public static <T> T checkNotNull(@RecentlyNonNull T t, @RecentlyNonNull Object obj) {
        Throwable th;
        T t2 = t;
        Object obj2 = obj;
        if (t2 != null) {
            return t2;
        }
        new NullPointerException(String.valueOf(obj2));
        throw th;
    }

    @C0206KeepForSdk
    public static int checkNotZero(int i, @RecentlyNonNull Object obj) {
        Throwable th;
        int i2 = i;
        Object obj2 = obj;
        if (i2 != 0) {
            return i2;
        }
        new IllegalArgumentException(String.valueOf(obj2));
        throw th;
    }

    @C0206KeepForSdk
    public static void checkState(boolean z, @RecentlyNonNull Object obj) {
        Throwable th;
        Object obj2 = obj;
        if (!z) {
            new IllegalStateException(String.valueOf(obj2));
            throw th;
        }
    }

    @C0206KeepForSdk
    public static void checkArgument(boolean z, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        Throwable th;
        String str2 = str;
        Object[] objArr2 = objArr;
        if (!z) {
            new IllegalArgumentException(String.format(str2, objArr2));
            throw th;
        }
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    @EnsuresNonNull({"#1"})
    public static String checkNotEmpty(@Nullable String str, @RecentlyNonNull Object obj) {
        Throwable th;
        String str2 = str;
        Object obj2 = obj;
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        new IllegalArgumentException(String.valueOf(obj2));
        throw th;
    }

    @C0206KeepForSdk
    public static long checkNotZero(long j) {
        Throwable th;
        long j2 = j;
        if (j2 != 0) {
            return j2;
        }
        new IllegalArgumentException("Given Long is zero");
        throw th;
    }

    @C0206KeepForSdk
    public static void checkState(boolean z, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        Throwable th;
        String str2 = str;
        Object[] objArr2 = objArr;
        if (!z) {
            new IllegalStateException(String.format(str2, objArr2));
            throw th;
        }
    }

    @C0206KeepForSdk
    public static long checkNotZero(long j, @RecentlyNonNull Object obj) {
        Throwable th;
        long j2 = j;
        Object obj2 = obj;
        if (j2 != 0) {
            return j2;
        }
        new IllegalArgumentException(String.valueOf(obj2));
        throw th;
    }

    @C0206KeepForSdk
    public static void checkHandlerThread(@RecentlyNonNull Handler handler, @RecentlyNonNull String str) {
        Throwable th;
        String str2 = str;
        if (Looper.myLooper() != handler.getLooper()) {
            new IllegalStateException(str2);
            throw th;
        }
    }
}
