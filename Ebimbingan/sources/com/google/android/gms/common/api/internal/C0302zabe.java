package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.C0621NumberedThreadFactory;
import com.google.android.gms.internal.base.C1102zal;
import com.google.android.gms.internal.base.C1105zao;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.api.internal.zabe */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0302zabe {
    private static final ExecutorService zaa;

    static {
        ThreadFactory threadFactory;
        C1102zal zaa2 = C1105zao.zaa();
        new C0621NumberedThreadFactory("GAC_Executor");
        zaa = zaa2.zab(2, threadFactory, 2);
    }

    public static ExecutorService zaa() {
        return zaa;
    }
}
