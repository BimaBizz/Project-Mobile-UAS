package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.internal.zzi;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class GoogleSignInClient extends GoogleApi<GoogleSignInOptions> {
    private static final zzd zzbv;
    @VisibleForTesting
    private static int zzbw = zzc.zzbx;

    /* 'enum' modifier removed */
    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    static final class zzc {
        public static final int zzbx = 1;
        public static final int zzby = 2;
        public static final int zzbz = 3;
        public static final int zzca = 4;
        private static final /* synthetic */ int[] zzcb;

        public static int[] zzm() {
            return (int[]) zzcb.clone();
        }

        static {
            int[] iArr = new int[4];
            iArr[0] = zzbx;
            int[] iArr2 = iArr;
            iArr2[1] = zzby;
            int[] iArr3 = iArr2;
            iArr3[2] = zzbz;
            int[] iArr4 = iArr3;
            iArr4[3] = zzca;
            zzcb = iArr4;
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    private static class zzd implements PendingResultUtil.ResultConverter<GoogleSignInResult, GoogleSignInAccount> {
        private zzd() {
        }

        @Nullable
        public final /* synthetic */ Object convert(Result result) {
            return ((GoogleSignInResult) result).getSignInAccount();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zzd(zzc zzc) {
            this();
            zzc zzc2 = zzc;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    GoogleSignInClient(@androidx.annotation.NonNull android.content.Context r11, com.google.android.gms.auth.api.signin.GoogleSignInOptions r12) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r0
            r4 = r1
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r5 = com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API
            r6 = r2
            com.google.android.gms.common.api.internal.ApiExceptionMapper r7 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r9 = r7
            r7 = r9
            r8 = r9
            r8.<init>()
            r3.<init>((android.content.Context) r4, r5, r6, (com.google.android.gms.common.api.internal.StatusExceptionMapper) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInClient.<init>(android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    GoogleSignInClient(@androidx.annotation.NonNull android.app.Activity r11, com.google.android.gms.auth.api.signin.GoogleSignInOptions r12) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r0
            r4 = r1
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r5 = com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API
            r6 = r2
            com.google.android.gms.common.api.internal.ApiExceptionMapper r7 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r9 = r7
            r7 = r9
            r8 = r9
            r8.<init>()
            r3.<init>((android.app.Activity) r4, r5, r6, (com.google.android.gms.common.api.internal.StatusExceptionMapper) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInClient.<init>(android.app.Activity, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }

    private final synchronized int zzl() {
        int i;
        synchronized (this) {
            if (zzbw == zzc.zzbx) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
                GoogleApiAvailability googleApiAvailability = instance;
                int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(applicationContext, 12451000);
                int i2 = isGooglePlayServicesAvailable;
                if (isGooglePlayServicesAvailable == 0) {
                    zzbw = zzc.zzca;
                } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, i2, (String) null) != null || DynamiteModule.getLocalVersion(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    zzbw = zzc.zzby;
                } else {
                    zzbw = zzc.zzbz;
                }
            }
            i = zzbw;
        }
        return i;
    }

    @NonNull
    public Intent getSignInIntent() {
        Context applicationContext = getApplicationContext();
        switch (zzc.zzbu[zzl() - 1]) {
            case 1:
                return zzi.zzd(applicationContext, (GoogleSignInOptions) getApiOptions());
            case 2:
                return zzi.zzc(applicationContext, (GoogleSignInOptions) getApiOptions());
            default:
                return zzi.zze(applicationContext, (GoogleSignInOptions) getApiOptions());
        }
    }

    public Task<GoogleSignInAccount> silentSignIn() {
        return PendingResultUtil.toTask(zzi.zzc(asGoogleApiClient(), getApplicationContext(), (GoogleSignInOptions) getApiOptions(), zzl() == zzc.zzbz), zzbv);
    }

    public Task<Void> signOut() {
        return PendingResultUtil.toVoidTask(zzi.zzc(asGoogleApiClient(), getApplicationContext(), zzl() == zzc.zzbz));
    }

    public Task<Void> revokeAccess() {
        return PendingResultUtil.toVoidTask(zzi.zzd(asGoogleApiClient(), getApplicationContext(), zzl() == zzc.zzbz));
    }

    static {
        zzd zzd2;
        new zzd((zzc) null);
        zzbv = zzd2;
    }
}
