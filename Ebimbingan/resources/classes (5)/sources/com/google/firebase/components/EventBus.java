package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
class EventBus implements Subscriber, Publisher {
    private final Executor defaultExecutor;
    @GuardedBy("this")
    private final Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> handlerMap;
    @GuardedBy("this")
    private Queue<Event<?>> pendingEvents;

    EventBus(Executor defaultExecutor2) {
        Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> map;
        Queue<Event<?>> queue;
        new HashMap();
        this.handlerMap = map;
        new ArrayDeque();
        this.pendingEvents = queue;
        this.defaultExecutor = defaultExecutor2;
    }

    /* JADX INFO: finally extract failed */
    public void publish(Event<?> event) {
        Event<?> event2 = event;
        Object checkNotNull = Preconditions.checkNotNull(event2);
        synchronized (this) {
            try {
                if (this.pendingEvents != null) {
                    boolean add = this.pendingEvents.add(event2);
                    return;
                }
                for (Map.Entry<EventHandler<Object>, Executor> handlerData : getHandlers(event2)) {
                    handlerData.getValue().execute(EventBus$$Lambda$1.lambdaFactory$(handlerData, event2));
                }
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
    }

    private synchronized Set<Map.Entry<EventHandler<Object>, Executor>> getHandlers(Event<?> event) {
        Set<Map.Entry<EventHandler<Object>, Executor>> emptySet;
        Event<?> event2 = event;
        synchronized (this) {
            Map<EventHandler<Object>, Executor> handlers = this.handlerMap.get(event2.getType());
            emptySet = handlers == null ? Collections.emptySet() : handlers.entrySet();
        }
        return emptySet;
    }

    public synchronized <T> void subscribe(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler) {
        Object obj;
        Class<T> type = cls;
        Executor executor2 = executor;
        EventHandler<? super T> handler = eventHandler;
        synchronized (this) {
            Object checkNotNull = Preconditions.checkNotNull(type);
            Object checkNotNull2 = Preconditions.checkNotNull(handler);
            Object checkNotNull3 = Preconditions.checkNotNull(executor2);
            if (!this.handlerMap.containsKey(type)) {
                new ConcurrentHashMap();
                ConcurrentHashMap<EventHandler<Object>, Executor> put = this.handlerMap.put(type, obj);
            }
            Object put2 = this.handlerMap.get(type).put(handler, executor2);
        }
    }

    public <T> void subscribe(Class<T> type, EventHandler<? super T> handler) {
        subscribe(type, this.defaultExecutor, handler);
    }

    public synchronized <T> void unsubscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        Class<T> type = cls;
        EventHandler<? super T> handler = eventHandler;
        synchronized (this) {
            Object checkNotNull = Preconditions.checkNotNull(type);
            Object checkNotNull2 = Preconditions.checkNotNull(handler);
            if (this.handlerMap.containsKey(type)) {
                ConcurrentHashMap<EventHandler<Object>, Executor> handlers = this.handlerMap.get(type);
                Executor remove = handlers.remove(handler);
                if (handlers.isEmpty()) {
                    ConcurrentHashMap<EventHandler<Object>, Executor> remove2 = this.handlerMap.remove(type);
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void enablePublishingAndFlushPending() {
        Queue<Event<?>> pending = null;
        synchronized (this) {
            try {
                if (this.pendingEvents != null) {
                    pending = this.pendingEvents;
                    this.pendingEvents = null;
                }
                if (pending != null) {
                    for (Event publish : pending) {
                        publish(publish);
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
    }
}
