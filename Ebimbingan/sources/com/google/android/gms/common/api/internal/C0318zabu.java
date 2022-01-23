package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.zabu */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface C0318zabu {
    <A extends C0211Api.AnyClient, R extends C0231Result, T extends C0243BaseImplementation.ApiMethodImpl<R, A>> T zab(@NonNull T t);

    <A extends C0211Api.AnyClient, T extends C0243BaseImplementation.ApiMethodImpl<? extends C0231Result, A>> T zac(@NonNull T t);

    @Nullable
    C0184ConnectionResult zad(@NonNull C0211Api<?> api);

    void zae();

    C0184ConnectionResult zaf();

    C0184ConnectionResult zag(long j, TimeUnit timeUnit);

    void zah();

    boolean zai();

    boolean zaj();

    boolean zak(C0263SignInConnectionListener signInConnectionListener);

    void zal();

    void zam();

    void zan(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr);
}
