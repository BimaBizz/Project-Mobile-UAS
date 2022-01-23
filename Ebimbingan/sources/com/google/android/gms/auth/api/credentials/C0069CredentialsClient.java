package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.C0031Auth;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.C0230Response;
import com.google.android.gms.common.internal.C0445PendingResultUtil;
import com.google.android.gms.internal.p001authapi.C0767zzr;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.auth.api.credentials.CredentialsClient */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C0069CredentialsClient extends C0220GoogleApi<C0031Auth.AuthCredentialsOptions> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0069CredentialsClient(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.NonNull com.google.android.gms.auth.api.C0031Auth.AuthCredentialsOptions r12) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r0
            r4 = r1
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.Auth$AuthCredentialsOptions> r5 = com.google.android.gms.auth.api.C0031Auth.CREDENTIALS_API
            r6 = r2
            com.google.android.gms.common.api.internal.ApiExceptionMapper r7 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r9 = r7
            r7 = r9
            r8 = r9
            r8.<init>()
            r3.<init>((android.content.Context) r4, r5, r6, (com.google.android.gms.common.api.internal.C0265StatusExceptionMapper) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.C0069CredentialsClient.<init>(android.content.Context, com.google.android.gms.auth.api.Auth$AuthCredentialsOptions):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0069CredentialsClient(@androidx.annotation.NonNull android.app.Activity r11, @androidx.annotation.NonNull com.google.android.gms.auth.api.C0031Auth.AuthCredentialsOptions r12) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r0
            r4 = r1
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.Auth$AuthCredentialsOptions> r5 = com.google.android.gms.auth.api.C0031Auth.CREDENTIALS_API
            r6 = r2
            com.google.android.gms.common.api.internal.ApiExceptionMapper r7 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r9 = r7
            r7 = r9
            r8 = r9
            r8.<init>()
            r3.<init>((android.app.Activity) r4, r5, r6, (com.google.android.gms.common.api.internal.C0265StatusExceptionMapper) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.C0069CredentialsClient.<init>(android.app.Activity, com.google.android.gms.auth.api.Auth$AuthCredentialsOptions):void");
    }

    public Task<C0065CredentialRequestResponse> request(@NonNull C0064CredentialRequest credentialRequest) {
        C0230Response response;
        new C0065CredentialRequestResponse();
        return C0445PendingResultUtil.toResponseTask(C0031Auth.CredentialsApi.request(asGoogleApiClient(), credentialRequest), response);
    }

    public PendingIntent getHintPickerIntent(@NonNull C0071HintRequest hintRequest) {
        return C0767zzr.zzc(getApplicationContext(), (C0031Auth.AuthCredentialsOptions) getApiOptions(), hintRequest, ((C0031Auth.AuthCredentialsOptions) getApiOptions()).getLogSessionId());
    }

    public Task<Void> save(@NonNull C0062Credential credential) {
        return C0445PendingResultUtil.toVoidTask(C0031Auth.CredentialsApi.save(asGoogleApiClient(), credential));
    }

    public Task<Void> delete(@NonNull C0062Credential credential) {
        return C0445PendingResultUtil.toVoidTask(C0031Auth.CredentialsApi.delete(asGoogleApiClient(), credential));
    }

    public Task<Void> disableAutoSignIn() {
        return C0445PendingResultUtil.toVoidTask(C0031Auth.CredentialsApi.disableAutoSignIn(asGoogleApiClient()));
    }
}
