package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.location.LocationSettingsResult;

final class zzbc extends zzar {
    private C0243BaseImplementation.ResultHolder<LocationSettingsResult> zzdf;

    public zzbc(C0243BaseImplementation.ResultHolder<LocationSettingsResult> resultHolder) {
        C0243BaseImplementation.ResultHolder<LocationSettingsResult> resultHolder2 = resultHolder;
        C0446Preconditions.checkArgument(resultHolder2 != null, "listener can't be null.");
        this.zzdf = resultHolder2;
    }

    public final void zza(LocationSettingsResult locationSettingsResult) throws RemoteException {
        this.zzdf.setResult(locationSettingsResult);
        this.zzdf = null;
    }
}
