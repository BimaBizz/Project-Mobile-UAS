package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;
import java.util.List;

final class zzgy implements zzjp {
    private int tag;
    private final zzgr zzwt;
    private int zzwu;
    private int zzwv = 0;

    public static zzgy zza(zzgr zzgr) {
        zzgy zzgy;
        zzgr zzgr2 = zzgr;
        if (zzgr2.zzwh != null) {
            return zzgr2.zzwh;
        }
        new zzgy(zzgr2);
        return zzgy;
    }

    private zzgy(zzgr zzgr) {
        this.zzwt = (zzgr) zzht.zza(zzgr, "input");
        this.zzwt.zzwh = this;
    }

    public final int zzhg() throws IOException {
        if (this.zzwv != 0) {
            this.tag = this.zzwv;
            this.zzwv = 0;
        } else {
            this.tag = this.zzwt.zzgi();
        }
        if (this.tag == 0 || this.tag == this.zzwu) {
            return Integer.MAX_VALUE;
        }
        return this.tag >>> 3;
    }

    public final int getTag() {
        return this.tag;
    }

    public final boolean zzhh() throws IOException {
        if (this.zzwt.zzgy() || this.tag == this.zzwu) {
            return false;
        }
        return this.zzwt.zzt(this.tag);
    }

    private final void zzac(int i) throws IOException {
        if ((this.tag & 7) != i) {
            throw zzic.zziw();
        }
    }

    public final double readDouble() throws IOException {
        zzac(1);
        return this.zzwt.readDouble();
    }

    public final float readFloat() throws IOException {
        zzac(5);
        return this.zzwt.readFloat();
    }

    public final long zzgj() throws IOException {
        zzac(0);
        return this.zzwt.zzgj();
    }

    public final long zzgk() throws IOException {
        zzac(0);
        return this.zzwt.zzgk();
    }

    public final int zzgl() throws IOException {
        zzac(0);
        return this.zzwt.zzgl();
    }

    public final long zzgm() throws IOException {
        zzac(1);
        return this.zzwt.zzgm();
    }

    public final int zzgn() throws IOException {
        zzac(5);
        return this.zzwt.zzgn();
    }

    public final boolean zzgo() throws IOException {
        zzac(0);
        return this.zzwt.zzgo();
    }

    public final String readString() throws IOException {
        zzac(2);
        return this.zzwt.readString();
    }

    public final String zzgp() throws IOException {
        zzac(2);
        return this.zzwt.zzgp();
    }

    public final <T> T zza(zzjs<T> zzjs, zzhf zzhf) throws IOException {
        zzac(2);
        return zzc(zzjs, zzhf);
    }

    public final <T> T zzb(zzjs<T> zzjs, zzhf zzhf) throws IOException {
        zzac(3);
        return zzd(zzjs, zzhf);
    }

    private final <T> T zzc(zzjs<T> zzjs, zzhf zzhf) throws IOException {
        Throwable th;
        zzjs<T> zzjs2 = zzjs;
        zzhf zzhf2 = zzhf;
        int zzgr = this.zzwt.zzgr();
        if (this.zzwt.zzwe >= this.zzwt.zzwf) {
            Throwable th2 = th;
            new zzic("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
            throw th2;
        }
        int zzu = this.zzwt.zzu(zzgr);
        T newInstance = zzjs2.newInstance();
        this.zzwt.zzwe++;
        zzjs2.zza(newInstance, this, zzhf2);
        zzjs2.zzf(newInstance);
        this.zzwt.zzs(0);
        zzgr zzgr2 = this.zzwt;
        zzgr2.zzwe--;
        this.zzwt.zzv(zzu);
        return newInstance;
    }

    /* JADX INFO: finally extract failed */
    private final <T> T zzd(zzjs<T> zzjs, zzhf zzhf) throws IOException {
        zzjs<T> zzjs2 = zzjs;
        zzhf zzhf2 = zzhf;
        int i = this.zzwu;
        this.zzwu = ((this.tag >>> 3) << 3) | 4;
        try {
            T newInstance = zzjs2.newInstance();
            zzjs2.zza(newInstance, this, zzhf2);
            zzjs2.zzf(newInstance);
            if (this.tag != this.zzwu) {
                throw zzic.zziy();
            }
            T t = newInstance;
            this.zzwu = i;
            return t;
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zzwu = i;
            throw th2;
        }
    }

    public final zzgf zzgq() throws IOException {
        zzac(2);
        return this.zzwt.zzgq();
    }

    public final int zzgr() throws IOException {
        zzac(0);
        return this.zzwt.zzgr();
    }

    public final int zzgs() throws IOException {
        zzac(0);
        return this.zzwt.zzgs();
    }

    public final int zzgt() throws IOException {
        zzac(5);
        return this.zzwt.zzgt();
    }

    public final long zzgu() throws IOException {
        zzac(1);
        return this.zzwt.zzgu();
    }

    public final int zzgv() throws IOException {
        zzac(0);
        return this.zzwt.zzgv();
    }

    public final long zzgw() throws IOException {
        zzac(0);
        return this.zzwt.zzgw();
    }

    public final void zzh(List<Double> list) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<Double> list2 = list;
        if (list2 instanceof zzhb) {
            zzhb zzhb = (zzhb) list2;
            switch (this.tag & 7) {
                case 1:
                    break;
                case 2:
                    int zzgr = this.zzwt.zzgr();
                    zzad(zzgr);
                    int zzgz = this.zzwt.zzgz() + zzgr;
                    do {
                        zzhb.zzc(this.zzwt.readDouble());
                    } while (this.zzwt.zzgz() < zzgz);
                    return;
                default:
                    throw zzic.zziw();
            }
            do {
                zzhb.zzc(this.zzwt.readDouble());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
            return;
        }
        switch (this.tag & 7) {
            case 1:
                break;
            case 2:
                int zzgr2 = this.zzwt.zzgr();
                zzad(zzgr2);
                int zzgz2 = this.zzwt.zzgz() + zzgr2;
                do {
                    boolean add = list2.add(Double.valueOf(this.zzwt.readDouble()));
                } while (this.zzwt.zzgz() < zzgz2);
                return;
            default:
                throw zzic.zziw();
        }
        do {
            boolean add2 = list2.add(Double.valueOf(this.zzwt.readDouble()));
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    public final void zzi(List<Float> list) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<Float> list2 = list;
        if (list2 instanceof zzho) {
            zzho zzho = (zzho) list2;
            switch (this.tag & 7) {
                case 2:
                    int zzgr = this.zzwt.zzgr();
                    zzae(zzgr);
                    int zzgz = this.zzwt.zzgz() + zzgr;
                    do {
                        zzho.zzc(this.zzwt.readFloat());
                    } while (this.zzwt.zzgz() < zzgz);
                    return;
                case 5:
                    break;
                default:
                    throw zzic.zziw();
            }
            do {
                zzho.zzc(this.zzwt.readFloat());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
            return;
        }
        switch (this.tag & 7) {
            case 2:
                int zzgr2 = this.zzwt.zzgr();
                zzae(zzgr2);
                int zzgz2 = this.zzwt.zzgz() + zzgr2;
                do {
                    boolean add = list2.add(Float.valueOf(this.zzwt.readFloat()));
                } while (this.zzwt.zzgz() < zzgz2);
                return;
            case 5:
                break;
            default:
                throw zzic.zziw();
        }
        do {
            boolean add2 = list2.add(Float.valueOf(this.zzwt.readFloat()));
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    public final void zzj(List<Long> list) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<Long> list2 = list;
        if (list2 instanceof zziq) {
            zziq zziq = (zziq) list2;
            switch (this.tag & 7) {
                case 0:
                    break;
                case 2:
                    int zzgz = this.zzwt.zzgz() + this.zzwt.zzgr();
                    do {
                        zziq.zzl(this.zzwt.zzgj());
                    } while (this.zzwt.zzgz() < zzgz);
                    zzaf(zzgz);
                    return;
                default:
                    throw zzic.zziw();
            }
            do {
                zziq.zzl(this.zzwt.zzgj());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
            return;
        }
        switch (this.tag & 7) {
            case 0:
                break;
            case 2:
                int zzgz2 = this.zzwt.zzgz() + this.zzwt.zzgr();
                do {
                    boolean add = list2.add(Long.valueOf(this.zzwt.zzgj()));
                } while (this.zzwt.zzgz() < zzgz2);
                zzaf(zzgz2);
                return;
            default:
                throw zzic.zziw();
        }
        do {
            boolean add2 = list2.add(Long.valueOf(this.zzwt.zzgj()));
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    public final void zzk(List<Long> list) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<Long> list2 = list;
        if (list2 instanceof zziq) {
            zziq zziq = (zziq) list2;
            switch (this.tag & 7) {
                case 0:
                    break;
                case 2:
                    int zzgz = this.zzwt.zzgz() + this.zzwt.zzgr();
                    do {
                        zziq.zzl(this.zzwt.zzgk());
                    } while (this.zzwt.zzgz() < zzgz);
                    zzaf(zzgz);
                    return;
                default:
                    throw zzic.zziw();
            }
            do {
                zziq.zzl(this.zzwt.zzgk());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
            return;
        }
        switch (this.tag & 7) {
            case 0:
                break;
            case 2:
                int zzgz2 = this.zzwt.zzgz() + this.zzwt.zzgr();
                do {
                    boolean add = list2.add(Long.valueOf(this.zzwt.zzgk()));
                } while (this.zzwt.zzgz() < zzgz2);
                zzaf(zzgz2);
                return;
            default:
                throw zzic.zziw();
        }
        do {
            boolean add2 = list2.add(Long.valueOf(this.zzwt.zzgk()));
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    public final void zzl(List<Integer> list) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<Integer> list2 = list;
        if (list2 instanceof zzhu) {
            zzhu zzhu = (zzhu) list2;
            switch (this.tag & 7) {
                case 0:
                    break;
                case 2:
                    int zzgz = this.zzwt.zzgz() + this.zzwt.zzgr();
                    do {
                        zzhu.zzaw(this.zzwt.zzgl());
                    } while (this.zzwt.zzgz() < zzgz);
                    zzaf(zzgz);
                    return;
                default:
                    throw zzic.zziw();
            }
            do {
                zzhu.zzaw(this.zzwt.zzgl());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
            return;
        }
        switch (this.tag & 7) {
            case 0:
                break;
            case 2:
                int zzgz2 = this.zzwt.zzgz() + this.zzwt.zzgr();
                do {
                    boolean add = list2.add(Integer.valueOf(this.zzwt.zzgl()));
                } while (this.zzwt.zzgz() < zzgz2);
                zzaf(zzgz2);
                return;
            default:
                throw zzic.zziw();
        }
        do {
            boolean add2 = list2.add(Integer.valueOf(this.zzwt.zzgl()));
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    public final void zzm(List<Long> list) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<Long> list2 = list;
        if (list2 instanceof zziq) {
            zziq zziq = (zziq) list2;
            switch (this.tag & 7) {
                case 1:
                    break;
                case 2:
                    int zzgr = this.zzwt.zzgr();
                    zzad(zzgr);
                    int zzgz = this.zzwt.zzgz() + zzgr;
                    do {
                        zziq.zzl(this.zzwt.zzgm());
                    } while (this.zzwt.zzgz() < zzgz);
                    return;
                default:
                    throw zzic.zziw();
            }
            do {
                zziq.zzl(this.zzwt.zzgm());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
            return;
        }
        switch (this.tag & 7) {
            case 1:
                break;
            case 2:
                int zzgr2 = this.zzwt.zzgr();
                zzad(zzgr2);
                int zzgz2 = this.zzwt.zzgz() + zzgr2;
                do {
                    boolean add = list2.add(Long.valueOf(this.zzwt.zzgm()));
                } while (this.zzwt.zzgz() < zzgz2);
                return;
            default:
                throw zzic.zziw();
        }
        do {
            boolean add2 = list2.add(Long.valueOf(this.zzwt.zzgm()));
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    public final void zzn(List<Integer> list) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<Integer> list2 = list;
        if (list2 instanceof zzhu) {
            zzhu zzhu = (zzhu) list2;
            switch (this.tag & 7) {
                case 2:
                    int zzgr = this.zzwt.zzgr();
                    zzae(zzgr);
                    int zzgz = this.zzwt.zzgz() + zzgr;
                    do {
                        zzhu.zzaw(this.zzwt.zzgn());
                    } while (this.zzwt.zzgz() < zzgz);
                    return;
                case 5:
                    break;
                default:
                    throw zzic.zziw();
            }
            do {
                zzhu.zzaw(this.zzwt.zzgn());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
            return;
        }
        switch (this.tag & 7) {
            case 2:
                int zzgr2 = this.zzwt.zzgr();
                zzae(zzgr2);
                int zzgz2 = this.zzwt.zzgz() + zzgr2;
                do {
                    boolean add = list2.add(Integer.valueOf(this.zzwt.zzgn()));
                } while (this.zzwt.zzgz() < zzgz2);
                return;
            case 5:
                break;
            default:
                throw zzic.zziw();
        }
        do {
            boolean add2 = list2.add(Integer.valueOf(this.zzwt.zzgn()));
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    public final void zzo(List<Boolean> list) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<Boolean> list2 = list;
        if (list2 instanceof zzgd) {
            zzgd zzgd = (zzgd) list2;
            switch (this.tag & 7) {
                case 0:
                    break;
                case 2:
                    int zzgz = this.zzwt.zzgz() + this.zzwt.zzgr();
                    do {
                        zzgd.addBoolean(this.zzwt.zzgo());
                    } while (this.zzwt.zzgz() < zzgz);
                    zzaf(zzgz);
                    return;
                default:
                    throw zzic.zziw();
            }
            do {
                zzgd.addBoolean(this.zzwt.zzgo());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
            return;
        }
        switch (this.tag & 7) {
            case 0:
                break;
            case 2:
                int zzgz2 = this.zzwt.zzgz() + this.zzwt.zzgr();
                do {
                    boolean add = list2.add(Boolean.valueOf(this.zzwt.zzgo()));
                } while (this.zzwt.zzgz() < zzgz2);
                zzaf(zzgz2);
                return;
            default:
                throw zzic.zziw();
        }
        do {
            boolean add2 = list2.add(Boolean.valueOf(this.zzwt.zzgo()));
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    public final void readStringList(List<String> list) throws IOException {
        zza(list, false);
    }

    public final void zzp(List<String> list) throws IOException {
        zza(list, true);
    }

    private final void zza(List<String> list, boolean z) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<String> list2 = list;
        boolean z2 = z;
        if ((this.tag & 7) != 2) {
            throw zzic.zziw();
        } else if (!(list2 instanceof zzij) || z2) {
            do {
                boolean add = list2.add(z2 ? zzgp() : readString());
                if (!this.zzwt.zzgy()) {
                    zzgi = this.zzwt.zzgi();
                    i = zzgi;
                } else {
                    return;
                }
            } while (zzgi == this.tag);
            this.zzwv = i;
        } else {
            zzij zzij = (zzij) list2;
            do {
                zzij.zzc(zzgq());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
        }
    }

    public final <T> void zza(List<T> list, zzjs<T> zzjs, zzhf zzhf) throws IOException {
        int zzgi;
        int i;
        List<T> list2 = list;
        zzjs<T> zzjs2 = zzjs;
        zzhf zzhf2 = zzhf;
        if ((this.tag & 7) != 2) {
            throw zzic.zziw();
        }
        int i2 = this.tag;
        do {
            boolean add = list2.add(zzc(zzjs2, zzhf2));
            if (!this.zzwt.zzgy() && this.zzwv == 0) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == i2);
        this.zzwv = i;
    }

    public final <T> void zzb(List<T> list, zzjs<T> zzjs, zzhf zzhf) throws IOException {
        int zzgi;
        int i;
        List<T> list2 = list;
        zzjs<T> zzjs2 = zzjs;
        zzhf zzhf2 = zzhf;
        if ((this.tag & 7) != 3) {
            throw zzic.zziw();
        }
        int i2 = this.tag;
        do {
            boolean add = list2.add(zzd(zzjs2, zzhf2));
            if (!this.zzwt.zzgy() && this.zzwv == 0) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == i2);
        this.zzwv = i;
    }

    public final void zzq(List<zzgf> list) throws IOException {
        int zzgi;
        int i;
        List<zzgf> list2 = list;
        if ((this.tag & 7) != 2) {
            throw zzic.zziw();
        }
        do {
            boolean add = list2.add(zzgq());
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    public final void zzr(List<Integer> list) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<Integer> list2 = list;
        if (list2 instanceof zzhu) {
            zzhu zzhu = (zzhu) list2;
            switch (this.tag & 7) {
                case 0:
                    break;
                case 2:
                    int zzgz = this.zzwt.zzgz() + this.zzwt.zzgr();
                    do {
                        zzhu.zzaw(this.zzwt.zzgr());
                    } while (this.zzwt.zzgz() < zzgz);
                    zzaf(zzgz);
                    return;
                default:
                    throw zzic.zziw();
            }
            do {
                zzhu.zzaw(this.zzwt.zzgr());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
            return;
        }
        switch (this.tag & 7) {
            case 0:
                break;
            case 2:
                int zzgz2 = this.zzwt.zzgz() + this.zzwt.zzgr();
                do {
                    boolean add = list2.add(Integer.valueOf(this.zzwt.zzgr()));
                } while (this.zzwt.zzgz() < zzgz2);
                zzaf(zzgz2);
                return;
            default:
                throw zzic.zziw();
        }
        do {
            boolean add2 = list2.add(Integer.valueOf(this.zzwt.zzgr()));
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    public final void zzs(List<Integer> list) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<Integer> list2 = list;
        if (list2 instanceof zzhu) {
            zzhu zzhu = (zzhu) list2;
            switch (this.tag & 7) {
                case 0:
                    break;
                case 2:
                    int zzgz = this.zzwt.zzgz() + this.zzwt.zzgr();
                    do {
                        zzhu.zzaw(this.zzwt.zzgs());
                    } while (this.zzwt.zzgz() < zzgz);
                    zzaf(zzgz);
                    return;
                default:
                    throw zzic.zziw();
            }
            do {
                zzhu.zzaw(this.zzwt.zzgs());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
            return;
        }
        switch (this.tag & 7) {
            case 0:
                break;
            case 2:
                int zzgz2 = this.zzwt.zzgz() + this.zzwt.zzgr();
                do {
                    boolean add = list2.add(Integer.valueOf(this.zzwt.zzgs()));
                } while (this.zzwt.zzgz() < zzgz2);
                zzaf(zzgz2);
                return;
            default:
                throw zzic.zziw();
        }
        do {
            boolean add2 = list2.add(Integer.valueOf(this.zzwt.zzgs()));
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    public final void zzt(List<Integer> list) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<Integer> list2 = list;
        if (list2 instanceof zzhu) {
            zzhu zzhu = (zzhu) list2;
            switch (this.tag & 7) {
                case 2:
                    int zzgr = this.zzwt.zzgr();
                    zzae(zzgr);
                    int zzgz = this.zzwt.zzgz() + zzgr;
                    do {
                        zzhu.zzaw(this.zzwt.zzgt());
                    } while (this.zzwt.zzgz() < zzgz);
                    return;
                case 5:
                    break;
                default:
                    throw zzic.zziw();
            }
            do {
                zzhu.zzaw(this.zzwt.zzgt());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
            return;
        }
        switch (this.tag & 7) {
            case 2:
                int zzgr2 = this.zzwt.zzgr();
                zzae(zzgr2);
                int zzgz2 = this.zzwt.zzgz() + zzgr2;
                do {
                    boolean add = list2.add(Integer.valueOf(this.zzwt.zzgt()));
                } while (this.zzwt.zzgz() < zzgz2);
                return;
            case 5:
                break;
            default:
                throw zzic.zziw();
        }
        do {
            boolean add2 = list2.add(Integer.valueOf(this.zzwt.zzgt()));
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    public final void zzu(List<Long> list) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<Long> list2 = list;
        if (list2 instanceof zziq) {
            zziq zziq = (zziq) list2;
            switch (this.tag & 7) {
                case 1:
                    break;
                case 2:
                    int zzgr = this.zzwt.zzgr();
                    zzad(zzgr);
                    int zzgz = this.zzwt.zzgz() + zzgr;
                    do {
                        zziq.zzl(this.zzwt.zzgu());
                    } while (this.zzwt.zzgz() < zzgz);
                    return;
                default:
                    throw zzic.zziw();
            }
            do {
                zziq.zzl(this.zzwt.zzgu());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
            return;
        }
        switch (this.tag & 7) {
            case 1:
                break;
            case 2:
                int zzgr2 = this.zzwt.zzgr();
                zzad(zzgr2);
                int zzgz2 = this.zzwt.zzgz() + zzgr2;
                do {
                    boolean add = list2.add(Long.valueOf(this.zzwt.zzgu()));
                } while (this.zzwt.zzgz() < zzgz2);
                return;
            default:
                throw zzic.zziw();
        }
        do {
            boolean add2 = list2.add(Long.valueOf(this.zzwt.zzgu()));
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    public final void zzv(List<Integer> list) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<Integer> list2 = list;
        if (list2 instanceof zzhu) {
            zzhu zzhu = (zzhu) list2;
            switch (this.tag & 7) {
                case 0:
                    break;
                case 2:
                    int zzgz = this.zzwt.zzgz() + this.zzwt.zzgr();
                    do {
                        zzhu.zzaw(this.zzwt.zzgv());
                    } while (this.zzwt.zzgz() < zzgz);
                    zzaf(zzgz);
                    return;
                default:
                    throw zzic.zziw();
            }
            do {
                zzhu.zzaw(this.zzwt.zzgv());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
            return;
        }
        switch (this.tag & 7) {
            case 0:
                break;
            case 2:
                int zzgz2 = this.zzwt.zzgz() + this.zzwt.zzgr();
                do {
                    boolean add = list2.add(Integer.valueOf(this.zzwt.zzgv()));
                } while (this.zzwt.zzgz() < zzgz2);
                zzaf(zzgz2);
                return;
            default:
                throw zzic.zziw();
        }
        do {
            boolean add2 = list2.add(Integer.valueOf(this.zzwt.zzgv()));
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    public final void zzw(List<Long> list) throws IOException {
        int zzgi;
        int i;
        int zzgi2;
        int i2;
        List<Long> list2 = list;
        if (list2 instanceof zziq) {
            zziq zziq = (zziq) list2;
            switch (this.tag & 7) {
                case 0:
                    break;
                case 2:
                    int zzgz = this.zzwt.zzgz() + this.zzwt.zzgr();
                    do {
                        zziq.zzl(this.zzwt.zzgw());
                    } while (this.zzwt.zzgz() < zzgz);
                    zzaf(zzgz);
                    return;
                default:
                    throw zzic.zziw();
            }
            do {
                zziq.zzl(this.zzwt.zzgw());
                if (!this.zzwt.zzgy()) {
                    zzgi2 = this.zzwt.zzgi();
                    i2 = zzgi2;
                } else {
                    return;
                }
            } while (zzgi2 == this.tag);
            this.zzwv = i2;
            return;
        }
        switch (this.tag & 7) {
            case 0:
                break;
            case 2:
                int zzgz2 = this.zzwt.zzgz() + this.zzwt.zzgr();
                do {
                    boolean add = list2.add(Long.valueOf(this.zzwt.zzgw()));
                } while (this.zzwt.zzgz() < zzgz2);
                zzaf(zzgz2);
                return;
            default:
                throw zzic.zziw();
        }
        do {
            boolean add2 = list2.add(Long.valueOf(this.zzwt.zzgw()));
            if (!this.zzwt.zzgy()) {
                zzgi = this.zzwt.zzgi();
                i = zzgi;
            } else {
                return;
            }
        } while (zzgi == this.tag);
        this.zzwv = i;
    }

    private static void zzad(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzic.zziy();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void zza(java.util.Map<K, V> r16, com.google.android.gms.internal.firebase_auth.zzit<K, V> r17, com.google.android.gms.internal.firebase_auth.zzhf r18) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r10 = r0
            r11 = 2
            r10.zzac(r11)
            r10 = r0
            com.google.android.gms.internal.firebase_auth.zzgr r10 = r10.zzwt
            int r10 = r10.zzgr()
            r4 = r10
            r10 = r0
            com.google.android.gms.internal.firebase_auth.zzgr r10 = r10.zzwt
            r11 = r4
            int r10 = r10.zzu(r11)
            r5 = r10
            r10 = r2
            K r10 = r10.zzacl
            r6 = r10
            r10 = r2
            V r10 = r10.zzacn
            r7 = r10
        L_0x0025:
            r10 = r0
            int r10 = r10.zzhg()     // Catch:{ all -> 0x0067 }
            r14 = r10
            r10 = r14
            r11 = r14
            r8 = r11
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r10 == r11) goto L_0x0092
            r10 = r0
            com.google.android.gms.internal.firebase_auth.zzgr r10 = r10.zzwt     // Catch:{ all -> 0x0067 }
            boolean r10 = r10.zzgy()     // Catch:{ all -> 0x0067 }
            if (r10 != 0) goto L_0x0092
            r10 = r8
            switch(r10) {
                case 1: goto L_0x0072;
                case 2: goto L_0x007e;
                default: goto L_0x0040;
            }
        L_0x0040:
            r10 = r0
            boolean r10 = r10.zzhh()     // Catch:{ zzib -> 0x0053 }
            if (r10 != 0) goto L_0x0090
            com.google.android.gms.internal.firebase_auth.zzic r10 = new com.google.android.gms.internal.firebase_auth.zzic     // Catch:{ zzib -> 0x0053 }
            r14 = r10
            r10 = r14
            r11 = r14
            java.lang.String r12 = "Unable to parse map entry."
            r11.<init>(r12)     // Catch:{ zzib -> 0x0053 }
            throw r10     // Catch:{ zzib -> 0x0053 }
        L_0x0053:
            r10 = move-exception
            r10 = r0
            boolean r10 = r10.zzhh()     // Catch:{ all -> 0x0067 }
            if (r10 != 0) goto L_0x0091
            com.google.android.gms.internal.firebase_auth.zzic r10 = new com.google.android.gms.internal.firebase_auth.zzic     // Catch:{ all -> 0x0067 }
            r14 = r10
            r10 = r14
            r11 = r14
            java.lang.String r12 = "Unable to parse map entry."
            r11.<init>(r12)     // Catch:{ all -> 0x0067 }
            throw r10     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r10 = move-exception
            r9 = r10
            r10 = r0
            com.google.android.gms.internal.firebase_auth.zzgr r10 = r10.zzwt
            r11 = r5
            r10.zzv(r11)
            r10 = r9
            throw r10
        L_0x0072:
            r10 = r0
            r11 = r2
            com.google.android.gms.internal.firebase_auth.zzlb r11 = r11.zzack     // Catch:{ zzib -> 0x0053 }
            r12 = 0
            r13 = 0
            java.lang.Object r10 = r10.zza((com.google.android.gms.internal.firebase_auth.zzlb) r11, (java.lang.Class<?>) r12, (com.google.android.gms.internal.firebase_auth.zzhf) r13)     // Catch:{ zzib -> 0x0053 }
            r6 = r10
            goto L_0x0025
        L_0x007e:
            r10 = r0
            r11 = r2
            com.google.android.gms.internal.firebase_auth.zzlb r11 = r11.zzacm     // Catch:{ zzib -> 0x0053 }
            r12 = r2
            V r12 = r12.zzacn     // Catch:{ zzib -> 0x0053 }
            java.lang.Class r12 = r12.getClass()     // Catch:{ zzib -> 0x0053 }
            r13 = r3
            java.lang.Object r10 = r10.zza((com.google.android.gms.internal.firebase_auth.zzlb) r11, (java.lang.Class<?>) r12, (com.google.android.gms.internal.firebase_auth.zzhf) r13)     // Catch:{ zzib -> 0x0053 }
            r7 = r10
            goto L_0x0025
        L_0x0090:
            goto L_0x0025
        L_0x0091:
            goto L_0x0025
        L_0x0092:
            r10 = r1
            r11 = r6
            r12 = r7
            java.lang.Object r10 = r10.put(r11, r12)     // Catch:{ all -> 0x0067 }
            r10 = r0
            com.google.android.gms.internal.firebase_auth.zzgr r10 = r10.zzwt
            r11 = r5
            r10.zzv(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzgy.zza(java.util.Map, com.google.android.gms.internal.firebase_auth.zzit, com.google.android.gms.internal.firebase_auth.zzhf):void");
    }

    private final Object zza(zzlb zzlb, Class<?> cls, zzhf zzhf) throws IOException {
        Throwable th;
        Class<?> cls2 = cls;
        zzhf zzhf2 = zzhf;
        switch (zzgx.zzws[zzlb.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzgo());
            case 2:
                return zzgq();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzgs());
            case 5:
                return Integer.valueOf(zzgn());
            case 6:
                return Long.valueOf(zzgm());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzgl());
            case 9:
                return Long.valueOf(zzgk());
            case 10:
                zzhf zzhf3 = zzhf2;
                Class<?> cls3 = cls2;
                zzac(2);
                return zzc(zzjo.zzjv().zzf(cls3), zzhf3);
            case 11:
                return Integer.valueOf(zzgt());
            case 12:
                return Long.valueOf(zzgu());
            case 13:
                return Integer.valueOf(zzgv());
            case 14:
                return Long.valueOf(zzgw());
            case 15:
                return zzgp();
            case 16:
                return Integer.valueOf(zzgr());
            case 17:
                return Long.valueOf(zzgj());
            default:
                Throwable th2 = th;
                new RuntimeException("unsupported field type.");
                throw th2;
        }
    }

    private static void zzae(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzic.zziy();
        }
    }

    private final void zzaf(int i) throws IOException {
        if (this.zzwt.zzgz() != i) {
            throw zzic.zzir();
        }
    }
}
