package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.internal.C0446Preconditions;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.ScopeUtil */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0613ScopeUtil {
    private C0613ScopeUtil() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static Set<C0235Scope> fromScopeString(@RecentlyNonNull Collection<String> collection) {
        Collection<String> collection2 = collection;
        Object checkNotNull = C0446Preconditions.checkNotNull(collection2, "scopeStrings can't be null.");
        return fromScopeString((String[]) collection2.toArray(new String[collection2.size()]));
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static String[] toScopeString(@RecentlyNonNull Set<C0235Scope> set) {
        Set<C0235Scope> set2 = set;
        Object checkNotNull = C0446Preconditions.checkNotNull(set2, "scopes can't be null.");
        return toScopeString((C0235Scope[]) set2.toArray(new C0235Scope[set2.size()]));
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static Set<C0235Scope> fromScopeString(@RecentlyNonNull String... strArr) {
        Set<C0235Scope> set;
        Object obj;
        String[] strArr2 = strArr;
        Object checkNotNull = C0446Preconditions.checkNotNull(strArr2, "scopeStrings can't be null.");
        int length = strArr2.length;
        new HashSet(length);
        for (int i = 0; i < length; i++) {
            String str = strArr2[i];
            if (!TextUtils.isEmpty(str)) {
                new C0235Scope(str);
                boolean add = set.add(obj);
            }
        }
        return set;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static String[] toScopeString(@RecentlyNonNull C0235Scope[] scopeArr) {
        C0235Scope[] scopeArr2 = scopeArr;
        Object checkNotNull = C0446Preconditions.checkNotNull(scopeArr2, "scopes can't be null.");
        String[] strArr = new String[scopeArr2.length];
        for (int i = 0; i < scopeArr2.length; i++) {
            strArr[i] = scopeArr2[i].getScopeUri();
        }
        return strArr;
    }
}
