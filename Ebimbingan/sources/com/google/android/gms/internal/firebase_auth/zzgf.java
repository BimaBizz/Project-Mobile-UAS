package com.google.android.gms.internal.firebase_auth;

import com.google.appinventor.components.runtime.util.Ev3Constants;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zzgf implements Serializable, Iterable<Byte> {
    public static final zzgf zzvv;
    private static final zzgl zzvw;
    private static final Comparator<zzgf> zzvy;
    private int zzvx = 0;

    zzgf() {
    }

    public abstract boolean equals(Object obj);

    public abstract int size();

    /* access modifiers changed from: protected */
    public abstract String zza(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void zza(zzgg zzgg) throws IOException;

    /* access modifiers changed from: protected */
    public abstract int zzb(int i, int i2, int i3);

    public abstract zzgf zzd(int i, int i2);

    public abstract boolean zzgd();

    public abstract byte zzp(int i);

    /* access modifiers changed from: package-private */
    public abstract byte zzq(int i);

    /* access modifiers changed from: private */
    public static int zza(byte b) {
        return b & Ev3Constants.Opcode.TST;
    }

    public static zzgf zza(byte[] bArr, int i, int i2) {
        zzgf zzgf;
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        int zzc = zzc(i3, i3 + i4, bArr2.length);
        new zzgp(zzvw.zzc(bArr2, i3, i4));
        return zzgf;
    }

    public static zzgf zza(byte[] bArr) {
        byte[] bArr2 = bArr;
        return zza(bArr2, 0, bArr2.length);
    }

    static zzgf zzb(byte[] bArr) {
        zzgf zzgf;
        new zzgp(bArr);
        return zzgf;
    }

    public static zzgf zzdh(String str) {
        zzgf zzgf;
        new zzgp(str.getBytes(zzht.UTF_8));
        return zzgf;
    }

    public final String zzgc() {
        return size() == 0 ? "" : zza(zzht.UTF_8);
    }

    public final int hashCode() {
        int i = this.zzvx;
        int i2 = i;
        if (i == 0) {
            int size = size();
            int zzb = zzb(size, 0, size);
            i2 = zzb;
            if (zzb == 0) {
                i2 = 1;
            }
            this.zzvx = i2;
        }
        return i2;
    }

    static zzgn zzr(int i) {
        zzgn zzgn;
        new zzgn(i, (zzgi) null);
        return zzgn;
    }

    /* access modifiers changed from: protected */
    public final int zzge() {
        return this.zzvx;
    }

    static int zzc(int i, int i2, int i3) {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        StringBuilder sb2;
        Throwable th3;
        StringBuilder sb3;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            Throwable th4 = th3;
            new StringBuilder(32);
            new IndexOutOfBoundsException(sb3.append("Beginning index: ").append(i4).append(" < 0").toString());
            throw th4;
        } else if (i5 < i4) {
            Throwable th5 = th2;
            new StringBuilder(66);
            new IndexOutOfBoundsException(sb2.append("Beginning index larger than ending index: ").append(i4).append(", ").append(i5).toString());
            throw th5;
        } else {
            Throwable th6 = th;
            new StringBuilder(37);
            new IndexOutOfBoundsException(sb.append("End index: ").append(i5).append(" >= ").append(i6).toString());
            throw th6;
        }
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        Object[] objArr2 = objArr;
        objArr2[1] = Integer.valueOf(size());
        return String.format("<ByteString@%s size=%d>", objArr2);
    }

    public /* synthetic */ Iterator iterator() {
        Iterator it;
        new zzgi(this);
        return it;
    }

    static {
        zzgf zzgf;
        zzgl zzgl;
        zzgl zzgl2;
        Comparator<zzgf> comparator;
        zzgl zzgl3;
        new zzgp(zzht.EMPTY_BYTE_ARRAY);
        zzvv = zzgf;
        if (zzge.zzga()) {
            zzgl2 = zzgl3;
            new zzgs((zzgi) null);
        } else {
            zzgl2 = zzgl;
            new zzgj((zzgi) null);
        }
        zzvw = zzgl2;
        new zzgh();
        zzvy = comparator;
    }
}
