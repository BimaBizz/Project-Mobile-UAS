package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.zzk */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
abstract class C0642zzk extends C0640zzi {
    private static final WeakReference<byte[]> zzb;
    private WeakReference<byte[]> zza = zzb;

    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r0 = r1
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r1 = r0
            zzb = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C0642zzk.<clinit>():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0642zzk(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract byte[] zzb();

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final byte[] zzc() {
        byte[] bArr;
        WeakReference<byte[]> weakReference;
        synchronized (this) {
            try {
                bArr = (byte[]) this.zza.get();
                if (bArr == null) {
                    bArr = zzb();
                    new WeakReference(bArr);
                    this.zza = weakReference;
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                throw th2;
            }
        }
        return bArr;
    }
}
