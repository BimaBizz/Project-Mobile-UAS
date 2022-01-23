package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public interface zzh extends HasApiKey<Api.ApiOptions.NoOptions> {
    Task<Bundle> zza(@NonNull Account account);

    Task<Bundle> zza(@NonNull Account account, @NonNull String str, Bundle bundle);

    Task<AccountChangeEventsResponse> zza(@NonNull AccountChangeEventsRequest accountChangeEventsRequest);

    Task<Void> zza(zzcb zzcb);

    Task<Bundle> zza(@NonNull String str);
}
