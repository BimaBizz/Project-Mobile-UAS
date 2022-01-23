package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C0235Scope;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.zab */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0486zab {
    public final Set<C0235Scope> zaa;

    public C0486zab(Set<C0235Scope> set) {
        Set<C0235Scope> set2 = set;
        Object checkNotNull = C0446Preconditions.checkNotNull(set2);
        this.zaa = Collections.unmodifiableSet(set2);
    }
}
