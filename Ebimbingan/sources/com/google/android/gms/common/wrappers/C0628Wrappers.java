package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.util.C0617VisibleForTesting;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.wrappers.Wrappers */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0628Wrappers {
    private static C0628Wrappers zzb;
    @Nullable
    private C0627PackageManagerWrapper zza = null;

    static {
        C0628Wrappers wrappers;
        new C0628Wrappers();
        zzb = wrappers;
    }

    public C0628Wrappers() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0627PackageManagerWrapper packageManager(@RecentlyNonNull Context context) {
        return zzb.zza(context);
    }

    @RecentlyNonNull
    @C0617VisibleForTesting
    public final synchronized C0627PackageManagerWrapper zza(@RecentlyNonNull Context context) {
        C0627PackageManagerWrapper packageManagerWrapper;
        C0627PackageManagerWrapper packageManagerWrapper2;
        Context context2 = context;
        synchronized (this) {
            if (this.zza == null) {
                if (context2.getApplicationContext() != null) {
                    context2 = context2.getApplicationContext();
                }
                new C0627PackageManagerWrapper(context2);
                this.zza = packageManagerWrapper2;
            }
            packageManagerWrapper = this.zza;
        }
        return packageManagerWrapper;
    }
}
