package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zaj {
    private final ClientSettings zaa;
    private final Set<Scope> zab;
    @Nullable
    private final Account zac;

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected GmsClient(@androidx.annotation.RecentlyNonNull android.content.Context r14, @androidx.annotation.RecentlyNonNull android.os.Handler r15, int r16, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.ClientSettings r17) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r0
            r6 = r1
            r7 = r2
            r8 = r1
            com.google.android.gms.common.internal.GmsClientSupervisor r8 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r8)
            com.google.android.gms.common.GoogleApiAvailability r9 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r10 = r3
            r11 = 0
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r5 = r0
            r6 = r4
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            com.google.android.gms.common.internal.ClientSettings r6 = (com.google.android.gms.common.internal.ClientSettings) r6
            r5.zaa = r6
            r5 = r0
            r6 = r4
            android.accounts.Account r6 = r6.getAccount()
            r5.zac = r6
            r5 = r0
            r6 = r0
            r7 = r4
            java.util.Set r7 = r7.getAllRequestedScopes()
            java.util.Set r6 = r6.zaa(r7)
            r5.zab = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.GmsClient.<init>(android.content.Context, android.os.Handler, int, com.google.android.gms.common.internal.ClientSettings):void");
    }

    private final Set<Scope> zaa(@NonNull Set<Scope> set) {
        Throwable th;
        Set<Scope> set2 = set;
        Set<Scope> validateScopes = validateScopes(set2);
        for (Scope contains : validateScopes) {
            if (!set2.contains(contains)) {
                new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
                throw th;
            }
        }
        return validateScopes;
    }

    @RecentlyNullable
    public final Account getAccount() {
        return this.zac;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @KeepForSdk
    public final ClientSettings getClientSettings() {
        return this.zaa;
    }

    @RecentlyNonNull
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @KeepForSdk
    public final Set<Scope> getScopes() {
        return this.zab;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zab : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    public Set<Scope> validateScopes(@RecentlyNonNull Set<Scope> set) {
        return set;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected GmsClient(@androidx.annotation.RecentlyNonNull android.content.Context r15, @androidx.annotation.RecentlyNonNull android.os.Looper r16, int r17, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.ClientSettings r18) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r0
            r6 = r1
            r7 = r2
            r8 = r1
            com.google.android.gms.common.internal.GmsClientSupervisor r8 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r8)
            com.google.android.gms.common.GoogleApiAvailability r9 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r10 = r3
            r11 = r4
            r12 = 0
            r13 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.GmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.ClientSettings):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    @Deprecated
    protected GmsClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i, @RecentlyNonNull ClientSettings clientSettings, @RecentlyNonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks, @RecentlyNonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, i, clientSettings, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected GmsClient(@androidx.annotation.RecentlyNonNull android.content.Context r17, @androidx.annotation.RecentlyNonNull android.os.Looper r18, int r19, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.ClientSettings r20, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.ConnectionCallbacks r21, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.OnConnectionFailedListener r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r0
            r8 = r1
            r9 = r2
            r10 = r1
            com.google.android.gms.common.internal.GmsClientSupervisor r10 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailability r11 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r12 = r3
            r13 = r4
            r14 = r5
            java.lang.Object r14 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            com.google.android.gms.common.api.internal.ConnectionCallbacks r14 = (com.google.android.gms.common.api.internal.ConnectionCallbacks) r14
            r15 = r6
            java.lang.Object r15 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r15)
            com.google.android.gms.common.api.internal.OnConnectionFailedListener r15 = (com.google.android.gms.common.api.internal.OnConnectionFailedListener) r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.GmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.ClientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected GmsClient(@androidx.annotation.RecentlyNonNull android.content.Context r20, @androidx.annotation.RecentlyNonNull android.os.Looper r21, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.GmsClientSupervisor r22, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.GoogleApiAvailability r23, int r24, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.ClientSettings r25, @androidx.annotation.Nullable com.google.android.gms.common.api.internal.ConnectionCallbacks r26, @androidx.annotation.Nullable com.google.android.gms.common.api.internal.OnConnectionFailedListener r27) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r10 = r7
            if (r10 != 0) goto L_0x0054
            r10 = 0
            r7 = r10
        L_0x0017:
            r10 = r8
            if (r10 != 0) goto L_0x0049
            r10 = 0
            r8 = r10
        L_0x001c:
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r7
            r17 = r8
            r18 = r6
            java.lang.String r18 = r18.zab()
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r10 = r0
            r11 = r6
            r10.zaa = r11
            r10 = r0
            r11 = r6
            android.accounts.Account r11 = r11.getAccount()
            r10.zac = r11
            r10 = r0
            r11 = r0
            r12 = r6
            java.util.Set r12 = r12.getAllRequestedScopes()
            java.util.Set r11 = r11.zaa(r12)
            r10.zab = r11
            return
        L_0x0049:
            com.google.android.gms.common.internal.zai r10 = new com.google.android.gms.common.internal.zai
            r9 = r10
            r10 = r9
            r11 = r8
            r10.<init>(r11)
            r10 = r9
            r8 = r10
            goto L_0x001c
        L_0x0054:
            com.google.android.gms.common.internal.zah r10 = new com.google.android.gms.common.internal.zah
            r9 = r10
            r10 = r9
            r11 = r7
            r10.<init>(r11)
            r10 = r9
            r7 = r10
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.GmsClient.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.GmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailability, int, com.google.android.gms.common.internal.ClientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener):void");
    }
}
