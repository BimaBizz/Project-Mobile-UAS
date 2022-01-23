package com.google.android.gms.internal.common;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
class zzo<E> extends zzp<E> {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzo(int i) {
        int i2 = i;
    }

    private final void zzb(int i) {
        int i2;
        int i3 = i;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i3) {
            int i4 = length + (length >> 1) + 1;
            if (i4 < i3) {
                int highestOneBit = Integer.highestOneBit(i3 - 1);
                i2 = highestOneBit + highestOneBit;
            } else {
                i2 = i4;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i2);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    public final zzo<E> zza(E e) {
        E e2 = e;
        if (e2 == null) {
            throw null;
        }
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = e2;
        return this;
    }
}
