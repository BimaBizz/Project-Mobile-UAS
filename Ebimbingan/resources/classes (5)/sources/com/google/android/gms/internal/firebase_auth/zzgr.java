package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

public abstract class zzgr {
    int zzwe;
    int zzwf;
    int zzwg;
    zzgy zzwh;
    private boolean zzwi;

    static zzgr zza(byte[] bArr, int i, int i2, boolean z) {
        zzgr zzgr;
        Throwable th;
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        new zzgt(bArr, 0, i4, false, (zzgu) null);
        zzgr zzgr2 = zzgr;
        try {
            int zzu = zzgr2.zzu(i4);
            return zzgr2;
        } catch (zzic e) {
            zzic zzic = e;
            Throwable th2 = th;
            new IllegalArgumentException(zzic);
            throw th2;
        }
    }

    public abstract double readDouble() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract String readString() throws IOException;

    public abstract int zzgi() throws IOException;

    public abstract long zzgj() throws IOException;

    public abstract long zzgk() throws IOException;

    public abstract int zzgl() throws IOException;

    public abstract long zzgm() throws IOException;

    public abstract int zzgn() throws IOException;

    public abstract boolean zzgo() throws IOException;

    public abstract String zzgp() throws IOException;

    public abstract zzgf zzgq() throws IOException;

    public abstract int zzgr() throws IOException;

    public abstract int zzgs() throws IOException;

    public abstract int zzgt() throws IOException;

    public abstract long zzgu() throws IOException;

    public abstract int zzgv() throws IOException;

    public abstract long zzgw() throws IOException;

    /* access modifiers changed from: package-private */
    public abstract long zzgx() throws IOException;

    public abstract boolean zzgy() throws IOException;

    public abstract int zzgz();

    public abstract void zzs(int i) throws zzic;

    public abstract boolean zzt(int i) throws IOException;

    public abstract int zzu(int i) throws zzic;

    public abstract void zzv(int i);

    private zzgr() {
        this.zzwf = 100;
        this.zzwg = Integer.MAX_VALUE;
        this.zzwi = false;
    }

    public static int zzw(int i) {
        int i2 = i;
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    public static long zza(long j) {
        long j2 = j;
        return (j2 >>> 1) ^ (-(j2 & 1));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzgr(zzgu zzgu) {
        this();
        zzgu zzgu2 = zzgu;
    }
}
