package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zab {
    public final Set<Scope> zaa;

    public zab(Set<Scope> set) {
        Set<Scope> set2 = set;
        Object checkNotNull = Preconditions.checkNotNull(set2);
        this.zaa = Collections.unmodifiableSet(set2);
    }
}
