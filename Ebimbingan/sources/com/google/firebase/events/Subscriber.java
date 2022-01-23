package com.google.firebase.events;

import com.google.android.gms.common.annotation.C0206KeepForSdk;
import java.util.concurrent.Executor;

@C0206KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public interface Subscriber {
    @C0206KeepForSdk
    <T> void subscribe(Class<T> cls, EventHandler<? super T> eventHandler);

    @C0206KeepForSdk
    <T> void subscribe(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler);

    @C0206KeepForSdk
    <T> void unsubscribe(Class<T> cls, EventHandler<? super T> eventHandler);
}
