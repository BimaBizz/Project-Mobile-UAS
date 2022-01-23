package com.google.firebase;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0265StatusExceptionMapper;

@C0206KeepForSdk
/* renamed from: com.google.firebase.FirebaseExceptionMapper */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C1156FirebaseExceptionMapper implements C0265StatusExceptionMapper {
    public C1156FirebaseExceptionMapper() {
    }

    @RecentlyNonNull
    public final Exception getException(@RecentlyNonNull C0236Status status) {
        Exception exc;
        Exception exc2;
        C0236Status status2 = status;
        if (status2.getStatusCode() == 8) {
            new C1155FirebaseException(status2.zza());
            return exc2;
        }
        new C1154FirebaseApiNotAvailableException(status2.zza());
        return exc;
    }
}
