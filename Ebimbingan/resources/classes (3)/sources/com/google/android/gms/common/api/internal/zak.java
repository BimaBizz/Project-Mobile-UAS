package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zak extends zap {
    private final SparseArray<zaj> zad;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zak(com.google.android.gms.common.api.internal.LifecycleFragment r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r0
            r3 = r1
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r2.<init>(r3, r4)
            android.util.SparseArray r2 = new android.util.SparseArray
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            r2.zad = r3
            r2 = r0
            com.google.android.gms.common.api.internal.LifecycleFragment r2 = r2.mLifecycleFragment
            java.lang.String r3 = "AutoManageHelper"
            r4 = r0
            r2.addCallback(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zak.<init>(com.google.android.gms.common.api.internal.LifecycleFragment):void");
    }

    public static zak zaa(LifecycleActivity lifecycleActivity) {
        zak zak;
        LifecycleFragment fragment = getFragment(lifecycleActivity);
        zak zak2 = (zak) fragment.getCallbackOrNull("AutoManageHelper", zak.class);
        if (zak2 != null) {
            return zak2;
        }
        new zak(fragment);
        return zak;
    }

    @Nullable
    private final zaj zai(int i) {
        int i2 = i;
        if (this.zad.size() <= i2) {
            return null;
        }
        SparseArray<zaj> sparseArray = this.zad;
        return sparseArray.get(sparseArray.keyAt(i2));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str;
        FileDescriptor fileDescriptor2 = fileDescriptor;
        PrintWriter printWriter2 = printWriter;
        String[] strArr2 = strArr;
        for (int i = 0; i < this.zad.size(); i++) {
            zaj zai = zai(i);
            if (zai != null) {
                printWriter2.append(str2).append("GoogleApiClient #").print(zai.zaa);
                printWriter2.println(":");
                zai.zab.dump(String.valueOf(str2).concat("  "), fileDescriptor2, printWriter2, strArr2);
            }
        }
    }

    public final void onStart() {
        StringBuilder sb;
        super.onStart();
        boolean z = this.zaa;
        String valueOf = String.valueOf(this.zad);
        new StringBuilder(String.valueOf(valueOf).length() + 14);
        StringBuilder append = sb.append("onStart ");
        StringBuilder append2 = sb.append(z);
        StringBuilder append3 = sb.append(" ");
        StringBuilder append4 = sb.append(valueOf);
        int d = Log.d("AutoManageHelper", sb.toString());
        if (this.zab.get() == null) {
            for (int i = 0; i < this.zad.size(); i++) {
                zaj zai = zai(i);
                if (zai != null) {
                    zai.zab.connect();
                }
            }
        }
    }

    public final void onStop() {
        super.onStop();
        for (int i = 0; i < this.zad.size(); i++) {
            zaj zai = zai(i);
            if (zai != null) {
                zai.zab.disconnect();
            }
        }
    }

    public final void zab(int i, GoogleApiClient googleApiClient, @Nullable GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean z;
        StringBuilder sb;
        StringBuilder sb2;
        GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener2;
        StringBuilder sb3;
        int i2 = i;
        GoogleApiClient googleApiClient2 = googleApiClient;
        GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener3 = onConnectionFailedListener;
        Object checkNotNull = Preconditions.checkNotNull(googleApiClient2, "GoogleApiClient instance cannot be null");
        if (this.zad.indexOfKey(i2) < 0) {
            z = true;
        } else {
            z = false;
        }
        new StringBuilder(54);
        StringBuilder append = sb.append("Already managing a GoogleApiClient with id ");
        StringBuilder append2 = sb.append(i2);
        Preconditions.checkState(z, sb.toString());
        zam zam = (zam) this.zab.get();
        boolean z2 = this.zaa;
        String valueOf = String.valueOf(zam);
        new StringBuilder(String.valueOf(valueOf).length() + 49);
        StringBuilder append3 = sb2.append("starting AutoManage for client ");
        StringBuilder append4 = sb2.append(i2);
        StringBuilder append5 = sb2.append(" ");
        StringBuilder append6 = sb2.append(z2);
        StringBuilder append7 = sb2.append(" ");
        StringBuilder append8 = sb2.append(valueOf);
        int d = Log.d("AutoManageHelper", sb2.toString());
        new zaj(this, i2, googleApiClient2, onConnectionFailedListener3);
        googleApiClient2.registerConnectionFailedListener(onConnectionFailedListener2);
        this.zad.put(i2, onConnectionFailedListener2);
        if (this.zaa && zam == null) {
            String valueOf2 = String.valueOf(googleApiClient2);
            new StringBuilder(String.valueOf(valueOf2).length() + 11);
            StringBuilder append9 = sb3.append("connecting ");
            StringBuilder append10 = sb3.append(valueOf2);
            int d2 = Log.d("AutoManageHelper", sb3.toString());
            googleApiClient2.connect();
        }
    }

    public final void zac(int i) {
        int i2 = i;
        zaj zaj = this.zad.get(i2);
        this.zad.remove(i2);
        if (zaj != null) {
            zaj.zab.unregisterConnectionFailedListener(zaj);
            zaj.zab.disconnect();
        }
    }

    /* access modifiers changed from: protected */
    public final void zad(ConnectionResult connectionResult, int i) {
        Throwable th;
        ConnectionResult connectionResult2 = connectionResult;
        int i2 = i;
        int w = Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i2 < 0) {
            new Exception();
            int wtf = Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", th);
            return;
        }
        zaj zaj = this.zad.get(i2);
        if (zaj != null) {
            zac(i2);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zaj.zac;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zae() {
        for (int i = 0; i < this.zad.size(); i++) {
            zaj zai = zai(i);
            if (zai != null) {
                zai.zab.connect();
            }
        }
    }
}
