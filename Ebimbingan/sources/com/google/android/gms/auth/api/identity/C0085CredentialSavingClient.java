package com.google.android.gms.auth.api.identity;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0223HasApiKey;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.auth.api.identity.CredentialSavingClient */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public interface C0085CredentialSavingClient extends C0223HasApiKey<C0096zzf> {
    Task<C0089SavePasswordResult> savePassword(@NonNull C0088SavePasswordRequest savePasswordRequest);
}
