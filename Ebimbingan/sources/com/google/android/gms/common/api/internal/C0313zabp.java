package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0211Api.ApiOptions;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.internal.zabp */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0313zabp<O extends C0211Api.ApiOptions> extends C0274zaad {
    @NotOnlyInitialized
    private final C0220GoogleApi<O> zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0313zabp(C0220GoogleApi<O> googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.zaa = googleApi;
    }

    public final <A extends C0211Api.AnyClient, R extends C0231Result, T extends C0243BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        return this.zaa.doRead(t);
    }

    public final <A extends C0211Api.AnyClient, T extends C0243BaseImplementation.ApiMethodImpl<? extends C0231Result, A>> T execute(@NonNull T t) {
        return this.zaa.doWrite(t);
    }

    public final Context getContext() {
        return this.zaa.getApplicationContext();
    }

    public final Looper getLooper() {
        return this.zaa.getLooper();
    }

    public final void zao(C0346zacv zacv) {
    }

    public final void zap(C0346zacv zacv) {
    }
}
