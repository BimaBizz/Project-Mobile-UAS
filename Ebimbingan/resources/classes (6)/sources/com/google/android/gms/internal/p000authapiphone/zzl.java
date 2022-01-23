package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.phone.SmsCodeAutofillClient;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzl  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public final class zzl extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsCodeAutofillClient {
    private static final Api.ClientKey<zzx> zza;
    private static final Api.AbstractClientBuilder<zzx, Api.ApiOptions.NoOptions> zzb;
    private static final Api<Api.ApiOptions.NoOptions> zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzl(@NonNull Context context) {
        super(context, zzc, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzl(@NonNull Activity activity) {
        super(activity, zzc, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<Void> startSmsCodeRetriever() {
        RemoteCall remoteCall;
        Feature[] featureArr = {zzad.zza};
        new zzo(this);
        return doWrite(TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    public final Task<Integer> checkPermissionState() {
        RemoteCall remoteCall;
        Feature[] featureArr = {zzad.zza};
        new zzn(this);
        return doRead(TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    public final Task<Boolean> hasOngoingSmsRequest(@NonNull String str) {
        RemoteCall remoteCall;
        String str2 = str;
        Object checkNotNull = Preconditions.checkNotNull(str2);
        Preconditions.checkArgument(!str2.isEmpty(), "The package name cannot be empty.");
        Feature[] featureArr = {zzad.zza};
        new zzq(this, str2);
        return doRead(TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    static {
        Api.ClientKey<zzx> clientKey;
        Api.AbstractClientBuilder<zzx, Api.ApiOptions.NoOptions> abstractClientBuilder;
        Api<Api.ApiOptions.NoOptions> api;
        new Api.ClientKey<>();
        zza = clientKey;
        new zzp();
        zzb = abstractClientBuilder;
        new Api<>("SmsCodeAutofill.API", zzb, zza);
        zzc = api;
    }
}
