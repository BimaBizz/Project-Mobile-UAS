package com.google.android.gms.internal.firebase_auth;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzhb extends zzgb<Double> implements zzhz<Double>, zzjl, RandomAccess {
    private static final zzhb zzwy;
    private int size;
    private double[] zzwz;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    zzhb() {
        this(new double[10], 0);
    }

    private zzhb(double[] dArr, int i) {
        this.zzwz = dArr;
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
        System.arraycopy(this.zzwz, i4, this.zzwz, i3, this.size - i4);
        this.size -= i4 - i3;
        this.modCount++;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r1 = r10
            r2 = r11
            r6 = r1
            r7 = r2
            if (r6 != r7) goto L_0x0009
            r6 = 1
            r1 = r6
        L_0x0008:
            return r1
        L_0x0009:
            r6 = r2
            boolean r6 = r6 instanceof com.google.android.gms.internal.firebase_auth.zzhb
            if (r6 != 0) goto L_0x0016
            r6 = r1
            r7 = r2
            boolean r6 = super.equals(r7)
            r1 = r6
            goto L_0x0008
        L_0x0016:
            r6 = r2
            com.google.android.gms.internal.firebase_auth.zzhb r6 = (com.google.android.gms.internal.firebase_auth.zzhb) r6
            r3 = r6
            r6 = r1
            int r6 = r6.size
            r7 = r3
            int r7 = r7.size
            if (r6 == r7) goto L_0x0025
            r6 = 0
            r1 = r6
            goto L_0x0008
        L_0x0025:
            r6 = r3
            double[] r6 = r6.zzwz
            r4 = r6
            r6 = 0
            r5 = r6
        L_0x002b:
            r6 = r5
            r7 = r1
            int r7 = r7.size
            if (r6 >= r7) goto L_0x004d
            r6 = r1
            double[] r6 = r6.zzwz
            r7 = r5
            r6 = r6[r7]
            long r6 = java.lang.Double.doubleToLongBits(r6)
            r8 = r4
            r9 = r5
            r8 = r8[r9]
            long r8 = java.lang.Double.doubleToLongBits(r8)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x004a
            r6 = 0
            r1 = r6
            goto L_0x0008
        L_0x004a:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x004d:
            r6 = 1
            r1 = r6
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzhb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzht.zzk(Double.doubleToLongBits(this.zzwz[i2]));
        }
        return i;
    }

    public final int size() {
        return this.size;
    }

    public final void zzc(double d) {
        zzc(this.size, d);
    }

    private final void zzc(int i, double d) {
        Throwable th;
        int i2 = i;
        double d2 = d;
        zzfz();
        if (i2 < 0 || i2 > this.size) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zzn(i2));
            throw th2;
        }
        if (this.size < this.zzwz.length) {
            System.arraycopy(this.zzwz, i2, this.zzwz, i2 + 1, this.size - i2);
        } else {
            double[] dArr = new double[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.zzwz, 0, dArr, 0, i2);
            System.arraycopy(this.zzwz, i2, dArr, i2 + 1, this.size - i2);
            this.zzwz = dArr;
        }
        this.zzwz[i2] = d2;
        this.size++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        Throwable th;
        Collection<? extends Double> collection2 = collection;
        zzfz();
        Object checkNotNull = zzht.checkNotNull(collection2);
        if (!(collection2 instanceof zzhb)) {
            return super.addAll(collection2);
        }
        zzhb zzhb = (zzhb) collection2;
        zzhb zzhb2 = zzhb;
        if (zzhb.size == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.size < zzhb2.size) {
            Throwable th2 = th;
            new OutOfMemoryError();
            throw th2;
        }
        int i = this.size + zzhb2.size;
        int i2 = i;
        if (i > this.zzwz.length) {
            this.zzwz = Arrays.copyOf(this.zzwz, i2);
        }
        System.arraycopy(zzhb2.zzwz, 0, this.zzwz, this.size, zzhb2.size);
        this.size = i2;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        Object obj2 = obj;
        zzfz();
        for (int i = 0; i < this.size; i++) {
            if (obj2.equals(Double.valueOf(this.zzwz[i]))) {
                System.arraycopy(this.zzwz, i + 1, this.zzwz, i, (this.size - i) - 1);
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
        Double d = (Double) obj;
        Double d2 = d;
        double doubleValue = d.doubleValue();
        zzfz();
        zzm(i2);
        double d3 = this.zzwz[i2];
        this.zzwz[i2] = doubleValue;
        return Double.valueOf(d3);
    }

    public final /* synthetic */ Object remove(int i) {
        int i2 = i;
        zzfz();
        zzm(i2);
        double d = this.zzwz[i2];
        if (i2 < this.size - 1) {
            System.arraycopy(this.zzwz, i2 + 1, this.zzwz, i2, (this.size - i2) - 1);
        }
        this.size--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzc(i, ((Double) obj).doubleValue());
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
        new zzhb(Arrays.copyOf(this.zzwz, i2), this.size);
        return zzhz;
    }

    public final /* synthetic */ Object get(int i) {
        int i2 = i;
        zzm(i2);
        return Double.valueOf(this.zzwz[i2]);
    }

    static {
        zzhb zzhb;
        new zzhb(new double[0], 0);
        zzhb zzhb2 = zzhb;
        zzwy = zzhb2;
        zzhb2.zzfy();
    }
}
