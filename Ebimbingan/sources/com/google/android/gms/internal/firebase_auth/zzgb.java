package com.google.android.gms.internal.firebase_auth;

import java.util.AbstractList;
import java.util.Collection;

abstract class zzgb<E> extends AbstractList<E> implements zzhz<E> {
    private boolean zzvo = true;

    zzgb() {
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r5 = r1
            r6 = r0
            if (r5 != r6) goto L_0x0009
            r5 = 1
            r0 = r5
        L_0x0008:
            return r0
        L_0x0009:
            r5 = r1
            boolean r5 = r5 instanceof java.util.List
            if (r5 != 0) goto L_0x0011
            r5 = 0
            r0 = r5
            goto L_0x0008
        L_0x0011:
            r5 = r1
            boolean r5 = r5 instanceof java.util.RandomAccess
            if (r5 != 0) goto L_0x001e
            r5 = r0
            r6 = r1
            boolean r5 = super.equals(r6)
            r0 = r5
            goto L_0x0008
        L_0x001e:
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            r2 = r5
            r5 = r0
            int r5 = r5.size()
            r8 = r5
            r5 = r8
            r6 = r8
            r3 = r6
            r6 = r2
            int r6 = r6.size()
            if (r5 == r6) goto L_0x0035
            r5 = 0
            r0 = r5
            goto L_0x0008
        L_0x0035:
            r5 = 0
            r4 = r5
        L_0x0037:
            r5 = r4
            r6 = r3
            if (r5 >= r6) goto L_0x0053
            r5 = r0
            r6 = r4
            java.lang.Object r5 = r5.get(r6)
            r6 = r2
            r7 = r4
            java.lang.Object r6 = r6.get(r7)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0050
            r5 = 0
            r0 = r5
            goto L_0x0008
        L_0x0050:
            int r4 = r4 + 1
            goto L_0x0037
        L_0x0053:
            r5 = 1
            r0 = r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzgb.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean add(E e) {
        zzfz();
        return super.add(e);
    }

    public void add(int i, E e) {
        zzfz();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        zzfz();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        zzfz();
        return super.addAll(i, collection);
    }

    public void clear() {
        zzfz();
        super.clear();
    }

    public boolean zzfx() {
        return this.zzvo;
    }

    public final void zzfy() {
        this.zzvo = false;
    }

    public E remove(int i) {
        zzfz();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        zzfz();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        zzfz();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        zzfz();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        zzfz();
        return super.set(i, e);
    }

    /* access modifiers changed from: protected */
    public final void zzfz() {
        Throwable th;
        if (!this.zzvo) {
            Throwable th2 = th;
            new UnsupportedOperationException();
            throw th2;
        }
    }
}
