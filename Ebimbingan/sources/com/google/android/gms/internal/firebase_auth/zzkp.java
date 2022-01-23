package com.google.android.gms.internal.firebase_auth;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzkp extends AbstractList<String> implements zzij, RandomAccess {
    /* access modifiers changed from: private */
    public final zzij zzaeq;

    public zzkp(zzij zzij) {
        this.zzaeq = zzij;
    }

    public final Object zzax(int i) {
        return this.zzaeq.zzax(i);
    }

    public final int size() {
        return this.zzaeq.size();
    }

    public final void zzc(zzgf zzgf) {
        Throwable th;
        zzgf zzgf2 = zzgf;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    public final ListIterator<String> listIterator(int i) {
        ListIterator<String> listIterator;
        new zzko(this, i);
        return listIterator;
    }

    public final Iterator<String> iterator() {
        Iterator<String> it;
        new zzkr(this);
        return it;
    }

    public final List<?> zzjd() {
        return this.zzaeq.zzjd();
    }

    public final zzij zzje() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.zzaeq.get(i);
    }
}
