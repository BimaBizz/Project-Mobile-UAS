package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.data.Freezable */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface C0402Freezable<T> {
    @RecentlyNonNull
    T freeze();

    boolean isDataValid();
}
