package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.ServiceSpecificExtraArgs */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0451ServiceSpecificExtraArgs {

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.ServiceSpecificExtraArgs$CastExtraArgs */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface CastExtraArgs {
        @RecentlyNonNull
        @C0206KeepForSdk
        public static final String LISTENER = "listener";
    }

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.ServiceSpecificExtraArgs$GamesExtraArgs */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface GamesExtraArgs {
        @RecentlyNonNull
        @C0206KeepForSdk
        public static final String DESIRED_LOCALE = "com.google.android.gms.games.key.desiredLocale";
        @RecentlyNonNull
        @C0206KeepForSdk
        public static final String GAME_PACKAGE_NAME = "com.google.android.gms.games.key.gamePackageName";
        @RecentlyNonNull
        @C0206KeepForSdk
        public static final String SIGNIN_OPTIONS = "com.google.android.gms.games.key.signInOptions";
        @RecentlyNonNull
        @C0206KeepForSdk
        public static final String WINDOW_TOKEN = "com.google.android.gms.games.key.popupWindowToken";
    }

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.ServiceSpecificExtraArgs$PlusExtraArgs */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface PlusExtraArgs {
        @RecentlyNonNull
        @C0206KeepForSdk
        public static final String PLUS_AUTH_PACKAGE = "auth_package";
    }

    private C0451ServiceSpecificExtraArgs() {
    }
}
