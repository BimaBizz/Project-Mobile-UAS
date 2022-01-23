package com.google.android.gms.dynamic;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.dynamic.C0662LifecycleDelegate;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.dynamic.OnDelegateCreatedListener */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface C0664OnDelegateCreatedListener<T extends C0662LifecycleDelegate> {
    @C0206KeepForSdk
    void onDelegateCreated(@RecentlyNonNull T t);
}
