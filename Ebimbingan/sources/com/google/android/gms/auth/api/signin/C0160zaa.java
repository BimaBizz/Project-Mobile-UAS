package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import com.google.android.gms.common.api.C0235Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.zaa */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class C0160zaa implements Comparator {
    static final Comparator zaa;

    static {
        Comparator comparator;
        new C0160zaa();
        zaa = comparator;
    }

    private C0160zaa() {
    }

    public final int compare(Object obj, Object obj2) {
        C0235Scope scope = (C0235Scope) obj;
        C0235Scope scope2 = (C0235Scope) obj2;
        Parcelable.Creator<C0122GoogleSignInAccount> creator = C0122GoogleSignInAccount.CREATOR;
        return scope.getScopeUri().compareTo(scope2.getScopeUri());
    }
}
