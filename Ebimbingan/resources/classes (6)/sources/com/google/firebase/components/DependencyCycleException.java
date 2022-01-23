package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class DependencyCycleException extends DependencyException {
    private final List<Component<?>> componentsInCycle;

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DependencyCycleException(java.util.List<com.google.firebase.components.Component<?>> r7) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r5 = r3
            r3 = r5
            r4 = r5
            r4.<init>()
            java.lang.String r4 = "Dependency cycle detected: "
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r1
            java.lang.Object[] r4 = r4.toArray()
            java.lang.String r4 = java.util.Arrays.toString(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            r2 = r0
            r3 = r1
            r2.componentsInCycle = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.DependencyCycleException.<init>(java.util.List):void");
    }

    @KeepForSdk
    public List<Component<?>> getComponentsInCycle() {
        return this.componentsInCycle;
    }
}
