package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzhk extends zzgc<Float> implements zzht<Float>, zzje, RandomAccess {
    private static final zzhk zza;
    private float[] zzb;
    private int zzc;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    zzhk() {
        this(new float[10], 0);
    }

    private zzhk(float[] fArr, int i) {
        this.zzb = fArr;
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
            boolean r5 = r5 instanceof com.google.android.gms.internal.auth.zzhk
            if (r5 != 0) goto L_0x0016
            r5 = r0
            r6 = r1
            boolean r5 = super.equals(r6)
            r0 = r5
            goto L_0x0008
        L_0x0016:
            r5 = r1
            com.google.android.gms.internal.auth.zzhk r5 = (com.google.android.gms.internal.auth.zzhk) r5
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
            float[] r5 = r5.zzb
            r3 = r5
            r5 = 0
            r4 = r5
        L_0x002b:
            r5 = r4
            r6 = r0
            int r6 = r6.zzc
            if (r5 >= r6) goto L_0x004b
            r5 = r0
            float[] r5 = r5.zzb
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzhk.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zzb[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj2).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzb[i] == floatValue) {
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

    public final void zza(float f) {
        float f2 = f;
        zzc();
        if (this.zzc == this.zzb.length) {
            float[] fArr = new float[(((this.zzc * 3) / 2) + 1)];
            System.arraycopy(this.zzb, 0, fArr, 0, this.zzc);
            this.zzb = fArr;
        }
        float[] fArr2 = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        fArr2[i] = f2;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        Throwable th;
        Collection<? extends Float> collection2 = collection;
        zzc();
        Object zza2 = zzho.zza(collection2);
        if (!(collection2 instanceof zzhk)) {
            return super.addAll(collection2);
        }
        zzhk zzhk = (zzhk) collection2;
        zzhk zzhk2 = zzhk;
        if (zzhk.zzc == 0) {
            return false;
        }
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - this.zzc < zzhk2.zzc) {
            Throwable th2 = th;
            new OutOfMemoryError();
            throw th2;
        }
        int i = this.zzc + zzhk2.zzc;
        int i2 = i;
        if (i > this.zzb.length) {
            this.zzb = Arrays.copyOf(this.zzb, i2);
        }
        System.arraycopy(zzhk2.zzb, 0, this.zzb, this.zzc, zzhk2.zzc);
        this.zzc = i2;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        Object obj2 = obj;
        zzc();
        for (int i = 0; i < this.zzc; i++) {
            if (obj2.equals(Float.valueOf(this.zzb[i]))) {
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
        float floatValue = ((Float) obj).floatValue();
        zzc();
        zzb(i2);
        float f = this.zzb[i2];
        this.zzb[i2] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        int i2 = i;
        zzc();
        zzb(i2);
        float f = this.zzb[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(this.zzb, i2 + 1, this.zzb, i2, (this.zzc - i2) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        Throwable th;
        int i2 = i;
        float floatValue = ((Float) obj).floatValue();
        zzc();
        if (i2 < 0 || i2 > this.zzc) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zzc(i2));
            throw th2;
        }
        if (this.zzc < this.zzb.length) {
            System.arraycopy(this.zzb, i2, this.zzb, i2 + 1, this.zzc - i2);
        } else {
            float[] fArr = new float[(((this.zzc * 3) / 2) + 1)];
            System.arraycopy(this.zzb, 0, fArr, 0, i2);
            System.arraycopy(this.zzb, i2, fArr, i2 + 1, this.zzc - i2);
            this.zzb = fArr;
        }
        this.zzb[i2] = floatValue;
        this.zzc++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Float) obj).floatValue());
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
        new zzhk(Arrays.copyOf(this.zzb, i2), this.zzc);
        return zzht;
    }

    public final /* synthetic */ Object get(int i) {
        int i2 = i;
        zzb(i2);
        return Float.valueOf(this.zzb[i2]);
    }

    static {
        zzhk zzhk;
        new zzhk(new float[0], 0);
        zzhk zzhk2 = zzhk;
        zza = zzhk2;
        zzhk2.zzb();
    }
}
