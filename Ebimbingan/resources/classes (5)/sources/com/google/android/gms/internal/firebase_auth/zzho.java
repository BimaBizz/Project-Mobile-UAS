package com.google.android.gms.internal.firebase_auth;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzho extends zzgb<Float> implements zzhz<Float>, zzjl, RandomAccess {
    private static final zzho zzzw;
    private int size;
    private float[] zzzx;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    zzho() {
        this(new float[10], 0);
    }

    private zzho(float[] fArr, int i) {
        this.zzzx = fArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        Throwable th;
        int i3 = i;
        int i4 = i2;
        zzfz();
        if (i4 < i3) {
            Throwable th2 = th;
            new IndexOutOfBoundsException("toIndex < fromIndex");
            throw th2;
        }
        System.arraycopy(this.zzzx, i4, this.zzzx, i3, this.size - i4);
        this.size -= i4 - i3;
        this.modCount++;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r5 = r0
            r6 = r1
            if (r5 != r6) goto L_0x0009
            r5 = 1
            r0 = r5
        L_0x0008:
            return r0
        L_0x0009:
            r5 = r1
            boolean r5 = r5 instanceof com.google.android.gms.internal.firebase_auth.zzho
            if (r5 != 0) goto L_0x0016
            r5 = r0
            r6 = r1
            boolean r5 = super.equals(r6)
            r0 = r5
            goto L_0x0008
        L_0x0016:
            r5 = r1
            com.google.android.gms.internal.firebase_auth.zzho r5 = (com.google.android.gms.internal.firebase_auth.zzho) r5
            r2 = r5
            r5 = r0
            int r5 = r5.size
            r6 = r2
            int r6 = r6.size
            if (r5 == r6) goto L_0x0025
            r5 = 0
            r0 = r5
            goto L_0x0008
        L_0x0025:
            r5 = r2
            float[] r5 = r5.zzzx
            r3 = r5
            r5 = 0
            r4 = r5
        L_0x002b:
            r5 = r4
            r6 = r0
            int r6 = r6.size
            if (r5 >= r6) goto L_0x004b
            r5 = r0
            float[] r5 = r5.zzzx
            r6 = r4
            r5 = r5[r6]
            int r5 = java.lang.Float.floatToIntBits(r5)
            r6 = r3
            r7 = r4
            r6 = r6[r7]
            int r6 = java.lang.Float.floatToIntBits(r6)
            if (r5 == r6) goto L_0x0048
            r5 = 0
            r0 = r5
            goto L_0x0008
        L_0x0048:
            int r4 = r4 + 1
            goto L_0x002b
        L_0x004b:
            r5 = 1
            r0 = r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzho.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zzzx[i2]);
        }
        return i;
    }

    public final int size() {
        return this.size;
    }

    public final void zzc(float f) {
        zzc(this.size, f);
    }

    private final void zzc(int i, float f) {
        Throwable th;
        int i2 = i;
        float f2 = f;
        zzfz();
        if (i2 < 0 || i2 > this.size) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zzn(i2));
            throw th2;
        }
        if (this.size < this.zzzx.length) {
            System.arraycopy(this.zzzx, i2, this.zzzx, i2 + 1, this.size - i2);
        } else {
            float[] fArr = new float[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.zzzx, 0, fArr, 0, i2);
            System.arraycopy(this.zzzx, i2, fArr, i2 + 1, this.size - i2);
            this.zzzx = fArr;
        }
        this.zzzx[i2] = f2;
        this.size++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        Throwable th;
        Collection<? extends Float> collection2 = collection;
        zzfz();
        Object checkNotNull = zzht.checkNotNull(collection2);
        if (!(collection2 instanceof zzho)) {
            return super.addAll(collection2);
        }
        zzho zzho = (zzho) collection2;
        zzho zzho2 = zzho;
        if (zzho.size == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.size < zzho2.size) {
            Throwable th2 = th;
            new OutOfMemoryError();
            throw th2;
        }
        int i = this.size + zzho2.size;
        int i2 = i;
        if (i > this.zzzx.length) {
            this.zzzx = Arrays.copyOf(this.zzzx, i2);
        }
        System.arraycopy(zzho2.zzzx, 0, this.zzzx, this.size, zzho2.size);
        this.size = i2;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        Object obj2 = obj;
        zzfz();
        for (int i = 0; i < this.size; i++) {
            if (obj2.equals(Float.valueOf(this.zzzx[i]))) {
                System.arraycopy(this.zzzx, i + 1, this.zzzx, i, (this.size - i) - 1);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zzm(int i) {
        Throwable th;
        int i2 = i;
        if (i2 < 0 || i2 >= this.size) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zzn(i2));
            throw th2;
        }
    }

    private final String zzn(int i) {
        StringBuilder sb;
        int i2 = this.size;
        new StringBuilder(35);
        return sb.append("Index:").append(i).append(", Size:").append(i2).toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int i2 = i;
        Float f = (Float) obj;
        Float f2 = f;
        float floatValue = f.floatValue();
        zzfz();
        zzm(i2);
        float f3 = this.zzzx[i2];
        this.zzzx[i2] = floatValue;
        return Float.valueOf(f3);
    }

    public final /* synthetic */ Object remove(int i) {
        int i2 = i;
        zzfz();
        zzm(i2);
        float f = this.zzzx[i2];
        if (i2 < this.size - 1) {
            System.arraycopy(this.zzzx, i2 + 1, this.zzzx, i2, (this.size - i2) - 1);
        }
        this.size--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzc(i, ((Float) obj).floatValue());
    }

    public final /* synthetic */ zzhz zzo(int i) {
        zzhz zzhz;
        Throwable th;
        int i2 = i;
        if (i2 < this.size) {
            Throwable th2 = th;
            new IllegalArgumentException();
            throw th2;
        }
        new zzho(Arrays.copyOf(this.zzzx, i2), this.size);
        return zzhz;
    }

    public final /* synthetic */ Object get(int i) {
        int i2 = i;
        zzm(i2);
        return Float.valueOf(this.zzzx[i2]);
    }

    static {
        zzho zzho;
        new zzho(new float[0], 0);
        zzho zzho2 = zzho;
        zzzw = zzho2;
        zzho2.zzfy();
    }
}
