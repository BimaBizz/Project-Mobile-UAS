package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.C0253LifecycleFragment;

/* renamed from: com.google.android.gms.common.internal.zaf */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0490zaf extends C0491zag {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ C0253LifecycleFragment zab;

    C0490zaf(Intent intent, C0253LifecycleFragment lifecycleFragment, int i) {
        int i2 = i;
        this.zaa = intent;
        this.zab = lifecycleFragment;
    }

    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, 2);
        }
    }
}
