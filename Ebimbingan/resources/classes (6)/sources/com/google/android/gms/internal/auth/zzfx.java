package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzfx;
import com.google.android.gms.internal.auth.zzfy;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class zzfx<MessageType extends zzfy<MessageType, BuilderType>, BuilderType extends zzfx<MessageType, BuilderType>> implements zziv {
    public zzfx() {
    }

    /* renamed from: zza */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    public abstract BuilderType zza(MessageType messagetype);

    public final /* synthetic */ zziv zza(zzis zzis) {
        Throwable th;
        zzis zzis2 = zzis;
        if (zzh().getClass().isInstance(zzis2)) {
            return zza((zzfy) zzis2);
        }
        Throwable th2 = th;
        new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        throw th2;
    }
}
