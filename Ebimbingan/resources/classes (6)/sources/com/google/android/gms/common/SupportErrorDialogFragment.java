package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class SupportErrorDialogFragment extends DialogFragment {
    private Dialog zaa;
    private DialogInterface.OnCancelListener zab;
    @Nullable
    private Dialog zac;

    public SupportErrorDialogFragment() {
    }

    @NonNull
    public static SupportErrorDialogFragment newInstance(@RecentlyNonNull Dialog dialog) {
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
        SupportErrorDialogFragment.super.show(fragmentManager, str);
    }

    @NonNull
    public static SupportErrorDialogFragment newInstance(@RecentlyNonNull Dialog dialog, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment;
        DialogInterface.OnCancelListener onCancelListener2 = onCancelListener;
        new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        supportErrorDialogFragment.zaa = dialog2;
        if (onCancelListener2 != null) {
            supportErrorDialogFragment.zab = onCancelListener2;
        }
        return supportErrorDialogFragment;
    }
}
