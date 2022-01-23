package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C0143zzi;
import com.google.android.gms.auth.api.signin.internal.C0151zzq;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.C0422ApiExceptionUtil;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.signin.GoogleSignIn */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0121GoogleSignIn {
    private C0121GoogleSignIn() {
    }

    public static C0124GoogleSignInClient getClient(@NonNull Context context, @NonNull C0125GoogleSignInOptions googleSignInOptions) {
        C0124GoogleSignInClient googleSignInClient;
        new C0124GoogleSignInClient(context, (C0125GoogleSignInOptions) C0446Preconditions.checkNotNull(googleSignInOptions));
        return googleSignInClient;
    }

    public static C0124GoogleSignInClient getClient(@NonNull Activity activity, @NonNull C0125GoogleSignInOptions googleSignInOptions) {
        C0124GoogleSignInClient googleSignInClient;
        new C0124GoogleSignInClient(activity, (C0125GoogleSignInOptions) C0446Preconditions.checkNotNull(googleSignInOptions));
        return googleSignInClient;
    }

    public static Task<C0122GoogleSignInAccount> getSignedInAccountFromIntent(@Nullable Intent intent) {
        C0127GoogleSignInResult signInResultFromIntent = C0143zzi.getSignInResultFromIntent(intent);
        C0127GoogleSignInResult googleSignInResult = signInResultFromIntent;
        if (signInResultFromIntent == null) {
            return Tasks.forException(C0422ApiExceptionUtil.fromStatus(C0236Status.RESULT_INTERNAL_ERROR));
        }
        C0122GoogleSignInAccount signInAccount = googleSignInResult.getSignInAccount();
        if (!googleSignInResult.getStatus().isSuccess() || signInAccount == null) {
            return Tasks.forException(C0422ApiExceptionUtil.fromStatus(googleSignInResult.getStatus()));
        }
        return Tasks.forResult(signInAccount);
    }

    @Nullable
    public static C0122GoogleSignInAccount getLastSignedInAccount(Context context) {
        return C0151zzq.zzd(context).zzr();
    }

    @NonNull
    public static C0122GoogleSignInAccount getAccountForScopes(@NonNull Context context, @NonNull C0235Scope scope, C0235Scope... scopeArr) {
        Context context2 = context;
        C0235Scope scope2 = scope;
        C0235Scope[] scopeArr2 = scopeArr;
        Object checkNotNull = C0446Preconditions.checkNotNull(context2, "please provide a valid Context object");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(scope2, "please provide at least one valid scope");
        C0122GoogleSignInAccount lastSignedInAccount = getLastSignedInAccount(context2);
        C0122GoogleSignInAccount googleSignInAccount = lastSignedInAccount;
        if (lastSignedInAccount == null) {
            googleSignInAccount = C0122GoogleSignInAccount.createDefault();
        }
        C0122GoogleSignInAccount requestExtraScopes = googleSignInAccount.requestExtraScopes(scope2);
        C0122GoogleSignInAccount requestExtraScopes2 = googleSignInAccount.requestExtraScopes(scopeArr2);
        return googleSignInAccount;
    }

    @NonNull
    public static C0122GoogleSignInAccount getAccountForExtension(@NonNull Context context, @NonNull C0126GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        Context context2 = context;
        C0126GoogleSignInOptionsExtension googleSignInOptionsExtension2 = googleSignInOptionsExtension;
        Object checkNotNull = C0446Preconditions.checkNotNull(context2, "please provide a valid Context object");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(googleSignInOptionsExtension2, "please provide valid GoogleSignInOptionsExtension");
        C0122GoogleSignInAccount lastSignedInAccount = getLastSignedInAccount(context2);
        C0122GoogleSignInAccount googleSignInAccount = lastSignedInAccount;
        if (lastSignedInAccount == null) {
            googleSignInAccount = C0122GoogleSignInAccount.createDefault();
        }
        return googleSignInAccount.requestExtraScopes(zze(googleSignInOptionsExtension2.getImpliedScopes()));
    }

    public static boolean hasPermissions(@Nullable C0122GoogleSignInAccount googleSignInAccount, @NonNull C0126GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        C0126GoogleSignInOptionsExtension googleSignInOptionsExtension2 = googleSignInOptionsExtension;
        Object checkNotNull = C0446Preconditions.checkNotNull(googleSignInOptionsExtension2, "Please provide a non-null GoogleSignInOptionsExtension");
        return hasPermissions(googleSignInAccount, zze(googleSignInOptionsExtension2.getImpliedScopes()));
    }

    public static boolean hasPermissions(@Nullable C0122GoogleSignInAccount googleSignInAccount, @NonNull C0235Scope... scopeArr) {
        Collection collection;
        C0122GoogleSignInAccount googleSignInAccount2 = googleSignInAccount;
        C0235Scope[] scopeArr2 = scopeArr;
        if (googleSignInAccount2 == null) {
            return false;
        }
        new HashSet();
        Collection collection2 = collection;
        Collection collection3 = collection2;
        boolean addAll = Collections.addAll(collection2, scopeArr2);
        return googleSignInAccount2.getGrantedScopes().containsAll(collection3);
    }

    public static void requestPermissions(@NonNull Activity activity, int i, @Nullable C0122GoogleSignInAccount googleSignInAccount, @NonNull C0126GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        Activity activity2 = activity;
        C0126GoogleSignInOptionsExtension googleSignInOptionsExtension2 = googleSignInOptionsExtension;
        Object checkNotNull = C0446Preconditions.checkNotNull(activity2, "Please provide a non-null Activity");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(googleSignInOptionsExtension2, "Please provide a non-null GoogleSignInOptionsExtension");
        requestPermissions(activity2, i, googleSignInAccount, zze(googleSignInOptionsExtension2.getImpliedScopes()));
    }

    public static void requestPermissions(@NonNull Fragment fragment, int i, @Nullable C0122GoogleSignInAccount googleSignInAccount, @NonNull C0126GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        Fragment fragment2 = fragment;
        C0126GoogleSignInOptionsExtension googleSignInOptionsExtension2 = googleSignInOptionsExtension;
        Object checkNotNull = C0446Preconditions.checkNotNull(fragment2, "Please provide a non-null Fragment");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(googleSignInOptionsExtension2, "Please provide a non-null GoogleSignInOptionsExtension");
        requestPermissions(fragment2, i, googleSignInAccount, zze(googleSignInOptionsExtension2.getImpliedScopes()));
    }

    public static void requestPermissions(@NonNull Activity activity, int i, @Nullable C0122GoogleSignInAccount googleSignInAccount, @NonNull C0235Scope... scopeArr) {
        Activity activity2 = activity;
        C0235Scope[] scopeArr2 = scopeArr;
        Object checkNotNull = C0446Preconditions.checkNotNull(activity2, "Please provide a non-null Activity");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(scopeArr2, "Please provide at least one scope");
        activity2.startActivityForResult(zzc(activity2, googleSignInAccount, scopeArr2), i);
    }

    public static void requestPermissions(@NonNull Fragment fragment, int i, @Nullable C0122GoogleSignInAccount googleSignInAccount, @NonNull C0235Scope... scopeArr) {
        Fragment fragment2 = fragment;
        C0235Scope[] scopeArr2 = scopeArr;
        Object checkNotNull = C0446Preconditions.checkNotNull(fragment2, "Please provide a non-null Fragment");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(scopeArr2, "Please provide at least one scope");
        fragment2.startActivityForResult(zzc(fragment2.getActivity(), googleSignInAccount, scopeArr2), i);
    }

    @NonNull
    private static Intent zzc(@NonNull Activity activity, @Nullable C0122GoogleSignInAccount googleSignInAccount, @NonNull C0235Scope... scopeArr) {
        C0125GoogleSignInOptions.Builder builder;
        C0124GoogleSignInClient googleSignInClient;
        Activity activity2 = activity;
        C0122GoogleSignInAccount googleSignInAccount2 = googleSignInAccount;
        C0235Scope[] scopeArr2 = scopeArr;
        new C0125GoogleSignInOptions.Builder();
        C0125GoogleSignInOptions.Builder builder2 = builder;
        if (scopeArr2.length > 0) {
            C0125GoogleSignInOptions.Builder requestScopes = builder2.requestScopes(scopeArr2[0], scopeArr2);
        }
        if (googleSignInAccount2 != null && !TextUtils.isEmpty(googleSignInAccount2.getEmail())) {
            C0125GoogleSignInOptions.Builder accountName = builder2.setAccountName((String) C0446Preconditions.checkNotNull(googleSignInAccount2.getEmail()));
        }
        new C0124GoogleSignInClient(activity2, builder2.build());
        return googleSignInClient.getSignInIntent();
    }

    @NonNull
    private static C0235Scope[] zze(@Nullable List<C0235Scope> list) {
        List<C0235Scope> list2 = list;
        if (list2 == null) {
            return new C0235Scope[0];
        }
        return (C0235Scope[]) list2.toArray(new C0235Scope[list2.size()]);
    }
}
