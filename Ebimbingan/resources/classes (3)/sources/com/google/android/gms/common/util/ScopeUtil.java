package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class ScopeUtil {
    private ScopeUtil() {
    }

    @RecentlyNonNull
    @KeepForSdk
    public static Set<Scope> fromScopeString(@RecentlyNonNull Collection<String> collection) {
        Collection<String> collection2 = collection;
        Object checkNotNull = Preconditions.checkNotNull(collection2, "scopeStrings can't be null.");
        return fromScopeString((String[]) collection2.toArray(new String[collection2.size()]));
    }

    @RecentlyNonNull
    @KeepForSdk
    public static String[] toScopeString(@RecentlyNonNull Set<Scope> set) {
        Set<Scope> set2 = set;
        Object checkNotNull = Preconditions.checkNotNull(set2, "scopes can't be null.");
        return toScopeString((Scope[]) set2.toArray(new Scope[set2.size()]));
    }

    @RecentlyNonNull
    @KeepForSdk
    public static Set<Scope> fromScopeString(@RecentlyNonNull String... strArr) {
        Set<Scope> set;
        Object obj;
        String[] strArr2 = strArr;
        Object checkNotNull = Preconditions.checkNotNull(strArr2, "scopeStrings can't be null.");
        int length = strArr2.length;
        new HashSet(length);
        for (int i = 0; i < length; i++) {
            String str = strArr2[i];
            if (!TextUtils.isEmpty(str)) {
                new Scope(str);
                boolean add = set.add(obj);
            }
        }
        return set;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static String[] toScopeString(@RecentlyNonNull Scope[] scopeArr) {
        Scope[] scopeArr2 = scopeArr;
        Object checkNotNull = Preconditions.checkNotNull(scopeArr2, "scopes can't be null.");
        String[] strArr = new String[scopeArr2.length];
        for (int i = 0; i < scopeArr2.length; i++) {
            strArr[i] = scopeArr2[i].getScopeUri();
        }
        return strArr;
    }
}
