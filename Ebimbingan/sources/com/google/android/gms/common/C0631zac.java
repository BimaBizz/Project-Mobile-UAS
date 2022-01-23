package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.C1106zap;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.common.zac */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0631zac extends C1106zap {
    final /* synthetic */ C0189GoogleApiAvailability zaa;
    private final Context zab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0631zac(C0189GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        Context context2 = context;
        this.zaa = googleApiAvailability;
        this.zab = context2.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        StringBuilder sb;
        Message message2 = message;
        switch (message2.what) {
            case 1:
                int isGooglePlayServicesAvailable = this.zaa.isGooglePlayServicesAvailable(this.zab);
                if (this.zaa.isUserResolvableError(isGooglePlayServicesAvailable)) {
                    this.zaa.showErrorNotification(this.zab, isGooglePlayServicesAvailable);
                    return;
                }
                return;
            default:
                int i = message2.what;
                new StringBuilder(50);
                StringBuilder append = sb.append("Don't know how to handle this message: ");
                StringBuilder append2 = sb.append(i);
                int w = Log.w("GoogleApiAvailability", sb.toString());
                return;
        }
    }
}
