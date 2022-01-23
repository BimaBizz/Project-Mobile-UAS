package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.api.internal.C0245ConnectionCallbacks;
import com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener;
import java.util.Collections;
import java.util.Set;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.GmsClient */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0433GmsClient<T extends IInterface> extends C0424BaseGmsClient<T> implements C0211Api.Client, C0494zaj {
    private final C0427ClientSettings zaa;
    private final Set<C0235Scope> zab;
    @Nullable
    private final Account zac;

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    @com.google.android.gms.common.util.C0617VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C0433GmsClient(@androidx.annotation.RecentlyNonNull android.content.Context r14, @androidx.annotation.RecentlyNonNull android.os.Handler r15, int r16, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.C0427ClientSettings r17) {
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
            com.google.android.gms.common.internal.GmsClientSupervisor r8 = com.google.android.gms.common.internal.C0434GmsClientSupervisor.getInstance(r8)
            com.google.android.gms.common.GoogleApiAvailability r9 = com.google.android.gms.common.C0189GoogleApiAvailability.getInstance()
            r10 = r3
            r11 = 0
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r5 = r0
            r6 = r4
            java.lang.Object r6 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r6)
            com.google.android.gms.common.internal.ClientSettings r6 = (com.google.android.gms.common.internal.C0427ClientSettings) r6
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0433GmsClient.<init>(android.content.Context, android.os.Handler, int, com.google.android.gms.common.internal.ClientSettings):void");
    }

    private final Set<C0235Scope> zaa(@NonNull Set<C0235Scope> set) {
        Throwable th;
        Set<C0235Scope> set2 = set;
        Set<C0235Scope> validateScopes = validateScopes(set2);
        for (C0235Scope contains : validateScopes) {
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
    @C0206KeepForSdk
    public final C0427ClientSettings getClientSettings() {
        return this.zaa;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public C0186Feature[] getRequiredFeatures() {
        return new C0186Feature[0];
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @C0206KeepForSdk
    public final Set<C0235Scope> getScopes() {
        return this.zab;
    }

    @NonNull
    @C0206KeepForSdk
    public Set<C0235Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zab : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    @NonNull
    @C0206KeepForSdk
    public Set<C0235Scope> validateScopes(@RecentlyNonNull Set<C0235Scope> set) {
        return set;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C0433GmsClient(@androidx.annotation.RecentlyNonNull android.content.Context r15, @androidx.annotation.RecentlyNonNull android.os.Looper r16, int r17, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.C0427ClientSettings r18) {
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
            com.google.android.gms.common.internal.GmsClientSupervisor r8 = com.google.android.gms.common.internal.C0434GmsClientSupervisor.getInstance(r8)
            com.google.android.gms.common.GoogleApiAvailability r9 = com.google.android.gms.common.C0189GoogleApiAvailability.getInstance()
            r10 = r3
            r11 = r4
            r12 = 0
            r13 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0433GmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.ClientSettings):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C0206KeepForSdk
    @Deprecated
    protected C0433GmsClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i, @RecentlyNonNull C0427ClientSettings clientSettings, @RecentlyNonNull C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks, @RecentlyNonNull C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, i, clientSettings, (C0245ConnectionCallbacks) connectionCallbacks, (C0257OnConnectionFailedListener) onConnectionFailedListener);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C0433GmsClient(@androidx.annotation.RecentlyNonNull android.content.Context r17, @androidx.annotation.RecentlyNonNull android.os.Looper r18, int r19, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.C0427ClientSettings r20, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.C0245ConnectionCallbacks r21, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener r22) {
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
            com.google.android.gms.common.internal.GmsClientSupervisor r10 = com.google.android.gms.common.internal.C0434GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailability r11 = com.google.android.gms.common.C0189GoogleApiAvailability.getInstance()
            r12 = r3
            r13 = r4
            r14 = r5
            java.lang.Object r14 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r14)
            com.google.android.gms.common.api.internal.ConnectionCallbacks r14 = (com.google.android.gms.common.api.internal.C0245ConnectionCallbacks) r14
            r15 = r6
            java.lang.Object r15 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r15)
            com.google.android.gms.common.api.internal.OnConnectionFailedListener r15 = (com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener) r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0433GmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.ClientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.util.C0617VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C0433GmsClient(@androidx.annotation.RecentlyNonNull android.content.Context r20, @androidx.annotation.RecentlyNonNull android.os.Looper r21, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.C0434GmsClientSupervisor r22, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.C0189GoogleApiAvailability r23, int r24, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.C0427ClientSettings r25, @androidx.annotation.Nullable com.google.android.gms.common.api.internal.C0245ConnectionCallbacks r26, @androidx.annotation.Nullable com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener r27) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0433GmsClient.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.GmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailability, int, com.google.android.gms.common.internal.ClientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener):void");
    }
}
