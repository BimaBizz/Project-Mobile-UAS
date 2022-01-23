package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class BaseImplementation {

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface ResultHolder<R> {
        @KeepForSdk
        void setFailedResult(@RecentlyNonNull Status status);

        @KeepForSdk
        void setResult(@RecentlyNonNull R r);
    }

    public BaseImplementation() {
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {
        @KeepForSdk
        @Nullable
        private final Api<?> mApi;
        @KeepForSdk
        private final Api.AnyClientKey<A> mClientKey;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @KeepForSdk
        @Deprecated
        protected ApiMethodImpl(@RecentlyNonNull Api.AnyClientKey<A> anyClientKey, @RecentlyNonNull GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            this.mClientKey = (Api.AnyClientKey) Preconditions.checkNotNull(anyClientKey);
            this.mApi = null;
        }

        @KeepForSdk
        private void setFailedResult(@NonNull RemoteException remoteException) {
            Status status;
            new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null);
            setFailedResult(status);
        }

        /* access modifiers changed from: protected */
        @KeepForSdk
        public abstract void doExecute(@RecentlyNonNull A a) throws RemoteException;

        @KeepForSdk
        @RecentlyNullable
        public final Api<?> getApi() {
            return this.mApi;
        }

        @RecentlyNonNull
        @KeepForSdk
        public final Api.AnyClientKey<A> getClientKey() {
            return this.mClientKey;
        }

        /* access modifiers changed from: protected */
        @KeepForSdk
        public void onSetFailedResult(@RecentlyNonNull R r) {
        }

        @KeepForSdk
        public final void run(@RecentlyNonNull A a) throws DeadObjectException {
            try {
                doExecute(a);
            } catch (DeadObjectException e) {
                DeadObjectException deadObjectException = e;
                setFailedResult((RemoteException) deadObjectException);
                throw deadObjectException;
            } catch (RemoteException e2) {
                setFailedResult(e2);
            }
        }

        @KeepForSdk
        public /* bridge */ /* synthetic */ void setResult(@RecentlyNonNull Object obj) {
            super.setResult((Result) obj);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @KeepForSdk
        protected ApiMethodImpl(@RecentlyNonNull Api<?> api, @RecentlyNonNull GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            Api<?> api2 = api;
            Object checkNotNull = Preconditions.checkNotNull(api2, "Api must not be null");
            this.mClientKey = api2.zac();
            this.mApi = api2;
        }

        @KeepForSdk
        public final void setFailedResult(@RecentlyNonNull Status status) {
            Status status2 = status;
            Preconditions.checkArgument(!status2.isSuccess(), "Failed result must not be success");
            Result createFailedResult = createFailedResult(status2);
            setResult(createFailedResult);
            onSetFailedResult(createFailedResult);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.VisibleForTesting
        @com.google.android.gms.common.annotation.KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected ApiMethodImpl(@androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<R> r5) {
            /*
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r0
                r3 = r1
                r2.<init>(r3)
                com.google.android.gms.common.api.Api$AnyClientKey r2 = new com.google.android.gms.common.api.Api$AnyClientKey
                r1 = r2
                r2 = r1
                r2.<init>()
                r2 = r0
                r3 = r1
                r2.mClientKey = r3
                r2 = r0
                r3 = 0
                r2.mApi = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl.<init>(com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler):void");
        }
    }
}
