package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import java.util.HashMap;
import java.util.Iterator;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.MapUtils */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0606MapUtils {
    public C0606MapUtils() {
    }

    @C0206KeepForSdk
    public static void writeStringMapToJson(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull HashMap<String, String> hashMap) {
        StringBuilder sb2 = sb;
        HashMap<String, String> hashMap2 = hashMap;
        StringBuilder append = sb2.append("{");
        Iterator<String> it = hashMap2.keySet().iterator();
        boolean z = true;
        while (true) {
            boolean z2 = z;
            if (it.hasNext()) {
                String next = it.next();
                if (!z2) {
                    StringBuilder append2 = sb2.append(",");
                }
                String str = hashMap2.get(next);
                StringBuilder append3 = sb2.append("\"");
                StringBuilder append4 = sb2.append(next);
                StringBuilder append5 = sb2.append("\":");
                if (str == null) {
                    StringBuilder append6 = sb2.append("null");
                    z = false;
                } else {
                    StringBuilder append7 = sb2.append("\"");
                    StringBuilder append8 = sb2.append(str);
                    StringBuilder append9 = sb2.append("\"");
                    z = false;
                }
            } else {
                StringBuilder append10 = sb2.append("}");
                return;
            }
        }
    }
}
