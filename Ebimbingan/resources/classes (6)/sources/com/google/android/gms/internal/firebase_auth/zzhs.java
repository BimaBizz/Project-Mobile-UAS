package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;
import com.google.android.gms.internal.firebase_auth.zzhs.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzhs<MessageType extends zzhs<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzfx<MessageType, BuilderType> {
    private static Map<Object, zzhs<?, ?>> zzaal;
    protected zzkn zzaaj = zzkn.zzko();
    private int zzaak = -1;

    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzhs<MessageType, BuilderType> implements zzje {
        protected zzhi<Object> zzaam = zzhi.zzhs();

        public zzb() {
        }
    }

    /* 'enum' modifier removed */
    public static final class zzd {
        public static final int zzaan = 1;
        public static final int zzaao = 2;
        public static final int zzaap = 3;
        public static final int zzaaq = 4;
        public static final int zzaar = 5;
        public static final int zzaas = 6;
        public static final int zzaat = 7;
        private static final /* synthetic */ int[] zzaau;
        public static final int zzaav = 1;
        public static final int zzaaw = 2;
        private static final /* synthetic */ int[] zzaax;
        public static final int zzaay = 1;
        public static final int zzaaz = 2;
        private static final /* synthetic */ int[] zzaba;

        static {
            int[] iArr = new int[7];
            iArr[0] = zzaan;
            int[] iArr2 = iArr;
            iArr2[1] = zzaao;
            int[] iArr3 = iArr2;
            iArr3[2] = zzaap;
            int[] iArr4 = iArr3;
            iArr4[3] = zzaaq;
            int[] iArr5 = iArr4;
            iArr5[4] = zzaar;
            int[] iArr6 = iArr5;
            iArr6[5] = zzaas;
            int[] iArr7 = iArr6;
            iArr7[6] = zzaat;
            zzaau = iArr7;
            int[] iArr8 = new int[2];
            iArr8[0] = zzaav;
            int[] iArr9 = iArr8;
            iArr9[1] = zzaaw;
            zzaax = iArr9;
            int[] iArr10 = new int[2];
            iArr10[0] = zzaay;
            int[] iArr11 = iArr10;
            iArr11[1] = zzaaz;
            zzaba = iArr11;
        }

        public static int[] zzip() {
            return (int[]) zzaau.clone();
        }
    }

    public static class zze<ContainingType extends zzjc, Type> extends zzhe<ContainingType, Type> {
    }

    public zzhs() {
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    public static class zzc<T extends zzhs<T, ?>> extends zzgc<T> {
        private final T zzaag;

        public zzc(T t) {
            this.zzaag = t;
        }

        public final /* synthetic */ Object zza(zzgr zzgr, zzhf zzhf) throws zzic {
            return zzhs.zza(this.zzaag, zzgr, zzhf);
        }
    }

    public String toString() {
        return zzjd.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzvm != 0) {
            return this.zzvm;
        }
        this.zzvm = zzjo.zzjv().zzr(this).hashCode(this);
        return this.zzvm;
    }

    public static abstract class zza<MessageType extends zzhs<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzga<MessageType, BuilderType> {
        private final MessageType zzaag;
        protected MessageType zzaah;
        private boolean zzaai = false;

        protected zza(MessageType messagetype) {
            MessageType messagetype2 = messagetype;
            this.zzaag = messagetype2;
            int i = zzd.zzaaq;
            int i2 = i;
            this.zzaah = (zzhs) messagetype2.zza(i, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        public final void zzid() {
            if (this.zzaai) {
                MessageType messagetype = this.zzaah;
                int i = zzd.zzaaq;
                int i2 = i;
                MessageType messagetype2 = (zzhs) messagetype.zza(i, (Object) null, (Object) null);
                zza(messagetype2, this.zzaah);
                this.zzaah = messagetype2;
                this.zzaai = false;
            }
        }

        public final boolean isInitialized() {
            return zzhs.zza(this.zzaah, false);
        }

        /* renamed from: zzie */
        public MessageType zzig() {
            if (this.zzaai) {
                return this.zzaah;
            }
            this.zzaah.zzfy();
            this.zzaai = true;
            return this.zzaah;
        }

        /* renamed from: zzif */
        public final MessageType zzih() {
            Throwable th;
            MessageType messagetype = (zzhs) zzig();
            MessageType messagetype2 = messagetype;
            if (messagetype.isInitialized()) {
                return messagetype2;
            }
            Throwable th2 = th;
            new zzkl(messagetype2);
            throw th2;
        }

        public final BuilderType zza(MessageType messagetype) {
            zzid();
            zza(this.zzaah, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            MessageType messagetype3 = messagetype;
            zzjo.zzjv().zzr(messagetype3).zzd(messagetype3, messagetype2);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ zzga zza(zzfx zzfx) {
            zzhs zzhs = (zzhs) zzfx;
            zzhs zzhs2 = zzhs;
            return zza(zzhs);
        }

        public final /* synthetic */ zzga zzfw() {
            return (zza) clone();
        }

        public final /* synthetic */ zzjc zzii() {
            return this.zzaag;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            int i = zzd.zzaar;
            int i2 = i;
            zza zza = (zza) ((zzhs) this.zzaag).zza(i, (Object) null, (Object) null);
            zza zza2 = zza;
            zza zza3 = zza.zza((zzhs) zzig());
            return zza2;
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r3 = r0
            r4 = r1
            if (r3 != r4) goto L_0x0009
            r3 = 1
            r0 = r3
        L_0x0008:
            return r0
        L_0x0009:
            r3 = r0
            int r4 = com.google.android.gms.internal.firebase_auth.zzhs.zzd.zzaas
            r7 = r4
            r4 = r7
            r5 = r7
            r2 = r5
            r5 = 0
            r6 = 0
            java.lang.Object r3 = r3.zza((int) r4, (java.lang.Object) r5, (java.lang.Object) r6)
            com.google.android.gms.internal.firebase_auth.zzhs r3 = (com.google.android.gms.internal.firebase_auth.zzhs) r3
            java.lang.Class r3 = r3.getClass()
            r4 = r1
            boolean r3 = r3.isInstance(r4)
            if (r3 != 0) goto L_0x0026
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x0026:
            com.google.android.gms.internal.firebase_auth.zzjo r3 = com.google.android.gms.internal.firebase_auth.zzjo.zzjv()
            r4 = r0
            com.google.android.gms.internal.firebase_auth.zzjs r3 = r3.zzr(r4)
            r4 = r0
            r5 = r1
            com.google.android.gms.internal.firebase_auth.zzhs r5 = (com.google.android.gms.internal.firebase_auth.zzhs) r5
            boolean r3 = r3.equals(r4, r5)
            r0 = r3
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzhs.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: protected */
    public final void zzfy() {
        zzjo.zzjv().zzr(this).zzf(this);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzhs<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzij() {
        int i = zzd.zzaar;
        int i2 = i;
        return (zza) zza(i, (Object) null, (Object) null);
    }

    public final boolean isInitialized() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    /* access modifiers changed from: package-private */
    public final int zzfu() {
        return this.zzaak;
    }

    /* access modifiers changed from: package-private */
    public final void zzl(int i) {
        int i2 = i;
        this.zzaak = i2;
    }

    public final void zzb(zzha zzha) throws IOException {
        zzjo.zzjv().zzf(getClass()).zza(this, zzhc.zza(zzha));
    }

    public final int zzik() {
        if (this.zzaak == -1) {
            this.zzaak = zzjo.zzjv().zzr(this).zzq(this);
        }
        return this.zzaak;
    }

    static <T extends zzhs<?, ?>> T zzd(Class<T> cls) {
        Throwable th;
        Throwable th2;
        Class<T> cls2 = cls;
        T t = (zzhs) zzaal.get(cls2);
        T t2 = t;
        if (t == null) {
            try {
                Class<?> cls3 = Class.forName(cls2.getName(), true, cls2.getClassLoader());
                t2 = (zzhs) zzaal.get(cls2);
            } catch (ClassNotFoundException e) {
                ClassNotFoundException classNotFoundException = e;
                Throwable th3 = th2;
                new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
                throw th3;
            }
        }
        if (t2 == null) {
            int i = zzd.zzaas;
            int i2 = i;
            T t3 = (zzhs) ((zzhs) zzkq.zzh(cls2)).zza(i, (Object) null, (Object) null);
            t2 = t3;
            if (t3 == null) {
                Throwable th4 = th;
                new IllegalStateException();
                throw th4;
            }
            zzhs<?, ?> put = zzaal.put(cls2, t2);
        }
        return t2;
    }

    protected static <T extends zzhs<?, ?>> void zza(Class<T> cls, T t) {
        zzhs<?, ?> put = zzaal.put(cls, t);
    }

    protected static Object zza(zzjc zzjc, String str, Object[] objArr) {
        Object obj;
        new zzjq(zzjc, str, objArr);
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

    protected static final <T extends zzhs<T, ?>> boolean zza(T t, boolean z) {
        T t2 = t;
        boolean z2 = z;
        int i = zzd.zzaan;
        int i2 = i;
        byte byteValue = ((Byte) t2.zza(i, (Object) null, (Object) null)).byteValue();
        byte b = byteValue;
        if (byteValue == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        boolean zzp = zzjo.zzjv().zzr(t2).zzp(t2);
        if (z2) {
            T t3 = t2;
            int i3 = zzd.zzaao;
            int i4 = i3;
            Object zza2 = t3.zza(i3, (Object) zzp ? t2 : null, (Object) null);
        }
        return zzp;
    }

    protected static zzhx zzil() {
        return zzhu.zziq();
    }

    protected static <E> zzhz<E> zzim() {
        return zzjn.zzju();
    }

    static <T extends zzhs<T, ?>> T zza(T t, zzgr zzgr, zzhf zzhf) throws zzic {
        zzic zzic;
        zzgr zzgr2 = zzgr;
        zzhf zzhf2 = zzhf;
        int i = zzd.zzaaq;
        int i2 = i;
        T t2 = (zzhs) t.zza(i, (Object) null, (Object) null);
        try {
            zzjo.zzjv().zzr(t2).zza(t2, zzgy.zza(zzgr2), zzhf2);
            t2.zzfy();
            return t2;
        } catch (IOException e) {
            IOException iOException = e;
            IOException iOException2 = iOException;
            if (iOException.getCause() instanceof zzic) {
                throw ((zzic) iOException2.getCause());
            }
            new zzic(iOException2.getMessage());
            throw zzic.zzh(t2);
        } catch (RuntimeException e2) {
            RuntimeException runtimeException = e2;
            RuntimeException runtimeException2 = runtimeException;
            if (runtimeException.getCause() instanceof zzic) {
                throw ((zzic) runtimeException2.getCause());
            }
            throw runtimeException2;
        }
    }

    public final /* synthetic */ zzjb zzin() {
        int i = zzd.zzaar;
        int i2 = i;
        zza zza2 = (zza) zza(i, (Object) null, (Object) null);
        zza zza3 = zza2;
        zza zza4 = zza2.zza(this);
        return zza3;
    }

    public final /* synthetic */ zzjb zzio() {
        int i = zzd.zzaar;
        int i2 = i;
        return (zza) zza(i, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzjc zzii() {
        int i = zzd.zzaas;
        int i2 = i;
        return (zzhs) zza(i, (Object) null, (Object) null);
    }

    static {
        Map<Object, zzhs<?, ?>> map;
        new ConcurrentHashMap();
        zzaal = map;
    }
}
