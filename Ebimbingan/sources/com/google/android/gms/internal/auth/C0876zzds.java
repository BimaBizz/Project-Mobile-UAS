package com.google.android.gms.internal.auth;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzds */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0876zzds {
    public static String zza(@NullableDecl String str, @NullableDecl Object... objArr) {
        StringBuilder sb;
        Object[] objArr2 = objArr;
        String valueOf = String.valueOf(str);
        for (int i = 0; i < objArr2.length; i++) {
            objArr2[i] = zza(objArr2[i]);
        }
        new StringBuilder(valueOf.length() + (16 * objArr2.length));
        StringBuilder sb2 = sb;
        int i2 = 0;
        int i3 = 0;
        while (i3 < objArr2.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            int i4 = indexOf;
            if (indexOf == -1) {
                break;
            }
            StringBuilder append = sb2.append(valueOf, i2, i4);
            int i5 = i3;
            i3++;
            StringBuilder append2 = sb2.append(objArr2[i5]);
            i2 = i4 + 2;
        }
        StringBuilder append3 = sb2.append(valueOf, i2, valueOf.length());
        if (i3 < objArr2.length) {
            StringBuilder append4 = sb2.append(" [");
            int i6 = i3;
            int i7 = i3 + 1;
            StringBuilder append5 = sb2.append(objArr2[i6]);
            while (i7 < objArr2.length) {
                StringBuilder append6 = sb2.append(", ");
                int i8 = i7;
                i7++;
                StringBuilder append7 = sb2.append(objArr2[i8]);
            }
            StringBuilder append8 = sb2.append(']');
        }
        return sb2.toString();
    }

    private static String zza(@NullableDecl Object obj) {
        StringBuilder sb;
        String str;
        String str2;
        StringBuilder sb2;
        Object obj2 = obj;
        if (obj2 == null) {
            return "null";
        }
        try {
            return obj2.toString();
        } catch (Exception e) {
            Exception exc = e;
            String name = obj2.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj2));
            new StringBuilder(1 + String.valueOf(name).length() + String.valueOf(hexString).length());
            String sb3 = sb.append(name).append('@').append(hexString).toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String valueOf = String.valueOf(sb3);
            String str3 = valueOf;
            if (valueOf.length() != 0) {
                str2 = "Exception during lenientFormat for ".concat(str3);
            } else {
                str2 = str;
                new String("Exception during lenientFormat for ");
            }
            logger.logp(level, "com.google.common.base.Strings", "lenientToString", str2, exc);
            String name2 = exc.getClass().getName();
            new StringBuilder(9 + String.valueOf(sb3).length() + String.valueOf(name2).length());
            return sb2.append("<").append(sb3).append(" threw ").append(name2).append(">").toString();
        }
    }
}
