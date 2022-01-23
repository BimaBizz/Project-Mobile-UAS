package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.p000authapiphone.C0710zzl;
import com.google.android.gms.internal.p000authapiphone.C0718zzt;

/* renamed from: com.google.android.gms.auth.api.phone.SmsCodeRetriever */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public final class C0108SmsCodeRetriever {
    public static final String EXTRA_SMS_CODE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE";
    public static final String EXTRA_SMS_CODE_LINE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE_LINE";
    public static final String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    public static final String SMS_CODE_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED";

    public static C0106SmsCodeAutofillClient getAutofillClient(@NonNull Context context) {
        C0106SmsCodeAutofillClient smsCodeAutofillClient;
        new C0710zzl(context);
        return smsCodeAutofillClient;
    }

    public static C0106SmsCodeAutofillClient getAutofillClient(@NonNull Activity activity) {
        C0106SmsCodeAutofillClient smsCodeAutofillClient;
        new C0710zzl(activity);
        return smsCodeAutofillClient;
    }

    public static C0107SmsCodeBrowserClient getBrowserClient(@NonNull Context context) {
        C0107SmsCodeBrowserClient smsCodeBrowserClient;
        new C0718zzt(context);
        return smsCodeBrowserClient;
    }

    public static C0107SmsCodeBrowserClient getBrowserClient(@NonNull Activity activity) {
        C0107SmsCodeBrowserClient smsCodeBrowserClient;
        new C0718zzt(activity);
        return smsCodeBrowserClient;
    }

    private C0108SmsCodeRetriever() {
    }
}
