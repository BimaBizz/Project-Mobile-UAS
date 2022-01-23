package com.google.android.gms.auth.api.credentials;

import android.accounts.Account;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;

/* renamed from: com.google.android.gms.auth.api.credentials.IdentityProviders */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0073IdentityProviders {
    public static final String FACEBOOK = "https://www.facebook.com";
    public static final String GOOGLE = "https://accounts.google.com";
    public static final String LINKEDIN = "https://www.linkedin.com";
    public static final String MICROSOFT = "https://login.live.com";
    public static final String PAYPAL = "https://www.paypal.com";
    public static final String TWITTER = "https://twitter.com";
    public static final String YAHOO = "https://login.yahoo.com";

    private C0073IdentityProviders() {
    }

    @Nullable
    public static final String getIdentityProviderForAccount(@NonNull Account account) {
        Account account2 = account;
        Object checkNotNull = C0446Preconditions.checkNotNull(account2, "account cannot be null");
        if ("com.google".equals(account2.type)) {
            return "https://accounts.google.com";
        }
        if ("com.facebook.auth.login".equals(account2.type)) {
            return "https://www.facebook.com";
        }
        return null;
    }
}
