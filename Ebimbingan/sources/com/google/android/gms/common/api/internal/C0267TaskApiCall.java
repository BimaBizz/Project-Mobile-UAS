package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0211Api.AnyClient;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0590BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.TaskApiCall */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0267TaskApiCall<A extends C0211Api.AnyClient, ResultT> {
    @Nullable
    private final C0186Feature[] zaa;
    private final boolean zab;
    private final int zac;

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.api.internal.TaskApiCall$Builder */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class Builder<A extends C0211Api.AnyClient, ResultT> {
        /* access modifiers changed from: private */
        public C0262RemoteCall<A, TaskCompletionSource<ResultT>> zaa;
        private boolean zab = true;
        private C0186Feature[] zac;
        private int zad = 0;

        private Builder() {
        }

        /* synthetic */ Builder(C0340zacp zacp) {
            C0340zacp zacp2 = zacp;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public C0267TaskApiCall<A, ResultT> build() {
            boolean z;
            C0267TaskApiCall<A, ResultT> taskApiCall;
            if (this.zaa != null) {
                z = true;
            } else {
                z = false;
            }
            C0446Preconditions.checkArgument(z, "execute parameter required");
            new C0342zacr(this, this.zac, this.zab, this.zad);
            return taskApiCall;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        @Deprecated
        public Builder<A, ResultT> execute(@RecentlyNonNull C0590BiConsumer<A, TaskCompletionSource<ResultT>> biConsumer) {
            C0262RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall;
            new C0341zacq(biConsumer);
            this.zaa = remoteCall;
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder<A, ResultT> run(@RecentlyNonNull C0262RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z) {
            this.zab = z;
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder<A, ResultT> setFeatures(@RecentlyNonNull C0186Feature... featureArr) {
            this.zac = featureArr;
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder<A, ResultT> setMethodKey(int i) {
            this.zad = i;
            return this;
        }
    }

    @C0206KeepForSdk
    @Deprecated
    public C0267TaskApiCall() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }

    @C0206KeepForSdk
    protected C0267TaskApiCall(@Nullable C0186Feature[] featureArr, boolean z, int i) {
        C0186Feature[] featureArr2 = featureArr;
        boolean z2 = z;
        int i2 = i;
        this.zaa = featureArr2;
        this.zab = featureArr2 != null ? z2 : false;
        this.zac = i2;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.RecentlyNonNull
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <A extends com.google.android.gms.common.api.C0211Api.AnyClient, ResultT> com.google.android.gms.common.api.internal.C0267TaskApiCall.Builder<A, ResultT> builder() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0267TaskApiCall.builder():com.google.android.gms.common.api.internal.TaskApiCall$Builder");
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public abstract void doExecute(@RecentlyNonNull A a, @RecentlyNonNull TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    @C0206KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    @RecentlyNullable
    public final C0186Feature[] zaa() {
        return this.zaa;
    }

    public final int zab() {
        return this.zac;
    }
}
