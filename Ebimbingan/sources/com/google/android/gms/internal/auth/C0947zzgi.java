package com.google.android.gms.internal.auth;

import com.google.appinventor.components.runtime.util.Ev3Constants;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.auth.zzgi */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C0947zzgi implements Serializable, Iterable<Byte> {
    public static final C0947zzgi zza;
    private static final C0953zzgo zzb;
    private static final Comparator<C0947zzgi> zzd;
    private int zzc = 0;

    C0947zzgi() {
    }

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i);

    public abstract int zza();

    /* access modifiers changed from: protected */
    public abstract int zza(int i, int i2, int i3);

    public abstract C0947zzgi zza(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String zza(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void zza(C0944zzgf zzgf) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract byte zzb(int i);

    public abstract boolean zzc();

    /* access modifiers changed from: private */
    public static int zzb(byte b) {
        return b & Ev3Constants.Opcode.TST;
    }

    public static C0947zzgi zza(byte[] bArr, int i, int i2) {
        C0947zzgi zzgi;
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        int zzb2 = zzb(i3, i3 + i4, bArr2.length);
        new C0957zzgs(zzb.zza(bArr2, i3, i4));
        return zzgi;
    }

    public static C0947zzgi zza(String str) {
        C0947zzgi zzgi;
        new C0957zzgs(str.getBytes(C0980zzho.zza));
        return zzgi;
    }

    public final String zzb() {
        return zza() == 0 ? "" : zza(C0980zzho.zza);
    }

    public final int hashCode() {
        int i = this.zzc;
        int i2 = i;
        if (i == 0) {
            int zza2 = zza();
            int zza3 = zza(zza2, 0, zza2);
            i2 = zza3;
            if (zza3 == 0) {
                i2 = 1;
            }
            this.zzc = i2;
        }
        return i2;
    }

    static C0955zzgq zzc(int i) {
        C0955zzgq zzgq;
        new C0955zzgq(i, (C0946zzgh) null);
        return zzgq;
    }

    /* access modifiers changed from: protected */
    public final int zzd() {
        return this.zzc;
    }

    static int zzb(int i, int i2, int i3) {
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
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        Object[] objArr2 = objArr;
        objArr2[1] = Integer.valueOf(zza());
        Object[] objArr3 = objArr2;
        Object[] objArr4 = objArr3;
        Object[] objArr5 = objArr3;
        objArr5[2] = zza() <= 50 ? C1042zzjw.zza(this) : String.valueOf(C1042zzjw.zza(zza(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr4);
    }

    public /* synthetic */ Iterator iterator() {
        Iterator it;
        new C0946zzgh(this);
        return it;
    }

    static {
        C0947zzgi zzgi;
        C0953zzgo zzgo;
        C0953zzgo zzgo2;
        Comparator<C0947zzgi> comparator;
        C0953zzgo zzgo3;
        new C0957zzgs(C0980zzho.zzb);
        zza = zzgi;
        if (C0940zzgb.zza()) {
            zzgo2 = zzgo3;
            new C0956zzgr((C0946zzgh) null);
        } else {
            zzgo2 = zzgo;
            new C0951zzgm((C0946zzgh) null);
        }
        zzb = zzgo2;
        new C0949zzgk();
        zzd = comparator;
    }
}
