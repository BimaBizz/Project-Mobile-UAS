package com.google.android.gms.internal.common;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzm {
    public static String zza(@NullableDecl String str, @NullableDecl Object... objArr) {
        int length;
        StringBuilder sb;
        int i;
        int length2;
        int indexOf;
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        String sb4;
        String str3 = str;
        Object[] objArr2 = objArr;
        int i2 = 0;
        while (true) {
            length = objArr2.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr2[i2];
            if (obj == null) {
                sb4 = "null";
            } else {
                try {
                    sb4 = obj.toString();
                } catch (Exception e) {
                    Exception exc = e;
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
                    StringBuilder append = sb2.append(name);
                    StringBuilder append2 = sb2.append('@');
                    StringBuilder append3 = sb2.append(hexString);
                    String sb5 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb5);
                    String str4 = "Exception during lenientFormat for ";
                    if (valueOf.length() != 0) {
                        str2 = str4.concat(valueOf);
                    } else {
                        new String(str4);
                    }
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", str2, exc);
                    String name2 = exc.getClass().getName();
                    new StringBuilder(String.valueOf(sb5).length() + 9 + String.valueOf(name2).length());
                    StringBuilder append4 = sb3.append("<");
                    StringBuilder append5 = sb3.append(sb5);
                    StringBuilder append6 = sb3.append(" threw ");
                    StringBuilder append7 = sb3.append(name2);
                    StringBuilder append8 = sb3.append(">");
                    sb4 = sb3.toString();
                }
            }
            objArr2[i2] = sb4;
            i2++;
        }
        new StringBuilder(str3.length() + (length * 16));
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = i4;
            length2 = objArr2.length;
            if (i >= length2 || (indexOf = str3.indexOf("%s", i3)) == -1) {
                StringBuilder append9 = sb.append(str3, i3, str3.length());
            } else {
                StringBuilder append10 = sb.append(str3, i3, indexOf);
                StringBuilder append11 = sb.append(objArr2[i]);
                i3 = indexOf + 2;
                i4 = i + 1;
            }
        }
        StringBuilder append92 = sb.append(str3, i3, str3.length());
        if (i < length2) {
            StringBuilder append12 = sb.append(" [");
            StringBuilder append13 = sb.append(objArr2[i]);
            for (int i5 = i + 1; i5 < objArr2.length; i5++) {
                StringBuilder append14 = sb.append(", ");
                StringBuilder append15 = sb.append(objArr2[i5]);
            }
            StringBuilder append16 = sb.append(']');
        }
        return sb.toString();
    }
}
