package androidx.core.os;

import android.os.Build;
import android.os.Trace;

public final class TraceCompat {
    public static void beginSection(String str) {
        String sectionName = str;
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(sectionName);
        }
    }

    public static void endSection() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    private TraceCompat() {
    }
}
