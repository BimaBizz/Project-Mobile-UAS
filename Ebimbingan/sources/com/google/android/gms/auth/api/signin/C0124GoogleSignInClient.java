package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.internal.C0143zzi;
import com.google.android.gms.common.C0189GoogleApiAvailability;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.internal.C0445PendingResultUtil;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.dynamite.C0677DynamiteModule;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C0124GoogleSignInClient extends C0220GoogleApi<C0125GoogleSignInOptions> {
    private static final zzd zzbv;
    @C0617VisibleForTesting
    private static int zzbw = zzc.zzbx;

    /* 'enum' modifier removed */
    @C0617VisibleForTesting
    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$zzc */
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

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$zzd */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    private static class zzd implements C0445PendingResultUtil.ResultConverter<C0127GoogleSignInResult, C0122GoogleSignInAccount> {
        private zzd() {
        }

        @Nullable
        public final /* synthetic */ Object convert(C0231Result result) {
            return ((C0127GoogleSignInResult) result).getSignInAccount();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zzd(C0164zzc zzc) {
            this();
            C0164zzc zzc2 = zzc;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0124GoogleSignInClient(@androidx.annotation.NonNull android.content.Context r11, com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions r12) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r0
            r4 = r1
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r5 = com.google.android.gms.auth.api.C0031Auth.GOOGLE_SIGN_IN_API
            r6 = r2
            com.google.android.gms.common.api.internal.ApiExceptionMapper r7 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r9 = r7
            r7 = r9
            r8 = r9
            r8.<init>()
            r3.<init>((android.content.Context) r4, r5, r6, (com.google.android.gms.common.api.internal.C0265StatusExceptionMapper) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.C0124GoogleSignInClient.<init>(android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0124GoogleSignInClient(@androidx.annotation.NonNull android.app.Activity r11, com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions r12) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r0
            r4 = r1
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r5 = com.google.android.gms.auth.api.C0031Auth.GOOGLE_SIGN_IN_API
            r6 = r2
            com.google.android.gms.common.api.internal.ApiExceptionMapper r7 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r9 = r7
            r7 = r9
            r8 = r9
            r8.<init>()
            r3.<init>((android.app.Activity) r4, r5, r6, (com.google.android.gms.common.api.internal.C0265StatusExceptionMapper) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.C0124GoogleSignInClient.<init>(android.app.Activity, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }

    private final synchronized int zzl() {
        int i;
        synchronized (this) {
            if (zzbw == zzc.zzbx) {
                Context applicationContext = getApplicationContext();
                C0189GoogleApiAvailability instance = C0189GoogleApiAvailability.getInstance();
                C0189GoogleApiAvailability googleApiAvailability = instance;
                int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(applicationContext, 12451000);
                int i2 = isGooglePlayServicesAvailable;
                if (isGooglePlayServicesAvailable == 0) {
                    zzbw = zzc.zzca;
                } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, i2, (String) null) != null || C0677DynamiteModule.getLocalVersion(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
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
        switch (C0164zzc.zzbu[zzl() - 1]) {
            case 1:
                return C0143zzi.zzd(applicationContext, (C0125GoogleSignInOptions) getApiOptions());
            case 2:
                return C0143zzi.zzc(applicationContext, (C0125GoogleSignInOptions) getApiOptions());
            default:
                return C0143zzi.zze(applicationContext, (C0125GoogleSignInOptions) getApiOptions());
        }
    }

    public Task<C0122GoogleSignInAccount> silentSignIn() {
        return C0445PendingResultUtil.toTask(C0143zzi.zzc(asGoogleApiClient(), getApplicationContext(), (C0125GoogleSignInOptions) getApiOptions(), zzl() == zzc.zzbz), zzbv);
    }

    public Task<Void> signOut() {
        return C0445PendingResultUtil.toVoidTask(C0143zzi.zzc(asGoogleApiClient(), getApplicationContext(), zzl() == zzc.zzbz));
    }

    public Task<Void> revokeAccess() {
        return C0445PendingResultUtil.toVoidTask(C0143zzi.zzd(asGoogleApiClient(), getApplicationContext(), zzl() == zzc.zzbz));
    }

    static {
        zzd zzd2;
        new zzd((C0164zzc) null);
        zzbv = zzd2;
    }
}
