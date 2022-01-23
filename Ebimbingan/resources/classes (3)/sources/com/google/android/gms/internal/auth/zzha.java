package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzha extends zzgc<Double> implements zzht<Double>, zzje, RandomAccess {
    private static final zzha zza;
    private double[] zzb;
    private int zzc;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    zzha() {
        this(new double[10], 0);
    }

    private zzha(double[] dArr, int i) {
        this.zzb = dArr;
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
            boolean r6 = r6 instanceof com.google.android.gms.internal.auth.zzha
            if (r6 != 0) goto L_0x0016
            r6 = r1
            r7 = r2
            boolean r6 = super.equals(r7)
            r1 = r6
            goto L_0x0008
        L_0x0016:
            r6 = r2
            com.google.android.gms.internal.auth.zzha r6 = (com.google.android.gms.internal.auth.zzha) r6
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
            double[] r6 = r6.zzb
            r4 = r6
            r6 = 0
            r5 = r6
        L_0x002b:
            r6 = r5
            r7 = r1
            int r7 = r7.zzc
            if (r6 >= r7) goto L_0x004d
            r6 = r1
            double[] r6 = r6.zzb
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzha.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + zzho.zza(Double.doubleToLongBits(this.zzb[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj2).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzb[i] == doubleValue) {
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

    public final void zza(double d) {
        double d2 = d;
        zzc();
        if (this.zzc == this.zzb.length) {
            double[] dArr = new double[(((this.zzc * 3) / 2) + 1)];
            System.arraycopy(this.zzb, 0, dArr, 0, this.zzc);
            this.zzb = dArr;
        }
        double[] dArr2 = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        dArr2[i] = d2;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        Throwable th;
        Collection<? extends Double> collection2 = collection;
        zzc();
        Object zza2 = zzho.zza(collection2);
        if (!(collection2 instanceof zzha)) {
            return super.addAll(collection2);
        }
        zzha zzha = (zzha) collection2;
        zzha zzha2 = zzha;
        if (zzha.zzc == 0) {
            return false;
        }
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - this.zzc < zzha2.zzc) {
            Throwable th2 = th;
            new OutOfMemoryError();
            throw th2;
        }
        int i = this.zzc + zzha2.zzc;
        int i2 = i;
        if (i > this.zzb.length) {
            this.zzb = Arrays.copyOf(this.zzb, i2);
        }
        System.arraycopy(zzha2.zzb, 0, this.zzb, this.zzc, zzha2.zzc);
        this.zzc = i2;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        Object obj2 = obj;
        zzc();
        for (int i = 0; i < this.zzc; i++) {
            if (obj2.equals(Double.valueOf(this.zzb[i]))) {
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
        double doubleValue = ((Double) obj).doubleValue();
        zzc();
        zzb(i2);
        double d = this.zzb[i2];
        this.zzb[i2] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        int i2 = i;
        zzc();
        zzb(i2);
        double d = this.zzb[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(this.zzb, i2 + 1, this.zzb, i2, (this.zzc - i2) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        Throwable th;
        int i2 = i;
        double doubleValue = ((Double) obj).doubleValue();
        zzc();
        if (i2 < 0 || i2 > this.zzc) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zzc(i2));
            throw th2;
        }
        if (this.zzc < this.zzb.length) {
            System.arraycopy(this.zzb, i2, this.zzb, i2 + 1, this.zzc - i2);
        } else {
            double[] dArr = new double[(((this.zzc * 3) / 2) + 1)];
            System.arraycopy(this.zzb, 0, dArr, 0, i2);
            System.arraycopy(this.zzb, i2, dArr, i2 + 1, this.zzc - i2);
            this.zzb = dArr;
        }
        this.zzb[i2] = doubleValue;
        this.zzc++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Double) obj).doubleValue());
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
        new zzha(Arrays.copyOf(this.zzb, i2), this.zzc);
        return zzht;
    }

    public final /* synthetic */ Object get(int i) {
        int i2 = i;
        zzb(i2);
        return Double.valueOf(this.zzb[i2]);
    }

    static {
        zzha zzha;
        new zzha(new double[0], 0);
        zzha zzha2 = zzha;
        zza = zzha2;
        zzha2.zzb();
    }
}
