package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.internal.C0446Preconditions;

/* renamed from: com.google.android.gms.common.api.ResolvingResultCallbacks */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C0229ResolvingResultCallbacks<R extends C0231Result> extends C0233ResultCallbacks<R> {
    private final Activity zza;
    private final int zzb;

    protected C0229ResolvingResultCallbacks(@RecentlyNonNull Activity activity, int i) {
        Activity activity2 = activity;
        Object checkNotNull = C0446Preconditions.checkNotNull(activity2, "Activity must not be null");
        this.zza = activity2;
        this.zzb = i;
    }

    @C0206KeepForSdk
    public final void onFailure(@RecentlyNonNull C0236Status status) {
        C0236Status status2;
        C0236Status status3 = status;
        if (status3.hasResolution()) {
            try {
                status3.startResolutionForResult(this.zza, this.zzb);
            } catch (IntentSender.SendIntentException e) {
                int e2 = Log.e("ResolvingResultCallback", "Failed to start resolution", e);
                new C0236Status(8);
                onUnresolvableFailure(status2);
            }
        } else {
            onUnresolvableFailure(status3);
        }
    }

    public abstract void onSuccess(@RecentlyNonNull R r);

    public abstract void onUnresolvableFailure(@RecentlyNonNull C0236Status status);
}
