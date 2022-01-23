package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0212ApiException;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.C0422ApiExceptionUtil;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.internal.location.zzak;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzp extends zzak {
    private final /* synthetic */ TaskCompletionSource zzab;

    zzp(FusedLocationProviderClient fusedLocationProviderClient, TaskCompletionSource taskCompletionSource) {
        FusedLocationProviderClient fusedLocationProviderClient2 = fusedLocationProviderClient;
        this.zzab = taskCompletionSource;
    }

    public final void zza(zzad zzad) throws RemoteException {
        Exception exc;
        C0236Status status;
        C0236Status status2 = zzad.getStatus();
        C0236Status status3 = status2;
        if (status2 == null) {
            new C0236Status(8, "Got null status from location service");
            new C0212ApiException(status);
            boolean trySetException = this.zzab.trySetException(exc);
        } else if (status3.getStatusCode() == 0) {
            this.zzab.setResult(true);
        } else {
            boolean trySetException2 = this.zzab.trySetException(C0422ApiExceptionUtil.fromStatus(status3));
        }
    }
}
