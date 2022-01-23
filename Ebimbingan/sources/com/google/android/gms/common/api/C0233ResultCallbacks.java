package com.google.android.gms.common.api;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0231Result;

/* renamed from: com.google.android.gms.common.api.ResultCallbacks */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C0233ResultCallbacks<R extends C0231Result> implements C0232ResultCallback<R> {
    public C0233ResultCallbacks() {
    }

    public abstract void onFailure(@RecentlyNonNull C0236Status status);

    @C0206KeepForSdk
    public final void onResult(@RecentlyNonNull R r) {
        StringBuilder sb;
        R r2 = r;
        C0236Status status = r2.getStatus();
        if (status.isSuccess()) {
            onSuccess(r2);
            return;
        }
        onFailure(status);
        if (r2 instanceof C0227Releasable) {
            try {
                ((C0227Releasable) r2).release();
            } catch (RuntimeException e) {
                RuntimeException runtimeException = e;
                String valueOf = String.valueOf(r2);
                new StringBuilder(String.valueOf(valueOf).length() + 18);
                StringBuilder append = sb.append("Unable to release ");
                StringBuilder append2 = sb.append(valueOf);
                int w = Log.w("ResultCallbacks", sb.toString(), runtimeException);
            }
        }
    }

    public abstract void onSuccess(@RecentlyNonNull R r);
}
