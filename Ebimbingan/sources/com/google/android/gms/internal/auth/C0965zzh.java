package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.C0012AccountChangeEventsRequest;
import com.google.android.gms.auth.C0013AccountChangeEventsResponse;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0223HasApiKey;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth.zzh */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public interface C0965zzh extends C0223HasApiKey<C0211Api.ApiOptions.NoOptions> {
    Task<Bundle> zza(@NonNull Account account);

    Task<Bundle> zza(@NonNull Account account, @NonNull String str, Bundle bundle);

    Task<C0013AccountChangeEventsResponse> zza(@NonNull C0012AccountChangeEventsRequest accountChangeEventsRequest);

    Task<Void> zza(C0832zzcb zzcb);

    Task<Bundle> zza(@NonNull String str);
}
