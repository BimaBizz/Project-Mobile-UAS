package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;

/* renamed from: com.google.android.gms.common.api.internal.zaba */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface C0298zaba {
    void zaa();

    <A extends C0211Api.AnyClient, R extends C0231Result, T extends C0243BaseImplementation.ApiMethodImpl<R, A>> T zab(T t);

    <A extends C0211Api.AnyClient, T extends C0243BaseImplementation.ApiMethodImpl<? extends C0231Result, A>> T zac(T t);

    boolean zad();

    void zae();

    void zaf(@Nullable Bundle bundle);

    void zag(C0184ConnectionResult connectionResult, C0211Api<?> api, boolean z);

    void zah(int i);
}
