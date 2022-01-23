package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions;
import com.google.android.gms.common.internal.C0433GmsClient;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zzf */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0140zzf extends C0433GmsClient<C0154zzt> {
    private final C0125GoogleSignInOptions zzcl;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0140zzf(android.content.Context r19, android.os.Looper r20, com.google.android.gms.common.internal.C0427ClientSettings r21, @androidx.annotation.Nullable com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions r22, com.google.android.gms.common.api.C0222GoogleApiClient.ConnectionCallbacks r23, com.google.android.gms.common.api.C0222GoogleApiClient.OnConnectionFailedListener r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = 91
            r14 = r3
            r15 = r5
            r16 = r6
            r10.<init>((android.content.Context) r11, (android.os.Looper) r12, (int) r13, (com.google.android.gms.common.internal.C0427ClientSettings) r14, (com.google.android.gms.common.api.C0222GoogleApiClient.ConnectionCallbacks) r15, (com.google.android.gms.common.api.C0222GoogleApiClient.OnConnectionFailedListener) r16)
            r10 = r4
            if (r10 == 0) goto L_0x0066
            com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder r10 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder
            r17 = r10
            r10 = r17
            r11 = r17
            r12 = r4
            r11.<init>(r12)
        L_0x0029:
            r17 = r10
            r10 = r17
            r11 = r17
            r7 = r11
            java.lang.String r11 = com.google.android.gms.internal.p001authapi.C0751zzba.zzw()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder r10 = r10.setLogSessionId(r11)
            r10 = r3
            java.util.Set r10 = r10.getAllRequestedScopes()
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0072
            r10 = r3
            java.util.Set r10 = r10.getAllRequestedScopes()
            java.util.Iterator r10 = r10.iterator()
            r8 = r10
        L_0x004d:
            r10 = r8
            boolean r10 = r10.hasNext()
            if (r10 == 0) goto L_0x0072
            r10 = r8
            java.lang.Object r10 = r10.next()
            com.google.android.gms.common.api.Scope r10 = (com.google.android.gms.common.api.C0235Scope) r10
            r9 = r10
            r10 = r7
            r11 = r9
            r12 = 0
            com.google.android.gms.common.api.Scope[] r12 = new com.google.android.gms.common.api.C0235Scope[r12]
            com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder r10 = r10.requestScopes(r11, r12)
            goto L_0x004d
        L_0x0066:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder r10 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder
            r17 = r10
            r10 = r17
            r11 = r17
            r11.<init>()
            goto L_0x0029
        L_0x0072:
            r10 = r0
            r11 = r7
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r11 = r11.build()
            r10.zzcl = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.C0140zzf.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.ClientSettings, com.google.android.gms.auth.api.signin.GoogleSignInOptions, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener):void");
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final boolean providesSignIn() {
        return true;
    }

    public final Intent getSignInIntent() {
        return C0143zzi.zzc(getContext(), this.zzcl);
    }

    public final C0125GoogleSignInOptions zzo() {
        return this.zzcl;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        IInterface iInterface;
        IBinder iBinder2 = iBinder;
        IBinder iBinder3 = iBinder2;
        if (iBinder2 == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        IInterface iInterface2 = queryLocalInterface;
        if (queryLocalInterface instanceof C0154zzt) {
            return (C0154zzt) iInterface2;
        }
        new C0157zzw(iBinder3);
        return iInterface;
    }
}
