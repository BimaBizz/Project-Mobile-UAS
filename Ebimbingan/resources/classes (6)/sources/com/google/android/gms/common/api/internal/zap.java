package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean zaa;
    protected final AtomicReference<zam> zab;
    protected final GoogleApiAvailability zac;
    private final Handler zad;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zap(com.google.android.gms.common.api.internal.LifecycleFragment r6, com.google.android.gms.common.GoogleApiAvailability r7) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r0
            r4 = r1
            r3.<init>(r4)
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r1 = r3
            r3 = r1
            r4 = 0
            r3.<init>(r4)
            r3 = r0
            r4 = r1
            r3.zab = r4
            com.google.android.gms.internal.base.zap r3 = new com.google.android.gms.internal.base.zap
            r1 = r3
            r3 = r1
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r4)
            r3 = r0
            r4 = r1
            r3.zad = r4
            r3 = r0
            r4 = r2
            r3.zac = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zap.<init>(com.google.android.gms.common.api.internal.LifecycleFragment, com.google.android.gms.common.GoogleApiAvailability):void");
    }

    /* access modifiers changed from: private */
    public final void zaa() {
        this.zab.set((Object) null);
        zae();
    }

    /* access modifiers changed from: private */
    public final void zab(ConnectionResult connectionResult, int i) {
        this.zab.set((Object) null);
        zad(connectionResult, i);
    }

    private static final int zac(@Nullable zam zam) {
        zam zam2 = zam;
        if (zam2 == null) {
            return -1;
        }
        return zam2.zaa();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        ConnectionResult connectionResult;
        int i4 = i2;
        Intent intent2 = intent;
        zam zam = this.zab.get();
        switch (i) {
            case 1:
                if (i4 == -1) {
                    zaa();
                    return;
                } else if (i4 == 0) {
                    if (zam != null) {
                        if (intent2 != null) {
                            i3 = intent2.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                        } else {
                            i3 = 13;
                        }
                        new ConnectionResult(i3, (PendingIntent) null, zam.zab().toString());
                        zab(connectionResult, zac(zam));
                        return;
                    }
                    return;
                }
                break;
            case 2:
                int isGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(getActivity());
                if (isGooglePlayServicesAvailable == 0) {
                    zaa();
                    return;
                } else if (zam != null) {
                    if (zam.zab().getErrorCode() == 18 && isGooglePlayServicesAvailable == 18) {
                        return;
                    }
                } else {
                    return;
                }
        }
        if (zam != null) {
            zab(zam.zab(), zam.zaa());
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult;
        DialogInterface dialogInterface2 = dialogInterface;
        new ConnectionResult(13, (PendingIntent) null);
        zab(connectionResult, zac(this.zab.get()));
    }

    public final void onCreate(@Nullable Bundle bundle) {
        Object obj;
        ConnectionResult connectionResult;
        Object obj2;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        if (bundle2 != null) {
            AtomicReference<zam> atomicReference = this.zab;
            if (bundle2.getBoolean("resolving_error", false)) {
                new ConnectionResult(bundle2.getInt("failed_status"), (PendingIntent) bundle2.getParcelable("failed_resolution"));
                new zam(connectionResult, bundle2.getInt("failed_client_id", -1));
                obj = obj2;
            } else {
                obj = null;
            }
            atomicReference.set(obj);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onSaveInstanceState(bundle2);
        zam zam = this.zab.get();
        if (zam != null) {
            bundle2.putBoolean("resolving_error", true);
            bundle2.putInt("failed_client_id", zam.zaa());
            bundle2.putInt("failed_status", zam.zab().getErrorCode());
            bundle2.putParcelable("failed_resolution", zam.zab().getResolution());
        }
    }

    public void onStart() {
        super.onStart();
        this.zaa = true;
    }

    public void onStop() {
        super.onStop();
        this.zaa = false;
    }

    /* access modifiers changed from: protected */
    public abstract void zad(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    public abstract void zae();

    public final void zaf(ConnectionResult connectionResult, int i) {
        zam zam;
        Runnable runnable;
        new zam(connectionResult, i);
        if (this.zab.compareAndSet((Object) null, zam)) {
            Handler handler = this.zad;
            new zao(this, zam);
            boolean post = handler.post(runnable);
        }
    }
}
