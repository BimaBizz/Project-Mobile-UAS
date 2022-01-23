package com.google.android.gms.auth.api.signin;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface GoogleSignInOptionsExtension {
    @KeepForSdk
    public static final int FITNESS = 3;
    @KeepForSdk
    public static final int GAMES = 1;

    @KeepForSdk
    int getExtensionType();

    @KeepForSdk
    @RecentlyNullable
    List<Scope> getImpliedScopes();

    @RecentlyNonNull
    @KeepForSdk
    Bundle toBundle();
}
