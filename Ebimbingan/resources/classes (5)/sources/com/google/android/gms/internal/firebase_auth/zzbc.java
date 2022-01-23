package com.google.android.gms.internal.firebase_auth;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzbc<E> extends zzav<E> implements Set<E> {
    @NullableDecl
    private transient zzay<E> zzhd;

    zzbc() {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r1
            r3 = r0
            if (r2 != r3) goto L_0x0009
            r2 = 1
            r0 = r2
        L_0x0008:
            return r0
        L_0x0009:
            r2 = r0
            r3 = r1
            boolean r2 = com.google.android.gms.internal.firebase_auth.zzbh.zza(r2, r3)
            r0 = r2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzbc.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return zzbh.zza(this);
    }

    public zzay<E> zzcd() {
        zzay<E> zzay = this.zzhd;
        zzay<E> zzay2 = zzay;
        if (zzay != null) {
            return zzay2;
        }
        zzay<E> zzci = zzci();
        zzay<E> zzay3 = zzci;
        this.zzhd = zzay3;
        return zzci;
    }

    /* access modifiers changed from: package-private */
    public zzay<E> zzci() {
        return zzay.zza(toArray());
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
