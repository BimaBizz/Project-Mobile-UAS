package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
class CycleDetector {

    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class Dep {
        private final Class<?> anInterface;
        /* access modifiers changed from: private */
        public final boolean set;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ Dep(Class x0, boolean x1, AnonymousClass1 r10) {
            this(x0, x1);
            AnonymousClass1 r3 = r10;
        }

        private Dep(Class<?> anInterface2, boolean set2) {
            this.anInterface = anInterface2;
            this.set = set2;
        }

        public boolean equals(Object obj) {
            Object obj2 = obj;
            if (!(obj2 instanceof Dep)) {
                return false;
            }
            Dep dep = (Dep) obj2;
            return dep.anInterface.equals(this.anInterface) && dep.set == this.set;
        }

        public int hashCode() {
            return ((1000003 ^ this.anInterface.hashCode()) * 1000003) ^ Boolean.valueOf(this.set).hashCode();
        }
    }

    CycleDetector() {
    }

    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class ComponentNode {
        private final Component<?> component;
        private final Set<ComponentNode> dependencies;
        private final Set<ComponentNode> dependents;

        ComponentNode(Component<?> component2) {
            Set<ComponentNode> set;
            Set<ComponentNode> set2;
            new HashSet();
            this.dependencies = set;
            new HashSet();
            this.dependents = set2;
            this.component = component2;
        }

        /* access modifiers changed from: package-private */
        public void addDependency(ComponentNode node) {
            boolean add = this.dependencies.add(node);
        }

        /* access modifiers changed from: package-private */
        public void addDependent(ComponentNode node) {
            boolean add = this.dependents.add(node);
        }

        /* access modifiers changed from: package-private */
        public Set<ComponentNode> getDependencies() {
            return this.dependencies;
        }

        /* access modifiers changed from: package-private */
        public void removeDependent(ComponentNode node) {
            boolean remove = this.dependents.remove(node);
        }

        /* access modifiers changed from: package-private */
        public Component<?> getComponent() {
            return this.component;
        }

        /* access modifiers changed from: package-private */
        public boolean isRoot() {
            return this.dependents.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public boolean isLeaf() {
            return this.dependencies.isEmpty();
        }
    }

    static void detect(List<Component<?>> list) {
        List<Component<?>> list2;
        Throwable th;
        List<Component<?>> components = list;
        Set<ComponentNode> graph = toGraph(components);
        Set<ComponentNode> roots = getRoots(graph);
        int numVisited = 0;
        while (!roots.isEmpty()) {
            ComponentNode node = roots.iterator().next();
            boolean remove = roots.remove(node);
            numVisited++;
            for (ComponentNode dependent : node.getDependencies()) {
                dependent.removeDependent(node);
                if (dependent.isRoot()) {
                    boolean add = roots.add(dependent);
                }
            }
        }
        if (numVisited != components.size()) {
            new ArrayList<>();
            List<Component<?>> componentsInCycle = list2;
            for (ComponentNode node2 : graph) {
                if (!node2.isRoot() && !node2.isLeaf()) {
                    boolean add2 = componentsInCycle.add(node2.getComponent());
                }
            }
            Throwable th2 = th;
            new DependencyCycleException(componentsInCycle);
            throw th2;
        }
    }

    private static Set<ComponentNode> toGraph(List<Component<?>> list) {
        Map<Dep, Set<ComponentNode>> map;
        HashSet hashSet;
        Object obj;
        Object obj2;
        Throwable th;
        Object obj3;
        List<Component<?>> components = list;
        new HashMap<>(components.size());
        Map<Dep, Set<ComponentNode>> componentIndex = map;
        for (Component<?> component : components) {
            new ComponentNode(component);
            Object obj4 = obj2;
            Iterator<Class<? super Object>> it = component.getProvidedInterfaces().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class<?> anInterface = it.next();
                    Dep dep = r18;
                    Dep dep2 = new Dep(anInterface, !component.isValue(), (AnonymousClass1) null);
                    Dep cmp = dep;
                    if (!componentIndex.containsKey(cmp)) {
                        new HashSet();
                        Set<ComponentNode> put = componentIndex.put(cmp, obj3);
                    }
                    Set<ComponentNode> nodes = componentIndex.get(cmp);
                    if (nodes.isEmpty() || cmp.set) {
                        boolean add = nodes.add(obj4);
                    } else {
                        Throwable th2 = th;
                        new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{anInterface}));
                        throw th2;
                    }
                }
            }
        }
        for (Set<ComponentNode> componentNodes : componentIndex.values()) {
            for (ComponentNode node : componentNodes) {
                for (Dependency dependency : node.getComponent().getDependencies()) {
                    if (dependency.isDirectInjection()) {
                        new Dep(dependency.getInterface(), dependency.isSet(), (AnonymousClass1) null);
                        Set<ComponentNode> depComponents = componentIndex.get(obj);
                        if (depComponents != null) {
                            for (ComponentNode depComponent : depComponents) {
                                node.addDependency(depComponent);
                                depComponent.addDependent(node);
                            }
                        }
                    }
                }
            }
        }
        new HashSet();
        HashSet hashSet2 = hashSet;
        for (Set addAll : componentIndex.values()) {
            boolean addAll2 = hashSet2.addAll(addAll);
        }
        return hashSet2;
    }

    private static Set<ComponentNode> getRoots(Set<ComponentNode> components) {
        Set<ComponentNode> set;
        new HashSet();
        Set<ComponentNode> roots = set;
        for (ComponentNode component : components) {
            if (component.isRoot()) {
                boolean add = roots.add(component);
            }
        }
        return roots;
    }
}
