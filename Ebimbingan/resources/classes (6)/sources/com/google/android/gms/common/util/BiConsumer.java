package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface BiConsumer<T, U> {
    @KeepForSdk
    void accept(@RecentlyNonNull T t, @RecentlyNonNull U u);
}
