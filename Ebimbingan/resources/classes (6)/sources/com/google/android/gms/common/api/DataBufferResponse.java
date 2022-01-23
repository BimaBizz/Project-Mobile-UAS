package com.google.android.gms.common.api;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    @KeepForSdk
    public DataBufferResponse() {
    }

    public final void close() {
        ((AbstractDataBuffer) getResult()).close();
    }

    @RecentlyNonNull
    public final T get(int i) {
        return ((AbstractDataBuffer) getResult()).get(i);
    }

    public final int getCount() {
        return ((AbstractDataBuffer) getResult()).getCount();
    }

    @RecentlyNullable
    public final Bundle getMetadata() {
        return ((AbstractDataBuffer) getResult()).getMetadata();
    }

    public final boolean isClosed() {
        return ((AbstractDataBuffer) getResult()).isClosed();
    }

    @RecentlyNonNull
    public final Iterator<T> iterator() {
        return ((AbstractDataBuffer) getResult()).iterator();
    }

    public final void release() {
        ((AbstractDataBuffer) getResult()).release();
    }

    @RecentlyNonNull
    public final Iterator<T> singleRefIterator() {
        return ((AbstractDataBuffer) getResult()).singleRefIterator();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    public DataBufferResponse(@RecentlyNonNull R r) {
        super(r);
    }
}
