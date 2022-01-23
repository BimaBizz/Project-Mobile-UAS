package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.util.C0590BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.zacq */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class C0341zacq implements C0262RemoteCall {
    private final C0590BiConsumer zaa;

    C0341zacq(C0590BiConsumer biConsumer) {
        this.zaa = biConsumer;
    }

    public final void accept(Object obj, Object obj2) {
        this.zaa.accept((C0211Api.AnyClient) obj, (TaskCompletionSource) obj2);
    }
}
