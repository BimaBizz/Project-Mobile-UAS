package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {
    @Nullable
    private final Feature[] zaa;
    private final boolean zab;
    private final int zac;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class Builder<A extends Api.AnyClient, ResultT> {
        /* access modifiers changed from: private */
        public RemoteCall<A, TaskCompletionSource<ResultT>> zaa;
        private boolean zab = true;
        private Feature[] zac;
        private int zad = 0;

        private Builder() {
        }

        /* synthetic */ Builder(zacp zacp) {
            zacp zacp2 = zacp;
        }

        @RecentlyNonNull
        @KeepForSdk
        public TaskApiCall<A, ResultT> build() {
            boolean z;
            TaskApiCall<A, ResultT> taskApiCall;
            if (this.zaa != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "execute parameter required");
            new zacr(this, this.zac, this.zab, this.zad);
            return taskApiCall;
        }

        @RecentlyNonNull
        @KeepForSdk
        @Deprecated
        public Builder<A, ResultT> execute(@RecentlyNonNull BiConsumer<A, TaskCompletionSource<ResultT>> biConsumer) {
            RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall;
            new zacq(biConsumer);
            this.zaa = remoteCall;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, ResultT> run(@RecentlyNonNull RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z) {
            this.zab = z;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, ResultT> setFeatures(@RecentlyNonNull Feature... featureArr) {
            this.zac = featureArr;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, ResultT> setMethodKey(int i) {
            this.zad = i;
            return this;
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }

    @KeepForSdk
    protected TaskApiCall(@Nullable Feature[] featureArr, boolean z, int i) {
        Feature[] featureArr2 = featureArr;
        boolean z2 = z;
        int i2 = i;
        this.zaa = featureArr2;
        this.zab = featureArr2 != null ? z2 : false;
        this.zac = i2;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.RecentlyNonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <A extends com.google.android.gms.common.api.Api.AnyClient, ResultT> com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> builder() {
        /*
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r1 = new com.google.android.gms.common.api.internal.TaskApiCall$Builder
            r0 = r1
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r1 = r0
            r0 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.TaskApiCall.builder():com.google.android.gms.common.api.internal.TaskApiCall$Builder");
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract void doExecute(@RecentlyNonNull A a, @RecentlyNonNull TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    @RecentlyNullable
    public final Feature[] zaa() {
        return this.zaa;
    }

    public final int zab() {
        return this.zac;
    }
}
