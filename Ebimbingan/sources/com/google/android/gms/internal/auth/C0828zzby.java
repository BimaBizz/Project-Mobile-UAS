package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.C0115ProxyApi;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.C0446Preconditions;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.auth.zzby */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0828zzby implements C0115ProxyApi.SpatulaHeaderResult {
    private C0236Status zza;
    private String zzb;

    public C0828zzby(@Nonnull String str) {
        this.zzb = (String) C0446Preconditions.checkNotNull(str);
        this.zza = C0236Status.RESULT_SUCCESS;
    }

    public C0828zzby(@Nonnull C0236Status status) {
        this.zza = (C0236Status) C0446Preconditions.checkNotNull(status);
    }

    @Nullable
    public final C0236Status getStatus() {
        return this.zza;
    }

    @Nullable
    public final String getSpatulaHeader() {
        return this.zzb;
    }
}
