package com.google.firebase.components;

import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.firebase.inject.Provider;
import java.util.Set;

@C0206KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public interface ComponentContainer {
    @C0206KeepForSdk
    <T> T get(Class<T> cls);

    @C0206KeepForSdk
    <T> Provider<T> getProvider(Class<T> cls);

    @C0206KeepForSdk
    <T> Set<T> setOf(Class<T> cls);

    @C0206KeepForSdk
    <T> Provider<Set<T>> setOfProvider(Class<T> cls);
}
