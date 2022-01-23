package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final class Dependency {
    private final Class<?> anInterface;
    private final int injection;
    private final int type;

    private Dependency(Class<?> anInterface2, int type2, int injection2) {
        this.anInterface = (Class) Preconditions.checkNotNull(anInterface2, "Null dependency anInterface.");
        this.type = type2;
        this.injection = injection2;
    }

    @KeepForSdk
    public static Dependency optional(Class<?> anInterface2) {
        Dependency dependency;
        new Dependency(anInterface2, 0, 0);
        return dependency;
    }

    @KeepForSdk
    public static Dependency required(Class<?> anInterface2) {
        Dependency dependency;
        new Dependency(anInterface2, 1, 0);
        return dependency;
    }

    @KeepForSdk
    public static Dependency setOf(Class<?> anInterface2) {
        Dependency dependency;
        new Dependency(anInterface2, 2, 0);
        return dependency;
    }

    @KeepForSdk
    public static Dependency optionalProvider(Class<?> anInterface2) {
        Dependency dependency;
        new Dependency(anInterface2, 0, 1);
        return dependency;
    }

    @KeepForSdk
    public static Dependency requiredProvider(Class<?> anInterface2) {
        Dependency dependency;
        new Dependency(anInterface2, 1, 1);
        return dependency;
    }

    @KeepForSdk
    public static Dependency setOfProvider(Class<?> anInterface2) {
        Dependency dependency;
        new Dependency(anInterface2, 2, 1);
        return dependency;
    }

    public Class<?> getInterface() {
        return this.anInterface;
    }

    public boolean isRequired() {
        return this.type == 1;
    }

    public boolean isSet() {
        return this.type == 2;
    }

    public boolean isDirectInjection() {
        return this.injection == 0;
    }

    public boolean equals(Object obj) {
        Object o = obj;
        if (!(o instanceof Dependency)) {
            return false;
        }
        Dependency other = (Dependency) o;
        return this.anInterface == other.anInterface && this.type == other.type && this.injection == other.injection;
    }

    public int hashCode() {
        return ((((1000003 ^ this.anInterface.hashCode()) * 1000003) ^ this.type) * 1000003) ^ this.injection;
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder("Dependency{anInterface=");
        return sb.append(this.anInterface).append(", type=").append(this.type == 1 ? "required" : this.type == 0 ? "optional" : "set").append(", direct=").append(this.injection == 0).append("}").toString();
    }
}
