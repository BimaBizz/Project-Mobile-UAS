package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C0446Preconditions;

/* renamed from: com.google.android.gms.common.ErrorDialogFragment */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0185ErrorDialogFragment extends DialogFragment {
    private Dialog zaa;
    private DialogInterface.OnCancelListener zab;
    @Nullable
    private Dialog zac;

    public C0185ErrorDialogFragment() {
    }

    @NonNull
    public static C0185ErrorDialogFragment newInstance(@RecentlyNonNull Dialog dialog) {
        return newInstance(dialog, (DialogInterface.OnCancelListener) null);
    }

    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface dialogInterface2 = dialogInterface;
        DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface2);
        }
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder;
        Bundle bundle2 = bundle;
        Dialog dialog = this.zaa;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.zac == null) {
            new AlertDialog.Builder(getActivity());
            this.zac = builder.create();
        }
        return this.zac;
    }

    public void show(@RecentlyNonNull FragmentManager fragmentManager, @Nullable String str) {
        super.show(fragmentManager, str);
    }

    @NonNull
    public static C0185ErrorDialogFragment newInstance(@RecentlyNonNull Dialog dialog, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        C0185ErrorDialogFragment errorDialogFragment;
        DialogInterface.OnCancelListener onCancelListener2 = onCancelListener;
        new C0185ErrorDialogFragment();
        Dialog dialog2 = (Dialog) C0446Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        errorDialogFragment.zaa = dialog2;
        if (onCancelListener2 != null) {
            errorDialogFragment.zab = onCancelListener2;
        }
        return errorDialogFragment;
    }
}
