package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.Auth;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class Credentials {
    public Credentials() {
    }

    public static CredentialsClient getClient(@NonNull Activity activity) {
        CredentialsClient credentialsClient;
        new CredentialsClient(activity, (Auth.AuthCredentialsOptions) CredentialsOptions.DEFAULT);
        return credentialsClient;
    }

    public static CredentialsClient getClient(@NonNull Activity activity, @NonNull CredentialsOptions credentialsOptions) {
        CredentialsClient credentialsClient;
        new CredentialsClient(activity, (Auth.AuthCredentialsOptions) credentialsOptions);
        return credentialsClient;
    }

    public static CredentialsClient getClient(@NonNull Context context) {
        CredentialsClient credentialsClient;
        new CredentialsClient(context, (Auth.AuthCredentialsOptions) CredentialsOptions.DEFAULT);
        return credentialsClient;
    }

    public static CredentialsClient getClient(@NonNull Context context, @NonNull CredentialsOptions credentialsOptions) {
        CredentialsClient credentialsClient;
        new CredentialsClient(context, (Auth.AuthCredentialsOptions) credentialsOptions);
        return credentialsClient;
    }
}
