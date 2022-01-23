package com.google.android.gms.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;

/* renamed from: com.google.android.gms.common.zaa */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class C0629zaa implements SuccessContinuation {
    static final SuccessContinuation zaa;

    static {
        SuccessContinuation successContinuation;
        new C0629zaa();
        zaa = successContinuation;
    }

    private C0629zaa() {
    }

    public final Task then(Object obj) {
        Map map = (Map) obj;
        int i = C0189GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return Tasks.forResult(null);
    }
}
