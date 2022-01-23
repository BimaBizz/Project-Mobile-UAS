package com.google.android.gms.auth.api.phone;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.auth.api.phone.SmsRetrieverApi */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public interface C0110SmsRetrieverApi {
    Task<Void> startSmsRetriever();

    Task<Void> startSmsUserConsent(@Nullable String str);
}
