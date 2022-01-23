package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzi;
import com.google.android.gms.auth.api.signin.internal.zzq;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class GoogleSignIn {
    private GoogleSignIn() {
    }

    public static GoogleSignInClient getClient(@NonNull Context context, @NonNull GoogleSignInOptions googleSignInOptions) {
        GoogleSignInClient googleSignInClient;
        new GoogleSignInClient(context, (GoogleSignInOptions) Preconditions.checkNotNull(googleSignInOptions));
        return googleSignInClient;
    }

    public static GoogleSignInClient getClient(@NonNull Activity activity, @NonNull GoogleSignInOptions googleSignInOptions) {
        GoogleSignInClient googleSignInClient;
        new GoogleSignInClient(activity, (GoogleSignInOptions) Preconditions.checkNotNull(googleSignInOptions));
        return googleSignInClient;
    }

    public static Task<GoogleSignInAccount> getSignedInAccountFromIntent(@Nullable Intent intent) {
        GoogleSignInResult signInResultFromIntent = zzi.getSignInResultFromIntent(intent);
        GoogleSignInResult googleSignInResult = signInResultFromIntent;
        if (signInResultFromIntent == null) {
            return Tasks.forException(ApiExceptionUtil.fromStatus(Status.RESULT_INTERNAL_ERROR));
        }
        GoogleSignInAccount signInAccount = googleSignInResult.getSignInAccount();
        if (!googleSignInResult.getStatus().isSuccess() || signInAccount == null) {
            return Tasks.forException(ApiExceptionUtil.fromStatus(googleSignInResult.getStatus()));
        }
        return Tasks.forResult(signInAccount);
    }

    @Nullable
    public static GoogleSignInAccount getLastSignedInAccount(Context context) {
        return zzq.zzd(context).zzr();
    }

    @NonNull
    public static GoogleSignInAccount getAccountForScopes(@NonNull Context context, @NonNull Scope scope, Scope... scopeArr) {
        Context context2 = context;
        Scope scope2 = scope;
        Scope[] scopeArr2 = scopeArr;
        Object checkNotNull = Preconditions.checkNotNull(context2, "please provide a valid Context object");
        Object checkNotNull2 = Preconditions.checkNotNull(scope2, "please provide at least one valid scope");
        GoogleSignInAccount lastSignedInAccount = getLastSignedInAccount(context2);
        GoogleSignInAccount googleSignInAccount = lastSignedInAccount;
        if (lastSignedInAccount == null) {
            googleSignInAccount = GoogleSignInAccount.createDefault();
        }
        GoogleSignInAccount requestExtraScopes = googleSignInAccount.requestExtraScopes(scope2);
        GoogleSignInAccount requestExtraScopes2 = googleSignInAccount.requestExtraScopes(scopeArr2);
        return googleSignInAccount;
    }

    @NonNull
    public static GoogleSignInAccount getAccountForExtension(@NonNull Context context, @NonNull GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        Context context2 = context;
        GoogleSignInOptionsExtension googleSignInOptionsExtension2 = googleSignInOptionsExtension;
        Object checkNotNull = Preconditions.checkNotNull(context2, "please provide a valid Context object");
        Object checkNotNull2 = Preconditions.checkNotNull(googleSignInOptionsExtension2, "please provide valid GoogleSignInOptionsExtension");
        GoogleSignInAccount lastSignedInAccount = getLastSignedInAccount(context2);
        GoogleSignInAccount googleSignInAccount = lastSignedInAccount;
        if (lastSignedInAccount == null) {
            googleSignInAccount = GoogleSignInAccount.createDefault();
        }
        return googleSignInAccount.requestExtraScopes(zze(googleSignInOptionsExtension2.getImpliedScopes()));
    }

    public static boolean hasPermissions(@Nullable GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        GoogleSignInOptionsExtension googleSignInOptionsExtension2 = googleSignInOptionsExtension;
        Object checkNotNull = Preconditions.checkNotNull(googleSignInOptionsExtension2, "Please provide a non-null GoogleSignInOptionsExtension");
        return hasPermissions(googleSignInAccount, zze(googleSignInOptionsExtension2.getImpliedScopes()));
    }

    public static boolean hasPermissions(@Nullable GoogleSignInAccount googleSignInAccount, @NonNull Scope... scopeArr) {
        Collection collection;
        GoogleSignInAccount googleSignInAccount2 = googleSignInAccount;
        Scope[] scopeArr2 = scopeArr;
        if (googleSignInAccount2 == null) {
            return false;
        }
        new HashSet();
        Collection collection2 = collection;
        Collection collection3 = collection2;
        boolean addAll = Collections.addAll(collection2, scopeArr2);
        return googleSignInAccount2.getGrantedScopes().containsAll(collection3);
    }

    public static void requestPermissions(@NonNull Activity activity, int i, @Nullable GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        Activity activity2 = activity;
        GoogleSignInOptionsExtension googleSignInOptionsExtension2 = googleSignInOptionsExtension;
        Object checkNotNull = Preconditions.checkNotNull(activity2, "Please provide a non-null Activity");
        Object checkNotNull2 = Preconditions.checkNotNull(googleSignInOptionsExtension2, "Please provide a non-null GoogleSignInOptionsExtension");
        requestPermissions(activity2, i, googleSignInAccount, zze(googleSignInOptionsExtension2.getImpliedScopes()));
    }

    public static void requestPermissions(@NonNull Fragment fragment, int i, @Nullable GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        Fragment fragment2 = fragment;
        GoogleSignInOptionsExtension googleSignInOptionsExtension2 = googleSignInOptionsExtension;
        Object checkNotNull = Preconditions.checkNotNull(fragment2, "Please provide a non-null Fragment");
        Object checkNotNull2 = Preconditions.checkNotNull(googleSignInOptionsExtension2, "Please provide a non-null GoogleSignInOptionsExtension");
        requestPermissions(fragment2, i, googleSignInAccount, zze(googleSignInOptionsExtension2.getImpliedScopes()));
    }

    public static void requestPermissions(@NonNull Activity activity, int i, @Nullable GoogleSignInAccount googleSignInAccount, @NonNull Scope... scopeArr) {
        Activity activity2 = activity;
        Scope[] scopeArr2 = scopeArr;
        Object checkNotNull = Preconditions.checkNotNull(activity2, "Please provide a non-null Activity");
        Object checkNotNull2 = Preconditions.checkNotNull(scopeArr2, "Please provide at least one scope");
        activity2.startActivityForResult(zzc(activity2, googleSignInAccount, scopeArr2), i);
    }

    public static void requestPermissions(@NonNull Fragment fragment, int i, @Nullable GoogleSignInAccount googleSignInAccount, @NonNull Scope... scopeArr) {
        Fragment fragment2 = fragment;
        Scope[] scopeArr2 = scopeArr;
        Object checkNotNull = Preconditions.checkNotNull(fragment2, "Please provide a non-null Fragment");
        Object checkNotNull2 = Preconditions.checkNotNull(scopeArr2, "Please provide at least one scope");
        fragment2.startActivityForResult(zzc(fragment2.getActivity(), googleSignInAccount, scopeArr2), i);
    }

    @NonNull
    private static Intent zzc(@NonNull Activity activity, @Nullable GoogleSignInAccount googleSignInAccount, @NonNull Scope... scopeArr) {
        GoogleSignInOptions.Builder builder;
        GoogleSignInClient googleSignInClient;
        Activity activity2 = activity;
        GoogleSignInAccount googleSignInAccount2 = googleSignInAccount;
        Scope[] scopeArr2 = scopeArr;
        new GoogleSignInOptions.Builder();
        GoogleSignInOptions.Builder builder2 = builder;
        if (scopeArr2.length > 0) {
            GoogleSignInOptions.Builder requestScopes = builder2.requestScopes(scopeArr2[0], scopeArr2);
        }
        if (googleSignInAccount2 != null && !TextUtils.isEmpty(googleSignInAccount2.getEmail())) {
            GoogleSignInOptions.Builder accountName = builder2.setAccountName((String) Preconditions.checkNotNull(googleSignInAccount2.getEmail()));
        }
        new GoogleSignInClient(activity2, builder2.build());
        return googleSignInClient.getSignInIntent();
    }

    @NonNull
    private static Scope[] zze(@Nullable List<Scope> list) {
        List<Scope> list2 = list;
        if (list2 == null) {
            return new Scope[0];
        }
        return (Scope[]) list2.toArray(new Scope[list2.size()]);
    }
}
