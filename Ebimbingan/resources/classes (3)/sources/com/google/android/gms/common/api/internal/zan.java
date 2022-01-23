package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zan extends zabq {
    final /* synthetic */ Dialog zaa;
    final /* synthetic */ zao zab;

    zan(zao zao, Dialog dialog) {
        this.zab = zao;
        this.zaa = dialog;
    }

    public final void zaa() {
        this.zab.zaa.zaa();
        if (this.zaa.isShowing()) {
            this.zaa.dismiss();
        }
    }
}
