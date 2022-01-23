package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.C0446Preconditions;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.BaseImplementation */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0243BaseImplementation {

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface ResultHolder<R> {
        @C0206KeepForSdk
        void setFailedResult(@RecentlyNonNull C0236Status status);

        @C0206KeepForSdk
        void setResult(@RecentlyNonNull R r);
    }

    public C0243BaseImplementation() {
    }

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static abstract class ApiMethodImpl<R extends C0231Result, A extends C0211Api.AnyClient> extends C0244BasePendingResult<R> implements ResultHolder<R> {
        @C0206KeepForSdk
        @Nullable
        private final C0211Api<?> mApi;
        @C0206KeepForSdk
        private final C0211Api.AnyClientKey<A> mClientKey;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @C0206KeepForSdk
        @Deprecated
        protected ApiMethodImpl(@RecentlyNonNull C0211Api.AnyClientKey<A> anyClientKey, @RecentlyNonNull C0222GoogleApiClient googleApiClient) {
            super((C0222GoogleApiClient) C0446Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            this.mClientKey = (C0211Api.AnyClientKey) C0446Preconditions.checkNotNull(anyClientKey);
            this.mApi = null;
        }

        @C0206KeepForSdk
        private void setFailedResult(@NonNull RemoteException remoteException) {
            C0236Status status;
            new C0236Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null);
            setFailedResult(status);
        }

        /* access modifiers changed from: protected */
        @C0206KeepForSdk
        public abstract void doExecute(@RecentlyNonNull A a) throws RemoteException;

        @C0206KeepForSdk
        @RecentlyNullable
        public final C0211Api<?> getApi() {
            return this.mApi;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public final C0211Api.AnyClientKey<A> getClientKey() {
            return this.mClientKey;
        }

        /* access modifiers changed from: protected */
        @C0206KeepForSdk
        public void onSetFailedResult(@RecentlyNonNull R r) {
        }

        @C0206KeepForSdk
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

        @C0206KeepForSdk
        public /* bridge */ /* synthetic */ void setResult(@RecentlyNonNull Object obj) {
            super.setResult((C0231Result) obj);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @C0206KeepForSdk
        protected ApiMethodImpl(@RecentlyNonNull C0211Api<?> api, @RecentlyNonNull C0222GoogleApiClient googleApiClient) {
            super((C0222GoogleApiClient) C0446Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            C0211Api<?> api2 = api;
            Object checkNotNull = C0446Preconditions.checkNotNull(api2, "Api must not be null");
            this.mClientKey = api2.zac();
            this.mApi = api2;
        }

        @C0206KeepForSdk
        public final void setFailedResult(@RecentlyNonNull C0236Status status) {
            C0236Status status2 = status;
            C0446Preconditions.checkArgument(!status2.isSuccess(), "Failed result must not be success");
            C0231Result createFailedResult = createFailedResult(status2);
            setResult(createFailedResult);
            onSetFailedResult(createFailedResult);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.VisibleForTesting
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected ApiMethodImpl(@androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.C0244BasePendingResult.CallbackHandler<R> r5) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0243BaseImplementation.ApiMethodImpl.<init>(com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler):void");
        }
    }
}
