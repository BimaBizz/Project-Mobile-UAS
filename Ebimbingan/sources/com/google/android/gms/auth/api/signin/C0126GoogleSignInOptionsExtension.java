package com.google.android.gms.auth.api.signin;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0235Scope;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface C0126GoogleSignInOptionsExtension {
    @C0206KeepForSdk
    public static final int FITNESS = 3;
    @C0206KeepForSdk
    public static final int GAMES = 1;

    @C0206KeepForSdk
    int getExtensionType();

    @C0206KeepForSdk
    @RecentlyNullable
    List<C0235Scope> getImpliedScopes();

    @RecentlyNonNull
    @C0206KeepForSdk
    Bundle toBundle();
}
