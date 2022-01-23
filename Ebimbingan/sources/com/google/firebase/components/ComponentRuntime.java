package com.google.firebase.components;

import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class ComponentRuntime extends AbstractComponentContainer {
    private static final Provider<Set<Object>> EMPTY_PROVIDER = ComponentRuntime$$Lambda$3.lambdaFactory$();
    private final Map<Component<?>, Lazy<?>> components;
    private final EventBus eventBus;
    private final Map<Class<?>, Lazy<?>> lazyInstanceMap;
    private final Map<Class<?>, Lazy<Set<?>>> lazySetMap;

    public /* bridge */ /* synthetic */ Object get(Class cls) {
        return super.get(cls);
    }

    public /* bridge */ /* synthetic */ Set setOf(Class cls) {
        return super.setOf(cls);
    }

    public ComponentRuntime(Executor defaultEventExecutor, Iterable<ComponentRegistrar> registrars, Component<?>... componentArr) {
        Map<Component<?>, Lazy<?>> map;
        Map<Class<?>, Lazy<?>> map2;
        Map<Class<?>, Lazy<Set<?>>> map3;
        EventBus eventBus2;
        List<Component<?>> list;
        Object obj;
        Component<?>[] additionalComponents = componentArr;
        new HashMap();
        this.components = map;
        new HashMap();
        this.lazyInstanceMap = map2;
        new HashMap();
        this.lazySetMap = map3;
        new EventBus(defaultEventExecutor);
        this.eventBus = eventBus2;
        new ArrayList<>();
        List<Component<?>> componentsToAdd = list;
        Class[] clsArr = new Class[2];
        clsArr[0] = Subscriber.class;
        Class[] clsArr2 = clsArr;
        clsArr2[1] = Publisher.class;
        boolean add = componentsToAdd.add(Component.of(this.eventBus, EventBus.class, clsArr2));
        for (ComponentRegistrar registrar : registrars) {
            boolean addAll = componentsToAdd.addAll(registrar.getComponents());
        }
        boolean addAll2 = Collections.addAll(componentsToAdd, additionalComponents);
        CycleDetector.detect(componentsToAdd);
        for (Component<?> component : componentsToAdd) {
            new Lazy(ComponentRuntime$$Lambda$1.lambdaFactory$(this, component));
            Lazy<?> put = this.components.put(component, obj);
        }
        processInstanceComponents();
        processSetComponents();
    }

    static /* synthetic */ Object lambda$new$0(ComponentRuntime componentRuntime, Component component) {
        ComponentContainer componentContainer;
        Component component2 = component;
        new RestrictedComponentContainer(component2, componentRuntime);
        return component2.getFactory().create(componentContainer);
    }

    private void processInstanceComponents() {
        for (Map.Entry<Component<?>, Lazy<?>> entry : this.components.entrySet()) {
            Component<?> component = entry.getKey();
            if (component.isValue()) {
                Lazy value = entry.getValue();
                for (Class put : component.getProvidedInterfaces()) {
                    Lazy<?> put2 = this.lazyInstanceMap.put(put, value);
                }
            }
        }
        validateDependencies();
    }

    private void processSetComponents() {
        Map<Class<?>, Set<Lazy<?>>> map;
        Object obj;
        Object obj2;
        new HashMap<>();
        Map<Class<?>, Set<Lazy<?>>> setIndex = map;
        for (Map.Entry<Component<?>, Lazy<?>> entry : this.components.entrySet()) {
            Component<?> component = entry.getKey();
            if (!component.isValue()) {
                Lazy value = entry.getValue();
                for (Class<?> anInterface : component.getProvidedInterfaces()) {
                    if (!setIndex.containsKey(anInterface)) {
                        new HashSet();
                        Set<Lazy<?>> put = setIndex.put(anInterface, obj2);
                    }
                    boolean add = setIndex.get(anInterface).add(value);
                }
            }
        }
        for (Map.Entry<Class<?>, Set<Lazy<?>>> entry2 : setIndex.entrySet()) {
            new Lazy(ComponentRuntime$$Lambda$2.lambdaFactory$(entry2.getValue()));
            Lazy<Set<?>> put2 = this.lazySetMap.put(entry2.getKey(), obj);
        }
    }

    static /* synthetic */ Set lambda$processSetComponents$1(Set lazies) {
        Set<Object> set;
        new HashSet<>();
        Set<Object> set2 = set;
        Iterator it = lazies.iterator();
        while (it.hasNext()) {
            boolean add = set2.add(((Lazy) it.next()).get());
        }
        return Collections.unmodifiableSet(set2);
    }

    public <T> Provider<T> getProvider(Class<T> cls) {
        Class<T> anInterface = cls;
        T checkNotNull = C0446Preconditions.checkNotNull(anInterface, "Null interface requested.");
        return this.lazyInstanceMap.get(anInterface);
    }

    public <T> Provider<Set<T>> setOfProvider(Class<T> anInterface) {
        Lazy<Set<?>> lazy = this.lazySetMap.get(anInterface);
        if (lazy != null) {
            return lazy;
        }
        return EMPTY_PROVIDER;
    }

    public void initializeEagerComponents(boolean z) {
        boolean isDefaultApp = z;
        for (Map.Entry<Component<?>, Lazy<?>> entry : this.components.entrySet()) {
            Component<?> component = entry.getKey();
            Lazy value = entry.getValue();
            if (component.isAlwaysEager() || (component.isEagerInDefaultApp() && isDefaultApp)) {
                Object obj = value.get();
            }
        }
        this.eventBus.enablePublishingAndFlushPending();
    }

    private void validateDependencies() {
        Throwable th;
        for (Component<?> component : this.components.keySet()) {
            Iterator<Dependency> it = component.getDependencies().iterator();
            while (true) {
                if (it.hasNext()) {
                    Dependency dependency = it.next();
                    if (dependency.isRequired() && !this.lazyInstanceMap.containsKey(dependency.getInterface())) {
                        Throwable th2 = th;
                        Object[] objArr = new Object[2];
                        objArr[0] = component;
                        Object[] objArr2 = objArr;
                        objArr2[1] = dependency.getInterface();
                        new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", objArr2));
                        throw th2;
                    }
                }
            }
        }
    }
}
