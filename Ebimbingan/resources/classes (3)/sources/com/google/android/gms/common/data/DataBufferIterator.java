package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class DataBufferIterator<T> implements Iterator<T> {
    @RecentlyNonNull
    protected final DataBuffer<T> zaa;
    protected int zab = -1;

    public DataBufferIterator(@RecentlyNonNull DataBuffer<T> dataBuffer) {
        this.zaa = (DataBuffer) Preconditions.checkNotNull(dataBuffer);
    }

    public final boolean hasNext() {
        return this.zab < this.zaa.getCount() + -1;
    }

    @RecentlyNonNull
    public T next() {
        Throwable th;
        StringBuilder sb;
        if (!hasNext()) {
            int i = this.zab;
            new StringBuilder(46);
            StringBuilder append = sb.append("Cannot advance the iterator beyond ");
            StringBuilder append2 = sb.append(i);
            new NoSuchElementException(sb.toString());
            throw th;
        }
        DataBuffer<T> dataBuffer = this.zaa;
        int i2 = this.zab + 1;
        this.zab = i2;
        return dataBuffer.get(i2);
    }

    public final void remove() {
        Throwable th;
        new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
        throw th;
    }
}
