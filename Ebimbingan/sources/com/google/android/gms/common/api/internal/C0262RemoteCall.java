package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.RemoteCall */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface C0262RemoteCall<T, U> {
    @C0206KeepForSdk
    void accept(@RecentlyNonNull T t, @RecentlyNonNull U u) throws RemoteException;
}
