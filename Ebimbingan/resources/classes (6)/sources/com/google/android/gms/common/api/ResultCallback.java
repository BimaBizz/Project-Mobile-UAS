package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface ResultCallback<R extends Result> {
    void onResult(@RecentlyNonNull R r);
}
