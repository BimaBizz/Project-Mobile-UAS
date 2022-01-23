package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.phone.C0106SmsCodeAutofillClient;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzl  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public final class C0710zzl extends C0220GoogleApi<C0211Api.ApiOptions.NoOptions> implements C0106SmsCodeAutofillClient {
    private static final C0211Api.ClientKey<C0722zzx> zza;
    private static final C0211Api.AbstractClientBuilder<C0722zzx, C0211Api.ApiOptions.NoOptions> zzb;
    private static final C0211Api<C0211Api.ApiOptions.NoOptions> zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0710zzl(@NonNull Context context) {
        super(context, zzc, null, C0220GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0710zzl(@NonNull Activity activity) {
        super(activity, zzc, null, C0220GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<Void> startSmsCodeRetriever() {
        C0262RemoteCall remoteCall;
        C0186Feature[] featureArr = {C0698zzad.zza};
        new C0713zzo(this);
        return doWrite(C0267TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    public final Task<Integer> checkPermissionState() {
        C0262RemoteCall remoteCall;
        C0186Feature[] featureArr = {C0698zzad.zza};
        new C0712zzn(this);
        return doRead(C0267TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    public final Task<Boolean> hasOngoingSmsRequest(@NonNull String str) {
        C0262RemoteCall remoteCall;
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(str2);
        C0446Preconditions.checkArgument(!str2.isEmpty(), "The package name cannot be empty.");
        C0186Feature[] featureArr = {C0698zzad.zza};
        new C0715zzq(this, str2);
        return doRead(C0267TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    static {
        C0211Api.ClientKey<C0722zzx> clientKey;
        C0211Api.AbstractClientBuilder<C0722zzx, C0211Api.ApiOptions.NoOptions> abstractClientBuilder;
        C0211Api<C0211Api.ApiOptions.NoOptions> api;
        new C0211Api.ClientKey<>();
        zza = clientKey;
        new C0714zzp();
        zzb = abstractClientBuilder;
        new C0211Api<>("SmsCodeAutofill.API", zzb, zza);
        zzc = api;
    }
}
