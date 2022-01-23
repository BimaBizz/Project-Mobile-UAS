package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
final /* synthetic */ class ComponentRuntime$$Lambda$1 implements Provider {
    private final ComponentRuntime arg$1;
    private final Component arg$2;

    private ComponentRuntime$$Lambda$1(ComponentRuntime componentRuntime, Component component) {
        this.arg$1 = componentRuntime;
        this.arg$2 = component;
    }

    public static Provider lambdaFactory$(ComponentRuntime componentRuntime, Component component) {
        Provider provider;
        new ComponentRuntime$$Lambda$1(componentRuntime, component);
        return provider;
    }

    public Object get() {
        return ComponentRuntime.lambda$new$0(this.arg$1, this.arg$2);
    }
}
