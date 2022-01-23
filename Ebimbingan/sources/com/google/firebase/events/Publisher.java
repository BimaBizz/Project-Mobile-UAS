package com.google.firebase.events;

import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public interface Publisher {
    @C0206KeepForSdk
    void publish(Event<?> event);
}
