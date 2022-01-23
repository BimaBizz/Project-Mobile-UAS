package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0211Api.AnyClient;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.UnregisterListenerMethod */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0269UnregisterListenerMethod<A extends C0211Api.AnyClient, L> {
    private final C0254ListenerHolder.ListenerKey<L> zaa;

    @C0206KeepForSdk
    protected C0269UnregisterListenerMethod(@RecentlyNonNull C0254ListenerHolder.ListenerKey<L> listenerKey) {
        this.zaa = listenerKey;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public C0254ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zaa;
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public abstract void unregisterListener(@RecentlyNonNull A a, @RecentlyNonNull TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException;
}
