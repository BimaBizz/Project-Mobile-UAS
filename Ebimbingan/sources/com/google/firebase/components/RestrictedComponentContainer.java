package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
final class RestrictedComponentContainer extends AbstractComponentContainer {
    private final Set<Class<?>> allowedDirectInterfaces;
    private final Set<Class<?>> allowedProviderInterfaces;
    private final Set<Class<?>> allowedPublishedEvents;
    private final Set<Class<?>> allowedSetDirectInterfaces;
    private final Set<Class<?>> allowedSetProviderInterfaces;
    private final ComponentContainer delegateContainer;

    RestrictedComponentContainer(Component<?> component, ComponentContainer componentContainer) {
        Set<Class<?>> set;
        Set<Class<?>> set2;
        Set<Class<?>> set3;
        Set<Class<?>> set4;
        Component<?> component2 = component;
        ComponentContainer container = componentContainer;
        new HashSet<>();
        Set<Class<?>> directInterfaces = set;
        new HashSet<>();
        Set<Class<?>> providerInterfaces = set2;
        new HashSet<>();
        Set<Class<?>> setDirectInterfaces = set3;
        new HashSet<>();
        Set<Class<?>> setProviderInterfaces = set4;
        for (Dependency dependency : component2.getDependencies()) {
            if (dependency.isDirectInjection()) {
                if (dependency.isSet()) {
                    boolean add = setDirectInterfaces.add(dependency.getInterface());
                } else {
                    boolean add2 = directInterfaces.add(dependency.getInterface());
                }
            } else if (dependency.isSet()) {
                boolean add3 = setProviderInterfaces.add(dependency.getInterface());
            } else {
                boolean add4 = providerInterfaces.add(dependency.getInterface());
            }
        }
        if (!component2.getPublishedEvents().isEmpty()) {
            boolean add5 = directInterfaces.add(Publisher.class);
        }
        this.allowedDirectInterfaces = Collections.unmodifiableSet(directInterfaces);
        this.allowedProviderInterfaces = Collections.unmodifiableSet(providerInterfaces);
        this.allowedSetDirectInterfaces = Collections.unmodifiableSet(setDirectInterfaces);
        this.allowedSetProviderInterfaces = Collections.unmodifiableSet(setProviderInterfaces);
        this.allowedPublishedEvents = component2.getPublishedEvents();
        this.delegateContainer = container;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T get(java.lang.Class<T> r13) {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            r4 = r0
            java.util.Set<java.lang.Class<?>> r4 = r4.allowedDirectInterfaces
            r5 = r1
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L_0x0026
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r11 = r4
            r4 = r11
            r5 = r11
            java.lang.String r6 = "Attempting to request an undeclared dependency %s."
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r11 = r7
            r7 = r11
            r8 = r11
            r9 = 0
            r10 = r1
            r8[r9] = r10
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r5.<init>(r6)
            throw r4
        L_0x0026:
            r4 = r0
            com.google.firebase.components.ComponentContainer r4 = r4.delegateContainer
            r5 = r1
            java.lang.Object r4 = r4.get(r5)
            r2 = r4
            r4 = r1
            java.lang.Class<com.google.firebase.events.Publisher> r5 = com.google.firebase.events.Publisher.class
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x003b
            r4 = r2
            r0 = r4
        L_0x003a:
            return r0
        L_0x003b:
            com.google.firebase.components.RestrictedComponentContainer$RestrictedPublisher r4 = new com.google.firebase.components.RestrictedComponentContainer$RestrictedPublisher
            r11 = r4
            r4 = r11
            r5 = r11
            r6 = r0
            java.util.Set<java.lang.Class<?>> r6 = r6.allowedPublishedEvents
            r7 = r2
            com.google.firebase.events.Publisher r7 = (com.google.firebase.events.Publisher) r7
            r5.<init>(r6, r7)
            r3 = r4
            r4 = r3
            r0 = r4
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.RestrictedComponentContainer.get(java.lang.Class):java.lang.Object");
    }

    public <T> Provider<T> getProvider(Class<T> cls) {
        Throwable th;
        Class<T> anInterface = cls;
        if (this.allowedProviderInterfaces.contains(anInterface)) {
            return this.delegateContainer.getProvider(anInterface);
        }
        Throwable th2 = th;
        new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{anInterface}));
        throw th2;
    }

    public <T> Provider<Set<T>> setOfProvider(Class<T> cls) {
        Throwable th;
        Class<T> anInterface = cls;
        if (this.allowedSetProviderInterfaces.contains(anInterface)) {
            return this.delegateContainer.setOfProvider(anInterface);
        }
        Throwable th2 = th;
        new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{anInterface}));
        throw th2;
    }

    public <T> Set<T> setOf(Class<T> cls) {
        Throwable th;
        Class<T> anInterface = cls;
        if (this.allowedSetDirectInterfaces.contains(anInterface)) {
            return this.delegateContainer.setOf(anInterface);
        }
        Throwable th2 = th;
        new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{anInterface}));
        throw th2;
    }

    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class RestrictedPublisher implements Publisher {
        private final Set<Class<?>> allowedPublishedEvents;
        private final Publisher delegate;

        public RestrictedPublisher(Set<Class<?>> allowedPublishedEvents2, Publisher delegate2) {
            this.allowedPublishedEvents = allowedPublishedEvents2;
            this.delegate = delegate2;
        }

        public void publish(Event<?> event) {
            Throwable th;
            Event<?> event2 = event;
            if (!this.allowedPublishedEvents.contains(event2.getType())) {
                Throwable th2 = th;
                new IllegalArgumentException(String.format("Attempting to publish an undeclared event %s.", new Object[]{event2}));
                throw th2;
            }
            this.delegate.publish(event2);
        }
    }
}
