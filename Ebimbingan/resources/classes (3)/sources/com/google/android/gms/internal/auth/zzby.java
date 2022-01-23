package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzby implements ProxyApi.SpatulaHeaderResult {
    private Status zza;
    private String zzb;

    public zzby(@Nonnull String str) {
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zza = Status.RESULT_SUCCESS;
    }

    public zzby(@Nonnull Status status) {
        this.zza = (Status) Preconditions.checkNotNull(status);
    }

    @Nullable
    public final Status getStatus() {
        return this.zza;
    }

    @Nullable
    public final String getSpatulaHeader() {
        return this.zzb;
    }
}
