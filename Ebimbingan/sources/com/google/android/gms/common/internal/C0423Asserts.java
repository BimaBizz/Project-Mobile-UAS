package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.Asserts */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0423Asserts {
    private C0423Asserts() {
        Throwable th;
        new AssertionError("Uninstantiable");
        throw th;
    }

    @C0206KeepForSdk
    public static void checkMainThread(@RecentlyNonNull String str) {
        StringBuilder sb;
        Throwable th;
        String str2 = str;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            StringBuilder append = sb.append("checkMainThread: current thread ");
            StringBuilder append2 = sb.append(valueOf);
            StringBuilder append3 = sb.append(" IS NOT the main thread ");
            StringBuilder append4 = sb.append(valueOf2);
            StringBuilder append5 = sb.append("!");
            int e = Log.e("Asserts", sb.toString());
            new IllegalStateException(str2);
            throw th;
        }
    }

    @C0206KeepForSdk
    public static void checkNotMainThread(@RecentlyNonNull String str) {
        StringBuilder sb;
        Throwable th;
        String str2 = str;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length());
            StringBuilder append = sb.append("checkNotMainThread: current thread ");
            StringBuilder append2 = sb.append(valueOf);
            StringBuilder append3 = sb.append(" IS the main thread ");
            StringBuilder append4 = sb.append(valueOf2);
            StringBuilder append5 = sb.append("!");
            int e = Log.e("Asserts", sb.toString());
            new IllegalStateException(str2);
            throw th;
        }
    }

    @C0206KeepForSdk
    public static void checkNotNull(@RecentlyNonNull Object obj) {
        Throwable th;
        if (obj == null) {
            new IllegalArgumentException("null reference");
            throw th;
        }
    }

    @C0206KeepForSdk
    public static void checkNull(@RecentlyNonNull Object obj) {
        Throwable th;
        if (obj != null) {
            new IllegalArgumentException("non-null reference");
            throw th;
        }
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
    public static void checkNotNull(@RecentlyNonNull Object obj, @RecentlyNonNull Object obj2) {
        Throwable th;
        Object obj3 = obj2;
        if (obj == null) {
            new IllegalArgumentException(String.valueOf(obj3));
            throw th;
        }
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
}
