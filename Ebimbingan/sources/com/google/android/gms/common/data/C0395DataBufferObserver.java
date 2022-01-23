package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.data.DataBufferObserver */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface C0395DataBufferObserver {

    /* renamed from: com.google.android.gms.common.data.DataBufferObserver$Observable */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface Observable {
        void addObserver(@RecentlyNonNull C0395DataBufferObserver dataBufferObserver);

        void removeObserver(@RecentlyNonNull C0395DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i, int i2);

    void onDataRangeInserted(int i, int i2);

    void onDataRangeMoved(int i, int i2, int i3);

    void onDataRangeRemoved(int i, int i2);
}
