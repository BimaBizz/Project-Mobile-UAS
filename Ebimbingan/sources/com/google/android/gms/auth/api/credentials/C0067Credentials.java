package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.C0031Auth;

/* renamed from: com.google.android.gms.auth.api.credentials.Credentials */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C0067Credentials {
    public C0067Credentials() {
    }

    public static C0069CredentialsClient getClient(@NonNull Activity activity) {
        C0069CredentialsClient credentialsClient;
        new C0069CredentialsClient(activity, (C0031Auth.AuthCredentialsOptions) C0070CredentialsOptions.DEFAULT);
        return credentialsClient;
    }

    public static C0069CredentialsClient getClient(@NonNull Activity activity, @NonNull C0070CredentialsOptions credentialsOptions) {
        C0069CredentialsClient credentialsClient;
        new C0069CredentialsClient(activity, (C0031Auth.AuthCredentialsOptions) credentialsOptions);
        return credentialsClient;
    }

    public static C0069CredentialsClient getClient(@NonNull Context context) {
        C0069CredentialsClient credentialsClient;
        new C0069CredentialsClient(context, (C0031Auth.AuthCredentialsOptions) C0070CredentialsOptions.DEFAULT);
        return credentialsClient;
    }

    public static C0069CredentialsClient getClient(@NonNull Context context, @NonNull C0070CredentialsOptions credentialsOptions) {
        C0069CredentialsClient credentialsClient;
        new C0069CredentialsClient(context, (C0031Auth.AuthCredentialsOptions) credentialsOptions);
        return credentialsClient;
    }
}
