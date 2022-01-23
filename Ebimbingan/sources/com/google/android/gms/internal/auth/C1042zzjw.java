package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzjw */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1042zzjw {
    static String zza(C0947zzgi zzgi) {
        C1044zzjy zzjy;
        StringBuilder sb;
        new C1045zzjz(zzgi);
        C1044zzjy zzjy2 = zzjy;
        new StringBuilder(zzjy2.zza());
        StringBuilder sb2 = sb;
        for (int i = 0; i < zzjy2.zza(); i++) {
            byte zza = zzjy2.zza(i);
            byte b = zza;
            switch (zza) {
                case 7:
                    StringBuilder append = sb2.append("\\a");
                    break;
                case 8:
                    StringBuilder append2 = sb2.append("\\b");
                    break;
                case 9:
                    StringBuilder append3 = sb2.append("\\t");
                    break;
                case 10:
                    StringBuilder append4 = sb2.append("\\n");
                    break;
                case 11:
                    StringBuilder append5 = sb2.append("\\v");
                    break;
                case 12:
                    StringBuilder append6 = sb2.append("\\f");
                    break;
                case 13:
                    StringBuilder append7 = sb2.append("\\r");
                    break;
                case 34:
                    StringBuilder append8 = sb2.append("\\\"");
                    break;
                case 39:
                    StringBuilder append9 = sb2.append("\\'");
                    break;
                case 92:
                    StringBuilder append10 = sb2.append("\\\\");
                    break;
                default:
                    if (b >= 32 && b <= 126) {
                        StringBuilder append11 = sb2.append((char) b);
                        break;
                    } else {
                        StringBuilder append12 = sb2.append('\\');
                        StringBuilder append13 = sb2.append((char) (48 + ((b >>> 6) & 3)));
                        StringBuilder append14 = sb2.append((char) (48 + ((b >>> 3) & 7)));
                        StringBuilder append15 = sb2.append((char) (48 + (b & 7)));
                        break;
                    }
            }
        }
        return sb2.toString();
    }
}
