package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C0231Result;

/* renamed from: com.google.android.gms.common.api.OptionalPendingResult */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0224OptionalPendingResult<R extends C0231Result> extends C0225PendingResult<R> {
    public C0224OptionalPendingResult() {
    }

    @RecentlyNonNull
    public abstract R get();

    public abstract boolean isDone();
}
