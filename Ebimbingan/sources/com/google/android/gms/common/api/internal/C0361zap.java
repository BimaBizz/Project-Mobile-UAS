package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.C0189GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.zap */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0361zap extends C0252LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean zaa;
    protected final AtomicReference<C0358zam> zab;
    protected final C0189GoogleApiAvailability zac;
    private final Handler zad;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.util.C0617VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0361zap(com.google.android.gms.common.api.internal.C0253LifecycleFragment r6, com.google.android.gms.common.C0189GoogleApiAvailability r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0361zap.<init>(com.google.android.gms.common.api.internal.LifecycleFragment, com.google.android.gms.common.GoogleApiAvailability):void");
    }

    /* access modifiers changed from: private */
    public final void zaa() {
        this.zab.set((Object) null);
        zae();
    }

    /* access modifiers changed from: private */
    public final void zab(C0184ConnectionResult connectionResult, int i) {
        this.zab.set((Object) null);
        zad(connectionResult, i);
    }

    private static final int zac(@Nullable C0358zam zam) {
        C0358zam zam2 = zam;
        if (zam2 == null) {
            return -1;
        }
        return zam2.zaa();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        C0184ConnectionResult connectionResult;
        int i4 = i2;
        Intent intent2 = intent;
        C0358zam zam = this.zab.get();
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
                        new C0184ConnectionResult(i3, (PendingIntent) null, zam.zab().toString());
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
        C0184ConnectionResult connectionResult;
        DialogInterface dialogInterface2 = dialogInterface;
        new C0184ConnectionResult(13, (PendingIntent) null);
        zab(connectionResult, zac(this.zab.get()));
    }

    public final void onCreate(@Nullable Bundle bundle) {
        Object obj;
        C0184ConnectionResult connectionResult;
        Object obj2;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        if (bundle2 != null) {
            AtomicReference<C0358zam> atomicReference = this.zab;
            if (bundle2.getBoolean("resolving_error", false)) {
                new C0184ConnectionResult(bundle2.getInt("failed_status"), (PendingIntent) bundle2.getParcelable("failed_resolution"));
                new C0358zam(connectionResult, bundle2.getInt("failed_client_id", -1));
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
        C0358zam zam = this.zab.get();
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
    public abstract void zad(C0184ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    public abstract void zae();

    public final void zaf(C0184ConnectionResult connectionResult, int i) {
        C0358zam zam;
        Runnable runnable;
        new C0358zam(connectionResult, i);
        if (this.zab.compareAndSet((Object) null, zam)) {
            Handler handler = this.zad;
            new C0360zao(this, zam);
            boolean post = handler.post(runnable);
        }
    }
}
