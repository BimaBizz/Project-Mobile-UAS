package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {
    private final Activity zza;
    private final int zzb;

    protected ResolvingResultCallbacks(@RecentlyNonNull Activity activity, int i) {
        Activity activity2 = activity;
        Object checkNotNull = Preconditions.checkNotNull(activity2, "Activity must not be null");
        this.zza = activity2;
        this.zzb = i;
    }

    @KeepForSdk
    public final void onFailure(@RecentlyNonNull Status status) {
        Status status2;
        Status status3 = status;
        if (status3.hasResolution()) {
            try {
                status3.startResolutionForResult(this.zza, this.zzb);
            } catch (IntentSender.SendIntentException e) {
                int e2 = Log.e("ResolvingResultCallback", "Failed to start resolution", e);
                new Status(8);
                onUnresolvableFailure(status2);
            }
        } else {
            onUnresolvableFailure(status3);
        }
    }

    public abstract void onSuccess(@RecentlyNonNull R r);

    public abstract void onUnresolvableFailure(@RecentlyNonNull Status status);
}
