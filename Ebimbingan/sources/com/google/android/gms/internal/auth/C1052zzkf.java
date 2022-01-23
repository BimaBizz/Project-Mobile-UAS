package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.auth.zzkf */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C1052zzkf extends AbstractList<String> implements C0996zzid, RandomAccess {
    /* access modifiers changed from: private */
    public final C0996zzid zza;

    public C1052zzkf(C0996zzid zzid) {
        this.zza = zzid;
    }

    public final Object zzb(int i) {
        return this.zza.zzb(i);
    }

    public final int size() {
        return this.zza.size();
    }

    public final ListIterator<String> listIterator(int i) {
        ListIterator<String> listIterator;
        new C1051zzke(this, i);
        return listIterator;
    }

    public final Iterator<String> iterator() {
        Iterator<String> it;
        new C1054zzkh(this);
        return it;
    }

    public final List<?> zzd() {
        return this.zza.zzd();
    }

    public final C0996zzid zze() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.zza.get(i);
    }
}
