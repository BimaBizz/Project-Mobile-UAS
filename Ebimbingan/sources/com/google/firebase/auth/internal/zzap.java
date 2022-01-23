package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.internal.firebase_auth.zzay;
import com.google.android.gms.internal.firebase_auth.zzeu;
import com.google.firebase.auth.zzac;
import com.google.firebase.auth.zzx;
import java.util.ArrayList;
import java.util.List;

public final class zzap {
    public static List<zzx> zzg(List<zzeu> list) {
        List<zzx> list2;
        Object obj;
        Object obj2;
        List<zzeu> list3 = list;
        if (list3 == null || list3.isEmpty()) {
            return zzay.zzce();
        }
        new ArrayList();
        List<zzx> list4 = list2;
        for (zzeu next : list3) {
            zzeu zzeu = next;
            if (next == null || TextUtils.isEmpty(zzeu.zzbk())) {
                obj = null;
            } else {
                zzeu zzeu2 = zzeu;
                obj = obj2;
                new zzac(zzeu2.zzbl(), zzeu2.getDisplayName(), zzeu2.zzex(), zzeu2.zzbk());
            }
            Object obj3 = obj;
            Object obj4 = obj3;
            if (obj3 != null) {
                boolean add = list4.add(obj4);
            }
        }
        return list4;
    }
}
