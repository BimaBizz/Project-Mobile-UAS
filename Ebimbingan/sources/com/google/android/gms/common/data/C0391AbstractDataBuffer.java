package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import java.util.Iterator;

/* renamed from: com.google.android.gms.common.data.AbstractDataBuffer */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0391AbstractDataBuffer<T> implements C0393DataBuffer<T> {
    @C0206KeepForSdk
    @RecentlyNullable
    protected final C0400DataHolder mDataHolder;

    @C0206KeepForSdk
    protected C0391AbstractDataBuffer(@Nullable C0400DataHolder dataHolder) {
        this.mDataHolder = dataHolder;
    }

    public final void close() {
        release();
    }

    @RecentlyNonNull
    public abstract T get(int i);

    public int getCount() {
        C0400DataHolder dataHolder = this.mDataHolder;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @RecentlyNullable
    public final Bundle getMetadata() {
        C0400DataHolder dataHolder = this.mDataHolder;
        if (dataHolder == null) {
            return null;
        }
        return dataHolder.getMetadata();
    }

    @Deprecated
    public boolean isClosed() {
        C0400DataHolder dataHolder = this.mDataHolder;
        return dataHolder == null || dataHolder.isClosed();
    }

    @RecentlyNonNull
    public Iterator<T> iterator() {
        Iterator<T> it;
        new C0394DataBufferIterator(this);
        return it;
    }

    public void release() {
        C0400DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @RecentlyNonNull
    public Iterator<T> singleRefIterator() {
        Iterator<T> it;
        new C0404SingleRefDataBufferIterator(this);
        return it;
    }
}
