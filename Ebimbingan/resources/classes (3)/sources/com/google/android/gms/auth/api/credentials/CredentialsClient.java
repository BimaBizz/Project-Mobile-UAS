package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.p001authapi.zzr;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class CredentialsClient extends GoogleApi<Auth.AuthCredentialsOptions> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    CredentialsClient(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.NonNull com.google.android.gms.auth.api.Auth.AuthCredentialsOptions r12) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r0
            r4 = r1
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.Auth$AuthCredentialsOptions> r5 = com.google.android.gms.auth.api.Auth.CREDENTIALS_API
            r6 = r2
            com.google.android.gms.common.api.internal.ApiExceptionMapper r7 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r9 = r7
            r7 = r9
            r8 = r9
            r8.<init>()
            r3.<init>((android.content.Context) r4, r5, r6, (com.google.android.gms.common.api.internal.StatusExceptionMapper) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.CredentialsClient.<init>(android.content.Context, com.google.android.gms.auth.api.Auth$AuthCredentialsOptions):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    CredentialsClient(@androidx.annotation.NonNull android.app.Activity r11, @androidx.annotation.NonNull com.google.android.gms.auth.api.Auth.AuthCredentialsOptions r12) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r0
            r4 = r1
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.Auth$AuthCredentialsOptions> r5 = com.google.android.gms.auth.api.Auth.CREDENTIALS_API
            r6 = r2
            com.google.android.gms.common.api.internal.ApiExceptionMapper r7 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r9 = r7
            r7 = r9
            r8 = r9
            r8.<init>()
            r3.<init>((android.app.Activity) r4, r5, r6, (com.google.android.gms.common.api.internal.StatusExceptionMapper) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.CredentialsClient.<init>(android.app.Activity, com.google.android.gms.auth.api.Auth$AuthCredentialsOptions):void");
    }

    public Task<CredentialRequestResponse> request(@NonNull CredentialRequest credentialRequest) {
        Response response;
        new CredentialRequestResponse();
        return PendingResultUtil.toResponseTask(Auth.CredentialsApi.request(asGoogleApiClient(), credentialRequest), response);
    }

    public PendingIntent getHintPickerIntent(@NonNull HintRequest hintRequest) {
        return zzr.zzc(getApplicationContext(), (Auth.AuthCredentialsOptions) getApiOptions(), hintRequest, ((Auth.AuthCredentialsOptions) getApiOptions()).getLogSessionId());
    }

    public Task<Void> save(@NonNull Credential credential) {
        return PendingResultUtil.toVoidTask(Auth.CredentialsApi.save(asGoogleApiClient(), credential));
    }

    public Task<Void> delete(@NonNull Credential credential) {
        return PendingResultUtil.toVoidTask(Auth.CredentialsApi.delete(asGoogleApiClient(), credential));
    }

    public Task<Void> disableAutoSignIn() {
        return PendingResultUtil.toVoidTask(Auth.CredentialsApi.disableAutoSignIn(asGoogleApiClient()));
    }
}
