package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C0242BackgroundDetector;

/* renamed from: com.google.android.gms.common.api.internal.zabg */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0304zabg implements C0242BackgroundDetector.BackgroundStateChangeListener {
    final /* synthetic */ C0248GoogleApiManager zaa;

    C0304zabg(C0248GoogleApiManager googleApiManager) {
        this.zaa = googleApiManager;
    }

    public final void onBackgroundStateChanged(boolean z) {
        boolean sendMessage = this.zaa.zat.sendMessage(this.zaa.zat.obtainMessage(1, Boolean.valueOf(z)));
    }
}
