package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzgg extends zzgc<Boolean> implements zzht<Boolean>, zzje, RandomAccess {
    private static final zzgg zza;
    private boolean[] zzb;
    private int zzc;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    zzgg() {
        this(new boolean[10], 0);
    }

    private zzgg(boolean[] zArr, int i) {
        this.zzb = zArr;
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
            boolean r5 = r5 instanceof com.google.android.gms.internal.auth.zzgg
            if (r5 != 0) goto L_0x0016
            r5 = r0
            r6 = r1
            boolean r5 = super.equals(r6)
            r0 = r5
            goto L_0x0008
        L_0x0016:
            r5 = r1
            com.google.android.gms.internal.auth.zzgg r5 = (com.google.android.gms.internal.auth.zzgg) r5
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
            boolean[] r5 = r5.zzb
            r3 = r5
            r5 = 0
            r4 = r5
        L_0x002b:
            r5 = r4
            r6 = r0
            int r6 = r6.zzc
            if (r5 >= r6) goto L_0x0043
            r5 = r0
            boolean[] r5 = r5.zzb
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzgg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + zzho.zza(this.zzb[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzb[i] == booleanValue) {
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

    public final void zza(boolean z) {
        boolean z2 = z;
        zzc();
        if (this.zzc == this.zzb.length) {
            boolean[] zArr = new boolean[(((this.zzc * 3) / 2) + 1)];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        zArr2[i] = z2;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        Throwable th;
        Collection<? extends Boolean> collection2 = collection;
        zzc();
        Object zza2 = zzho.zza(collection2);
        if (!(collection2 instanceof zzgg)) {
            return super.addAll(collection2);
        }
        zzgg zzgg = (zzgg) collection2;
        zzgg zzgg2 = zzgg;
        if (zzgg.zzc == 0) {
            return false;
        }
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - this.zzc < zzgg2.zzc) {
            Throwable th2 = th;
            new OutOfMemoryError();
            throw th2;
        }
        int i = this.zzc + zzgg2.zzc;
        int i2 = i;
        if (i > this.zzb.length) {
            this.zzb = Arrays.copyOf(this.zzb, i2);
        }
        System.arraycopy(zzgg2.zzb, 0, this.zzb, this.zzc, zzgg2.zzc);
        this.zzc = i2;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        Object obj2 = obj;
        zzc();
        for (int i = 0; i < this.zzc; i++) {
            if (obj2.equals(Boolean.valueOf(this.zzb[i]))) {
                System.arraycopy(this.zzb, i + 1, this.zzb, i, (this.zzc - i) - 1);
                this.zzc--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zzb(int i) {
        Throwable th;
        int i2 = i;
        if (i2 < 0 || i2 >= this.zzc) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zzc(i2));
            throw th2;
        }
    }

    private final String zzc(int i) {
        StringBuilder sb;
        int i2 = this.zzc;
        new StringBuilder(35);
        return sb.append("Index:").append(i).append(", Size:").append(i2).toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int i2 = i;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzc();
        zzb(i2);
        boolean z = this.zzb[i2];
        this.zzb[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        int i2 = i;
        zzc();
        zzb(i2);
        boolean z = this.zzb[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(this.zzb, i2 + 1, this.zzb, i2, (this.zzc - i2) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        Throwable th;
        int i2 = i;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzc();
        if (i2 < 0 || i2 > this.zzc) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zzc(i2));
            throw th2;
        }
        if (this.zzc < this.zzb.length) {
            System.arraycopy(this.zzb, i2, this.zzb, i2 + 1, this.zzc - i2);
        } else {
            boolean[] zArr = new boolean[(((this.zzc * 3) / 2) + 1)];
            System.arraycopy(this.zzb, 0, zArr, 0, i2);
            System.arraycopy(this.zzb, i2, zArr, i2 + 1, this.zzc - i2);
            this.zzb = zArr;
        }
        this.zzb[i2] = booleanValue;
        this.zzc++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Boolean) obj).booleanValue());
        return true;
    }

    public final /* synthetic */ zzht zza(int i) {
        zzht zzht;
        Throwable th;
        int i2 = i;
        if (i2 < this.zzc) {
            Throwable th2 = th;
            new IllegalArgumentException();
            throw th2;
        }
        new zzgg(Arrays.copyOf(this.zzb, i2), this.zzc);
        return zzht;
    }

    public final /* synthetic */ Object get(int i) {
        int i2 = i;
        zzb(i2);
        return Boolean.valueOf(this.zzb[i2]);
    }

    static {
        zzgg zzgg;
        new zzgg(new boolean[0], 0);
        zzgg zzgg2 = zzgg;
        zza = zzgg2;
        zzgg2.zzb();
    }
}
