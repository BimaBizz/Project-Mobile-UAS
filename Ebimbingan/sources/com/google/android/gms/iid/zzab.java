package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;

final class zzab extends zzz<Bundle> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzab(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
        int i3 = i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzw() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void zzh(Bundle bundle) {
        StringBuilder sb;
        Bundle bundle2 = bundle.getBundle("data");
        Bundle bundle3 = bundle2;
        if (bundle2 == null) {
            bundle3 = Bundle.EMPTY;
        }
        Bundle bundle4 = bundle3;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(bundle4);
            new StringBuilder(16 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
            int d = Log.d("MessengerIpcClient", sb.append("Finishing ").append(valueOf).append(" with ").append(valueOf2).toString());
        }
        this.zzcq.setResult(bundle4);
    }
}
