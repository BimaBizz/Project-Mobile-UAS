package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;
import org.shaded.apache.commons.logging.impl.SimpleLog;

public final class zzlg {

    public static final class zza extends zzhs<zza, C0000zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zza zzagx;
        private static volatile zzjm<zza> zzs;
        private String zzagt = "";
        private String zzagu = "";
        private String zzagv = "";
        private String zzagw = "";
        private String zzbb = "";

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.firebase_auth.zzlg$zza$zza  reason: collision with other inner class name */
        public static final class C0000zza extends zzhs.zza<zza, C0000zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private C0000zza() {
                super(zza.zzagx);
            }

            public final C0000zza zzdn(String str) {
                zzid();
                ((zza) this.zzaah).zzdm(str);
                return this;
            }

            public final C0000zza zzdo(String str) {
                zzid();
                ((zza) this.zzaah).zzcm(str);
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ C0000zza(zzli zzli) {
                this();
                zzli zzli2 = zzli;
            }
        }

        /* access modifiers changed from: private */
        public final void zzdm(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzagt = str2;
        }

        /* access modifiers changed from: private */
        public final void zzcm(String str) {
            Throwable th;
            String str2 = str;
            if (str2 == null) {
                Throwable th2 = th;
                new NullPointerException();
                throw th2;
            }
            this.zzbb = str2;
        }

        public static C0000zza zzkz() {
            return (C0000zza) zzagx.zzij();
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
            switch (zzli.zzt[i - 1]) {
                case 1:
                    new zza();
                    return obj4;
                case 2:
                    new C0000zza((zzli) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[5];
                    objArr[0] = "zzagt";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzagu";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzbb";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzagv";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzagw";
                    return zza((zzjc) zzagx, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", objArr5);
                case 4:
                    return zzagx;
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
                                    new zzhs.zzc(zzagx);
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
                case SimpleLog.LOG_LEVEL_FATAL /*6*/:
                    return 1;
                case SimpleLog.LOG_LEVEL_OFF /*7*/:
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
            zzagx = zza;
            zzhs.zza(zza.class, zzagx);
        }
    }

    public static final class zzb extends zzhs<zzb, zza> implements zzje {
        /* access modifiers changed from: private */
        public static final zzb zzahc;
        private static volatile zzjm<zzb> zzs;
        private String zzagy = "";
        private String zzagz = "";
        private String zzaha = "";
        private long zzahb;
        private String zzaw = "";
        private String zzbb = "";
        private long zzbc;

        private zzb() {
        }

        public static final class zza extends zzhs.zza<zzb, zza> implements zzje {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private zza() {
                super(zzb.zzahc);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ zza(zzli zzli) {
                this();
                zzli zzli2 = zzli;
            }
        }

        public final String getAccessToken() {
            return this.zzagy;
        }

        public final long zzt() {
            return this.zzbc;
        }

        public final String zzeu() {
            return this.zzagz;
        }

        public final String zzs() {
            return this.zzbb;
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
            switch (zzli.zzt[i - 1]) {
                case 1:
                    new zzb();
                    return obj4;
                case 2:
                    new zza((zzli) null);
                    return obj3;
                case 3:
                    Object[] objArr = new Object[7];
                    objArr[0] = "zzagy";
                    Object[] objArr2 = objArr;
                    objArr2[1] = "zzbc";
                    Object[] objArr3 = objArr2;
                    objArr3[2] = "zzagz";
                    Object[] objArr4 = objArr3;
                    objArr4[3] = "zzbb";
                    Object[] objArr5 = objArr4;
                    objArr5[4] = "zzaw";
                    Object[] objArr6 = objArr5;
                    objArr6[5] = "zzaha";
                    Object[] objArr7 = objArr6;
                    objArr7[6] = "zzahb";
                    return zza((zzjc) zzahc, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0002", objArr7);
                case 4:
                    return zzahc;
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
                                    new zzhs.zzc(zzahc);
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
                case SimpleLog.LOG_LEVEL_FATAL /*6*/:
                    return 1;
                case SimpleLog.LOG_LEVEL_OFF /*7*/:
                    return null;
                default:
                    Throwable th4 = th;
                    new UnsupportedOperationException();
                    throw th4;
            }
        }

        public static zzjm<zzb> zzm() {
            zzb zzb = zzahc;
            int i = zzhs.zzd.zzaat;
            int i2 = i;
            return (zzjm) zzb.zza(i, (Object) null, (Object) null);
        }

        static {
            zzb zzb;
            new zzb();
            zzahc = zzb;
            zzhs.zza(zzb.class, zzahc);
        }
    }
}
