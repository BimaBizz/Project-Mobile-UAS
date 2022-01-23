package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;

final class zzjq implements zzja {
    private final int flags;
    private final String info;
    private final zzjc zzacr;
    private final Object[] zzacy;

    zzjq(zzjc zzjc, String str, Object[] objArr) {
        String str2 = str;
        this.zzacr = zzjc;
        this.info = str2;
        this.zzacy = objArr;
        int i = 0 + 1;
        char charAt = str2.charAt(0);
        char c = charAt;
        if (charAt < 55296) {
            this.flags = c;
            return;
        }
        char c2 = c & 8191;
        int i2 = 13;
        while (true) {
            int i3 = i;
            i++;
            char charAt2 = str2.charAt(i3);
            char c3 = charAt2;
            if (charAt2 >= 55296) {
                c2 |= (c3 & 8191) << i2;
                i2 += 13;
            } else {
                this.flags = c2 | (c3 << i2);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzjw() {
        return this.info;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzjx() {
        return this.zzacy;
    }

    public final zzjc zzjq() {
        return this.zzacr;
    }

    public final int zzjo() {
        return (this.flags & 1) == 1 ? zzhs.zzd.zzaav : zzhs.zzd.zzaaw;
    }

    public final boolean zzjp() {
        return (this.flags & 2) == 2;
    }
}
