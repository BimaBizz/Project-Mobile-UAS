package com.google.android.gms.internal.firebase_auth;

import java.util.List;

final class zzba extends zzay<E> {
    private final transient int length;
    private final transient int offset;
    private final /* synthetic */ zzay zzha;

    zzba(zzay zzay, int i, int i2) {
        this.zzha = zzay;
        this.offset = i;
        this.length = i2;
    }

    public final int size() {
        return this.length;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzca() {
        return this.zzha.zzca();
    }

    /* access modifiers changed from: package-private */
    public final int zzcb() {
        return this.zzha.zzcb() + this.offset;
    }

    /* access modifiers changed from: package-private */
    public final int zzcc() {
        return this.zzha.zzcb() + this.offset + this.length;
    }

    public final E get(int i) {
        int i2 = i;
        int zza = zzaj.zza(i2, this.length);
        return this.zzha.get(i2 + this.offset);
    }

    public final zzay<E> zzc(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        zzaj.zza(i3, i4, this.length);
        return (zzay) this.zzha.subList(i3 + this.offset, i4 + this.offset);
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
