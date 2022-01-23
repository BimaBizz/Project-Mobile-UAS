package com.google.android.gms.internal.auth;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class zzcx<T> {
    private static final Object zza;
    @Nullable
    private static volatile zzde zzb = null;
    private static volatile boolean zzc = false;
    private static final AtomicReference<Collection<zzcx<?>>> zzd;
    private static zzdj zze;
    private static final AtomicInteger zzi;
    private final zzdf zzf;
    private final String zzg;
    private final T zzh;
    private volatile int zzj;
    private volatile T zzk;
    private final boolean zzl;

    /* JADX INFO: finally extract failed */
    public static void zza(Context context) {
        Object obj;
        zzdv zzdv;
        zzde zzde;
        Context context2 = context;
        if (zzb == null) {
            Object obj2 = zza;
            Object obj3 = obj2;
            synchronized (obj2) {
                try {
                    if (zzb == null) {
                        Context context3 = context2;
                        Object obj4 = zza;
                        obj = obj4;
                        synchronized (obj4) {
                            zzde zzde2 = zzb;
                            Context applicationContext = context3.getApplicationContext();
                            Context context4 = applicationContext;
                            if (applicationContext == null) {
                                context4 = context3;
                            }
                            if (zzde2 == null || zzde2.zza() != context4) {
                                zzcj.zzb();
                                zzdh.zza();
                                zzco.zza();
                                new zzcw(context4);
                                new zzcg(context4, zzdu.zza(zzdv));
                                zzb = zzde;
                                int incrementAndGet = zzi.incrementAndGet();
                            }
                        }
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj5 = obj3;
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract T zza(Object obj);

    static void zza() {
        int incrementAndGet = zzi.incrementAndGet();
    }

    private zzcx(zzdf zzdf, String str, T t, boolean z) {
        Throwable th;
        Throwable th2;
        zzdf zzdf2 = zzdf;
        String str2 = str;
        T t2 = t;
        boolean z2 = z;
        this.zzj = -1;
        if (zzdf2.zza == null && zzdf2.zzb == null) {
            Throwable th3 = th2;
            new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw th3;
        } else if (zzdf2.zza == null || zzdf2.zzb == null) {
            this.zzf = zzdf2;
            this.zzg = str2;
            this.zzh = t2;
            this.zzl = z2;
        } else {
            Throwable th4 = th;
            new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
            throw th4;
        }
    }

    private final String zza(String str) {
        String str2;
        String str3 = str;
        if (str3 != null && str3.isEmpty()) {
            return this.zzg;
        }
        String valueOf = String.valueOf(str3);
        String valueOf2 = String.valueOf(this.zzg);
        String str4 = valueOf2;
        if (valueOf2.length() != 0) {
            return valueOf.concat(str4);
        }
        new String(valueOf);
        return str2;
    }

    public final String zzb() {
        return zza(this.zzf.zzd);
    }

    /* JADX INFO: finally extract failed */
    public final T zzc() {
        T t;
        T t2;
        if (!this.zzl) {
            zzdq.zzb(zze.zza(this.zzg), (Object) "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i = zzi.get();
        if (this.zzj < i) {
            synchronized (this) {
                try {
                    if (this.zzj < i) {
                        zzde zzde = zzb;
                        zzde zzde2 = zzde;
                        zzdq.zzb(zzde != null, (Object) "Must call PhenotypeFlag.init() first");
                        zzde zzde3 = zzde2;
                        if (this.zzf.zzf) {
                            T zzb2 = zzb(zzde3);
                            T t3 = zzb2;
                            if (zzb2 != null) {
                                t = t3;
                            } else {
                                T zza2 = zza(zzde3);
                                T t4 = zza2;
                                if (zza2 != null) {
                                    t = t4;
                                }
                                t = this.zzh;
                            }
                        } else {
                            T zza3 = zza(zzde3);
                            T t5 = zza3;
                            if (zza3 != null) {
                                t = t5;
                            } else {
                                T zzb3 = zzb(zzde3);
                                T t6 = zzb3;
                                if (zzb3 != null) {
                                    t = t6;
                                }
                                t = this.zzh;
                            }
                        }
                        T t7 = t;
                        zzdr zza4 = zzde2.zzb().zza();
                        zzdr zzdr = zza4;
                        if (zza4.zza()) {
                            String zza5 = ((zzct) zzdr.zzb()).zza(this.zzf.zzb, this.zzf.zza, this.zzf.zzd, this.zzg);
                            t2 = zza5 == null ? this.zzh : zza((Object) zza5);
                        } else {
                            t2 = t7;
                        }
                        this.zzk = t2;
                        this.zzj = i;
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
        return this.zzk;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00fc  */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final T zza(com.google.android.gms.internal.auth.zzde r14) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r7 = r0
            r8 = r1
            r5 = r8
            com.google.android.gms.internal.auth.zzdf r7 = r7.zzf
            boolean r7 = r7.zzg
            if (r7 != 0) goto L_0x00d2
            r7 = r5
            android.content.Context r7 = r7.zza()
            com.google.android.gms.internal.auth.zzco r7 = com.google.android.gms.internal.auth.zzco.zza((android.content.Context) r7)
            java.lang.String r8 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r7 = r7.zza((java.lang.String) r8)
            java.lang.String r7 = (java.lang.String) r7
            r11 = r7
            r7 = r11
            r8 = r11
            r6 = r8
            if (r7 == 0) goto L_0x00cf
            java.util.regex.Pattern r7 = com.google.android.gms.internal.auth.zzcf.zzb
            r8 = r6
            java.util.regex.Matcher r7 = r7.matcher(r8)
            boolean r7 = r7.matches()
            if (r7 == 0) goto L_0x00cf
            r7 = 1
        L_0x0031:
            if (r7 == 0) goto L_0x00d2
            r7 = 1
        L_0x0034:
            if (r7 != 0) goto L_0x00fc
            r7 = 0
            r2 = r7
            r7 = r0
            com.google.android.gms.internal.auth.zzdf r7 = r7.zzf
            android.net.Uri r7 = r7.zzb
            if (r7 == 0) goto L_0x00e9
            r7 = r1
            android.content.Context r7 = r7.zza()
            r8 = r0
            com.google.android.gms.internal.auth.zzdf r8 = r8.zzf
            android.net.Uri r8 = r8.zzb
            boolean r7 = com.google.android.gms.internal.auth.zzcv.zza(r7, r8)
            if (r7 == 0) goto L_0x00b4
            r7 = r0
            com.google.android.gms.internal.auth.zzdf r7 = r7.zzf
            boolean r7 = r7.zzh
            if (r7 == 0) goto L_0x00d5
            r7 = r1
            android.content.Context r7 = r7.zza()
            android.content.ContentResolver r7 = r7.getContentResolver()
            r8 = r0
            com.google.android.gms.internal.auth.zzdf r8 = r8.zzf
            android.net.Uri r8 = r8.zzb
            java.lang.String r8 = r8.getLastPathSegment()
            r3 = r8
            r8 = r1
            android.content.Context r8 = r8.zza()
            java.lang.String r8 = r8.getPackageName()
            r4 = r8
            r8 = 1
            r9 = r3
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r9 = r9.length()
            int r8 = r8 + r9
            r9 = r4
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r9 = r9.length()
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r11 = r8
            r12 = r9
            r8 = r12
            r9 = r11
            r10 = r12
            r11 = r9
            r12 = r10
            r9 = r12
            r10 = r11
            r9.<init>(r10)
            r9 = r3
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = "#"
            java.lang.StringBuilder r8 = r8.append(r9)
            r9 = r4
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = com.google.android.gms.internal.auth.zzcu.zza(r8)
            com.google.android.gms.internal.auth.zzcj r7 = com.google.android.gms.internal.auth.zzcj.zza(r7, r8)
            r2 = r7
        L_0x00b4:
            r7 = r2
            if (r7 == 0) goto L_0x00f9
            r7 = r2
            r8 = r0
            java.lang.String r8 = r8.zzb()
            java.lang.Object r7 = r7.zza(r8)
            r11 = r7
            r7 = r11
            r8 = r11
            r3 = r8
            if (r7 == 0) goto L_0x00f9
            r7 = r0
            r8 = r3
            java.lang.Object r7 = r7.zza((java.lang.Object) r8)
            r0 = r7
        L_0x00ce:
            return r0
        L_0x00cf:
            r7 = 0
            goto L_0x0031
        L_0x00d2:
            r7 = 0
            goto L_0x0034
        L_0x00d5:
            r7 = r1
            android.content.Context r7 = r7.zza()
            android.content.ContentResolver r7 = r7.getContentResolver()
            r8 = r0
            com.google.android.gms.internal.auth.zzdf r8 = r8.zzf
            android.net.Uri r8 = r8.zzb
            com.google.android.gms.internal.auth.zzcj r7 = com.google.android.gms.internal.auth.zzcj.zza(r7, r8)
            r2 = r7
            goto L_0x00b4
        L_0x00e9:
            r7 = r1
            android.content.Context r7 = r7.zza()
            r8 = r0
            com.google.android.gms.internal.auth.zzdf r8 = r8.zzf
            java.lang.String r8 = r8.zza
            com.google.android.gms.internal.auth.zzdh r7 = com.google.android.gms.internal.auth.zzdh.zza((android.content.Context) r7, (java.lang.String) r8)
            r2 = r7
            goto L_0x00b4
        L_0x00f9:
            r7 = 0
            r0 = r7
            goto L_0x00ce
        L_0x00fc:
            java.lang.String r7 = "PhenotypeFlag"
            r8 = 3
            boolean r7 = android.util.Log.isLoggable(r7, r8)
            if (r7 == 0) goto L_0x00f9
            java.lang.String r7 = "PhenotypeFlag"
            java.lang.String r8 = "Bypass reading Phenotype values for flag: "
            r9 = r0
            java.lang.String r9 = r9.zzb()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r11 = r9
            r9 = r11
            r10 = r11
            int r10 = r10.length()
            if (r10 == 0) goto L_0x0127
            java.lang.String r8 = r8.concat(r9)
        L_0x0122:
            int r7 = android.util.Log.d(r7, r8)
            goto L_0x00f9
        L_0x0127:
            java.lang.String r9 = new java.lang.String
            r11 = r8
            r12 = r9
            r8 = r12
            r9 = r11
            r10 = r12
            r11 = r9
            r12 = r10
            r9 = r12
            r10 = r11
            r9.<init>(r10)
            goto L_0x0122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcx.zza(com.google.android.gms.internal.auth.zzde):java.lang.Object");
    }

    @Nullable
    private final T zzb(zzde zzde) {
        zzde zzde2 = zzde;
        if (!this.zzf.zze && (this.zzf.zzi == null || this.zzf.zzi.zza(zzde2.zza()).booleanValue())) {
            Object zza2 = zzco.zza(zzde2.zza()).zza(this.zzf.zze ? null : zza(this.zzf.zzc));
            Object obj = zza2;
            if (zza2 != null) {
                return zza(obj);
            }
        }
        return null;
    }

    private static zzcx<Long> zzb(zzdf zzdf, String str, long j, boolean z) {
        zzcx<Long> zzcx;
        boolean z2 = z;
        new zzcy(zzdf, str, Long.valueOf(j), true);
        return zzcx;
    }

    private static zzcx<Boolean> zzb(zzdf zzdf, String str, boolean z, boolean z2) {
        zzcx<Boolean> zzcx;
        boolean z3 = z2;
        new zzdb(zzdf, str, Boolean.valueOf(z), true);
        return zzcx;
    }

    private static zzcx<Double> zzb(zzdf zzdf, String str, double d, boolean z) {
        zzcx<Double> zzcx;
        double d2 = d;
        boolean z2 = z;
        new zzda(zzdf, str, Double.valueOf(0.0d), true);
        return zzcx;
    }

    private static <T> zzcx<T> zzb(zzdf zzdf, String str, T t, zzdc<T> zzdc, boolean z) {
        zzcx<T> zzcx;
        boolean z2 = z;
        new zzdd(zzdf, str, t, true, zzdc);
        return zzcx;
    }

    static final /* synthetic */ zzdr zzb(Context context) {
        new zzcs();
        return zzcs.zza(context);
    }

    static final /* synthetic */ boolean zzd() {
        return true;
    }

    static /* synthetic */ zzcx zza(zzdf zzdf, String str, long j, boolean z) {
        boolean z2 = z;
        return zzb(zzdf, str, j, true);
    }

    static /* synthetic */ zzcx zza(zzdf zzdf, String str, boolean z, boolean z2) {
        boolean z3 = z2;
        return zzb(zzdf, str, z, true);
    }

    static /* synthetic */ zzcx zza(zzdf zzdf, String str, double d, boolean z) {
        double d2 = d;
        boolean z2 = z;
        return zzb(zzdf, str, 0.0d, true);
    }

    static /* synthetic */ zzcx zza(zzdf zzdf, String str, Object obj, zzdc zzdc, boolean z) {
        boolean z2 = z;
        return zzb(zzdf, str, obj, zzdc, true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzcx(zzdf zzdf, String str, Object obj, boolean z, zzcy zzcy) {
        this(zzdf, str, obj, z);
        zzcy zzcy2 = zzcy;
    }

    static {
        Object obj;
        AtomicReference<Collection<zzcx<?>>> atomicReference;
        zzdj zzdj;
        AtomicInteger atomicInteger;
        new Object();
        zza = obj;
        new AtomicReference<>();
        zzd = atomicReference;
        new zzdj(zzcz.zza);
        zze = zzdj;
        new AtomicInteger();
        zzi = atomicInteger;
    }
}
