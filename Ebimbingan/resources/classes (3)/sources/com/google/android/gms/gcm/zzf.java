package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.gcm.zzj;

final class zzf extends zzj {
    private final /* synthetic */ GoogleCloudMessaging zzak;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzf(GoogleCloudMessaging googleCloudMessaging, Looper looper) {
        super(looper);
        this.zzak = googleCloudMessaging;
    }

    public final void handleMessage(Message message) {
        Message message2 = message;
        if (message2 == null || !(message2.obj instanceof Intent)) {
            int w = Log.w("GCM", "Dropping invalid message");
        }
        Intent intent = (Intent) message2.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
            boolean add = this.zzak.zzai.add(intent);
        } else if (!this.zzak.zzd(intent)) {
            Intent intent2 = intent.setPackage(this.zzak.zzl.getPackageName());
            this.zzak.zzl.sendBroadcast(intent);
        }
    }
}
