package com.google.firebase.components;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
final /* synthetic */ class Component$$Lambda$1 implements ComponentFactory {
    private final Object arg$1;

    private Component$$Lambda$1(Object obj) {
        this.arg$1 = obj;
    }

    public static ComponentFactory lambdaFactory$(Object obj) {
        ComponentFactory componentFactory;
        new Component$$Lambda$1(obj);
        return componentFactory;
    }

    public Object create(ComponentContainer componentContainer) {
        return Component.lambda$of$0(this.arg$1, componentContainer);
    }
}
