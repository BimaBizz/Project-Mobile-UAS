package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final class Component<T> {
    private final Set<Dependency> dependencies;
    private final ComponentFactory<T> factory;
    private final int instantiation;
    private final Set<Class<? super T>> providedInterfaces;
    private final Set<Class<?>> publishedEvents;
    private final int type;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ Component(Set x0, Set x1, int x2, int x3, ComponentFactory x4, Set x5, AnonymousClass1 r22) {
        this(x0, x1, x2, x3, x4, x5);
        AnonymousClass1 r7 = r22;
    }

    private Component(Set<Class<? super T>> providedInterfaces2, Set<Dependency> dependencies2, int instantiation2, int type2, ComponentFactory<T> factory2, Set<Class<?>> publishedEvents2) {
        this.providedInterfaces = Collections.unmodifiableSet(providedInterfaces2);
        this.dependencies = Collections.unmodifiableSet(dependencies2);
        this.instantiation = instantiation2;
        this.type = type2;
        this.factory = factory2;
        this.publishedEvents = Collections.unmodifiableSet(publishedEvents2);
    }

    public Set<Class<? super T>> getProvidedInterfaces() {
        return this.providedInterfaces;
    }

    public Set<Dependency> getDependencies() {
        return this.dependencies;
    }

    public ComponentFactory<T> getFactory() {
        return this.factory;
    }

    public Set<Class<?>> getPublishedEvents() {
        return this.publishedEvents;
    }

    public boolean isLazy() {
        return this.instantiation == 0;
    }

    public boolean isAlwaysEager() {
        return this.instantiation == 1;
    }

    public boolean isEagerInDefaultApp() {
        return this.instantiation == 2;
    }

    public boolean isValue() {
        return this.type == 0;
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder("Component<");
        return sb.append(Arrays.toString(this.providedInterfaces.toArray())).append(">{").append(this.instantiation).append(", type=").append(this.type).append(", deps=").append(Arrays.toString(this.dependencies.toArray())).append("}").toString();
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.firebase.components.Component.Builder<T> builder(java.lang.Class<T> r7) {
        /*
            r0 = r7
            com.google.firebase.components.Component$Builder r1 = new com.google.firebase.components.Component$Builder
            r6 = r1
            r1 = r6
            r2 = r6
            r3 = r0
            r4 = 0
            java.lang.Class[] r4 = new java.lang.Class[r4]
            r5 = 0
            r2.<init>(r3, r4, r5)
            r0 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.Component.builder(java.lang.Class):com.google.firebase.components.Component$Builder");
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.SafeVarargs
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.firebase.components.Component.Builder<T> builder(java.lang.Class<T> r8, java.lang.Class<? super T>... r9) {
        /*
            r0 = r8
            r1 = r9
            com.google.firebase.components.Component$Builder r2 = new com.google.firebase.components.Component$Builder
            r7 = r2
            r2 = r7
            r3 = r7
            r4 = r0
            r5 = r1
            r6 = 0
            r3.<init>(r4, r5, r6)
            r0 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.Component.builder(java.lang.Class, java.lang.Class[]):com.google.firebase.components.Component$Builder");
    }

    static /* synthetic */ Object lambda$of$0(Object value, ComponentContainer componentContainer) {
        ComponentContainer componentContainer2 = componentContainer;
        return value;
    }

    @KeepForSdk
    @Deprecated
    public static <T> Component<T> of(Class<T> anInterface, T value) {
        return builder(anInterface).factory(Component$$Lambda$1.lambdaFactory$(value)).build();
    }

    static /* synthetic */ Object lambda$of$1(Object value, ComponentContainer componentContainer) {
        ComponentContainer componentContainer2 = componentContainer;
        return value;
    }

    @KeepForSdk
    @SafeVarargs
    public static <T> Component<T> of(T value, Class<T> anInterface, Class<? super T>... additionalInterfaces) {
        return builder(anInterface, additionalInterfaces).factory(Component$$Lambda$2.lambdaFactory$(value)).build();
    }

    @KeepForSdk
    public static <T> Builder<T> intoSetBuilder(Class<T> anInterface) {
        return builder(anInterface).intoSet();
    }

    @KeepForSdk
    public static <T> Component<T> intoSet(T value, Class<T> anInterface) {
        return intoSetBuilder(anInterface).factory(Component$$Lambda$3.lambdaFactory$(value)).build();
    }

    static /* synthetic */ Object lambda$intoSet$2(Object value, ComponentContainer componentContainer) {
        ComponentContainer componentContainer2 = componentContainer;
        return value;
    }

    @KeepForSdk
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    public static class Builder<T> {
        private final Set<Dependency> dependencies;
        private ComponentFactory<T> factory;
        private int instantiation;
        private final Set<Class<? super T>> providedInterfaces;
        private Set<Class<?>> publishedEvents;
        private int type;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ Builder(Class x0, Class[] x1, AnonymousClass1 r10) {
            this(x0, x1);
            AnonymousClass1 r3 = r10;
        }

        @SafeVarargs
        private Builder(Class<T> cls, Class<? super T>... clsArr) {
            Set<Class<? super T>> set;
            Set<Dependency> set2;
            Set<Class<?>> set3;
            Class<T> anInterface = cls;
            Class<? super T>[] additionalInterfaces = clsArr;
            new HashSet();
            this.providedInterfaces = set;
            new HashSet();
            this.dependencies = set2;
            this.instantiation = 0;
            this.type = 0;
            new HashSet();
            this.publishedEvents = set3;
            Object checkNotNull = Preconditions.checkNotNull(anInterface, "Null interface");
            boolean add = this.providedInterfaces.add(anInterface);
            Class<? super T>[] clsArr2 = additionalInterfaces;
            int length = clsArr2.length;
            for (int i = 0; i < length; i++) {
                Object checkNotNull2 = Preconditions.checkNotNull(clsArr2[i], "Null interface");
            }
            boolean addAll = Collections.addAll(this.providedInterfaces, additionalInterfaces);
        }

        @KeepForSdk
        public Builder<T> add(Dependency dependency) {
            Dependency dependency2 = dependency;
            Object checkNotNull = Preconditions.checkNotNull(dependency2, "Null dependency");
            validateInterface(dependency2.getInterface());
            boolean add = this.dependencies.add(dependency2);
            return this;
        }

        @KeepForSdk
        public Builder<T> alwaysEager() {
            return setInstantiation(1);
        }

        @KeepForSdk
        public Builder<T> eagerInDefaultApp() {
            return setInstantiation(2);
        }

        @KeepForSdk
        public Builder<T> publishes(Class<?> eventType) {
            boolean add = this.publishedEvents.add(eventType);
            return this;
        }

        private Builder<T> setInstantiation(int i) {
            int instantiation2 = i;
            Preconditions.checkState(this.instantiation == 0, "Instantiation type has already been set.");
            this.instantiation = instantiation2;
            return this;
        }

        private void validateInterface(Class<?> anInterface) {
            Preconditions.checkArgument(!this.providedInterfaces.contains(anInterface), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @KeepForSdk
        public Builder<T> factory(ComponentFactory<T> value) {
            this.factory = (ComponentFactory) Preconditions.checkNotNull(value, "Null factory");
            return this;
        }

        /* access modifiers changed from: private */
        public Builder<T> intoSet() {
            this.type = 1;
            return this;
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @com.google.android.gms.common.annotation.KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.firebase.components.Component<T> build() {
            /*
                r11 = this;
                r0 = r11
                r1 = r0
                com.google.firebase.components.ComponentFactory<T> r1 = r1.factory
                if (r1 == 0) goto L_0x003a
                r1 = 1
            L_0x0007:
                java.lang.String r2 = "Missing required property: factory."
                com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)
                com.google.firebase.components.Component r1 = new com.google.firebase.components.Component
                r10 = r1
                r1 = r10
                r2 = r10
                java.util.HashSet r3 = new java.util.HashSet
                r10 = r3
                r3 = r10
                r4 = r10
                r5 = r0
                java.util.Set<java.lang.Class<? super T>> r5 = r5.providedInterfaces
                r4.<init>(r5)
                java.util.HashSet r4 = new java.util.HashSet
                r10 = r4
                r4 = r10
                r5 = r10
                r6 = r0
                java.util.Set<com.google.firebase.components.Dependency> r6 = r6.dependencies
                r5.<init>(r6)
                r5 = r0
                int r5 = r5.instantiation
                r6 = r0
                int r6 = r6.type
                r7 = r0
                com.google.firebase.components.ComponentFactory<T> r7 = r7.factory
                r8 = r0
                java.util.Set<java.lang.Class<?>> r8 = r8.publishedEvents
                r9 = 0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                r0 = r1
                return r0
            L_0x003a:
                r1 = 0
                goto L_0x0007
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.Component.Builder.build():com.google.firebase.components.Component");
        }
    }
}
