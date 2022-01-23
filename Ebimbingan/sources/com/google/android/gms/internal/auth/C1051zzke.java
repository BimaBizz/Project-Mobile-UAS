package com.google.android.gms.internal.auth;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.auth.zzke */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1051zzke implements ListIterator<String> {
    private ListIterator<String> zza = this.zzc.zza.listIterator(this.zzb);
    private final /* synthetic */ int zzb;
    private final /* synthetic */ C1052zzkf zzc;

    C1051zzke(C1052zzkf zzkf, int i) {
        this.zzc = zzkf;
        this.zzb = i;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    public final void remove() {
        Throwable th;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    public final /* synthetic */ void add(Object obj) {
        Throwable th;
        String str = (String) obj;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    public final /* synthetic */ void set(Object obj) {
        Throwable th;
        String str = (String) obj;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    public final /* synthetic */ Object previous() {
        return this.zza.previous();
    }

    public final /* synthetic */ Object next() {
        return this.zza.next();
    }
}
