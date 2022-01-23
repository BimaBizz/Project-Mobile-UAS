package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.internal.C0261RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.zacg */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class C0331zacg implements C0262RemoteCall {
    private final C0261RegistrationMethods.Builder zaa;

    C0331zacg(C0261RegistrationMethods.Builder builder) {
        this.zaa = builder;
    }

    public final void accept(Object obj, Object obj2) {
        this.zaa.zaa((C0211Api.AnyClient) obj, (TaskCompletionSource) obj2);
    }
}
