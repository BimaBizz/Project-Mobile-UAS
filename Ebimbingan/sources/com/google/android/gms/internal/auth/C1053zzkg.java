package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.auth.zzkg */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1053zzkg {
    static final boolean zza;
    private static final Logger zzb = Logger.getLogger(C1053zzkg.class.getName());
    private static final Unsafe zzc = zzc();
    private static final Class<?> zzd = C0940zzgb.zzb();
    private static final boolean zze = zzd(Long.TYPE);
    private static final boolean zzf = zzd(Integer.TYPE);
    private static final zzd zzg;
    private static final boolean zzh = zze();
    private static final boolean zzi = zzd();
    private static final long zzj = ((long) zzb(byte[].class));
    private static final long zzk = ((long) zzb(boolean[].class));
    private static final long zzl = ((long) zzc(boolean[].class));
    private static final long zzm = ((long) zzb(int[].class));
    private static final long zzn = ((long) zzc(int[].class));
    private static final long zzo = ((long) zzb(long[].class));
    private static final long zzp = ((long) zzc(long[].class));
    private static final long zzq = ((long) zzb(float[].class));
    private static final long zzr = ((long) zzc(float[].class));
    private static final long zzs = ((long) zzb(double[].class));
    private static final long zzt = ((long) zzc(double[].class));
    private static final long zzu = ((long) zzb(Object[].class));
    private static final long zzv = ((long) zzc(Object[].class));
    private static final long zzw;
    private static final int zzx = ((int) (zzj & 7));

    private C1053zzkg() {
    }

    /* renamed from: com.google.android.gms.internal.auth.zzkg$zza */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    static final class zza extends zzd {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zza(Object obj, long j) {
            Object obj2 = obj;
            long j2 = j;
            if (C1053zzkg.zza) {
                return C1053zzkg.zzk(obj2, j2);
            }
            return C1053zzkg.zzl(obj2, j2);
        }

        public final void zza(Object obj, long j, byte b) {
            Object obj2 = obj;
            long j2 = j;
            byte b2 = b;
            if (C1053zzkg.zza) {
                C1053zzkg.zzc(obj2, j2, b2);
            } else {
                C1053zzkg.zzd(obj2, j2, b2);
            }
        }

        public final boolean zzb(Object obj, long j) {
            Object obj2 = obj;
            long j2 = j;
            if (C1053zzkg.zza) {
                return C1053zzkg.zzm(obj2, j2);
            }
            return C1053zzkg.zzn(obj2, j2);
        }

        public final void zza(Object obj, long j, boolean z) {
            Object obj2 = obj;
            long j2 = j;
            boolean z2 = z;
            if (C1053zzkg.zza) {
                C1053zzkg.zzd(obj2, j2, z2);
            } else {
                C1053zzkg.zze(obj2, j2, z2);
            }
        }

        public final float zzc(Object obj, long j) {
            return Float.intBitsToFloat(zze(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final double zzd(Object obj, long j) {
            return Double.longBitsToDouble(zzf(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* renamed from: com.google.android.gms.internal.auth.zzkg$zzb */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    static final class zzb extends zzd {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zza(Object obj, long j) {
            return this.zza.getByte(obj, j);
        }

        public final void zza(Object obj, long j, byte b) {
            this.zza.putByte(obj, j, b);
        }

        public final boolean zzb(Object obj, long j) {
            return this.zza.getBoolean(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zza.putBoolean(obj, j, z);
        }

        public final float zzc(Object obj, long j) {
            return this.zza.getFloat(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            this.zza.putFloat(obj, j, f);
        }

        public final double zzd(Object obj, long j) {
            return this.zza.getDouble(obj, j);
        }

        public final void zza(Object obj, long j, double d) {
            this.zza.putDouble(obj, j, d);
        }
    }

    /* renamed from: com.google.android.gms.internal.auth.zzkg$zzc */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    static final class zzc extends zzd {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zza(Object obj, long j) {
            Object obj2 = obj;
            long j2 = j;
            if (C1053zzkg.zza) {
                return C1053zzkg.zzk(obj2, j2);
            }
            return C1053zzkg.zzl(obj2, j2);
        }

        public final void zza(Object obj, long j, byte b) {
            Object obj2 = obj;
            long j2 = j;
            byte b2 = b;
            if (C1053zzkg.zza) {
                C1053zzkg.zzc(obj2, j2, b2);
            } else {
                C1053zzkg.zzd(obj2, j2, b2);
            }
        }

        public final boolean zzb(Object obj, long j) {
            Object obj2 = obj;
            long j2 = j;
            if (C1053zzkg.zza) {
                return C1053zzkg.zzm(obj2, j2);
            }
            return C1053zzkg.zzn(obj2, j2);
        }

        public final void zza(Object obj, long j, boolean z) {
            Object obj2 = obj;
            long j2 = j;
            boolean z2 = z;
            if (C1053zzkg.zza) {
                C1053zzkg.zzd(obj2, j2, z2);
            } else {
                C1053zzkg.zze(obj2, j2, z2);
            }
        }

        public final float zzc(Object obj, long j) {
            return Float.intBitsToFloat(zze(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final double zzd(Object obj, long j) {
            return Double.longBitsToDouble(zzf(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    static boolean zza() {
        return zzi;
    }

    /* renamed from: com.google.android.gms.internal.auth.zzkg$zzd */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    static abstract class zzd {
        Unsafe zza;

        zzd(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract byte zza(Object obj, long j);

        public abstract void zza(Object obj, long j, byte b);

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract boolean zzb(Object obj, long j);

        public abstract float zzc(Object obj, long j);

        public abstract double zzd(Object obj, long j);

        public final int zze(Object obj, long j) {
            return this.zza.getInt(obj, j);
        }

        public final void zza(Object obj, long j, int i) {
            this.zza.putInt(obj, j, i);
        }

        public final long zzf(Object obj, long j) {
            return this.zza.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zza.putLong(obj, j, j2);
        }
    }

    static boolean zzb() {
        return zzh;
    }

    static <T> T zza(Class<T> cls) {
        Throwable th;
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            InstantiationException instantiationException = e;
            Throwable th2 = th;
            new IllegalStateException(instantiationException);
            throw th2;
        }
    }

    private static int zzb(Class<?> cls) {
        Class<?> cls2 = cls;
        if (zzi) {
            return zzg.zza.arrayBaseOffset(cls2);
        }
        return -1;
    }

    private static int zzc(Class<?> cls) {
        Class<?> cls2 = cls;
        if (zzi) {
            return zzg.zza.arrayIndexScale(cls2);
        }
        return -1;
    }

    static int zza(Object obj, long j) {
        return zzg.zze(obj, j);
    }

    static void zza(Object obj, long j, int i) {
        zzg.zza(obj, j, i);
    }

    static long zzb(Object obj, long j) {
        return zzg.zzf(obj, j);
    }

    static void zza(Object obj, long j, long j2) {
        zzg.zza(obj, j, j2);
    }

    static boolean zzc(Object obj, long j) {
        return zzg.zzb(obj, j);
    }

    static void zza(Object obj, long j, boolean z) {
        zzg.zza(obj, j, z);
    }

    static float zzd(Object obj, long j) {
        return zzg.zzc(obj, j);
    }

    static void zza(Object obj, long j, float f) {
        zzg.zza(obj, j, f);
    }

    static double zze(Object obj, long j) {
        return zzg.zzd(obj, j);
    }

    static void zza(Object obj, long j, double d) {
        zzg.zza(obj, j, d);
    }

    static Object zzf(Object obj, long j) {
        return zzg.zza.getObject(obj, j);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzg.zza.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzg.zza(bArr, zzj + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzg.zza((Object) bArr, zzj + j, b);
    }

    static Unsafe zzc() {
        PrivilegedExceptionAction privilegedExceptionAction;
        Unsafe unsafe = null;
        try {
            new C1055zzki();
            unsafe = (Unsafe) AccessController.doPrivileged(privilegedExceptionAction);
        } catch (Throwable th) {
        }
        return unsafe;
    }

    private static boolean zzd() {
        StringBuilder sb;
        if (zzc == null) {
            return false;
        }
        try {
            Class<?> cls = zzc.getClass();
            Class<?> cls2 = cls;
            Method method = cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            Method method2 = cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            Method method3 = cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            Class[] clsArr = new Class[2];
            clsArr[0] = Object.class;
            Class[] clsArr2 = clsArr;
            clsArr2[1] = Long.TYPE;
            Method method4 = cls2.getMethod("getInt", clsArr2);
            Class[] clsArr3 = new Class[3];
            clsArr3[0] = Object.class;
            Class[] clsArr4 = clsArr3;
            clsArr4[1] = Long.TYPE;
            Class[] clsArr5 = clsArr4;
            clsArr5[2] = Integer.TYPE;
            Method method5 = cls2.getMethod("putInt", clsArr5);
            Class[] clsArr6 = new Class[2];
            clsArr6[0] = Object.class;
            Class[] clsArr7 = clsArr6;
            clsArr7[1] = Long.TYPE;
            Method method6 = cls2.getMethod("getLong", clsArr7);
            Class[] clsArr8 = new Class[3];
            clsArr8[0] = Object.class;
            Class[] clsArr9 = clsArr8;
            clsArr9[1] = Long.TYPE;
            Class[] clsArr10 = clsArr9;
            clsArr10[2] = Long.TYPE;
            Method method7 = cls2.getMethod("putLong", clsArr10);
            Class[] clsArr11 = new Class[2];
            clsArr11[0] = Object.class;
            Class[] clsArr12 = clsArr11;
            clsArr12[1] = Long.TYPE;
            Method method8 = cls2.getMethod("getObject", clsArr12);
            Class[] clsArr13 = new Class[3];
            clsArr13[0] = Object.class;
            Class[] clsArr14 = clsArr13;
            clsArr14[1] = Long.TYPE;
            Class[] clsArr15 = clsArr14;
            clsArr15[2] = Object.class;
            Method method9 = cls2.getMethod("putObject", clsArr15);
            if (C0940zzgb.zza()) {
                return true;
            }
            Class[] clsArr16 = new Class[2];
            clsArr16[0] = Object.class;
            Class[] clsArr17 = clsArr16;
            clsArr17[1] = Long.TYPE;
            Method method10 = cls2.getMethod("getByte", clsArr17);
            Class[] clsArr18 = new Class[3];
            clsArr18[0] = Object.class;
            Class[] clsArr19 = clsArr18;
            clsArr19[1] = Long.TYPE;
            Class[] clsArr20 = clsArr19;
            clsArr20[2] = Byte.TYPE;
            Method method11 = cls2.getMethod("putByte", clsArr20);
            Class[] clsArr21 = new Class[2];
            clsArr21[0] = Object.class;
            Class[] clsArr22 = clsArr21;
            clsArr22[1] = Long.TYPE;
            Method method12 = cls2.getMethod("getBoolean", clsArr22);
            Class[] clsArr23 = new Class[3];
            clsArr23[0] = Object.class;
            Class[] clsArr24 = clsArr23;
            clsArr24[1] = Long.TYPE;
            Class[] clsArr25 = clsArr24;
            clsArr25[2] = Boolean.TYPE;
            Method method13 = cls2.getMethod("putBoolean", clsArr25);
            Class[] clsArr26 = new Class[2];
            clsArr26[0] = Object.class;
            Class[] clsArr27 = clsArr26;
            clsArr27[1] = Long.TYPE;
            Method method14 = cls2.getMethod("getFloat", clsArr27);
            Class[] clsArr28 = new Class[3];
            clsArr28[0] = Object.class;
            Class[] clsArr29 = clsArr28;
            clsArr29[1] = Long.TYPE;
            Class[] clsArr30 = clsArr29;
            clsArr30[2] = Float.TYPE;
            Method method15 = cls2.getMethod("putFloat", clsArr30);
            Class[] clsArr31 = new Class[2];
            clsArr31[0] = Object.class;
            Class[] clsArr32 = clsArr31;
            clsArr32[1] = Long.TYPE;
            Method method16 = cls2.getMethod("getDouble", clsArr32);
            Class[] clsArr33 = new Class[3];
            clsArr33[0] = Object.class;
            Class[] clsArr34 = clsArr33;
            clsArr34[1] = Long.TYPE;
            Class[] clsArr35 = clsArr34;
            clsArr35[2] = Double.TYPE;
            Method method17 = cls2.getMethod("putDouble", clsArr35);
            return true;
        } catch (Throwable th) {
            Throwable th2 = th;
            Logger logger = zzb;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            new StringBuilder(71 + String.valueOf(valueOf).length());
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean zze() {
        StringBuilder sb;
        if (zzc == null) {
            return false;
        }
        try {
            Class<?> cls = zzc.getClass();
            Class<?> cls2 = cls;
            Method method = cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class[] clsArr = new Class[2];
            clsArr[0] = Object.class;
            Class[] clsArr2 = clsArr;
            clsArr2[1] = Long.TYPE;
            Method method2 = cls2.getMethod("getLong", clsArr2);
            if (zzf() == null) {
                return false;
            }
            if (C0940zzgb.zza()) {
                return true;
            }
            Method method3 = cls2.getMethod("getByte", new Class[]{Long.TYPE});
            Class[] clsArr3 = new Class[2];
            clsArr3[0] = Long.TYPE;
            Class[] clsArr4 = clsArr3;
            clsArr4[1] = Byte.TYPE;
            Method method4 = cls2.getMethod("putByte", clsArr4);
            Method method5 = cls2.getMethod("getInt", new Class[]{Long.TYPE});
            Class[] clsArr5 = new Class[2];
            clsArr5[0] = Long.TYPE;
            Class[] clsArr6 = clsArr5;
            clsArr6[1] = Integer.TYPE;
            Method method6 = cls2.getMethod("putInt", clsArr6);
            Method method7 = cls2.getMethod("getLong", new Class[]{Long.TYPE});
            Class[] clsArr7 = new Class[2];
            clsArr7[0] = Long.TYPE;
            Class[] clsArr8 = clsArr7;
            clsArr8[1] = Long.TYPE;
            Method method8 = cls2.getMethod("putLong", clsArr8);
            Class[] clsArr9 = new Class[3];
            clsArr9[0] = Long.TYPE;
            Class[] clsArr10 = clsArr9;
            clsArr10[1] = Long.TYPE;
            Class[] clsArr11 = clsArr10;
            clsArr11[2] = Long.TYPE;
            Method method9 = cls2.getMethod("copyMemory", clsArr11);
            Class[] clsArr12 = new Class[5];
            clsArr12[0] = Object.class;
            Class[] clsArr13 = clsArr12;
            clsArr13[1] = Long.TYPE;
            Class[] clsArr14 = clsArr13;
            clsArr14[2] = Object.class;
            Class[] clsArr15 = clsArr14;
            clsArr15[3] = Long.TYPE;
            Class[] clsArr16 = clsArr15;
            clsArr16[4] = Long.TYPE;
            Method method10 = cls2.getMethod("copyMemory", clsArr16);
            return true;
        } catch (Throwable th) {
            Throwable th2 = th;
            Logger logger = zzb;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            new StringBuilder(71 + String.valueOf(valueOf).length());
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean zzd(Class<?> cls) {
        Class<?> cls2 = cls;
        if (!C0940zzgb.zza()) {
            return false;
        }
        try {
            Class<?> cls3 = zzd;
            Class<?> cls4 = cls3;
            Class<?> cls5 = cls3;
            Class[] clsArr = new Class[2];
            clsArr[0] = cls2;
            Class[] clsArr2 = clsArr;
            clsArr2[1] = Boolean.TYPE;
            Method method = cls4.getMethod("peekLong", clsArr2);
            Class[] clsArr3 = new Class[3];
            clsArr3[0] = cls2;
            Class[] clsArr4 = clsArr3;
            clsArr4[1] = Long.TYPE;
            Class[] clsArr5 = clsArr4;
            clsArr5[2] = Boolean.TYPE;
            Method method2 = cls5.getMethod("pokeLong", clsArr5);
            Class[] clsArr6 = new Class[3];
            clsArr6[0] = cls2;
            Class[] clsArr7 = clsArr6;
            clsArr7[1] = Integer.TYPE;
            Class[] clsArr8 = clsArr7;
            clsArr8[2] = Boolean.TYPE;
            Method method3 = cls5.getMethod("pokeInt", clsArr8);
            Class[] clsArr9 = new Class[2];
            clsArr9[0] = cls2;
            Class[] clsArr10 = clsArr9;
            clsArr10[1] = Boolean.TYPE;
            Method method4 = cls5.getMethod("peekInt", clsArr10);
            Class[] clsArr11 = new Class[2];
            clsArr11[0] = cls2;
            Class[] clsArr12 = clsArr11;
            clsArr12[1] = Byte.TYPE;
            Method method5 = cls5.getMethod("pokeByte", clsArr12);
            Method method6 = cls5.getMethod("peekByte", new Class[]{cls2});
            Class[] clsArr13 = new Class[4];
            clsArr13[0] = cls2;
            Class[] clsArr14 = clsArr13;
            clsArr14[1] = byte[].class;
            Class[] clsArr15 = clsArr14;
            clsArr15[2] = Integer.TYPE;
            Class[] clsArr16 = clsArr15;
            clsArr16[3] = Integer.TYPE;
            Method method7 = cls5.getMethod("pokeByteArray", clsArr16);
            Class[] clsArr17 = new Class[4];
            clsArr17[0] = cls2;
            Class[] clsArr18 = clsArr17;
            clsArr18[1] = byte[].class;
            Class[] clsArr19 = clsArr18;
            clsArr19[2] = Integer.TYPE;
            Class[] clsArr20 = clsArr19;
            clsArr20[3] = Integer.TYPE;
            Method method8 = cls5.getMethod("peekByteArray", clsArr20);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private static Field zzf() {
        if (C0940zzgb.zza()) {
            Field zza2 = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
            Field field = zza2;
            if (zza2 != null) {
                return field;
            }
        }
        Field zza3 = zza((Class<?>) Buffer.class, "address");
        Field field2 = zza3;
        if (zza3 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    private static Field zza(Class<?> cls, String str) {
        Field field;
        try {
            field = cls.getDeclaredField(str);
        } catch (Throwable th) {
            field = null;
        }
        return field;
    }

    /* access modifiers changed from: private */
    public static byte zzk(Object obj, long j) {
        long j2 = j;
        return (byte) (zza(obj, j2 & -4) >>> ((int) (((j2 ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte zzl(Object obj, long j) {
        long j2 = j;
        return (byte) (zza(obj, j2 & -4) >>> ((int) ((j2 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j, byte b) {
        Object obj2 = obj;
        long j2 = j;
        byte b2 = ((((int) j2) ^ -1) & 3) << 3;
        zza(obj2, j2 & -4, (zza(obj2, j2 & -4) & ((255 << b2) ^ -1)) | ((255 & b) << b2));
    }

    /* access modifiers changed from: private */
    public static void zzd(Object obj, long j, byte b) {
        Object obj2 = obj;
        long j2 = j;
        byte b2 = (((int) j2) & 3) << 3;
        zza(obj2, j2 & -4, (zza(obj2, j2 & -4) & ((255 << b2) ^ -1)) | ((255 & b) << b2));
    }

    /* access modifiers changed from: private */
    public static boolean zzm(Object obj, long j) {
        return zzk(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean zzn(Object obj, long j) {
        return zzl(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static void zzd(Object obj, long j, boolean z) {
        zzc(obj, j, (byte) (z ? 1 : 0));
    }

    /* access modifiers changed from: private */
    public static void zze(Object obj, long j, boolean z) {
        zzd(obj, j, (byte) (z ? 1 : 0));
    }

    static {
        zzd zzd2;
        zzd zzd3;
        zzd zzd4;
        zzd zzd5;
        long j;
        boolean z;
        if (zzc == null) {
            zzd3 = null;
        } else if (!C0940zzgb.zza()) {
            zzd3 = zzd2;
            new zzb(zzc);
        } else if (zze) {
            zzd3 = zzd5;
            new zzc(zzc);
        } else if (zzf) {
            zzd3 = zzd4;
            new zza(zzc);
        } else {
            zzd3 = null;
        }
        zzg = zzd3;
        Field zzf2 = zzf();
        Field field = zzf2;
        if (zzf2 == null || zzg == null) {
            j = -1;
        } else {
            j = zzg.zza.objectFieldOffset(field);
        }
        zzw = j;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        zza = z;
    }
}
