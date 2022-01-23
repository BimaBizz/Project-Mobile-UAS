package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.internal.base.zao;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zacj {
    private static final ExecutorService zaa;

    static {
        ThreadFactory threadFactory;
        zal zaa2 = zao.zaa();
        new NumberedThreadFactory("GAC_Transform");
        zaa = zaa2.zac(threadFactory, 1);
    }

    public static ExecutorService zaa() {
        return zaa;
    }
}
