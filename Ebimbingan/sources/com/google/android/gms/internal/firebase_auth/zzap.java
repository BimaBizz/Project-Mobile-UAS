package com.google.android.gms.internal.firebase_auth;

abstract class zzap extends zzaa<String> {
    private int limit;
    private int offset = 0;
    private final zzae zzgm;
    private final boolean zzgn;
    final CharSequence zzgr;

    protected zzap(zzam zzam, CharSequence charSequence) {
        zzam zzam2 = zzam;
        this.zzgm = zzam2.zzgm;
        zzam zzam3 = zzam2;
        this.zzgn = false;
        this.limit = zzam2.limit;
        this.zzgr = charSequence;
    }

    /* access modifiers changed from: package-private */
    public abstract int zze(int i);

    /* access modifiers changed from: package-private */
    public abstract int zzf(int i);

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzbw() {
        int i;
        int i2;
        int i3 = this.offset;
        while (this.offset != -1) {
            int i4 = i3;
            int zze = zze(this.offset);
            int i5 = zze;
            if (zze == -1) {
                i = this.zzgr.length();
                this.offset = -1;
            } else {
                i = i5;
                this.offset = zzf(i5);
            }
            if (this.offset == i3) {
                this.offset++;
                if (this.offset > this.zzgr.length()) {
                    this.offset = -1;
                }
            } else {
                while (i4 < i && this.zzgm.zza(this.zzgr.charAt(i4))) {
                    i4++;
                }
                while (i2 > i4 && this.zzgm.zza(this.zzgr.charAt(i2 - 1))) {
                    i = i2 - 1;
                }
                if (!this.zzgn || i4 != i2) {
                    if (this.limit == 1) {
                        i2 = this.zzgr.length();
                        this.offset = -1;
                        while (i2 > i4 && this.zzgm.zza(this.zzgr.charAt(i2 - 1))) {
                            i2--;
                        }
                    } else {
                        this.limit--;
                    }
                    return this.zzgr.subSequence(i4, i2).toString();
                }
                i3 = this.offset;
            }
        }
        Object zzbx = zzbx();
        return null;
    }
}
