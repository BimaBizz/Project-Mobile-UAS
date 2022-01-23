package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.internal.zaas */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0289zaas implements C0298zaba {
    @NotOnlyInitialized
    private final C0301zabd zaa;

    public C0289zaas(C0301zabd zabd) {
        this.zaa = zabd;
    }

    public final void zaa() {
        for (C0211Api.Client disconnect : this.zaa.zaa.values()) {
            disconnect.disconnect();
        }
        this.zaa.zag.zad = Collections.emptySet();
    }

    public final <A extends C0211Api.AnyClient, R extends C0231Result, T extends C0243BaseImplementation.ApiMethodImpl<R, A>> T zab(T t) {
        T t2 = t;
        boolean add = this.zaa.zag.zaa.add(t2);
        return t2;
    }

    public final <A extends C0211Api.AnyClient, T extends C0243BaseImplementation.ApiMethodImpl<? extends C0231Result, A>> T zac(T t) {
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

    public final void zag(C0184ConnectionResult connectionResult, C0211Api<?> api, boolean z) {
    }

    public final void zah(int i) {
    }
}
