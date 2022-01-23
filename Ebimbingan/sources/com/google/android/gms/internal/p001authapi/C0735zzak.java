package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.C0085CredentialSavingClient;
import com.google.android.gms.auth.api.identity.C0088SavePasswordRequest;
import com.google.android.gms.auth.api.identity.C0089SavePasswordResult;
import com.google.android.gms.auth.api.identity.C0096zzf;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api.zzak  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0735zzak extends C0220GoogleApi<C0096zzf> implements C0085CredentialSavingClient {
    private static final C0211Api<C0096zzf> API;
    private static final C0211Api.ClientKey<C0726zzab> CLIENT_KEY;
    private static final C0211Api.AbstractClientBuilder<C0726zzab, C0096zzf> zzbn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0735zzak(@NonNull Context context, @NonNull C0096zzf zzf) {
        super(context, API, C0096zzf.zzc.zzc(zzf).zze(C0751zzba.zzw()).zzi(), C0220GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0735zzak(@NonNull Activity activity, @NonNull C0096zzf zzf) {
        super(activity, API, C0096zzf.zzc.zzc(zzf).zze(C0751zzba.zzw()).zzi(), C0220GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<C0089SavePasswordResult> savePassword(@NonNull C0088SavePasswordRequest savePasswordRequest) {
        C0262RemoteCall remoteCall;
        C0088SavePasswordRequest build = C0088SavePasswordRequest.zzc(savePasswordRequest).zzg(((C0096zzf) getApiOptions()).zzh()).build();
        C0186Feature[] featureArr = {C0749zzay.zzdg};
        new C0738zzan(this, build);
        return doRead(C0267TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).setAutoResolveMissingFeatures(false).build());
    }

    static {
        C0211Api.ClientKey<C0726zzab> clientKey;
        C0211Api.AbstractClientBuilder<C0726zzab, C0096zzf> abstractClientBuilder;
        C0211Api<C0096zzf> api;
        new C0211Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        new C0737zzam();
        zzbn = abstractClientBuilder;
        new C0211Api<>("Auth.Api.Identity.CredentialSaving.API", zzbn, CLIENT_KEY);
        API = api;
    }
}
