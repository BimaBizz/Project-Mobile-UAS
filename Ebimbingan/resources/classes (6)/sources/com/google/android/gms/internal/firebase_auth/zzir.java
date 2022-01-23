package com.google.android.gms.internal.firebase_auth;

final class zzir implements zziz {
    private zziz[] zzacj;

    zzir(zziz... zzizArr) {
        this.zzacj = zzizArr;
    }

    public final boolean zza(Class<?> cls) {
        Class<?> cls2 = cls;
        zziz[] zzizArr = this.zzacj;
        zziz[] zzizArr2 = zzizArr;
        int length = zzizArr.length;
        for (int i = 0; i < length; i++) {
            if (zzizArr2[i].zza(cls2)) {
                return true;
            }
        }
        return false;
    }

    public final zzja zzb(Class<?> cls) {
        String str;
        String str2;
        Class<?> cls2 = cls;
        zziz[] zzizArr = this.zzacj;
        zziz[] zzizArr2 = zzizArr;
        int length = zzizArr.length;
        for (int i = 0; i < length; i++) {
            zziz zziz = zzizArr2[i];
            zziz zziz2 = zziz;
            if (zziz.zza(cls2)) {
                return zziz2.zzb(cls2);
            }
        }
        UnsupportedOperationException unsupportedOperationException = r11;
        String valueOf = String.valueOf(cls2.getName());
        String str3 = valueOf;
        if (valueOf.length() != 0) {
            str2 = "No factory is available for message type: ".concat(str3);
        } else {
            str2 = str;
            new String("No factory is available for message type: ");
        }
        UnsupportedOperationException unsupportedOperationException2 = new UnsupportedOperationException(str2);
        throw unsupportedOperationException;
    }
}
