package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.LifecycleFragment */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface C0253LifecycleFragment {
    @C0206KeepForSdk
    void addCallback(@RecentlyNonNull String str, @RecentlyNonNull C0252LifecycleCallback lifecycleCallback);

    @C0206KeepForSdk
    @RecentlyNullable
    <T extends C0252LifecycleCallback> T getCallbackOrNull(@RecentlyNonNull String str, @RecentlyNonNull Class<T> cls);

    @RecentlyNonNull
    @C0206KeepForSdk
    Activity getLifecycleActivity();

    @C0206KeepForSdk
    boolean isCreated();

    @C0206KeepForSdk
    boolean isStarted();

    @C0206KeepForSdk
    void startActivityForResult(@RecentlyNonNull Intent intent, int i);
}
