package com.google.firebase.auth.api.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C0189GoogleApiAvailability;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.internal.C0265StatusExceptionMapper;
import com.google.android.gms.dynamite.C0677DynamiteModule;
import com.google.firebase.C1156FirebaseExceptionMapper;
import java.util.Collections;
import java.util.concurrent.Callable;

final class zzdn implements Callable<zzaj<zzee>> {
    private final Context zzml;
    private final zzee zzmm;

    public zzdn(zzee zzee, Context context) {
        this.zzmm = zzee;
        this.zzml = context;
    }

    @NonNull
    private final C0220GoogleApi<zzee> zza(boolean z, Context context) {
        C0220GoogleApi<zzee> googleApi;
        C0265StatusExceptionMapper statusExceptionMapper;
        zzee zzee = (zzee) this.zzmm.clone();
        zzee zzee2 = zzee;
        zzee zzee3 = zzee;
        boolean z2 = z;
        boolean z3 = z2;
        zzee2.zzmc = z2;
        new C1156FirebaseExceptionMapper();
        new zzak(context, zzec.zzoz, zzee3, statusExceptionMapper);
        return googleApi;
    }

    public final /* synthetic */ Object call() throws Exception {
        C0220GoogleApi<zzee> googleApi;
        int remoteVersion;
        C0220GoogleApi<zzee> zza;
        zzam zzam;
        Object obj;
        int localVersion = C0677DynamiteModule.getLocalVersion(this.zzml, "com.google.firebase.auth");
        int i = localVersion;
        if (localVersion != 0) {
            googleApi = zza(true, this.zzml);
        } else {
            googleApi = null;
        }
        if (i != 0) {
            switch (C0189GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.zzml, 12451000)) {
                case 0:
                case 2:
                    remoteVersion = C0677DynamiteModule.getRemoteVersion(this.zzml, "com.google.android.gms.firebase_auth");
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
