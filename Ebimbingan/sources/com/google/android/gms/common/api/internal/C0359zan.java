package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.zan */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0359zan extends C0314zabq {
    final /* synthetic */ Dialog zaa;
    final /* synthetic */ C0360zao zab;

    C0359zan(C0360zao zao, Dialog dialog) {
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
