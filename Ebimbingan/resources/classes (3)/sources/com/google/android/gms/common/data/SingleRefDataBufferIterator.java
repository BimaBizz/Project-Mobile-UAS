package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private T zac;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleRefDataBufferIterator(@RecentlyNonNull DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @RecentlyNonNull
    public final T next() {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        StringBuilder sb2;
        if (!hasNext()) {
            int i = this.zab;
            new StringBuilder(46);
            StringBuilder append = sb2.append("Cannot advance the iterator beyond ");
            StringBuilder append2 = sb2.append(i);
            new NoSuchElementException(sb2.toString());
            throw th2;
        }
        int i2 = this.zab + 1;
        this.zab = i2;
        if (i2 == 0) {
            this.zac = Preconditions.checkNotNull(this.zaa.get(0));
            T t = this.zac;
            if (!(t instanceof DataBufferRef)) {
                String valueOf = String.valueOf(t.getClass());
                new StringBuilder(String.valueOf(valueOf).length() + 44);
                StringBuilder append3 = sb.append("DataBuffer reference of type ");
                StringBuilder append4 = sb.append(valueOf);
                StringBuilder append5 = sb.append(" is not movable");
                new IllegalStateException(sb.toString());
                throw th;
            }
        } else {
            ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}
