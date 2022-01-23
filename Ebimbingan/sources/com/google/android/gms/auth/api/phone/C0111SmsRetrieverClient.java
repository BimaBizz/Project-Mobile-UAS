package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.internal.p000authapiphone.C0722zzx;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.auth.api.phone.SmsRetrieverClient */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public abstract class C0111SmsRetrieverClient extends C0220GoogleApi<C0211Api.ApiOptions.NoOptions> implements C0110SmsRetrieverApi {
    private static final C0211Api.ClientKey<C0722zzx> zza;
    private static final C0211Api.AbstractClientBuilder<C0722zzx, C0211Api.ApiOptions.NoOptions> zzb;
    private static final C0211Api<C0211Api.ApiOptions.NoOptions> zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0111SmsRetrieverClient(@NonNull Context context) {
        super(context, zzc, null, C0220GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public abstract Task<Void> startSmsRetriever();

    public abstract Task<Void> startSmsUserConsent(@Nullable String str);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0111SmsRetrieverClient(@NonNull Activity activity) {
        super(activity, zzc, null, C0220GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    static {
        C0211Api.ClientKey<C0722zzx> clientKey;
        C0211Api.AbstractClientBuilder<C0722zzx, C0211Api.ApiOptions.NoOptions> abstractClientBuilder;
        C0211Api<C0211Api.ApiOptions.NoOptions> api;
        new C0211Api.ClientKey<>();
        zza = clientKey;
        new C0113zza();
        zzb = abstractClientBuilder;
        new C0211Api<>("SmsRetriever.API", zzb, zza);
        zzc = api;
    }
}
