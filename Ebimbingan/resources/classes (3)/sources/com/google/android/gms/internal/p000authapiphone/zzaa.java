package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzaa  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public final class zzaa extends SmsRetrieverClient {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaa(Context context) {
        super(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaa(Activity activity) {
        super(activity);
    }

    public final Task<Void> startSmsRetriever() {
        RemoteCall remoteCall;
        new zzz(this);
        return doWrite(TaskApiCall.builder().run(remoteCall).setFeatures(zzad.zzc).build());
    }

    public final Task<Void> startSmsUserConsent(@Nullable String str) {
        RemoteCall remoteCall;
        new zzac(this, str);
        return doWrite(TaskApiCall.builder().run(remoteCall).setFeatures(zzad.zzd).build());
    }
}
