package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final class ComponentDiscovery<T> {
    private static final String COMPONENT_KEY_PREFIX = "com.google.firebase.components:";
    private static final String COMPONENT_SENTINEL_VALUE = "com.google.firebase.components.ComponentRegistrar";
    private static final String TAG = "ComponentDiscovery";
    private final T context;
    private final RegistrarNameRetriever<T> retriever;

    @VisibleForTesting
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    interface RegistrarNameRetriever<T> {
        List<String> retrieve(T t);
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.firebase.components.ComponentDiscovery<android.content.Context> forContext(android.content.Context r8) {
        /*
            r0 = r8
            com.google.firebase.components.ComponentDiscovery r1 = new com.google.firebase.components.ComponentDiscovery
            r7 = r1
            r1 = r7
            r2 = r7
            r3 = r0
            com.google.firebase.components.ComponentDiscovery$MetadataRegistrarNameRetriever r4 = new com.google.firebase.components.ComponentDiscovery$MetadataRegistrarNameRetriever
            r7 = r4
            r4 = r7
            r5 = r7
            r6 = 0
            r5.<init>(r6)
            r2.<init>(r3, r4)
            r0 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.ComponentDiscovery.forContext(android.content.Context):com.google.firebase.components.ComponentDiscovery");
    }

    @VisibleForTesting
    ComponentDiscovery(T context2, RegistrarNameRetriever<T> retriever2) {
        this.context = context2;
        this.retriever = retriever2;
    }

    public List<ComponentRegistrar> discover() {
        return instantiate(this.retriever.retrieve(this.context));
    }

    private static List<ComponentRegistrar> instantiate(List<String> registrarNames) {
        List<String> list;
        new ArrayList<>();
        List<String> registrars = list;
        for (String name : registrarNames) {
            try {
                Class<?> loadedClass = Class.forName(name);
                if (!ComponentRegistrar.class.isAssignableFrom(loadedClass)) {
                    Object[] objArr = new Object[2];
                    objArr[0] = name;
                    Object[] objArr2 = objArr;
                    objArr2[1] = COMPONENT_SENTINEL_VALUE;
                    int w = Log.w(TAG, String.format("Class %s is not an instance of %s", objArr2));
                } else {
                    boolean add = registrars.add((ComponentRegistrar) loadedClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException e) {
                int w2 = Log.w(TAG, String.format("Class %s is not an found.", new Object[]{name}), e);
            } catch (IllegalAccessException e2) {
                int w3 = Log.w(TAG, String.format("Could not instantiate %s.", new Object[]{name}), e2);
            } catch (InstantiationException e3) {
                int w4 = Log.w(TAG, String.format("Could not instantiate %s.", new Object[]{name}), e3);
            } catch (NoSuchMethodException e4) {
                int w5 = Log.w(TAG, String.format("Could not instantiate %s", new Object[]{name}), e4);
            } catch (InvocationTargetException e5) {
                int w6 = Log.w(TAG, String.format("Could not instantiate %s", new Object[]{name}), e5);
            }
        }
        return registrars;
    }

    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class MetadataRegistrarNameRetriever implements RegistrarNameRetriever<Context> {
        private MetadataRegistrarNameRetriever() {
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ MetadataRegistrarNameRetriever(AnonymousClass1 r4) {
            this();
            AnonymousClass1 r1 = r4;
        }

        public List<String> retrieve(Context ctx) {
            List<String> list;
            Bundle metadata = getMetadata(ctx);
            if (metadata == null) {
                int w = Log.w(ComponentDiscovery.TAG, "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            new ArrayList();
            List<String> registrarNames = list;
            for (String key : metadata.keySet()) {
                if (ComponentDiscovery.COMPONENT_SENTINEL_VALUE.equals(metadata.get(key)) && key.startsWith(ComponentDiscovery.COMPONENT_KEY_PREFIX)) {
                    boolean add = registrarNames.add(key.substring(ComponentDiscovery.COMPONENT_KEY_PREFIX.length()));
                }
            }
            return registrarNames;
        }

        private static Bundle getMetadata(Context context) {
            ComponentName componentName;
            Context context2 = context;
            try {
                PackageManager manager = context2.getPackageManager();
                if (manager == null) {
                    int w = Log.w(ComponentDiscovery.TAG, "Context has no PackageManager.");
                    return null;
                }
                new ComponentName(context2, ComponentDiscoveryService.class);
                ServiceInfo info = manager.getServiceInfo(componentName, 128);
                if (info != null) {
                    return info.metaData;
                }
                int w2 = Log.w(ComponentDiscovery.TAG, "ComponentDiscoveryService has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException e) {
                PackageManager.NameNotFoundException nameNotFoundException = e;
                int w3 = Log.w(ComponentDiscovery.TAG, "Application info not found.");
                return null;
            }
        }
    }
}
