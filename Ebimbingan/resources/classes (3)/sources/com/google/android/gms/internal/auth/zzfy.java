package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzfx;
import com.google.android.gms.internal.auth.zzfy;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class zzfy<MessageType extends zzfy<MessageType, BuilderType>, BuilderType extends zzfx<MessageType, BuilderType>> implements zzis {
    protected int zza = 0;

    public zzfy() {
    }

    public final zzgi zza() {
        Throwable th;
        StringBuilder sb;
        try {
            zzgq zzc = zzgi.zzc(zzd());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e) {
            IOException iOException = e;
            Throwable th2 = th;
            String str = "ByteString";
            String name = getClass().getName();
            new StringBuilder(62 + String.valueOf(name).length() + String.valueOf(str).length());
            new RuntimeException(sb.append("Serializing ").append(name).append(" to a ").append(str).append(" threw an IOException (should never happen).").toString(), iOException);
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public int zzb() {
        Throwable th;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    /* access modifiers changed from: package-private */
    public void zza(int i) {
        Throwable th;
        int i2 = i;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }
}
