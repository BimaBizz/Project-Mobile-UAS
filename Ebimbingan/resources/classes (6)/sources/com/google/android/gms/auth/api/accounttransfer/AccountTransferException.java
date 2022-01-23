package com.google.android.gms.auth.api.accounttransfer;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class AccountTransferException extends ApiException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountTransferException(@NonNull Status status) {
        super(status);
    }
}
