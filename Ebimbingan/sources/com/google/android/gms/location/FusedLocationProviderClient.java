package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.common.api.internal.C0255ListenerHolders;
import com.google.android.gms.common.api.internal.C0260RegisterListenerMethod;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.api.internal.C0268TaskUtil;
import com.google.android.gms.common.api.internal.C0269UnregisterListenerMethod;
import com.google.android.gms.common.internal.C0445PendingResultUtil;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.internal.location.zzaj;
import com.google.android.gms.internal.location.zzak;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.internal.location.zzbm;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public class FusedLocationProviderClient extends C0220GoogleApi<C0211Api.ApiOptions.NoOptions> {
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    private static class zza extends zzak {
        private final TaskCompletionSource<Void> zzac;

        public zza(TaskCompletionSource<Void> taskCompletionSource) {
            this.zzac = taskCompletionSource;
        }

        public final void zza(zzad zzad) {
            C0268TaskUtil.setResultOrApiException(zzad.getStatus(), this.zzac);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FusedLocationProviderClient(@androidx.annotation.NonNull android.app.Activity r10) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r0
            r3 = r1
            com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api$ApiOptions$NoOptions> r4 = com.google.android.gms.location.LocationServices.API
            r5 = 0
            com.google.android.gms.common.api.internal.ApiExceptionMapper r6 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r8 = r6
            r6 = r8
            r7 = r8
            r7.<init>()
            r2.<init>((android.app.Activity) r3, r4, r5, (com.google.android.gms.common.api.internal.C0265StatusExceptionMapper) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.FusedLocationProviderClient.<init>(android.app.Activity):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FusedLocationProviderClient(@androidx.annotation.NonNull android.content.Context r10) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r0
            r3 = r1
            com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api$ApiOptions$NoOptions> r4 = com.google.android.gms.location.LocationServices.API
            r5 = 0
            com.google.android.gms.common.api.internal.ApiExceptionMapper r6 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r8 = r6
            r6 = r8
            r7 = r8
            r7.<init>()
            r2.<init>((android.content.Context) r3, r4, r5, (com.google.android.gms.common.api.internal.C0265StatusExceptionMapper) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.FusedLocationProviderClient.<init>(android.content.Context):void");
    }

    /* access modifiers changed from: private */
    public final zzaj zza(TaskCompletionSource<Boolean> taskCompletionSource) {
        zzaj zzaj;
        new zzp(this, taskCompletionSource);
        return zzaj;
    }

    public Task<Void> flushLocations() {
        return C0445PendingResultUtil.toVoidTask(LocationServices.FusedLocationApi.flushLocations(asGoogleApiClient()));
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Location> getLastLocation() {
        C0267TaskApiCall taskApiCall;
        new zzl(this);
        return doRead(taskApiCall);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<LocationAvailability> getLocationAvailability() {
        C0267TaskApiCall taskApiCall;
        new zzm(this);
        return doRead(taskApiCall);
    }

    public Task<Void> removeLocationUpdates(PendingIntent pendingIntent) {
        return C0445PendingResultUtil.toVoidTask(LocationServices.FusedLocationApi.removeLocationUpdates(asGoogleApiClient(), pendingIntent));
    }

    public Task<Void> removeLocationUpdates(LocationCallback locationCallback) {
        return C0268TaskUtil.toVoidTaskThatFailsOnFalse(doUnregisterEventListener(C0255ListenerHolders.createListenerKey(locationCallback, LocationCallback.class.getSimpleName())));
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return C0445PendingResultUtil.toVoidTask(LocationServices.FusedLocationApi.requestLocationUpdates(asGoogleApiClient(), locationRequest, pendingIntent));
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, @Nullable Looper looper) {
        C0260RegisterListenerMethod registerListenerMethod;
        C0269UnregisterListenerMethod unregisterListenerMethod;
        C0254ListenerHolder createListenerHolder = C0255ListenerHolders.createListenerHolder(locationCallback, zzbm.zza(looper), LocationCallback.class.getSimpleName());
        new zzn(this, createListenerHolder, zzbd.zza(locationRequest), createListenerHolder);
        C0260RegisterListenerMethod registerListenerMethod2 = registerListenerMethod;
        new zzo(this, createListenerHolder.getListenerKey());
        return doRegisterEventListener(registerListenerMethod2, unregisterListenerMethod);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> setMockLocation(Location location) {
        return C0445PendingResultUtil.toVoidTask(LocationServices.FusedLocationApi.setMockLocation(asGoogleApiClient(), location));
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> setMockMode(boolean z) {
        return C0445PendingResultUtil.toVoidTask(LocationServices.FusedLocationApi.setMockMode(asGoogleApiClient(), z));
    }
}
