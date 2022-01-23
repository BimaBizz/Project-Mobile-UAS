package com.google.android.gms.auth.api.phone;

import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0223HasApiKey;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.auth.api.phone.SmsCodeBrowserClient */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public interface C0107SmsCodeBrowserClient extends C0223HasApiKey<C0211Api.ApiOptions.NoOptions> {
    Task<Void> startSmsCodeRetriever();
}
