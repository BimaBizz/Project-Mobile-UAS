package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0211Api.AnyClient;
import com.google.android.gms.common.util.C0590BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.RegistrationMethods */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0261RegistrationMethods<A extends C0211Api.AnyClient, L> {
    @RecentlyNonNull
    @C0206KeepForSdk
    public final C0260RegisterListenerMethod<A, L> register;
    @RecentlyNonNull
    public final C0269UnregisterListenerMethod<A, L> zaa;
    @RecentlyNonNull
    public final Runnable zab;

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.api.internal.RegistrationMethods$Builder */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class Builder<A extends C0211Api.AnyClient, L> {
        /* access modifiers changed from: private */
        public C0262RemoteCall<A, TaskCompletionSource<Void>> zaa;
        /* access modifiers changed from: private */
        public C0262RemoteCall<A, TaskCompletionSource<Boolean>> zab;
        private Runnable zac = C0329zace.zaa;
        private C0254ListenerHolder<L> zad;
        private C0186Feature[] zae;
        private boolean zaf = true;
        private int zag;

        private Builder() {
        }

        /* synthetic */ Builder(C0328zacd zacd) {
            C0328zacd zacd2 = zacd;
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.common.api.internal.C0261RegistrationMethods<A, L> build() {
            /*
                r11 = this;
                r0 = r11
                r5 = r0
                com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> r5 = r5.zaa
                if (r5 == 0) goto L_0x0075
                r5 = 1
                r1 = r5
            L_0x0008:
                r5 = r1
                java.lang.String r6 = "Must set register function"
                com.google.android.gms.common.internal.C0446Preconditions.checkArgument(r5, r6)
                r5 = r0
                com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean>> r5 = r5.zab
                if (r5 == 0) goto L_0x0072
                r5 = 1
                r1 = r5
            L_0x0016:
                r5 = r1
                java.lang.String r6 = "Must set unregister function"
                com.google.android.gms.common.internal.C0446Preconditions.checkArgument(r5, r6)
                r5 = r0
                com.google.android.gms.common.api.internal.ListenerHolder<L> r5 = r5.zad
                if (r5 == 0) goto L_0x006f
                r5 = 1
                r1 = r5
            L_0x0024:
                r5 = r1
                java.lang.String r6 = "Must set holder"
                com.google.android.gms.common.internal.C0446Preconditions.checkArgument(r5, r6)
                r5 = r0
                com.google.android.gms.common.api.internal.ListenerHolder<L> r5 = r5.zad
                r1 = r5
                r5 = r1
                com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r5 = r5.getListenerKey()
                r1 = r5
                r5 = r1
                java.lang.String r6 = "Key must not be null"
                java.lang.Object r5 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r5, r6)
                r1 = r5
                r5 = r1
                com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r5 = (com.google.android.gms.common.api.internal.C0254ListenerHolder.ListenerKey) r5
                r1 = r5
                com.google.android.gms.common.api.internal.RegistrationMethods r5 = new com.google.android.gms.common.api.internal.RegistrationMethods
                r2 = r5
                com.google.android.gms.common.api.internal.zach r5 = new com.google.android.gms.common.api.internal.zach
                r3 = r5
                r5 = r3
                r6 = r0
                r7 = r0
                com.google.android.gms.common.api.internal.ListenerHolder<L> r7 = r7.zad
                r8 = r0
                com.google.android.gms.common.Feature[] r8 = r8.zae
                r9 = r0
                boolean r9 = r9.zaf
                r10 = r0
                int r10 = r10.zag
                r5.<init>(r6, r7, r8, r9, r10)
                com.google.android.gms.common.api.internal.zaci r5 = new com.google.android.gms.common.api.internal.zaci
                r4 = r5
                r5 = r4
                r6 = r0
                r7 = r1
                r5.<init>(r6, r7)
                r5 = r2
                r6 = r3
                r7 = r4
                r8 = r0
                java.lang.Runnable r8 = r8.zac
                r9 = 0
                r5.<init>(r6, r7, r8, r9)
                r5 = r2
                r0 = r5
                return r0
            L_0x006f:
                r5 = 0
                r1 = r5
                goto L_0x0024
            L_0x0072:
                r5 = 0
                r1 = r5
                goto L_0x0016
            L_0x0075:
                r5 = 0
                r1 = r5
                goto L_0x0008
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0261RegistrationMethods.Builder.build():com.google.android.gms.common.api.internal.RegistrationMethods");
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder<A, L> onConnectionSuspended(@RecentlyNonNull Runnable runnable) {
            this.zac = runnable;
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder<A, L> register(@RecentlyNonNull C0262RemoteCall<A, TaskCompletionSource<Void>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        @Deprecated
        public Builder<A, L> register(@RecentlyNonNull C0590BiConsumer<A, TaskCompletionSource<Void>> biConsumer) {
            C0262RemoteCall<A, TaskCompletionSource<Void>> remoteCall;
            new C0330zacf(biConsumer);
            this.zaa = remoteCall;
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder<A, L> setAutoResolveMissingFeatures(boolean z) {
            this.zaf = z;
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder<A, L> setFeatures(@RecentlyNonNull C0186Feature... featureArr) {
            this.zae = featureArr;
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder<A, L> setMethodKey(int i) {
            this.zag = i;
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder<A, L> unregister(@RecentlyNonNull C0262RemoteCall<A, TaskCompletionSource<Boolean>> remoteCall) {
            this.zab = remoteCall;
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        @Deprecated
        public Builder<A, L> unregister(@RecentlyNonNull C0590BiConsumer<A, TaskCompletionSource<Boolean>> biConsumer) {
            C0262RemoteCall<A, TaskCompletionSource<Void>> remoteCall;
            C0590BiConsumer<A, TaskCompletionSource<Boolean>> biConsumer2 = biConsumer;
            new C0331zacg(this);
            this.zaa = remoteCall;
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder<A, L> withHolder(@RecentlyNonNull C0254ListenerHolder<L> listenerHolder) {
            this.zad = listenerHolder;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void zaa(C0211Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
            this.zaa.accept(anyClient, taskCompletionSource);
        }
    }

    /* synthetic */ C0261RegistrationMethods(C0260RegisterListenerMethod registerListenerMethod, C0269UnregisterListenerMethod unregisterListenerMethod, Runnable runnable, C0328zacd zacd) {
        C0328zacd zacd2 = zacd;
        this.register = registerListenerMethod;
        this.zaa = unregisterListenerMethod;
        this.zab = runnable;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.RecentlyNonNull
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <A extends com.google.android.gms.common.api.C0211Api.AnyClient, L> com.google.android.gms.common.api.internal.C0261RegistrationMethods.Builder<A, L> builder() {
        /*
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r1 = new com.google.android.gms.common.api.internal.RegistrationMethods$Builder
            r0 = r1
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r1 = r0
            r0 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0261RegistrationMethods.builder():com.google.android.gms.common.api.internal.RegistrationMethods$Builder");
    }
}
