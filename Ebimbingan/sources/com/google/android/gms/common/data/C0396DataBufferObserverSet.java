package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.data.C0395DataBufferObserver;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.common.data.DataBufferObserverSet */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0396DataBufferObserverSet implements C0395DataBufferObserver, C0395DataBufferObserver.Observable {
    private HashSet<C0395DataBufferObserver> zaa;

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0396DataBufferObserverSet() {
        /*
            r4 = this;
            r0 = r4
            r2 = r0
            r2.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            r2.zaa = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.C0396DataBufferObserverSet.<init>():void");
    }

    public void addObserver(@RecentlyNonNull C0395DataBufferObserver dataBufferObserver) {
        boolean add = this.zaa.add(dataBufferObserver);
    }

    public void clear() {
        this.zaa.clear();
    }

    public boolean hasObservers() {
        return !this.zaa.isEmpty();
    }

    public void onDataChanged() {
        Iterator<C0395DataBufferObserver> it = this.zaa.iterator();
        while (it.hasNext()) {
            it.next().onDataChanged();
        }
    }

    public void onDataRangeChanged(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        Iterator<C0395DataBufferObserver> it = this.zaa.iterator();
        while (it.hasNext()) {
            it.next().onDataRangeChanged(i3, i4);
        }
    }

    public void onDataRangeInserted(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        Iterator<C0395DataBufferObserver> it = this.zaa.iterator();
        while (it.hasNext()) {
            it.next().onDataRangeInserted(i3, i4);
        }
    }

    public void onDataRangeMoved(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        Iterator<C0395DataBufferObserver> it = this.zaa.iterator();
        while (it.hasNext()) {
            it.next().onDataRangeMoved(i4, i5, i6);
        }
    }

    public void onDataRangeRemoved(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        Iterator<C0395DataBufferObserver> it = this.zaa.iterator();
        while (it.hasNext()) {
            it.next().onDataRangeRemoved(i3, i4);
        }
    }

    public void removeObserver(@RecentlyNonNull C0395DataBufferObserver dataBufferObserver) {
        boolean remove = this.zaa.remove(dataBufferObserver);
    }
}
