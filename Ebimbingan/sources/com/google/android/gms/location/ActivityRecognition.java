package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zze;

public class ActivityRecognition {
    public static final C0211Api<C0211Api.ApiOptions.NoOptions> API;
    @Deprecated
    public static final ActivityRecognitionApi ActivityRecognitionApi;
    private static final C0211Api.AbstractClientBuilder<zzaz, C0211Api.ApiOptions.NoOptions> CLIENT_BUILDER;
    private static final C0211Api.ClientKey<zzaz> CLIENT_KEY;
    public static final String CLIENT_NAME = "activity_recognition";

    public static abstract class zza<R extends C0231Result> extends C0243BaseImplementation.ApiMethodImpl<R, zzaz> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zza(C0222GoogleApiClient googleApiClient) {
            super((C0211Api<?>) ActivityRecognition.API, googleApiClient);
        }
    }

    static {
        C0211Api.ClientKey<zzaz> clientKey;
        C0211Api.AbstractClientBuilder<zzaz, C0211Api.ApiOptions.NoOptions> abstractClientBuilder;
        C0211Api<C0211Api.ApiOptions.NoOptions> api;
        ActivityRecognitionApi activityRecognitionApi;
        new C0211Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        new zza();
        CLIENT_BUILDER = abstractClientBuilder;
        new C0211Api<>("ActivityRecognition.API", CLIENT_BUILDER, CLIENT_KEY);
        API = api;
        new zze();
        ActivityRecognitionApi = activityRecognitionApi;
    }

    private ActivityRecognition() {
    }

    public static ActivityRecognitionClient getClient(Activity activity) {
        ActivityRecognitionClient activityRecognitionClient;
        new ActivityRecognitionClient(activity);
        return activityRecognitionClient;
    }

    public static ActivityRecognitionClient getClient(Context context) {
        ActivityRecognitionClient activityRecognitionClient;
        new ActivityRecognitionClient(context);
        return activityRecognitionClient;
    }
}
