package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class zag implements DialogInterface.OnClickListener {
    public zag() {
    }

    public static zag zab(Activity activity, @Nullable Intent intent, int i) {
        zag zag;
        new zad(intent, activity, i);
        return zag;
    }

    public static zag zac(@NonNull Fragment fragment, @Nullable Intent intent, int i) {
        zag zag;
        new zae(intent, fragment, i);
        return zag;
    }

    public static zag zad(@NonNull LifecycleFragment lifecycleFragment, @Nullable Intent intent, int i) {
        zag zag;
        int i2 = i;
        new zaf(intent, lifecycleFragment, 2);
        return zag;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface dialogInterface2 = dialogInterface;
        int i2 = i;
        try {
            zaa();
            dialogInterface2.dismiss();
        } catch (ActivityNotFoundException e) {
            ActivityNotFoundException activityNotFoundException = e;
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            int e2 = Log.e("DialogRedirect", str, activityNotFoundException);
            dialogInterface2.dismiss();
        } catch (Throwable th) {
            Throwable th2 = th;
            dialogInterface2.dismiss();
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zaa();
}
