package com.google.firebase.components;

import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public interface ComponentFactory<T> {
    @C0206KeepForSdk
    T create(ComponentContainer componentContainer);
}
