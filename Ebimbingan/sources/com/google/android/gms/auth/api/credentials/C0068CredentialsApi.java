package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.auth.api.credentials.CredentialsApi */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public interface C0068CredentialsApi {
    public static final int ACTIVITY_RESULT_ADD_ACCOUNT = 1000;
    public static final int ACTIVITY_RESULT_NO_HINTS_AVAILABLE = 1002;
    public static final int ACTIVITY_RESULT_OTHER_ACCOUNT = 1001;
    public static final int CREDENTIAL_PICKER_REQUEST_CODE = 2000;

    C0225PendingResult<C0236Status> delete(C0222GoogleApiClient googleApiClient, C0062Credential credential);

    C0225PendingResult<C0236Status> disableAutoSignIn(C0222GoogleApiClient googleApiClient);

    PendingIntent getHintPickerIntent(C0222GoogleApiClient googleApiClient, C0071HintRequest hintRequest);

    C0225PendingResult<C0066CredentialRequestResult> request(C0222GoogleApiClient googleApiClient, C0064CredentialRequest credentialRequest);

    C0225PendingResult<C0236Status> save(C0222GoogleApiClient googleApiClient, C0062Credential credential);
}
