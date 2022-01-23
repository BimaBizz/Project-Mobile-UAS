package com.google.android.gms.internal.common;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzr<E> extends zzo<E> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzr() {
        super(4);
    }

    public final zzr<E> zzb(E e) {
        zzo zza = super.zza(e);
        return this;
    }

    public final zzr<E> zzc(Iterator<? extends E> it) {
        Iterator<? extends E> it2 = it;
        while (it2.hasNext()) {
            zzo zza = super.zza(it2.next());
        }
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzr(int i) {
        super(4);
        int i2 = i;
    }
}
