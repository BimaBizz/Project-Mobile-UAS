package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class AbstractDataBuffer<T> implements DataBuffer<T> {
    @KeepForSdk
    @RecentlyNullable
    protected final DataHolder mDataHolder;

    @KeepForSdk
    protected AbstractDataBuffer(@Nullable DataHolder dataHolder) {
        this.mDataHolder = dataHolder;
    }

    public final void close() {
        release();
    }

    @RecentlyNonNull
    public abstract T get(int i);

    public int getCount() {
        DataHolder dataHolder = this.mDataHolder;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @RecentlyNullable
    public final Bundle getMetadata() {
        DataHolder dataHolder = this.mDataHolder;
        if (dataHolder == null) {
            return null;
        }
        return dataHolder.getMetadata();
    }

    @Deprecated
    public boolean isClosed() {
        DataHolder dataHolder = this.mDataHolder;
        return dataHolder == null || dataHolder.isClosed();
    }

    @RecentlyNonNull
    public Iterator<T> iterator() {
        Iterator<T> it;
        new DataBufferIterator(this);
        return it;
    }

    public void release() {
        DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @RecentlyNonNull
    public Iterator<T> singleRefIterator() {
        Iterator<T> it;
        new SingleRefDataBufferIterator(this);
        return it;
    }
}
