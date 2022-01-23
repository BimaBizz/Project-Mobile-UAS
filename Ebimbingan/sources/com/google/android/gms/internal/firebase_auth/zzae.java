package com.google.android.gms.internal.firebase_auth;

public abstract class zzae {
    protected zzae() {
    }

    public abstract boolean zza(char c);

    public int zza(CharSequence charSequence, int i) {
        CharSequence charSequence2 = charSequence;
        int i2 = i;
        int length = charSequence2.length();
        int zza = zzaj.zza(i2, length, "index");
        for (int i3 = i2; i3 < length; i3++) {
            if (zza(charSequence2.charAt(i3))) {
                return i3;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static String zzb(char c) {
        char c2 = c;
        String str = "0123456789ABCDEF";
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = str.charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }
}
