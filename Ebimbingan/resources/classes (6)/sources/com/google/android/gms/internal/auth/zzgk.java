package com.google.android.gms.internal.auth;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzgk implements Comparator<zzgi> {
    zzgk() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgi zzgi = (zzgi) obj2;
        zzgi zzgi2 = (zzgi) obj;
        zzgi zzgi3 = zzgi2;
        zzgn zzgn = (zzgn) zzgi2.iterator();
        zzgn zzgn2 = (zzgn) zzgi.iterator();
        while (zzgn.hasNext() && zzgn2.hasNext()) {
            int compare = Integer.compare(zzgi.zzb(zzgn.zza()), zzgi.zzb(zzgn2.zza()));
            int i = compare;
            if (compare != 0) {
                return i;
            }
        }
        return Integer.compare(zzgi3.zza(), zzgi.zza());
    }
}
