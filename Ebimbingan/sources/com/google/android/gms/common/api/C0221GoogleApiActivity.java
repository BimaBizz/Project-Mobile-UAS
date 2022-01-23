package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.C0189GoogleApiAvailability;
import com.google.android.gms.common.annotation.C0209KeepName;
import com.google.android.gms.common.api.internal.C0248GoogleApiManager;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;

@C0209KeepName
/* renamed from: com.google.android.gms.common.api.GoogleApiActivity */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0221GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    @C0617VisibleForTesting
    protected int zaa = 0;

    public C0221GoogleApiActivity() {
    }

    @RecentlyNonNull
    public static Intent zaa(@RecentlyNonNull Context context, @RecentlyNonNull PendingIntent pendingIntent, int i, boolean z) {
        Intent intent;
        new Intent(context, C0221GoogleApiActivity.class);
        Intent putExtra = intent.putExtra("pending_intent", pendingIntent);
        Intent putExtra2 = intent.putExtra("failing_client_id", i);
        Intent putExtra3 = intent.putExtra("notify_manager", z);
        return intent;
    }

    private final void zab() {
        StringBuilder sb;
        C0184ConnectionResult connectionResult;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            int e = Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            int e2 = Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
        } else if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                this.zaa = 1;
            } catch (ActivityNotFoundException e3) {
                ActivityNotFoundException activityNotFoundException = e3;
                if (extras.getBoolean("notify_manager", true)) {
                    C0248GoogleApiManager zaa2 = C0248GoogleApiManager.zaa(this);
                    new C0184ConnectionResult(22, (PendingIntent) null);
                    zaa2.zaq(connectionResult, getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String valueOf = String.valueOf(pendingIntent);
                    new StringBuilder(String.valueOf(valueOf).length() + 36);
                    StringBuilder append = sb.append("Activity not found while launching ");
                    StringBuilder append2 = sb.append(valueOf);
                    StringBuilder append3 = sb.append(".");
                    String sb2 = sb.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        sb2 = String.valueOf(sb2).concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    int e4 = Log.e("GoogleApiActivity", sb2, activityNotFoundException);
                }
                this.zaa = 1;
                finish();
            } catch (IntentSender.SendIntentException e5) {
                int e6 = Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e5);
                finish();
            }
        } else {
            boolean showErrorDialogFragment = C0189GoogleApiAvailability.getInstance().showErrorDialogFragment(this, ((Integer) C0446Preconditions.checkNotNull(num)).intValue(), 2, this);
            this.zaa = 1;
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, @RecentlyNonNull Intent intent) {
        C0184ConnectionResult connectionResult;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i3, i4, intent2);
        if (i3 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.zaa = 0;
            setResult(i4, intent2);
            if (booleanExtra) {
                C0248GoogleApiManager zaa2 = C0248GoogleApiManager.zaa(this);
                switch (i4) {
                    case -1:
                        zaa2.zai();
                        break;
                    case 0:
                        new C0184ConnectionResult(13, (PendingIntent) null);
                        zaa2.zaq(connectionResult, getIntent().getIntExtra("failing_client_id", -1));
                        break;
                }
            }
        } else if (i3 == 2) {
            this.zaa = 0;
            setResult(i4, intent2);
        }
        finish();
    }

    public final void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface dialogInterface2 = dialogInterface;
        this.zaa = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        if (bundle2 != null) {
            this.zaa = bundle2.getInt("resolution");
        }
        if (this.zaa != 1) {
            zab();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("resolution", this.zaa);
        super.onSaveInstanceState(bundle2);
    }
}
