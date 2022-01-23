package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.identity.C0083BeginSignInRequest;
import com.google.android.gms.auth.api.identity.C0084BeginSignInResult;
import com.google.android.gms.auth.api.identity.C0086GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.C0090SignInClient;
import com.google.android.gms.auth.api.identity.C0091SignInCredential;
import com.google.android.gms.auth.api.identity.C0102zzl;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0212ApiException;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0248GoogleApiManager;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.internal.safeparcel.C0464SafeParcelableSerializer;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api.zzao  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0739zzao extends C0220GoogleApi<C0102zzl> implements C0090SignInClient {
    private static final C0211Api<C0102zzl> API;
    private static final C0211Api.ClientKey<C0747zzaw> CLIENT_KEY;
    private static final C0211Api.AbstractClientBuilder<C0747zzaw, C0102zzl> zzbn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0739zzao(@NonNull Context context, @NonNull C0102zzl zzl) {
        super(context, API, C0102zzl.zzc.zzc(zzl).zzh(C0751zzba.zzw()).zzk(), C0220GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0739zzao(@NonNull Activity activity, @NonNull C0102zzl zzl) {
        super(activity, API, C0102zzl.zzc.zzc(zzl).zzh(C0751zzba.zzw()).zzk(), C0220GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<C0084BeginSignInResult> beginSignIn(@NonNull C0083BeginSignInRequest beginSignInRequest) {
        C0262RemoteCall remoteCall;
        C0083BeginSignInRequest build = C0083BeginSignInRequest.zzc(beginSignInRequest).zzd(((C0102zzl) getApiOptions()).zzh()).build();
        C0186Feature[] featureArr = {C0749zzay.zzdc};
        new C0742zzar(this, build);
        return doRead(C0267TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).setAutoResolveMissingFeatures(false).build());
    }

    public final Task<Void> signOut() {
        C0262RemoteCall remoteCall;
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        for (C0222GoogleApiClient maybeSignOut : C0222GoogleApiClient.getAllClients()) {
            maybeSignOut.maybeSignOut();
        }
        C0248GoogleApiManager.reportSignOut();
        C0186Feature[] featureArr = {C0749zzay.zzdd};
        new C0741zzaq(this);
        return doRead(C0267TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).setAutoResolveMissingFeatures(false).build());
    }

    public final C0091SignInCredential getSignInCredentialFromIntent(@Nullable Intent intent) throws C0212ApiException {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Intent intent2 = intent;
        if (intent2 == null) {
            Throwable th5 = th4;
            new C0212ApiException(C0236Status.RESULT_INTERNAL_ERROR);
            throw th5;
        }
        C0236Status status = (C0236Status) C0464SafeParcelableSerializer.deserializeFromIntentExtra(intent2, NotificationCompat.CATEGORY_STATUS, C0236Status.CREATOR);
        C0236Status status2 = status;
        if (status == null) {
            Throwable th6 = th3;
            new C0212ApiException(C0236Status.RESULT_CANCELED);
            throw th6;
        } else if (!status2.isSuccess()) {
            Throwable th7 = th2;
            new C0212ApiException(status2);
            throw th7;
        } else {
            C0091SignInCredential signInCredential = (C0091SignInCredential) C0464SafeParcelableSerializer.deserializeFromIntentExtra(intent2, "sign_in_credential", C0091SignInCredential.CREATOR);
            C0091SignInCredential signInCredential2 = signInCredential;
            if (signInCredential != null) {
                return signInCredential2;
            }
            Throwable th8 = th;
            new C0212ApiException(C0236Status.RESULT_INTERNAL_ERROR);
            throw th8;
        }
    }

    public final Task<PendingIntent> getSignInIntent(@NonNull C0086GetSignInIntentRequest getSignInIntentRequest) {
        C0262RemoteCall remoteCall;
        C0086GetSignInIntentRequest build = C0086GetSignInIntentRequest.zzc(getSignInIntentRequest).zzf(((C0102zzl) getApiOptions()).zzh()).build();
        C0186Feature[] featureArr = {C0749zzay.zzdh};
        new C0744zzat(this, build);
        return doRead(C0267TaskApiCall.builder().setFeatures(featureArr).run(remoteCall).build());
    }

    static {
        C0211Api.ClientKey<C0747zzaw> clientKey;
        C0211Api.AbstractClientBuilder<C0747zzaw, C0102zzl> abstractClientBuilder;
        C0211Api<C0102zzl> api;
        new C0211Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        new C0743zzas();
        zzbn = abstractClientBuilder;
        new C0211Api<>("Auth.Api.Identity.SignIn.API", zzbn, CLIENT_KEY);
        API = api;
    }
}
