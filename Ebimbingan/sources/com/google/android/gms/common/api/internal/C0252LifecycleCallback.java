package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.LifecycleCallback */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0252LifecycleCallback {
    @RecentlyNonNull
    @C0206KeepForSdk
    protected final C0253LifecycleFragment mLifecycleFragment;

    @C0206KeepForSdk
    protected C0252LifecycleCallback(@RecentlyNonNull C0253LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    @Keep
    private static C0253LifecycleFragment getChimeraLifecycleFragmentImpl(C0251LifecycleActivity lifecycleActivity) {
        Throwable th;
        C0251LifecycleActivity lifecycleActivity2 = lifecycleActivity;
        new IllegalStateException("Method not available in SDK.");
        throw th;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0253LifecycleFragment getFragment(@RecentlyNonNull Activity activity) {
        C0251LifecycleActivity lifecycleActivity;
        new C0251LifecycleActivity(activity);
        return getFragment(lifecycleActivity);
    }

    @MainThread
    @C0206KeepForSdk
    public void dump(@RecentlyNonNull String str, @RecentlyNonNull FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @RecentlyNonNull String[] strArr) {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public Activity getActivity() {
        return this.mLifecycleFragment.getLifecycleActivity();
    }

    @MainThread
    @C0206KeepForSdk
    public void onActivityResult(int i, int i2, @RecentlyNonNull Intent intent) {
    }

    @MainThread
    @C0206KeepForSdk
    public void onCreate(@Nullable Bundle bundle) {
    }

    @MainThread
    @C0206KeepForSdk
    public void onDestroy() {
    }

    @MainThread
    @C0206KeepForSdk
    public void onResume() {
    }

    @MainThread
    @C0206KeepForSdk
    public void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
    }

    @MainThread
    @C0206KeepForSdk
    public void onStart() {
    }

    @MainThread
    @C0206KeepForSdk
    public void onStop() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0253LifecycleFragment getFragment(@RecentlyNonNull ContextWrapper contextWrapper) {
        Throwable th;
        ContextWrapper contextWrapper2 = contextWrapper;
        new UnsupportedOperationException();
        throw th;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    protected static C0253LifecycleFragment getFragment(@RecentlyNonNull C0251LifecycleActivity lifecycleActivity) {
        Throwable th;
        C0251LifecycleActivity lifecycleActivity2 = lifecycleActivity;
        if (lifecycleActivity2.isSupport()) {
            return C0375zzd.zza(lifecycleActivity2.asFragmentActivity());
        }
        if (lifecycleActivity2.zza()) {
            return C0373zzb.zza(lifecycleActivity2.asActivity());
        }
        new IllegalArgumentException("Can't get fragment for unexpected activity.");
        throw th;
    }
}
