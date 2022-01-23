package com.google.android.gms.internal.firebase_auth;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zziq extends zzgb<Long> implements zzhz<Long>, zzjl, RandomAccess {
    private static final zziq zzach;
    private int size;
    private long[] zzaci;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    zziq() {
        this(new long[10], 0);
    }

    private zziq(long[] jArr, int i) {
        this.zzaci = jArr;
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
        System.arraycopy(this.zzaci, i4, this.zzaci, i3, this.size - i4);
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
            boolean r6 = r6 instanceof com.google.android.gms.internal.firebase_auth.zziq
            if (r6 != 0) goto L_0x0016
            r6 = r1
            r7 = r2
            boolean r6 = super.equals(r7)
            r1 = r6
            goto L_0x0008
        L_0x0016:
            r6 = r2
            com.google.android.gms.internal.firebase_auth.zziq r6 = (com.google.android.gms.internal.firebase_auth.zziq) r6
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
            long[] r6 = r6.zzaci
            r4 = r6
            r6 = 0
            r5 = r6
        L_0x002b:
            r6 = r5
            r7 = r1
            int r7 = r7.size
            if (r6 >= r7) goto L_0x0045
            r6 = r1
            long[] r6 = r6.zzaci
            r7 = r5
            r6 = r6[r7]
            r8 = r4
            r9 = r5
            r8 = r8[r9]
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x0042
            r6 = 0
            r1 = r6
            goto L_0x0008
        L_0x0042:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x0045:
            r6 = 1
            r1 = r6
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zziq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzht.zzk(this.zzaci[i2]);
        }
        return i;
    }

    public final long getLong(int i) {
        int i2 = i;
        zzm(i2);
        return this.zzaci[i2];
    }

    public final int size() {
        return this.size;
    }

    public final void zzl(long j) {
        zzk(this.size, j);
    }

    private final void zzk(int i, long j) {
        Throwable th;
        int i2 = i;
        long j2 = j;
        zzfz();
        if (i2 < 0 || i2 > this.size) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zzn(i2));
            throw th2;
        }
        if (this.size < this.zzaci.length) {
            System.arraycopy(this.zzaci, i2, this.zzaci, i2 + 1, this.size - i2);
        } else {
            long[] jArr = new long[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.zzaci, 0, jArr, 0, i2);
            System.arraycopy(this.zzaci, i2, jArr, i2 + 1, this.size - i2);
            this.zzaci = jArr;
        }
        this.zzaci[i2] = j2;
        this.size++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        Throwable th;
        Collection<? extends Long> collection2 = collection;
        zzfz();
        Object checkNotNull = zzht.checkNotNull(collection2);
        if (!(collection2 instanceof zziq)) {
            return super.addAll(collection2);
        }
        zziq zziq = (zziq) collection2;
        zziq zziq2 = zziq;
        if (zziq.size == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.size < zziq2.size) {
            Throwable th2 = th;
            new OutOfMemoryError();
            throw th2;
        }
        int i = this.size + zziq2.size;
        int i2 = i;
        if (i > this.zzaci.length) {
            this.zzaci = Arrays.copyOf(this.zzaci, i2);
        }
        System.arraycopy(zziq2.zzaci, 0, this.zzaci, this.size, zziq2.size);
        this.size = i2;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        Object obj2 = obj;
        zzfz();
        for (int i = 0; i < this.size; i++) {
            if (obj2.equals(Long.valueOf(this.zzaci[i]))) {
                System.arraycopy(this.zzaci, i + 1, this.zzaci, i, (this.size - i) - 1);
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
        Long l = (Long) obj;
        Long l2 = l;
        long longValue = l.longValue();
        zzfz();
        zzm(i2);
        long j = this.zzaci[i2];
        this.zzaci[i2] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        int i2 = i;
        zzfz();
        zzm(i2);
        long j = this.zzaci[i2];
        if (i2 < this.size - 1) {
            System.arraycopy(this.zzaci, i2 + 1, this.zzaci, i2, (this.size - i2) - 1);
        }
        this.size--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzk(i, ((Long) obj).longValue());
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
        new zziq(Arrays.copyOf(this.zzaci, i2), this.size);
        return zzhz;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    static {
        zziq zziq;
        new zziq(new long[0], 0);
        zziq zziq2 = zziq;
        zzach = zziq2;
        zziq2.zzfy();
    }
}
