package com.google.android.gms.auth.api.phone;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0223HasApiKey;
import com.google.android.gms.tasks.Task;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: com.google.android.gms.auth.api.phone.SmsCodeAutofillClient */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public interface C0106SmsCodeAutofillClient extends C0223HasApiKey<C0211Api.ApiOptions.NoOptions> {

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.auth.api.phone.SmsCodeAutofillClient$PermissionState */
    /* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
    public @interface PermissionState {
        public static final int DENIED = 2;
        public static final int GRANTED = 1;
        public static final int NONE = 0;
    }

    Task<Integer> checkPermissionState();

    Task<Boolean> hasOngoingSmsRequest(@NonNull String str);

    Task<Void> startSmsCodeRetriever();
}
