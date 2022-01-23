package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.internal.C0261RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.zach */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0332zach extends C0260RegisterListenerMethod {
    final /* synthetic */ C0261RegistrationMethods.Builder zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0332zach(C0261RegistrationMethods.Builder builder, C0254ListenerHolder listenerHolder, C0186Feature[] featureArr, boolean z, int i) {
        super(listenerHolder, featureArr, z, i);
        this.zaa = builder;
    }

    /* access modifiers changed from: protected */
    public final void registerListener(C0211Api.AnyClient anyClient, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        this.zaa.zaa.accept(anyClient, taskCompletionSource);
    }
}
