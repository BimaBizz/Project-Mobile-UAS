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
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zae;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class SignInClientImpl extends GmsClient<zaf> implements zae {
    public static final /* synthetic */ int zaa = 0;
    private final boolean zab = true;
    private final ClientSettings zac;
    private final Bundle zad;
    @Nullable
    private final Integer zae;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SignInClientImpl(@androidx.annotation.RecentlyNonNull android.content.Context r16, @androidx.annotation.RecentlyNonNull android.os.Looper r17, boolean r18, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.ClientSettings r19, @androidx.annotation.RecentlyNonNull android.os.Bundle r20, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r21, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r22) {
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
            r8.<init>((android.content.Context) r9, (android.os.Looper) r10, (int) r11, (com.google.android.gms.common.internal.ClientSettings) r12, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r13, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r14)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.SignInClientImpl.<init>(android.content.Context, android.os.Looper, boolean, com.google.android.gms.common.internal.ClientSettings, android.os.Bundle, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener):void");
    }

    @RecentlyNonNull
    @KeepForSdk
    public static Bundle createBundleFromClientSettings(@RecentlyNonNull ClientSettings clientSettings) {
        Bundle bundle;
        ClientSettings clientSettings2 = clientSettings;
        SignInOptions zac2 = clientSettings2.zac();
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
        zaf zaf;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            zaf = null;
        } else {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            if (queryLocalInterface instanceof zaf) {
                zaf = (zaf) queryLocalInterface;
            } else {
                new zaf(iBinder2);
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

    public final void zaa(zae zae2) {
        zak zak;
        ConnectionResult connectionResult;
        GoogleSignInAccount googleSignInAccount;
        zat zat;
        zai zai;
        zae zae3 = zae2;
        Object checkNotNull = Preconditions.checkNotNull(zae3, "Expecting a valid ISignInCallbacks");
        try {
            Account accountOrDefault = this.zac.getAccountOrDefault();
            if ("<<default account>>".equals(accountOrDefault.name)) {
                googleSignInAccount = Storage.getInstance(getContext()).getSavedDefaultGoogleSignInAccount();
            } else {
                googleSignInAccount = null;
            }
            new zat(accountOrDefault, ((Integer) Preconditions.checkNotNull(this.zae)).intValue(), googleSignInAccount);
            zaf zaf = (zaf) getService();
            new zai(1, zat);
            zaf.zag(zai, zae3);
        } catch (RemoteException e) {
            RemoteException remoteException = e;
            int w = Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                new ConnectionResult(8, (PendingIntent) null);
                new zak(1, connectionResult, (zav) null);
                zae3.zab(zak);
            } catch (RemoteException e2) {
                int wtf = Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", remoteException);
            }
        }
    }

    public final void zab(@RecentlyNonNull IAccountAccessor iAccountAccessor, boolean z) {
        IAccountAccessor iAccountAccessor2 = iAccountAccessor;
        boolean z2 = z;
        try {
            ((zaf) getService()).zaf(iAccountAccessor2, ((Integer) Preconditions.checkNotNull(this.zae)).intValue(), z2);
        } catch (RemoteException e) {
            int w = Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void zac() {
        try {
            ((zaf) getService()).zae(((Integer) Preconditions.checkNotNull(this.zae)).intValue());
        } catch (RemoteException e) {
            int w = Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void zad() {
        BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks;
        new BaseGmsClient.LegacyClientCallbackAdapter(this);
        connect(connectionProgressReportCallbacks);
    }
}
