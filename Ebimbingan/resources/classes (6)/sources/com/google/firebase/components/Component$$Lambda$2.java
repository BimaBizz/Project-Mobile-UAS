package com.google.firebase.components;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
final /* synthetic */ class Component$$Lambda$2 implements ComponentFactory {
    private final Object arg$1;

    private Component$$Lambda$2(Object obj) {
        this.arg$1 = obj;
    }

    public static ComponentFactory lambdaFactory$(Object obj) {
        ComponentFactory componentFactory;
        new Component$$Lambda$2(obj);
        return componentFactory;
    }

    public Object create(ComponentContainer componentContainer) {
        return Component.lambda$of$1(this.arg$1, componentContainer);
    }
}
