package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zad;
import com.google.android.gms.signin.zae;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaco extends zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private static final Api.AbstractClientBuilder<? extends zae, SignInOptions> zaa = zad.zac;
    private final Context zab;
    private final Handler zac;
    private final Api.AbstractClientBuilder<? extends zae, SignInOptions> zad;
    private final Set<Scope> zae;
    private final ClientSettings zaf;
    private zae zag;
    /* access modifiers changed from: private */
    public zacn zah;

    @WorkerThread
    public zaco(Context context, Handler handler, @NonNull ClientSettings clientSettings) {
        ClientSettings clientSettings2 = clientSettings;
        Api.AbstractClientBuilder<? extends zae, SignInOptions> abstractClientBuilder = zaa;
        this.zab = context;
        this.zac = handler;
        this.zaf = (ClientSettings) Preconditions.checkNotNull(clientSettings2, "ClientSettings must not be null");
        this.zae = clientSettings2.getRequiredScopes();
        this.zad = abstractClientBuilder;
    }

    static /* synthetic */ void zaf(zaco zaco, zak zak) {
        StringBuilder sb;
        Throwable th;
        zaco zaco2 = zaco;
        zak zak2 = zak;
        ConnectionResult zaa2 = zak2.zaa();
        if (zaa2.isSuccess()) {
            zav zav = (zav) Preconditions.checkNotNull(zak2.zab());
            ConnectionResult zab2 = zav.zab();
            if (!zab2.isSuccess()) {
                String valueOf = String.valueOf(zab2);
                new StringBuilder(String.valueOf(valueOf).length() + 48);
                StringBuilder append = sb.append("Sign-in succeeded with resolve account failure: ");
                StringBuilder append2 = sb.append(valueOf);
                String sb2 = sb.toString();
                new Exception();
                int wtf = Log.wtf("SignInCoordinator", sb2, th);
                zaco2.zah.zaa(zab2);
                zaco2.zag.disconnect();
                return;
            }
            zaco2.zah.zab(zav.zaa(), zaco2.zae);
        } else {
            zaco2.zah.zaa(zaa2);
        }
        zaco2.zag.disconnect();
    }

    @WorkerThread
    public final void onConnected(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        this.zag.zaa(this);
    }

    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zah.zaa(connectionResult);
    }

    @WorkerThread
    public final void onConnectionSuspended(int i) {
        int i2 = i;
        this.zag.disconnect();
    }

    @BinderThread
    public final void zab(zak zak) {
        Runnable runnable;
        Handler handler = this.zac;
        new zacm(this, zak);
        boolean post = handler.post(runnable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.google.android.gms.common.api.Api$AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions>} */
    /* JADX WARNING: type inference failed for: r7v4, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zac(com.google.android.gms.common.api.internal.zacn r15) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            r6 = r0
            com.google.android.gms.signin.zae r6 = r6.zag
            r2 = r6
            r6 = r2
            if (r6 == 0) goto L_0x000d
            r6 = r2
            r6.disconnect()
        L_0x000d:
            r6 = r0
            com.google.android.gms.common.internal.ClientSettings r6 = r6.zaf
            r7 = r0
            int r7 = java.lang.System.identityHashCode(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.zae(r7)
            r6 = r0
            com.google.android.gms.common.api.Api$AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> r6 = r6.zad
            r2 = r6
            r6 = r0
            android.content.Context r6 = r6.zab
            r3 = r6
            r6 = r0
            android.os.Handler r6 = r6.zac
            r4 = r6
            r6 = r4
            android.os.Looper r6 = r6.getLooper()
            r4 = r6
            r6 = r0
            com.google.android.gms.common.internal.ClientSettings r6 = r6.zaf
            r5 = r6
            r6 = r0
            r7 = r2
            r8 = r3
            r9 = r4
            r10 = r5
            r11 = r5
            com.google.android.gms.signin.SignInOptions r11 = r11.zac()
            r12 = r0
            r13 = r0
            com.google.android.gms.common.api.Api$Client r7 = r7.buildClient((android.content.Context) r8, (android.os.Looper) r9, (com.google.android.gms.common.internal.ClientSettings) r10, r11, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r12, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r13)
            r6.zag = r7
            r6 = r0
            r7 = r1
            r6.zah = r7
            r6 = r0
            java.util.Set<com.google.android.gms.common.api.Scope> r6 = r6.zae
            r1 = r6
            r6 = r1
            if (r6 == 0) goto L_0x0056
            r6 = r1
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0069
        L_0x0056:
            r6 = r0
            android.os.Handler r6 = r6.zac
            r1 = r6
            com.google.android.gms.common.api.internal.zacl r6 = new com.google.android.gms.common.api.internal.zacl
            r2 = r6
            r6 = r2
            r7 = r0
            r6.<init>(r7)
            r6 = r1
            r7 = r2
            boolean r6 = r6.post(r7)
        L_0x0068:
            return
        L_0x0069:
            r6 = r0
            com.google.android.gms.signin.zae r6 = r6.zag
            r6.zad()
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaco.zac(com.google.android.gms.common.api.internal.zacn):void");
    }

    public final void zad() {
        zae zae2 = this.zag;
        if (zae2 != null) {
            zae2.disconnect();
        }
    }
}
