package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0211Api.AnyClient;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.RegisterListenerMethod */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0260RegisterListenerMethod<A extends C0211Api.AnyClient, L> {
    private final C0254ListenerHolder<L> zaa;
    @Nullable
    private final C0186Feature[] zab;
    private final boolean zac;
    private final int zad;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C0206KeepForSdk
    protected C0260RegisterListenerMethod(@RecentlyNonNull C0254ListenerHolder<L> listenerHolder) {
        this(listenerHolder, (C0186Feature[]) null, false, 0);
    }

    @C0206KeepForSdk
    protected C0260RegisterListenerMethod(@RecentlyNonNull C0254ListenerHolder<L> listenerHolder, @Nullable C0186Feature[] featureArr, boolean z, int i) {
        this.zaa = listenerHolder;
        this.zab = featureArr;
        this.zac = z;
        this.zad = i;
    }

    @C0206KeepForSdk
    public void clearListener() {
        this.zaa.clear();
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public C0254ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zaa.getListenerKey();
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public C0186Feature[] getRequiredFeatures() {
        return this.zab;
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public abstract void registerListener(@RecentlyNonNull A a, @RecentlyNonNull TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;

    public final boolean zaa() {
        return this.zac;
    }

    public final int zab() {
        return this.zad;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C0206KeepForSdk
    protected C0260RegisterListenerMethod(@RecentlyNonNull C0254ListenerHolder<L> listenerHolder, @RecentlyNonNull C0186Feature[] featureArr, boolean z) {
        this(listenerHolder, featureArr, z, 0);
    }
}
