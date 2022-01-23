package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* renamed from: com.google.android.gms.internal.auth-api.zzr  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzr {
    public static PendingIntent zzc(Context context, @Nullable Auth.AuthCredentialsOptions authCredentialsOptions, HintRequest hintRequest, @Nullable String str) {
        String zzd;
        String str2;
        Intent intent;
        Context context2 = context;
        HintRequest hintRequest2 = hintRequest;
        String str3 = str;
        Object checkNotNull = Preconditions.checkNotNull(context2, "context must not be null");
        Object checkNotNull2 = Preconditions.checkNotNull(hintRequest2, "request must not be null");
        Auth.AuthCredentialsOptions authCredentialsOptions2 = authCredentialsOptions;
        Auth.AuthCredentialsOptions authCredentialsOptions3 = authCredentialsOptions2;
        if (authCredentialsOptions2 == null) {
            zzd = null;
        } else {
            zzd = authCredentialsOptions3.zzd();
        }
        HintRequest hintRequest3 = hintRequest2;
        if (TextUtils.isEmpty(str3)) {
            str2 = zzba.zzw();
        } else {
            str2 = (String) Preconditions.checkNotNull(str3);
        }
        HintRequest hintRequest4 = hintRequest3;
        new Intent("com.google.android.gms.auth.api.credentials.PICKER");
        Intent putExtra = intent.putExtra("claimedCallingPackage", zzd);
        Intent intent2 = putExtra;
        Intent putExtra2 = putExtra.putExtra("logSessionId", str2);
        SafeParcelableSerializer.serializeToIntentExtra(hintRequest4, intent2, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context2, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, intent2, 134217728);
    }
}
