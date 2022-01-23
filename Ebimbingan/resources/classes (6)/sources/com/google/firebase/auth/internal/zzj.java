package com.google.firebase.auth.internal;

import androidx.annotation.Nullable;
import com.google.firebase.auth.FirebaseAuthSettings;

public final class zzj extends FirebaseAuthSettings {
    private String zzjm;
    private String zzjo;

    public zzj() {
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.zzjo;
    }

    @Nullable
    public final String getSmsCode() {
        return this.zzjm;
    }

    public final boolean zzfe() {
        return (this.zzjo == null || this.zzjm == null) ? false : true;
    }

    public final void setAutoRetrievedSmsCodeForPhoneNumber(@Nullable String str, @Nullable String str2) {
        this.zzjo = str;
        this.zzjm = str2;
    }
}
