package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;

@Deprecated
public interface ActivityRecognitionApi {
    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    C0225PendingResult<C0236Status> removeActivityUpdates(C0222GoogleApiClient googleApiClient, PendingIntent pendingIntent);

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    C0225PendingResult<C0236Status> requestActivityUpdates(C0222GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent);

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    C0225PendingResult<C0236Status> zza(C0222GoogleApiClient googleApiClient, PendingIntent pendingIntent);

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    C0225PendingResult<C0236Status> zza(C0222GoogleApiClient googleApiClient, ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent);
}
