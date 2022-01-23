package com.google.android.gms.internal.auth;

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

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
class zzjn<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zza;
    /* access modifiers changed from: private */
    public List<zzjs> zzb;
    /* access modifiers changed from: private */
    public Map<K, V> zzc;
    private boolean zzd;
    private volatile zzju zze;
    /* access modifiers changed from: private */
    public Map<K, V> zzf;
    private volatile zzjo zzg;

    static <FieldDescriptorType extends zzhg<FieldDescriptorType>> zzjn<FieldDescriptorType, Object> zza(int i) {
        zzjn<FieldDescriptorType, Object> zzjn;
        new zzjm(i);
        return zzjn;
    }

    private zzjn(int i) {
        this.zza = i;
        this.zzb = Collections.emptyList();
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    public void zza() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.zzd) {
            if (this.zzc.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.zzc);
            }
            this.zzc = unmodifiableMap;
            if (this.zzf.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.zzf);
            }
            this.zzf = unmodifiableMap2;
            this.zzd = true;
        }
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final Map.Entry<K, V> zzb(int i) {
        return this.zzb.get(i);
    }

    public final Iterable<Map.Entry<K, V>> zzd() {
        if (this.zzc.isEmpty()) {
            return zzjr.zza();
        }
        return this.zzc.entrySet();
    }

    public int size() {
        return this.zzb.size() + this.zzc.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza2 = zza(comparable);
        int i = zza2;
        if (zza2 >= 0) {
            return this.zzb.get(i).getValue();
        }
        return this.zzc.get(comparable);
    }

    /* renamed from: zza */
    public final V put(K k, V v) {
        Object obj;
        List<zzjs> list;
        K k2 = k;
        V v2 = v;
        zzf();
        int zza2 = zza(k2);
        int i = zza2;
        if (zza2 >= 0) {
            return this.zzb.get(i).setValue(v2);
        }
        zzf();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            new ArrayList(this.zza);
            this.zzb = list;
        }
        int i2 = -(i + 1);
        int i3 = i2;
        if (i2 >= this.zza) {
            return zzg().put(k2, v2);
        }
        if (this.zzb.size() == this.zza) {
            zzjs remove = this.zzb.remove(this.zza - 1);
            Object put = zzg().put((Comparable) remove.getKey(), remove.getValue());
        }
        new zzjs(this, k2, v2);
        this.zzb.add(i3, obj);
        return null;
    }

    public void clear() {
        zzf();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    public V remove(Object obj) {
        zzf();
        Comparable comparable = (Comparable) obj;
        int zza2 = zza(comparable);
        int i = zza2;
        if (zza2 >= 0) {
            return zzc(i);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    /* access modifiers changed from: private */
    public final V zzc(int i) {
        Object obj;
        zzf();
        V value = this.zzb.remove(i).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator it = zzg().entrySet().iterator();
            new zzjs(this, (Map.Entry) it.next());
            boolean add = this.zzb.add(obj);
            it.remove();
        }
        return value;
    }

    private final int zza(K k) {
        K k2 = k;
        int i = 0;
        int size = this.zzb.size() - 1;
        int i2 = size;
        if (size >= 0) {
            int compareTo = k2.compareTo((Comparable) this.zzb.get(i2).getKey());
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
            int compareTo2 = k2.compareTo((Comparable) this.zzb.get(i4).getKey());
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
        zzju zzju;
        if (this.zze == null) {
            new zzju(this, (zzjm) null);
            this.zze = zzju;
        }
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zze() {
        zzjo zzjo;
        if (this.zzg == null) {
            new zzjo(this, (zzjm) null);
            this.zzg = zzjo;
        }
        return this.zzg;
    }

    /* access modifiers changed from: private */
    public final void zzf() {
        Throwable th;
        if (this.zzd) {
            Throwable th2 = th;
            new UnsupportedOperationException();
            throw th2;
        }
    }

    private final SortedMap<K, V> zzg() {
        Map<K, V> map;
        zzf();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            new TreeMap();
            this.zzc = map;
            this.zzf = ((TreeMap) this.zzc).descendingMap();
        }
        return (SortedMap) this.zzc;
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
            boolean r6 = r6 instanceof com.google.android.gms.internal.auth.zzjn
            if (r6 != 0) goto L_0x0016
            r6 = r0
            r7 = r1
            boolean r6 = super.equals(r7)
            r0 = r6
            goto L_0x0008
        L_0x0016:
            r6 = r1
            com.google.android.gms.internal.auth.zzjn r6 = (com.google.android.gms.internal.auth.zzjn) r6
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
            int r6 = r6.zzc()
            r9 = r6
            r6 = r9
            r7 = r9
            r4 = r7
            r7 = r2
            int r7 = r7.zzc()
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
            java.util.Map$Entry r6 = r6.zzb((int) r7)
            r7 = r2
            r8 = r5
            java.util.Map$Entry r7 = r7.zzb((int) r8)
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
            java.util.Map<K, V> r6 = r6.zzc
            r7 = r2
            java.util.Map<K, V> r7 = r7.zzc
            boolean r6 = r6.equals(r7)
            r0 = r6
            goto L_0x0008
        L_0x007b:
            r6 = 1
            r0 = r6
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzjn.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int zzc2 = zzc();
        for (int i2 = 0; i2 < zzc2; i2++) {
            i += this.zzb.get(i2).hashCode();
        }
        if (this.zzc.size() > 0) {
            i += this.zzc.hashCode();
        }
        return i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzjn(int i, zzjm zzjm) {
        this(i);
        zzjm zzjm2 = zzjm;
    }
}
