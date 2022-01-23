package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.phone.C0111SmsRetrieverClient;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzaa  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public final class C0695zzaa extends C0111SmsRetrieverClient {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0695zzaa(Context context) {
        super(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0695zzaa(Activity activity) {
        super(activity);
    }

    public final Task<Void> startSmsRetriever() {
        C0262RemoteCall remoteCall;
        new C0724zzz(this);
        return doWrite(C0267TaskApiCall.builder().run(remoteCall).setFeatures(C0698zzad.zzc).build());
    }

    public final Task<Void> startSmsUserConsent(@Nullable String str) {
        C0262RemoteCall remoteCall;
        new C0697zzac(this, str);
        return doWrite(C0267TaskApiCall.builder().run(remoteCall).setFeatures(C0698zzad.zzd).build());
    }
}
