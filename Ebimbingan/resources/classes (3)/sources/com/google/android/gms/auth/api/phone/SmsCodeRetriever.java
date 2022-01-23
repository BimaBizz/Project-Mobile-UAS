package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.p000authapiphone.zzl;
import com.google.android.gms.internal.p000authapiphone.zzt;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public final class SmsCodeRetriever {
    public static final String EXTRA_SMS_CODE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE";
    public static final String EXTRA_SMS_CODE_LINE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE_LINE";
    public static final String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    public static final String SMS_CODE_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED";

    public static SmsCodeAutofillClient getAutofillClient(@NonNull Context context) {
        SmsCodeAutofillClient smsCodeAutofillClient;
        new zzl(context);
        return smsCodeAutofillClient;
    }

    public static SmsCodeAutofillClient getAutofillClient(@NonNull Activity activity) {
        SmsCodeAutofillClient smsCodeAutofillClient;
        new zzl(activity);
        return smsCodeAutofillClient;
    }

    public static SmsCodeBrowserClient getBrowserClient(@NonNull Context context) {
        SmsCodeBrowserClient smsCodeBrowserClient;
        new zzt(context);
        return smsCodeBrowserClient;
    }

    public static SmsCodeBrowserClient getBrowserClient(@NonNull Activity activity) {
        SmsCodeBrowserClient smsCodeBrowserClient;
        new zzt(activity);
        return smsCodeBrowserClient;
    }

    private SmsCodeRetriever() {
    }
}
