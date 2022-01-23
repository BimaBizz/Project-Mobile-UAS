package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.zzl;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api.zzao  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzao extends GoogleApi<zzl> implements SignInClient {
    private static final Api<zzl> API;
    private static final Api.ClientKey<zzaw> CLIENT_KEY;
    private static final Api.AbstractClientBuilder<zzaw, zzl> zzbn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzao(@NonNull Context context, @NonNull zzl zzl) {
        super(context, API, zzl.zzc.zzc(zzl).zzh(zzba.zzw()).zzk(), GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzao(@NonNull Activity activity, @NonNull zzl zzl) {
        super(activity, API, zzl.zzc.zzc(zzl).zzh(zzba.zzw()).zzk(), GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<BeginSignInResult> beginSignIn(@NonNull BeginSignInRequest beginSignInRequest) {
        RemoteCall remoteCall;
        BeginSignInRequest build = BeginSignInRequest.zzc(beginSignInRequest).zzd(((zzl) getApiOptions()).zzh()).build();
        Feature[] featureArr = {zzay.zzdc};
        new zzar(this, build);
        return doRead(TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).setAutoResolveMissingFeatures(false).build());
    }

    public final Task<Void> signOut() {
        RemoteCall remoteCall;
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        for (GoogleApiClient maybeSignOut : GoogleApiClient.getAllClients()) {
            maybeSignOut.maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
        Feature[] featureArr = {zzay.zzdd};
        new zzaq(this);
        return doRead(TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).setAutoResolveMissingFeatures(false).build());
    }

    public final SignInCredential getSignInCredentialFromIntent(@Nullable Intent intent) throws ApiException {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Intent intent2 = intent;
        if (intent2 == null) {
            Throwable th5 = th4;
            new ApiException(Status.RESULT_INTERNAL_ERROR);
            throw th5;
        }
        Status status = (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent2, "status", Status.CREATOR);
        Status status2 = status;
        if (status == null) {
            Throwable th6 = th3;
            new ApiException(Status.RESULT_CANCELED);
            throw th6;
        } else if (!status2.isSuccess()) {
            Throwable th7 = th2;
            new ApiException(status2);
            throw th7;
        } else {
            SignInCredential signInCredential = (SignInCredential) SafeParcelableSerializer.deserializeFromIntentExtra(intent2, "sign_in_credential", SignInCredential.CREATOR);
            SignInCredential signInCredential2 = signInCredential;
            if (signInCredential != null) {
                return signInCredential2;
            }
            Throwable th8 = th;
            new ApiException(Status.RESULT_INTERNAL_ERROR);
            throw th8;
        }
    }

    public final Task<PendingIntent> getSignInIntent(@NonNull GetSignInIntentRequest getSignInIntentRequest) {
        RemoteCall remoteCall;
        GetSignInIntentRequest build = GetSignInIntentRequest.zzc(getSignInIntentRequest).zzf(((zzl) getApiOptions()).zzh()).build();
        Feature[] featureArr = {zzay.zzdh};
        new zzat(this, build);
        return doRead(TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    static {
        Api.ClientKey<zzaw> clientKey;
        Api.AbstractClientBuilder<zzaw, zzl> abstractClientBuilder;
        Api<zzl> api;
        new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        new zzas();
        zzbn = abstractClientBuilder;
        new Api<>("Auth.Api.Identity.SignIn.API", zzbn, CLIENT_KEY);
        API = api;
    }
}
