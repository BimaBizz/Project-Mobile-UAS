package com.google.android.gms.auth.api.phone;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public interface SmsRetrieverApi {
    Task<Void> startSmsRetriever();

    Task<Void> startSmsUserConsent(@Nullable String str);
}
