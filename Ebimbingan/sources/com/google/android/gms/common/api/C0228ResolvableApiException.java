package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.api.ResolvableApiException */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0228ResolvableApiException extends C0212ApiException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0228ResolvableApiException(@RecentlyNonNull C0236Status status) {
        super(status);
    }

    @RecentlyNonNull
    public PendingIntent getResolution() {
        return getStatus().getResolution();
    }

    public void startResolutionForResult(@RecentlyNonNull Activity activity, int i) throws IntentSender.SendIntentException {
        getStatus().startResolutionForResult(activity, i);
    }
}
