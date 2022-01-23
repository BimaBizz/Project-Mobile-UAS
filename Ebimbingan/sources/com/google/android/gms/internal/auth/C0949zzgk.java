package com.google.android.gms.internal.auth;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.auth.zzgk */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0949zzgk implements Comparator<C0947zzgi> {
    C0949zzgk() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C0947zzgi zzgi = (C0947zzgi) obj2;
        C0947zzgi zzgi2 = (C0947zzgi) obj;
        C0947zzgi zzgi3 = zzgi2;
        C0952zzgn zzgn = (C0952zzgn) zzgi2.iterator();
        C0952zzgn zzgn2 = (C0952zzgn) zzgi.iterator();
        while (zzgn.hasNext() && zzgn2.hasNext()) {
            int compare = Integer.compare(C0947zzgi.zzb(zzgn.zza()), C0947zzgi.zzb(zzgn2.zza()));
            int i = compare;
            if (compare != 0) {
                return i;
            }
        }
        return Integer.compare(zzgi3.zza(), zzgi.zza());
    }
}
