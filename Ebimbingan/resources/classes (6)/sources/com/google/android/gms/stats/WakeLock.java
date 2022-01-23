package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.providers.PooledExecutorsProvider;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@ShowFirstParty
@ThreadSafe
@KeepForSdk
public class WakeLock {
    private static ScheduledExecutorService zzn;
    private static volatile zza zzo;
    private final Object zza;
    private final PowerManager.WakeLock zzb;
    private WorkSource zzc;
    private final int zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final Context zzh;
    private boolean zzi;
    private final Map<String, Integer[]> zzj;
    private final Set<Future<?>> zzk;
    private int zzl;
    private AtomicInteger zzm;

    public interface zza {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WakeLock(@androidx.annotation.NonNull android.content.Context r11, int r12, @androidx.annotation.NonNull java.lang.String r13) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r0
            r5 = r1
            r6 = r2
            r7 = r3
            r8 = 0
            r9 = r1
            if (r9 != 0) goto L_0x0011
            r9 = 0
        L_0x000d:
            r4.<init>(r5, r6, r7, r8, r9)
            return
        L_0x0011:
            r9 = r1
            java.lang.String r9 = r9.getPackageName()
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.WakeLock.<init>(android.content.Context, int, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private WakeLock(@NonNull Context context, int i, @NonNull String str, @Nullable String str2, @NonNull String str3) {
        this(context, i, str, (String) null, str3, (String) null);
        String str4 = str2;
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private WakeLock(@NonNull Context context, int i, @NonNull String str, @Nullable String str2, @NonNull String str3, @Nullable String str4) {
        Map<String, Integer[]> map;
        Set set;
        AtomicInteger atomicInteger;
        String str5;
        String str6;
        String str7;
        Context context2 = context;
        int i2 = i;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        this.zza = this;
        this.zzi = true;
        new HashMap();
        this.zzj = map;
        new HashSet();
        this.zzk = Collections.synchronizedSet(set);
        new AtomicInteger(0);
        this.zzm = atomicInteger;
        Object checkNotNull = Preconditions.checkNotNull(context2, "WakeLock: context must not be null");
        String checkNotEmpty = Preconditions.checkNotEmpty(str8, "WakeLock: wakeLockName must not be empty");
        this.zzd = i2;
        this.zzf = null;
        this.zzg = null;
        this.zzh = context2.getApplicationContext();
        if (!"com.google.android.gms".equals(context2.getPackageName())) {
            String valueOf = String.valueOf("*gcore*:");
            String valueOf2 = String.valueOf(str8);
            String str12 = valueOf2;
            if (valueOf2.length() != 0) {
                str7 = valueOf.concat(str12);
            } else {
                String str13 = valueOf;
                str7 = str6;
                new String(str13);
            }
            this.zze = str7;
        } else {
            this.zze = str8;
        }
        this.zzb = ((PowerManager) context2.getSystemService("power")).newWakeLock(i2, str8);
        if (WorkSourceUtil.hasWorkSourcePermission(context2)) {
            if (Strings.isEmptyOrWhitespace(str10)) {
                str5 = context2.getPackageName();
            } else {
                str5 = str10;
            }
            this.zzc = WorkSourceUtil.fromPackage(context2, str5);
            WorkSource workSource = this.zzc;
            if (workSource != null && WorkSourceUtil.hasWorkSourcePermission(this.zzh)) {
                if (this.zzc != null) {
                    boolean add = this.zzc.add(workSource);
                } else {
                    this.zzc = workSource;
                }
                try {
                    this.zzb.setWorkSource(this.zzc);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    int wtf = Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (zzn == null) {
            zzn = PooledExecutorsProvider.getInstance().newSingleThreadScheduledExecutor();
        }
    }

    private final List<String> zza() {
        List<String> names = WorkSourceUtil.getNames(this.zzc);
        List<String> list = names;
        return names;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e6, code lost:
        if (r22 == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00fa, code lost:
        if (r12.zzl == 0) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00fc, code lost:
        com.google.android.gms.common.stats.WakeLockTracker.getInstance().registerEvent(r12.zzh, com.google.android.gms.common.stats.StatsUtils.getEventKey(r12.zzb, r16), 7, r12.zze, r16, (java.lang.String) null, r12.zzd, zza(), r14);
        r22 = r12;
        r22.zzl++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0069, code lost:
        if (r12.zzl > 0) goto L_0x006b;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void acquire(long r36) {
        /*
            r35 = this;
            r2 = r35
            r3 = r36
            r22 = r2
            r0 = r22
            java.util.concurrent.atomic.AtomicInteger r0 = r0.zzm
            r22 = r0
            int r22 = r22.incrementAndGet()
            r22 = r2
            r23 = r3
            r6 = r23
            r33 = r22
            r22 = r33
            r23 = r33
            r5 = r23
            r23 = r3
            r9 = r23
            r33 = r22
            r22 = r33
            r23 = r33
            r8 = r23
            r23 = 0
            r24 = r6
            r14 = r24
            r13 = r23
            r33 = r22
            r22 = r33
            r23 = r33
            r12 = r23
            r23 = 0
            java.lang.String r22 = r22.zza((java.lang.String) r23)
            r16 = r22
            r22 = r12
            r0 = r22
            java.lang.Object r0 = r0.zza
            r22 = r0
            r33 = r22
            r22 = r33
            r23 = r33
            r17 = r23
            monitor-enter(r22)
            r22 = r12
            r0 = r22
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r0.zzj     // Catch:{ all -> 0x019d }
            r22 = r0
            boolean r22 = r22.isEmpty()     // Catch:{ all -> 0x019d }
            if (r22 == 0) goto L_0x006b
            r22 = r12
            r0 = r22
            int r0 = r0.zzl     // Catch:{ all -> 0x019d }
            r22 = r0
            if (r22 <= 0) goto L_0x008e
        L_0x006b:
            r22 = r12
            r0 = r22
            android.os.PowerManager$WakeLock r0 = r0.zzb     // Catch:{ all -> 0x019d }
            r22 = r0
            boolean r22 = r22.isHeld()     // Catch:{ all -> 0x019d }
            if (r22 != 0) goto L_0x008e
            r22 = r12
            r0 = r22
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r0.zzj     // Catch:{ all -> 0x019d }
            r22 = r0
            r22.clear()     // Catch:{ all -> 0x019d }
            r22 = r12
            r23 = 0
            r0 = r23
            r1 = r22
            r1.zzl = r0     // Catch:{ all -> 0x019d }
        L_0x008e:
            r22 = r12
            r0 = r22
            boolean r0 = r0.zzi     // Catch:{ all -> 0x019d }
            r22 = r0
            if (r22 == 0) goto L_0x00e8
            r22 = r12
            r23 = r16
            r20 = r23
            r33 = r22
            r22 = r33
            r23 = r33
            r19 = r23
            r0 = r22
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r0.zzj     // Catch:{ all -> 0x019d }
            r22 = r0
            r23 = r20
            java.lang.Object r22 = r22.get(r23)     // Catch:{ all -> 0x019d }
            java.lang.Integer[] r22 = (java.lang.Integer[]) r22     // Catch:{ all -> 0x019d }
            r33 = r22
            r22 = r33
            r23 = r33
            r21 = r23
            if (r22 != 0) goto L_0x0181
            r22 = r19
            r0 = r22
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r0.zzj     // Catch:{ all -> 0x019d }
            r22 = r0
            r23 = r20
            r24 = 1
            r0 = r24
            java.lang.Integer[] r0 = new java.lang.Integer[r0]     // Catch:{ all -> 0x019d }
            r24 = r0
            r33 = r24
            r24 = r33
            r25 = r33
            r26 = 0
            r27 = 1
            java.lang.Integer r27 = java.lang.Integer.valueOf(r27)     // Catch:{ all -> 0x019d }
            r25[r26] = r27     // Catch:{ all -> 0x019d }
            java.lang.Object r22 = r22.put(r23, r24)     // Catch:{ all -> 0x019d }
            r22 = 1
        L_0x00e6:
            if (r22 != 0) goto L_0x00fc
        L_0x00e8:
            r22 = r12
            r0 = r22
            boolean r0 = r0.zzi     // Catch:{ all -> 0x019d }
            r22 = r0
            if (r22 != 0) goto L_0x014f
            r22 = r12
            r0 = r22
            int r0 = r0.zzl     // Catch:{ all -> 0x019d }
            r22 = r0
            if (r22 != 0) goto L_0x014f
        L_0x00fc:
            com.google.android.gms.common.stats.WakeLockTracker r22 = com.google.android.gms.common.stats.WakeLockTracker.getInstance()     // Catch:{ all -> 0x019d }
            r23 = r12
            r0 = r23
            android.content.Context r0 = r0.zzh     // Catch:{ all -> 0x019d }
            r23 = r0
            r24 = r12
            r0 = r24
            android.os.PowerManager$WakeLock r0 = r0.zzb     // Catch:{ all -> 0x019d }
            r24 = r0
            r25 = r16
            java.lang.String r24 = com.google.android.gms.common.stats.StatsUtils.getEventKey((android.os.PowerManager.WakeLock) r24, (java.lang.String) r25)     // Catch:{ all -> 0x019d }
            r25 = 7
            r26 = r12
            r0 = r26
            java.lang.String r0 = r0.zze     // Catch:{ all -> 0x019d }
            r26 = r0
            r27 = r16
            r28 = 0
            r29 = r12
            r0 = r29
            int r0 = r0.zzd     // Catch:{ all -> 0x019d }
            r29 = r0
            r30 = r12
            java.util.List r30 = r30.zza()     // Catch:{ all -> 0x019d }
            r31 = r14
            r22.registerEvent(r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x019d }
            r22 = r12
            r33 = r22
            r22 = r33
            r23 = r33
            r0 = r23
            int r0 = r0.zzl     // Catch:{ all -> 0x019d }
            r23 = r0
            r24 = 1
            int r23 = r23 + 1
            r0 = r23
            r1 = r22
            r1.zzl = r0     // Catch:{ all -> 0x019d }
        L_0x014f:
            r22 = r17
            monitor-exit(r22)     // Catch:{ all -> 0x019d }
            r22 = r8
            r0 = r22
            android.os.PowerManager$WakeLock r0 = r0.zzb
            r22 = r0
            r22.acquire()
            r22 = r6
            r24 = 0
            int r22 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r22 <= 0) goto L_0x0180
            r22 = r8
            r11 = r22
            java.util.concurrent.ScheduledExecutorService r22 = zzn
            com.google.android.gms.stats.zzb r23 = new com.google.android.gms.stats.zzb
            r33 = r23
            r23 = r33
            r24 = r33
            r25 = r11
            r24.<init>(r25)
            r24 = r9
            java.util.concurrent.TimeUnit r26 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r22 = r22.schedule(r23, r24, r26)
        L_0x0180:
            return
        L_0x0181:
            r22 = r21
            r23 = 0
            r24 = r21
            r25 = 0
            r24 = r24[r25]     // Catch:{ all -> 0x019d }
            int r24 = r24.intValue()     // Catch:{ all -> 0x019d }
            r25 = 1
            int r24 = r24 + 1
            java.lang.Integer r24 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x019d }
            r22[r23] = r24     // Catch:{ all -> 0x019d }
            r22 = 0
            goto L_0x00e6
        L_0x019d:
            r22 = move-exception
            r18 = r22
            r22 = r17
            monitor-exit(r22)     // Catch:{ all -> 0x019d }
            r22 = r18
            throw r22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.WakeLock.acquire(long):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006b, code lost:
        if (r12 == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
        if (r4.zzl == 1) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
        com.google.android.gms.common.stats.WakeLockTracker.getInstance().registerEvent(r4.zzh, com.google.android.gms.common.stats.StatsUtils.getEventKey(r4.zzb, r6), 8, r4.zze, r6, (java.lang.String) null, r4.zzd, zza());
        r12 = r4;
        r21 = r12;
        r21.zzl--;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r22 = this;
            r1 = r22
            r12 = r1
            r21 = r12
            r12 = r21
            r13 = r21
            r2 = r13
            java.util.concurrent.atomic.AtomicInteger r12 = r12.zzm
            int r12 = r12.decrementAndGet()
            if (r12 >= 0) goto L_0x0027
            java.lang.String r12 = "WakeLock"
            r13 = r2
            java.lang.String r13 = r13.zze
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r14 = " release without a matched acquire!"
            java.lang.String r13 = r13.concat(r14)
            int r12 = android.util.Log.e(r12, r13)
        L_0x0027:
            r12 = r2
            r21 = r12
            r12 = r21
            r13 = r21
            r3 = r13
            r13 = 0
            r5 = r13
            r21 = r12
            r12 = r21
            r13 = r21
            r4 = r13
            r13 = 0
            java.lang.String r12 = r12.zza((java.lang.String) r13)
            r6 = r12
            r12 = r4
            java.lang.Object r12 = r12.zza
            r21 = r12
            r12 = r21
            r13 = r21
            r7 = r13
            monitor-enter(r12)
            r12 = r4
            boolean r12 = r12.zzi     // Catch:{ all -> 0x00e6 }
            if (r12 == 0) goto L_0x006d
            r12 = r4
            r13 = r6
            r10 = r13
            r21 = r12
            r12 = r21
            r13 = r21
            r9 = r13
            java.util.Map<java.lang.String, java.lang.Integer[]> r12 = r12.zzj     // Catch:{ all -> 0x00e6 }
            r13 = r10
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x00e6 }
            java.lang.Integer[] r12 = (java.lang.Integer[]) r12     // Catch:{ all -> 0x00e6 }
            r21 = r12
            r12 = r21
            r13 = r21
            r11 = r13
            if (r12 != 0) goto L_0x00bc
            r12 = 0
        L_0x006b:
            if (r12 != 0) goto L_0x0078
        L_0x006d:
            r12 = r4
            boolean r12 = r12.zzi     // Catch:{ all -> 0x00e6 }
            if (r12 != 0) goto L_0x00b4
            r12 = r4
            int r12 = r12.zzl     // Catch:{ all -> 0x00e6 }
            r13 = 1
            if (r12 != r13) goto L_0x00b4
        L_0x0078:
            com.google.android.gms.common.stats.WakeLockTracker r12 = com.google.android.gms.common.stats.WakeLockTracker.getInstance()     // Catch:{ all -> 0x00e6 }
            r13 = r4
            android.content.Context r13 = r13.zzh     // Catch:{ all -> 0x00e6 }
            r14 = r4
            android.os.PowerManager$WakeLock r14 = r14.zzb     // Catch:{ all -> 0x00e6 }
            r15 = r6
            java.lang.String r14 = com.google.android.gms.common.stats.StatsUtils.getEventKey((android.os.PowerManager.WakeLock) r14, (java.lang.String) r15)     // Catch:{ all -> 0x00e6 }
            r15 = 8
            r16 = r4
            r0 = r16
            java.lang.String r0 = r0.zze     // Catch:{ all -> 0x00e6 }
            r16 = r0
            r17 = r6
            r18 = 0
            r19 = r4
            r0 = r19
            int r0 = r0.zzd     // Catch:{ all -> 0x00e6 }
            r19 = r0
            r20 = r4
            java.util.List r20 = r20.zza()     // Catch:{ all -> 0x00e6 }
            r12.registerEvent(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00e6 }
            r12 = r4
            r21 = r12
            r12 = r21
            r13 = r21
            int r13 = r13.zzl     // Catch:{ all -> 0x00e6 }
            r14 = 1
            int r13 = r13 + -1
            r12.zzl = r13     // Catch:{ all -> 0x00e6 }
        L_0x00b4:
            r12 = r7
            monitor-exit(r12)     // Catch:{ all -> 0x00e6 }
            r12 = r3
            r13 = 0
            r12.zza((int) r13)
            return
        L_0x00bc:
            r12 = r11
            r13 = 0
            r12 = r12[r13]     // Catch:{ all -> 0x00e6 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x00e6 }
            r13 = 1
            if (r12 != r13) goto L_0x00d1
            r12 = r9
            java.util.Map<java.lang.String, java.lang.Integer[]> r12 = r12.zzj     // Catch:{ all -> 0x00e6 }
            r13 = r10
            java.lang.Object r12 = r12.remove(r13)     // Catch:{ all -> 0x00e6 }
            r12 = 1
            goto L_0x006b
        L_0x00d1:
            r12 = r11
            r13 = 0
            r14 = r11
            r15 = 0
            r14 = r14[r15]     // Catch:{ all -> 0x00e6 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x00e6 }
            r15 = 1
            int r14 = r14 + -1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00e6 }
            r12[r13] = r14     // Catch:{ all -> 0x00e6 }
            r12 = 0
            goto L_0x006b
        L_0x00e6:
            r12 = move-exception
            r8 = r12
            r12 = r7
            monitor-exit(r12)     // Catch:{ all -> 0x00e6 }
            r12 = r8
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.WakeLock.release():void");
    }

    private final void zza(int i) {
        int i2 = i;
        if (this.zzb.isHeld()) {
            try {
                this.zzb.release();
            } catch (RuntimeException e) {
                RuntimeException runtimeException = e;
                RuntimeException runtimeException2 = runtimeException;
                if (runtimeException.getClass().equals(RuntimeException.class)) {
                    int e2 = Log.e("WakeLock", String.valueOf(this.zze).concat(" was already released!"), runtimeException2);
                } else {
                    throw runtimeException2;
                }
            }
            boolean isHeld = this.zzb.isHeld();
        }
    }

    private final String zza(String str) {
        String str2 = str;
        if (this.zzi) {
            return !TextUtils.isEmpty(str2) ? str2 : this.zzf;
        }
        return this.zzf;
    }

    @KeepForSdk
    public void setReferenceCounted(boolean z) {
        boolean z2 = z;
        this.zzb.setReferenceCounted(z2);
        this.zzi = z2;
    }

    @KeepForSdk
    public boolean isHeld() {
        return this.zzb.isHeld();
    }

    static /* synthetic */ void zza(WakeLock wakeLock, int i) {
        int i2 = i;
        wakeLock.zza(0);
    }

    static {
        zza zza2;
        new zza();
        zzo = zza2;
    }
}
