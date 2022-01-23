package com.google.android.gms.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class zab implements SuccessContinuation {
    static final SuccessContinuation zaa;

    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            com.google.android.gms.common.zab r1 = new com.google.android.gms.common.zab
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            zaa = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zab.<clinit>():void");
    }

    private zab() {
    }

    public final Task then(Object obj) {
        Map map = (Map) obj;
        int i = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return Tasks.forResult((Object) null);
    }
}
