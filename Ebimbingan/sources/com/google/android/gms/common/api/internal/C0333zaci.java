package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.common.api.internal.C0261RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.zaci */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0333zaci extends C0269UnregisterListenerMethod {
    final /* synthetic */ C0261RegistrationMethods.Builder zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0333zaci(C0261RegistrationMethods.Builder builder, C0254ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.zaa = builder;
    }

    /* access modifiers changed from: protected */
    public final void unregisterListener(C0211Api.AnyClient anyClient, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException {
        this.zaa.zab.accept(anyClient, taskCompletionSource);
    }
}
