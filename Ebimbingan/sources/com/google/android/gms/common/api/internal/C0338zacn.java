package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.internal.C0437IAccountAccessor;
import java.util.Set;

@WorkerThread
/* renamed from: com.google.android.gms.common.api.internal.zacn */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface C0338zacn {
    void zaa(C0184ConnectionResult connectionResult);

    void zab(@Nullable C0437IAccountAccessor iAccountAccessor, @Nullable Set<C0235Scope> set);
}
