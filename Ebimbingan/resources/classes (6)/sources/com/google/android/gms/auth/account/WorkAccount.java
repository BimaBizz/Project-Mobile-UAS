package com.google.android.gms.auth.account;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzao;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class WorkAccount {
    public static final Api<Api.ApiOptions.NoOptions> API;
    @Deprecated
    public static final WorkAccountApi WorkAccountApi;
    private static final Api.ClientKey<zzao> zza;
    private static final Api.AbstractClientBuilder<zzao, Api.ApiOptions.NoOptions> zzb;

    public static WorkAccountClient getClient(@NonNull Activity activity) {
        WorkAccountClient workAccountClient;
        new WorkAccountClient(activity);
        return workAccountClient;
    }

    public static WorkAccountClient getClient(@NonNull Context context) {
        WorkAccountClient workAccountClient;
        new WorkAccountClient(context);
        return workAccountClient;
    }

    private WorkAccount() {
    }

    static {
        Api.ClientKey<zzao> clientKey;
        Api.AbstractClientBuilder<zzao, Api.ApiOptions.NoOptions> abstractClientBuilder;
        Api<Api.ApiOptions.NoOptions> api;
        WorkAccountApi workAccountApi;
        new Api.ClientKey<>();
        zza = clientKey;
        new zzf();
        zzb = abstractClientBuilder;
        new Api<>("WorkAccount.API", zzb, zza);
        API = api;
        new zzaf();
        WorkAccountApi = workAccountApi;
    }
}
