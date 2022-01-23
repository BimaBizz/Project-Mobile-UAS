package com.google.android.gms.internal.firebase_auth;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzhu extends zzgb<Integer> implements zzhx, zzjl, RandomAccess {
    private static final zzhu zzabd;
    private int size;
    private int[] zzabe;

    public static zzhu zziq() {
        return zzabd;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    zzhu() {
        this(new int[10], 0);
    }

    private zzhu(int[] iArr, int i) {
        this.zzabe = iArr;
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
        System.arraycopy(this.zzabe, i4, this.zzabe, i3, this.size - i4);
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
            boolean r5 = r5 instanceof com.google.android.gms.internal.firebase_auth.zzhu
            if (r5 != 0) goto L_0x0016
            r5 = r0
            r6 = r1
            boolean r5 = super.equals(r6)
            r0 = r5
            goto L_0x0008
        L_0x0016:
            r5 = r1
            com.google.android.gms.internal.firebase_auth.zzhu r5 = (com.google.android.gms.internal.firebase_auth.zzhu) r5
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
            int[] r5 = r5.zzabe
            r3 = r5
            r5 = 0
            r4 = r5
        L_0x002b:
            r5 = r4
            r6 = r0
            int r6 = r6.size
            if (r5 >= r6) goto L_0x0043
            r5 = r0
            int[] r5 = r5.zzabe
            r6 = r4
            r5 = r5[r6]
            r6 = r3
            r7 = r4
            r6 = r6[r7]
            if (r5 == r6) goto L_0x0040
            r5 = 0
            r0 = r5
            goto L_0x0008
        L_0x0040:
            int r4 = r4 + 1
            goto L_0x002b
        L_0x0043:
            r5 = 1
            r0 = r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzhu.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzabe[i2];
        }
        return i;
    }

    /* renamed from: zzav */
    public final zzhx zzo(int i) {
        zzhx zzhx;
        Throwable th;
        int i2 = i;
        if (i2 < this.size) {
            Throwable th2 = th;
            new IllegalArgumentException();
            throw th2;
        }
        new zzhu(Arrays.copyOf(this.zzabe, i2), this.size);
        return zzhx;
    }

    public final int getInt(int i) {
        int i2 = i;
        zzm(i2);
        return this.zzabe[i2];
    }

    public final int size() {
        return this.size;
    }

    public final void zzaw(int i) {
        zzr(this.size, i);
    }

    private final void zzr(int i, int i2) {
        Throwable th;
        int i3 = i;
        int i4 = i2;
        zzfz();
        if (i3 < 0 || i3 > this.size) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zzn(i3));
            throw th2;
        }
        if (this.size < this.zzabe.length) {
            System.arraycopy(this.zzabe, i3, this.zzabe, i3 + 1, this.size - i3);
        } else {
            int[] iArr = new int[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.zzabe, 0, iArr, 0, i3);
            System.arraycopy(this.zzabe, i3, iArr, i3 + 1, this.size - i3);
            this.zzabe = iArr;
        }
        this.zzabe[i3] = i4;
        this.size++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        Throwable th;
        Collection<? extends Integer> collection2 = collection;
        zzfz();
        Object checkNotNull = zzht.checkNotNull(collection2);
        if (!(collection2 instanceof zzhu)) {
            return super.addAll(collection2);
        }
        zzhu zzhu = (zzhu) collection2;
        zzhu zzhu2 = zzhu;
        if (zzhu.size == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.size < zzhu2.size) {
            Throwable th2 = th;
            new OutOfMemoryError();
            throw th2;
        }
        int i = this.size + zzhu2.size;
        int i2 = i;
        if (i > this.zzabe.length) {
            this.zzabe = Arrays.copyOf(this.zzabe, i2);
        }
        System.arraycopy(zzhu2.zzabe, 0, this.zzabe, this.size, zzhu2.size);
        this.size = i2;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        Object obj2 = obj;
        zzfz();
        for (int i = 0; i < this.size; i++) {
            if (obj2.equals(Integer.valueOf(this.zzabe[i]))) {
                System.arraycopy(this.zzabe, i + 1, this.zzabe, i, (this.size - i) - 1);
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
        Integer num = (Integer) obj;
        Integer num2 = num;
        int intValue = num.intValue();
        zzfz();
        zzm(i2);
        int i3 = this.zzabe[i2];
        this.zzabe[i2] = intValue;
        return Integer.valueOf(i3);
    }

    public final /* synthetic */ Object remove(int i) {
        int i2 = i;
        zzfz();
        zzm(i2);
        int i3 = this.zzabe[i2];
        if (i2 < this.size - 1) {
            System.arraycopy(this.zzabe, i2 + 1, this.zzabe, i2, (this.size - i2) - 1);
        }
        this.size--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzr(i, ((Integer) obj).intValue());
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    static {
        zzhu zzhu;
        new zzhu(new int[0], 0);
        zzhu zzhu2 = zzhu;
        zzabd = zzhu2;
        zzhu2.zzfy();
    }
}
