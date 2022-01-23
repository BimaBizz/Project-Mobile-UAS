package com.google.android.gms.internal.auth;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.auth.zzig */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0999zzig extends C0941zzgc<Long> implements C0985zzht<Long>, C1024zzje, RandomAccess {
    private static final C0999zzig zza;
    private long[] zzb;
    private int zzc;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    C0999zzig() {
        this(new long[10], 0);
    }

    private C0999zzig(long[] jArr, int i) {
        this.zzb = jArr;
        this.zzc = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        Throwable th;
        int i3 = i;
        int i4 = i2;
        zzc();
        if (i4 < i3) {
            Throwable th2 = th;
            new IndexOutOfBoundsException("toIndex < fromIndex");
            throw th2;
        }
        System.arraycopy(this.zzb, i4, this.zzb, i3, this.zzc - i4);
        this.zzc -= i4 - i3;
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
            boolean r6 = r6 instanceof com.google.android.gms.internal.auth.C0999zzig
            if (r6 != 0) goto L_0x0016
            r6 = r1
            r7 = r2
            boolean r6 = super.equals(r7)
            r1 = r6
            goto L_0x0008
        L_0x0016:
            r6 = r2
            com.google.android.gms.internal.auth.zzig r6 = (com.google.android.gms.internal.auth.C0999zzig) r6
            r3 = r6
            r6 = r1
            int r6 = r6.zzc
            r7 = r3
            int r7 = r7.zzc
            if (r6 == r7) goto L_0x0025
            r6 = 0
            r1 = r6
            goto L_0x0008
        L_0x0025:
            r6 = r3
            long[] r6 = r6.zzb
            r4 = r6
            r6 = 0
            r5 = r6
        L_0x002b:
            r6 = r5
            r7 = r1
            int r7 = r7.zzc
            if (r6 >= r7) goto L_0x0045
            r6 = r1
            long[] r6 = r6.zzb
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0999zzig.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + C0980zzho.zza(this.zzb[i2]);
        }
        return i;
    }

    public final long zzb(int i) {
        int i2 = i;
        zzc(i2);
        return this.zzb[i2];
    }

    public final int indexOf(Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj2).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzb[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int size() {
        return this.zzc;
    }

    public final void zza(long j) {
        long j2 = j;
        zzc();
        if (this.zzc == this.zzb.length) {
            long[] jArr = new long[(((this.zzc * 3) / 2) + 1)];
            System.arraycopy(this.zzb, 0, jArr, 0, this.zzc);
            this.zzb = jArr;
        }
        long[] jArr2 = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        jArr2[i] = j2;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        Throwable th;
        Collection<? extends Long> collection2 = collection;
        zzc();
        Object zza2 = C0980zzho.zza(collection2);
        if (!(collection2 instanceof C0999zzig)) {
            return super.addAll(collection2);
        }
        C0999zzig zzig = (C0999zzig) collection2;
        C0999zzig zzig2 = zzig;
        if (zzig.zzc == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.zzc < zzig2.zzc) {
            Throwable th2 = th;
            new OutOfMemoryError();
            throw th2;
        }
        int i = this.zzc + zzig2.zzc;
        int i2 = i;
        if (i > this.zzb.length) {
            this.zzb = Arrays.copyOf(this.zzb, i2);
        }
        System.arraycopy(zzig2.zzb, 0, this.zzb, this.zzc, zzig2.zzc);
        this.zzc = i2;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        Object obj2 = obj;
        zzc();
        for (int i = 0; i < this.zzc; i++) {
            if (obj2.equals(Long.valueOf(this.zzb[i]))) {
                System.arraycopy(this.zzb, i + 1, this.zzb, i, (this.zzc - i) - 1);
                this.zzc--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zzc(int i) {
        Throwable th;
        int i2 = i;
        if (i2 < 0 || i2 >= this.zzc) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zzd(i2));
            throw th2;
        }
    }

    private final String zzd(int i) {
        StringBuilder sb;
        int i2 = this.zzc;
        new StringBuilder(35);
        return sb.append("Index:").append(i).append(", Size:").append(i2).toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int i2 = i;
        long longValue = ((Long) obj).longValue();
        zzc();
        zzc(i2);
        long j = this.zzb[i2];
        this.zzb[i2] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        int i2 = i;
        zzc();
        zzc(i2);
        long j = this.zzb[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(this.zzb, i2 + 1, this.zzb, i2, (this.zzc - i2) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        Throwable th;
        int i2 = i;
        long longValue = ((Long) obj).longValue();
        zzc();
        if (i2 < 0 || i2 > this.zzc) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zzd(i2));
            throw th2;
        }
        if (this.zzc < this.zzb.length) {
            System.arraycopy(this.zzb, i2, this.zzb, i2 + 1, this.zzc - i2);
        } else {
            long[] jArr = new long[(((this.zzc * 3) / 2) + 1)];
            System.arraycopy(this.zzb, 0, jArr, 0, i2);
            System.arraycopy(this.zzb, i2, jArr, i2 + 1, this.zzc - i2);
            this.zzb = jArr;
        }
        this.zzb[i2] = longValue;
        this.zzc++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Long) obj).longValue());
        return true;
    }

    public final /* synthetic */ C0985zzht zza(int i) {
        C0985zzht zzht;
        Throwable th;
        int i2 = i;
        if (i2 < this.zzc) {
            Throwable th2 = th;
            new IllegalArgumentException();
            throw th2;
        }
        new C0999zzig(Arrays.copyOf(this.zzb, i2), this.zzc);
        return zzht;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(zzb(i));
    }

    static {
        C0999zzig zzig;
        new C0999zzig(new long[0], 0);
        C0999zzig zzig2 = zzig;
        zza = zzig2;
        zzig2.zzb();
    }
}
