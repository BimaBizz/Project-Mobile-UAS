package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zao implements Runnable {
    final /* synthetic */ zap zaa;
    private final zam zab;

    zao(zap zap, zam zam) {
        this.zaa = zap;
        this.zab = zam;
    }

    @MainThread
    public final void run() {
        zabq zabq;
        if (this.zaa.zaa) {
            ConnectionResult zab2 = this.zab.zab();
            if (zab2.hasResolution()) {
                this.zaa.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(this.zaa.getActivity(), (PendingIntent) Preconditions.checkNotNull(zab2.getResolution()), this.zab.zaa(), false), 1);
                return;
            }
            zap zap = this.zaa;
            if (zap.zac.getErrorResolutionIntent(zap.getActivity(), zab2.getErrorCode(), (String) null) != null) {
                zap zap2 = this.zaa;
                boolean zaa2 = zap2.zac.zaa(zap2.getActivity(), this.zaa.mLifecycleFragment, zab2.getErrorCode(), 2, this.zaa);
            } else if (zab2.getErrorCode() == 18) {
                zap zap3 = this.zaa;
                Dialog zad = zap3.zac.zad(zap3.getActivity(), this.zaa);
                zap zap4 = this.zaa;
                GoogleApiAvailability googleApiAvailability = zap4.zac;
                Context applicationContext = zap4.getActivity().getApplicationContext();
                new zan(this, zad);
                zabr zae = googleApiAvailability.zae(applicationContext, zabq);
            } else {
                this.zaa.zab(zab2, this.zab.zaa());
            }
        }
    }
}
