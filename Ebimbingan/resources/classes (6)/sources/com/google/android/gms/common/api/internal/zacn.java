package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

@WorkerThread
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface zacn {
    void zaa(ConnectionResult connectionResult);

    void zab(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set);
}
