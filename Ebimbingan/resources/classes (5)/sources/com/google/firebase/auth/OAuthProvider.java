package com.google.firebase.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.internal.FederatedSignInActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OAuthProvider extends FederatedAuthProvider {
    private final Bundle zzjk;

    private OAuthProvider(Bundle bundle) {
        this.zzjk = bundle;
    }

    public static Builder newBuilder(@NonNull String str) {
        return newBuilder(str, FirebaseAuth.getInstance());
    }

    public static Builder newBuilder(@NonNull String str, @NonNull FirebaseAuth firebaseAuth) {
        Builder builder;
        Throwable th;
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        FirebaseAuth firebaseAuth2 = firebaseAuth;
        String str2 = str;
        String str3 = str2;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        Object checkNotNull = Preconditions.checkNotNull(firebaseAuth2);
        if ("facebook.com".equals(str3)) {
            Throwable th2 = th;
            new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
            throw th2;
        }
        new Builder(str3, firebaseAuth2, instance, (zzz) null);
        return builder;
    }

    public String getProviderId() {
        if (this.zzjk == null) {
            return null;
        }
        return this.zzjk.getString("com.google.firebase.auth.KEY_PROVIDER_ID", (String) null);
    }

    public final void zza(Activity activity) {
        Intent intent;
        Activity activity2 = activity;
        new Intent("com.google.firebase.auth.internal.SIGN_IN");
        Intent intent2 = intent;
        Intent intent3 = intent2;
        Intent intent4 = intent2.setPackage(activity2.getPackageName());
        Intent intent5 = intent3.setClass(activity2, FederatedSignInActivity.class);
        Intent putExtras = intent3.putExtras(this.zzjk);
        activity2.startActivity(intent3);
    }

    public static class Builder {
        @VisibleForTesting
        private final Bundle zzjk;
        private final FirebaseAuth zzjr;
        private final Bundle zzjs;

        private Builder(String str, FirebaseAuth firebaseAuth, GoogleApiAvailability googleApiAvailability) {
            Bundle bundle;
            Bundle bundle2;
            new Bundle();
            this.zzjk = bundle;
            new Bundle();
            this.zzjs = bundle2;
            this.zzjr = firebaseAuth;
            this.zzjk.putString("com.google.firebase.auth.KEY_API_KEY", this.zzjr.zzcu().getOptions().getApiKey());
            this.zzjk.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            this.zzjk.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", this.zzjs);
            this.zzjk.putString("com.google.firebase.auth.internal.CLIENT_VERSION", Integer.toString(googleApiAvailability.getClientVersion(this.zzjr.zzcu().getApplicationContext())));
            this.zzjk.putString("com.google.firebase.auth.KEY_TENANT_ID", this.zzjr.zzba());
        }

        public Builder setScopes(List<String> list) {
            ArrayList arrayList;
            new ArrayList(list);
            this.zzjk.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", arrayList);
            return this;
        }

        public Builder addCustomParameter(String str, String str2) {
            this.zzjs.putString(str, str2);
            return this;
        }

        public Builder addCustomParameters(Map<String, String> map) {
            for (Map.Entry next : map.entrySet()) {
                this.zzjs.putString((String) next.getKey(), (String) next.getValue());
            }
            return this;
        }

        public OAuthProvider build() {
            OAuthProvider oAuthProvider;
            new OAuthProvider(this.zzjk, (zzz) null);
            return oAuthProvider;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ Builder(String str, FirebaseAuth firebaseAuth, GoogleApiAvailability googleApiAvailability, zzz zzz) {
            this(str, firebaseAuth, googleApiAvailability);
            zzz zzz2 = zzz;
        }
    }

    public final void zzb(Activity activity) {
        Intent intent;
        Activity activity2 = activity;
        new Intent("com.google.firebase.auth.internal.LINK");
        Intent intent2 = intent;
        Intent intent3 = intent2;
        Intent intent4 = intent2.setPackage(activity2.getPackageName());
        Intent intent5 = intent3.setClass(activity2, FederatedSignInActivity.class);
        Intent putExtras = intent3.putExtras(this.zzjk);
        activity2.startActivity(intent3);
    }

    public final void zzc(Activity activity) {
        Intent intent;
        Activity activity2 = activity;
        new Intent("com.google.firebase.auth.internal.REAUTHENTICATE");
        Intent intent2 = intent;
        Intent intent3 = intent2;
        Intent intent4 = intent2.setPackage(activity2.getPackageName());
        Intent intent5 = intent3.setClass(activity2, FederatedSignInActivity.class);
        Intent putExtras = intent3.putExtras(this.zzjk);
        activity2.startActivity(intent3);
    }

    public static AuthCredential getCredential(@NonNull String str, String str2, String str3) {
        return zzf.zza(str, str2, str3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ OAuthProvider(Bundle bundle, zzz zzz) {
        this(bundle);
        zzz zzz2 = zzz;
    }
}
