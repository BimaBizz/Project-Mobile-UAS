package com.google.firebase;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class FirebaseExceptionMapper implements StatusExceptionMapper {
    public FirebaseExceptionMapper() {
    }

    @RecentlyNonNull
    public final Exception getException(@RecentlyNonNull Status status) {
        Exception exc;
        Exception exc2;
        Status status2 = status;
        if (status2.getStatusCode() == 8) {
            new FirebaseException(status2.zza());
            return exc2;
        }
        new FirebaseApiNotAvailableException(status2.zza());
        return exc;
    }
}
