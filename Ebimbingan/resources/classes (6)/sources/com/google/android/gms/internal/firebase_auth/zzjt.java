package com.google.android.gms.internal.firebase_auth;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzjt<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zzadq;
    /* access modifiers changed from: private */
    public List<zzkc> zzadr;
    /* access modifiers changed from: private */
    public Map<K, V> zzads;
    private volatile zzke zzadt;
    /* access modifiers changed from: private */
    public Map<K, V> zzadu;
    private volatile zzjy zzadv;
    private boolean zzxi;

    static <FieldDescriptorType extends zzhk<FieldDescriptorType>> zzjt<FieldDescriptorType, Object> zzbe(int i) {
        zzjt<FieldDescriptorType, Object> zzjt;
        new zzjw(i);
        return zzjt;
    }

    private zzjt(int i) {
        this.zzadq = i;
        this.zzadr = Collections.emptyList();
        this.zzads = Collections.emptyMap();
        this.zzadu = Collections.emptyMap();
    }

    public void zzfy() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.zzxi) {
            if (this.zzads.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.zzads);
            }
            this.zzads = unmodifiableMap;
            if (this.zzadu.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.zzadu);
            }
            this.zzadu = unmodifiableMap2;
            this.zzxi = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzxi;
    }

    public final int zzjy() {
        return this.zzadr.size();
    }

    public final Map.Entry<K, V> zzbf(int i) {
        return this.zzadr.get(i);
    }

    public final Iterable<Map.Entry<K, V>> zzjz() {
        if (this.zzads.isEmpty()) {
            return zzjx.zzkj();
        }
        return this.zzads.entrySet();
    }

    public int size() {
        return this.zzadr.size() + this.zzads.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzads.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        int i = zza;
        if (zza >= 0) {
            return this.zzadr.get(i).getValue();
        }
        return this.zzads.get(comparable);
    }

    /* renamed from: zza */
    public final V put(K k, V v) {
        Object obj;
        List<zzkc> list;
        K k2 = k;
        V v2 = v;
        zzkb();
        int zza = zza(k2);
        int i = zza;
        if (zza >= 0) {
            return this.zzadr.get(i).setValue(v2);
        }
        zzkb();
        if (this.zzadr.isEmpty() && !(this.zzadr instanceof ArrayList)) {
            new ArrayList(this.zzadq);
            this.zzadr = list;
        }
        int i2 = -(i + 1);
        int i3 = i2;
        if (i2 >= this.zzadq) {
            return zzkc().put(k2, v2);
        }
        if (this.zzadr.size() == this.zzadq) {
            zzkc remove = this.zzadr.remove(this.zzadq - 1);
            Object put = zzkc().put((Comparable) remove.getKey(), remove.getValue());
        }
        new zzkc(this, k2, v2);
        this.zzadr.add(i3, obj);
        return null;
    }

    public void clear() {
        zzkb();
        if (!this.zzadr.isEmpty()) {
            this.zzadr.clear();
        }
        if (!this.zzads.isEmpty()) {
            this.zzads.clear();
        }
    }

    public V remove(Object obj) {
        zzkb();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        int i = zza;
        if (zza >= 0) {
            return zzbg(i);
        }
        if (this.zzads.isEmpty()) {
            return null;
        }
        return this.zzads.remove(comparable);
    }

    /* access modifiers changed from: private */
    public final V zzbg(int i) {
        Object obj;
        zzkb();
        V value = this.zzadr.remove(i).getValue();
        if (!this.zzads.isEmpty()) {
            Iterator it = zzkc().entrySet().iterator();
            new zzkc(this, (Map.Entry) it.next());
            boolean add = this.zzadr.add(obj);
            it.remove();
        }
        return value;
    }

    private final int zza(K k) {
        K k2 = k;
        int i = 0;
        int size = this.zzadr.size() - 1;
        int i2 = size;
        if (size >= 0) {
            int compareTo = k2.compareTo((Comparable) this.zzadr.get(i2).getKey());
            int i3 = compareTo;
            if (compareTo > 0) {
                return -(i2 + 2);
            }
            if (i3 == 0) {
                return i2;
            }
        }
        while (i <= i2) {
            int i4 = (i + i2) / 2;
            int compareTo2 = k2.compareTo((Comparable) this.zzadr.get(i4).getKey());
            int i5 = compareTo2;
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (i5 <= 0) {
                return i4;
            } else {
                i = i4 + 1;
            }
        }
        return -(i + 1);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        zzke zzke;
        if (this.zzadt == null) {
            new zzke(this, (zzjw) null);
            this.zzadt = zzke;
        }
        return this.zzadt;
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzka() {
        zzjy zzjy;
        if (this.zzadv == null) {
            new zzjy(this, (zzjw) null);
            this.zzadv = zzjy;
        }
        return this.zzadv;
    }

    /* access modifiers changed from: private */
    public final void zzkb() {
        Throwable th;
        if (this.zzxi) {
            Throwable th2 = th;
            new UnsupportedOperationException();
            throw th2;
        }
    }

    private final SortedMap<K, V> zzkc() {
        Map<K, V> map;
        zzkb();
        if (this.zzads.isEmpty() && !(this.zzads instanceof TreeMap)) {
            new TreeMap();
            this.zzads = map;
            this.zzadu = ((TreeMap) this.zzads).descendingMap();
        }
        return (SortedMap) this.zzads;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r6 = r0
            r7 = r1
            if (r6 != r7) goto L_0x0009
            r6 = 1
            r0 = r6
        L_0x0008:
            return r0
        L_0x0009:
            r6 = r1
            boolean r6 = r6 instanceof com.google.android.gms.internal.firebase_auth.zzjt
            if (r6 != 0) goto L_0x0016
            r6 = r0
            r7 = r1
            boolean r6 = super.equals(r7)
            r0 = r6
            goto L_0x0008
        L_0x0016:
            r6 = r1
            com.google.android.gms.internal.firebase_auth.zzjt r6 = (com.google.android.gms.internal.firebase_auth.zzjt) r6
            r2 = r6
            r6 = r0
            int r6 = r6.size()
            r9 = r6
            r6 = r9
            r7 = r9
            r3 = r7
            r7 = r2
            int r7 = r7.size()
            if (r6 == r7) goto L_0x002d
            r6 = 0
            r0 = r6
            goto L_0x0008
        L_0x002d:
            r6 = r0
            int r6 = r6.zzjy()
            r9 = r6
            r6 = r9
            r7 = r9
            r4 = r7
            r7 = r2
            int r7 = r7.zzjy()
            if (r6 == r7) goto L_0x004d
            r6 = r0
            java.util.Set r6 = r6.entrySet()
            r7 = r2
            java.util.Set r7 = r7.entrySet()
            boolean r6 = r6.equals(r7)
            r0 = r6
            goto L_0x0008
        L_0x004d:
            r6 = 0
            r5 = r6
        L_0x004f:
            r6 = r5
            r7 = r4
            if (r6 >= r7) goto L_0x006b
            r6 = r0
            r7 = r5
            java.util.Map$Entry r6 = r6.zzbf(r7)
            r7 = r2
            r8 = r5
            java.util.Map$Entry r7 = r7.zzbf(r8)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0068
            r6 = 0
            r0 = r6
            goto L_0x0008
        L_0x0068:
            int r5 = r5 + 1
            goto L_0x004f
        L_0x006b:
            r6 = r4
            r7 = r3
            if (r6 == r7) goto L_0x007b
            r6 = r0
            java.util.Map<K, V> r6 = r6.zzads
            r7 = r2
            java.util.Map<K, V> r7 = r7.zzads
            boolean r6 = r6.equals(r7)
            r0 = r6
            goto L_0x0008
        L_0x007b:
            r6 = 1
            r0 = r6
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzjt.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int zzjy = zzjy();
        for (int i2 = 0; i2 < zzjy; i2++) {
            i += this.zzadr.get(i2).hashCode();
        }
        if (this.zzads.size() > 0) {
            i += this.zzads.hashCode();
        }
        return i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzjt(int i, zzjw zzjw) {
        this(i);
        zzjw zzjw2 = zzjw;
    }
}
