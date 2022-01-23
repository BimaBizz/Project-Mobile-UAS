package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzkf extends AbstractList<String> implements zzid, RandomAccess {
    /* access modifiers changed from: private */
    public final zzid zza;

    public zzkf(zzid zzid) {
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
        new zzke(this, i);
        return listIterator;
    }

    public final Iterator<String> iterator() {
        Iterator<String> it;
        new zzkh(this);
        return it;
    }

    public final List<?> zzd() {
        return this.zza.zzd();
    }

    public final zzid zze() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.zza.get(i);
    }
}
