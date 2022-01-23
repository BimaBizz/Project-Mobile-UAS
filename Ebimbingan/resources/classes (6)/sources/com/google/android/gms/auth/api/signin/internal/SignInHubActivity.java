package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001authapi.zzaz;

@KeepName
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SignInHubActivity extends FragmentActivity {
    private static boolean zzcw = false;
    private boolean zzcx = false;
    private SignInConfiguration zzcy;
    private boolean zzcz;
    /* access modifiers changed from: private */
    public int zzda;
    /* access modifiers changed from: private */
    public Intent zzdb;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    private class zzc implements LoaderManager.LoaderCallbacks<Void> {
        private final /* synthetic */ SignInHubActivity zzdk;

        private zzc(SignInHubActivity signInHubActivity) {
            this.zzdk = signInHubActivity;
        }

        /* JADX WARNING: type inference failed for: r5v1, types: [android.content.Context, com.google.android.gms.auth.api.signin.internal.SignInHubActivity] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.loader.content.Loader<java.lang.Void> onCreateLoader(int r9, android.os.Bundle r10) {
            /*
                r8 = this;
                r0 = r8
                r1 = r9
                r2 = r10
                com.google.android.gms.auth.api.signin.internal.zzd r3 = new com.google.android.gms.auth.api.signin.internal.zzd
                r7 = r3
                r3 = r7
                r4 = r7
                r5 = r0
                com.google.android.gms.auth.api.signin.internal.SignInHubActivity r5 = r5.zzdk
                java.util.Set r6 = com.google.android.gms.common.api.GoogleApiClient.getAllClients()
                r4.<init>(r5, r6)
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zzc.onCreateLoader(int, android.os.Bundle):androidx.loader.content.Loader");
        }

        public final void onLoaderReset(Loader<Void> loader) {
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Loader loader2 = loader;
            Void voidR = (Void) obj;
            this.zzdk.setResult(this.zzdk.zzda, this.zzdk.zzdb);
            this.zzdk.finish();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zzc(SignInHubActivity signInHubActivity, zzy zzy) {
            this(signInHubActivity);
            zzy zzy2 = zzy;
        }
    }

    public SignInHubActivity() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        Intent intent;
        String str;
        String str2;
        Bundle bundle2 = bundle;
        SignInHubActivity.super.onCreate(bundle2);
        Intent intent2 = getIntent();
        Intent intent3 = intent2;
        String str3 = (String) zzaz.checkNotNull(intent2.getAction());
        if ("com.google.android.gms.auth.NO_IMPL".equals(str3)) {
            zzc((int) GoogleSignInStatusCodes.SIGN_IN_FAILED);
        } else if (str3.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || str3.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) ((Bundle) zzaz.checkNotNull(intent3.getBundleExtra("config"))).getParcelable("config");
            SignInConfiguration signInConfiguration2 = signInConfiguration;
            if (signInConfiguration == null) {
                int e = Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.zzcy = signInConfiguration2;
            if (bundle2 != null) {
                this.zzcz = bundle2.getBoolean("signingInGoogleApiClients");
                if (this.zzcz) {
                    this.zzda = bundle2.getInt("signInResultCode");
                    this.zzdb = (Intent) zzaz.checkNotNull((Intent) bundle2.getParcelable("signInResultData"));
                    zzv();
                }
            } else if (zzcw) {
                setResult(0);
                zzc((int) GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
            } else {
                zzcw = true;
                String str4 = str3;
                new Intent(str4);
                Intent intent4 = intent;
                if (str4.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    Intent intent5 = intent4.setPackage("com.google.android.gms");
                } else {
                    Intent intent6 = intent4.setPackage(getPackageName());
                }
                Intent putExtra = intent4.putExtra("config", this.zzcy);
                try {
                    startActivityForResult(intent4, 40962);
                } catch (ActivityNotFoundException e2) {
                    this.zzcx = true;
                    int w = Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    zzc(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent3.getAction());
            String str5 = valueOf;
            if (valueOf.length() != 0) {
                str2 = "Unknown action: ".concat(str5);
            } else {
                str2 = str;
                new String("Unknown action: ");
            }
            int e3 = Log.e("AuthSignInClient", str2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        SignInHubActivity.super.onSaveInstanceState(bundle2);
        bundle2.putBoolean("signingInGoogleApiClients", this.zzcz);
        if (this.zzcz) {
            bundle2.putInt("signInResultCode", this.zzda);
            bundle2.putParcelable("signInResultData", this.zzdb);
        }
    }

    /* JADX WARNING: type inference failed for: r8v22, types: [android.content.Context] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r13, int r14, @androidx.annotation.Nullable android.content.Intent r15) {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r8 = r0
            boolean r8 = r8.zzcx
            if (r8 == 0) goto L_0x000a
        L_0x0009:
            return
        L_0x000a:
            r8 = r0
            r9 = 0
            r8.setResult(r9)
            r8 = r1
            switch(r8) {
                case 40962: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0009
        L_0x0014:
            r8 = r0
            r9 = r3
            r5 = r9
            r4 = r8
            r8 = r5
            if (r8 == 0) goto L_0x0095
            r8 = r5
            java.lang.String r9 = "signInAccount"
            android.os.Parcelable r8 = r8.getParcelableExtra(r9)
            com.google.android.gms.auth.api.signin.SignInAccount r8 = (com.google.android.gms.auth.api.signin.SignInAccount) r8
            r11 = r8
            r8 = r11
            r9 = r11
            r6 = r9
            if (r8 == 0) goto L_0x006f
            r8 = r6
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r8 = r8.getGoogleSignInAccount()
            if (r8 == 0) goto L_0x006f
            r8 = r6
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r8 = r8.getGoogleSignInAccount()
            r7 = r8
            r8 = r4
            com.google.android.gms.auth.api.signin.internal.zzq r8 = com.google.android.gms.auth.api.signin.internal.zzq.zzd(r8)
            r9 = r4
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration r9 = r9.zzcy
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r9 = r9.zzu()
            r10 = r7
            java.lang.Object r10 = com.google.android.gms.internal.p001authapi.zzaz.checkNotNull(r10)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r10 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r10
            r8.zzc(r9, r10)
            r8 = r5
            java.lang.String r9 = "signInAccount"
            r8.removeExtra(r9)
            r8 = r5
            java.lang.String r9 = "googleSignInAccount"
            r10 = r7
            android.content.Intent r8 = r8.putExtra(r9, r10)
            r8 = r4
            r9 = 1
            r8.zzcz = r9
            r8 = r4
            r9 = r2
            r8.zzda = r9
            r8 = r4
            r9 = r5
            r8.zzdb = r9
            r8 = r4
            r8.zzv()
            goto L_0x0009
        L_0x006f:
            r8 = r5
            java.lang.String r9 = "errorCode"
            boolean r8 = r8.hasExtra(r9)
            if (r8 == 0) goto L_0x0095
            r8 = r5
            java.lang.String r9 = "errorCode"
            r10 = 8
            int r8 = r8.getIntExtra(r9, r10)
            r11 = r8
            r8 = r11
            r9 = r11
            r7 = r9
            r9 = 13
            if (r8 != r9) goto L_0x008e
            r8 = 12501(0x30d5, float:1.7518E-41)
            r7 = r8
        L_0x008e:
            r8 = r4
            r9 = r7
            r8.zzc((int) r9)
            goto L_0x0009
        L_0x0095:
            r8 = r4
            r9 = 8
            r8.zzc((int) r9)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInHubActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent accessibilityEvent2 = accessibilityEvent;
        return true;
    }

    private final void zzv() {
        LoaderManager.LoaderCallbacks loaderCallbacks;
        new zzc(this, (zzy) null);
        Loader initLoader = getSupportLoaderManager().initLoader(0, (Bundle) null, loaderCallbacks);
        zzcw = false;
    }

    private final void zzc(int i) {
        Parcelable parcelable;
        Intent intent;
        new Status(i);
        Parcelable parcelable2 = parcelable;
        new Intent();
        Intent intent2 = intent;
        Intent putExtra = intent2.putExtra("googleSignInStatus", parcelable2);
        setResult(0, intent2);
        finish();
        zzcw = false;
    }
}
