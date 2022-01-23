package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.phone.C0107SmsCodeBrowserClient;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzt  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public final class C0718zzt extends C0220GoogleApi<C0211Api.ApiOptions.NoOptions> implements C0107SmsCodeBrowserClient {
    private static final C0211Api.ClientKey<C0722zzx> zza;
    private static final C0211Api.AbstractClientBuilder<C0722zzx, C0211Api.ApiOptions.NoOptions> zzb;
    private static final C0211Api<C0211Api.ApiOptions.NoOptions> zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0718zzt(@NonNull Context context) {
        super(context, zzc, null, C0220GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0718zzt(@NonNull Activity activity) {
        super(activity, zzc, null, C0220GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<Void> startSmsCodeRetriever() {
        C0262RemoteCall remoteCall;
        C0186Feature[] featureArr = {C0698zzad.zzb};
        new C0721zzw(this);
        return doWrite(C0267TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    static {
        C0211Api.ClientKey<C0722zzx> clientKey;
        C0211Api.AbstractClientBuilder<C0722zzx, C0211Api.ApiOptions.NoOptions> abstractClientBuilder;
        C0211Api<C0211Api.ApiOptions.NoOptions> api;
        new C0211Api.ClientKey<>();
        zza = clientKey;
        new C0720zzv();
        zzb = abstractClientBuilder;
        new C0211Api<>("SmsCodeBrowser.API", zzb, zza);
        zzc = api;
    }
}
