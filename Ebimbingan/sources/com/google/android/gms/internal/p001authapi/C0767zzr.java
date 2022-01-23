package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.C0031Auth;
import com.google.android.gms.auth.api.credentials.C0071HintRequest;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0464SafeParcelableSerializer;
import gnu.expr.Declaration;

/* renamed from: com.google.android.gms.internal.auth-api.zzr  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0767zzr {
    public static PendingIntent zzc(Context context, @Nullable C0031Auth.AuthCredentialsOptions authCredentialsOptions, C0071HintRequest hintRequest, @Nullable String str) {
        String zzd;
        String str2;
        Intent intent;
        Context context2 = context;
        C0071HintRequest hintRequest2 = hintRequest;
        String str3 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(context2, "context must not be null");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(hintRequest2, "request must not be null");
        C0031Auth.AuthCredentialsOptions authCredentialsOptions2 = authCredentialsOptions;
        C0031Auth.AuthCredentialsOptions authCredentialsOptions3 = authCredentialsOptions2;
        if (authCredentialsOptions2 == null) {
            zzd = null;
        } else {
            zzd = authCredentialsOptions3.zzd();
        }
        C0071HintRequest hintRequest3 = hintRequest2;
        if (TextUtils.isEmpty(str3)) {
            str2 = C0751zzba.zzw();
        } else {
            str2 = (String) C0446Preconditions.checkNotNull(str3);
        }
        C0071HintRequest hintRequest4 = hintRequest3;
        new Intent("com.google.android.gms.auth.api.credentials.PICKER");
        Intent putExtra = intent.putExtra("claimedCallingPackage", zzd);
        Intent intent2 = putExtra;
        Intent putExtra2 = putExtra.putExtra("logSessionId", str2);
        C0464SafeParcelableSerializer.serializeToIntentExtra(hintRequest4, intent2, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context2, 2000, intent2, Declaration.PACKAGE_ACCESS);
    }
}
