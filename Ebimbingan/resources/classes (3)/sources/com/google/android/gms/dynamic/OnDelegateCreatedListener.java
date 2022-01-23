package com.google.android.gms.dynamic;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.LifecycleDelegate;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface OnDelegateCreatedListener<T extends LifecycleDelegate> {
    @KeepForSdk
    void onDelegateCreated(@RecentlyNonNull T t);
}
