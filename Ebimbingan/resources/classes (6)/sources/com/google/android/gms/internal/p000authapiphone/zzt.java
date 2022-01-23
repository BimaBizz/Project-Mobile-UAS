package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.phone.SmsCodeBrowserClient;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzt  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public final class zzt extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsCodeBrowserClient {
    private static final Api.ClientKey<zzx> zza;
    private static final Api.AbstractClientBuilder<zzx, Api.ApiOptions.NoOptions> zzb;
    private static final Api<Api.ApiOptions.NoOptions> zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzt(@NonNull Context context) {
        super(context, zzc, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzt(@NonNull Activity activity) {
        super(activity, zzc, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<Void> startSmsCodeRetriever() {
        RemoteCall remoteCall;
        Feature[] featureArr = {zzad.zzb};
        new zzw(this);
        return doWrite(TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    static {
        Api.ClientKey<zzx> clientKey;
        Api.AbstractClientBuilder<zzx, Api.ApiOptions.NoOptions> abstractClientBuilder;
        Api<Api.ApiOptions.NoOptions> api;
        new Api.ClientKey<>();
        zza = clientKey;
        new zzv();
        zzb = abstractClientBuilder;
        new Api<>("SmsCodeBrowser.API", zzb, zza);
        zzc = api;
    }
}
