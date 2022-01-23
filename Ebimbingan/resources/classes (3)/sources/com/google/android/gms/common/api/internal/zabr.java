package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zabr extends BroadcastReceiver {
    @Nullable
    Context zaa;
    private final zabq zab;

    public zabr(zabq zabq) {
        this.zab = zabq;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Context context2 = context;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.zab.zaa();
            zab();
        }
    }

    public final void zaa(Context context) {
        Context context2 = context;
        this.zaa = context2;
    }

    public final synchronized void zab() {
        synchronized (this) {
            Context context = this.zaa;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.zaa = null;
        }
    }
}
