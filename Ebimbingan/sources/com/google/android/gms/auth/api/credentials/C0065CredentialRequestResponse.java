package com.google.android.gms.auth.api.credentials;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0230Response;

/* renamed from: com.google.android.gms.auth.api.credentials.CredentialRequestResponse */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C0065CredentialRequestResponse extends C0230Response<C0066CredentialRequestResult> {
    public C0065CredentialRequestResponse() {
    }

    @Nullable
    public C0062Credential getCredential() {
        return ((C0066CredentialRequestResult) getResult()).getCredential();
    }
}
