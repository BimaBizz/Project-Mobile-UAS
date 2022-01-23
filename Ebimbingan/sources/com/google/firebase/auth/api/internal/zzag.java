package com.google.firebase.auth.api.internal;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.logging.C0547Logger;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.api.internal.zzai;
import java.util.concurrent.Future;

public abstract class zzag<T extends zzai> {
    private static C0547Logger zzjt;
    @GuardedBy("this")
    private zzaj<T> zzma;

    public zzag() {
    }

    /* access modifiers changed from: package-private */
    public abstract Future<zzaj<T>> zzdq();

    public final <ResultT, A extends C0211Api.AnyClient> Task<ResultT> zza(zzan<A, ResultT> zzan) {
        zzan<A, ResultT> zzan2 = zzan;
        C0220GoogleApi zzbw = zzbw(zzan2.zzdu());
        C0220GoogleApi googleApi = zzbw;
        if (zzbw == null) {
            return zzdr();
        }
        return googleApi.doRead(zzan2.zzdv());
    }

    public final <ResultT, A extends C0211Api.AnyClient> Task<ResultT> zzb(zzan<A, ResultT> zzan) {
        zzan<A, ResultT> zzan2 = zzan;
        C0220GoogleApi zzbw = zzbw(zzan2.zzdu());
        C0220GoogleApi googleApi = zzbw;
        if (zzbw == null) {
            return zzdr();
        }
        return googleApi.doWrite(zzan2.zzdv());
    }

    private static <ResultT> Task<ResultT> zzdr() {
        C0236Status status;
        new C0236Status((int) FirebaseError.ERROR_INTERNAL_ERROR, "Unable to connect to GoogleApi instance - Google Play Services may be unavailable");
        return Tasks.forException(zzdr.zzb(status));
    }

    private final C0220GoogleApi<T> zzbw(String str) {
        StringBuilder sb;
        StringBuilder sb2;
        zzaj zzds = zzds();
        zzaj zzaj = zzds;
        if (zzds.zzmf.zzbx(str)) {
            C0547Logger logger = zzjt;
            String valueOf = String.valueOf(zzaj.zzme);
            new StringBuilder(43 + String.valueOf(valueOf).length());
            logger.w(sb2.append("getGoogleApiForMethod() returned Fallback: ").append(valueOf).toString(), new Object[0]);
            return zzaj.zzme;
        }
        C0547Logger logger2 = zzjt;
        String valueOf2 = String.valueOf(zzaj.zzmd);
        new StringBuilder(38 + String.valueOf(valueOf2).length());
        logger2.w(sb.append("getGoogleApiForMethod() returned Gms: ").append(valueOf2).toString(), new Object[0]);
        return zzaj.zzmd;
    }

    /* JADX INFO: finally extract failed */
    private final zzaj<T> zzds() {
        Throwable th;
        String str;
        String str2;
        synchronized (this) {
            try {
                if (this.zzma == null) {
                    this.zzma = (zzaj) zzdq().get();
                }
                zzaj<T> zzaj = this.zzma;
                return zzaj;
            } catch (Exception e) {
                Exception exc = e;
                Throwable th2 = th;
                String valueOf = String.valueOf(exc.getMessage());
                String str3 = valueOf;
                if (valueOf.length() != 0) {
                    str2 = "There was an error while initializing the connection to Google Play Services: ".concat(str3);
                } else {
                    str2 = str;
                    new String("There was an error while initializing the connection to Google Play Services: ");
                }
                new RuntimeException(str2);
                throw th2;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                throw th4;
            }
        }
    }

    static {
        C0547Logger logger;
        C0547Logger logger2 = logger;
        new C0547Logger("BiChannelGoogleApi", "FirebaseAuth: ");
        zzjt = logger2;
    }
}
