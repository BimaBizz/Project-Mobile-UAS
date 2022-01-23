package com.google.android.gms.internal.common;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.common.zzr */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C1124zzr<E> extends C1121zzo<E> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1124zzr() {
        super(4);
    }

    public final C1124zzr<E> zzb(E e) {
        C1121zzo zza = super.zza(e);
        return this;
    }

    public final C1124zzr<E> zzc(Iterator<? extends E> it) {
        Iterator<? extends E> it2 = it;
        while (it2.hasNext()) {
            C1121zzo zza = super.zza(it2.next());
        }
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1124zzr(int i) {
        super(4);
        int i2 = i;
    }
}
