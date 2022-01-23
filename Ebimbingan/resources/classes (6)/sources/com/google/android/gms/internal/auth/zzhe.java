package com.google.android.gms.internal.auth;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.auth.zzhg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzhe<T extends zzhg<T>> {
    private static final zzhe zzd;
    final zzjn<T, Object> zza;
    private boolean zzb;
    private boolean zzc;

    private zzhe() {
        this.zza = zzjn.zza(16);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private zzhe(boolean z) {
        this(zzjn.zza(0));
        boolean z2 = z;
        zzb();
    }

    private zzhe(zzjn<T, Object> zzjn) {
        this.zza = zzjn;
        zzb();
    }

    public static <T extends zzhg<T>> zzhe<T> zza() {
        return zzd;
    }

    public final void zzb() {
        if (!this.zzb) {
            this.zza.zza();
            this.zzb = true;
        }
    }

    public final boolean zzc() {
        return this.zzb;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
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
            boolean r3 = r3 instanceof com.google.android.gms.internal.auth.zzhe
            if (r3 != 0) goto L_0x0011
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x0011:
            r3 = r1
            com.google.android.gms.internal.auth.zzhe r3 = (com.google.android.gms.internal.auth.zzhe) r3
            r2 = r3
            r3 = r0
            com.google.android.gms.internal.auth.zzjn<T, java.lang.Object> r3 = r3.zza
            r4 = r2
            com.google.android.gms.internal.auth.zzjn<T, java.lang.Object> r4 = r4.zza
            boolean r3 = r3.equals(r4)
            r0 = r3
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzhe.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        Iterator<Map.Entry<T, Object>> it;
        if (!this.zzc) {
            return this.zza.entrySet().iterator();
        }
        new zzhy(this.zza.entrySet().iterator());
        return it;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> zze() {
        Iterator<Map.Entry<T, Object>> it;
        if (!this.zzc) {
            return this.zza.zze().iterator();
        }
        new zzhy(this.zza.zze().iterator());
        return it;
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        Object obj2 = obj;
        if (!(obj instanceof zzhx)) {
            return obj2;
        }
        zzhx zzhx = (zzhx) obj2;
        return zzhx.zza();
    }

    private final void zzb(T t, Object obj) {
        ArrayList arrayList;
        Throwable th;
        T t2 = t;
        ArrayList arrayList2 = obj;
        if (!t2.zzd()) {
            zza(t2.zzb(), arrayList2);
        } else if (!(arrayList2 instanceof List)) {
            Throwable th2 = th;
            new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            throw th2;
        } else {
            new ArrayList();
            ArrayList arrayList3 = arrayList;
            ArrayList arrayList4 = arrayList3;
            boolean addAll = arrayList3.addAll((List) arrayList2);
            ArrayList arrayList5 = arrayList4;
            ArrayList arrayList6 = arrayList5;
            int size = arrayList5.size();
            int i = 0;
            while (i < size) {
                i++;
                zza(t2.zzb(), arrayList6.get(i));
            }
            arrayList2 = arrayList4;
        }
        if (arrayList2 instanceof zzhx) {
            this.zzc = true;
        }
        Object zza2 = this.zza.put(t2, arrayList2);
    }

    private static void zza(zzkr zzkr, Object obj) {
        boolean z;
        Throwable th;
        Object obj2 = obj;
        zzkr zzkr2 = zzkr;
        Object zza2 = zzho.zza(obj2);
        switch (zzhh.zza[zzkr2.zza().ordinal()]) {
            case 1:
                z = obj2 instanceof Integer;
                break;
            case 2:
                z = obj2 instanceof Long;
                break;
            case 3:
                z = obj2 instanceof Float;
                break;
            case 4:
                z = obj2 instanceof Double;
                break;
            case 5:
                z = obj2 instanceof Boolean;
                break;
            case 6:
                z = obj2 instanceof String;
                break;
            case 7:
                if (!(obj2 instanceof zzgi) && !(obj2 instanceof byte[])) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
                break;
            case 8:
                if (!(obj2 instanceof Integer) && !(obj2 instanceof zzhr)) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
                break;
            case ConnectionResult.SERVICE_INVALID:
                if (!(obj2 instanceof zzis) && !(obj2 instanceof zzhx)) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            Throwable th2 = th;
            new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            throw th2;
        }
    }

    public final boolean zzf() {
        for (int i = 0; i < this.zza.zzc(); i++) {
            if (!zza(this.zza.zzb(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> zza2 : this.zza.zzd()) {
            if (!zza(zza2)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzhg<T>> boolean zza(Map.Entry<T, Object> entry) {
        Throwable th;
        Map.Entry<T, Object> entry2 = entry;
        zzhg zzhg = (zzhg) entry2.getKey();
        zzhg zzhg2 = zzhg;
        if (zzhg.zzc() == zzku.zzi) {
            if (zzhg2.zzd()) {
                for (zzis zzc2 : (List) entry2.getValue()) {
                    if (!zzc2.zzc()) {
                        return false;
                    }
                }
            } else {
                Object value = entry2.getValue();
                Object obj = value;
                if (value instanceof zzis) {
                    if (!((zzis) obj).zzc()) {
                        return false;
                    }
                } else if (obj instanceof zzhx) {
                    return true;
                } else {
                    Throwable th2 = th;
                    new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    throw th2;
                }
            }
        }
        return true;
    }

    public final void zza(zzhe<T> zzhe) {
        zzhe<T> zzhe2 = zzhe;
        for (int i = 0; i < zzhe2.zza.zzc(); i++) {
            zzb(zzhe2.zza.zzb(i));
        }
        for (Map.Entry zzb2 : zzhe2.zza.zzd()) {
            zzb(zzb2);
        }
    }

    private static Object zza(Object obj) {
        Object obj2 = obj;
        if (obj2 instanceof zzjb) {
            return ((zzjb) obj2).zzb();
        }
        if (!(obj2 instanceof byte[])) {
            return obj2;
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = bArr;
        byte[] bArr3 = new byte[bArr.length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        return bArr3;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        zzjb zzg;
        Object obj;
        Map.Entry<T, Object> entry2 = entry;
        zzhg zzhg = (zzhg) entry2.getKey();
        Object value = entry2.getValue();
        zzis zzis = value;
        if (value instanceof zzhx) {
            zzhx zzhx = (zzhx) zzis;
            zzis = zzhx.zza();
        }
        if (zzhg.zzd()) {
            Object zza2 = zza(zzhg);
            Object obj2 = zza2;
            if (zza2 == null) {
                new ArrayList();
                obj2 = obj;
            }
            for (Object zza3 : (List) zzis) {
                boolean add = ((List) obj2).add(zza(zza3));
            }
            Object zza4 = this.zza.put(zzhg, obj2);
        } else if (zzhg.zzc() == zzku.zzi) {
            Object zza5 = zza(zzhg);
            Object obj3 = zza5;
            if (zza5 == null) {
                Object zza6 = this.zza.put(zzhg, zza(zzis));
                return;
            }
            if (obj3 instanceof zzjb) {
                zzg = zzhg.zza((zzjb) obj3, (zzjb) zzis);
            } else {
                zzg = zzhg.zza(((zzis) obj3).zzf(), (zzis) zzis).zzg();
            }
            Object zza7 = this.zza.put(zzhg, zzg);
        } else {
            Object zza8 = this.zza.put(zzhg, zza(zzis));
        }
    }

    static void zza(zzgv zzgv, zzkr zzkr, int i, Object obj) throws IOException {
        zzgv zzgv2 = zzgv;
        zzkr zzkr2 = zzkr;
        int i2 = i;
        Object obj2 = obj;
        if (zzkr2 == zzkr.zzj) {
            boolean zza2 = zzho.zza((zzis) obj2);
            int i3 = i2;
            zzgv zzgv3 = zzgv2;
            zzgv zzgv4 = zzgv3;
            zzgv3.zza(i3, 3);
            ((zzis) obj2).zza(zzgv4);
            zzgv4.zza(i3, 4);
            return;
        }
        zzgv2.zza(i2, zzkr2.zzb());
        Object obj3 = obj2;
        zzgv zzgv5 = zzgv2;
        switch (zzhh.zzb[zzkr2.ordinal()]) {
            case 1:
                zzgv5.zza(((Double) obj3).doubleValue());
                return;
            case 2:
                zzgv5.zza(((Float) obj3).floatValue());
                return;
            case 3:
                zzgv5.zza(((Long) obj3).longValue());
                return;
            case 4:
                zzgv5.zza(((Long) obj3).longValue());
                return;
            case 5:
                zzgv5.zza(((Integer) obj3).intValue());
                return;
            case 6:
                zzgv5.zzc(((Long) obj3).longValue());
                return;
            case 7:
                zzgv5.zzd(((Integer) obj3).intValue());
                return;
            case 8:
                zzgv5.zza(((Boolean) obj3).booleanValue());
                return;
            case ConnectionResult.SERVICE_INVALID:
                ((zzis) obj3).zza(zzgv5);
                return;
            case 10:
                zzgv5.zza((zzis) obj3);
                return;
            case ConnectionResult.LICENSE_CHECK_FAILED:
                if (obj3 instanceof zzgi) {
                    zzgv5.zza((zzgi) obj3);
                    return;
                } else {
                    zzgv5.zza((String) obj3);
                    return;
                }
            case 12:
                if (obj3 instanceof zzgi) {
                    zzgv5.zza((zzgi) obj3);
                    return;
                }
                byte[] bArr = (byte[]) obj3;
                zzgv5.zzb(bArr, 0, bArr.length);
                return;
            case 13:
                zzgv5.zzb(((Integer) obj3).intValue());
                return;
            case 14:
                zzgv5.zzd(((Integer) obj3).intValue());
                return;
            case 15:
                zzgv5.zzc(((Long) obj3).longValue());
                return;
            case 16:
                zzgv5.zzc(((Integer) obj3).intValue());
                return;
            case 17:
                zzgv5.zzb(((Long) obj3).longValue());
                return;
            case ConnectionResult.SERVICE_UPDATING:
                if (obj3 instanceof zzhr) {
                    zzgv5.zza(((zzhr) obj3).zza());
                    return;
                } else {
                    zzgv5.zza(((Integer) obj3).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzg() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzc(); i2++) {
            i += zzc(this.zza.zzb(i2));
        }
        for (Map.Entry zzc2 : this.zza.zzd()) {
            i += zzc(zzc2);
        }
        return i;
    }

    private static int zzc(Map.Entry<T, Object> entry) {
        Map.Entry<T, Object> entry2 = entry;
        zzhg zzhg = (zzhg) entry2.getKey();
        Object value = entry2.getValue();
        if (zzhg.zzc() != zzku.zzi || zzhg.zzd() || zzhg.zze()) {
            return zza((zzhg<?>) zzhg, value);
        }
        if (value instanceof zzhx) {
            return zzgv.zzb(((zzhg) entry2.getKey()).zza(), (zzib) (zzhx) value);
        }
        return zzgv.zzb(((zzhg) entry2.getKey()).zza(), (zzis) value);
    }

    static int zza(zzkr zzkr, int i, Object obj) {
        zzkr zzkr2 = zzkr;
        Object obj2 = obj;
        int zze = zzgv.zze(i);
        if (zzkr2 == zzkr.zzj) {
            boolean zza2 = zzho.zza((zzis) obj2);
            zze <<= 1;
        }
        return zze + zzb(zzkr2, obj2);
    }

    private static int zzb(zzkr zzkr, Object obj) {
        Throwable th;
        Object obj2 = obj;
        switch (zzhh.zzb[zzkr.ordinal()]) {
            case 1:
                return zzgv.zzb(((Double) obj2).doubleValue());
            case 2:
                return zzgv.zzb(((Float) obj2).floatValue());
            case 3:
                return zzgv.zzd(((Long) obj2).longValue());
            case 4:
                return zzgv.zze(((Long) obj2).longValue());
            case 5:
                return zzgv.zzf(((Integer) obj2).intValue());
            case 6:
                return zzgv.zzg(((Long) obj2).longValue());
            case 7:
                return zzgv.zzi(((Integer) obj2).intValue());
            case 8:
                return zzgv.zzb(((Boolean) obj2).booleanValue());
            case ConnectionResult.SERVICE_INVALID:
                return zzgv.zzc((zzis) obj2);
            case 10:
                if (obj2 instanceof zzhx) {
                    return zzgv.zza((zzib) (zzhx) obj2);
                }
                return zzgv.zzb((zzis) obj2);
            case ConnectionResult.LICENSE_CHECK_FAILED:
                if (obj2 instanceof zzgi) {
                    return zzgv.zzb((zzgi) obj2);
                }
                return zzgv.zzb((String) obj2);
            case 12:
                if (obj2 instanceof zzgi) {
                    return zzgv.zzb((zzgi) obj2);
                }
                return zzgv.zzb((byte[]) obj2);
            case 13:
                return zzgv.zzg(((Integer) obj2).intValue());
            case 14:
                return zzgv.zzj(((Integer) obj2).intValue());
            case 15:
                return zzgv.zzh(((Long) obj2).longValue());
            case 16:
                return zzgv.zzh(((Integer) obj2).intValue());
            case 17:
                return zzgv.zzf(((Long) obj2).longValue());
            case ConnectionResult.SERVICE_UPDATING:
                if (obj2 instanceof zzhr) {
                    return zzgv.zzk(((zzhr) obj2).zza());
                }
                return zzgv.zzk(((Integer) obj2).intValue());
            default:
                Throwable th2 = th;
                new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                throw th2;
        }
    }

    public static int zza(zzhg<?> zzhg, Object obj) {
        zzhg<?> zzhg2 = zzhg;
        Object obj2 = obj;
        zzkr zzb2 = zzhg2.zzb();
        int zza2 = zzhg2.zza();
        if (!zzhg2.zzd()) {
            return zza(zzb2, zza2, obj2);
        }
        if (zzhg2.zze()) {
            int i = 0;
            for (Object zzb3 : (List) obj2) {
                i += zzb(zzb2, zzb3);
            }
            return i + zzgv.zze(zza2) + zzgv.zzl(i);
        }
        int i2 = 0;
        for (Object zza3 : (List) obj2) {
            i2 += zza(zzb2, zza2, zza3);
        }
        return i2;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzhe zzhe;
        new zzhe();
        zzhe zzhe2 = zzhe;
        for (int i = 0; i < this.zza.zzc(); i++) {
            Map.Entry<T, Object> zzb2 = this.zza.zzb(i);
            zzhe2.zzb((zzhg) zzb2.getKey(), zzb2.getValue());
        }
        for (Map.Entry next : this.zza.zzd()) {
            zzhe2.zzb((zzhg) next.getKey(), next.getValue());
        }
        zzhe2.zzc = this.zzc;
        return zzhe2;
    }

    static {
        zzhe zzhe;
        new zzhe(true);
        zzd = zzhe;
    }
}
