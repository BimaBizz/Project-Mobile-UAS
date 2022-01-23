package com.google.android.gms.internal.firebase_auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzik extends zzgb<String> implements zzij, RandomAccess {
    private static final zzik zzabz;
    private static final zzij zzaca = zzabz;
    private final List<Object> zzacb;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzik() {
        this(10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzik(int r8) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = r3
            r3 = r6
            r4 = r6
            r5 = r1
            r4.<init>(r5)
            r2.<init>((java.util.ArrayList<java.lang.Object>) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzik.<init>(int):void");
    }

    private zzik(ArrayList<Object> arrayList) {
        this.zzacb = arrayList;
    }

    public final int size() {
        return this.zzacb.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        int i2 = i;
        Collection<? extends String> collection2 = collection;
        zzfz();
        boolean addAll = this.zzacb.addAll(i2, collection2 instanceof zzij ? ((zzij) collection2).zzjd() : collection2);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzfz();
        this.zzacb.clear();
        this.modCount++;
    }

    public final void zzc(zzgf zzgf) {
        zzfz();
        boolean add = this.zzacb.add(zzgf);
        this.modCount++;
    }

    public final Object zzax(int i) {
        return this.zzacb.get(i);
    }

    private static String zzh(Object obj) {
        Object obj2 = obj;
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof zzgf) {
            return ((zzgf) obj2).zzgc();
        }
        return zzht.zzf((byte[]) obj2);
    }

    public final List<?> zzjd() {
        return Collections.unmodifiableList(this.zzacb);
    }

    public final zzij zzje() {
        zzij zzij;
        if (zzfx()) {
            new zzkp(this);
            return zzij;
        }
        return this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        zzfz();
        return zzh(this.zzacb.set(i, str));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* synthetic */ Object remove(int i) {
        zzfz();
        Object remove = this.zzacb.remove(i);
        this.modCount++;
        return zzh(remove);
    }

    public final /* bridge */ /* synthetic */ boolean zzfx() {
        return super.zzfx();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzfz();
        this.zzacb.add(i, (String) obj);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ zzhz zzo(int i) {
        ArrayList arrayList;
        zzhz zzhz;
        Throwable th;
        int i2 = i;
        if (i2 < size()) {
            Throwable th2 = th;
            new IllegalArgumentException();
            throw th2;
        }
        new ArrayList(i2);
        ArrayList arrayList2 = arrayList;
        boolean addAll = arrayList2.addAll(this.zzacb);
        new zzik((ArrayList<Object>) arrayList2);
        return zzhz;
    }

    public final /* synthetic */ Object get(int i) {
        int i2 = i;
        Object obj = this.zzacb.get(i2);
        Object obj2 = obj;
        if (obj instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof zzgf) {
            zzgf zzgf = (zzgf) obj2;
            String zzgc = zzgf.zzgc();
            if (zzgf.zzgd()) {
                Object obj3 = this.zzacb.set(i2, zzgc);
            }
            return zzgc;
        }
        byte[] bArr = (byte[]) obj2;
        String zzf = zzht.zzf(bArr);
        if (zzht.zze(bArr)) {
            Object obj4 = this.zzacb.set(i2, zzf);
        }
        return zzf;
    }

    static {
        zzik zzik;
        new zzik();
        zzik zzik2 = zzik;
        zzabz = zzik2;
        zzik2.zzfy();
    }
}
