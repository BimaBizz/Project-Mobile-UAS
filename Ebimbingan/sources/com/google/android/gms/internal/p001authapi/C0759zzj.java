package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.C0031Auth;
import com.google.android.gms.auth.api.credentials.C0062Credential;
import com.google.android.gms.auth.api.credentials.C0064CredentialRequest;
import com.google.android.gms.auth.api.credentials.C0066CredentialRequestResult;
import com.google.android.gms.auth.api.credentials.C0068CredentialsApi;
import com.google.android.gms.auth.api.credentials.C0071HintRequest;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.common.internal.C0446Preconditions;

/* renamed from: com.google.android.gms.internal.auth-api.zzj  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0759zzj implements C0068CredentialsApi {
    public C0759zzj() {
    }

    public final C0225PendingResult<C0066CredentialRequestResult> request(C0222GoogleApiClient googleApiClient, C0064CredentialRequest credentialRequest) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        C0064CredentialRequest credentialRequest2 = credentialRequest;
        Object checkNotNull = C0446Preconditions.checkNotNull(googleApiClient2, "client must not be null");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(credentialRequest2, "request must not be null");
        new C0758zzi(this, googleApiClient2, credentialRequest2);
        return googleApiClient2.enqueue(apiMethodImpl);
    }

    public final PendingIntent getHintPickerIntent(C0222GoogleApiClient googleApiClient, C0071HintRequest hintRequest) {
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        C0071HintRequest hintRequest2 = hintRequest;
        Object checkNotNull = C0446Preconditions.checkNotNull(googleApiClient2, "client must not be null");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(hintRequest2, "request must not be null");
        C0031Auth.AuthCredentialsOptions zzf = ((C0766zzq) googleApiClient2.getClient(C0031Auth.zzg)).zzf();
        return C0767zzr.zzc(googleApiClient2.getContext(), zzf, hintRequest2, zzf.getLogSessionId());
    }

    public final C0225PendingResult<C0236Status> save(C0222GoogleApiClient googleApiClient, C0062Credential credential) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        C0062Credential credential2 = credential;
        Object checkNotNull = C0446Preconditions.checkNotNull(googleApiClient2, "client must not be null");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(credential2, "credential must not be null");
        new C0760zzk(this, googleApiClient2, credential2);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0236Status> delete(C0222GoogleApiClient googleApiClient, C0062Credential credential) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        C0062Credential credential2 = credential;
        Object checkNotNull = C0446Preconditions.checkNotNull(googleApiClient2, "client must not be null");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(credential2, "credential must not be null");
        new C0763zzn(this, googleApiClient2, credential2);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0236Status> disableAutoSignIn(C0222GoogleApiClient googleApiClient) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        Object checkNotNull = C0446Preconditions.checkNotNull(googleApiClient2, "client must not be null");
        new C0762zzm(this, googleApiClient2);
        return googleApiClient2.execute(apiMethodImpl);
    }
}
