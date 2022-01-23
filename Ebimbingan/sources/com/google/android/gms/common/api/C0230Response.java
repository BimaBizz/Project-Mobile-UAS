package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C0231Result;

/* renamed from: com.google.android.gms.common.api.Response */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0230Response<T extends C0231Result> {
    private T zza;

    public C0230Response() {
    }

    protected C0230Response(@RecentlyNonNull T t) {
        this.zza = t;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public T getResult() {
        return this.zza;
    }

    public void setResult(@RecentlyNonNull T t) {
        T t2 = t;
        this.zza = t2;
    }
}
