package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C0135Storage;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0424BaseGmsClient;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0433GmsClient;
import com.google.android.gms.common.internal.C0437IAccountAccessor;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0504zat;
import com.google.android.gms.common.internal.C0506zav;
import com.google.android.gms.signin.C1134SignInOptions;
import com.google.android.gms.signin.C1152zae;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.signin.internal.SignInClientImpl */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C1135SignInClientImpl extends C0433GmsClient<C1141zaf> implements C1152zae {
    public static final /* synthetic */ int zaa = 0;
    private final boolean zab = true;
    private final C0427ClientSettings zac;
    private final Bundle zad;
    @Nullable
    private final Integer zae;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1135SignInClientImpl(@androidx.annotation.RecentlyNonNull android.content.Context r16, @androidx.annotation.RecentlyNonNull android.os.Looper r17, boolean r18, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.C0427ClientSettings r19, @androidx.annotation.RecentlyNonNull android.os.Bundle r20, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.C0222GoogleApiClient.ConnectionCallbacks r21, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.C0222GoogleApiClient.OnConnectionFailedListener r22) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r0
            r9 = r1
            r10 = r2
            r11 = 44
            r12 = r4
            r13 = r6
            r14 = r7
            r8.<init>((android.content.Context) r9, (android.os.Looper) r10, (int) r11, (com.google.android.gms.common.internal.C0427ClientSettings) r12, (com.google.android.gms.common.api.C0222GoogleApiClient.ConnectionCallbacks) r13, (com.google.android.gms.common.api.C0222GoogleApiClient.OnConnectionFailedListener) r14)
            r8 = r0
            r9 = 1
            r8.zab = r9
            r8 = r0
            r9 = r4
            r8.zac = r9
            r8 = r0
            r9 = r5
            r8.zad = r9
            r8 = r0
            r9 = r4
            java.lang.Integer r9 = r9.zad()
            r8.zae = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.C1135SignInClientImpl.<init>(android.content.Context, android.os.Looper, boolean, com.google.android.gms.common.internal.ClientSettings, android.os.Bundle, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener):void");
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static Bundle createBundleFromClientSettings(@RecentlyNonNull C0427ClientSettings clientSettings) {
        Bundle bundle;
        C0427ClientSettings clientSettings2 = clientSettings;
        C1134SignInOptions zac2 = clientSettings2.zac();
        Integer zad2 = clientSettings2.zad();
        new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings2.getAccount());
        if (zad2 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", zad2.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(@RecentlyNonNull IBinder iBinder) {
        C1141zaf zaf;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            zaf = null;
        } else {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            if (queryLocalInterface instanceof C1141zaf) {
                zaf = (C1141zaf) queryLocalInterface;
            } else {
                new C1141zaf(iBinder2);
            }
        }
        return zaf;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.zac.getRealClientPackageName())) {
            this.zad.putString("com.google.android.gms.signin.internal.realClientPackageName", this.zac.getRealClientPackageName());
        }
        return this.zad;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean requiresSignIn() {
        return this.zab;
    }

    public final void zaa(C1140zae zae2) {
        C1146zak zak;
        C0184ConnectionResult connectionResult;
        C0122GoogleSignInAccount googleSignInAccount;
        C0504zat zat;
        C1144zai zai;
        C1140zae zae3 = zae2;
        Object checkNotNull = C0446Preconditions.checkNotNull(zae3, "Expecting a valid ISignInCallbacks");
        try {
            Account accountOrDefault = this.zac.getAccountOrDefault();
            if ("<<default account>>".equals(accountOrDefault.name)) {
                googleSignInAccount = C0135Storage.getInstance(getContext()).getSavedDefaultGoogleSignInAccount();
            } else {
                googleSignInAccount = null;
            }
            new C0504zat(accountOrDefault, ((Integer) C0446Preconditions.checkNotNull(this.zae)).intValue(), googleSignInAccount);
            C1141zaf zaf = (C1141zaf) getService();
            new C1144zai(1, zat);
            zaf.zag(zai, zae3);
        } catch (RemoteException e) {
            RemoteException remoteException = e;
            int w = Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                new C0184ConnectionResult(8, (PendingIntent) null);
                new C1146zak(1, connectionResult, (C0506zav) null);
                zae3.zab(zak);
            } catch (RemoteException e2) {
                int wtf = Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", remoteException);
            }
        }
    }

    public final void zab(@RecentlyNonNull C0437IAccountAccessor iAccountAccessor, boolean z) {
        C0437IAccountAccessor iAccountAccessor2 = iAccountAccessor;
        boolean z2 = z;
        try {
            ((C1141zaf) getService()).zaf(iAccountAccessor2, ((Integer) C0446Preconditions.checkNotNull(this.zae)).intValue(), z2);
        } catch (RemoteException e) {
            int w = Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void zac() {
        try {
            ((C1141zaf) getService()).zae(((Integer) C0446Preconditions.checkNotNull(this.zae)).intValue());
        } catch (RemoteException e) {
            int w = Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void zad() {
        C0424BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks;
        new C0424BaseGmsClient.LegacyClientCallbackAdapter(this);
        connect(connectionProgressReportCallbacks);
    }
}
