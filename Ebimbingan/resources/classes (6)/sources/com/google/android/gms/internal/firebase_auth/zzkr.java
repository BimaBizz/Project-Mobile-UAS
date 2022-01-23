package com.google.android.gms.internal.firebase_auth;

import java.util.Iterator;

final class zzkr implements Iterator<String> {
    private final /* synthetic */ zzkp zzaep;
    private Iterator<String> zzafl = this.zzaep.zzaeq.iterator();

    zzkr(zzkp zzkp) {
        this.zzaep = zzkp;
    }

    public final boolean hasNext() {
        return this.zzafl.hasNext();
    }

    public final void remove() {
        Throwable th;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    public final /* synthetic */ Object next() {
        return this.zzafl.next();
    }
}
