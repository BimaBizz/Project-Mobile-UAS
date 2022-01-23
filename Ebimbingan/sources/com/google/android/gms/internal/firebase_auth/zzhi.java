package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzhi<FieldDescriptorType extends zzhk<FieldDescriptorType>> {
    private static final zzhi zzxk;
    final zzjt<FieldDescriptorType, Object> zzxh = zzjt.zzbe(16);
    private boolean zzxi;
    private boolean zzxj = false;

    private zzhi() {
    }

    private zzhi(boolean z) {
        boolean z2 = z;
        zzfy();
    }

    public static <T extends zzhk<T>> zzhi<T> zzhs() {
        return zzxk;
    }

    public final void zzfy() {
        if (!this.zzxi) {
            this.zzxh.zzfy();
            this.zzxi = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzxi;
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
            boolean r3 = r3 instanceof com.google.android.gms.internal.firebase_auth.zzhi
            if (r3 != 0) goto L_0x0011
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x0011:
            r3 = r1
            com.google.android.gms.internal.firebase_auth.zzhi r3 = (com.google.android.gms.internal.firebase_auth.zzhi) r3
            r2 = r3
            r3 = r0
            com.google.android.gms.internal.firebase_auth.zzjt<FieldDescriptorType, java.lang.Object> r3 = r3.zzxh
            r4 = r2
            com.google.android.gms.internal.firebase_auth.zzjt<FieldDescriptorType, java.lang.Object> r4 = r4.zzxh
            boolean r3 = r3.equals(r4)
            r0 = r3
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzhi.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.zzxh.hashCode();
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        Iterator<Map.Entry<FieldDescriptorType, Object>> it;
        if (!this.zzxj) {
            return this.zzxh.entrySet().iterator();
        }
        new zzii(this.zzxh.entrySet().iterator());
        return it;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
        Iterator<Map.Entry<FieldDescriptorType, Object>> it;
        if (!this.zzxj) {
            return this.zzxh.zzka().iterator();
        }
        new zzii(this.zzxh.zzka().iterator());
        return it;
    }

    private final Object zza(FieldDescriptorType fielddescriptortype) {
        Object obj = this.zzxh.get(fielddescriptortype);
        Object obj2 = obj;
        if (obj instanceof zzid) {
            return zzid.zzja();
        }
        return obj2;
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        ArrayList arrayList;
        Throwable th;
        FieldDescriptorType fielddescriptortype2 = fielddescriptortype;
        ArrayList arrayList2 = obj;
        if (!fielddescriptortype2.zzhz()) {
            zza(fielddescriptortype2.zzhx(), arrayList2);
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
                zza(fielddescriptortype2.zzhx(), arrayList6.get(i));
            }
            arrayList2 = arrayList4;
        }
        if (arrayList2 instanceof zzid) {
            this.zzxj = true;
        }
        Object zza = this.zzxh.put(fielddescriptortype2, arrayList2);
    }

    private static void zza(zzlb zzlb, Object obj) {
        boolean z;
        Throwable th;
        Object obj2 = obj;
        Object checkNotNull = zzht.checkNotNull(obj2);
        boolean z2 = false;
        switch (zzhl.zzxn[zzlb.zzkx().ordinal()]) {
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
                z2 = (obj2 instanceof zzgf) || (obj2 instanceof byte[]);
                break;
            case 8:
                z2 = (obj2 instanceof Integer) || (obj2 instanceof zzhw);
                break;
            case 9:
                if (!(obj2 instanceof zzjc) && !(obj2 instanceof zzid)) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
                break;
        }
        z2 = z;
        if (!z2) {
            Throwable th2 = th;
            new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            throw th2;
        }
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzxh.zzjy(); i++) {
            if (!zzb(this.zzxh.zzbf(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> zzb : this.zzxh.zzjz()) {
            if (!zzb(zzb)) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        Throwable th;
        Map.Entry<FieldDescriptorType, Object> entry2 = entry;
        zzhk zzhk = (zzhk) entry2.getKey();
        zzhk zzhk2 = zzhk;
        if (zzhk.zzhy() == zzle.zzagr) {
            if (zzhk2.zzhz()) {
                for (zzjc isInitialized : (List) entry2.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry2.getValue();
                Object obj = value;
                if (value instanceof zzjc) {
                    if (!((zzjc) obj).isInitialized()) {
                        return false;
                    }
                } else if (obj instanceof zzid) {
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

    public final void zza(zzhi<FieldDescriptorType> zzhi) {
        zzhi<FieldDescriptorType> zzhi2 = zzhi;
        for (int i = 0; i < zzhi2.zzxh.zzjy(); i++) {
            zzc(zzhi2.zzxh.zzbf(i));
        }
        for (Map.Entry zzc : zzhi2.zzxh.zzjz()) {
            zzc(zzc);
        }
    }

    private static Object zzg(Object obj) {
        Object obj2 = obj;
        if (obj2 instanceof zzji) {
            return ((zzji) obj2).zzfv();
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

    private final void zzc(Map.Entry<FieldDescriptorType, Object> entry) {
        zzji zzih;
        Object obj;
        Map.Entry<FieldDescriptorType, Object> entry2 = entry;
        zzhk zzhk = (zzhk) entry2.getKey();
        Object value = entry2.getValue();
        zzjc zzjc = value;
        if (value instanceof zzid) {
            zzjc = zzid.zzja();
        }
        if (zzhk.zzhz()) {
            Object zza = zza(zzhk);
            Object obj2 = zza;
            if (zza == null) {
                new ArrayList();
                obj2 = obj;
            }
            for (Object zzg : (List) zzjc) {
                boolean add = ((List) obj2).add(zzg(zzg));
            }
            Object zza2 = this.zzxh.put(zzhk, obj2);
        } else if (zzhk.zzhy() == zzle.zzagr) {
            Object zza3 = zza(zzhk);
            Object obj3 = zza3;
            if (zza3 == null) {
                Object zza4 = this.zzxh.put(zzhk, zzg(zzjc));
                return;
            }
            if (obj3 instanceof zzji) {
                zzih = zzhk.zza((zzji) obj3, (zzji) zzjc);
            } else {
                zzih = zzhk.zza(((zzjc) obj3).zzin(), (zzjc) zzjc).zzih();
            }
            Object zza5 = this.zzxh.put(zzhk, zzih);
        } else {
            Object zza6 = this.zzxh.put(zzhk, zzg(zzjc));
        }
    }

    static void zza(zzha zzha, zzlb zzlb, int i, Object obj) throws IOException {
        zzha zzha2 = zzha;
        zzlb zzlb2 = zzlb;
        int i2 = i;
        Object obj2 = obj;
        if (zzlb2 == zzlb.zzafx) {
            boolean zzg = zzht.zzg((zzjc) obj2);
            int i3 = i2;
            zzha zzha3 = zzha2;
            zzha zzha4 = zzha3;
            zzha3.zze(i3, 3);
            ((zzjc) obj2).zzb(zzha4);
            zzha4.zze(i3, 4);
            return;
        }
        zzha2.zze(i2, zzlb2.zzky());
        Object obj3 = obj2;
        zzha zzha5 = zzha2;
        switch (zzhl.zzws[zzlb2.ordinal()]) {
            case 1:
                zzha5.zza(((Double) obj3).doubleValue());
                return;
            case 2:
                zzha5.zza(((Float) obj3).floatValue());
                return;
            case 3:
                long longValue = ((Long) obj3).longValue();
                long j = longValue;
                zzha5.zzb(longValue);
                return;
            case 4:
                zzha5.zzb(((Long) obj3).longValue());
                return;
            case 5:
                zzha5.zzag(((Integer) obj3).intValue());
                return;
            case 6:
                zzha5.zzd(((Long) obj3).longValue());
                return;
            case 7:
                zzha5.zzaj(((Integer) obj3).intValue());
                return;
            case 8:
                zzha5.zzt(((Boolean) obj3).booleanValue());
                return;
            case 9:
                ((zzjc) obj3).zzb(zzha5);
                return;
            case 10:
                zzha5.zzc((zzjc) obj3);
                return;
            case 11:
                if (obj3 instanceof zzgf) {
                    zzha5.zza((zzgf) obj3);
                    return;
                } else {
                    zzha5.zzdi((String) obj3);
                    return;
                }
            case 12:
                if (obj3 instanceof zzgf) {
                    zzha5.zza((zzgf) obj3);
                    return;
                }
                byte[] bArr = (byte[]) obj3;
                zzha5.zzd(bArr, 0, bArr.length);
                return;
            case 13:
                zzha5.zzah(((Integer) obj3).intValue());
                return;
            case 14:
                int intValue = ((Integer) obj3).intValue();
                int i4 = intValue;
                zzha5.zzaj(intValue);
                return;
            case 15:
                long longValue2 = ((Long) obj3).longValue();
                long j2 = longValue2;
                zzha5.zzd(longValue2);
                return;
            case 16:
                zzha5.zzai(((Integer) obj3).intValue());
                return;
            case 17:
                zzha5.zzc(((Long) obj3).longValue());
                return;
            case 18:
                if (obj3 instanceof zzhw) {
                    int zzbq = ((zzhw) obj3).zzbq();
                    int i5 = zzbq;
                    zzha5.zzag(zzbq);
                    return;
                }
                int intValue2 = ((Integer) obj3).intValue();
                int i6 = intValue2;
                zzha5.zzag(intValue2);
                return;
            default:
                return;
        }
    }

    public final int zzht() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzxh.zzjy(); i2++) {
            i += zzd(this.zzxh.zzbf(i2));
        }
        for (Map.Entry zzd : this.zzxh.zzjz()) {
            i += zzd(zzd);
        }
        return i;
    }

    private static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
        Map.Entry<FieldDescriptorType, Object> entry2 = entry;
        zzhk zzhk = (zzhk) entry2.getKey();
        Object value = entry2.getValue();
        if (zzhk.zzhy() != zzle.zzagr || zzhk.zzhz() || zzhk.zzia()) {
            return zzb((zzhk<?>) zzhk, value);
        }
        if (value instanceof zzid) {
            return zzha.zzb(((zzhk) entry2.getKey()).zzbq(), (zzih) (zzid) value);
        }
        return zzha.zzb(((zzhk) entry2.getKey()).zzbq(), (zzjc) value);
    }

    static int zza(zzlb zzlb, int i, Object obj) {
        zzlb zzlb2 = zzlb;
        Object obj2 = obj;
        int zzak = zzha.zzak(i);
        if (zzlb2 == zzlb.zzafx) {
            boolean zzg = zzht.zzg((zzjc) obj2);
            zzak <<= 1;
        }
        return zzak + zzb(zzlb2, obj2);
    }

    private static int zzb(zzlb zzlb, Object obj) {
        Throwable th;
        Object obj2 = obj;
        switch (zzhl.zzws[zzlb.ordinal()]) {
            case 1:
                return zzha.zzb(((Double) obj2).doubleValue());
            case 2:
                return zzha.zzb(((Float) obj2).floatValue());
            case 3:
                return zzha.zze(((Long) obj2).longValue());
            case 4:
                return zzha.zzf(((Long) obj2).longValue());
            case 5:
                return zzha.zzal(((Integer) obj2).intValue());
            case 6:
                return zzha.zzh(((Long) obj2).longValue());
            case 7:
                return zzha.zzao(((Integer) obj2).intValue());
            case 8:
                return zzha.zzu(((Boolean) obj2).booleanValue());
            case 9:
                return zzha.zze((zzjc) obj2);
            case 10:
                if (obj2 instanceof zzid) {
                    return zzha.zza((zzih) (zzid) obj2);
                }
                return zzha.zzd((zzjc) obj2);
            case 11:
                if (obj2 instanceof zzgf) {
                    return zzha.zzb((zzgf) obj2);
                }
                return zzha.zzdj((String) obj2);
            case 12:
                if (obj2 instanceof zzgf) {
                    return zzha.zzb((zzgf) obj2);
                }
                return zzha.zzd((byte[]) obj2);
            case 13:
                return zzha.zzam(((Integer) obj2).intValue());
            case 14:
                return zzha.zzap(((Integer) obj2).intValue());
            case 15:
                return zzha.zzi(((Long) obj2).longValue());
            case 16:
                return zzha.zzan(((Integer) obj2).intValue());
            case 17:
                return zzha.zzg(((Long) obj2).longValue());
            case 18:
                if (obj2 instanceof zzhw) {
                    return zzha.zzaq(((zzhw) obj2).zzbq());
                }
                return zzha.zzaq(((Integer) obj2).intValue());
            default:
                Throwable th2 = th;
                new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                throw th2;
        }
    }

    public static int zzb(zzhk<?> zzhk, Object obj) {
        zzhk<?> zzhk2 = zzhk;
        Object obj2 = obj;
        zzlb zzhx = zzhk2.zzhx();
        int zzbq = zzhk2.zzbq();
        if (!zzhk2.zzhz()) {
            return zza(zzhx, zzbq, obj2);
        }
        if (zzhk2.zzia()) {
            int i = 0;
            for (Object zzb : (List) obj2) {
                i += zzb(zzhx, zzb);
            }
            return i + zzha.zzak(zzbq) + zzha.zzas(i);
        }
        int i2 = 0;
        for (Object zza : (List) obj2) {
            i2 += zza(zzhx, zzbq, zza);
        }
        return i2;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzhi zzhi;
        new zzhi();
        zzhi zzhi2 = zzhi;
        for (int i = 0; i < this.zzxh.zzjy(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzbf = this.zzxh.zzbf(i);
            zzhi2.zza((zzhk) zzbf.getKey(), zzbf.getValue());
        }
        for (Map.Entry next : this.zzxh.zzjz()) {
            zzhi2.zza((zzhk) next.getKey(), next.getValue());
        }
        zzhi2.zzxj = this.zzxj;
        return zzhi2;
    }

    static {
        zzhi zzhi;
        new zzhi(true);
        zzxk = zzhi;
    }
}
