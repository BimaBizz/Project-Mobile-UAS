package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzfx;
import com.google.android.gms.internal.firebase_auth.zzga;

public abstract class zzga<MessageType extends zzfx<MessageType, BuilderType>, BuilderType extends zzga<MessageType, BuilderType>> implements zzjb {
    public zzga() {
    }

    /* access modifiers changed from: protected */
    public abstract BuilderType zza(MessageType messagetype);

    /* renamed from: zzfw */
    public abstract BuilderType clone();

    public final /* synthetic */ zzjb zzb(zzjc zzjc) {
        Throwable th;
        zzjc zzjc2 = zzjc;
        if (zzii().getClass().isInstance(zzjc2)) {
            return zza((zzfx) zzjc2);
        }
        Throwable th2 = th;
        new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        throw th2;
    }
}
