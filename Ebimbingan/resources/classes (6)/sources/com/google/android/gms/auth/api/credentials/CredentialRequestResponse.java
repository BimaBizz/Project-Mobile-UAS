package com.google.android.gms.auth.api.credentials;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Response;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class CredentialRequestResponse extends Response<CredentialRequestResult> {
    public CredentialRequestResponse() {
    }

    @Nullable
    public Credential getCredential() {
        return ((CredentialRequestResult) getResult()).getCredential();
    }
}
