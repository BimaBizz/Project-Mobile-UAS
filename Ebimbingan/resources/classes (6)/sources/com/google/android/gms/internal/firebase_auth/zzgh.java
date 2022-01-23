package com.google.android.gms.internal.firebase_auth;

import java.util.Comparator;

final class zzgh implements Comparator<zzgf> {
    zzgh() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgf zzgf = (zzgf) obj2;
        zzgf zzgf2 = (zzgf) obj;
        zzgf zzgf3 = zzgf2;
        zzgo zzgo = (zzgo) zzgf2.iterator();
        zzgo zzgo2 = (zzgo) zzgf.iterator();
        while (zzgo.hasNext() && zzgo2.hasNext()) {
            int compare = Integer.compare(zzgf.zza(zzgo.nextByte()), zzgf.zza(zzgo2.nextByte()));
            int i = compare;
            if (compare != 0) {
                return i;
            }
        }
        return Integer.compare(zzgf3.size(), zzgf.size());
    }
}
