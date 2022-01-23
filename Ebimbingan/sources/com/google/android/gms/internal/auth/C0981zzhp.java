package com.google.android.gms.internal.auth;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.auth.zzhp */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0981zzhp extends C0941zzgc<Integer> implements C0985zzht<Integer>, C1024zzje, RandomAccess {
    private static final C0981zzhp zza;
    private int[] zzb;
    private int zzc;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    C0981zzhp() {
        this(new int[10], 0);
    }

    private C0981zzhp(int[] iArr, int i) {
        this.zzb = iArr;
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
            boolean r5 = r5 instanceof com.google.android.gms.internal.auth.C0981zzhp
            if (r5 != 0) goto L_0x0016
            r5 = r0
            r6 = r1
            boolean r5 = super.equals(r6)
            r0 = r5
            goto L_0x0008
        L_0x0016:
            r5 = r1
            com.google.android.gms.internal.auth.zzhp r5 = (com.google.android.gms.internal.auth.C0981zzhp) r5
            r2 = r5
            r5 = r0
            int r5 = r5.zzc
            r6 = r2
            int r6 = r6.zzc
            if (r5 == r6) goto L_0x0025
            r5 = 0
            r0 = r5
            goto L_0x0008
        L_0x0025:
            r5 = r2
            int[] r5 = r5.zzb
            r3 = r5
            r5 = 0
            r4 = r5
        L_0x002b:
            r5 = r4
            r6 = r0
            int r6 = r6.zzc
            if (r5 >= r6) goto L_0x0043
            r5 = r0
            int[] r5 = r5.zzb
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0981zzhp.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + this.zzb[i2];
        }
        return i;
    }

    public final int zzb(int i) {
        int i2 = i;
        zzd(i2);
        return this.zzb[i2];
    }

    public final int indexOf(Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj2).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzb[i] == intValue) {
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

    public final void zzc(int i) {
        int i2 = i;
        zzc();
        if (this.zzc == this.zzb.length) {
            int[] iArr = new int[(((this.zzc * 3) / 2) + 1)];
            System.arraycopy(this.zzb, 0, iArr, 0, this.zzc);
            this.zzb = iArr;
        }
        int[] iArr2 = this.zzb;
        int i3 = this.zzc;
        int i4 = i3 + 1;
        this.zzc = i4;
        iArr2[i3] = i2;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        Throwable th;
        Collection<? extends Integer> collection2 = collection;
        zzc();
        Object zza2 = C0980zzho.zza(collection2);
        if (!(collection2 instanceof C0981zzhp)) {
            return super.addAll(collection2);
        }
        C0981zzhp zzhp = (C0981zzhp) collection2;
        C0981zzhp zzhp2 = zzhp;
        if (zzhp.zzc == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.zzc < zzhp2.zzc) {
            Throwable th2 = th;
            new OutOfMemoryError();
            throw th2;
        }
        int i = this.zzc + zzhp2.zzc;
        int i2 = i;
        if (i > this.zzb.length) {
            this.zzb = Arrays.copyOf(this.zzb, i2);
        }
        System.arraycopy(zzhp2.zzb, 0, this.zzb, this.zzc, zzhp2.zzc);
        this.zzc = i2;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        Object obj2 = obj;
        zzc();
        for (int i = 0; i < this.zzc; i++) {
            if (obj2.equals(Integer.valueOf(this.zzb[i]))) {
                System.arraycopy(this.zzb, i + 1, this.zzb, i, (this.zzc - i) - 1);
                this.zzc--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zzd(int i) {
        Throwable th;
        int i2 = i;
        if (i2 < 0 || i2 >= this.zzc) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zze(i2));
            throw th2;
        }
    }

    private final String zze(int i) {
        StringBuilder sb;
        int i2 = this.zzc;
        new StringBuilder(35);
        return sb.append("Index:").append(i).append(", Size:").append(i2).toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int i2 = i;
        int intValue = ((Integer) obj).intValue();
        zzc();
        zzd(i2);
        int i3 = this.zzb[i2];
        this.zzb[i2] = intValue;
        return Integer.valueOf(i3);
    }

    public final /* synthetic */ Object remove(int i) {
        int i2 = i;
        zzc();
        zzd(i2);
        int i3 = this.zzb[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(this.zzb, i2 + 1, this.zzb, i2, (this.zzc - i2) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        Throwable th;
        int i2 = i;
        int intValue = ((Integer) obj).intValue();
        zzc();
        if (i2 < 0 || i2 > this.zzc) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zze(i2));
            throw th2;
        }
        if (this.zzc < this.zzb.length) {
            System.arraycopy(this.zzb, i2, this.zzb, i2 + 1, this.zzc - i2);
        } else {
            int[] iArr = new int[(((this.zzc * 3) / 2) + 1)];
            System.arraycopy(this.zzb, 0, iArr, 0, i2);
            System.arraycopy(this.zzb, i2, iArr, i2 + 1, this.zzc - i2);
            this.zzb = iArr;
        }
        this.zzb[i2] = intValue;
        this.zzc++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zzc(((Integer) obj).intValue());
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
        new C0981zzhp(Arrays.copyOf(this.zzb, i2), this.zzc);
        return zzht;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(zzb(i));
    }

    static {
        C0981zzhp zzhp;
        new C0981zzhp(new int[0], 0);
        C0981zzhp zzhp2 = zzhp;
        zza = zzhp2;
        zzhp2.zzb();
    }
}
