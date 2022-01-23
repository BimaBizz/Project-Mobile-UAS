package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzhm;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzkw {

    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    public static final class zza extends zzhm<zza, C0000zza> implements zziu {
        /* access modifiers changed from: private */
        public static final zza zzd;
        private static volatile zzjf<zza> zze;
        private zzht<String> zzc = zzhm.zze();

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.auth.zzkw$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
        public static final class C0000zza extends zzhm.zzb<zza, C0000zza> implements zziu {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private C0000zza() {
                super(zza.zzd);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            /* synthetic */ C0000zza(zzky zzky) {
                this();
                zzky zzky2 = zzky;
            }
        }

        public final List<String> zzi() {
            return this.zzc;
        }

        public static zza zza(byte[] bArr) throws zzhs {
            return (zza) zzhm.zza(zzd, bArr);
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            zzjf<zza> zzjf;
            Object obj3;
            Object obj4;
            Throwable th;
            Object obj5 = obj;
            Object obj6 = obj2;
            switch (zzky.zza[i - 1]) {
                case 1:
                    new zza();
                    return obj4;
                case 2:
                    new C0000zza((zzky) null);
                    return obj3;
                case 3:
                    return zza((zzis) zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzc"});
                case 4:
                    return zzd;
                case 5:
                    zzjf<zza> zzjf2 = zze;
                    zzjf<zza> zzjf3 = zzjf2;
                    if (zzjf2 == null) {
                        Class<zza> cls = zza.class;
                        Class<zza> cls2 = cls;
                        synchronized (cls) {
                            try {
                                zzjf<zza> zzjf4 = zze;
                                zzjf3 = zzjf4;
                                if (zzjf4 == null) {
                                    new zzhm.zza(zzd);
                                    zzjf<zza> zzjf5 = zzjf;
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
            zzhm.zza(zza.class, zza2);
        }
    }
}
