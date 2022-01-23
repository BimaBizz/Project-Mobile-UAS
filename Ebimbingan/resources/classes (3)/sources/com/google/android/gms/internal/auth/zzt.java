package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.zzc;
import com.google.android.gms.auth.zze;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzt extends GoogleApi<Api.ApiOptions.NoOptions> implements zzh {
    private static final Api.ClientKey<zzi> zza;
    private static final Api.AbstractClientBuilder<zzi, Api.ApiOptions.NoOptions> zzb;
    private static final Api<Api.ApiOptions.NoOptions> zzc;
    private static final Logger zzd = zzc.zza("GoogleAuthServiceClient");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzt(@NonNull Context context) {
        super(context, zzc, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<Bundle> zza(@NonNull Account account, @NonNull String str, Bundle bundle) {
        RemoteCall remoteCall;
        Account account2 = account;
        String str2 = str;
        Object checkNotNull = Preconditions.checkNotNull(account2, "Account name cannot be null!");
        String checkNotEmpty = Preconditions.checkNotEmpty(str2, "Scope cannot be null!");
        Feature[] featureArr = {zze.zza};
        new zzs(this, account2, str2, bundle);
        return doWrite(TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    public final Task<Void> zza(zzcb zzcb) {
        RemoteCall remoteCall;
        Feature[] featureArr = {zze.zza};
        new zzv(this, zzcb);
        return doWrite(TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    public final Task<Bundle> zza(@NonNull String str) {
        RemoteCall remoteCall;
        String str2 = str;
        Object checkNotNull = Preconditions.checkNotNull(str2, "Client package name cannot be null!");
        Feature[] featureArr = {zze.zzb};
        new zzu(this, str2);
        return doWrite(TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    public final Task<AccountChangeEventsResponse> zza(@NonNull AccountChangeEventsRequest accountChangeEventsRequest) {
        RemoteCall remoteCall;
        AccountChangeEventsRequest accountChangeEventsRequest2 = accountChangeEventsRequest;
        Object checkNotNull = Preconditions.checkNotNull(accountChangeEventsRequest2, "request cannot be null.");
        Feature[] featureArr = {zze.zzb};
        new zzx(this, accountChangeEventsRequest2);
        return doWrite(TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    public final Task<Bundle> zza(@NonNull Account account) {
        RemoteCall remoteCall;
        Account account2 = account;
        Object checkNotNull = Preconditions.checkNotNull(account2, "account cannot be null.");
        Feature[] featureArr = {zze.zzb};
        new zzw(this, account2);
        return doWrite(TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    /* access modifiers changed from: private */
    public static <ResultT> void zzb(Status status, @Nullable ResultT resultt, TaskCompletionSource<ResultT> taskCompletionSource) {
        if (!TaskUtil.trySetResultOrApiException(status, resultt, taskCompletionSource)) {
            zzd.w("The task is already complete.", new Object[0]);
        }
    }

    static {
        Api.ClientKey<zzi> clientKey;
        Api.AbstractClientBuilder<zzi, Api.ApiOptions.NoOptions> abstractClientBuilder;
        Api<Api.ApiOptions.NoOptions> api;
        new Api.ClientKey<>();
        zza = clientKey;
        new zzz();
        zzb = abstractClientBuilder;
        new Api<>("GoogleAuthService.API", zzb, zza);
        zzc = api;
    }
}
