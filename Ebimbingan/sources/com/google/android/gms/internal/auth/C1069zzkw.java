package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.C0978zzhm;
import java.util.List;

/* renamed from: com.google.android.gms.internal.auth.zzkw */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C1069zzkw {

    /* renamed from: com.google.android.gms.internal.auth.zzkw$zza */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    public static final class zza extends C0978zzhm<zza, C0002zza> implements C1013zziu {
        /* access modifiers changed from: private */
        public static final zza zzd;
        private static volatile C1025zzjf<zza> zze;
        private C0985zzht<String> zzc = C0978zzhm.zze();

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.auth.zzkw$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
        public static final class C0002zza extends C0978zzhm.zzb<zza, C0002zza> implements C1013zziu {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private C0002zza() {
                super(zza.zzd);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ C0002zza(C1071zzky zzky) {
                this();
                C1071zzky zzky2 = zzky;
            }
        }

        public final List<String> zzi() {
            return this.zzc;
        }

        public static zza zza(byte[] bArr) throws C0984zzhs {
            return (zza) C0978zzhm.zza(zzd, bArr);
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            C1025zzjf<zza> zzjf;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (C1071zzky.zza[i - 1]) {
                case 1:
                    new zza();
                    return obj4;
                case 2:
                    new C0002zza((C1071zzky) null);
                    return obj3;
                case 3:
                    return zza((C1011zzis) zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzc"});
                case 4:
                    return zzd;
                case 5:
                    C1025zzjf<zza> zzjf2 = zze;
                    C1025zzjf<zza> zzjf3 = zzjf2;
                    if (zzjf2 == null) {
                        Class<zza> cls = zza.class;
                        Class<zza> cls2 = cls;
                        synchronized (cls) {
                            try {
                                C1025zzjf<zza> zzjf4 = zze;
                                zzjf3 = zzjf4;
                                if (zzjf4 == null) {
                                    new C0978zzhm.zza(zzd);
                                    C1025zzjf<zza> zzjf5 = zzjf;
                                    zzjf3 = zzjf5;
                                    zze = zzjf5;
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Class<zza> cls3 = cls2;
                                throw th3;
                            }
                        }
                    }
                    return zzjf3;
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
            zza zza2 = zza;
            zzd = zza2;
            C0978zzhm.zza(zza.class, zza2);
        }
    }
}
