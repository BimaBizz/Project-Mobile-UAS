package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.p000authapiphone.zzx;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public abstract class SmsRetrieverClient extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsRetrieverApi {
    private static final Api.ClientKey<zzx> zza;
    private static final Api.AbstractClientBuilder<zzx, Api.ApiOptions.NoOptions> zzb;
    private static final Api<Api.ApiOptions.NoOptions> zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmsRetrieverClient(@NonNull Context context) {
        super(context, zzc, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public abstract Task<Void> startSmsRetriever();

    public abstract Task<Void> startSmsUserConsent(@Nullable String str);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmsRetrieverClient(@NonNull Activity activity) {
        super(activity, zzc, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    static {
        Api.ClientKey<zzx> clientKey;
        Api.AbstractClientBuilder<zzx, Api.ApiOptions.NoOptions> abstractClientBuilder;
        Api<Api.ApiOptions.NoOptions> api;
        new Api.ClientKey<>();
        zza = clientKey;
        new zza();
        zzb = abstractClientBuilder;
        new Api<>("SmsRetriever.API", zzb, zza);
        zzc = api;
    }
}
