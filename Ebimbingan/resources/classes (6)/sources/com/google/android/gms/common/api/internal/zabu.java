package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface zabu {
    <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zab(@NonNull T t);

    <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zac(@NonNull T t);

    @Nullable
    ConnectionResult zad(@NonNull Api<?> api);

    void zae();

    ConnectionResult zaf();

    ConnectionResult zag(long j, TimeUnit timeUnit);

    void zah();

    boolean zai();

    boolean zaj();

    boolean zak(SignInConnectionListener signInConnectionListener);

    void zal();

    void zam();

    void zan(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr);
}
