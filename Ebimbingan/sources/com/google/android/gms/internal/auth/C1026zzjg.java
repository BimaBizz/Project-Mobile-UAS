package com.google.android.gms.internal.auth;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.auth.zzjg */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1026zzjg<E> extends C0941zzgc<E> implements RandomAccess {
    private static final C1026zzjg<Object> zza;
    private E[] zzb;
    private int zzc;

    public static <E> C1026zzjg<E> zzd() {
        return zza;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    C1026zzjg() {
        this(new Object[10], 0);
    }

    private C1026zzjg(E[] eArr, int i) {
        this.zzb = eArr;
        this.zzc = i;
    }

    public final boolean add(E e) {
        E e2 = e;
        zzc();
        if (this.zzc == this.zzb.length) {
            this.zzb = Arrays.copyOf(this.zzb, ((this.zzc * 3) / 2) + 1);
        }
        E[] eArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        eArr[i] = e2;
        this.modCount++;
        return true;
    }

    public final void add(int i, E e) {
        Throwable th;
        int i2 = i;
        E e2 = e;
        zzc();
        if (i2 < 0 || i2 > this.zzc) {
            Throwable th2 = th;
            new IndexOutOfBoundsException(zzc(i2));
            throw th2;
        }
        if (this.zzc < this.zzb.length) {
            System.arraycopy(this.zzb, i2, this.zzb, i2 + 1, this.zzc - i2);
        } else {
            E[] eArr = new Object[(((this.zzc * 3) / 2) + 1)];
            System.arraycopy(this.zzb, 0, eArr, 0, i2);
            System.arraycopy(this.zzb, i2, eArr, i2 + 1, this.zzc - i2);
            this.zzb = eArr;
        }
        this.zzb[i2] = e2;
        this.zzc++;
        this.modCount++;
    }

    public final E get(int i) {
        int i2 = i;
        zzb(i2);
        return this.zzb[i2];
    }

    public final E remove(int i) {
        int i2 = i;
        zzc();
        zzb(i2);
        E e = this.zzb[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(this.zzb, i2 + 1, this.zzb, i2, (this.zzc - i2) - 1);
        }
        this.zzc--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        int i2 = i;
        zzc();
        zzb(i2);
        E e2 = this.zzb[i2];
        this.zzb[i2] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.zzc;
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

    public final /* synthetic */ C0985zzht zza(int i) {
        C0985zzht zzht;
        Throwable th;
        int i2 = i;
        if (i2 < this.zzc) {
            Throwable th2 = th;
            new IllegalArgumentException();
            throw th2;
        }
        new C1026zzjg(Arrays.copyOf(this.zzb, i2), this.zzc);
        return zzht;
    }

    static {
        C1026zzjg zzjg;
        new C1026zzjg(new Object[0], 0);
        C1026zzjg zzjg2 = zzjg;
        zza = zzjg2;
        zzjg2.zzb();
    }
}
