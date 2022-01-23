package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;
import java.util.List;

public final class zzp {

    public static final class zza extends zzhs<zza, C0004zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zza zzak;
        private static volatile zzjm<zza> zzs;
        private String zzaa = "";
        private String zzab = "";
        private String zzac = "";
        private String zzad = "";
        private String zzae = "";
        private String zzaf = "";
        private String zzag = "";
        private zzhz<zzl> zzah = zzim();
        private String zzai = "";
        private long zzaj;
        private int zzo;
        private String zzu = "";
        private String zzv = "";
        private String zzw = "";
        private String zzx = "";
        private String zzy = "";
        private String zzz = "";

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.firebase_auth.zzp$zza$zza  reason: collision with other inner class name */
        public static final class C0004zza extends zzhs.zza<zza, C0004zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private C0004zza() {
                super(zza.zzak);
            }

            public final C0004zza zza(String str) {
                zzid();
                ((zza) this.zzaah).zzd(str);
                return this;
            }

            public final C0004zza zzb(String str) {
                zzid();
                ((zza) this.zzaah).zze(str);
                return this;
            }

            public final C0004zza zzc(String str) {
                zzid();
                ((zza) this.zzaah).zzf(str);
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ C0004zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        /* access modifiers changed from: private */
        public final void zzd(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 1;
            this.zzu = str2;
        }

        /* access modifiers changed from: private */
        public final void zze(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 2;
            this.zzv = str2;
        }

        /* access modifiers changed from: private */
        public final void zzf(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 8192;
            this.zzai = str2;
        }

        public static C0004zza zzd() {
            return (C0004zza) zzak.zzij();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zza> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zza();
                    return obj4;
                case 2:
                    new C0004zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[18];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzu";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzv";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzw";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzx";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzy";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzz";
                    Object[] objArr8 = objArr7;
                    objArr8[7] = "zzaa";
                    Object[] objArr9 = objArr8;
                    objArr9[8] = "zzab";
                    Object[] objArr10 = objArr9;
                    objArr10[9] = "zzac";
                    Object[] objArr11 = objArr10;
                    objArr11[10] = "zzad";
                    Object[] objArr12 = objArr11;
                    objArr12[11] = "zzae";
                    Object[] objArr13 = objArr12;
                    objArr13[12] = "zzaf";
                    Object[] objArr14 = objArr13;
                    objArr14[13] = "zzag";
                    Object[] objArr15 = objArr14;
                    objArr15[14] = "zzah";
                    Object[] objArr16 = objArr15;
                    objArr16[15] = zzl.class;
                    Object[] objArr17 = objArr16;
                    objArr17[16] = "zzai";
                    Object[] objArr18 = objArr17;
                    objArr18[17] = "zzaj";
                    return zza((zzjc) zzak, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\b\b\u0007\t\b\b\n\b\t\u000b\b\n\f\b\u000b\r\b\f\u000e\u001b\u000f\b\r\u0010\u0003\u000e", objArr18);
                case 4:
                    return zzak;
                case 5:
                    zzjm<zza> zzjm2 = zzs;
                    zzjm<zza> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zza> cls = zza.class;
                        Class<zza> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zza> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzak);
                                    zzjm<zza> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zza> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return 1;
                case 7:
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        static {
            zza zza;
            new zza();
            zzak = zza;
            zzhs.zza(zza.class, zzak);
        }
    }

    public static final class zzb extends zzhs<zzb, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzb zzat;
        private static volatile zzjm<zzb> zzs;
        private String zzaf = "";
        private String zzal = "";
        private String zzam = "";
        private zzhz<String> zzan = zzhs.zzim();
        private boolean zzao;
        private boolean zzap;
        private boolean zzaq;
        private zzhz<String> zzar = zzhs.zzim();
        private byte zzas = 2;
        private int zzo;
        private String zzx = "";

        private zzb() {
        }

        public static final class zza extends zzhs.zza<zzb, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzb.zzat);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        public final String zzf() {
            return this.zzam;
        }

        public final List<String> zzg() {
            return this.zzan;
        }

        public final int zzh() {
            return this.zzan.size();
        }

        public final boolean zzi() {
            return this.zzao;
        }

        public final String getProviderId() {
            return this.zzx;
        }

        public final boolean zzj() {
            return this.zzap;
        }

        public final List<String> zzk() {
            return this.zzar;
        }

        public final int zzl() {
            return this.zzar.size();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzb> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzb();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[10];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzal";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzam";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzan";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzao";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzx";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzap";
                    Object[] objArr8 = objArr7;
                    objArr8[7] = "zzaq";
                    Object[] objArr9 = objArr8;
                    objArr9[8] = "zzaf";
                    Object[] objArr10 = objArr9;
                    objArr10[9] = "zzar";
                    return zza((zzjc) zzat, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0001\u0001Ԉ\u0000\u0002\b\u0001\u0003\u001a\u0004\u0007\u0002\u0005\b\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\b\u0006\t\u001a", objArr10);
                case 4:
                    return zzat;
                case 5:
                    zzjm<zzb> zzjm2 = zzs;
                    zzjm<zzb> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzb> cls = zzb.class;
                        Class<zzb> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzb> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzat);
                                    zzjm<zzb> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzb> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return Byte.valueOf(this.zzas);
                case 7:
                    this.zzas = (byte) (obj5 == null ? 0 : 1);
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        public static zzjm<zzb> zzm() {
            zzb zzb = zzat;
            int i = zzhs.zzd.zzaat;
            int i2 = i;
            return (zzjm) zzb.zza(i, (Object) null, (Object) null);
        }

        static {
            zzb zzb;
            new zzb();
            zzat = zzb;
            zzhs.zza(zzb.class, zzat);
        }
    }

    public static final class zzc extends zzhs<zzc, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzc zzax;
        private static volatile zzjm<zzc> zzs;
        private String zzau = "";
        private long zzav;
        private String zzaw = "";
        private int zzo;

        private zzc() {
        }

        public static final class zza extends zzhs.zza<zzc, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzc.zzax);
            }

            public final zza zzg(String str) {
                zzid();
                ((zzc) this.zzaah).zzh(str);
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        /* access modifiers changed from: private */
        public final void zzh(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 4;
            this.zzaw = str2;
        }

        public static zza zzo() {
            return (zza) zzax.zzij();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzc> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzc();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[4];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzau";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzav";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzaw";
                    return zza((zzjc) zzax, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\b\u0002", objArr4);
                case 4:
                    return zzax;
                case 5:
                    zzjm<zzc> zzjm2 = zzs;
                    zzjm<zzc> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzc> cls = zzc.class;
                        Class<zzc> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzc> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzax);
                                    zzjm<zzc> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzc> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return 1;
                case 7:
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        static {
            zzc zzc;
            new zzc();
            zzax = zzc;
            zzhs.zza(zzc.class, zzax);
        }
    }

    public static final class zzd extends zzhs<zzd, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzd zzba;
        private static volatile zzjm<zzd> zzs;
        private String zzai = "";
        private long zzaj;
        private String zzaw = "";
        private String zzay = "";
        private String zzaz = "";
        private int zzo;

        private zzd() {
        }

        public static final class zza extends zzhs.zza<zzd, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzd.zzba);
            }

            public final zza zzi(String str) {
                zzid();
                ((zzd) this.zzaah).zzm(str);
                return this;
            }

            public final zza zzj(String str) {
                zzid();
                ((zzd) this.zzaah).zzn(str);
                return this;
            }

            public final zza zzk(String str) {
                zzid();
                ((zzd) this.zzaah).zzh(str);
                return this;
            }

            public final zza zzl(String str) {
                zzid();
                ((zzd) this.zzaah).zzf(str);
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        /* access modifiers changed from: private */
        public final void zzm(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 1;
            this.zzay = str2;
        }

        /* access modifiers changed from: private */
        public final void zzn(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 2;
            this.zzaz = str2;
        }

        /* access modifiers changed from: private */
        public final void zzh(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 4;
            this.zzaw = str2;
        }

        /* access modifiers changed from: private */
        public final void zzf(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 8;
            this.zzai = str2;
        }

        public static zza zzq() {
            return (zza) zzba.zzij();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzd> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzd();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[6];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzay";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzaz";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzaw";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzai";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzaj";
                    return zza((zzjc) zzba, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0006\b\u0003\u0007\u0003\u0004", objArr6);
                case 4:
                    return zzba;
                case 5:
                    zzjm<zzd> zzjm2 = zzs;
                    zzjm<zzd> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzd> cls = zzd.class;
                        Class<zzd> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzd> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzba);
                                    zzjm<zzd> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzd> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return 1;
                case 7:
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        static {
            zzd zzd;
            new zzd();
            zzba = zzd;
            zzhs.zza(zzd.class, zzba);
        }
    }

    public static final class zze extends zzhs<zze, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zze zzbe;
        private static volatile zzjm<zze> zzs;
        private String zzal = "";
        private byte zzas = 2;
        private String zzau = "";
        private String zzaw = "";
        private String zzaz = "";
        private String zzbb = "";
        private long zzbc;
        private boolean zzbd;
        private int zzo;

        private zze() {
        }

        public static final class zza extends zzhs.zza<zze, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zze.zzbe);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        public final String getIdToken() {
            return this.zzaw;
        }

        public final String getEmail() {
            return this.zzaz;
        }

        public final String zzs() {
            return this.zzbb;
        }

        public final long zzt() {
            return this.zzbc;
        }

        public final String getLocalId() {
            return this.zzau;
        }

        public final boolean zzu() {
            return this.zzbd;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zze> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zze();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[8];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzal";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzaw";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzaz";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzbb";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzbc";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzau";
                    Object[] objArr8 = objArr7;
                    objArr8[7] = "zzbd";
                    return zza((zzjc) zzbe, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001Ԉ\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\u0002\u0004\u0006\b\u0005\u0007\u0007\u0006", objArr8);
                case 4:
                    return zzbe;
                case 5:
                    zzjm<zze> zzjm2 = zzs;
                    zzjm<zze> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zze> cls = zze.class;
                        Class<zze> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zze> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzbe);
                                    zzjm<zze> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zze> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return Byte.valueOf(this.zzas);
                case 7:
                    this.zzas = (byte) (obj5 == null ? 0 : 1);
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        public static zzjm<zze> zzm() {
            zze zze = zzbe;
            int i = zzhs.zzd.zzaat;
            int i2 = i;
            return (zzjm) zze.zza(i, (Object) null, (Object) null);
        }

        static {
            zze zze;
            new zze();
            zzbe = zze;
            zzhs.zza(zze.class, zzbe);
        }
    }

    public static final class zzf extends zzhs<zzf, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzf zzbh;
        private static volatile zzjm<zzf> zzs;
        private long zzav;
        private String zzaw = "";
        private zzhz<String> zzbf = zzhs.zzim();
        private zzhz<String> zzbg = zzhs.zzim();
        private int zzo;

        private zzf() {
        }

        public static final class zza extends zzhs.zza<zzf, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzf.zzbh);
            }

            public final zza zzo(String str) {
                zzid();
                ((zzf) this.zzaah).zzh(str);
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        /* access modifiers changed from: private */
        public final void zzh(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 1;
            this.zzaw = str2;
        }

        public static zza zzw() {
            return (zza) zzbh.zzij();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzf> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzf();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[5];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzaw";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzbf";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzbg";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzav";
                    return zza((zzjc) zzbh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\b\u0000\u0002\u001a\u0003\u001a\u0004\u0002\u0001", objArr5);
                case 4:
                    return zzbh;
                case 5:
                    zzjm<zzf> zzjm2 = zzs;
                    zzjm<zzf> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzf> cls = zzf.class;
                        Class<zzf> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzf> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzbh);
                                    zzjm<zzf> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzf> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return 1;
                case 7:
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        static {
            zzf zzf;
            new zzf();
            zzbh = zzf;
            zzhs.zza(zzf.class, zzbh);
        }
    }

    public static final class zzg extends zzhs<zzg, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzg zzbj;
        private static volatile zzjm<zzg> zzs;
        private String zzal = "";
        private byte zzas = 2;
        private zzhz<zzz> zzbi = zzim();
        private int zzo;

        private zzg() {
        }

        public static final class zza extends zzhs.zza<zzg, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzg.zzbj);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        public final int zzy() {
            return this.zzbi.size();
        }

        public final zzz zzb(int i) {
            return (zzz) this.zzbi.get(i);
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzg> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzg();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[4];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzal";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzbi";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = zzz.class;
                    return zza((zzjc) zzbj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Ԉ\u0000\u0002\u001b", objArr4);
                case 4:
                    return zzbj;
                case 5:
                    zzjm<zzg> zzjm2 = zzs;
                    zzjm<zzg> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzg> cls = zzg.class;
                        Class<zzg> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzg> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzbj);
                                    zzjm<zzg> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzg> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return Byte.valueOf(this.zzas);
                case 7:
                    this.zzas = (byte) (obj5 == null ? 0 : 1);
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        public static zzjm<zzg> zzm() {
            zzg zzg = zzbj;
            int i = zzhs.zzd.zzaat;
            int i2 = i;
            return (zzjm) zzg.zza(i, (Object) null, (Object) null);
        }

        static {
            zzg zzg;
            new zzg();
            zzbj = zzg;
            zzhs.zza(zzg.class, zzbj);
        }
    }

    public static final class zzh extends zzhs<zzh, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzh zzby;
        private static volatile zzjm<zzh> zzs;
        private String zzai = "";
        private long zzaj;
        private String zzaw = "";
        private String zzaz = "";
        private int zzbk;
        private String zzbl = "";
        private String zzbm = "";
        private String zzbn = "";
        private String zzbo = "";
        private String zzbp = "";
        private String zzbq = "";
        private String zzbr = "";
        private String zzbs = "";
        private boolean zzbt;
        private String zzbu = "";
        private boolean zzbv;
        private String zzbw = "";
        private boolean zzbx;
        private int zzo;

        private zzh() {
        }

        public static final class zza extends zzhs.zza<zzh, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzh.zzby);
            }

            public final zza zza(zzfw zzfw) {
                zzid();
                ((zzh) this.zzaah).zzb(zzfw);
                return this;
            }

            public final zza zzp(String str) {
                zzid();
                ((zzh) this.zzaah).zzn(str);
                return this;
            }

            public final zza zzq(String str) {
                zzid();
                ((zzh) this.zzaah).zzz(str);
                return this;
            }

            public final zza zzr(String str) {
                zzid();
                ((zzh) this.zzaah).zzh(str);
                return this;
            }

            public final zza zzs(String str) {
                zzid();
                ((zzh) this.zzaah).zzaa(str);
                return this;
            }

            public final zza zzt(String str) {
                zzid();
                ((zzh) this.zzaah).zzab(str);
                return this;
            }

            public final zza zzu(String str) {
                zzid();
                ((zzh) this.zzaah).zzac(str);
                return this;
            }

            public final zza zzv(String str) {
                zzid();
                ((zzh) this.zzaah).zzad(str);
                return this;
            }

            public final zza zza(boolean z) {
                zzid();
                ((zzh) this.zzaah).zzc(z);
                return this;
            }

            public final zza zzw(String str) {
                zzid();
                ((zzh) this.zzaah).zzae(str);
                return this;
            }

            public final zza zzb(boolean z) {
                zzid();
                ((zzh) this.zzaah).zzd(z);
                return this;
            }

            public final zza zzx(String str) {
                zzid();
                ((zzh) this.zzaah).zzf(str);
                return this;
            }

            public final zza zzy(String str) {
                zzid();
                ((zzh) this.zzaah).zzaf(str);
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        /* access modifiers changed from: private */
        public final void zzb(zzfw zzfw) {
            Throwable th;
            zzfw zzfw2 = zzfw;
            if (zzfw2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 1;
            this.zzbk = zzfw2.zzbq();
        }

        /* access modifiers changed from: private */
        public final void zzn(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 2;
            this.zzaz = str2;
        }

        /* access modifiers changed from: private */
        public final void zzz(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 32;
            this.zzbo = str2;
        }

        /* access modifiers changed from: private */
        public final void zzh(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 64;
            this.zzaw = str2;
        }

        /* access modifiers changed from: private */
        public final void zzaa(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 128;
            this.zzbp = str2;
        }

        /* access modifiers changed from: private */
        public final void zzab(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 256;
            this.zzbq = str2;
        }

        /* access modifiers changed from: private */
        public final void zzac(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 512;
            this.zzbr = str2;
        }

        /* access modifiers changed from: private */
        public final void zzad(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 1024;
            this.zzbs = str2;
        }

        /* access modifiers changed from: private */
        public final void zzc(boolean z) {
            this.zzo |= 2048;
            this.zzbt = z;
        }

        /* access modifiers changed from: private */
        public final void zzae(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 4096;
            this.zzbu = str2;
        }

        /* access modifiers changed from: private */
        public final void zzd(boolean z) {
            this.zzo |= 8192;
            this.zzbv = z;
        }

        /* access modifiers changed from: private */
        public final void zzf(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 16384;
            this.zzai = str2;
        }

        /* access modifiers changed from: private */
        public final void zzaf(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 65536;
            this.zzbw = str2;
        }

        public static zza zzaa() {
            return (zza) zzby.zzij();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzh> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzh();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[20];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzbk";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = zzfw.zzbr();
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzaz";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzbl";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzbm";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzbn";
                    Object[] objArr8 = objArr7;
                    objArr8[7] = "zzbo";
                    Object[] objArr9 = objArr8;
                    objArr9[8] = "zzaw";
                    Object[] objArr10 = objArr9;
                    objArr10[9] = "zzbp";
                    Object[] objArr11 = objArr10;
                    objArr11[10] = "zzbq";
                    Object[] objArr12 = objArr11;
                    objArr12[11] = "zzbr";
                    Object[] objArr13 = objArr12;
                    objArr13[12] = "zzbs";
                    Object[] objArr14 = objArr13;
                    objArr14[13] = "zzbt";
                    Object[] objArr15 = objArr14;
                    objArr15[14] = "zzbu";
                    Object[] objArr16 = objArr15;
                    objArr16[15] = "zzbv";
                    Object[] objArr17 = objArr16;
                    objArr17[16] = "zzai";
                    Object[] objArr18 = objArr17;
                    objArr18[17] = "zzaj";
                    Object[] objArr19 = objArr18;
                    objArr19[18] = "zzbw";
                    Object[] objArr20 = objArr19;
                    objArr20[19] = "zzbx";
                    return zza((zzjc) zzby, "\u0001\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\b\b\u0007\t\b\b\n\b\t\u000b\b\n\f\u0007\u000b\r\b\f\u000e\u0007\r\u000f\b\u000e\u0010\u0003\u000f\u0012\b\u0010\u0013\u0007\u0011", objArr20);
                case 4:
                    return zzby;
                case 5:
                    zzjm<zzh> zzjm2 = zzs;
                    zzjm<zzh> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzh> cls = zzh.class;
                        Class<zzh> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzh> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzby);
                                    zzjm<zzh> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzh> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return 1;
                case 7:
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        static {
            zzh zzh;
            new zzh();
            zzby = zzh;
            zzhs.zza(zzh.class, zzby);
        }
    }

    public static final class zzi extends zzhs<zzi, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzi zzcb;
        private static volatile zzjm<zzi> zzs;
        private String zzai = "";
        private long zzaj;
        private String zzay = "";
        private String zzaz = "";
        private String zzbz = "";
        private String zzca = "";
        private int zzo;

        private zzi() {
        }

        public static final class zza extends zzhs.zza<zzi, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzi.zzcb);
            }

            public final zza zzag(String str) {
                zzid();
                ((zzi) this.zzaah).zzm(str);
                return this;
            }

            public final zza zzah(String str) {
                zzid();
                ((zzi) this.zzaah).zzaj(str);
                return this;
            }

            public final zza zzai(String str) {
                zzid();
                ((zzi) this.zzaah).zzf(str);
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        /* access modifiers changed from: private */
        public final void zzm(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 1;
            this.zzay = str2;
        }

        /* access modifiers changed from: private */
        public final void zzaj(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 2;
            this.zzbz = str2;
        }

        /* access modifiers changed from: private */
        public final void zzf(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 16;
            this.zzai = str2;
        }

        public static zza zzac() {
            return (zza) zzcb.zzij();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzi> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzi();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[7];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzay";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzbz";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzca";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzaz";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzai";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzaj";
                    return zza((zzjc) zzcb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0006\b\u0004\u0007\u0003\u0005", objArr7);
                case 4:
                    return zzcb;
                case 5:
                    zzjm<zzi> zzjm2 = zzs;
                    zzjm<zzi> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzi> cls = zzi.class;
                        Class<zzi> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzi> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzcb);
                                    zzjm<zzi> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzi> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return 1;
                case 7:
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        static {
            zzi zzi;
            new zzi();
            zzcb = zzi;
            zzhs.zza(zzi.class, zzcb);
        }
    }

    public static final class zzj extends zzhs<zzj, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzj zzcd;
        private static volatile zzjm<zzj> zzs;
        private String zzal = "";
        private byte zzas = 2;
        private String zzaz = "";
        private String zzbo = "";
        private int zzcc;
        private int zzo;

        private zzj() {
        }

        public static final class zza extends zzhs.zza<zzj, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzj.zzcd);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        public final String getEmail() {
            return this.zzaz;
        }

        public final String zzae() {
            return this.zzbo;
        }

        public final zzfw zzaf() {
            zzfw zzk = zzfw.zzk(this.zzcc);
            return zzk == null ? zzfw.zzvd : zzk;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzj> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzj();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[6];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzal";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzaz";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzbo";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzcc";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = zzfw.zzbr();
                    return zza((zzjc) zzcd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001Ԉ\u0000\u0002\b\u0001\u0003\b\u0002\u0004\f\u0003", objArr6);
                case 4:
                    return zzcd;
                case 5:
                    zzjm<zzj> zzjm2 = zzs;
                    zzjm<zzj> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzj> cls = zzj.class;
                        Class<zzj> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzj> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzcd);
                                    zzjm<zzj> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzj> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return Byte.valueOf(this.zzas);
                case 7:
                    this.zzas = (byte) (obj5 == null ? 0 : 1);
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        public static zzjm<zzj> zzm() {
            zzj zzj = zzcd;
            int i = zzhs.zzd.zzaat;
            int i2 = i;
            return (zzjm) zzj.zza(i, (Object) null, (Object) null);
        }

        static {
            zzj zzj;
            new zzj();
            zzcd = zzj;
            zzhs.zza(zzj.class, zzcd);
        }
    }

    public static final class zzk extends zzhs<zzk, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzk zzci;
        private static volatile zzjm<zzk> zzs;
        private String zzai = "";
        private long zzaj;
        private String zzce = "";
        private String zzcf = "";
        private String zzcg = "";
        private String zzch = "";
        private int zzo;

        private zzk() {
        }

        public static final class zza extends zzhs.zza<zzk, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzk.zzci);
            }

            public final zza zzak(String str) {
                zzid();
                ((zzk) this.zzaah).zzam(str);
                return this;
            }

            public final zza zzal(String str) {
                zzid();
                ((zzk) this.zzaah).zzf(str);
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        /* access modifiers changed from: private */
        public final void zzam(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 1;
            this.zzce = str2;
        }

        /* access modifiers changed from: private */
        public final void zzf(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 16;
            this.zzai = str2;
        }

        public static zza zzah() {
            return (zza) zzci.zzij();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzk> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzk();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[7];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzce";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzcf";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzcg";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzch";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzai";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzaj";
                    return zza((zzjc) zzci, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0003\u0005", objArr7);
                case 4:
                    return zzci;
                case 5:
                    zzjm<zzk> zzjm2 = zzs;
                    zzjm<zzk> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzk> cls = zzk.class;
                        Class<zzk> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzk> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzci);
                                    zzjm<zzk> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzk> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return 1;
                case 7:
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        static {
            zzk zzk;
            new zzk();
            zzci = zzk;
            zzhs.zza(zzk.class, zzci);
        }
    }

    public static final class zzl extends zzhs<zzl, zza> implements zzje {
        private static final zzia<Integer, zzv> zzcv;
        /* access modifiers changed from: private */
        public static final zzl zzda;
        private static volatile zzjm<zzl> zzs;
        private String zzai = "";
        private long zzaj;
        private String zzau = "";
        private long zzav;
        private String zzaw = "";
        private String zzay = "";
        private String zzaz = "";
        private String zzcj = "";
        private String zzck = "";
        private zzhz<String> zzcl = zzhs.zzim();
        private boolean zzcm;
        private boolean zzcn;
        private String zzco = "";
        private String zzcp = "";
        private zzkh zzcq;
        private boolean zzcr;
        private String zzcs = "";
        private String zzct = "";
        private zzhx zzcu = zzil();
        private boolean zzcw;
        private zzhz<String> zzcx = zzhs.zzim();
        private long zzcy;
        private long zzcz;
        private int zzo;

        private zzl() {
        }

        public static final class zza extends zzhs.zza<zzl, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzl.zzda);
            }

            public final zza zzap(String str) {
                zzid();
                ((zzl) this.zzaah).zzh(str);
                return this;
            }

            public final zza zzaq(String str) {
                zzid();
                ((zzl) this.zzaah).zzan(str);
                return this;
            }

            public final zza zzar(String str) {
                zzid();
                ((zzl) this.zzaah).zzn(str);
                return this;
            }

            public final zza zzas(String str) {
                zzid();
                ((zzl) this.zzaah).setPassword(str);
                return this;
            }

            public final zza zzat(String str) {
                zzid();
                ((zzl) this.zzaah).zzm(str);
                return this;
            }

            public final zza zzau(String str) {
                zzid();
                ((zzl) this.zzaah).zzao(str);
                return this;
            }

            public final zza zzc(Iterable<? extends zzv> iterable) {
                zzid();
                ((zzl) this.zzaah).zza(iterable);
                return this;
            }

            public final zza zzf(boolean z) {
                zzid();
                ((zzl) this.zzaah).zze(z);
                return this;
            }

            public final zza zzd(Iterable<String> iterable) {
                zzid();
                ((zzl) this.zzaah).zzb(iterable);
                return this;
            }

            public final zza zzav(String str) {
                zzid();
                ((zzl) this.zzaah).zzf(str);
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        /* access modifiers changed from: private */
        public final void zzh(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 1;
            this.zzaw = str2;
        }

        /* access modifiers changed from: private */
        public final void zzan(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 4;
            this.zzcj = str2;
        }

        /* access modifiers changed from: private */
        public final void zzn(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 8;
            this.zzaz = str2;
        }

        /* access modifiers changed from: private */
        public final void setPassword(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 16;
            this.zzck = str2;
        }

        /* access modifiers changed from: private */
        public final void zzm(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 32;
            this.zzay = str2;
        }

        /* access modifiers changed from: private */
        public final void zzao(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 16384;
            this.zzct = str2;
        }

        /* access modifiers changed from: private */
        public final void zza(Iterable<? extends zzv> iterable) {
            Iterable<? extends zzv> iterable2 = iterable;
            if (!this.zzcu.zzfx()) {
                zzhx zzhx = this.zzcu;
                int size = zzhx.size();
                this.zzcu = zzhx.zzav(size == 0 ? 10 : size << 1);
            }
            for (zzv zzbq : iterable2) {
                this.zzcu.zzaw(zzbq.zzbq());
            }
        }

        /* access modifiers changed from: private */
        public final void zze(boolean z) {
            this.zzo |= 32768;
            this.zzcw = z;
        }

        /* access modifiers changed from: private */
        public final void zzb(Iterable<String> iterable) {
            Iterable<String> iterable2 = iterable;
            if (!this.zzcx.zzfx()) {
                zzhz<String> zzhz = this.zzcx;
                int size = zzhz.size();
                this.zzcx = zzhz.zzo(size == 0 ? 10 : size << 1);
            }
            zzfx.zza(iterable2, this.zzcx);
        }

        /* access modifiers changed from: private */
        public final void zzf(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 262144;
            this.zzai = str2;
        }

        public static zza zzaj() {
            return (zza) zzda.zzij();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzl> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzl();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[25];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzaw";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzau";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzcj";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzaz";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzck";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzcl";
                    Object[] objArr8 = objArr7;
                    objArr8[7] = "zzay";
                    Object[] objArr9 = objArr8;
                    objArr9[8] = "zzcm";
                    Object[] objArr10 = objArr9;
                    objArr10[9] = "zzcn";
                    Object[] objArr11 = objArr10;
                    objArr11[10] = "zzco";
                    Object[] objArr12 = objArr11;
                    objArr12[11] = "zzcp";
                    Object[] objArr13 = objArr12;
                    objArr13[12] = "zzcq";
                    Object[] objArr14 = objArr13;
                    objArr14[13] = "zzcr";
                    Object[] objArr15 = objArr14;
                    objArr15[14] = "zzcs";
                    Object[] objArr16 = objArr15;
                    objArr16[15] = "zzav";
                    Object[] objArr17 = objArr16;
                    objArr17[16] = "zzct";
                    Object[] objArr18 = objArr17;
                    objArr18[17] = "zzcu";
                    Object[] objArr19 = objArr18;
                    objArr19[18] = zzv.zzbr();
                    Object[] objArr20 = objArr19;
                    objArr20[19] = "zzcw";
                    Object[] objArr21 = objArr20;
                    objArr21[20] = "zzcx";
                    Object[] objArr22 = objArr21;
                    objArr22[21] = "zzcy";
                    Object[] objArr23 = objArr22;
                    objArr23[22] = "zzcz";
                    Object[] objArr24 = objArr23;
                    objArr24[23] = "zzai";
                    Object[] objArr25 = objArr24;
                    objArr25[24] = "zzaj";
                    return zza((zzjc) zzda, "\u0001\u0017\u0000\u0001\u0002\u001a\u0017\u0000\u0003\u0000\u0002\b\u0000\u0003\b\u0001\u0004\b\u0002\u0005\b\u0003\u0006\b\u0004\u0007\u001a\b\b\u0005\t\u0007\u0006\n\u0007\u0007\u000b\b\b\f\b\t\r\t\n\u000e\u0007\u000b\u000f\b\f\u0010\u0002\r\u0011\b\u000e\u0012\u001e\u0013\u0007\u000f\u0014\u001a\u0015\u0002\u0010\u0016\u0002\u0011\u0019\b\u0012\u001a\u0003\u0013", objArr25);
                case 4:
                    return zzda;
                case 5:
                    zzjm<zzl> zzjm2 = zzs;
                    zzjm<zzl> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzl> cls = zzl.class;
                        Class<zzl> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzl> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzda);
                                    zzjm<zzl> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzl> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return 1;
                case 7:
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        static {
            zzia<Integer, zzv> zzia;
            zzl zzl;
            new zzq();
            zzcv = zzia;
            new zzl();
            zzda = zzl;
            zzhs.zza(zzl.class, zzda);
        }
    }

    public static final class zzm extends zzhs<zzm, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzm zzdd;
        private static volatile zzjm<zzm> zzs;
        private String zzal = "";
        private byte zzas = 2;
        private String zzau = "";
        private String zzaw = "";
        private String zzaz = "";
        private String zzbb = "";
        private long zzbc;
        private String zzbo = "";
        private String zzcj = "";
        private zzhz<String> zzcl = zzhs.zzim();
        private boolean zzcm;
        private String zzct = "";
        private zzhz<zzu> zzdb = zzim();
        private String zzdc = "";
        private int zzo;

        private zzm() {
        }

        public static final class zza extends zzhs.zza<zzm, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzm.zzdd);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        @Deprecated
        public final String getEmail() {
            return this.zzaz;
        }

        @Deprecated
        public final String getDisplayName() {
            return this.zzcj;
        }

        public final String getIdToken() {
            return this.zzaw;
        }

        @Deprecated
        public final List<zzu> zzal() {
            return this.zzdb;
        }

        @Deprecated
        public final String zzam() {
            return this.zzct;
        }

        public final String zzs() {
            return this.zzbb;
        }

        public final long zzt() {
            return this.zzbc;
        }

        public final String zzan() {
            return this.zzdc;
        }

        public final boolean zzao() {
            return this.zzcm;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzm> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzm();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[15];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzal";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzau";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzaz";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzcj";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzcl";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzaw";
                    Object[] objArr8 = objArr7;
                    objArr8[7] = "zzdb";
                    Object[] objArr9 = objArr8;
                    objArr9[8] = zzu.class;
                    Object[] objArr10 = objArr9;
                    objArr10[9] = "zzbo";
                    Object[] objArr11 = objArr10;
                    objArr11[10] = "zzct";
                    Object[] objArr12 = objArr11;
                    objArr12[11] = "zzbb";
                    Object[] objArr13 = objArr12;
                    objArr13[12] = "zzbc";
                    Object[] objArr14 = objArr13;
                    objArr14[13] = "zzdc";
                    Object[] objArr15 = objArr14;
                    objArr15[14] = "zzcm";
                    return zza((zzjc) zzdd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0002\u0001\u0001Ԉ\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\u001a\u0006\b\u0004\u0007\u001b\b\b\u0005\t\b\u0006\n\b\u0007\u000b\u0002\b\f\b\t\r\u0007\n", objArr15);
                case 4:
                    return zzdd;
                case 5:
                    zzjm<zzm> zzjm2 = zzs;
                    zzjm<zzm> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzm> cls = zzm.class;
                        Class<zzm> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzm> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzdd);
                                    zzjm<zzm> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzm> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return Byte.valueOf(this.zzas);
                case 7:
                    this.zzas = (byte) (obj5 == null ? 0 : 1);
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        public static zzjm<zzm> zzm() {
            zzm zzm = zzdd;
            int i = zzhs.zzd.zzaat;
            int i2 = i;
            return (zzjm) zzm.zza(i, (Object) null, (Object) null);
        }

        static {
            zzm zzm;
            new zzm();
            zzdd = zzm;
            zzhs.zza(zzm.class, zzdd);
        }
    }

    public static final class zzn extends zzhs<zzn, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzn zzdf;
        private static volatile zzjm<zzn> zzs;
        private String zzai = "";
        private long zzaj;
        private String zzaw = "";
        private String zzaz = "";
        private String zzcj = "";
        private String zzck = "";
        private boolean zzcm;
        private String zzco = "";
        private String zzcp = "";
        private String zzcs = "";
        private String zzct = "";
        private boolean zzde;
        private int zzo;

        private zzn() {
        }

        public static final class zza extends zzhs.zza<zzn, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzn.zzdf);
            }

            public final zza zzaw(String str) {
                zzid();
                ((zzn) this.zzaah).zzn(str);
                return this;
            }

            public final zza zzax(String str) {
                zzid();
                ((zzn) this.zzaah).setPassword(str);
                return this;
            }

            public final zza zzay(String str) {
                zzid();
                ((zzn) this.zzaah).zzf(str);
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        /* access modifiers changed from: private */
        public final void zzn(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 1;
            this.zzaz = str2;
        }

        /* access modifiers changed from: private */
        public final void setPassword(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 2;
            this.zzck = str2;
        }

        /* access modifiers changed from: private */
        public final void zzf(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 1024;
            this.zzai = str2;
        }

        public static zza zzaq() {
            return (zza) zzdf.zzij();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzn> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzn();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[13];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzaz";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzck";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzcj";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzco";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzcp";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzcs";
                    Object[] objArr8 = objArr7;
                    objArr8[7] = "zzaw";
                    Object[] objArr9 = objArr8;
                    objArr9[8] = "zzcm";
                    Object[] objArr10 = objArr9;
                    objArr10[9] = "zzct";
                    Object[] objArr11 = objArr10;
                    objArr11[10] = "zzde";
                    Object[] objArr12 = objArr11;
                    objArr12[11] = "zzai";
                    Object[] objArr13 = objArr12;
                    objArr13[12] = "zzaj";
                    return zza((zzjc) zzdf, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\b\u0007\u0007\t\b\b\n\u0007\t\r\b\n\u000e\u0003\u000b", objArr13);
                case 4:
                    return zzdf;
                case 5:
                    zzjm<zzn> zzjm2 = zzs;
                    zzjm<zzn> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzn> cls = zzn.class;
                        Class<zzn> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzn> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzdf);
                                    zzjm<zzn> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzn> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return 1;
                case 7:
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        static {
            zzn zzn;
            new zzn();
            zzdf = zzn;
            zzhs.zza(zzn.class, zzdf);
        }
    }

    public static final class zzo extends zzhs<zzo, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzo zzdg;
        private static volatile zzjm<zzo> zzs;
        private String zzal = "";
        private byte zzas = 2;
        private String zzau = "";
        private String zzaw = "";
        private String zzaz = "";
        private String zzbb = "";
        private long zzbc;
        private String zzcj = "";
        private int zzo;

        private zzo() {
        }

        public static final class zza extends zzhs.zza<zzo, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzo.zzdg);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        public final String getIdToken() {
            return this.zzaw;
        }

        public final String getDisplayName() {
            return this.zzcj;
        }

        public final String getEmail() {
            return this.zzaz;
        }

        public final String zzs() {
            return this.zzbb;
        }

        public final long zzt() {
            return this.zzbc;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzo> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzo();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[8];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzal";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzaw";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzcj";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzaz";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzbb";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzbc";
                    Object[] objArr8 = objArr7;
                    objArr8[7] = "zzau";
                    return zza((zzjc) zzdg, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0001\u0001Ԉ\u0000\u0002\b\u0001\u0004\b\u0002\u0005\b\u0003\u0006\b\u0004\u0007\u0002\u0005\b\b\u0006", objArr8);
                case 4:
                    return zzdg;
                case 5:
                    zzjm<zzo> zzjm2 = zzs;
                    zzjm<zzo> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzo> cls = zzo.class;
                        Class<zzo> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzo> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzdg);
                                    zzjm<zzo> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzo> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return Byte.valueOf(this.zzas);
                case 7:
                    this.zzas = (byte) (obj5 == null ? 0 : 1);
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        public static zzjm<zzo> zzm() {
            zzo zzo2 = zzdg;
            int i = zzhs.zzd.zzaat;
            int i2 = i;
            return (zzjm) zzo2.zza(i, (Object) null, (Object) null);
        }

        static {
            zzo zzo2;
            new zzo();
            zzdg = zzo2;
            zzhs.zza(zzo.class, zzdg);
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase_auth.zzp$zzp  reason: collision with other inner class name */
    public static final class C0005zzp extends zzhs<C0005zzp, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final C0005zzp zzdo;
        private static volatile zzjm<C0005zzp> zzs;
        private String zzaf = "";
        private String zzai = "";
        private long zzaj;
        private long zzav;
        private String zzaw = "";
        private String zzcs = "";
        private boolean zzcw;
        private String zzdh = "";
        private String zzdi = "";
        private String zzdj = "";
        private boolean zzdk;
        private boolean zzdl;
        private boolean zzdm = true;
        private String zzdn = "";
        private int zzo;

        private C0005zzp() {
        }

        /* renamed from: com.google.android.gms.internal.firebase_auth.zzp$zzp$zza */
        public static final class zza extends zzhs.zza<C0005zzp, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(C0005zzp.zzdo);
            }

            public final zza zzbd(String str) {
                zzid();
                ((C0005zzp) this.zzaah).zzaz(str);
                return this;
            }

            public final zza zzbe(String str) {
                zzid();
                ((C0005zzp) this.zzaah).zzba(str);
                return this;
            }

            public final zza zzbf(String str) {
                zzid();
                ((C0005zzp) this.zzaah).zzbb(str);
                return this;
            }

            public final zza zzbg(String str) {
                zzid();
                ((C0005zzp) this.zzaah).zzh(str);
                return this;
            }

            public final zza zzi(boolean z) {
                zzid();
                ((C0005zzp) this.zzaah).zze(z);
                return this;
            }

            public final zza zzj(boolean z) {
                zzid();
                ((C0005zzp) this.zzaah).zzg(z);
                return this;
            }

            public final zza zzk(boolean z) {
                zzid();
                ((C0005zzp) this.zzaah).zzh(z);
                return this;
            }

            public final zza zzbh(String str) {
                zzid();
                ((C0005zzp) this.zzaah).zzf(str);
                return this;
            }

            public final zza zzbi(String str) {
                zzid();
                ((C0005zzp) this.zzaah).zzbc(str);
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        /* access modifiers changed from: private */
        public final void zzaz(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 1;
            this.zzdh = str2;
        }

        /* access modifiers changed from: private */
        public final void zzba(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 2;
            this.zzdi = str2;
        }

        /* access modifiers changed from: private */
        public final void zzbb(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 16;
            this.zzaf = str2;
        }

        /* access modifiers changed from: private */
        public final void zzh(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 128;
            this.zzaw = str2;
        }

        /* access modifiers changed from: private */
        public final void zze(boolean z) {
            this.zzo |= 256;
            this.zzcw = z;
        }

        /* access modifiers changed from: private */
        public final void zzg(boolean z) {
            this.zzo |= 512;
            this.zzdl = z;
        }

        /* access modifiers changed from: private */
        public final void zzh(boolean z) {
            this.zzo |= 1024;
            this.zzdm = z;
        }

        /* access modifiers changed from: private */
        public final void zzf(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 2048;
            this.zzai = str2;
        }

        /* access modifiers changed from: private */
        public final void zzbc(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 8192;
            this.zzdn = str2;
        }

        public static zza zzat() {
            return (zza) zzdo.zzij();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<C0005zzp> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new C0005zzp();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[15];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzdh";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzdi";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzdj";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzdk";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzaf";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzcs";
                    Object[] objArr8 = objArr7;
                    objArr8[7] = "zzav";
                    Object[] objArr9 = objArr8;
                    objArr9[8] = "zzaw";
                    Object[] objArr10 = objArr9;
                    objArr10[9] = "zzcw";
                    Object[] objArr11 = objArr10;
                    objArr11[10] = "zzdl";
                    Object[] objArr12 = objArr11;
                    objArr12[11] = "zzdm";
                    Object[] objArr13 = objArr12;
                    objArr13[12] = "zzai";
                    Object[] objArr14 = objArr13;
                    objArr14[13] = "zzaj";
                    Object[] objArr15 = objArr14;
                    objArr15[14] = "zzdn";
                    return zza((zzjc) zzdo, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0007\u0003\u0005\b\u0004\u0006\b\u0005\u0007\u0002\u0006\b\b\u0007\t\u0007\b\n\u0007\t\u000b\u0007\n\r\b\u000b\u000e\u0003\f\u000f\b\r", objArr15);
                case 4:
                    return zzdo;
                case 5:
                    zzjm<C0005zzp> zzjm2 = zzs;
                    zzjm<C0005zzp> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<C0005zzp> cls = C0005zzp.class;
                        Class<C0005zzp> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<C0005zzp> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzdo);
                                    zzjm<C0005zzp> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<C0005zzp> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return 1;
                case 7:
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        static {
            C0005zzp zzp;
            new C0005zzp();
            zzdo = zzp;
            zzhs.zza(C0005zzp.class, zzdo);
        }
    }

    public static final class zzq extends zzhs<zzq, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzq zzet;
        private static volatile zzjm<zzq> zzs;
        private String zzab = "";
        private String zzai = "";
        private String zzau = "";
        private String zzaw = "";
        private String zzaz = "";
        private String zzbb = "";
        private long zzbc;
        private boolean zzbd;
        private String zzcj = "";
        private boolean zzcm;
        private String zzct = "";
        private String zzdn = "";
        private int zzdp;
        private String zzdq = "";
        private String zzdr = "";
        private String zzds = "";
        private String zzdt = "";
        private String zzdu = "";
        private String zzdv = "";
        private String zzdw = "";
        private String zzdx = "";
        private String zzdy = "";
        private String zzdz = "";
        private String zzea = "";
        private boolean zzeb;
        private String zzec = "";
        private zzhz<String> zzed = zzhs.zzim();
        private boolean zzee;
        private String zzef = "";
        private String zzeg = "";
        private String zzeh = "";
        private String zzei = "";
        private long zzej;
        private String zzek = "";
        private boolean zzel;
        private String zzem = "";
        private String zzen = "";
        private String zzeo = "";
        private String zzep = "";
        private String zzeq = "";
        private String zzer = "";
        private zzhz<zzr> zzes = zzim();
        private int zzo;
        private String zzx = "";
        private String zzz = "";

        private zzq() {
        }

        public static final class zza extends zzhs.zza<zzq, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzq.zzet);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        public final String getProviderId() {
            return this.zzx;
        }

        public final String getEmail() {
            return this.zzaz;
        }

        public final String zzam() {
            return this.zzct;
        }

        public final String getLocalId() {
            return this.zzau;
        }

        public final String getDisplayName() {
            return this.zzcj;
        }

        public final String getIdToken() {
            return this.zzaw;
        }

        public final boolean zzav() {
            return this.zzee;
        }

        public final String zzaw() {
            return this.zzeh;
        }

        public final boolean zzax() {
            return this.zzel;
        }

        public final String zzs() {
            return this.zzbb;
        }

        public final long zzt() {
            return this.zzbc;
        }

        public final String zzay() {
            return this.zzen;
        }

        public final String getRawUserInfo() {
            return this.zzep;
        }

        public final String getErrorMessage() {
            return this.zzeq;
        }

        public final boolean zzu() {
            return this.zzbd;
        }

        public final String zzaz() {
            return this.zzdn;
        }

        public final String zzba() {
            return this.zzai;
        }

        public final String zzbb() {
            return this.zzer;
        }

        public final List<zzr> zzbc() {
            return this.zzes;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzq> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzq();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[46];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzdp";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzdq";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzx";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzaz";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzcm";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzdr";
                    Object[] objArr8 = objArr7;
                    objArr8[7] = "zzds";
                    Object[] objArr9 = objArr8;
                    objArr9[8] = "zzdt";
                    Object[] objArr10 = objArr9;
                    objArr10[9] = "zzdu";
                    Object[] objArr11 = objArr10;
                    objArr11[10] = "zzdv";
                    Object[] objArr12 = objArr11;
                    objArr12[11] = "zzdw";
                    Object[] objArr13 = objArr12;
                    objArr13[12] = "zzct";
                    Object[] objArr14 = objArr13;
                    objArr14[13] = "zzdx";
                    Object[] objArr15 = objArr14;
                    objArr15[14] = "zzdy";
                    Object[] objArr16 = objArr15;
                    objArr16[15] = "zzz";
                    Object[] objArr17 = objArr16;
                    objArr17[16] = "zzdz";
                    Object[] objArr18 = objArr17;
                    objArr18[17] = "zzea";
                    Object[] objArr19 = objArr18;
                    objArr19[18] = "zzau";
                    Object[] objArr20 = objArr19;
                    objArr20[19] = "zzeb";
                    Object[] objArr21 = objArr20;
                    objArr21[20] = "zzcj";
                    Object[] objArr22 = objArr21;
                    objArr22[21] = "zzaw";
                    Object[] objArr23 = objArr22;
                    objArr23[22] = "zzec";
                    Object[] objArr24 = objArr23;
                    objArr24[23] = "zzab";
                    Object[] objArr25 = objArr24;
                    objArr25[24] = "zzed";
                    Object[] objArr26 = objArr25;
                    objArr26[25] = "zzee";
                    Object[] objArr27 = objArr26;
                    objArr27[26] = "zzef";
                    Object[] objArr28 = objArr27;
                    objArr28[27] = "zzeg";
                    Object[] objArr29 = objArr28;
                    objArr29[28] = "zzeh";
                    Object[] objArr30 = objArr29;
                    objArr30[29] = "zzei";
                    Object[] objArr31 = objArr30;
                    objArr31[30] = "zzej";
                    Object[] objArr32 = objArr31;
                    objArr32[31] = "zzek";
                    Object[] objArr33 = objArr32;
                    objArr33[32] = "zzel";
                    Object[] objArr34 = objArr33;
                    objArr34[33] = "zzem";
                    Object[] objArr35 = objArr34;
                    objArr35[34] = "zzbb";
                    Object[] objArr36 = objArr35;
                    objArr36[35] = "zzbc";
                    Object[] objArr37 = objArr36;
                    objArr37[36] = "zzen";
                    Object[] objArr38 = objArr37;
                    objArr38[37] = "zzeo";
                    Object[] objArr39 = objArr38;
                    objArr39[38] = "zzep";
                    Object[] objArr40 = objArr39;
                    objArr40[39] = "zzeq";
                    Object[] objArr41 = objArr40;
                    objArr41[40] = "zzbd";
                    Object[] objArr42 = objArr41;
                    objArr42[41] = "zzdn";
                    Object[] objArr43 = objArr42;
                    objArr43[42] = "zzai";
                    Object[] objArr44 = objArr43;
                    objArr44[43] = "zzer";
                    Object[] objArr45 = objArr44;
                    objArr45[44] = "zzes";
                    Object[] objArr46 = objArr45;
                    objArr46[45] = zzr.class;
                    return zza((zzjc) zzet, "\u0001+\u0000\u0002\u0001-+\u0000\u0002\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0007\u0003\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\b\b\u0007\t\b\b\n\b\t\u000b\b\n\f\b\u000b\r\b\f\u000e\b\r\u000f\b\u000e\u0010\b\u000f\u0011\b\u0010\u0012\u0007\u0011\u0013\b\u0012\u0014\b\u0013\u0015\b\u0014\u0017\b\u0015\u0018\u001a\u0019\u0007\u0016\u001a\b\u0017\u001b\b\u0018\u001c\b\u0019\u001d\b\u001a\u001e\u0002\u001b\u001f\b\u001c \u0007\u001d!\b\u001e\"\b\u001f#\u0002 $\b!%\b\"&\b#'\b$(\u0007%*\b&+\b',\b(-\u001b", objArr46);
                case 4:
                    return zzet;
                case 5:
                    zzjm<zzq> zzjm2 = zzs;
                    zzjm<zzq> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzq> cls = zzq.class;
                        Class<zzq> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzq> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzet);
                                    zzjm<zzq> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzq> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return 1;
                case 7:
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        public static zzjm<zzq> zzm() {
            zzq zzq = zzet;
            int i = zzhs.zzd.zzaat;
            int i2 = i;
            return (zzjm) zzq.zza(i, (Object) null, (Object) null);
        }

        static {
            zzq zzq;
            new zzq();
            zzet = zzq;
            zzhs.zza(zzq.class, zzet);
        }
    }

    public static final class zzr extends zzhs<zzr, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzr zzev;
        private static volatile zzjm<zzr> zzs;
        private String zzai = "";
        private long zzav;
        private String zzcs = "";
        private boolean zzcw;
        private String zzeu = "";
        private int zzo;

        private zzr() {
        }

        public static final class zza extends zzhs.zza<zzr, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzr.zzev);
            }

            public final zza zzbk(String str) {
                zzid();
                ((zzr) this.zzaah).zzbj(str);
                return this;
            }

            public final zza zzl(boolean z) {
                boolean z2 = z;
                zzid();
                zzr.zza((zzr) this.zzaah, true);
                return this;
            }

            public final zza zzbl(String str) {
                zzid();
                ((zzr) this.zzaah).zzf(str);
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        /* access modifiers changed from: private */
        public final void zzbj(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 1;
            this.zzeu = str2;
        }

        private final void zze(boolean z) {
            this.zzo |= 4;
            this.zzcw = z;
        }

        /* access modifiers changed from: private */
        public final void zzf(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 16;
            this.zzai = str2;
        }

        public static zza zzbe() {
            return (zza) zzev.zzij();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzr> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzr();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[6];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzeu";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzcs";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzcw";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzav";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzai";
                    return zza((zzjc) zzev, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u0002\u0003\u0005\b\u0004", objArr6);
                case 4:
                    return zzev;
                case 5:
                    zzjm<zzr> zzjm2 = zzs;
                    zzjm<zzr> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzr> cls = zzr.class;
                        Class<zzr> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzr> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzev);
                                    zzjm<zzr> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzr> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return 1;
                case 7:
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        static /* synthetic */ void zza(zzr zzr, boolean z) {
            boolean z2 = z;
            zzr.zze(true);
        }

        static {
            zzr zzr;
            new zzr();
            zzev = zzr;
            zzhs.zza(zzr.class, zzev);
        }
    }

    public static final class zzs extends zzhs<zzs, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzs zzew;
        private static volatile zzjm<zzs> zzs;
        private String zzal = "";
        private byte zzas = 2;
        private String zzaw = "";
        private String zzbb = "";
        private long zzbc;
        private boolean zzbd;
        private int zzo;

        private zzs() {
        }

        public static final class zza extends zzhs.zza<zzs, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzs.zzew);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        public final String getIdToken() {
            return this.zzaw;
        }

        public final String zzs() {
            return this.zzbb;
        }

        public final long zzt() {
            return this.zzbc;
        }

        public final boolean zzu() {
            return this.zzbd;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzs> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzs();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[6];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzal";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzaw";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzbb";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzbc";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzbd";
                    return zza((zzjc) zzew, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001Ԉ\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0002\u0003\u0005\u0007\u0004", objArr6);
                case 4:
                    return zzew;
                case 5:
                    zzjm<zzs> zzjm2 = zzs;
                    zzjm<zzs> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzs> cls = zzs.class;
                        Class<zzs> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzs> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzew);
                                    zzjm<zzs> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzs> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return Byte.valueOf(this.zzas);
                case 7:
                    this.zzas = (byte) (obj5 == null ? 0 : 1);
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        public static zzjm<zzs> zzm() {
            zzs zzs2 = zzew;
            int i = zzhs.zzd.zzaat;
            int i2 = i;
            return (zzjm) zzs2.zza(i, (Object) null, (Object) null);
        }

        static {
            zzs zzs2;
            new zzs();
            zzew = zzs2;
            zzhs.zza(zzs.class, zzew);
        }
    }

    public static final class zzt extends zzhs<zzt, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzt zzey;
        private static volatile zzjm<zzt> zzs;
        private String zzai = "";
        private long zzaj;
        private long zzav;
        private String zzaw = "";
        private String zzaz = "";
        private String zzck = "";
        private String zzco = "";
        private String zzcp = "";
        private String zzcs = "";
        private boolean zzcw;
        private String zzdj = "";
        private String zzex = "";
        private int zzo;

        private zzt() {
        }

        public static final class zza extends zzhs.zza<zzt, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzt.zzey);
            }

            public final zza zzbm(String str) {
                zzid();
                ((zzt) this.zzaah).zzn(str);
                return this;
            }

            public final zza zzbn(String str) {
                zzid();
                ((zzt) this.zzaah).setPassword(str);
                return this;
            }

            public final zza zzm(boolean z) {
                zzid();
                ((zzt) this.zzaah).zze(z);
                return this;
            }

            public final zza zzbo(String str) {
                zzid();
                ((zzt) this.zzaah).zzf(str);
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        /* access modifiers changed from: private */
        public final void zzn(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 1;
            this.zzaz = str2;
        }

        /* access modifiers changed from: private */
        public final void setPassword(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 2;
            this.zzck = str2;
        }

        /* access modifiers changed from: private */
        public final void zze(boolean z) {
            this.zzo |= 512;
            this.zzcw = z;
        }

        /* access modifiers changed from: private */
        public final void zzf(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzo |= 1024;
            this.zzai = str2;
        }

        public static zza zzbh() {
            return (zza) zzey.zzij();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzt> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzt();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[13];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzaz";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzck";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzdj";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzco";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzcp";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzex";
                    Object[] objArr8 = objArr7;
                    objArr8[7] = "zzcs";
                    Object[] objArr9 = objArr8;
                    objArr9[8] = "zzav";
                    Object[] objArr10 = objArr9;
                    objArr10[9] = "zzaw";
                    Object[] objArr11 = objArr10;
                    objArr11[10] = "zzcw";
                    Object[] objArr12 = objArr11;
                    objArr12[11] = "zzai";
                    Object[] objArr13 = objArr12;
                    objArr13[12] = "zzaj";
                    return zza((zzjc) zzey, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\b\u0002\u0007\t\b\b\n\u0007\t\u000b\b\n\f\u0003\u000b", objArr13);
                case 4:
                    return zzey;
                case 5:
                    zzjm<zzt> zzjm2 = zzs;
                    zzjm<zzt> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzt> cls = zzt.class;
                        Class<zzt> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzt> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzey);
                                    zzjm<zzt> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzt> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return 1;
                case 7:
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        static {
            zzt zzt;
            new zzt();
            zzey = zzt;
            zzhs.zza(zzt.class, zzey);
        }
    }

    public static final class zzu extends zzhs<zzu, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzu zzez;
        private static volatile zzjm<zzu> zzs;
        private String zzal = "";
        private boolean zzao;
        private byte zzas = 2;
        private String zzau = "";
        private String zzaw = "";
        private String zzaz = "";
        private String zzbb = "";
        private long zzbc;
        private String zzcj = "";
        private String zzct = "";
        private String zzeh = "";
        private long zzej;
        private String zzek = "";
        private String zzer = "";
        private zzhz<zzr> zzes = zzim();
        private int zzo;

        private zzu() {
        }

        public static final class zza extends zzhs.zza<zzu, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzu.zzez);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzo zzo) {
                this();
                zzo zzo2 = zzo;
            }
        }

        public final String getLocalId() {
            return this.zzau;
        }

        public final String getEmail() {
            return this.zzaz;
        }

        public final String getDisplayName() {
            return this.zzcj;
        }

        public final String getIdToken() {
            return this.zzaw;
        }

        public final String zzam() {
            return this.zzct;
        }

        public final String zzs() {
            return this.zzbb;
        }

        public final long zzt() {
            return this.zzbc;
        }

        public final String zzbb() {
            return this.zzer;
        }

        public final List<zzr> zzbc() {
            return this.zzes;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjm<zzu> zzjm;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzo.zzt[i - 1]) {
                case 1:
                    new zzu();
                    return obj4;
                case 2:
                    new zza((zzo) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[16];
                    objArr[0] = "zzo";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzal";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzau";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzaz";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzcj";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzaw";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzao";
                    Object[] objArr8 = objArr7;
                    objArr8[7] = "zzct";
                    Object[] objArr9 = objArr8;
                    objArr9[8] = "zzeh";
                    Object[] objArr10 = objArr9;
                    objArr10[9] = "zzej";
                    Object[] objArr11 = objArr10;
                    objArr11[10] = "zzek";
                    Object[] objArr12 = objArr11;
                    objArr12[11] = "zzbb";
                    Object[] objArr13 = objArr12;
                    objArr13[12] = "zzbc";
                    Object[] objArr14 = objArr13;
                    objArr14[13] = "zzer";
                    Object[] objArr15 = objArr14;
                    objArr15[14] = "zzes";
                    Object[] objArr16 = objArr15;
                    objArr16[15] = zzr.class;
                    return zza((zzjc) zzez, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0001\u0001\u0001Ԉ\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0007\u0005\u0007\b\u0006\b\b\u0007\t\u0002\b\n\b\t\u000b\b\n\f\u0002\u000b\u000e\b\f\u000f\u001b", objArr16);
                case 4:
                    return zzez;
                case 5:
                    zzjm<zzu> zzjm2 = zzs;
                    zzjm<zzu> zzjm3 = zzjm2;
                    if (zzjm2 == null) {
                        Class<zzu> cls = zzu.class;
                        Class<zzu> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjm<zzu> zzjm4 = zzs;
                                zzjm3 = zzjm4;
                                if (zzjm4 == null) {
                                    new zzhs.zzc(zzez);
                                    zzjm<zzu> zzjm5 = zzjm;
                                    zzjm3 = zzjm5;
                                    zzs = zzjm5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zzu> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjm3;
                case 6:
                    return Byte.valueOf(this.zzas);
                case 7:
                    this.zzas = (byte) (obj5 == null ? 0 : 1);
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        public static zzjm<zzu> zzm() {
            zzu zzu = zzez;
            int i = zzhs.zzd.zzaat;
            int i2 = i;
            return (zzjm) zzu.zza(i, (Object) null, (Object) null);
        }

        static {
            zzu zzu;
            new zzu();
            zzez = zzu;
            zzhs.zza(zzu.class, zzez);
        }
    }
}
