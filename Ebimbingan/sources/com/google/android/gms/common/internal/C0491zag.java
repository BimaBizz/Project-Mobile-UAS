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
import com.google.android.gms.common.api.internal.C0253LifecycleFragment;

/* renamed from: com.google.android.gms.common.internal.zag */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0491zag implements DialogInterface.OnClickListener {
    public C0491zag() {
    }

    public static C0491zag zab(Activity activity, @Nullable Intent intent, int i) {
        C0491zag zag;
        new C0488zad(intent, activity, i);
        return zag;
    }

    public static C0491zag zac(@NonNull Fragment fragment, @Nullable Intent intent, int i) {
        C0491zag zag;
        new C0489zae(intent, fragment, i);
        return zag;
    }

    public static C0491zag zad(@NonNull C0253LifecycleFragment lifecycleFragment, @Nullable Intent intent, int i) {
        C0491zag zag;
        int i2 = i;
        new C0490zaf(intent, lifecycleFragment, 2);
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
