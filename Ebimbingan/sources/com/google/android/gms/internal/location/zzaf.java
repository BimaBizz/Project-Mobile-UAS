package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.zzal;
import java.util.List;

public final class zzaf implements GeofencingApi {
    public zzaf() {
    }

    private final C0225PendingResult<C0236Status> zza(C0222GoogleApiClient googleApiClient, zzal zzal) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzah(this, googleApiClient2, zzal);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0236Status> addGeofences(C0222GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new zzag(this, googleApiClient2, geofencingRequest, pendingIntent);
        return googleApiClient2.execute(apiMethodImpl);
    }

    @Deprecated
    public final C0225PendingResult<C0236Status> addGeofences(C0222GoogleApiClient googleApiClient, List<Geofence> list, PendingIntent pendingIntent) {
        GeofencingRequest.Builder builder;
        new GeofencingRequest.Builder();
        GeofencingRequest.Builder builder2 = builder;
        GeofencingRequest.Builder builder3 = builder2;
        GeofencingRequest.Builder addGeofences = builder2.addGeofences(list);
        GeofencingRequest.Builder initialTrigger = builder3.setInitialTrigger(5);
        return addGeofences(googleApiClient, builder3.build(), pendingIntent);
    }

    public final C0225PendingResult<C0236Status> removeGeofences(C0222GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return zza(googleApiClient, zzal.zza(pendingIntent));
    }

    public final C0225PendingResult<C0236Status> removeGeofences(C0222GoogleApiClient googleApiClient, List<String> list) {
        return zza(googleApiClient, zzal.zza(list));
    }
}
