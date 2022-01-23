package com.google.android.gms.internal.firebase_auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzam {
    /* access modifiers changed from: private */
    public final int limit;
    /* access modifiers changed from: private */
    public final zzae zzgm;
    private final boolean zzgn;
    private final zzas zzgo;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private zzam(zzas zzas) {
        this(zzas, false, zzai.zzgk, Integer.MAX_VALUE);
    }

    private zzam(zzas zzas, boolean z, zzae zzae, int i) {
        boolean z2 = z;
        int i2 = i;
        this.zzgo = zzas;
        this.zzgn = false;
        this.zzgm = zzae;
        this.limit = Integer.MAX_VALUE;
    }

    public static zzam zzd(char c) {
        zzae zzae;
        zzam zzam;
        zzas zzas;
        new zzag(c);
        zzae zzae2 = zzae;
        Object checkNotNull = zzaj.checkNotNull(zzae2);
        new zzal(zzae2);
        new zzam(zzas);
        return zzam;
    }

    public static zzam zzbp(String str) {
        zzam zzam;
        zzas zzas;
        String str2 = str;
        zzaj.checkArgument(str2.length() != 0, "The separator may not be the empty string.");
        if (str2.length() == 1) {
            return zzd(str2.charAt(0));
        }
        new zzan(str2);
        new zzam(zzas);
        return zzam;
    }

    public final List<String> zza(CharSequence charSequence) {
        List list;
        CharSequence charSequence2 = charSequence;
        Object checkNotNull = zzaj.checkNotNull(charSequence2);
        Iterator<String> zza = this.zzgo.zza(this, charSequence2);
        new ArrayList();
        List list2 = list;
        while (zza.hasNext()) {
            boolean add = list2.add(zza.next());
        }
        return Collections.unmodifiableList(list2);
    }
}
