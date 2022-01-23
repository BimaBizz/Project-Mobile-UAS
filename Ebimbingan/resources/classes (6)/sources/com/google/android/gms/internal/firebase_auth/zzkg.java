package com.google.android.gms.internal.firebase_auth;

import com.firebase.client.utilities.Base64;
import org.shaded.apache.commons.logging.impl.SimpleLog;
import org.shaded.apache.http.protocol.HTTP;

final class zzkg {
    static String zzd(zzgf zzgf) {
        zzki zzki;
        StringBuilder sb;
        new zzkf(zzgf);
        zzki zzki2 = zzki;
        new StringBuilder(zzki2.size());
        StringBuilder sb2 = sb;
        for (int i = 0; i < zzki2.size(); i++) {
            byte zzp = zzki2.zzp(i);
            byte b = zzp;
            switch (zzp) {
                case SimpleLog.LOG_LEVEL_OFF /*7*/:
                    StringBuilder append = sb2.append("\\a");
                    break;
                case Base64.DO_BREAK_LINES:
                    StringBuilder append2 = sb2.append("\\b");
                    break;
                case HTTP.HT /*9*/:
                    StringBuilder append3 = sb2.append("\\t");
                    break;
                case HTTP.LF /*10*/:
                    StringBuilder append4 = sb2.append("\\n");
                    break;
                case 11:
                    StringBuilder append5 = sb2.append("\\v");
                    break;
                case 12:
                    StringBuilder append6 = sb2.append("\\f");
                    break;
                case HTTP.CR /*13*/:
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
