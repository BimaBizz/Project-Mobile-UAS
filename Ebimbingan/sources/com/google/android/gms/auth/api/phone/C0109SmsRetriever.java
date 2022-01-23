package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.p000authapiphone.C0695zzaa;

/* renamed from: com.google.android.gms.auth.api.phone.SmsRetriever */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public final class C0109SmsRetriever {
    public static final String EXTRA_CONSENT_INTENT = "com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT";
    public static final String EXTRA_SIM_SUBSCRIPTION_ID = "com.google.android.gms.auth.api.phone.EXTRA_SIM_SUBSCRIPTION_ID";
    public static final String EXTRA_SMS_MESSAGE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE";
    public static final String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    public static final String SEND_PERMISSION = "com.google.android.gms.auth.api.phone.permission.SEND";
    public static final String SMS_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";

    public static C0111SmsRetrieverClient getClient(@NonNull Context context) {
        C0111SmsRetrieverClient smsRetrieverClient;
        new C0695zzaa(context);
        return smsRetrieverClient;
    }

    public static C0111SmsRetrieverClient getClient(@NonNull Activity activity) {
        C0111SmsRetrieverClient smsRetrieverClient;
        new C0695zzaa(activity);
        return smsRetrieverClient;
    }

    private C0109SmsRetriever() {
    }
}
