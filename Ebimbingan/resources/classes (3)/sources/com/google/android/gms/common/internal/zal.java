package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zal {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zal() {
        this(GoogleApiAvailability.getInstance());
    }

    public final int zaa(@NonNull Context context, @NonNull Api.Client client) {
        int i;
        int i2;
        int i3;
        Context context2 = context;
        Api.Client client2 = client;
        Object checkNotNull = Preconditions.checkNotNull(context2);
        Object checkNotNull2 = Preconditions.checkNotNull(client2);
        if (!client2.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client2.getMinApkVersion();
        int zab2 = zab(context2, minApkVersion);
        if (zab2 != -1) {
            i3 = zab2;
        } else {
            int i4 = 0;
            while (true) {
                if (i4 >= this.zaa.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.zaa.keyAt(i4);
                if (keyAt > minApkVersion && this.zaa.get(keyAt) == 0) {
                    i = 0;
                    break;
                }
                i4++;
            }
            if (i == -1) {
                i2 = this.zab.isGooglePlayServicesAvailable(context2, minApkVersion);
            } else {
                i2 = i;
            }
            this.zaa.put(minApkVersion, i2);
            i3 = i2;
        }
        return i3;
    }

    public final int zab(Context context, int i) {
        Context context2 = context;
        return this.zaa.get(i, -1);
    }

    public final void zac() {
        this.zaa.clear();
    }

    public zal(@NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        SparseIntArray sparseIntArray;
        GoogleApiAvailabilityLight googleApiAvailabilityLight2 = googleApiAvailabilityLight;
        new SparseIntArray();
        this.zaa = sparseIntArray;
        Object checkNotNull = Preconditions.checkNotNull(googleApiAvailabilityLight2);
        this.zab = googleApiAvailabilityLight2;
    }
}
