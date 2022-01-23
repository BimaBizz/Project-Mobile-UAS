package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0227Releasable;
import java.io.Closeable;
import java.util.Iterator;

/* renamed from: com.google.android.gms.common.data.DataBuffer */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface C0393DataBuffer<T> extends Iterable<T>, C0227Releasable, Closeable {
    void close();

    @RecentlyNonNull
    T get(int i);

    int getCount();

    @C0206KeepForSdk
    @RecentlyNullable
    Bundle getMetadata();

    @Deprecated
    boolean isClosed();

    @RecentlyNonNull
    Iterator<T> iterator();

    void release();

    @RecentlyNonNull
    Iterator<T> singleRefIterator();
}
