package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.C0935zzfx;
import com.google.android.gms.internal.auth.C0936zzfy;

/* renamed from: com.google.android.gms.internal.auth.zzfx */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C0935zzfx<MessageType extends C0936zzfy<MessageType, BuilderType>, BuilderType extends C0935zzfx<MessageType, BuilderType>> implements C1014zziv {
    public C0935zzfx() {
    }

    /* renamed from: zza */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    public abstract BuilderType zza(MessageType messagetype);

    public final /* synthetic */ C1014zziv zza(C1011zzis zzis) {
        Throwable th;
        C1011zzis zzis2 = zzis;
        if (zzh().getClass().isInstance(zzis2)) {
            return zza((C0936zzfy) zzis2);
        }
        Throwable th2 = th;
        new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        throw th2;
    }
}
