package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzil */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1004zzil implements C1012zzit {
    private C1012zzit[] zza;

    C1004zzil(C1012zzit... zzitArr) {
        this.zza = zzitArr;
    }

    public final boolean zza(Class<?> cls) {
        Class<?> cls2 = cls;
        C1012zzit[] zzitArr = this.zza;
        C1012zzit[] zzitArr2 = zzitArr;
        int length = zzitArr.length;
        for (int i = 0; i < length; i++) {
            if (zzitArr2[i].zza(cls2)) {
                return true;
            }
        }
        return false;
    }

    public final C1009zziq zzb(Class<?> cls) {
        String str;
        String str2;
        Class<?> cls2 = cls;
        C1012zzit[] zzitArr = this.zza;
        C1012zzit[] zzitArr2 = zzitArr;
        int length = zzitArr.length;
        for (int i = 0; i < length; i++) {
            C1012zzit zzit = zzitArr2[i];
            C1012zzit zzit2 = zzit;
            if (zzit.zza(cls2)) {
                return zzit2.zzb(cls2);
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
