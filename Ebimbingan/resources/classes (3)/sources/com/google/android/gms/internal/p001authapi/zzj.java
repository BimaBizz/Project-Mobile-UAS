package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.internal.auth-api.zzj  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzj implements CredentialsApi {
    public zzj() {
    }

    public final PendingResult<CredentialRequestResult> request(GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        BaseImplementation.ApiMethodImpl apiMethodImpl;
        GoogleApiClient googleApiClient2 = googleApiClient;
        CredentialRequest credentialRequest2 = credentialRequest;
        Object checkNotNull = Preconditions.checkNotNull(googleApiClient2, "client must not be null");
        Object checkNotNull2 = Preconditions.checkNotNull(credentialRequest2, "request must not be null");
        new zzi(this, googleApiClient2, credentialRequest2);
        return googleApiClient2.enqueue(apiMethodImpl);
    }

    public final PendingIntent getHintPickerIntent(GoogleApiClient googleApiClient, HintRequest hintRequest) {
        GoogleApiClient googleApiClient2 = googleApiClient;
        HintRequest hintRequest2 = hintRequest;
        Object checkNotNull = Preconditions.checkNotNull(googleApiClient2, "client must not be null");
        Object checkNotNull2 = Preconditions.checkNotNull(hintRequest2, "request must not be null");
        Auth.AuthCredentialsOptions zzf = ((zzq) googleApiClient2.getClient(Auth.zzg)).zzf();
        return zzr.zzc(googleApiClient2.getContext(), zzf, hintRequest2, zzf.getLogSessionId());
    }

    public final PendingResult<Status> save(GoogleApiClient googleApiClient, Credential credential) {
        BaseImplementation.ApiMethodImpl apiMethodImpl;
        GoogleApiClient googleApiClient2 = googleApiClient;
        Credential credential2 = credential;
        Object checkNotNull = Preconditions.checkNotNull(googleApiClient2, "client must not be null");
        Object checkNotNull2 = Preconditions.checkNotNull(credential2, "credential must not be null");
        new zzk(this, googleApiClient2, credential2);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final PendingResult<Status> delete(GoogleApiClient googleApiClient, Credential credential) {
        BaseImplementation.ApiMethodImpl apiMethodImpl;
        GoogleApiClient googleApiClient2 = googleApiClient;
        Credential credential2 = credential;
        Object checkNotNull = Preconditions.checkNotNull(googleApiClient2, "client must not be null");
        Object checkNotNull2 = Preconditions.checkNotNull(credential2, "credential must not be null");
        new zzn(this, googleApiClient2, credential2);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final PendingResult<Status> disableAutoSignIn(GoogleApiClient googleApiClient) {
        BaseImplementation.ApiMethodImpl apiMethodImpl;
        GoogleApiClient googleApiClient2 = googleApiClient;
        Object checkNotNull = Preconditions.checkNotNull(googleApiClient2, "client must not be null");
        new zzm(this, googleApiClient2);
        return googleApiClient2.execute(apiMethodImpl);
    }
}
