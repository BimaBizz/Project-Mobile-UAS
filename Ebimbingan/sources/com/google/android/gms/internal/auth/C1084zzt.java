package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.C0012AccountChangeEventsRequest;
import com.google.android.gms.auth.C0013AccountChangeEventsResponse;
import com.google.android.gms.auth.C0171zzc;
import com.google.android.gms.auth.C0173zze;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.api.internal.C0268TaskUtil;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.logging.C0547Logger;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth.zzt */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1084zzt extends C0220GoogleApi<C0211Api.ApiOptions.NoOptions> implements C0965zzh {
    private static final C0211Api.ClientKey<C0992zzi> zza;
    private static final C0211Api.AbstractClientBuilder<C0992zzi, C0211Api.ApiOptions.NoOptions> zzb;
    private static final C0211Api<C0211Api.ApiOptions.NoOptions> zzc;
    private static final C0547Logger zzd = C0171zzc.zza("GoogleAuthServiceClient");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1084zzt(@NonNull Context context) {
        super(context, zzc, null, C0220GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<Bundle> zza(@NonNull Account account, @NonNull String str, Bundle bundle) {
        C0262RemoteCall remoteCall;
        Account account2 = account;
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(account2, "Account name cannot be null!");
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2, "Scope cannot be null!");
        C0186Feature[] featureArr = {C0173zze.zza};
        new C1083zzs(this, account2, str2, bundle);
        return doWrite(C0267TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    public final Task<Void> zza(C0832zzcb zzcb) {
        C0262RemoteCall remoteCall;
        C0186Feature[] featureArr = {C0173zze.zza};
        new C1086zzv(this, zzcb);
        return doWrite(C0267TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    public final Task<Bundle> zza(@NonNull String str) {
        C0262RemoteCall remoteCall;
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(str2, "Client package name cannot be null!");
        C0186Feature[] featureArr = {C0173zze.zzb};
        new C1085zzu(this, str2);
        return doWrite(C0267TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    public final Task<C0013AccountChangeEventsResponse> zza(@NonNull C0012AccountChangeEventsRequest accountChangeEventsRequest) {
        C0262RemoteCall remoteCall;
        C0012AccountChangeEventsRequest accountChangeEventsRequest2 = accountChangeEventsRequest;
        Object checkNotNull = C0446Preconditions.checkNotNull(accountChangeEventsRequest2, "request cannot be null.");
        C0186Feature[] featureArr = {C0173zze.zzb};
        new C1088zzx(this, accountChangeEventsRequest2);
        return doWrite(C0267TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    public final Task<Bundle> zza(@NonNull Account account) {
        C0262RemoteCall remoteCall;
        Account account2 = account;
        Object checkNotNull = C0446Preconditions.checkNotNull(account2, "account cannot be null.");
        C0186Feature[] featureArr = {C0173zze.zzb};
        new C1087zzw(this, account2);
        return doWrite(C0267TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    /* access modifiers changed from: private */
    public static <ResultT> void zzb(C0236Status status, @Nullable ResultT resultt, TaskCompletionSource<ResultT> taskCompletionSource) {
        if (!C0268TaskUtil.trySetResultOrApiException(status, resultt, taskCompletionSource)) {
            zzd.w("The task is already complete.", new Object[0]);
        }
    }

    static {
        C0211Api.ClientKey<C0992zzi> clientKey;
        C0211Api.AbstractClientBuilder<C0992zzi, C0211Api.ApiOptions.NoOptions> abstractClientBuilder;
        C0211Api<C0211Api.ApiOptions.NoOptions> api;
        new C0211Api.ClientKey<>();
        zza = clientKey;
        new C1090zzz();
        zzb = abstractClientBuilder;
        new C0211Api<>("GoogleAuthService.API", zzb, zza);
        zzc = api;
    }
}
