package com.google.android.gms.internal.firebase_auth;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzgd extends zzgb<Boolean> implements zzhz<Boolean>, zzjl, RandomAccess {
    private static final zzgd zzvr;
    private int size;
    private boolean[] zzvs;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    zzgd() {
        this(new boolean[10], 0);
    }

    private zzgd(boolean[] zArr, int i) {
        this.zzvs = zArr;
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
        System.arraycopy(this.zzvs, i4, this.zzvs, i3, this.size - i4);
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
            boolean r5 = r5 instanceof com.google.android.gms.internal.firebase_auth.zzgd
            if (r5 != 0) goto L_0x0016
            r5 = r0
            r6 = r1
            boolean r5 = super.equals(r6)
            r0 = r5
            goto L_0x0008
        L_0x0016:
            r5 = r1
            com.google.android.gms.internal.firebase_auth.zzgd r5 = (com.google.android.gms.internal.firebase_auth.zzgd) r5
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
            boolean[] r5 = r5.zzvs
            r3 = r5
            r5 = 0
            r4 = r5
        L_0x002b:
            r5 = r4
            r6 = r0
            int r6 = r6.size
            if (r5 >= r6) goto L_0x0043
            r5 = r0
            boolean[] r5 = r5.zzvs
            r6 = r4
            boolean r5 = r5[r6]
            r6 = r3
            r7 = r4
            boolean r6 = r6[r7]
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzgd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzht.zzv(this.zzvs[i2]);
        }
        return i;
    }

    public final int size() {
        return this.size;
    }

    public final void addBoolean(boolean z) {
        zza(this.size, z);
    }

    private final void zza(int i, boolean z) {
        Throwable th;
        int i2 = i;
        boolean z2 = z;
        zzfz();
        if (i2 < 0 || i2 > this.size) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zzn(i2));
            throw th2;
        }
        if (this.size < this.zzvs.length) {
            System.arraycopy(this.zzvs, i2, this.zzvs, i2 + 1, this.size - i2);
        } else {
            boolean[] zArr = new boolean[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.zzvs, 0, zArr, 0, i2);
            System.arraycopy(this.zzvs, i2, zArr, i2 + 1, this.size - i2);
            this.zzvs = zArr;
        }
        this.zzvs[i2] = z2;
        this.size++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        Throwable th;
        Collection<? extends Boolean> collection2 = collection;
        zzfz();
        Object checkNotNull = zzht.checkNotNull(collection2);
        if (!(collection2 instanceof zzgd)) {
            return super.addAll(collection2);
        }
        zzgd zzgd = (zzgd) collection2;
        zzgd zzgd2 = zzgd;
        if (zzgd.size == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.size < zzgd2.size) {
            Throwable th2 = th;
            new OutOfMemoryError();
            throw th2;
        }
        int i = this.size + zzgd2.size;
        int i2 = i;
        if (i > this.zzvs.length) {
            this.zzvs = Arrays.copyOf(this.zzvs, i2);
        }
        System.arraycopy(zzgd2.zzvs, 0, this.zzvs, this.size, zzgd2.size);
        this.size = i2;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        Object obj2 = obj;
        zzfz();
        for (int i = 0; i < this.size; i++) {
            if (obj2.equals(Boolean.valueOf(this.zzvs[i]))) {
                System.arraycopy(this.zzvs, i + 1, this.zzvs, i, (this.size - i) - 1);
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
        Boolean bool = (Boolean) obj;
        Boolean bool2 = bool;
        boolean booleanValue = bool.booleanValue();
        zzfz();
        zzm(i2);
        boolean z = this.zzvs[i2];
        this.zzvs[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        int i2 = i;
        zzfz();
        zzm(i2);
        boolean z = this.zzvs[i2];
        if (i2 < this.size - 1) {
            System.arraycopy(this.zzvs, i2 + 1, this.zzvs, i2, (this.size - i2) - 1);
        }
        this.size--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zza(i, ((Boolean) obj).booleanValue());
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
        new zzgd(Arrays.copyOf(this.zzvs, i2), this.size);
        return zzhz;
    }

    public final /* synthetic */ Object get(int i) {
        int i2 = i;
        zzm(i2);
        return Boolean.valueOf(this.zzvs[i2]);
    }

    static {
        zzgd zzgd;
        new zzgd(new boolean[0], 0);
        zzgd zzgd2 = zzgd;
        zzvr = zzgd2;
        zzgd2.zzfy();
    }
}
