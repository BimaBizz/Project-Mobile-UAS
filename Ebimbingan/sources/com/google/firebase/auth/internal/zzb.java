package com.google.firebase.auth.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.firebase_auth.zzfd;
import com.google.firebase.auth.ActionCodeResult;

public final class zzb implements ActionCodeResult {
    private final String zzif;
    private final int zzta;
    private final String zztb;

    public zzb(zzfd zzfd) {
        zzfd zzfd2 = zzfd;
        if (TextUtils.isEmpty(zzfd2.zzae())) {
            this.zzif = zzfd2.getEmail();
        } else {
            this.zzif = zzfd2.zzae();
        }
        this.zztb = zzfd2.getEmail();
        if (TextUtils.isEmpty(zzfd2.zzey())) {
            this.zzta = 3;
        } else if (zzfd2.zzey().equals("PASSWORD_RESET")) {
            this.zzta = 0;
        } else if (zzfd2.zzey().equals("VERIFY_EMAIL")) {
            this.zzta = 1;
        } else if (zzfd2.zzey().equals("RECOVER_EMAIL")) {
            this.zzta = 2;
        } else if (zzfd2.zzey().equals("EMAIL_SIGNIN")) {
            this.zzta = 4;
        } else {
            this.zzta = 3;
        }
    }

    public final int getOperation() {
        return this.zzta;
    }

    @Nullable
    public final String getData(int i) {
        switch (i) {
            case 0:
                if (this.zzta == 4) {
                    return null;
                }
                return this.zzif;
            case 1:
                return this.zztb;
            default:
                return null;
        }
    }
}
