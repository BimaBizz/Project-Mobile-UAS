package com.google.android.gms.internal.auth;

import gnu.expr.Declaration;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzez */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C0910zzez<E> extends C0902zzer<E> implements Set<E> {
    @NullableDecl
    private transient C0901zzeq<E> zza;

    static int zza(int i) {
        int max = Math.max(i, 2);
        int i2 = max;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            while (true) {
                int i3 = highestOneBit << 1;
                if (((double) i3) * 0.7d >= ((double) i2)) {
                    return i3;
                }
                highestOneBit = i3;
            }
        } else {
            C0874zzdq.zza(i2 < 1073741824, (Object) "collection too large");
            return Declaration.MODULE_REFERENCE;
        }
    }

    C0910zzez() {
    }

    /* access modifiers changed from: package-private */
    public boolean zza() {
        return false;
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
            r2 = r1
            boolean r2 = r2 instanceof com.google.android.gms.internal.auth.C0910zzez
            if (r2 == 0) goto L_0x002d
            r2 = r0
            boolean r2 = r2.zza()
            if (r2 == 0) goto L_0x002d
            r2 = r1
            com.google.android.gms.internal.auth.zzez r2 = (com.google.android.gms.internal.auth.C0910zzez) r2
            boolean r2 = r2.zza()
            if (r2 == 0) goto L_0x002d
            r2 = r0
            int r2 = r2.hashCode()
            r3 = r1
            int r3 = r3.hashCode()
            if (r2 == r3) goto L_0x002d
            r2 = 0
            r0 = r2
            goto L_0x0008
        L_0x002d:
            r2 = r0
            r3 = r1
            boolean r2 = com.google.android.gms.internal.auth.C0922zzfk.zza(r2, r3)
            r0 = r2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0910zzez.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return C0922zzfk.zza(this);
    }

    public C0901zzeq<E> zzc() {
        C0901zzeq<E> zzeq = this.zza;
        C0901zzeq<E> zzeq2 = zzeq;
        if (zzeq != null) {
            return zzeq2;
        }
        C0901zzeq<E> zzh = zzh();
        C0901zzeq<E> zzeq3 = zzh;
        this.zza = zzeq3;
        return zzh;
    }

    /* access modifiers changed from: package-private */
    public C0901zzeq<E> zzh() {
        return C0901zzeq.zza(toArray());
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
