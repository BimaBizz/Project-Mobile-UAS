package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaas implements zaba {
    @NotOnlyInitialized
    private final zabd zaa;

    public zaas(zabd zabd) {
        this.zaa = zabd;
    }

    public final void zaa() {
        for (Api.Client disconnect : this.zaa.zaa.values()) {
            disconnect.disconnect();
        }
        this.zaa.zag.zad = Collections.emptySet();
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zab(T t) {
        T t2 = t;
        boolean add = this.zaa.zag.zaa.add(t2);
        return t2;
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zac(T t) {
        Throwable th;
        T t2 = t;
        new IllegalStateException("GoogleApiClient is not connected yet.");
        throw th;
    }

    public final boolean zad() {
        return true;
    }

    public final void zae() {
        this.zaa.zao();
    }

    public final void zaf(@Nullable Bundle bundle) {
    }

    public final void zag(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    public final void zah(int i) {
    }
}
