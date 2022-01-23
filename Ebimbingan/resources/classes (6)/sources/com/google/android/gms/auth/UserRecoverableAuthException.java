package com.google.android.gms.auth;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class UserRecoverableAuthException extends GoogleAuthException {
    @Nullable
    private final Intent zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRecoverableAuthException(String str, @Nullable Intent intent) {
        super(str);
        this.zza = intent;
    }

    @Nullable
    public Intent getIntent() {
        Intent intent;
        if (this.zza == null) {
            return null;
        }
        new Intent(this.zza);
        return intent;
    }
}
