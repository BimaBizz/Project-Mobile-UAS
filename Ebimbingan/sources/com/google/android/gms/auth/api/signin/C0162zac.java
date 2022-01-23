package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.C0235Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.zac */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0162zac implements Comparator<C0235Scope> {
    C0162zac() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((C0235Scope) obj).getScopeUri().compareTo(((C0235Scope) obj2).getScopeUri());
    }
}
