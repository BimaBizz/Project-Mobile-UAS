package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.logging.Logger;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzi {
    private static Logger zzci;

    public static Intent zzc(Context context, GoogleSignInOptions googleSignInOptions) {
        Parcelable parcelable;
        Intent intent;
        Bundle bundle;
        Context context2 = context;
        zzci.d("getSignInIntent()", new Object[0]);
        new SignInConfiguration(context2.getPackageName(), googleSignInOptions);
        Parcelable parcelable2 = parcelable;
        new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        Intent intent2 = intent;
        Intent intent3 = intent2;
        Intent intent4 = intent2.setPackage(context2.getPackageName());
        Intent intent5 = intent3.setClass(context2, SignInHubActivity.class);
        new Bundle();
        Bundle bundle2 = bundle;
        bundle2.putParcelable("config", parcelable2);
        Intent putExtra = intent3.putExtra("config", bundle2);
        return intent3;
    }

    public static Intent zzd(Context context, GoogleSignInOptions googleSignInOptions) {
        zzci.d("getFallbackSignInIntent()", new Object[0]);
        Intent zzc = zzc(context, googleSignInOptions);
        Intent action = zzc.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return zzc;
    }

    public static Intent zze(Context context, GoogleSignInOptions googleSignInOptions) {
        zzci.d("getNoImplementationSignInIntent()", new Object[0]);
        Intent zzc = zzc(context, googleSignInOptions);
        Intent action = zzc.setAction("com.google.android.gms.auth.NO_IMPL");
        return zzc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> zzc(com.google.android.gms.common.api.GoogleApiClient r20, android.content.Context r21, com.google.android.gms.auth.api.signin.GoogleSignInOptions r22, boolean r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            com.google.android.gms.common.logging.Logger r13 = zzci
            java.lang.String r14 = "silentSignIn()"
            r15 = 0
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r13.d(r14, r15)
            r13 = r1
            r14 = r2
            r6 = r14
            r5 = r13
            com.google.android.gms.common.logging.Logger r13 = zzci
            java.lang.String r14 = "getEligibleSavedSignInResult()"
            r15 = 0
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r13.d(r14, r15)
            r13 = r6
            java.lang.Object r13 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            r13 = r5
            com.google.android.gms.auth.api.signin.internal.zzq r13 = com.google.android.gms.auth.api.signin.internal.zzq.zzd(r13)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r13 = r13.zzs()
            r19 = r13
            r13 = r19
            r14 = r19
            r7 = r14
            if (r13 == 0) goto L_0x00f0
            r13 = r7
            android.accounts.Account r13 = r13.getAccount()
            r14 = r6
            android.accounts.Account r14 = r14.getAccount()
            r12 = r14
            r19 = r13
            r13 = r19
            r14 = r19
            r11 = r14
            if (r13 != 0) goto L_0x00e8
            r13 = r12
            if (r13 != 0) goto L_0x00e5
            r13 = 1
        L_0x0051:
            if (r13 == 0) goto L_0x00f0
            r13 = r6
            boolean r13 = r13.isServerAuthCodeRequested()
            if (r13 != 0) goto L_0x00f0
            r13 = r6
            boolean r13 = r13.isIdTokenRequested()
            if (r13 == 0) goto L_0x0078
            r13 = r7
            boolean r13 = r13.isIdTokenRequested()
            if (r13 == 0) goto L_0x00f0
            r13 = r6
            java.lang.String r13 = r13.getServerClientId()
            r14 = r7
            java.lang.String r14 = r14.getServerClientId()
            boolean r13 = com.google.android.gms.common.internal.Objects.equal(r13, r14)
            if (r13 == 0) goto L_0x00f0
        L_0x0078:
            java.util.HashSet r13 = new java.util.HashSet
            r19 = r13
            r13 = r19
            r14 = r19
            r15 = r7
            java.util.ArrayList r15 = r15.getScopes()
            r14.<init>(r15)
            r8 = r13
            java.util.HashSet r13 = new java.util.HashSet
            r19 = r13
            r13 = r19
            r14 = r19
            r15 = r6
            java.util.ArrayList r15 = r15.getScopes()
            r14.<init>(r15)
            r9 = r13
            r13 = r8
            r14 = r9
            boolean r13 = r13.containsAll(r14)
            if (r13 == 0) goto L_0x00f0
            r13 = r5
            com.google.android.gms.auth.api.signin.internal.zzq r13 = com.google.android.gms.auth.api.signin.internal.zzq.zzd(r13)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r13 = r13.zzr()
            r19 = r13
            r13 = r19
            r14 = r19
            r10 = r14
            if (r13 == 0) goto L_0x00f0
            r13 = r10
            boolean r13 = r13.isExpired()
            if (r13 != 0) goto L_0x00f0
            com.google.android.gms.auth.api.signin.GoogleSignInResult r13 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            r19 = r13
            r13 = r19
            r14 = r19
            r15 = r10
            com.google.android.gms.common.api.Status r16 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r14.<init>(r15, r16)
        L_0x00c9:
            r19 = r13
            r13 = r19
            r14 = r19
            r4 = r14
            if (r13 == 0) goto L_0x00f2
            com.google.android.gms.common.logging.Logger r13 = zzci
            java.lang.String r14 = "Eligible saved sign in result found"
            r15 = 0
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r13.d(r14, r15)
            r13 = r4
            r14 = r0
            com.google.android.gms.common.api.OptionalPendingResult r13 = com.google.android.gms.common.api.PendingResults.immediatePendingResult(r13, (com.google.android.gms.common.api.GoogleApiClient) r14)
            r0 = r13
        L_0x00e4:
            return r0
        L_0x00e5:
            r13 = 0
            goto L_0x0051
        L_0x00e8:
            r13 = r11
            r14 = r12
            boolean r13 = r13.equals(r14)
            goto L_0x0051
        L_0x00f0:
            r13 = 0
            goto L_0x00c9
        L_0x00f2:
            r13 = r3
            if (r13 == 0) goto L_0x0115
            com.google.android.gms.auth.api.signin.GoogleSignInResult r13 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            r19 = r13
            r13 = r19
            r14 = r19
            r15 = 0
            com.google.android.gms.common.api.Status r16 = new com.google.android.gms.common.api.Status
            r19 = r16
            r16 = r19
            r17 = r19
            r18 = 4
            r17.<init>(r18)
            r14.<init>(r15, r16)
            r14 = r0
            com.google.android.gms.common.api.OptionalPendingResult r13 = com.google.android.gms.common.api.PendingResults.immediatePendingResult(r13, (com.google.android.gms.common.api.GoogleApiClient) r14)
            r0 = r13
            goto L_0x00e4
        L_0x0115:
            r13 = r0
            r14 = r1
            r15 = r2
            r7 = r15
            r6 = r14
            r5 = r13
            com.google.android.gms.common.logging.Logger r13 = zzci
            java.lang.String r14 = "trySilentSignIn()"
            r15 = 0
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r13.d(r14, r15)
            r13 = r5
            com.google.android.gms.auth.api.signin.internal.zzh r14 = new com.google.android.gms.auth.api.signin.internal.zzh
            r19 = r14
            r14 = r19
            r15 = r19
            r16 = r5
            r17 = r6
            r18 = r7
            r15.<init>(r16, r17, r18)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r13 = r13.enqueue(r14)
            r8 = r13
            com.google.android.gms.common.api.internal.OptionalPendingResultImpl r13 = new com.google.android.gms.common.api.internal.OptionalPendingResultImpl
            r19 = r13
            r13 = r19
            r14 = r19
            r15 = r8
            r14.<init>(r15)
            r0 = r13
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.zzi.zzc(com.google.android.gms.common.api.GoogleApiClient, android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions, boolean):com.google.android.gms.common.api.OptionalPendingResult");
    }

    public static PendingResult<Status> zzc(GoogleApiClient googleApiClient, Context context, boolean z) {
        BaseImplementation.ApiMethodImpl apiMethodImpl;
        GoogleApiClient googleApiClient2 = googleApiClient;
        zzci.d("Signing out", new Object[0]);
        zzc(context);
        if (z) {
            return PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, googleApiClient2);
        }
        new zzj(googleApiClient2);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public static PendingResult<Status> zzd(GoogleApiClient googleApiClient, Context context, boolean z) {
        BaseImplementation.ApiMethodImpl apiMethodImpl;
        GoogleApiClient googleApiClient2 = googleApiClient;
        Context context2 = context;
        zzci.d("Revoking access", new Object[0]);
        String savedRefreshToken = Storage.getInstance(context2).getSavedRefreshToken();
        zzc(context2);
        if (z) {
            return zze.zzi(savedRefreshToken);
        }
        new zzl(googleApiClient2);
        return googleApiClient2.execute(apiMethodImpl);
    }

    private static void zzc(Context context) {
        zzq.zzd(context).clear();
        for (GoogleApiClient maybeSignOut : GoogleApiClient.getAllClients()) {
            maybeSignOut.maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }

    @Nullable
    public static GoogleSignInResult getSignInResultFromIntent(@Nullable Intent intent) {
        GoogleSignInResult googleSignInResult;
        GoogleSignInResult googleSignInResult2;
        Intent intent2 = intent;
        if (intent2 == null) {
            new GoogleSignInResult((GoogleSignInAccount) null, Status.RESULT_INTERNAL_ERROR);
            return googleSignInResult2;
        }
        Status status = (Status) intent2.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent2.getParcelableExtra("googleSignInAccount");
        GoogleSignInAccount googleSignInAccount2 = googleSignInAccount;
        if (googleSignInAccount == null) {
            GoogleSignInResult googleSignInResult3 = r7;
            GoogleSignInResult googleSignInResult4 = new GoogleSignInResult((GoogleSignInAccount) null, status == null ? Status.RESULT_INTERNAL_ERROR : status);
            return googleSignInResult3;
        }
        new GoogleSignInResult(googleSignInAccount2, Status.RESULT_SUCCESS);
        return googleSignInResult;
    }

    static {
        Logger logger;
        new Logger("GoogleSignInCommon", new String[0]);
        zzci = logger;
    }
}
