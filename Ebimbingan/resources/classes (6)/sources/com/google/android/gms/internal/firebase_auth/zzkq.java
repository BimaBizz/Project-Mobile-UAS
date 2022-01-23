package com.google.android.gms.internal.firebase_auth;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzkq {
    private static final Logger logger = Logger.getLogger(zzkq.class.getName());
    private static final Unsafe zzacw = zzkt();
    private static final boolean zzaer = zzk(Long.TYPE);
    private static final boolean zzaes = zzk(Integer.TYPE);
    private static final zzd zzaet;
    private static final boolean zzaeu = zzkv();
    private static final long zzaev = ((long) zzi(byte[].class));
    private static final long zzaew = ((long) zzi(boolean[].class));
    private static final long zzaex = ((long) zzj(boolean[].class));
    private static final long zzaey = ((long) zzi(int[].class));
    private static final long zzaez = ((long) zzj(int[].class));
    private static final long zzafa = ((long) zzi(long[].class));
    private static final long zzafb = ((long) zzj(long[].class));
    private static final long zzafc = ((long) zzi(float[].class));
    private static final long zzafd = ((long) zzj(float[].class));
    private static final long zzafe = ((long) zzi(double[].class));
    private static final long zzaff = ((long) zzj(double[].class));
    private static final long zzafg = ((long) zzi(Object[].class));
    private static final long zzafh = ((long) zzj(Object[].class));
    private static final long zzafi;
    private static final int zzafj = ((int) (zzaev & 7));
    static final boolean zzafk;
    private static final Class<?> zzvt = zzge.zzgb();
    private static final boolean zzww = zzku();

    private zzkq() {
    }

    static final class zza extends zzd {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            Object obj2 = obj;
            long j2 = j;
            if (zzkq.zzafk) {
                return zzkq.zzq(obj2, j2);
            }
            return zzkq.zzr(obj2, j2);
        }

        public final void zze(Object obj, long j, byte b) {
            Object obj2 = obj;
            long j2 = j;
            byte b2 = b;
            if (zzkq.zzafk) {
                zzkq.zza(obj2, j2, b2);
            } else {
                zzkq.zzb(obj2, j2, b2);
            }
        }

        public final boolean zzm(Object obj, long j) {
            Object obj2 = obj;
            long j2 = j;
            if (zzkq.zzafk) {
                return zzkq.zzs(obj2, j2);
            }
            return zzkq.zzt(obj2, j2);
        }

        public final void zza(Object obj, long j, boolean z) {
            Object obj2 = obj;
            long j2 = j;
            boolean z2 = z;
            if (zzkq.zzafk) {
                zzkq.zzb(obj2, j2, z2);
            } else {
                zzkq.zzc(obj2, j2, z2);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    static final class zzb extends zzd {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            return this.zzafn.getByte(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            this.zzafn.putByte(obj, j, b);
        }

        public final boolean zzm(Object obj, long j) {
            return this.zzafn.getBoolean(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zzafn.putBoolean(obj, j, z);
        }

        public final float zzn(Object obj, long j) {
            return this.zzafn.getFloat(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            this.zzafn.putFloat(obj, j, f);
        }

        public final double zzo(Object obj, long j) {
            return this.zzafn.getDouble(obj, j);
        }

        public final void zza(Object obj, long j, double d) {
            this.zzafn.putDouble(obj, j, d);
        }
    }

    static final class zzc extends zzd {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            Object obj2 = obj;
            long j2 = j;
            if (zzkq.zzafk) {
                return zzkq.zzq(obj2, j2);
            }
            return zzkq.zzr(obj2, j2);
        }

        public final void zze(Object obj, long j, byte b) {
            Object obj2 = obj;
            long j2 = j;
            byte b2 = b;
            if (zzkq.zzafk) {
                zzkq.zza(obj2, j2, b2);
            } else {
                zzkq.zzb(obj2, j2, b2);
            }
        }

        public final boolean zzm(Object obj, long j) {
            Object obj2 = obj;
            long j2 = j;
            if (zzkq.zzafk) {
                return zzkq.zzs(obj2, j2);
            }
            return zzkq.zzt(obj2, j2);
        }

        public final void zza(Object obj, long j, boolean z) {
            Object obj2 = obj;
            long j2 = j;
            boolean z2 = z;
            if (zzkq.zzafk) {
                zzkq.zzb(obj2, j2, z2);
            } else {
                zzkq.zzc(obj2, j2, z2);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    static boolean zzkr() {
        return zzww;
    }

    static abstract class zzd {
        Unsafe zzafn;

        zzd(Unsafe unsafe) {
            this.zzafn = unsafe;
        }

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zze(Object obj, long j, byte b);

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final int zzk(Object obj, long j) {
            return this.zzafn.getInt(obj, j);
        }

        public final void zzb(Object obj, long j, int i) {
            this.zzafn.putInt(obj, j, i);
        }

        public final long zzl(Object obj, long j) {
            return this.zzafn.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzafn.putLong(obj, j, j2);
        }
    }

    static boolean zzks() {
        return zzaeu;
    }

    static <T> T zzh(Class<T> cls) {
        Throwable th;
        try {
            return zzacw.allocateInstance(cls);
        } catch (InstantiationException e) {
            InstantiationException instantiationException = e;
            Throwable th2 = th;
            new IllegalStateException(instantiationException);
            throw th2;
        }
    }

    private static int zzi(Class<?> cls) {
        Class<?> cls2 = cls;
        if (zzww) {
            return zzaet.zzafn.arrayBaseOffset(cls2);
        }
        return -1;
    }

    private static int zzj(Class<?> cls) {
        Class<?> cls2 = cls;
        if (zzww) {
            return zzaet.zzafn.arrayIndexScale(cls2);
        }
        return -1;
    }

    static int zzk(Object obj, long j) {
        return zzaet.zzk(obj, j);
    }

    static void zzb(Object obj, long j, int i) {
        zzaet.zzb(obj, j, i);
    }

    static long zzl(Object obj, long j) {
        return zzaet.zzl(obj, j);
    }

    static void zza(Object obj, long j, long j2) {
        zzaet.zza(obj, j, j2);
    }

    static boolean zzm(Object obj, long j) {
        return zzaet.zzm(obj, j);
    }

    static void zza(Object obj, long j, boolean z) {
        zzaet.zza(obj, j, z);
    }

    static float zzn(Object obj, long j) {
        return zzaet.zzn(obj, j);
    }

    static void zza(Object obj, long j, float f) {
        zzaet.zza(obj, j, f);
    }

    static double zzo(Object obj, long j) {
        return zzaet.zzo(obj, j);
    }

    static void zza(Object obj, long j, double d) {
        zzaet.zza(obj, j, d);
    }

    static Object zzp(Object obj, long j) {
        return zzaet.zzafn.getObject(obj, j);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzaet.zzafn.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzaet.zzy(bArr, zzaev + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzaet.zze(bArr, zzaev + j, b);
    }

    static Unsafe zzkt() {
        PrivilegedExceptionAction privilegedExceptionAction;
        Unsafe unsafe = null;
        try {
            new zzks();
            unsafe = (Unsafe) AccessController.doPrivileged(privilegedExceptionAction);
        } catch (Throwable th) {
        }
        return unsafe;
    }

    private static boolean zzku() {
        StringBuilder sb;
        if (zzacw == null) {
            return false;
        }
        try {
            Class<?> cls = zzacw.getClass();
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
            if (zzge.zzga()) {
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
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            new StringBuilder(71 + String.valueOf(valueOf).length());
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean zzkv() {
        StringBuilder sb;
        if (zzacw == null) {
            return false;
        }
        try {
            Class<?> cls = zzacw.getClass();
            Class<?> cls2 = cls;
            Method method = cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class[] clsArr = new Class[2];
            clsArr[0] = Object.class;
            Class[] clsArr2 = clsArr;
            clsArr2[1] = Long.TYPE;
            Method method2 = cls2.getMethod("getLong", clsArr2);
            if (zzkw() == null) {
                return false;
            }
            if (zzge.zzga()) {
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
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            new StringBuilder(71 + String.valueOf(valueOf).length());
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean zzk(Class<?> cls) {
        Class<?> cls2 = cls;
        if (!zzge.zzga()) {
            return false;
        }
        try {
            Class<?> cls3 = zzvt;
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

    private static Field zzkw() {
        if (zzge.zzga()) {
            Field zzb2 = zzb(Buffer.class, "effectiveDirectAddress");
            Field field = zzb2;
            if (zzb2 != null) {
                return field;
            }
        }
        Field zzb3 = zzb(Buffer.class, "address");
        Field field2 = zzb3;
        if (zzb3 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    private static Field zzb(Class<?> cls, String str) {
        Field field;
        try {
            field = cls.getDeclaredField(str);
        } catch (Throwable th) {
            field = null;
        }
        return field;
    }

    /* access modifiers changed from: private */
    public static byte zzq(Object obj, long j) {
        long j2 = j;
        return (byte) (zzk(obj, j2 & -4) >>> ((int) (((j2 ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte zzr(Object obj, long j) {
        long j2 = j;
        return (byte) (zzk(obj, j2 & -4) >>> ((int) ((j2 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static void zza(Object obj, long j, byte b) {
        Object obj2 = obj;
        long j2 = j;
        byte b2 = ((((int) j2) ^ -1) & 3) << 3;
        zzb(obj2, j2 & -4, (zzk(obj2, j2 & -4) & ((255 << b2) ^ -1)) | ((255 & b) << b2));
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        Object obj2 = obj;
        long j2 = j;
        byte b2 = (((int) j2) & 3) << 3;
        zzb(obj2, j2 & -4, (zzk(obj2, j2 & -4) & ((255 << b2) ^ -1)) | ((255 & b) << b2));
    }

    /* access modifiers changed from: private */
    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean zzt(Object obj, long j) {
        return zzr(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, (byte) (z ? 1 : 0));
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, (byte) (z ? 1 : 0));
    }

    static {
        zzd zzd2;
        zzd zzd3;
        zzd zzd4;
        zzd zzd5;
        long j;
        boolean z;
        if (zzacw == null) {
            zzd3 = null;
        } else if (!zzge.zzga()) {
            zzd3 = zzd2;
            new zzb(zzacw);
        } else if (zzaer) {
            zzd3 = zzd5;
            new zzc(zzacw);
        } else if (zzaes) {
            zzd3 = zzd4;
            new zza(zzacw);
        } else {
            zzd3 = null;
        }
        zzaet = zzd3;
        Field zzkw = zzkw();
        Field field = zzkw;
        if (zzkw == null || zzaet == null) {
            j = -1;
        } else {
            zzd zzd6 = zzaet;
            zzd zzd7 = zzd6;
            j = zzd6.zzafn.objectFieldOffset(field);
        }
        zzafi = j;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        zzafk = z;
    }
}
