package com.google.android.gms.auth.account;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.internal.auth.C0782zzaf;
import com.google.android.gms.internal.auth.C0791zzao;

/* renamed from: com.google.android.gms.auth.account.WorkAccount */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0021WorkAccount {
    public static final C0211Api<C0211Api.ApiOptions.NoOptions> API;
    @Deprecated
    public static final C0022WorkAccountApi WorkAccountApi;
    private static final C0211Api.ClientKey<C0791zzao> zza;
    private static final C0211Api.AbstractClientBuilder<C0791zzao, C0211Api.ApiOptions.NoOptions> zzb;

    public static C0023WorkAccountClient getClient(@NonNull Activity activity) {
        C0023WorkAccountClient workAccountClient;
        new C0023WorkAccountClient(activity);
        return workAccountClient;
    }

    public static C0023WorkAccountClient getClient(@NonNull Context context) {
        C0023WorkAccountClient workAccountClient;
        new C0023WorkAccountClient(context);
        return workAccountClient;
    }

    private C0021WorkAccount() {
    }

    static {
        C0211Api.ClientKey<C0791zzao> clientKey;
        C0211Api.AbstractClientBuilder<C0791zzao, C0211Api.ApiOptions.NoOptions> abstractClientBuilder;
        C0211Api<C0211Api.ApiOptions.NoOptions> api;
        C0022WorkAccountApi workAccountApi;
        new C0211Api.ClientKey<>();
        zza = clientKey;
        new C0029zzf();
        zzb = abstractClientBuilder;
        new C0211Api<>("WorkAccount.API", zzb, zza);
        API = api;
        new C0782zzaf();
        WorkAccountApi = workAccountApi;
    }
}
