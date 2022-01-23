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
import com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.C0130SignInAccount;
import com.google.android.gms.common.annotation.C0209KeepName;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.internal.p001authapi.C0750zzaz;

@C0209KeepName
/* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C0134SignInHubActivity extends FragmentActivity {
    private static boolean zzcw = false;
    private boolean zzcx = false;
    private C0133SignInConfiguration zzcy;
    private boolean zzcz;
    /* access modifiers changed from: private */
    public int zzda;
    /* access modifiers changed from: private */
    public Intent zzdb;

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$zzc */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    private class zzc implements LoaderManager.LoaderCallbacks<Void> {
        private final /* synthetic */ C0134SignInHubActivity zzdk;

        private zzc(C0134SignInHubActivity signInHubActivity) {
            this.zzdk = signInHubActivity;
        }

        public final Loader<Void> onCreateLoader(int i, Bundle bundle) {
            Loader<Void> loader;
            int i2 = i;
            Bundle bundle2 = bundle;
            new C0138zzd(this.zzdk, C0222GoogleApiClient.getAllClients());
            return loader;
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
        /* synthetic */ zzc(C0134SignInHubActivity signInHubActivity, C0159zzy zzy) {
            this(signInHubActivity);
            C0159zzy zzy2 = zzy;
        }
    }

    public C0134SignInHubActivity() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        Intent intent;
        String str;
        String str2;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        Intent intent2 = getIntent();
        Intent intent3 = intent2;
        String str3 = (String) C0750zzaz.checkNotNull(intent2.getAction());
        if ("com.google.android.gms.auth.NO_IMPL".equals(str3)) {
            zzc(12500);
        } else if (str3.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || str3.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            C0133SignInConfiguration signInConfiguration = (C0133SignInConfiguration) ((Bundle) C0750zzaz.checkNotNull(intent3.getBundleExtra("config"))).getParcelable("config");
            C0133SignInConfiguration signInConfiguration2 = signInConfiguration;
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
                    this.zzdb = (Intent) C0750zzaz.checkNotNull((Intent) bundle2.getParcelable("signInResultData"));
                    zzv();
                }
            } else if (zzcw) {
                setResult(0);
                zzc(12502);
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
        super.onSaveInstanceState(bundle2);
        bundle2.putBoolean("signingInGoogleApiClients", this.zzcz);
        if (this.zzcz) {
            bundle2.putInt("signInResultCode", this.zzda);
            bundle2.putParcelable("signInResultData", this.zzdb);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (!this.zzcx) {
            setResult(0);
            switch (i3) {
                case 40962:
                    Intent intent3 = intent2;
                    if (intent3 != null) {
                        C0130SignInAccount signInAccount = (C0130SignInAccount) intent3.getParcelableExtra("signInAccount");
                        C0130SignInAccount signInAccount2 = signInAccount;
                        if (signInAccount != null && signInAccount2.getGoogleSignInAccount() != null) {
                            C0122GoogleSignInAccount googleSignInAccount = signInAccount2.getGoogleSignInAccount();
                            C0151zzq.zzd(this).zzc(this.zzcy.zzu(), (C0122GoogleSignInAccount) C0750zzaz.checkNotNull(googleSignInAccount));
                            intent3.removeExtra("signInAccount");
                            Intent putExtra = intent3.putExtra("googleSignInAccount", googleSignInAccount);
                            this.zzcz = true;
                            this.zzda = i4;
                            this.zzdb = intent3;
                            zzv();
                            return;
                        } else if (intent3.hasExtra("errorCode")) {
                            int intExtra = intent3.getIntExtra("errorCode", 8);
                            int i5 = intExtra;
                            if (intExtra == 13) {
                                i5 = 12501;
                            }
                            zzc(i5);
                            return;
                        }
                    }
                    zzc(8);
                    return;
                default:
                    return;
            }
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent accessibilityEvent2 = accessibilityEvent;
        return true;
    }

    private final void zzv() {
        LoaderManager.LoaderCallbacks loaderCallbacks;
        new zzc(this, (C0159zzy) null);
        Loader initLoader = getSupportLoaderManager().initLoader(0, (Bundle) null, loaderCallbacks);
        zzcw = false;
    }

    private final void zzc(int i) {
        Parcelable parcelable;
        Intent intent;
        new C0236Status(i);
        Parcelable parcelable2 = parcelable;
        new Intent();
        Intent intent2 = intent;
        Intent putExtra = intent2.putExtra("googleSignInStatus", parcelable2);
        setResult(0, intent2);
        finish();
        zzcw = false;
    }
}
