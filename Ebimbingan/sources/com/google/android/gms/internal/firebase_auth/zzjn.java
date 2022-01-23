package com.google.android.gms.internal.firebase_auth;

import java.util.ArrayList;
import java.util.List;

final class zzjn<E> extends zzgb<E> {
    private static final zzjn<Object> zzadm;
    private final List<E> zzacb;

    public static <E> zzjn<E> zzju() {
        return zzadm;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzjn() {
        /*
            r6 = this;
            r0 = r6
            r1 = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = r2
            r2 = r5
            r3 = r5
            r4 = 10
            r3.<init>(r4)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzjn.<init>():void");
    }

    private zzjn(List<E> list) {
        this.zzacb = list;
    }

    public final void add(int i, E e) {
        zzfz();
        this.zzacb.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.zzacb.get(i);
    }

    public final E remove(int i) {
        zzfz();
        E remove = this.zzacb.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        zzfz();
        E e2 = this.zzacb.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.zzacb.size();
    }

    public final /* synthetic */ zzhz zzo(int i) {
        List list;
        zzhz zzhz;
        Throwable th;
        int i2 = i;
        if (i2 < size()) {
            Throwable th2 = th;
            new IllegalArgumentException();
            throw th2;
        }
        new ArrayList(i2);
        List list2 = list;
        boolean addAll = list2.addAll(this.zzacb);
        new zzjn(list2);
        return zzhz;
    }

    static {
        zzjn zzjn;
        List list;
        new ArrayList(0);
        new zzjn(list);
        zzjn zzjn2 = zzjn;
        zzadm = zzjn2;
        zzjn2.zzfy();
    }
}
