package com.google.firebase.auth.api.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Collections;
import java.util.concurrent.Callable;

final class zzdn implements Callable<zzaj<zzee>> {
    private final Context zzml;
    private final zzee zzmm;

    public zzdn(zzee zzee, Context context) {
        this.zzmm = zzee;
        this.zzml = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: com.google.android.gms.common.api.internal.StatusExceptionMapper} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.common.api.GoogleApi<com.google.firebase.auth.api.internal.zzee> zza(boolean r14, android.content.Context r15) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r5 = r0
            com.google.firebase.auth.api.internal.zzee r5 = r5.zzmm
            java.lang.Object r5 = r5.clone()
            com.google.firebase.auth.api.internal.zzee r5 = (com.google.firebase.auth.api.internal.zzee) r5
            r12 = r5
            r5 = r12
            r6 = r12
            r3 = r6
            r6 = r1
            r12 = r6
            r6 = r12
            r7 = r12
            r4 = r7
            r5.zzmc = r6
            com.google.firebase.auth.api.internal.zzak r5 = new com.google.firebase.auth.api.internal.zzak
            r12 = r5
            r5 = r12
            r6 = r12
            r7 = r2
            com.google.android.gms.common.api.Api<com.google.firebase.auth.api.internal.zzee> r8 = com.google.firebase.auth.api.internal.zzec.zzoz
            r9 = r3
            com.google.firebase.FirebaseExceptionMapper r10 = new com.google.firebase.FirebaseExceptionMapper
            r12 = r10
            r10 = r12
            r11 = r12
            r11.<init>()
            r6.<init>(r7, r8, r9, r10)
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.internal.zzdn.zza(boolean, android.content.Context):com.google.android.gms.common.api.GoogleApi");
    }

    public final /* synthetic */ Object call() throws Exception {
        GoogleApi<zzee> googleApi;
        int remoteVersion;
        GoogleApi<zzee> zza;
        zzam zzam;
        Object obj;
        int localVersion = DynamiteModule.getLocalVersion(this.zzml, "com.google.firebase.auth");
        int i = localVersion;
        if (localVersion != 0) {
            googleApi = zza(true, this.zzml);
        } else {
            googleApi = null;
        }
        if (i != 0) {
            switch (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.zzml, 12451000)) {
                case 0:
                case 2:
                    remoteVersion = DynamiteModule.getRemoteVersion(this.zzml, "com.google.android.gms.firebase_auth");
                    break;
                default:
                    remoteVersion = 0;
                    break;
            }
        } else {
            remoteVersion = 1;
        }
        if (remoteVersion == 0) {
            zza = null;
        } else {
            zza = zza(false, this.zzml);
        }
        new zzal(remoteVersion, i, Collections.emptyMap());
        new zzaj(zza, googleApi, zzam);
        return obj;
    }
}
