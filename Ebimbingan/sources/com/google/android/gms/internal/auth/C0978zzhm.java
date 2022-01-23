package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.C0978zzhm;
import com.google.android.gms.internal.auth.C0978zzhm.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.auth.zzhm */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C0978zzhm<MessageType extends C0978zzhm<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends C0936zzfy<MessageType, BuilderType> {
    private static Map<Object, C0978zzhm<?, ?>> zzd;
    protected C1050zzkd zzb = C1050zzkd.zza();
    private int zzc = -1;

    /* renamed from: com.google.android.gms.internal.auth.zzhm$zza */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    public static class zza<T extends C0978zzhm<T, ?>> extends C0937zzfz<T> {
        private final T zza;

        public zza(T t) {
            this.zza = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.auth.zzhm$zzc */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    static final class zzc implements C0972zzhg<zzc> {
        public final int zza() {
            Throwable th;
            Throwable th2 = th;
            new NoSuchMethodError();
            throw th2;
        }

        public final C1064zzkr zzb() {
            Throwable th;
            Throwable th2 = th;
            new NoSuchMethodError();
            throw th2;
        }

        public final C1067zzku zzc() {
            Throwable th;
            Throwable th2 = th;
            new NoSuchMethodError();
            throw th2;
        }

        public final boolean zzd() {
            Throwable th;
            Throwable th2 = th;
            new NoSuchMethodError();
            throw th2;
        }

        public final boolean zze() {
            Throwable th;
            Throwable th2 = th;
            new NoSuchMethodError();
            throw th2;
        }

        public final C1014zziv zza(C1014zziv zziv, C1011zzis zzis) {
            Throwable th;
            C1014zziv zziv2 = zziv;
            C1011zzis zzis2 = zzis;
            Throwable th2 = th;
            new NoSuchMethodError();
            throw th2;
        }

        public final C1021zzjb zza(C1021zzjb zzjb, C1021zzjb zzjb2) {
            Throwable th;
            C1021zzjb zzjb3 = zzjb;
            C1021zzjb zzjb4 = zzjb2;
            Throwable th2 = th;
            new NoSuchMethodError();
            throw th2;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            Throwable th;
            Object obj2 = obj;
            Throwable th2 = th;
            new NoSuchMethodError();
            throw th2;
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.auth.zzhm$zze */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    public static final class zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 1;
        public static final int zzi = 2;
        public static final int zzj = 1;
        public static final int zzk = 2;
        private static final /* synthetic */ int[] zzl;
        private static final /* synthetic */ int[] zzm;
        private static final /* synthetic */ int[] zzn;

        static {
            int[] iArr = new int[7];
            iArr[0] = zza;
            int[] iArr2 = iArr;
            iArr2[1] = zzb;
            int[] iArr3 = iArr2;
            iArr3[2] = zzc;
            int[] iArr4 = iArr3;
            iArr4[3] = zzd;
            int[] iArr5 = iArr4;
            iArr5[4] = zze;
            int[] iArr6 = iArr5;
            iArr6[5] = zzf;
            int[] iArr7 = iArr6;
            iArr7[6] = zzg;
            zzl = iArr7;
            int[] iArr8 = new int[2];
            iArr8[0] = zzh;
            int[] iArr9 = iArr8;
            iArr9[1] = zzi;
            zzm = iArr9;
            int[] iArr10 = new int[2];
            iArr10[0] = zzj;
            int[] iArr11 = iArr10;
            iArr11[1] = zzk;
            zzn = iArr11;
        }

        public static int[] zza() {
            return (int[]) zzl.clone();
        }
    }

    /* renamed from: com.google.android.gms.internal.auth.zzhm$zzf */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    public static class zzf<ContainingType extends C1011zzis, Type> extends C0964zzgz<ContainingType, Type> {
    }

    public C0978zzhm() {
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    /* renamed from: com.google.android.gms.internal.auth.zzhm$zzd */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends C0978zzhm<MessageType, BuilderType> implements C1013zziu {
        protected C0970zzhe<zzc> zzc = C0970zzhe.zza();

        public zzd() {
        }

        /* access modifiers changed from: package-private */
        public final C0970zzhe<zzc> zzi() {
            if (this.zzc.zzc()) {
                this.zzc = (C0970zzhe) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public String toString() {
        return C1016zzix.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zza != 0) {
            return this.zza;
        }
        this.zza = C1027zzjh.zza().zza(this).zza(this);
        return this.zza;
    }

    /* renamed from: com.google.android.gms.internal.auth.zzhm$zzb */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    public static abstract class zzb<MessageType extends C0978zzhm<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends C0935zzfx<MessageType, BuilderType> {
        private final MessageType zza;
        private MessageType zzb;
        private boolean zzc = false;

        protected zzb(MessageType messagetype) {
            MessageType messagetype2 = messagetype;
            this.zza = messagetype2;
            this.zzb = (C0978zzhm) messagetype2.zza(zze.zzd, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        public void zzb() {
            MessageType messagetype = (C0978zzhm) this.zzb.zza(zze.zzd, (Object) null, (Object) null);
            zza(messagetype, this.zzb);
            this.zzb = messagetype;
        }

        public final boolean zzc() {
            return C0978zzhm.zza(this.zzb, false);
        }

        /* renamed from: zzd */
        public MessageType zzf() {
            if (this.zzc) {
                return this.zzb;
            }
            MessageType messagetype = this.zzb;
            C1027zzjh.zza().zza(messagetype).zzc(messagetype);
            this.zzc = true;
            return this.zzb;
        }

        /* renamed from: zze */
        public final MessageType zzg() {
            Throwable th;
            MessageType messagetype = (C0978zzhm) zzf();
            MessageType messagetype2 = messagetype;
            if (messagetype.zzc()) {
                return messagetype2;
            }
            Throwable th2 = th;
            new C1048zzkb(messagetype2);
            throw th2;
        }

        public final BuilderType zza(MessageType messagetype) {
            MessageType messagetype2 = messagetype;
            if (this.zzc) {
                zzb();
                this.zzc = false;
            }
            zza(this.zzb, messagetype2);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            MessageType messagetype3 = messagetype;
            C1027zzjh.zza().zza(messagetype3).zzb(messagetype3, messagetype2);
        }

        public final /* synthetic */ C0935zzfx zza() {
            return (zzb) clone();
        }

        public final /* synthetic */ C1011zzis zzh() {
            return this.zza;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzb2 = (zzb) ((C0978zzhm) this.zza).zza(zze.zze, (Object) null, (Object) null);
            zzb zzb3 = zzb2;
            zzb zza2 = zzb2.zza((C0978zzhm) zzf());
            return zzb3;
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r0
            r3 = r1
            if (r2 != r3) goto L_0x0009
            r2 = 1
            r0 = r2
        L_0x0008:
            return r0
        L_0x0009:
            r2 = r1
            if (r2 != 0) goto L_0x000f
            r2 = 0
            r0 = r2
            goto L_0x0008
        L_0x000f:
            r2 = r0
            java.lang.Class r2 = r2.getClass()
            r3 = r1
            java.lang.Class r3 = r3.getClass()
            if (r2 == r3) goto L_0x001e
            r2 = 0
            r0 = r2
            goto L_0x0008
        L_0x001e:
            com.google.android.gms.internal.auth.zzjh r2 = com.google.android.gms.internal.auth.C1027zzjh.zza()
            r3 = r0
            com.google.android.gms.internal.auth.zzji r2 = r2.zza(r3)
            r3 = r0
            r4 = r1
            com.google.android.gms.internal.auth.zzhm r4 = (com.google.android.gms.internal.auth.C0978zzhm) r4
            boolean r2 = r2.zza(r3, r4)
            r0 = r2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0978zzhm.equals(java.lang.Object):boolean");
    }

    public final boolean zzc() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i) {
        int i2 = i;
        this.zzc = i2;
    }

    public final void zza(C0960zzgv zzgv) throws IOException {
        C1027zzjh.zza().zza(this).zza(this, (C1070zzkx) C0963zzgy.zza(zzgv));
    }

    public final int zzd() {
        if (this.zzc == -1) {
            this.zzc = C1027zzjh.zza().zza(this).zzb(this);
        }
        return this.zzc;
    }

    static <T extends C0978zzhm<?, ?>> T zza(Class<T> cls) {
        Throwable th;
        Throwable th2;
        Class<T> cls2 = cls;
        T t = (C0978zzhm) zzd.get(cls2);
        T t2 = t;
        if (t == null) {
            try {
                Class<?> cls3 = Class.forName(cls2.getName(), true, cls2.getClassLoader());
                t2 = (C0978zzhm) zzd.get(cls2);
            } catch (ClassNotFoundException e) {
                ClassNotFoundException classNotFoundException = e;
                Throwable th3 = th2;
                new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
                throw th3;
            }
        }
        if (t2 == null) {
            T t3 = (C0978zzhm) ((C0978zzhm) C1053zzkg.zza(cls2)).zza(zze.zzf, (Object) null, (Object) null);
            t2 = t3;
            if (t3 == null) {
                Throwable th4 = th;
                new IllegalStateException();
                throw th4;
            }
            C0978zzhm<?, ?> put = zzd.put(cls2, t2);
        }
        return t2;
    }

    protected static <T extends C0978zzhm<?, ?>> void zza(Class<T> cls, T t) {
        C0978zzhm<?, ?> put = zzd.put(cls, t);
    }

    protected static Object zza(C1011zzis zzis, String str, Object[] objArr) {
        Object obj;
        new C1029zzjj(zzis, str, objArr);
        return obj;
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        Throwable th;
        Throwable th2;
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            IllegalAccessException illegalAccessException = e;
            Throwable th3 = th2;
            new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", illegalAccessException);
            throw th3;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            Throwable th4 = cause;
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) th4);
            } else if (th4 instanceof Error) {
                throw ((Error) th4);
            } else {
                Throwable th5 = th;
                new RuntimeException("Unexpected exception thrown by generated accessor method.", th4);
                throw th5;
            }
        }
    }

    protected static final <T extends C0978zzhm<T, ?>> boolean zza(T t, boolean z) {
        T t2 = t;
        boolean z2 = z;
        byte byteValue = ((Byte) t2.zza(zze.zza, (Object) null, (Object) null)).byteValue();
        byte b = byteValue;
        if (byteValue == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        boolean zzd2 = C1027zzjh.zza().zza(t2).zzd(t2);
        if (z2) {
            T t3 = t2;
            int i = zze.zzb;
            T t4 = zzd2 ? t2 : null;
            T t5 = t4;
            Object zza2 = t3.zza(i, (Object) t4, (Object) null);
        }
        return zzd2;
    }

    protected static <E> C0985zzht<E> zze() {
        return C1026zzjg.zzd();
    }

    private static <T extends C0978zzhm<T, ?>> T zza(T t, byte[] bArr, int i, int i2, C0967zzhb zzhb) throws C0984zzhs {
        C0984zzhs zzhs;
        C0942zzgd zzgd;
        Throwable th;
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        C0967zzhb zzhb2 = zzhb;
        T t2 = (C0978zzhm) t.zza(zze.zzd, (Object) null, (Object) null);
        try {
            C1028zzji zza2 = C1027zzjh.zza().zza(t2);
            new C0942zzgd(zzhb2);
            zza2.zza(t2, bArr2, 0, i4, zzgd);
            zza2.zzc(t2);
            if (t2.zza == 0) {
                return t2;
            }
            Throwable th2 = th;
            new RuntimeException();
            throw th2;
        } catch (IOException e) {
            IOException iOException = e;
            IOException iOException2 = iOException;
            if (iOException.getCause() instanceof C0984zzhs) {
                throw ((C0984zzhs) iOException2.getCause());
            }
            new C0984zzhs(iOException2.getMessage());
            throw zzhs.zza(t2);
        } catch (IndexOutOfBoundsException e2) {
            throw C0984zzhs.zza().zza(t2);
        }
    }

    protected static <T extends C0978zzhm<T, ?>> T zza(T t, byte[] bArr) throws C0984zzhs {
        C1048zzkb zzkb;
        C0984zzhs zzhs;
        byte[] bArr2 = bArr;
        T zza2 = zza(t, bArr2, 0, bArr2.length, C0967zzhb.zza());
        T t2 = zza2;
        if (zza2 == null || t2.zzc()) {
            return t2;
        }
        new C1048zzkb(t2);
        new C0984zzhs(zzkb.getMessage());
        throw zzhs.zza(t2);
    }

    public final /* synthetic */ C1014zziv zzf() {
        zzb zzb2 = (zzb) zza(zze.zze, (Object) null, (Object) null);
        zzb zzb3 = zzb2;
        zzb zza2 = zzb2.zza(this);
        return zzb3;
    }

    public final /* synthetic */ C1014zziv zzg() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    public final /* synthetic */ C1011zzis zzh() {
        return (C0978zzhm) zza(zze.zzf, (Object) null, (Object) null);
    }

    static {
        Map<Object, C0978zzhm<?, ?>> map;
        new ConcurrentHashMap();
        zzd = map;
    }
}
