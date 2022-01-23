package com.google.android.gms.internal.auth;

import gnu.expr.Declaration;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzef */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0890zzef<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */
    public static final Object zzd;
    @NullableDecl
    transient int[] zza;
    @NullableDecl
    transient Object[] zzb;
    @NullableDecl
    transient Object[] zzc;
    /* access modifiers changed from: private */
    @NullableDecl
    public transient Object zze;
    /* access modifiers changed from: private */
    public transient int zzf;
    private transient int zzg;
    @NullableDecl
    private transient Set<K> zzh;
    @NullableDecl
    private transient Set<Map.Entry<K, V>> zzi;
    @NullableDecl
    private transient Collection<V> zzj;

    C0890zzef() {
        C0874zzdq.zza(true, (Object) "Expected size must be >= 0");
        int zza2 = C0926zzfo.zza(3, 1, 1073741823);
        this.zzf = zza2;
    }

    /* access modifiers changed from: package-private */
    public final boolean zza() {
        return this.zze == null;
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public final Map<K, V> zzb() {
        if (this.zze instanceof Map) {
            return (Map) this.zze;
        }
        return null;
    }

    private final void zzb(int i) {
        this.zzf = C0897zzem.zza(this.zzf, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    /* access modifiers changed from: private */
    public final int zzi() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        this.zzf += 32;
    }

    @NullableDecl
    public final V put(@NullableDecl K k, @NullableDecl V v) {
        int i;
        int i2;
        Map map;
        int i3;
        K k2 = k;
        V v2 = v;
        if (zza()) {
            C0874zzdq.zzb(zza(), (Object) "Arrays already allocated");
            int i4 = this.zzf;
            int i5 = i4;
            int max = Math.max(i4 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * ((double) highestOneBit)))) {
                int i6 = highestOneBit << 1;
                highestOneBit = i6;
                if (i6 <= 0) {
                    i3 = Declaration.MODULE_REFERENCE;
                    int max2 = Math.max(4, i3);
                    this.zze = C0897zzem.zza(max2);
                    zzb(max2 - 1);
                    this.zza = new int[i5];
                    this.zzb = new Object[i5];
                    this.zzc = new Object[i5];
                }
            }
            i3 = highestOneBit;
            int max22 = Math.max(4, i3);
            this.zze = C0897zzem.zza(max22);
            zzb(max22 - 1);
            this.zza = new int[i5];
            this.zzb = new Object[i5];
            this.zzc = new Object[i5];
        }
        Map zzb2 = zzb();
        Map map2 = zzb2;
        if (zzb2 != null) {
            return map2.put(k2, v2);
        }
        int[] iArr = this.zza;
        Object[] objArr = this.zzb;
        V[] vArr = this.zzc;
        int i7 = this.zzg;
        int i8 = i7;
        int i9 = i7 + 1;
        int zza2 = C0899zzeo.zza((Object) k2);
        int zzi2 = zzi();
        int i10 = zza2 & zzi2;
        int zza3 = C0897zzem.zza(this.zze, i10);
        int i11 = zza3;
        if (zza3 != 0) {
            int i12 = zza2 & (zzi2 ^ -1);
            int i13 = 0;
            do {
                i = i11 - 1;
                int i14 = iArr[i];
                i2 = i14;
                if ((i14 & (zzi2 ^ -1)) != i12 || !C0872zzdo.zza(k2, objArr[i])) {
                    i11 = i2 & zzi2;
                    i13++;
                } else {
                    V v3 = vArr[i];
                    vArr[i] = v2;
                    return v3;
                }
            } while (i11 != 0);
            if (i13 >= 9) {
                new LinkedHashMap(zzi() + 1, 1.0f);
                Map map3 = map;
                int zzd2 = zzd();
                while (true) {
                    int i15 = zzd2;
                    if (i15 >= 0) {
                        Object put = map3.put(this.zzb[i15], this.zzc[i15]);
                        zzd2 = zza(i15);
                    } else {
                        this.zze = map3;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzc();
                        return map3.put(k2, v2);
                    }
                }
            } else if (i9 > zzi2) {
                zzi2 = zza(zzi2, C0897zzem.zzb(zzi2), zza2, i8);
            } else {
                iArr[i] = C0897zzem.zza(i2, i8 + 1, zzi2);
            }
        } else if (i9 > zzi2) {
            zzi2 = zza(zzi2, C0897zzem.zzb(zzi2), zza2, i8);
        } else {
            C0897zzem.zza(this.zze, i10, i8 + 1);
        }
        int i16 = i9;
        int length = this.zza.length;
        if (i16 > length) {
            int min = Math.min(1073741823, (length + Math.max(1, length >>> 1)) | 1);
            int i17 = min;
            if (min != length) {
                int i18 = i17;
                this.zza = Arrays.copyOf(this.zza, i18);
                this.zzb = Arrays.copyOf(this.zzb, i18);
                this.zzc = Arrays.copyOf(this.zzc, i18);
            }
        }
        int i19 = i8;
        this.zza[i19] = C0897zzem.zza(zza2, 0, zzi2);
        this.zzb[i19] = k2;
        this.zzc[i19] = v2;
        this.zzg = i9;
        zzc();
        return null;
    }

    private final int zza(int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        Object zza2 = C0897zzem.zza(i6);
        int i9 = i6 - 1;
        if (i8 != 0) {
            C0897zzem.zza(zza2, i7 & i9, i8 + 1);
        }
        Object obj = this.zze;
        int[] iArr = this.zza;
        for (int i10 = 0; i10 <= i5; i10++) {
            int zza3 = C0897zzem.zza(obj, i10);
            while (true) {
                int i11 = zza3;
                if (i11 == 0) {
                    break;
                }
                int i12 = i11 - 1;
                int i13 = iArr[i12];
                int i14 = i13;
                int i15 = (i13 & (i5 ^ -1)) | i10;
                int i16 = i15 & i9;
                int zza4 = C0897zzem.zza(zza2, i16);
                C0897zzem.zza(zza2, i16, i11);
                iArr[i12] = C0897zzem.zza(i15, zza4, i9);
                zza3 = i14 & i5;
            }
        }
        this.zze = zza2;
        zzb(i9);
        return i9;
    }

    /* access modifiers changed from: private */
    public final int zza(@NullableDecl Object obj) {
        int i;
        Object obj2 = obj;
        if (zza()) {
            return -1;
        }
        int zza2 = C0899zzeo.zza(obj2);
        int zzi2 = zzi();
        int zza3 = C0897zzem.zza(this.zze, zza2 & zzi2);
        int i2 = zza3;
        if (zza3 == 0) {
            return -1;
        }
        int i3 = zza2 & (zzi2 ^ -1);
        do {
            int i4 = i2 - 1;
            int i5 = this.zza[i4];
            int i6 = i5;
            if ((i5 & (zzi2 ^ -1)) == i3 && C0872zzdo.zza(obj2, this.zzb[i4])) {
                return i4;
            }
            i = i6 & zzi2;
            i2 = i;
        } while (i != 0);
        return -1;
    }

    public final boolean containsKey(@NullableDecl Object obj) {
        Object obj2 = obj;
        Map zzb2 = zzb();
        Map map = zzb2;
        if (zzb2 != null) {
            return map.containsKey(obj2);
        }
        return zza(obj2) != -1;
    }

    public final V get(@NullableDecl Object obj) {
        Object obj2 = obj;
        Map zzb2 = zzb();
        Map map = zzb2;
        if (zzb2 != null) {
            return map.get(obj2);
        }
        int zza2 = zza(obj2);
        int i = zza2;
        if (zza2 == -1) {
            return null;
        }
        return this.zzc[i];
    }

    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Object obj2 = obj;
        Map zzb2 = zzb();
        Map map = zzb2;
        if (zzb2 != null) {
            return map.remove(obj2);
        }
        V zzb3 = zzb(obj2);
        V v = zzb3;
        if (zzb3 == zzd) {
            return null;
        }
        return v;
    }

    /* access modifiers changed from: private */
    @NullableDecl
    public final Object zzb(@NullableDecl Object obj) {
        Object obj2 = obj;
        if (zza()) {
            return zzd;
        }
        int zzi2 = zzi();
        int zza2 = C0897zzem.zza(obj2, (Object) null, zzi2, this.zze, this.zza, this.zzb, (Object[]) null);
        int i = zza2;
        if (zza2 == -1) {
            return zzd;
        }
        Object obj3 = this.zzc[i];
        zza(i, zzi2);
        this.zzg--;
        zzc();
        return obj3;
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i;
        int i7 = i2;
        int size = size() - 1;
        if (i6 < size) {
            Object obj = this.zzb[size];
            this.zzb[i6] = obj;
            this.zzc[i6] = this.zzc[size];
            this.zzb[size] = null;
            this.zzc[size] = null;
            this.zza[i6] = this.zza[size];
            this.zza[size] = 0;
            int zza2 = C0899zzeo.zza(obj) & i7;
            int zza3 = C0897zzem.zza(this.zze, zza2);
            int i8 = size + 1;
            if (zza3 == i8) {
                C0897zzem.zza(this.zze, zza2, i6 + 1);
                return;
            }
            do {
                i3 = zza3 - 1;
                int i9 = this.zza[i3];
                i4 = i9;
                i5 = i9 & i7;
                zza3 = i5;
            } while (i5 != i8);
            this.zza[i3] = C0897zzem.zza(i4, i6 + 1, i7);
            return;
        }
        this.zzb[i6] = null;
        this.zzc[i6] = null;
        this.zza[i6] = 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzd() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    public final int zza(int i) {
        int i2 = i;
        if (i2 + 1 < this.zzg) {
            return i2 + 1;
        }
        return -1;
    }

    static int zzb(int i, int i2) {
        int i3 = i2;
        return i - 1;
    }

    public final Set<K> keySet() {
        Set<K> set;
        if (this.zzh != null) {
            return this.zzh;
        }
        Set<K> set2 = set;
        new C0896zzel(this);
        Set<K> set3 = set2;
        Set<K> set4 = set3;
        this.zzh = set4;
        return set3;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<K> zze() {
        Iterator<K> it;
        Map zzb2 = zzb();
        Map map = zzb2;
        if (zzb2 != null) {
            return map.keySet().iterator();
        }
        new C0889zzee(this);
        return it;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set;
        if (this.zzi != null) {
            return this.zzi;
        }
        Set<Map.Entry<K, V>> set2 = set;
        new C0894zzej(this);
        Set<Map.Entry<K, V>> set3 = set2;
        Set<Map.Entry<K, V>> set4 = set3;
        this.zzi = set4;
        return set3;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<K, V>> zzf() {
        Iterator<Map.Entry<K, V>> it;
        Map zzb2 = zzb();
        Map map = zzb2;
        if (zzb2 != null) {
            return map.entrySet().iterator();
        }
        new C0892zzeh(this);
        return it;
    }

    public final int size() {
        Map zzb2 = zzb();
        return zzb2 != null ? zzb2.size() : this.zzg;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final boolean containsValue(@NullableDecl Object obj) {
        Object obj2 = obj;
        Map zzb2 = zzb();
        Map map = zzb2;
        if (zzb2 != null) {
            return map.containsValue(obj2);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (C0872zzdo.zza(obj2, this.zzc[i])) {
                return true;
            }
        }
        return false;
    }

    public final Collection<V> values() {
        Collection<V> collection;
        if (this.zzj != null) {
            return this.zzj;
        }
        Collection<V> collection2 = collection;
        new C0898zzen(this);
        Collection<V> collection3 = collection2;
        Collection<V> collection4 = collection3;
        this.zzj = collection4;
        return collection3;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<V> zzg() {
        Iterator<V> it;
        Map zzb2 = zzb();
        Map map = zzb2;
        if (zzb2 != null) {
            return map.values().iterator();
        }
        new C0891zzeg(this);
        return it;
    }

    public final void clear() {
        if (!zza()) {
            zzc();
            Map zzb2 = zzb();
            Map map = zzb2;
            if (zzb2 != null) {
                this.zzf = C0926zzfo.zza(size(), 3, 1073741823);
                map.clear();
                this.zze = null;
                this.zzg = 0;
                return;
            }
            Arrays.fill(this.zzb, 0, this.zzg, (Object) null);
            Arrays.fill(this.zzc, 0, this.zzg, (Object) null);
            Object obj = this.zze;
            Object obj2 = obj;
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj2, (byte) 0);
            } else if (obj2 instanceof short[]) {
                Arrays.fill((short[]) obj2, 0);
            } else {
                Arrays.fill((int[]) obj2, 0);
            }
            Arrays.fill(this.zza, 0, this.zzg, 0);
            this.zzg = 0;
        }
    }

    static /* synthetic */ int zzd(C0890zzef zzef) {
        C0890zzef zzef2 = zzef;
        int i = zzef2.zzg;
        zzef2.zzg = i - 1;
        return i;
    }

    static {
        Object obj;
        new Object();
        zzd = obj;
    }
}
