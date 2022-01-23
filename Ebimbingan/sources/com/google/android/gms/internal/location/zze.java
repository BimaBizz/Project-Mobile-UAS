package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.location.ActivityRecognitionApi;
import com.google.android.gms.location.ActivityTransitionRequest;

public final class zze implements ActivityRecognitionApi {
    public zze() {
    }

    public final C0225PendingResult<C0236Status> removeActivityUpdates(C0222GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzg(this, googleApiClient2, pendingIntent);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0236Status> requestActivityUpdates(C0222GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzf(this, googleApiClient2, j, pendingIntent);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0236Status> zza(C0222GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzi(this, googleApiClient2, pendingIntent);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0236Status> zza(C0222GoogleApiClient googleApiClient, ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzh(this, googleApiClient2, activityTransitionRequest, pendingIntent);
        return googleApiClient2.execute(apiMethodImpl);
    }
}
