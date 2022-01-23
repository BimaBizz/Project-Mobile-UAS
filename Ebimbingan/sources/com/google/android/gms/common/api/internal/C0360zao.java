package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.MainThread;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.C0189GoogleApiAvailability;
import com.google.android.gms.common.api.C0221GoogleApiActivity;
import com.google.android.gms.common.internal.C0446Preconditions;

/* renamed from: com.google.android.gms.common.api.internal.zao */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0360zao implements Runnable {
    final /* synthetic */ C0361zap zaa;
    private final C0358zam zab;

    C0360zao(C0361zap zap, C0358zam zam) {
        this.zaa = zap;
        this.zab = zam;
    }

    @MainThread
    public final void run() {
        C0314zabq zabq;
        if (this.zaa.zaa) {
            C0184ConnectionResult zab2 = this.zab.zab();
            if (zab2.hasResolution()) {
                this.zaa.mLifecycleFragment.startActivityForResult(C0221GoogleApiActivity.zaa(this.zaa.getActivity(), (PendingIntent) C0446Preconditions.checkNotNull(zab2.getResolution()), this.zab.zaa(), false), 1);
                return;
            }
            C0361zap zap = this.zaa;
            if (zap.zac.getErrorResolutionIntent(zap.getActivity(), zab2.getErrorCode(), (String) null) != null) {
                C0361zap zap2 = this.zaa;
                boolean zaa2 = zap2.zac.zaa(zap2.getActivity(), this.zaa.mLifecycleFragment, zab2.getErrorCode(), 2, this.zaa);
            } else if (zab2.getErrorCode() == 18) {
                C0361zap zap3 = this.zaa;
                Dialog zad = zap3.zac.zad(zap3.getActivity(), this.zaa);
                C0361zap zap4 = this.zaa;
                C0189GoogleApiAvailability googleApiAvailability = zap4.zac;
                Context applicationContext = zap4.getActivity().getApplicationContext();
                new C0359zan(this, zad);
                C0315zabr zae = googleApiAvailability.zae(applicationContext, zabq);
            } else {
                this.zaa.zab(zab2, this.zab.zaa());
            }
        }
    }
}
