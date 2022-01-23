package com.google.android.gms.internal.firebase_auth;

final class zzaq extends zzap {
    private final /* synthetic */ zzan zzgs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzaq(zzan zzan, zzam zzam, CharSequence charSequence) {
        super(zzam, charSequence);
        this.zzgs = zzan;
    }

    public final int zze(int i) {
        int length = this.zzgs.zzgp.length();
        int i2 = i;
        int length2 = this.zzgr.length() - length;
        while (i2 <= length2) {
            int i3 = 0;
            while (i3 < length) {
                if (this.zzgr.charAt(i3 + i2) == this.zzgs.zzgp.charAt(i3)) {
                    i3++;
                } else {
                    i2++;
                }
            }
            return i2;
        }
        return -1;
    }

    public final int zzf(int i) {
        return i + this.zzgs.zzgp.length();
    }
}
