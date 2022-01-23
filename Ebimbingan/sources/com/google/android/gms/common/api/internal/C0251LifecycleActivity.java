package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.LifecycleActivity */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0251LifecycleActivity {
    private final Object zza;

    public C0251LifecycleActivity(@RecentlyNonNull Activity activity) {
        Activity activity2 = activity;
        Object checkNotNull = C0446Preconditions.checkNotNull(activity2, "Activity must not be null");
        this.zza = activity2;
    }

    @NonNull
    @C0206KeepForSdk
    public Activity asActivity() {
        return (Activity) this.zza;
    }

    @NonNull
    @C0206KeepForSdk
    public FragmentActivity asFragmentActivity() {
        return (FragmentActivity) this.zza;
    }

    @NonNull
    @C0206KeepForSdk
    public Object asObject() {
        return this.zza;
    }

    @C0206KeepForSdk
    public boolean isChimera() {
        return false;
    }

    @C0206KeepForSdk
    public boolean isSupport() {
        return this.zza instanceof FragmentActivity;
    }

    public final boolean zza() {
        return this.zza instanceof Activity;
    }

    @C0206KeepForSdk
    public C0251LifecycleActivity(@RecentlyNonNull ContextWrapper contextWrapper) {
        Throwable th;
        ContextWrapper contextWrapper2 = contextWrapper;
        new UnsupportedOperationException();
        throw th;
    }
}
