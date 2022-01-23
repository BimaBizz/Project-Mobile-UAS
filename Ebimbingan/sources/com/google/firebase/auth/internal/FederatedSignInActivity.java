package com.google.firebase.auth.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.common.annotation.C0209KeepName;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.safeparcel.C0464SafeParcelableSerializer;
import com.google.android.gms.common.util.C0597DefaultClock;
import com.google.android.gms.internal.firebase_auth.zzfm;
import com.google.android.gms.internal.firebase_auth.zzj;
import com.google.firebase.FirebaseError;

@C0209KeepName
public class FederatedSignInActivity extends FragmentActivity {
    private static Handler handler;
    private static final zzak zziu = zzak.zzfn();
    private static long zzuj = 0;
    private static Runnable zzul;
    private boolean zzuk = false;

    public FederatedSignInActivity() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.SIGN_IN".equals(action) || "com.google.firebase.auth.internal.LINK".equals(action) || "com.google.firebase.auth.internal.REAUTHENTICATE".equals(action)) {
            long currentTimeMillis = C0597DefaultClock.getInstance().currentTimeMillis();
            long j = currentTimeMillis;
            if (currentTimeMillis - zzuj < 30000) {
                int e = Log.e("IdpSignInActivity", "Could not start operation - already in progress");
                return;
            }
            zzuj = j;
            if (bundle2 != null) {
                Bundle bundle3 = bundle2;
                Bundle bundle4 = bundle3;
                this.zzuk = bundle3.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                return;
            }
            return;
        }
        String valueOf = String.valueOf(action);
        String str3 = valueOf;
        if (valueOf.length() != 0) {
            str2 = "Could not do operation - unknown action: ".concat(str3);
        } else {
            str2 = str;
            new String("Could not do operation - unknown action: ");
        }
        int e2 = Log.e("IdpSignInActivity", str2);
        zzfm();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onSaveInstanceState(bundle2);
        bundle2.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.zzuk);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        boolean z;
        Intent intent;
        Runnable runnable;
        Handler handler2;
        Intent intent2;
        C0236Status status;
        super.onResume();
        Intent intent3 = getIntent();
        if ("com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED".equals(intent3.getAction())) {
            int e = Log.e("IdpSignInActivity", "Web sign-in failed, finishing");
            z = true;
            if (zzaw.zzb(intent3)) {
                zze(zzaw.zzc(intent3));
            } else {
                zzfm();
            }
        } else if (!intent3.hasExtra("com.google.firebase.auth.internal.OPERATION") || !intent3.hasExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST")) {
            z = false;
        } else {
            String stringExtra = intent3.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.SIGN_IN".equals(stringExtra) || "com.google.firebase.auth.internal.LINK".equals(stringExtra) || "com.google.firebase.auth.internal.REAUTHENTICATE".equals(stringExtra)) {
                z = true;
                zzfm zzfm = (zzfm) C0464SafeParcelableSerializer.deserializeFromIntentExtra(intent3, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzfm.CREATOR);
                String stringExtra2 = intent3.getStringExtra("com.google.firebase.auth.internal.EXTRA_TENANT_ID");
                zzfm zzcz = zzfm.zzcz(stringExtra2);
                String str = stringExtra2;
                zzfm zzfm2 = zzfm;
                String str2 = stringExtra;
                zzuj = 0;
                this.zzuk = false;
                new Intent();
                Intent intent4 = intent;
                C0464SafeParcelableSerializer.serializeToIntentExtra(zzfm2, intent4, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                Intent putExtra = intent4.putExtra("com.google.firebase.auth.internal.OPERATION", str2);
                Intent action = intent4.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent4)) {
                    Context applicationContext = getApplicationContext();
                    Context context = applicationContext;
                    zzaq.zza(applicationContext, zzfm2, str2, str);
                } else {
                    zziu.zza(this);
                }
                finish();
            } else {
                z = false;
            }
        }
        if (!z) {
            if (!this.zzuk) {
                new Intent("com.google.firebase.auth.api.gms.ui.START_WEB_SIGN_IN");
                Intent intent5 = intent2;
                Intent intent6 = intent5;
                Intent intent7 = intent5.setPackage("com.google.android.gms");
                Intent putExtras = intent6.putExtras(getIntent().getExtras());
                Intent putExtra2 = intent6.putExtra("com.google.firebase.auth.internal.OPERATION", getIntent().getAction());
                try {
                    startActivityForResult(intent6, 40963);
                } catch (ActivityNotFoundException e2) {
                    String str3 = "Could not launch web sign-in Intent. Google Play service is unavailable";
                    int w = Log.w("IdpSignInActivity", str3);
                    new C0236Status((int) FirebaseError.ERROR_INTERNAL_ERROR, str3);
                    zze(status);
                }
                this.zzuk = true;
                return;
            }
            new zzaj(this);
            zzul = runnable;
            if (handler == null) {
                new zzj();
                handler = handler2;
            }
            boolean postDelayed = handler.postDelayed(zzul, 800);
        }
    }

    public void onNewIntent(Intent intent) {
        Intent intent2 = intent;
        super.onNewIntent(intent2);
        if (!(handler == null || zzul == null)) {
            handler.removeCallbacks(zzul);
            zzul = null;
        }
        setIntent(intent2);
    }

    /* access modifiers changed from: private */
    public final void zzfm() {
        Intent intent;
        zzuj = 0;
        this.zzuk = false;
        new Intent();
        Intent intent2 = intent;
        Intent intent3 = intent2;
        Intent putExtra = intent2.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        Intent action = intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent3)) {
            zzaq.zza((Context) this, zzt.zzdc("WEB_CONTEXT_CANCELED"));
        } else {
            zziu.zza(this);
        }
        finish();
    }

    private final void zze(C0236Status status) {
        Intent intent;
        C0236Status status2 = status;
        zzuj = 0;
        this.zzuk = false;
        new Intent();
        Intent intent2 = intent;
        Intent intent3 = intent2;
        zzaw.zza(intent2, status2);
        Intent action = intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent3)) {
            Context applicationContext = getApplicationContext();
            Context context = applicationContext;
            zzaq.zza(applicationContext, status2);
        } else {
            zziu.zza(this);
        }
        finish();
    }

    static /* synthetic */ Runnable zza(Runnable runnable) {
        Runnable runnable2 = runnable;
        zzul = null;
        return null;
    }
}
