package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.CredentialSavingClient;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.zzf;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api.zzak  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzak extends GoogleApi<zzf> implements CredentialSavingClient {
    private static final Api<zzf> API;
    private static final Api.ClientKey<zzab> CLIENT_KEY;
    private static final Api.AbstractClientBuilder<zzab, zzf> zzbn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzak(@NonNull Context context, @NonNull zzf zzf) {
        super(context, API, zzf.zzc.zzc(zzf).zze(zzba.zzw()).zzi(), GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzak(@NonNull Activity activity, @NonNull zzf zzf) {
        super(activity, API, zzf.zzc.zzc(zzf).zze(zzba.zzw()).zzi(), GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<SavePasswordResult> savePassword(@NonNull SavePasswordRequest savePasswordRequest) {
        RemoteCall remoteCall;
        SavePasswordRequest build = SavePasswordRequest.zzc(savePasswordRequest).zzg(((zzf) getApiOptions()).zzh()).build();
        Feature[] featureArr = {zzay.zzdg};
        new zzan(this, build);
        return doRead(TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).setAutoResolveMissingFeatures(false).build());
    }

    static {
        Api.ClientKey<zzab> clientKey;
        Api.AbstractClientBuilder<zzab, zzf> abstractClientBuilder;
        Api<zzf> api;
        new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        new zzam();
        zzbn = abstractClientBuilder;
        new Api<>("Auth.Api.Identity.CredentialSaving.API", zzbn, CLIENT_KEY);
        API = api;
    }
}
