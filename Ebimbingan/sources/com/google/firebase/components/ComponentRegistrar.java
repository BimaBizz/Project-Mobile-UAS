package com.google.firebase.components;

import com.google.android.gms.common.annotation.C0206KeepForSdk;
import java.util.List;

@C0206KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public interface ComponentRegistrar {
    @C0206KeepForSdk
    List<Component<?>> getComponents();
}
