package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.zacr */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0342zacr extends C0267TaskApiCall {
    final /* synthetic */ C0267TaskApiCall.Builder zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0342zacr(C0267TaskApiCall.Builder builder, C0186Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.zaa = builder;
    }

    /* access modifiers changed from: protected */
    public final void doExecute(C0211Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.zaa.zaa.accept(anyClient, taskCompletionSource);
    }
}
