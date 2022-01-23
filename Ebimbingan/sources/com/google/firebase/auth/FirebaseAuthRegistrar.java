package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.firebase.BuildConfig;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

@C0206KeepForSdk
@Keep
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public FirebaseAuthRegistrar() {
    }

    @Keep
    public List<Component<?>> getComponents() {
        Component[] componentArr = new Component[2];
        Component[] componentArr2 = componentArr;
        componentArr[0] = Component.builder(FirebaseAuth.class, InternalAuthProvider.class).add(Dependency.required(FirebaseApp.class)).factory(zzp.zzjd).alwaysEager().build();
        Component[] componentArr3 = componentArr2;
        componentArr3[1] = LibraryVersionComponent.create("fire-auth", BuildConfig.VERSION_NAME);
        return Arrays.asList(componentArr3);
    }
}
