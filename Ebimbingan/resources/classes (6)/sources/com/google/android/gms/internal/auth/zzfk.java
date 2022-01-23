package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzfk {
    static int zza(Set<?> set) {
        int i = 0;
        Iterator<?> it = set.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            i = ((i + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean zza(java.util.Set<?> r5, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r6) {
        /*
            r0 = r5
            r1 = r6
            r3 = r0
            r4 = r1
            if (r3 != r4) goto L_0x0009
            r3 = 1
            r0 = r3
        L_0x0008:
            return r0
        L_0x0009:
            r3 = r1
            boolean r3 = r3 instanceof java.util.Set
            if (r3 == 0) goto L_0x0030
            r3 = r1
            java.util.Set r3 = (java.util.Set) r3
            r2 = r3
            r3 = r0
            int r3 = r3.size()     // Catch:{ NullPointerException -> 0x002c, ClassCastException -> 0x0033 }
            r4 = r2
            int r4 = r4.size()     // Catch:{ NullPointerException -> 0x002c, ClassCastException -> 0x0033 }
            if (r3 != r4) goto L_0x0029
            r3 = r0
            r4 = r2
            boolean r3 = r3.containsAll(r4)     // Catch:{ NullPointerException -> 0x002c, ClassCastException -> 0x0033 }
            if (r3 == 0) goto L_0x0029
            r3 = 1
            r0 = r3
            goto L_0x0008
        L_0x0029:
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x002c:
            r3 = move-exception
        L_0x002d:
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x0030:
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x0033:
            r3 = move-exception
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfk.zza(java.util.Set, java.lang.Object):boolean");
    }
}
