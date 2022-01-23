package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0211Api;

/* renamed from: com.google.android.gms.common.api.internal.zacc */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0327zacc {
    public final C0260RegisterListenerMethod<C0211Api.AnyClient, ?> zaa;
    public final C0269UnregisterListenerMethod<C0211Api.AnyClient, ?> zab;
    public final Runnable zac;

    public C0327zacc(@NonNull C0260RegisterListenerMethod<C0211Api.AnyClient, ?> registerListenerMethod, @NonNull C0269UnregisterListenerMethod<C0211Api.AnyClient, ?> unregisterListenerMethod, @NonNull Runnable runnable) {
        this.zaa = registerListenerMethod;
        this.zab = unregisterListenerMethod;
        this.zac = runnable;
    }
}
