package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

final class zzbl extends LocationServices.zza<LocationSettingsResult> {
    private final /* synthetic */ LocationSettingsRequest zzdp;
    private final /* synthetic */ String zzdq = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbl(zzbk zzbk, C0222GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest, String str) {
        super(googleApiClient);
        zzbk zzbk2 = zzbk;
        String str2 = str;
        this.zzdp = locationSettingsRequest;
    }

    public final /* synthetic */ C0231Result createFailedResult(C0236Status status) {
        C0231Result result;
        new LocationSettingsResult(status);
        return result;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zza(this.zzdp, (C0243BaseImplementation.ResultHolder<LocationSettingsResult>) this, this.zzdq);
    }
}
