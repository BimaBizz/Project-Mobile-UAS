package com.google.firebase.components;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.inject.Provider;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class Lazy<T> implements Provider<T> {
    private static final Object UNINITIALIZED;
    private volatile Object instance = UNINITIALIZED;
    private volatile Provider<T> provider;

    static {
        Object obj;
        new Object();
        UNINITIALIZED = obj;
    }

    Lazy(T instance2) {
        this.instance = instance2;
    }

    public Lazy(Provider<T> provider2) {
        this.provider = provider2;
    }

    /* JADX INFO: finally extract failed */
    public T get() {
        Object result = this.instance;
        if (result == UNINITIALIZED) {
            synchronized (this) {
                try {
                    result = this.instance;
                    if (result == UNINITIALIZED) {
                        result = this.provider.get();
                        this.instance = result;
                        this.provider = null;
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
        return result;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public boolean isInitialized() {
        return this.instance != UNINITIALIZED;
    }
}
