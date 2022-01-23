package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzia extends zzgc<String> implements zzid, RandomAccess {
    private static final zzia zza;
    private static final zzid zzb = zza;
    private final List<Object> zzc;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzia() {
        this(10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzia(int r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzia.<init>(int):void");
    }

    private zzia(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    public final int size() {
        return this.zzc.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        int i2 = i;
        Collection<? extends String> collection2 = collection;
        zzc();
        boolean addAll = this.zzc.addAll(i2, collection2 instanceof zzid ? ((zzid) collection2).zzd() : collection2);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzc();
        this.zzc.clear();
        this.modCount++;
    }

    public final Object zzb(int i) {
        return this.zzc.get(i);
    }

    private static String zza(Object obj) {
        Object obj2 = obj;
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof zzgi) {
            return ((zzgi) obj2).zzb();
        }
        return zzho.zzb((byte[]) obj2);
    }

    public final List<?> zzd() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final zzid zze() {
        zzid zzid;
        if (zza()) {
            new zzkf(this);
            return zzid;
        }
        return this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        zzc();
        return zza(this.zzc.set(i, str));
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
        zzc();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zza(remove);
    }

    public final /* bridge */ /* synthetic */ boolean zza() {
        return super.zza();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzc();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ zzht zza(int i) {
        ArrayList arrayList;
        zzht zzht;
        Throwable th;
        int i2 = i;
        if (i2 < size()) {
            Throwable th2 = th;
            new IllegalArgumentException();
            throw th2;
        }
        new ArrayList(i2);
        ArrayList arrayList2 = arrayList;
        boolean addAll = arrayList2.addAll(this.zzc);
        new zzia((ArrayList<Object>) arrayList2);
        return zzht;
    }

    public final /* synthetic */ Object get(int i) {
        int i2 = i;
        Object obj = this.zzc.get(i2);
        Object obj2 = obj;
        if (obj instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof zzgi) {
            zzgi zzgi = (zzgi) obj2;
            String zzb2 = zzgi.zzb();
            if (zzgi.zzc()) {
                Object obj3 = this.zzc.set(i2, zzb2);
            }
            return zzb2;
        }
        byte[] bArr = (byte[]) obj2;
        String zzb3 = zzho.zzb(bArr);
        if (zzho.zza(bArr)) {
            Object obj4 = this.zzc.set(i2, zzb3);
        }
        return zzb3;
    }

    static {
        zzia zzia;
        new zzia();
        zzia zzia2 = zzia;
        zza = zzia2;
        zzia2.zzb();
    }
}
