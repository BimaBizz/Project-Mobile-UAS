package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class zaa implements Comparator {
    static final Comparator zaa;

    static {
        Comparator comparator;
        new zaa();
        zaa = comparator;
    }

    private zaa() {
    }

    public final int compare(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        Scope scope2 = (Scope) obj2;
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return scope.getScopeUri().compareTo(scope2.getScopeUri());
    }
}
