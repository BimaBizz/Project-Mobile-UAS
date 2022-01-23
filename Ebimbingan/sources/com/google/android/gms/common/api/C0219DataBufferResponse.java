package com.google.android.gms.common.api;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.data.C0391AbstractDataBuffer;
import com.google.android.gms.common.data.C0393DataBuffer;
import java.util.Iterator;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.DataBufferResponse */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0219DataBufferResponse<T, R extends C0391AbstractDataBuffer<T> & C0231Result> extends C0230Response<R> implements C0393DataBuffer<T> {
    @C0206KeepForSdk
    public C0219DataBufferResponse() {
    }

    public final void close() {
        ((C0391AbstractDataBuffer) getResult()).close();
    }

    @RecentlyNonNull
    public final T get(int i) {
        return ((C0391AbstractDataBuffer) getResult()).get(i);
    }

    public final int getCount() {
        return ((C0391AbstractDataBuffer) getResult()).getCount();
    }

    @RecentlyNullable
    public final Bundle getMetadata() {
        return ((C0391AbstractDataBuffer) getResult()).getMetadata();
    }

    public final boolean isClosed() {
        return ((C0391AbstractDataBuffer) getResult()).isClosed();
    }

    @RecentlyNonNull
    public final Iterator<T> iterator() {
        return ((C0391AbstractDataBuffer) getResult()).iterator();
    }

    public final void release() {
        ((C0391AbstractDataBuffer) getResult()).release();
    }

    @RecentlyNonNull
    public final Iterator<T> singleRefIterator() {
        return ((C0391AbstractDataBuffer) getResult()).singleRefIterator();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C0206KeepForSdk
    public C0219DataBufferResponse(@RecentlyNonNull R r) {
        super(r);
    }
}
