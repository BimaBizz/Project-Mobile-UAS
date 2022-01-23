package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class UserRecoverableException extends Exception {
    private final Intent zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRecoverableException(@RecentlyNonNull String str, @RecentlyNonNull Intent intent) {
        super(str);
        this.zza = intent;
    }

    @RecentlyNonNull
    public Intent getIntent() {
        Intent intent;
        new Intent(this.zza);
        return intent;
    }
}
